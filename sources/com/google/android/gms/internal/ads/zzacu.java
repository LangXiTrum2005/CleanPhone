package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzacu {
    private final zzacm zza;
    private final zzacn zzf;
    private long zzk;
    private final zzabm zzl;
    private final zzack zzb = new zzack();
    private final zzff zzc = new zzff(10);
    private final zzff zzd = new zzff(10);
    private final zzeg zze = new zzeg(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzacu(zzabm zzabmVar, zzacm zzacmVar, zzacn zzacnVar) {
        this.zzl = zzabmVar;
        this.zza = zzacmVar;
        this.zzf = zzacnVar;
    }

    private static Object zzh(zzff zzffVar) {
        zzgqa.zza(zzffVar.zzc() > 0);
        while (zzffVar.zzc() > 1) {
            zzffVar.zzd();
        }
        Object objZzd = zzffVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzff zzffVar = this.zzd;
        if (zzffVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzffVar)).longValue();
        }
        zzff zzffVar2 = this.zzc;
        if (zzffVar2.zzc() > 0) {
            zzffVar2.zza(0L, (zzbv) zzh(zzffVar2));
        }
    }

    public final void zzb(long j, long j2) throws zzit {
        while (true) {
            zzeg zzegVar = this.zze;
            if (zzegVar.zzd()) {
                return;
            }
            zzff zzffVar = this.zzd;
            long jZzc = zzegVar.zzc();
            Long l2 = (Long) zzffVar.zze(jZzc);
            if (l2 != null && l2.longValue() != this.zzk) {
                this.zzk = l2.longValue();
                this.zza.zza(2);
            }
            zzacm zzacmVar = this.zza;
            long j3 = this.zzk;
            zzack zzackVar = this.zzb;
            int iZzk = zzacmVar.zzk(jZzc, j, j2, j3, false, false, zzackVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzackVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzegVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzackVar.zzb(), jZzb, zzacmVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzegVar.zzb();
                final zzabm zzabmVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabmVar.zza.zzB().zzc();
                    }
                };
                zzabn zzabnVar = zzabmVar.zza;
                zzabnVar.zzC().execute(runnable);
                ((zzadj) zzabnVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i2, int i3) {
        long j = this.zzg;
        this.zzc.zza(j == -9223372036854775807L ? 0L : j + 1, new zzbv(i2, i3, 1.0f));
    }

    public final void zzd(int i2, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i2);
            this.zzk = j;
        } else {
            zzff zzffVar = this.zzd;
            long j2 = this.zzg;
            zzffVar.zza(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != -9223372036854775807L && this.zzh == j;
    }
}
