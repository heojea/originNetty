package discardEcho;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;

import java.util.Scanner;

/**
 * Handles a client-side channel.
 */
public class DiscardClientHandler extends ChannelInboundHandlerAdapter {
    private final ByteBuf firstMessage;

    /**
     * Creates a client-side handler.
     */
    public DiscardClientHandler() {
        firstMessage = Unpooled.buffer(DiscardClient.SIZE);
        for (int i = 0; i < firstMessage.capacity(); i ++) {
            firstMessage.writeByte((byte) i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String tmp = sc.next();
        firstMessage.writeBytes(tmp.getBytes());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(firstMessage);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ctx.write(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
}