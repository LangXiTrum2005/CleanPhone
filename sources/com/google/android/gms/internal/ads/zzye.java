package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzye implements zzwe, zzwd {
    private final zzwe zza;
    private final long zzb;
    private zzwd zzc;

    public zzye(zzwe zzweVar, long j) {
        this.zza = zzweVar;
        this.zzb = j;
    }

    public final zzwe zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzb(zzwd zzwdVar, long j) {
        this.zzc = zzwdVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final zzyh zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zze(zzzw[] zzzwVarArr, boolean[] zArr, zzxw[] zzxwVarArr, boolean[] zArr2, long j) {
        zzxw[] zzxwVarArr2 = new zzxw[zzxwVarArr.length];
        int i2 = 0;
        while (true) {
            zzxw zzxwVarZza = null;
            if (i2 >= zzxwVarArr.length) {
                break;
            }
            zzyd zzydVar = (zzyd) zzxwVarArr[i2];
            if (zzydVar != null) {
                zzxwVarZza = zzydVar.zza();
            }
            zzxwVarArr2[i2] = zzxwVarZza;
            i2++;
        }
        zzwe zzweVar = this.zza;
        long j2 = this.zzb;
        long jZze = zzweVar.zze(zzzwVarArr, zArr, zzxwVarArr2, zArr2, j - j2);
        for (int i3 = 0; i3 < zzxwVarArr.length; i3++) {
            zzxw zzxwVar = zzxwVarArr2[i3];
            if (zzxwVar == null) {
                zzxwVarArr[i3] = null;
            } else {
                zzxw zzxwVar2 = zzxwVarArr[i3];
                if (zzxwVar2 == null || ((zzyd) zzxwVar2).zza() != zzxwVar) {
                    zzxwVarArr[i3] = new zzyd(zzxwVar, j2);
                }
            }
        }
        return jZze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(long j, boolean z2) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzk(long j, zzmq zzmqVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzmqVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        long j = zzliVar.zza;
        long j2 = this.zzb;
        zzlh zzlhVarZza = zzliVar.zza();
        zzlhVarZza.zza(j - j2);
        return this.zza.zzm(zzlhVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzp(zzwe zzweVar) {
        zzwd zzwdVar = this.zzc;
        zzwdVar.getClass();
        zzwdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxx
    public final /* bridge */ /* synthetic */ void zzs(zzxy zzxyVar) {
        zzwd zzwdVar = this.zzc;
        zzwdVar.getClass();
        zzwdVar.zzs(this);
    }
}
