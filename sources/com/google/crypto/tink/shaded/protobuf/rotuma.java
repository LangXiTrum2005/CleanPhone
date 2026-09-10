package com.google.crypto.tink.shaded.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.taiyuan f22274beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ByteBuffer f22276marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f22278wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f22273attabal = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Charset f22277saneness = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Charset f22275dern = Charset.forName("ISO-8859-1");

    /* JADX INFO: compiled from: Internal.java */
    public interface attabal extends taiyuan<Boolean> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface beachfront extends taiyuan<Float> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface competently extends taiyuan<Integer> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface dern {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface impromptu extends taiyuan<Long> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface marial {
        boolean isInRange(int i);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface saneness extends taiyuan<Double> {
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface taiyuan<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        taiyuan<E> mutableCopyWithCapacity(int i);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface wireman<T extends dern> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f22278wireman = bArr;
        f22276marial = ByteBuffer.wrap(bArr);
        f22274beachfront = com.google.crypto.tink.shaded.protobuf.taiyuan.formularize(bArr);
    }

    public static <T> T attabal(T t) {
        t.getClass();
        return t;
    }

    public static int beachfront(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static Object competently(Object obj, Object obj2) {
        return ((privatdozent) obj).toBuilder().lerp((privatdozent) obj2).buildPartial();
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
