package dispope;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: FileUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {
    public static void attabal(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
