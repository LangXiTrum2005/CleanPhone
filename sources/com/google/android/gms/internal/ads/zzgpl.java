package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzgpl extends zzgpk {
    private final char zza;

    public zzgpl(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = this.zza;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final boolean zzb(char c2) {
        return c2 == this.zza;
    }
}
