package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes5.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f31132attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ByteBuffer f31133saneness;

    /* JADX INFO: compiled from: Internal.java */
    public interface attabal {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface saneness<T extends attabal> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f31132attabal = bArr;
        f31133saneness = ByteBuffer.wrap(bArr);
    }

    public static boolean attabal(byte[] bArr) {
        return adultoid.marial(bArr);
    }

    public static String saneness(byte[] bArr) {
        try {
            return new String(bArr, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
