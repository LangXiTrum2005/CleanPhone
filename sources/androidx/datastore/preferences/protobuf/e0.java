package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4068b;

    static {
        Charset.forName(C.ASCII_NAME);
        f4067a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4068b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new k(bArr, 0, 0, false).h(0);
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
