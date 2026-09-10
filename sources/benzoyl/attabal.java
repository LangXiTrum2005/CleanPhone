package benzoyl;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class attabal {
    public static File attabal(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static long dern(String str, String str2) {
        File fileAttabal = attabal(str, str2);
        if (fileAttabal.exists()) {
            return fileAttabal.length();
        }
        File fileSaneness = saneness(str, str2);
        if (fileSaneness.exists()) {
            return fileSaneness.length();
        }
        return 0L;
    }

    public static File saneness(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static void wireman(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
