package okio;

import androidx.datastore.preferences.protobuf.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3561SegmentedByteString extends ByteString {
    public final transient byte[][] f0;
    public final transient int[] g0;

    public C3561SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.e0.data);
        this.f0 = bArr;
        this.g0 = iArr;
    }

    private final Object writeReplace() {
        return y();
    }

    @Override // okio.ByteString
    public final String d() {
        return y().d();
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.h() == h() && q(0, byteString, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final ByteString g(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f0;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.g0;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            messageDigest.update(bArr[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public final int h() {
        return this.g0[this.f0.length - 1];
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i2 = this.f45134Y;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f0;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.g0;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f45134Y = i4;
        return i4;
    }

    @Override // okio.ByteString
    public final String i() {
        return y().i();
    }

    @Override // okio.ByteString
    public final int j(byte[] other, int i2) {
        Intrinsics.f(other, "other");
        return y().j(other, i2);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: l */
    public final byte[] getData() {
        return x();
    }

    @Override // okio.ByteString
    public final byte m(int i2) {
        byte[][] bArr = this.f0;
        int length = bArr.length - 1;
        int[] iArr = this.g0;
        SegmentedByteString.b(iArr[length], i2, 1L);
        int iA = okio.internal.SegmentedByteString.a(this, i2);
        return bArr[iA][(i2 - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // okio.ByteString
    public final int n(byte[] other) {
        Intrinsics.f(other, "other");
        return y().n(other);
    }

    @Override // okio.ByteString
    public final boolean q(int i2, ByteString other, int i3) {
        Intrinsics.f(other, "other");
        if (i2 >= 0 && i2 <= h() - i3) {
            int i4 = i3 + i2;
            int iA = okio.internal.SegmentedByteString.a(this, i2);
            int i5 = 0;
            while (i2 < i4) {
                int[] iArr = this.g0;
                int i6 = iA == 0 ? 0 : iArr[iA - 1];
                int i7 = iArr[iA] - i6;
                byte[][] bArr = this.f0;
                int i8 = iArr[bArr.length + iA];
                int iMin = Math.min(i4, i7 + i6) - i2;
                if (other.r(i5, bArr[iA], (i2 - i6) + i8, iMin)) {
                    i5 += iMin;
                    i2 += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final boolean r(int i2, byte[] other, int i3, int i4) {
        Intrinsics.f(other, "other");
        if (i2 < 0 || i2 > h() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iA = okio.internal.SegmentedByteString.a(this, i2);
        while (i2 < i5) {
            int[] iArr = this.g0;
            int i6 = iA == 0 ? 0 : iArr[iA - 1];
            int i7 = iArr[iA] - i6;
            byte[][] bArr = this.f0;
            int i8 = iArr[bArr.length + iA];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!SegmentedByteString.a(bArr[iA], (i2 - i6) + i8, other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iA++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final ByteString s(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = h();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.k("beginIndex=", i2, " < 0").toString());
        }
        if (i3 > h()) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "endIndex=", " > length(");
            sbU.append(h());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i4 = i3 - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "endIndex=", " < beginIndex=").toString());
        }
        if (i2 == 0 && i3 == h()) {
            return this;
        }
        if (i2 == i3) {
            return ByteString.e0;
        }
        int iA = okio.internal.SegmentedByteString.a(this, i2);
        int iA2 = okio.internal.SegmentedByteString.a(this, i3 - 1);
        byte[][] bArr = this.f0;
        byte[][] bArr2 = (byte[][]) ArraysKt.r(bArr, iA, iA2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.g0;
        if (iA <= iA2) {
            int i5 = iA;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(iArr2[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == iA2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iA != 0 ? iArr2[iA - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i2 - i8) + iArr[length];
        return new C3561SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final String toString() {
        return y().toString();
    }

    @Override // okio.ByteString
    public final ByteString u() {
        return y().u();
    }

    @Override // okio.ByteString
    public final void w(int i2, Buffer buffer) {
        Intrinsics.f(buffer, "buffer");
        int iA = okio.internal.SegmentedByteString.a(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.g0;
            int i4 = iA == 0 ? 0 : iArr[iA - 1];
            int i5 = iArr[iA] - i4;
            byte[][] bArr = this.f0;
            int i6 = iArr[bArr.length + iA];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            Segment segment = new Segment(bArr[iA], i7, i7 + iMin, true, false);
            Segment segment2 = buffer.X;
            if (segment2 == null) {
                segment.g = segment;
                segment.f = segment;
                buffer.X = segment;
            } else {
                Segment segment3 = segment2.g;
                Intrinsics.c(segment3);
                segment3.b(segment);
            }
            i3 += iMin;
            iA++;
        }
        buffer.f45132Y += (long) i2;
    }

    public final byte[] x() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.f0;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.g0;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            ArraysKt.m(i4, i5, i5 + i7, bArr2[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public final ByteString y() {
        return new ByteString(x());
    }
}
