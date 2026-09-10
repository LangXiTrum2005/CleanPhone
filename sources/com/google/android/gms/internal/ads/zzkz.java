package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkz {
    public zzma zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzkz(zzma zzmaVar) {
        this.zza = zzmaVar;
    }

    public final void zza(int i2) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i2);
        this.zzb += i2;
    }

    public final void zzb(zzma zzmaVar) {
        this.zze |= this.zza != zzmaVar;
        this.zza = zzmaVar;
    }

    public final void zzc(int i2) {
        if (this.zzc && this.zzd != 5) {
            zzgqa.zza(i2 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i2;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
