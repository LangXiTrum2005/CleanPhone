package com.google.android.gms.internal.ads;

import com.ironsource.B5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends rb1 {
    public pb1(nb1 nb1Var, Character ch2) {
        super(nb1Var, ch2);
        ps1.v(nb1Var.f17739b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        ps1.h0(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            char[] cArr = this.f19516a.f17739b;
            sb2.append(cArr[i13 >>> 18]);
            sb2.append(cArr[(i13 >>> 12) & 63]);
            sb2.append(cArr[(i13 >>> 6) & 63]);
            sb2.append(cArr[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            d(i11, i10 - i11, sb2, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final int b(byte[] bArr, CharSequence charSequence) throws qb1 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        nb1 nb1Var = this.f19516a;
        if (!nb1Var.f17745h[length % nb1Var.f17742e]) {
            int length2 = charSequenceE.length();
            throw new qb1(l1.d.k(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceE.length()) {
            int i12 = i11 + 1;
            int iA = (nb1Var.a(charSequenceE.charAt(i10 + 1)) << 12) | (nb1Var.a(charSequenceE.charAt(i10)) << 18);
            bArr[i11] = (byte) (iA >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceE.length()) {
                int i14 = i10 + 3;
                int iA2 = iA | (nb1Var.a(charSequenceE.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iA2 >>> 8) & 255);
                if (i14 < charSequenceE.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iA2 | nb1Var.a(charSequenceE.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final rb1 c(nb1 nb1Var, Character ch2) {
        return new pb1(nb1Var, ch2);
    }

    public pb1(String str, String str2) {
        this(new nb1(str, str2.toCharArray()), Character.valueOf(B5.U));
    }
}
