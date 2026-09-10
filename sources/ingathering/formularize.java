package ingathering;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: compiled from: RandomFidGenerator.java */
/* JADX INFO: loaded from: classes3.dex */
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte f28859attabal = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final byte f28860saneness = Byte.parseByte("00001111", 2);

    public static byte[] dern(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public static String saneness(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public String attabal() {
        byte[] bArrDern = dern(UUID.randomUUID(), new byte[17]);
        byte b = bArrDern[0];
        bArrDern[16] = b;
        bArrDern[0] = (byte) ((b & f28860saneness) | f28859attabal);
        return saneness(bArrDern);
    }
}
