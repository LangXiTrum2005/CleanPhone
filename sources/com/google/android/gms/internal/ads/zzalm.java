package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzalm {
    private zzaga zzb;
    private zzaer zzc;
    private zzali zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzalg zza = new zzalg();
    private zzalk zzj = new zzalk();

    public void zza(boolean z2) {
        int i2;
        if (z2) {
            this.zzj = new zzalk();
            this.zzf = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.zzh = i2;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzer zzerVar);

    @EnsuresNonNullIf
    public abstract boolean zzc(zzer zzerVar, long j, zzalk zzalkVar) throws IOException;

    public final void zze(zzaer zzaerVar, zzaga zzagaVar) {
        this.zzc = zzaerVar;
        this.zzb = zzagaVar;
        zza(true);
    }

    public final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j2);
            this.zze = jZzi;
            zzali zzaliVar = this.zzd;
            String str = zzfj.zza;
            zzaliVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        this.zzb.getClass();
        String str = zzfj.zza;
        int i2 = this.zzh;
        if (i2 != 0) {
            if (i2 == 1) {
                zzaepVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i2 != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzaepVar);
            if (jZza >= 0) {
                zzafoVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzafr zzafrVarZzc = this.zzd.zzc();
                zzafrVarZzc.getClass();
                this.zzc.zzw(zzafrVarZzc);
                zzafrVarZzc.zza();
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzaepVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzer zzerVarZzd = this.zza.zzd();
            long jZzb = zzb(zzerVarZzd);
            if (jZzb >= 0) {
                long j = this.zzg;
                if (j + jZzb >= this.zze) {
                    long jZzh = zzh(j);
                    this.zzb.zzz(zzerVarZzd, zzerVarZzd.zze());
                    this.zzb.zzx(jZzh, 1, zzerVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        while (true) {
            zzalg zzalgVar = this.zza;
            if (!zzalgVar.zzb(zzaepVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzn = zzaepVar.zzn();
            long j2 = this.zzf;
            this.zzk = jZzn - j2;
            if (!zzc(zzalgVar.zzd(), j2, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzu(zzvVar);
                    this.zzm = true;
                }
                zzali zzaliVar = this.zzj.zzb;
                if (zzaliVar != null) {
                    this.zzd = zzaliVar;
                } else if (zzaepVar.zzo() == -1) {
                    this.zzd = new zzall(null);
                } else {
                    zzalh zzalhVarZzc = zzalgVar.zzc();
                    this.zzd = new zzalb(this, this.zzf, zzaepVar.zzo(), zzalhVarZzc.zzd + zzalhVarZzc.zze, zzalhVarZzc.zzb, (zzalhVarZzc.zza & 4) != 0);
                }
                this.zzh = 2;
                zzalgVar.zze();
                return 0;
            }
            this.zzf = zzaepVar.zzn();
        }
    }

    public final long zzh(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    public final long zzi(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    public void zzj(long j) {
        this.zzg = j;
    }
}
