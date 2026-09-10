package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeq {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzeq(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzd = i2;
    }

    private final void zzq() {
        int i2;
        int i3 = this.zzb;
        boolean z2 = false;
        if (i3 >= 0 && (i3 < (i2 = this.zzd) || (i3 == i2 && this.zzc == 0))) {
            z2 = true;
        }
        zzgqa.zzi(z2);
    }

    public final void zza(zzer zzerVar) {
        zzb(zzerVar.zzi(), zzerVar.zze());
        zzf(zzerVar.zzg() * 8);
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i2;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zze() {
        zzgqa.zzi(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i2) {
        int i3 = i2 / 8;
        this.zzb = i3;
        this.zzc = i2 - (i3 * 8);
        zzq();
    }

    public final void zzg() {
        int i2 = this.zzc + 1;
        this.zzc = i2;
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i2) {
        int i3 = i2 / 8;
        int i4 = this.zzb + i3;
        this.zzb = i4;
        int i5 = (i2 - (i3 * 8)) + this.zzc;
        this.zzc = i5;
        if (i5 > 7) {
            this.zzb = i4 + 1;
            this.zzc = i5 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i2 = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i2 != 0;
    }

    public final int zzj(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.zzc += i2;
        int i4 = 0;
        while (true) {
            i3 = this.zzc;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.zzc = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzb;
            this.zzb = i6 + 1;
            i4 |= (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i5;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzb;
        int i8 = i4 | ((bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3));
        int i9 = 32 - i2;
        if (i3 == 8) {
            this.zzc = 0;
            this.zzb = i7 + 1;
        }
        int i10 = ((-1) >>> i9) & i8;
        zzq();
        return i10;
    }

    public final long zzk(int i2) {
        if (i2 <= 32) {
            int iZzj = zzj(i2);
            String str = zzfj.zza;
            return 4294967295L & ((long) iZzj);
        }
        int iZzj2 = zzj(i2 - 32);
        int iZzj3 = zzj(32);
        String str2 = zzfj.zza;
        return (4294967295L & ((long) iZzj3)) | ((((long) iZzj2) & 4294967295L) << 32);
    }

    public final void zzl(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (true) {
            i4 = i3 >> 3;
            if (i5 >= i4) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i6 = this.zzb;
            int i7 = i6 + 1;
            this.zzb = i7;
            byte b2 = bArr2[i6];
            int i8 = this.zzc;
            byte b3 = (byte) (b2 << i8);
            bArr[i5] = b3;
            bArr[i5] = (byte) (((bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i8)) | b3);
            i5++;
        }
        int i9 = i3 & 7;
        if (i9 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i4] & (255 >> i9));
        bArr[i4] = b4;
        int i10 = this.zzc;
        if (i10 + i9 > 8) {
            byte[] bArr3 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            b4 = (byte) (b4 | ((bArr3[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i10));
            bArr[i4] = b4;
            i10 -= 8;
        }
        int i12 = i10 + i9;
        this.zzc = i12;
        byte[] bArr4 = this.zza;
        int i13 = this.zzb;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i9))) | b4);
        if (i12 == 8) {
            this.zzc = 0;
            this.zzb = i13 + 1;
        }
        zzq();
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i2, int i3) {
        zzgqa.zzi(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i3);
        this.zzb += i3;
        zzq();
    }

    public final void zzo(int i2) {
        zzgqa.zzi(this.zzc == 0);
        this.zzb += i2;
        zzq();
    }

    public final void zzp(int i2, int i3) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i4 = this.zzc;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.zza;
        int i6 = this.zzb;
        byte b2 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b2;
        int i7 = 14 - iMin;
        int i8 = i2 & 16383;
        bArr[i6] = (byte) (b2 | ((i8 >>> i7) << i5));
        int i9 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.zza[i9] = (byte) (i8 >>> i7);
            i9++;
        }
        int i10 = 8 - i7;
        byte[] bArr2 = this.zza;
        byte b3 = (byte) (bArr2[i9] & ((1 << i10) - 1));
        bArr2[i9] = b3;
        bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << i10) | b3);
        zzh(14);
        zzq();
    }

    public zzeq() {
        this.zza = zzfj.zzb;
    }
}
