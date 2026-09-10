package androidx.multidex;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
final class ZipUtil {

    public static class CentralDirectory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7765b;
    }

    public static CentralDirectory a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                CentralDirectory centralDirectory = new CentralDirectory();
                centralDirectory.f7765b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                centralDirectory.f7764a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return centralDirectory;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
