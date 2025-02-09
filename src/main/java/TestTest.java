import utils.Util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestTest
{
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/p.jyheokalmate.net/IdeaProjects/originNetty/files/file1";
        String receveFileFolder = "/Users/p.jyheokalmate.net/IdeaProjects/originNetty/files/receiveFile";
        String receveFileName = "receiveFile";
        boolean readObjectConsoleBoolean = false;
        boolean writeObjectConsoleBoolean = true;
        Path receiveFile = Paths.get(receveFileFolder, receveFileName);
        if (Files.exists(receiveFile)) { Files.delete(receiveFile); }
        Path receviceFile = Files.createFile(receiveFile);

//        System.out.println(newFilePath);

        Util util = new Util();
        int readLength = 10;
        ByteBuffer buf = ByteBuffer.allocateDirect(readLength);

        FileChannel readFileChannel  = FileChannel.open(Paths.get(filePath), StandardOpenOption.READ);
        FileChannel writeFileChannel = FileChannel.open(receviceFile       , StandardOpenOption.WRITE);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.writeByteArr(writeFileChannel,buf, util.getByteArr(readFileChannel,buf, readObjectConsoleBoolean) ,writeObjectConsoleBoolean);
        util.fileChannelClose(readFileChannel);
        util.fileChannelClose(writeFileChannel);
    }
}