package saneness;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class unready {
    public static int dern(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    public abstract int attabal(String str, byte[] bArr, int i, int i2);

    public abstract String saneness(byte[] bArr, int i, int i2);

    public abstract boolean wireman(byte[] bArr, int i, int i2);
}
