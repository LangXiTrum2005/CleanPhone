package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacw implements zzadm {
    private final zzacy zza;
    private final long zzb;

    public zzacw(zzacy zzacyVar, long j) {
        this.zza = zzacyVar;
        this.zzb = j;
    }

    private final zzadn zzb(long j, long j2) {
        return new zzadn((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzcw.zzb(this.zza.zzk);
        zzacy zzacyVar = this.zza;
        zzacx zzacxVar = zzacyVar.zzk;
        long[] jArr = zzacxVar.zza;
        long[] jArr2 = zzacxVar.zzb;
        int iZzd = zzei.zzd(jArr, zzacyVar.zzb(j), true, false);
        zzadn zzadnVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzadnVarZzb.zzb == j || iZzd == jArr.length - 1) {
            return new zzadk(zzadnVarZzb, zzadnVarZzb);
        }
        int i = iZzd + 1;
        return new zzadk(zzadnVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
