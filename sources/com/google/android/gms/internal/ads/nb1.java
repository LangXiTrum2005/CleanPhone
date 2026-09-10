package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f17739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f17744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f17745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17746i;

    /* JADX WARN: Illegal instructions before constructor call */
    public nb1(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c4 = cArr[i10];
            if (!(c4 < 128)) {
                throw new IllegalArgumentException(dv.B("Non-ASCII character: %s", Character.valueOf(c4)));
            }
            if (!(bArr[c4] == -1)) {
                throw new IllegalArgumentException(dv.B("Duplicate character: %s", Character.valueOf(c4)));
            }
            bArr[c4] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final int a(char c4) throws qb1 {
        if (c4 > 127) {
            throw new qb1("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c4))));
        }
        byte b10 = this.f17744g[c4];
        if (b10 != -1) {
            return b10;
        }
        if (c4 <= ' ' || c4 == 127) {
            throw new qb1("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c4))));
        }
        throw new qb1(wi.d.k(new StringBuilder(String.valueOf(c4).length() + 24), "Unrecognized character: ", c4));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return this.f17746i == nb1Var.f17746i && Arrays.equals(this.f17739b, nb1Var.f17739b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17739b) + (true != this.f17746i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f17738a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    public nb1(String str, char[] cArr, byte[] bArr, boolean z10) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        this.f17738a = str;
        cArr.getClass();
        this.f17739b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (bc1.f12734a[roundingMode.ordinal()]) {
                    case 1:
                        ps1.D(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f17741d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i10 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f17742e = i10;
                        this.f17743f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f17740c = length - 1;
                        this.f17744g = bArr;
                        zArr = new boolean[i10];
                        for (int i11 = 0; i11 < this.f17743f; i11++) {
                            int i12 = this.f17741d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[v71.o(i11 * 8, i12)] = true;
                        }
                        this.f17745h = zArr;
                        this.f17746i = z10;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f17741d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i13 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f17742e = i13;
                        this.f17743f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f17740c = length - 1;
                        this.f17744g = bArr;
                        zArr = new boolean[i13];
                        while (i11 < this.f17743f) {
                            int i14 = this.f17741d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[v71.o(i11 * 8, i14)] = true;
                        }
                        this.f17745h = zArr;
                        this.f17746i = z10;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f17741d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i15 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f17742e = i15;
                        this.f17743f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f17740c = length - 1;
                        this.f17744g = bArr;
                        zArr = new boolean[i15];
                        while (i11 < this.f17743f) {
                            int i16 = this.f17741d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[v71.o(i11 * 8, i16)] = true;
                        }
                        this.f17745h = zArr;
                        this.f17746i = z10;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e10) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(length2).length() + 24), "Illegal alphabet length ", length2), e10);
        }
    }
}
