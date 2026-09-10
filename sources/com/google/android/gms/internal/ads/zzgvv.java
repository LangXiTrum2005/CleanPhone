package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvv extends zzgvx {
    private zzgvv(zzgvt zzgvtVar, Character ch) {
        super(zzgvtVar, ch);
        zzgqa.zza(zzgvtVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgvx, com.google.android.gms.internal.ads.zzgvy
    public final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzgqa.zzo(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = bArr[i4 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i8 = bArr[i4 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzgvt zzgvtVar = this.zzb;
            int i9 = (i7 << 8) | (i6 << 16) | i8;
            appendable.append(zzgvtVar.zza(i9 >>> 18));
            appendable.append(zzgvtVar.zza((i9 >>> 12) & 63));
            appendable.append(zzgvtVar.zza((i9 >>> 6) & 63));
            appendable.append(zzgvtVar.zza(i9 & 63));
            i4 += 3;
        }
        if (i4 < i3) {
            zze(appendable, bArr, i4, i3 - i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvx, com.google.android.gms.internal.ads.zzgvy
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgvw {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgvt zzgvtVar = this.zzb;
        if (!zzgvtVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgvw(androidx.datastore.preferences.protobuf.a.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZzg.length()) {
            int i4 = i3 + 1;
            int iZzc = (zzgvtVar.zzc(charSequenceZzg.charAt(i2 + 1)) << 12) | (zzgvtVar.zzc(charSequenceZzg.charAt(i2)) << 18);
            bArr[i3] = (byte) (iZzc >>> 16);
            int i5 = i2 + 2;
            if (i5 < charSequenceZzg.length()) {
                int i6 = i2 + 3;
                int iZzc2 = iZzc | (zzgvtVar.zzc(charSequenceZzg.charAt(i5)) << 6);
                int i7 = i3 + 2;
                bArr[i4] = (byte) ((iZzc2 >>> 8) & 255);
                if (i6 < charSequenceZzg.length()) {
                    i2 += 4;
                    i3 += 3;
                    bArr[i7] = (byte) ((iZzc2 | zzgvtVar.zzc(charSequenceZzg.charAt(i6))) & 255);
                } else {
                    i3 = i7;
                    i2 = i6;
                }
            } else {
                i2 = i5;
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgvx
    public final zzgvy zzc(zzgvt zzgvtVar, Character ch) {
        return new zzgvv(zzgvtVar, ch);
    }

    public zzgvv(String str, String str2, Character ch) {
        this(new zzgvt(str, str2.toCharArray()), ch);
    }
}
