package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzlk {
    public final zzwe zza;
    public final Object zzb;
    public final zzxw[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzll zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmk[] zzj;
    private final zzaad zzk;
    private final zzlz zzl;
    private zzlk zzm;
    private zzyh zzn;
    private zzaae zzo;
    private long zzp;

    public zzlk(zzmk[] zzmkVarArr, long j, zzaad zzaadVar, zzaah zzaahVar, zzlz zzlzVar, zzll zzllVar, zzaae zzaaeVar, long j2) {
        this.zzj = zzmkVarArr;
        this.zzp = j;
        this.zzk = zzaadVar;
        this.zzl = zzlzVar;
        zzwg zzwgVar = zzllVar.zza;
        this.zzb = zzwgVar.zza;
        this.zzg = zzllVar;
        this.zzn = zzyh.zza;
        this.zzo = zzaaeVar;
        this.zzc = new zzxw[2];
        this.zzi = new boolean[2];
        long j3 = zzllVar.zzb;
        long j4 = zzllVar.zzd;
        zzwe zzweVarZze = zzlzVar.zze(zzwgVar, zzaahVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zzvk(zzweVarZze, true, 0L, j4) : zzweVarZze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzaae zzaaeVar = this.zzo;
            if (i2 >= zzaaeVar.zza) {
                return;
            }
            zzaaeVar.zza(i2);
            zzzw zzzwVar = this.zzo.zzc[i2];
            i2++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzaae zzaaeVar = this.zzo;
            if (i2 >= zzaaeVar.zza) {
                return;
            }
            zzaaeVar.zza(i2);
            zzzw zzzwVar = this.zzo.zzc[i2];
            i2++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, zzbf zzbfVar, boolean z2) throws zzit {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaae zzaaeVarZzk = zzk(f, zzbfVar, z2);
        zzll zzllVar = this.zzg;
        long jMax = zzllVar.zzb;
        long j = zzllVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZzl = zzl(zzaaeVarZzk, jMax, false);
        long j2 = this.zzp;
        zzll zzllVar2 = this.zzg;
        this.zzp = (zzllVar2.zzb - jZzl) + j2;
        this.zzg = zzllVar2.zza(jZzl);
    }

    public final void zzi(long j) {
        zzgqa.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(zzli zzliVar) {
        zzgqa.zzi(zzw());
        this.zza.zzm(zzliVar);
    }

    public final zzaae zzk(float f, zzbf zzbfVar, boolean z2) throws zzit {
        zzyh zzyhVar = this.zzn;
        zzwg zzwgVar = this.zzg.zza;
        zzaad zzaadVar = this.zzk;
        zzmk[] zzmkVarArr = this.zzj;
        zzaae zzaaeVarZzq = zzaadVar.zzq(zzmkVarArr, zzyhVar, zzwgVar, zzbfVar);
        for (int i2 = 0; i2 < zzaaeVarZzq.zza; i2++) {
            boolean z3 = true;
            if (zzaaeVarZzq.zza(i2)) {
                if (zzaaeVarZzq.zzc[i2] == null) {
                    zzmkVarArr[i2].zza();
                    z3 = false;
                }
                zzgqa.zzi(z3);
            } else {
                zzgqa.zzi(zzaaeVarZzq.zzc[i2] == null);
            }
        }
        for (zzzw zzzwVar : zzaaeVarZzq.zzc) {
        }
        return zzaaeVarZzq;
    }

    public final long zzl(zzaae zzaaeVar, long j, boolean z2) {
        return zzm(zzaaeVar, j, false, new boolean[2]);
    }

    public final long zzm(zzaae zzaaeVar, long j, boolean z2, boolean[] zArr) {
        zzmk[] zzmkVarArr;
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= zzaaeVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z2 || !zzaaeVar.zzb(this.zzo, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzmkVarArr = this.zzj;
            if (i3 >= 2) {
                break;
            }
            zzmkVarArr[i3].zza();
            i3++;
        }
        zzv();
        this.zzo = zzaaeVar;
        zzu();
        zzwe zzweVar = this.zza;
        zzzw[] zzzwVarArr = zzaaeVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzxw[] zzxwVarArr = this.zzc;
        long jZze = zzweVar.zze(zzzwVarArr, zArr3, zzxwVarArr, zArr, j);
        for (int i4 = 0; i4 < 2; i4++) {
            zzmkVarArr[i4].zza();
        }
        this.zzf = false;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzxwVarArr[i5] != null) {
                zzgqa.zzi(zzaaeVar.zza(i5));
                zzmkVarArr[i5].zza();
                this.zzf = true;
            } else {
                zzgqa.zzi(zzzwVarArr[i5] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzwe zzweVar = this.zza;
        try {
            boolean z2 = zzweVar instanceof zzvk;
            zzlz zzlzVar = this.zzl;
            if (z2) {
                zzlzVar.zzf(((zzvk) zzweVar).zza);
            } else {
                zzlzVar.zzf(zzweVar);
            }
        } catch (RuntimeException e2) {
            zzee.zzf("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void zzo(zzlk zzlkVar) {
        if (zzlkVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlkVar;
        zzu();
    }

    public final zzlk zzp() {
        return this.zzm;
    }

    public final zzyh zzq() {
        return this.zzn;
    }

    public final zzaae zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzwe zzweVar = this.zza;
        if (zzweVar instanceof zzvk) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzvk) zzweVar).zza(0L, j);
        }
    }

    public final void zzt(zzwd zzwdVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzwdVar, j);
    }
}
