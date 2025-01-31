package utils;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Util {
    public static long getSize(FileChannel srcFileChannel , Boolean consoleBoolean) throws IOException {
        long size = srcFileChannel.size();
        if (consoleBoolean) { console(size); }
        return size;
    }

    public static void fileChannelClose(FileChannel targetChannel) throws IOException {
        targetChannel.close();
    }

    public static String getByteToString(FileChannel srcFileChannel , ByteBuffer buf , boolean consoleBoolean) throws IOException {
        String tmpString = null;
        try {
            srcFileChannel.read(buf);
            if (buf.position() == 0) {  throw new BufferUnderflowException(); }
            byte[] tmpByte = new byte[buf.position()];
            buf.flip().get(tmpByte);
            buf.clear();
            tmpString = new String(tmpByte, StandardCharsets.UTF_8);
            if (consoleBoolean) { console(tmpString); }
        } catch(BufferUnderflowException bfe) {
            console(bfe);
            console("파일의 모든 스트림을 읽어서 읽을 스트림이 없음");
            console("파일 총사이즈 - 파일 포지션 = "+ (srcFileChannel.size() - srcFileChannel.position()));

        }
        return tmpString;
    }

    public static void writeByteArr(FileChannel writeFileChannel, ByteBuffer buf ,  byte[] byteArr , boolean consoleBoolean) throws IOException {
        writeFileChannel.write(ByteBuffer.wrap(byteArr));
//        writeFileChannel.close();
    }

    public static byte[] getByteArr(FileChannel readFileChannel , ByteBuffer buf , boolean consoleBoolean) throws IOException {
        String tmpString = null;
        byte[] tmpByte = null;
        try {
            readFileChannel.read(buf);
            if (buf.position() == 0) {  throw new BufferUnderflowException(); }
            tmpByte = new byte[buf.position()];
            buf.flip().get(tmpByte);
            buf.clear();
            tmpString = new String(tmpByte, StandardCharsets.UTF_8);
            if (consoleBoolean) { console(tmpString); }

        } catch(BufferUnderflowException bfe) {
            console(bfe);
            console("파일의 모든 스트림을 읽어서 읽을 스트림이 없음");
            console("파일 총사이즈 - 파일 포지션 = "+ (readFileChannel.size() - readFileChannel.position()));

        }
        return tmpByte;
    }

    public static void console(Object target) {
        System.out.println(target);
    }
}