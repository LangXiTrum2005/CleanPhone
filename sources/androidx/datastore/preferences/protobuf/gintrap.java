package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final impromptu f9715beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ByteBuffer f9717marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f9719wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f9714attabal = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Charset f9718saneness = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Charset f9716dern = Charset.forName("ISO-8859-1");

    /* JADX INFO: compiled from: Internal.java */
    public interface attabal {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface beachfront<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        beachfront<E> mutableCopyWithCapacity(int i);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface dern {
        boolean isInRange(int i);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface marial extends beachfront<Long> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface saneness<T extends attabal> {
        T findValueByNumber(int i);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface wireman extends beachfront<Integer> {
    }

    static {
        byte[] bArr = new byte[0];
        f9719wireman = bArr;
        f9717marial = ByteBuffer.wrap(bArr);
        f9715beachfront = impromptu.apical(bArr);
    }

    public static <T> T attabal(T t) {
        t.getClass();
        return t;
    }

    public static int beachfront(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static Object competently(Object obj, Object obj2) {
        return ((saran) obj).toBuilder().saneness((saran) obj2).buildPartial();
    }

    public static int dern(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int impromptu(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int marial(byte[] bArr, int i, int i2) {
        int iImpromptu = impromptu(i2, bArr, i, i2);
        if (iImpromptu == 0) {
            return 1;
        }
        return iImpromptu;
    }

    public static <T> T saneness(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int wireman(byte[] bArr) {
        return marial(bArr, 0, bArr.length);
    }
}
