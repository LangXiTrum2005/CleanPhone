package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzagc(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i2 = (this.zza[this.zzc] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.zzd;
        zzc(1);
        return 1 == (i2 & 1);
    }

    public final int zzb(int i2) {
        int i3 = this.zzc;
        int i4 = 8 - this.zzd;
        int i5 = i3 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i2, i4);
        int i6 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i6 |= (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i5++;
        }
        int i7 = i6 & ((-1) >>> (32 - i2));
        zzc(i2);
        return i7;
    }

    public final void zzc(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.zzc + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            i5++;
            this.zzc = i5;
            i6 -= 8;
            this.zzd = i6;
        }
        boolean z2 = false;
        if (i5 >= 0 && (i5 < (i3 = this.zzb) || (i5 == i3 && i6 == 0))) {
            z2 = true;
        }
        zzgqa.zzi(z2);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
