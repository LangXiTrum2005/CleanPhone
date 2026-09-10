package garter;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {
    public static int apical(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void arytenoidectomy(OutputStream outputStream, int i) throws IOException {
        kowloon(outputStream, i, 2);
    }

    public static int attabal(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    public static String beachfront(InputStream inputStream, int i) throws IOException {
        return new String(wireman(inputStream, i), StandardCharsets.UTF_8);
    }

    public static long competently(InputStream inputStream, int i) throws IOException {
        byte[] bArrWireman = wireman(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrWireman[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << (i2 * 8);
        }
        return j;
    }

    public static int cutely(InputStream inputStream) throws IOException {
        return (int) competently(inputStream, 1);
    }

    public static RuntimeException dern(String str) {
        return new IllegalStateException(str);
    }

    public static void formularize(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void impassible(OutputStream outputStream, byte[] bArr) throws IOException {
        monoploid(outputStream, bArr.length);
        byte[] bArrSaneness = saneness(bArr);
        monoploid(outputStream, bArrSaneness.length);
        outputStream.write(bArrSaneness);
    }

    public static int impromptu(InputStream inputStream) throws IOException {
        return (int) competently(inputStream, 2);
    }

    public static void kowloon(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static byte[] marial(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw dern("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw dern(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw dern("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw dern("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void monoploid(OutputStream outputStream, long j) throws IOException {
        kowloon(outputStream, j, 4);
    }

    public static void polloi(OutputStream outputStream, int i) throws IOException {
        kowloon(outputStream, i, 1);
    }

    public static byte[] saneness(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static long taiyuan(InputStream inputStream) throws IOException {
        return competently(inputStream, 4);
    }

    public static void triweekly(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] wireman(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw dern("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }
}
