package ra;

import go.k;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49517a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (android.support.v4.media.session.a.x(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(android.support.v4.media.session.a.t(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    public static boolean b(double d10) {
        if (d10 > 0.0d && android.support.v4.media.session.a.x(d10)) {
            long jT = android.support.v4.media.session.a.t(d10);
            if ((jT & (jT - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int c(double d10) {
        boolean zB;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z10 = false;
        k.h("x must be positive and finite", d10 > 0.0d && android.support.v4.media.session.a.x(d10));
        int exponent = Math.getExponent(d10);
        if (Math.getExponent(d10) < -1022) {
            return c(d10 * 4.503599627370496E15d) - 52;
        }
        switch (b.f49516a[roundingMode.ordinal()]) {
            case 1:
                com.bumptech.glide.d.k(b(d10));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !b(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zB = b(d10);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zB = b(d10);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
