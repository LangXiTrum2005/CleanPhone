package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgn {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzgn(byte[] bArr, int i2, int i3) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = i3;
        zzk();
    }

    private final int zzi() {
        int i2 = 0;
        while (!zze()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? zzf(i2) : 0);
    }

    private final boolean zzj(int i2) {
        if (i2 < 2 || i2 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    private final void zzk() {
        int i2;
        int i3 = this.zzc;
        boolean z2 = false;
        if (i3 >= 0 && (i3 < (i2 = this.zzb) || (i3 == i2 && this.zzd == 0))) {
            z2 = true;
        }
        zzgqa.zzi(z2);
    }

    public final void zza() {
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            this.zzc = i3 + (true == zzj(i3 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i2) {
        int i3 = this.zzc;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            this.zzc = i5 + 1;
            this.zzd = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.zzc) {
                zzk();
                return;
            } else if (zzj(i3)) {
                this.zzc++;
                i3 += 2;
            }
        }
    }

    public final void zzc() {
        int i2 = this.zzd;
        if (i2 > 0) {
            zzb(8 - i2);
        }
    }

    public final boolean zzd(int i2) {
        int i3 = this.zzc;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.zzd + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.zzb) {
                break;
            }
            if (zzj(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.zzb;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i2 = this.zza[this.zzc] & (128 >> this.zzd);
        zza();
        return i2 != 0;
    }

    public final int zzf(int i2) {
        int i3;
        this.zzd += i2;
        int i4 = 0;
        while (true) {
            i3 = this.zzd;
            int i5 = 2;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.zzd = i6;
            byte[] bArr = this.zza;
            int i7 = this.zzc;
            i4 |= (bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i6;
            if (true != zzj(i7 + 1)) {
                i5 = 1;
            }
            this.zzc = i7 + i5;
        }
        byte[] bArr2 = this.zza;
        int i8 = this.zzc;
        int i9 = i4 | ((bArr2[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3));
        int i10 = 32 - i2;
        if (i3 == 8) {
            this.zzd = 0;
            this.zzc = i8 + (true != zzj(i8 + 1) ? 1 : 2);
        }
        int i11 = ((-1) >>> i10) & i9;
        zzk();
        return i11;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        int i2 = iZzi % 2;
        return ((iZzi + 1) / 2) * (i2 == 0 ? -1 : 1);
    }
}
