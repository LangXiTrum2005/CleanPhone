package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3556g extends j {
    private final boolean g;

    C3556g(j$.time.temporal.a aVar, int i2, int i3, boolean z2) {
        this(aVar, i2, i3, z2, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.C().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        if (i2 < 0 || i2 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    C3556g(j$.time.temporal.r rVar, int i2, int i3, boolean z2, int i4) {
        super(rVar, i2, i3, G.NOT_NEGATIVE, i4);
        this.g = z2;
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.f43099e == -1) {
            return this;
        }
        return new C3556g(this.f43096a, this.f43097b, this.f43098c, this.g, -1);
    }

    @Override // j$.time.format.j
    final j f(int i2) {
        return new C3556g(this.f43096a, this.f43097b, this.f43098c, this.g, this.f43099e + i2);
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        return wVar.l() && this.f43097b == this.f43098c && !this.g;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f43096a;
        Long lE = zVar.e(rVar);
        if (lE == null) {
            return false;
        }
        D dB = zVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.w wVarC = rVar.C();
        wVarC.b(jLongValue, rVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarC.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(wVarC.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z2 = this.g;
        int i2 = this.f43097b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.f43098c), roundingMode).toPlainString().substring(2);
            dB.getClass();
            if (z2) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i2 <= 0) {
            return true;
        }
        if (z2) {
            dB.getClass();
            sb.append('.');
        }
        for (int i3 = 0; i3 < i2; i3++) {
            dB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        int i3 = (wVar.l() || c(wVar)) ? this.f43097b : 0;
        int i4 = (wVar.l() || c(wVar)) ? this.f43098c : 9;
        int length = charSequence.length();
        if (i2 != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i2);
                wVar.g().getClass();
                if (cCharAt == '.') {
                    i2++;
                } else if (i3 > 0) {
                    return ~i2;
                }
            }
            int i5 = i2;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i4 + i5, length);
            int i7 = 0;
            int i8 = i5;
            while (i8 < iMin) {
                int i9 = i8 + 1;
                int iA = wVar.g().a(charSequence.charAt(i8));
                if (iA < 0) {
                    if (i9 >= i6) {
                        break;
                    }
                    return ~i5;
                }
                i7 = (i7 * 10) + iA;
                i8 = i9;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i8 - i5);
            j$.time.temporal.w wVarC = this.f43096a.C();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarC.e());
            return wVar.o(this.f43096a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(wVarC.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i5, i8);
        }
        if (i3 > 0) {
            return ~i2;
        }
        return i2;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.f43096a + "," + this.f43097b + "," + this.f43098c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
