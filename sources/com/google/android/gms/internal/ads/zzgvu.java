package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvu extends zzgvx {
    final char[] zza;

    private zzgvu(zzgvt zzgvtVar) {
        super(zzgvtVar, null);
        this.zza = new char[512];
        zzgqa.zza(zzgvtVar.zzf().length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzgvtVar.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzgvtVar.zza(i2 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvx, com.google.android.gms.internal.ads.zzgvy
    public final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzgqa.zzo(0, i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.zza;
            appendable.append(cArr[i5]);
            appendable.append(cArr[i5 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvx, com.google.android.gms.internal.ads.zzgvy
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgvw {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgvw(androidx.datastore.preferences.protobuf.a.g(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            zzgvt zzgvtVar = this.zzb;
            bArr[i3] = (byte) (zzgvtVar.zzc(charSequence.charAt(i2 + 1)) | (zzgvtVar.zzc(charSequence.charAt(i2)) << 4));
            i2 += 2;
            i3++;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgvx
    public final zzgvy zzc(zzgvt zzgvtVar, Character ch) {
        return new zzgvu(zzgvtVar);
    }

    public zzgvu(String str, String str2) {
        this(new zzgvt("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
