package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjz {
    public zzlb zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjz(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzlb zzlbVar) {
        this.zze |= this.zza != zzlbVar;
        this.zza = zzlbVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzcw.zzd(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }
}
