package kaif;

import com.google.common.base.formularize;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final OutputStream f29045attabal = new attabal();

    /* JADX INFO: compiled from: ByteStreams.java */
    public class attabal extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            formularize.triweekly(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            formularize.triweekly(bArr);
            formularize.molybdenite(i, i2 + i, bArr.length);
        }
    }

    public static byte[] attabal(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i) {
            return bArrRemove;
        }
        int length = i - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] dern() {
        return new byte[8192];
    }

    public static byte[] marial(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return attabal(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = moresque.dern.impromptu(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return attabal(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static long saneness(InputStream inputStream, OutputStream outputStream) throws IOException {
        formularize.triweekly(inputStream);
        formularize.triweekly(outputStream);
        byte[] bArrDern = dern();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrDern);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrDern, 0, i);
            j += (long) i;
        }
    }

    public static byte[] wireman(InputStream inputStream) throws IOException {
        formularize.triweekly(inputStream);
        return marial(inputStream, new ArrayDeque(20), 0);
    }
}
