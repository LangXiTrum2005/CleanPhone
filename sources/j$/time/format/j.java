package j$.time.format;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
class j implements InterfaceC3555f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.time.temporal.r f43096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f43098c;
    private final G d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f43099e;

    long b(z zVar, long j) {
        return j;
    }

    j(j$.time.temporal.r rVar, int i2, int i3, G g) {
        this.f43096a = rVar;
        this.f43097b = i2;
        this.f43098c = i3;
        this.d = g;
        this.f43099e = 0;
    }

    protected j(j$.time.temporal.r rVar, int i2, int i3, G g, int i4) {
        this.f43096a = rVar;
        this.f43097b = i2;
        this.f43098c = i3;
        this.d = g;
        this.f43099e = i4;
    }

    j e() {
        if (this.f43099e == -1) {
            return this;
        }
        return new j(this.f43096a, this.f43097b, this.f43098c, this.d, -1);
    }

    j f(int i2) {
        int i3 = this.f43099e + i2;
        return new j(this.f43096a, this.f43097b, this.f43098c, this.d, i3);
    }

    @Override // j$.time.format.InterfaceC3555f
    public boolean p(z zVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f43096a;
        Long lE = zVar.e(rVar);
        if (lE == null) {
            return false;
        }
        long jB = b(zVar, lE.longValue());
        D dB = zVar.b();
        String string = jB == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jB));
        int length = string.length();
        int i2 = this.f43098c;
        if (length > i2) {
            throw new j$.time.c("Field " + rVar + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i2);
        }
        dB.getClass();
        int i3 = this.f43097b;
        G g = this.d;
        if (jB >= 0) {
            int i4 = AbstractC3552c.f43090a[g.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && jB >= f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = AbstractC3552c.f43090a[g.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new j$.time.c("Field " + rVar + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - string.length(); i6++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    boolean c(w wVar) {
        int i2 = this.f43099e;
        if (i2 != -1) {
            return i2 > 0 && this.f43097b == this.f43098c && this.d == G.NOT_NEGATIVE;
        }
        return true;
    }

    @Override // j$.time.format.InterfaceC3555f
    public int r(w wVar, CharSequence charSequence, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        BigInteger bigIntegerAdd;
        long j;
        int i4;
        long j2;
        boolean z4;
        int length = charSequence.length();
        if (i2 == length) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        wVar.g().getClass();
        boolean z5 = true;
        int i5 = this.f43098c;
        G g = this.d;
        int i6 = this.f43097b;
        int i7 = 0;
        if (cCharAt == '+') {
            boolean zL = wVar.l();
            boolean z6 = i6 == i5;
            int iOrdinal = g.ordinal();
            if (iOrdinal == 0 ? zL : !(iOrdinal == 1 || iOrdinal == 4 || (!zL && !z6))) {
                return ~i2;
            }
            i3 = i2 + 1;
            z3 = true;
            z2 = false;
        } else {
            wVar.g().getClass();
            if (cCharAt == '-') {
                boolean zL2 = wVar.l();
                boolean z7 = i6 == i5;
                int iOrdinal2 = g.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (zL2 || z7)) {
                    return ~i2;
                }
                i3 = i2 + 1;
                z2 = true;
                z3 = false;
            } else {
                if (g == G.ALWAYS && wVar.l()) {
                    return ~i2;
                }
                i3 = i2;
                z2 = false;
                z3 = false;
            }
        }
        int i8 = (wVar.l() || c(wVar)) ? i6 : 1;
        int i9 = i3 + i8;
        if (i9 > length) {
            return ~i3;
        }
        if (!wVar.l() && !c(wVar)) {
            i5 = 9;
        }
        int i10 = this.f43099e;
        int iMax = Math.max(i10, 0) + i5;
        while (true) {
            bigIntegerAdd = null;
            if (i7 >= 2) {
                j = 0;
                i4 = i3;
                j2 = 0;
                break;
            }
            int iMin = Math.min(iMax + i3, length);
            int i11 = i3;
            long j3 = 0;
            while (true) {
                if (i11 >= iMin) {
                    z4 = z5;
                    j = 0;
                    break;
                }
                int i12 = i11 + 1;
                z4 = z5;
                j = 0;
                int iA = wVar.g().a(charSequence.charAt(i11));
                if (iA < 0) {
                    if (i11 >= i9) {
                        break;
                    }
                    return ~i3;
                }
                if (i12 - i3 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j3);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iA));
                } else {
                    j3 = (j3 * 10) + ((long) iA);
                }
                i11 = i12;
                z5 = z4;
            }
            if (i10 <= 0 || i7 != 0) {
                i4 = i11;
                j2 = j3;
                break;
            }
            iMax = Math.max(i8, (i11 - i3) - i10);
            i7++;
            z5 = z4;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z2) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && wVar.l()) {
                    return ~(i3 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j2 == j && wVar.l()) {
                    return ~(i3 - 1);
                }
                j2 = -j2;
            }
        } else if (g == G.EXCEEDS_PAD && wVar.l()) {
            int i13 = i4 - i3;
            if (z3) {
                if (i13 <= i6) {
                    return ~(i3 - 1);
                }
            } else if (i13 > i6) {
                return ~i3;
            }
        }
        if (bigIntegerDivide != null) {
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i4--;
            }
            return d(wVar, bigIntegerDivide.longValue(), i3, i4);
        }
        return d(wVar, j2, i3, i4);
    }

    int d(w wVar, long j, int i2, int i3) {
        return wVar.o(this.f43096a, j, i2, i3);
    }

    public String toString() {
        int i2 = this.f43098c;
        j$.time.temporal.r rVar = this.f43096a;
        G g = this.d;
        int i3 = this.f43097b;
        if (i3 == 1 && i2 == 19 && g == G.NORMAL) {
            return "Value(" + rVar + ")";
        }
        if (i3 == i2 && g == G.NOT_NEGATIVE) {
            return "Value(" + rVar + "," + i3 + ")";
        }
        return "Value(" + rVar + "," + i3 + "," + i2 + "," + g + ")";
    }
}
