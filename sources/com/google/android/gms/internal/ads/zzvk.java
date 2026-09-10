package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvk implements zzwe, zzwd {
    public final zzwe zza;
    long zzb;
    private zzwd zzc;
    private zzvj[] zzd = new zzvj[0];
    private long zze = 0;

    public zzvk(zzwe zzweVar, boolean z2, long j, long j2) {
        this.zza = zzweVar;
        this.zzb = j2;
    }

    private static long zzq(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzb(zzwd zzwdVar, long j) {
        this.zzc = zzwdVar;
        this.zza.zzb(this, j);
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
        int length = zzxwVarArr.length;
        this.zzd = new zzvj[length];
        zzxw[] zzxwVarArr2 = new zzxw[length];
        int i2 = 0;
        while (true) {
            zzxw zzxwVar = null;
            if (i2 >= zzxwVarArr.length) {
                break;
            }
            zzvj[] zzvjVarArr = this.zzd;
            zzvj zzvjVar = (zzvj) zzxwVarArr[i2];
            zzvjVarArr[i2] = zzvjVar;
            if (zzvjVar != null) {
                zzxwVar = zzvjVar.zza;
            }
            zzxwVarArr2[i2] = zzxwVar;
            i2++;
        }
        long jZze = this.zza.zze(zzzwVarArr, zArr, zzxwVarArr2, zArr2, j);
        long jZzq = zzq(jZze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j) {
                j2 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzzw zzzwVar : zzzwVarArr) {
                    if (zzzwVar != null) {
                        zzv zzvVarZzc = zzzwVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzo, zzvVarZzc.zzk)) {
                            j2 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j2;
        for (int i3 = 0; i3 < zzxwVarArr.length; i3++) {
            zzxw zzxwVar2 = zzxwVarArr2[i3];
            if (zzxwVar2 == null) {
                this.zzd[i3] = null;
            } else {
                zzvj[] zzvjVarArr2 = this.zzd;
                zzvj zzvjVar2 = zzvjVarArr2[i3];
                if (zzvjVar2 == null || zzvjVar2.zza != zzxwVar2) {
                    zzvjVarArr2[i3] = new zzvj(this, zzxwVar2);
                }
            }
            zzxwVarArr[i3] = this.zzd[i3];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(long j, boolean z2) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzi < j) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (zzvj zzvjVar : this.zzd) {
            if (zzvjVar != null) {
                zzvjVar.zza();
            }
        }
        return zzq(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzk(long j, zzmq zzmqVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzmqVar.zzd;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = zzmqVar.zze;
        long j4 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            zzmqVar = new zzmq(jMax, jMax2);
        }
        return this.zza.zzk(j, zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzl < j) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        return this.zza.zzm(zzliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
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
