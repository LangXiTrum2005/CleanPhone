package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvy implements zzwe, zzwd {
    public final zzwg zza;
    private final long zzb;
    private final zzaah zzc;
    private zzwi zzd;
    private zzwe zze;
    private zzwd zzf;
    private long zzg = -9223372036854775807L;

    public zzvy(zzwg zzwgVar, zzaah zzaahVar, long j) {
        this.zza = zzwgVar;
        this.zzc = zzaahVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzg;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzb(zzwd zzwdVar, long j) {
        this.zzf = zzwdVar;
        zzwe zzweVar = this.zze;
        if (zzweVar != null) {
            zzweVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzc() throws IOException {
        zzwe zzweVar = this.zze;
        if (zzweVar != null) {
            zzweVar.zzc();
            return;
        }
        zzwi zzwiVar = this.zzd;
        if (zzwiVar != null) {
            zzwiVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final zzyh zzd() {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zze(zzzw[] zzzwVarArr, boolean[] zArr, zzxw[] zzxwVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzg;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzg = -9223372036854775807L;
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zze(zzzwVarArr, zArr, zzxwVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(long j, boolean z2) {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        zzweVar.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        zzweVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzh() {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzj(long j) {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzk(long j, zzmq zzmqVar) {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzk(j, zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        zzwe zzweVar = this.zze;
        String str = zzfj.zza;
        return zzweVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        zzwe zzweVar = this.zze;
        return zzweVar != null && zzweVar.zzm(zzliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        zzwe zzweVar = this.zze;
        return zzweVar != null && zzweVar.zzn();
    }

    public final void zzo(long j) {
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzp(zzwe zzweVar) {
        zzwd zzwdVar = this.zzf;
        String str = zzfj.zza;
        zzwdVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzwi zzwiVar) {
        zzgqa.zzi(this.zzd == null);
        this.zzd = zzwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxx
    public final /* bridge */ /* synthetic */ void zzs(zzxy zzxyVar) {
        zzwd zzwdVar = this.zzf;
        String str = zzfj.zza;
        zzwdVar.zzs(this);
    }

    public final void zzt(zzwg zzwgVar) {
        long jZzv = zzv(this.zzb);
        zzwi zzwiVar = this.zzd;
        zzwiVar.getClass();
        zzwe zzweVarZzG = zzwiVar.zzG(zzwgVar, this.zzc, jZzv);
        this.zze = zzweVarZzG;
        if (this.zzf != null) {
            zzweVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzwe zzweVar = this.zze;
        if (zzweVar != null) {
            zzwi zzwiVar = this.zzd;
            zzwiVar.getClass();
            zzwiVar.zzD(zzweVar);
        }
    }
}
