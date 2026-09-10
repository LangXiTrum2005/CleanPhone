package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends rb1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char[] f18216g;

    public ob1(nb1 nb1Var) {
        super(nb1Var, (Character) null);
        this.f18216g = new char[512];
        ps1.v(nb1Var.f17739b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr = this.f18216g;
            char[] cArr2 = nb1Var.f17739b;
            cArr[i10] = cArr2[i10 >>> 4];
            cArr[i10 | NotificationCompat.FLAG_LOCAL_ONLY] = cArr2[i10 & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        ps1.h0(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f18216g;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final int b(byte[] bArr, CharSequence charSequence) throws qb1 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new qb1(l1.d.k(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            nb1 nb1Var = this.f19516a;
            bArr[i11] = (byte) ((nb1Var.a(cCharAt) << 4) | nb1Var.a(charSequence.charAt(i10 + 1)));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final rb1 c(nb1 nb1Var, Character ch2) {
        return new ob1(nb1Var);
    }
}
