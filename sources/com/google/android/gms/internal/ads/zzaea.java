package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzaea {
    protected final zzadu zza;
    protected final zzadz zzb;
    protected zzadw zzc;
    private final int zzd;

    public zzaea(zzadx zzadxVar, zzadz zzadzVar, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.zzb = zzadzVar;
        this.zzd = i2;
        this.zza = new zzadu(zzadxVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzaep zzaepVar, long j, zzafo zzafoVar) {
        if (j == zzaepVar.zzn()) {
            return 0;
        }
        zzafoVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzaep zzaepVar, long j) throws IOException {
        long jZzn = j - zzaepVar.zzn();
        if (jZzn < 0 || jZzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzaepVar.zzf((int) jZzn);
        return true;
    }

    public final zzafr zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzadw zzadwVar = this.zzc;
        if (zzadwVar == null || zzadwVar.zze() != j) {
            zzadu zzaduVar = this.zza;
            this.zzc = new zzadw(j, zzaduVar.zzd(j), 0L, zzaduVar.zze(), zzaduVar.zzf(), zzaduVar.zzg(), zzaduVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        while (true) {
            zzadw zzadwVar = this.zzc;
            zzadwVar.getClass();
            long jZzb = zzadwVar.zzb();
            long jZzc = zzadwVar.zzc();
            long jZzh = zzadwVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzaepVar, jZzb, zzafoVar);
            }
            if (!zzg(zzaepVar, jZzh)) {
                return zzf(zzaepVar, jZzh, zzafoVar);
            }
            zzaepVar.zzl();
            zzady zzadyVarZza = this.zzb.zza(zzaepVar, zzadwVar.zzd());
            int iZzd = zzadyVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzaepVar, jZzh, zzafoVar);
            }
            if (iZzd == -2) {
                zzadwVar.zzf(zzadyVarZza.zze(), zzadyVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzaepVar, zzadyVarZza.zzf());
                    zze(true, zzadyVarZza.zzf());
                    return zzf(zzaepVar, zzadyVarZza.zzf(), zzafoVar);
                }
                zzadwVar.zzg(zzadyVarZza.zze(), zzadyVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z2, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
