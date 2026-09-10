package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzir implements zzlj {
    private final zzmt zza;
    private final zziq zzb;
    private zzmi zzc;
    private zzlj zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzir(zziq zziqVar, zzdn zzdnVar) {
        this.zzb = zziqVar;
        this.zza = new zzmt(zzdnVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzmi zzmiVar) throws zzit {
        zzlj zzljVar;
        zzlj zzljVarZzd = zzmiVar.zzd();
        if (zzljVarZzd == null || zzljVarZzd == (zzljVar = this.zzd)) {
            return;
        }
        if (zzljVar != null) {
            throw zzit.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzljVarZzd;
        this.zzc = zzmiVar;
        zzljVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzmi zzmiVar) {
        if (zzmiVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    public final long zzf(boolean z2) {
        zzmt zzmtVar;
        zzav zzavVarZzj;
        zzmi zzmiVar = this.zzc;
        if (zzmiVar == null || zzmiVar.zzZ() || ((z2 && this.zzc.zze() != 2) || (!this.zzc.zzY() && (z2 || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzlj zzljVar = this.zzd;
            zzljVar.getClass();
            long jZzg = zzljVar.zzg();
            if (this.zze) {
                zzmt zzmtVar2 = this.zza;
                if (jZzg < zzmtVar2.zzg()) {
                    zzmtVar2.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzmtVar2.zza();
                    }
                    zzmtVar = this.zza;
                    zzmtVar.zzc(jZzg);
                    zzavVarZzj = zzljVar.zzj();
                    if (!zzavVarZzj.equals(zzmtVar.zzj())) {
                        zzmtVar.zzi(zzavVarZzj);
                        this.zzb.zzc(zzavVarZzj);
                    }
                }
            } else {
                zzmtVar = this.zza;
                zzmtVar.zzc(jZzg);
                zzavVarZzj = zzljVar.zzj();
                if (!zzavVarZzj.equals(zzmtVar.zzj())) {
                    zzmtVar.zzi(zzavVarZzj);
                    this.zzb.zzc(zzavVarZzj);
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzlj zzljVar = this.zzd;
        zzljVar.getClass();
        return zzljVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzlj zzljVar = this.zzd;
        zzljVar.getClass();
        return zzljVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzi(zzav zzavVar) {
        zzlj zzljVar = this.zzd;
        if (zzljVar != null) {
            zzljVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzav zzj() {
        zzlj zzljVar = this.zzd;
        return zzljVar != null ? zzljVar.zzj() : this.zza.zzj();
    }
}
