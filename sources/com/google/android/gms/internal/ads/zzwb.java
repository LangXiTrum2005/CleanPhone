package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwb extends zzyj {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzvz zze;
    private zzvy zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzwb(zzwi zzwiVar, boolean z2) {
        boolean z3;
        super(zzwiVar);
        if (z2) {
            zzwiVar.zzI();
            z3 = true;
        } else {
            z3 = false;
        }
        this.zzb = z3;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzwiVar.zzH();
        this.zze = zzvz.zzp(zzwiVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzvz.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull
    private final boolean zzL(long j) {
        zzvy zzvyVar = this.zzf;
        int iZze = this.zze.zze(zzvyVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzvz zzvzVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzvzVar.zzd(iZze, zzbdVar, false);
        long j2 = zzbdVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzvyVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzyf(this.zze.zzb, zzakVar));
        } else {
            this.zze = zzvz.zzp(zzakVar);
        }
        ((zzyj) this).zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzyj) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzyj, com.google.android.gms.internal.ads.zzwi
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzvy zzG(zzwg zzwgVar, zzaah zzaahVar, long j) {
        zzvy zzvyVar = new zzvy(zzwgVar, zzaahVar, j);
        zzvyVar.zzr(((zzyj) this).zza);
        if (this.zzh) {
            zzvyVar.zzt(zzwgVar.zza(zzK(zzwgVar.zza)));
            return zzvyVar;
        }
        this.zzf = zzvyVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzyj) this).zza);
        }
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyj, com.google.android.gms.internal.ads.zzwi
    public final void zzD(zzwe zzweVar) {
        ((zzvy) zzweVar).zzu();
        if (zzweVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzE(zzbf zzbfVar) {
        long jZza;
        zzwg zzwgVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzvy zzvyVar = this.zzf;
            if (zzvyVar != null) {
                zzL(zzvyVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzvz.zzq(zzbfVar, zzbe.zza, zzvz.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzvy zzvyVar2 = this.zzf;
            if (zzvyVar2 != null) {
                jZza = zzvyVar2.zza();
                this.zze.zzo(zzvyVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
            } else {
                jZza = 0;
            }
            Pair pairZzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, jZza);
            Object obj2 = pairZzm.first;
            long jLongValue = ((Long) pairZzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzvz.zzq(zzbfVar, obj, obj2);
            zzvy zzvyVar3 = this.zzf;
            if (zzvyVar3 != null && zzL(jLongValue)) {
                zzwg zzwgVar = zzvyVar3.zza;
                zzwgVarZza = zzwgVar.zza(zzK(zzwgVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzwgVarZza != null) {
            zzvy zzvyVar4 = this.zzf;
            zzvyVar4.getClass();
            zzvyVar4.zzt(zzwgVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final zzwg zzF(zzwg zzwgVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzwgVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzvz.zzc;
        }
        return zzwgVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvo, com.google.android.gms.internal.ads.zzvf
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }
}
