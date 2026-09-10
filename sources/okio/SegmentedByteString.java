package okio;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SegmentedByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Buffer.UnsafeCursor f45129a = new Buffer.UnsafeCursor();

    public static final boolean a(byte[] a2, int i2, byte[] b2, int i3, int i4) {
        Intrinsics.f(a2, "a");
        Intrinsics.f(b2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbV = a.v(j, "size=", " offset=");
            sbV.append(j2);
            throw new ArrayIndexOutOfBoundsException(androidx.media3.extractor.text.ttml.a.k(j3, " byteCount=", sbV));
        }
    }

    public static final int c(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final String d(byte b2) {
        char[] cArr = okio.internal.ByteString.f45169a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }
}
