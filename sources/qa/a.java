package qa;

import cc.a2;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f48900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f48905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f48906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48907i;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f48899a = str;
        cArr.getClass();
        this.f48900b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iA = a2.A(length);
            this.f48902d = iA;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iA);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f48903e = i10;
            this.f48904f = iA >> iNumberOfTrailingZeros;
            this.f48901c = cArr.length - 1;
            this.f48905g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f48904f; i11++) {
                int i12 = this.f48902d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[a2.k(i11 * 8, i12)] = true;
            }
            this.f48906h = zArr;
            this.f48907i = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final int a(char c4) throws d {
        if (c4 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c4));
        }
        byte b10 = this.f48905g[c4];
        if (b10 != -1) {
            return b10;
        }
        if (c4 <= ' ' || c4 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c4));
        }
        throw new d("Unrecognized character: " + c4);
    }

    public final a b() {
        if (this.f48907i) {
            return this;
        }
        byte[] bArr = this.f48905g;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i10 = 65;
        while (true) {
            if (i10 > 90) {
                return new a(defpackage.e.q(this.f48899a, ".ignoreCase()", new StringBuilder()), this.f48900b, bArrCopyOf, true);
            }
            int i11 = i10 | 32;
            byte b10 = bArr[i10];
            byte b11 = bArr[i11];
            if (b10 == -1) {
                bArrCopyOf[i10] = b11;
            } else {
                boolean z10 = b11 == -1;
                char c4 = (char) i10;
                char c5 = (char) i11;
                if (!z10) {
                    throw new IllegalStateException(j1.f.B("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                }
                bArrCopyOf[i11] = b10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48907i == aVar.f48907i && Arrays.equals(this.f48900b, aVar.f48900b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48900b) + (this.f48907i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f48899a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c4 = cArr[i10];
            if (c4 < 128) {
                if (bArr[c4] == -1) {
                    bArr[c4] = (byte) i10;
                } else {
                    throw new IllegalArgumentException(j1.f.B("Duplicate character: %s", Character.valueOf(c4)));
                }
            } else {
                throw new IllegalArgumentException(j1.f.B("Non-ASCII character: %s", Character.valueOf(c4)));
            }
        }
        this(str, cArr, bArr, false);
    }
}
