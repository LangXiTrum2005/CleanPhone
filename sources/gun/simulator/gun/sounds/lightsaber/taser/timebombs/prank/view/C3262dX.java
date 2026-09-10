package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3262dX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f4273a = Byte.parseByte("01110000", 2);
    public static final byte b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b2 = bArrArray[0];
        bArrArray[16] = b2;
        bArrArray[0] = (byte) ((b2 & b) | f4273a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
