package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafk {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzafk() {
    }

    public final boolean zza(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!zzafl.zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i7 = i5 - 1;
        this.zza = i3;
        this.zzb = zzafl.zza[3 - i4];
        int i8 = zzafl.zzb[i6];
        this.zzd = i8;
        if (i3 == 2) {
            i8 /= 2;
            this.zzd = i8;
        } else if (i3 == 0) {
            i8 /= 4;
            this.zzd = i8;
        }
        int i9 = (i2 >>> 9) & 1;
        this.zzg = zzafl.zzm(i3, i4);
        if (i4 == 3) {
            int i10 = i3 == 3 ? zzafl.zzc[i7] : zzafl.zzd[i7];
            this.zzf = i10;
            this.zzc = (((i10 * 12) / i8) + i9) * 4;
        } else {
            if (i3 == 3) {
                int i11 = i4 == 2 ? zzafl.zze[i7] : zzafl.zzf[i7];
                this.zzf = i11;
                this.zzc = android.support.v4.media.a.B(i11, 144, i8, i9);
            } else {
                int i12 = zzafl.zzg[i7];
                this.zzf = i12;
                this.zzc = android.support.v4.media.a.B(i4 == 1 ? 72 : 144, i12, i8, i9);
            }
        }
        this.zze = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzafk(zzafk zzafkVar) {
        this.zza = zzafkVar.zza;
        this.zzb = zzafkVar.zzb;
        this.zzc = zzafkVar.zzc;
        this.zzd = zzafkVar.zzd;
        this.zze = zzafkVar.zze;
        this.zzf = zzafkVar.zzf;
        this.zzg = zzafkVar.zzg;
    }
}
