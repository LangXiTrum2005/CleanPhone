package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzlr extends zzg implements zzim {
    private final zzjp zzb;
    private final zzda zzc;

    public zzlr(zzik zzikVar) {
        zzda zzdaVar = new zzda(zzcx.zza);
        this.zzc = zzdaVar;
        try {
            this.zzb = new zzjp(zzikVar, this);
            zzdaVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzA(zzlw zzlwVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzB(zzui zzuiVar) {
        this.zzc.zzb();
        this.zzb.zzB(zzuiVar);
    }

    @Nullable
    public final zzib zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzg
    @VisibleForTesting(otherwise = 4)
    public final void zza(int i, long j, int i2, boolean z) {
        this.zzc.zzb();
        this.zzb.zza(i, j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final zzbq zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final zzby zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzq(boolean z) {
        this.zzc.zzb();
        this.zzb.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzr(@Nullable Surface surface) {
        this.zzc.zzb();
        this.zzb.zzr(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzs(float f) {
        this.zzc.zzb();
        this.zzb.zzs(f);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzt() {
        this.zzc.zzb();
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzu() {
        this.zzc.zzb();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzv() {
        this.zzc.zzb();
        this.zzb.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzw() {
        this.zzc.zzb();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final int zzx() {
        this.zzc.zzb();
        this.zzb.zzx();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzy(zzlw zzlwVar) {
        this.zzc.zzb();
        this.zzb.zzy(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzz() {
        this.zzc.zzb();
        this.zzb.zzz();
    }
}
