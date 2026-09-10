package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxo extends zzvf implements zzxc {
    private final zzha zza;
    private final zzwy zzb;
    private final zztk zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private zzhz zzi;
    private zzak zzj;
    private final zzaaq zzk;

    public /* synthetic */ zzxo(zzak zzakVar, zzha zzhaVar, zzwy zzwyVar, zztk zztkVar, zzaaq zzaaqVar, int i2, int i3, zzv zzvVar, zzgqs zzgqsVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzhaVar;
        this.zzb = zzwyVar;
        this.zzc = zztkVar;
        this.zzk = zzaaqVar;
        this.zzd = i2;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z2 = this.zzg;
        boolean z3 = this.zzh;
        zzak zzakVarZzJ = zzJ();
        zzbf zzyaVar = new zzya(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z2, false, false, null, zzakVarZzJ, z3 ? zzakVarZzJ.zzc : null);
        if (this.zze) {
            zzyaVar = new zzxl(this, zzyaVar);
        }
        zze(zzyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzD(zzwe zzweVar) {
        ((zzxk) zzweVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwe zzG(zzwg zzwgVar, zzaah zzaahVar, long j) {
        zzhb zzhbVarZza = this.zza.zza();
        zzhz zzhzVar = this.zzi;
        if (zzhzVar != null) {
            zzhbVarZza.zze(zzhzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzxk(zzagVar.zza, zzhbVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzwgVar), this.zzk, zzf(zzwgVar), this, zzaahVar, null, this.zzd, 0, null, zzfj.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zza(zzhz zzhzVar) {
        this.zzi = zzhzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public final void zzb(long j, zzafr zzafrVar, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzf;
        }
        boolean zZzb = zzafrVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zZzb && this.zzh == z2) {
            return;
        }
        this.zzf = j;
        this.zzg = zZzb;
        this.zzh = z2;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzt() {
    }
}
