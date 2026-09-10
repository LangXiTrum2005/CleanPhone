package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzbw {
    public final zzfxq zzB;
    public final zzfxs zzC;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfxn zzl;
    public final zzfxn zzm;
    public final zzfxn zzo;
    public final zzfxn zzs;
    public final zzbu zzt;
    public final zzfxn zzu;
    public final int zzv;
    public final int zza = Integer.MAX_VALUE;
    public final int zzb = Integer.MAX_VALUE;
    public final int zzc = Integer.MAX_VALUE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzn = 0;
    public final int zzp = 0;
    public final int zzq = Integer.MAX_VALUE;
    public final int zzr = Integer.MAX_VALUE;
    public final int zzw = 0;
    public final boolean zzx = false;
    public final boolean zzy = false;
    public final boolean zzz = false;
    public final boolean zzA = false;

    static {
        new zzbw(new zzbv());
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public zzbw(zzbv zzbvVar) {
        this.zzi = zzbvVar.zze;
        this.zzj = zzbvVar.zzf;
        this.zzk = zzbvVar.zzg;
        this.zzl = zzbvVar.zzh;
        this.zzm = zzbvVar.zzi;
        this.zzo = zzbvVar.zzj;
        this.zzs = zzbvVar.zzm;
        this.zzt = zzbvVar.zzn;
        this.zzu = zzbvVar.zzo;
        this.zzv = zzbvVar.zzp;
        this.zzB = zzfxq.zzc(zzbvVar.zzq);
        this.zzC = zzfxs.zzl(zzbvVar.zzr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbw zzbwVar = (zzbw) obj;
            if (this.zzk == zzbwVar.zzk && this.zzi == zzbwVar.zzi && this.zzj == zzbwVar.zzj && this.zzl.equals(zzbwVar.zzl) && this.zzm.equals(zzbwVar.zzm) && this.zzo.equals(zzbwVar.zzo) && this.zzs.equals(zzbwVar.zzs) && this.zzt.equals(zzbwVar.zzt) && this.zzu.equals(zzbwVar.zzu) && this.zzv == zzbwVar.zzv && this.zzB.equals(zzbwVar.zzB) && this.zzC.equals(zzbwVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.zzk ? 1 : 0) - 1048002209;
        return this.zzC.hashCode() + ((this.zzB.hashCode() + ((((this.zzu.hashCode() + ((((this.zzs.hashCode() + ((((((this.zzo.hashCode() + ((this.zzm.hashCode() + ((this.zzl.hashCode() + (((((i * 31) + this.zzi) * 31) + this.zzj) * 31)) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.zzv) * 887503681)) * 31);
    }
}
