package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzma {
    private static final zzwg zzu = new zzwg(new Object(), -1);
    public final zzbf zza;
    public final zzwg zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzit zzf;
    public final boolean zzg;
    public final zzyh zzh;
    public final zzaae zzi;
    public final List zzj;
    public final zzwg zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzma(zzbf zzbfVar, zzwg zzwgVar, long j, long j2, int i2, zzit zzitVar, boolean z2, zzyh zzyhVar, zzaae zzaaeVar, List list, zzwg zzwgVar2, boolean z3, int i3, int i4, zzav zzavVar, long j3, long j4, long j5, long j6, boolean z4) {
        this.zza = zzbfVar;
        this.zzb = zzwgVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i2;
        this.zzf = zzitVar;
        this.zzg = z2;
        this.zzh = zzyhVar;
        this.zzi = zzaaeVar;
        this.zzj = list;
        this.zzk = zzwgVar2;
        this.zzl = z3;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzavVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzma zza(zzaae zzaaeVar) {
        zzbf zzbfVar = zzbf.zza;
        zzwg zzwgVar = zzu;
        return new zzma(zzbfVar, zzwgVar, -9223372036854775807L, 0L, 1, null, false, zzyh.zza, zzaaeVar, zzgtd.zzi(), zzwgVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzwg zzb() {
        return zzu;
    }

    public final zzma zzc(zzwg zzwgVar, long j, long j2, long j3, long j4, zzyh zzyhVar, zzaae zzaaeVar, List list) {
        zzwg zzwgVar2 = this.zzk;
        boolean z2 = this.zzl;
        int i2 = this.zzm;
        int i3 = this.zzn;
        zzav zzavVar = this.zzo;
        long j5 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzma(this.zza, zzwgVar, j2, j3, this.zze, this.zzf, this.zzg, zzyhVar, zzaaeVar, list, zzwgVar2, z2, i2, i3, zzavVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final zzma zzd(zzbf zzbfVar) {
        return new zzma(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzma zze(int i2) {
        return new zzma(this.zza, this.zzb, this.zzc, this.zzd, i2, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzma zzf(zzit zzitVar) {
        return new zzma(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzitVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzma zzg(boolean z2) {
        return new zzma(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z2, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzma zzh(zzwg zzwgVar) {
        return new zzma(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzwgVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzma zzi(boolean z2, int i2, int i3) {
        return new zzma(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z2, i2, i3, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
