package com.google.android.gms.internal.ads;

import com.ironsource.B5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class rb1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pb1 f19513d = new pb1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pb1 f19514e = new pb1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ob1 f19515f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb1 f19516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f19517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile rb1 f19518c;

    static {
        new rb1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new rb1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f19515f = new ob1(new nb1("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public rb1(nb1 nb1Var, Character ch2) {
        this.f19516a = nb1Var;
        boolean z10 = true;
        if (ch2 != null) {
            byte[] bArr = nb1Var.f17744g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z10 = false;
            }
        }
        ps1.V(z10, "Padding character %s was already in alphabet", ch2);
        this.f19517b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        ps1.h0(0, i10, bArr.length);
        while (i11 < i10) {
            int i12 = this.f19516a.f17743f;
            d(i11, Math.min(i12, i10 - i11), sb2, bArr);
            i11 += i12;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws qb1 {
        int i10;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        nb1 nb1Var = this.f19516a;
        boolean z10 = nb1Var.f17745h[length % nb1Var.f17742e];
        int i11 = nb1Var.f17741d;
        if (!z10) {
            int length2 = charSequenceE.length();
            throw new qb1(l1.d.k(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < charSequenceE.length()) {
            long jA = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i10 = nb1Var.f17742e;
                if (i14 >= i10) {
                    break;
                }
                jA <<= i11;
                if (i12 + i14 < charSequenceE.length()) {
                    jA |= (long) nb1Var.a(charSequenceE.charAt(i15 + i12));
                    i15++;
                }
                i14++;
            }
            int i16 = nb1Var.f17743f;
            int i17 = i15 * i11;
            int i18 = (i16 - 1) * 8;
            while (i18 >= (i16 * 8) - i17) {
                bArr[i13] = (byte) ((jA >>> i18) & 255);
                i18 -= 8;
                i13++;
            }
            i12 += i10;
        }
        return i13;
    }

    public rb1 c(nb1 nb1Var, Character ch2) {
        return new rb1(nb1Var, ch2);
    }

    public final void d(int i10, int i11, StringBuilder sb2, byte[] bArr) {
        ps1.h0(i10, i10 + i11, bArr.length);
        nb1 nb1Var = this.f19516a;
        int i12 = nb1Var.f17743f;
        int i13 = 0;
        ps1.v(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = nb1Var.f17741d;
        while (i13 < i11 * 8) {
            sb2.append(nb1Var.f17739b[nb1Var.f17740c & ((int) (j10 >>> ((i15 - i16) - i13)))]);
            i13 += i16;
        }
        if (this.f19517b != null) {
            while (i13 < i12 * 8) {
                sb2.append(B5.U);
                i13 += i16;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f19517b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rb1) {
            rb1 rb1Var = (rb1) obj;
            if (this.f19516a.equals(rb1Var.f19516a) && Objects.equals(this.f19517b, rb1Var.f19517b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final rb1 f() {
        nb1 nb1Var;
        boolean z10;
        rb1 rb1VarC = this.f19518c;
        if (rb1VarC == null) {
            nb1 nb1Var2 = this.f19516a;
            int i10 = 0;
            while (true) {
                char[] cArr = nb1Var2.f17739b;
                int length = cArr.length;
                if (i10 >= length) {
                    nb1Var = nb1Var2;
                    break;
                }
                if (x10.u(cArr[i10])) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = false;
                            break;
                        }
                        char c4 = cArr[i11];
                        if (c4 >= 'a' && c4 <= 'z') {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    ps1.d0("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                    char[] cArr2 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        char c5 = cArr[i12];
                        if (x10.u(c5)) {
                            c5 ^= 32;
                        }
                        cArr2[i12] = (char) c5;
                    }
                    nb1Var = new nb1(nb1Var2.f17738a.concat(".lowerCase()"), cArr2);
                    if (!nb1Var2.f17746i || nb1Var.f17746i) {
                        break;
                        break;
                    }
                    byte[] bArr = nb1Var.f17744g;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    for (int i13 = 65; i13 <= 90; i13++) {
                        int i14 = i13 | 32;
                        byte b10 = bArr[i13];
                        byte b11 = bArr[i14];
                        if (b10 == -1) {
                            bArrCopyOf[i13] = b11;
                        } else {
                            char c10 = (char) i13;
                            char c11 = (char) i14;
                            if (b11 != -1) {
                                throw new IllegalStateException(dv.B("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                            }
                            bArrCopyOf[i14] = b10;
                        }
                    }
                    nb1Var = new nb1(nb1Var.f17738a.concat(".ignoreCase()"), nb1Var.f17739b, bArrCopyOf, true);
                    break;
                }
                i10++;
            }
            rb1VarC = nb1Var == nb1Var2 ? this : c(nb1Var, this.f19517b);
            this.f19518c = rb1VarC;
        }
        return rb1VarC;
    }

    public final String g(int i10, byte[] bArr) {
        ps1.h0(0, i10, bArr.length);
        nb1 nb1Var = this.f19516a;
        int i11 = nb1Var.f17743f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(nb1Var.f17742e * v71.o(i10, i11));
        try {
            a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] h(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int length = (int) (((((long) this.f19516a.f17741d) * ((long) charSequenceE.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceE);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (qb1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19517b) ^ this.f19516a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        nb1 nb1Var = this.f19516a;
        sb2.append(nb1Var);
        if (8 % nb1Var.f17741d != 0) {
            Character ch2 = this.f19517b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public rb1(String str, String str2) {
        this(new nb1(str, str2.toCharArray()), Character.valueOf(B5.U));
    }
}
