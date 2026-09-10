package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzahh implements zzaeo {
    private zzaer zzb;
    private zzaho zzc;
    private zzaep zzd;
    private zzafw zze;
    private zzakp zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzaer zzaerVar = this.zzb;
        zzaerVar.getClass();
        zzaerVar.zzv();
        this.zzb.zzw(new zzafq(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        int i2;
        zzer zzerVar = new zzer(16);
        boolean z2 = true;
        while (true) {
            zzerVar.zza(8);
            if (!zzaepVar.zzh(zzerVar.zzi(), 0, 8, true)) {
                return false;
            }
            long jZzz = zzerVar.zzz();
            int iZzB = zzerVar.zzB();
            if (jZzz != 1) {
                i2 = 8;
            } else {
                if (!zzaepVar.zzh(zzerVar.zzi(), 8, 8, true)) {
                    return false;
                }
                jZzz = zzerVar.zzJ();
                i2 = 16;
            }
            long j = i2;
            if (jZzz < j) {
                return false;
            }
            int i3 = (int) (jZzz - j);
            if (z2) {
                if (iZzB != 1718909296 || i3 < 8) {
                    return false;
                }
                zzerVar.zza(4);
                zzaef zzaefVar = (zzaef) zzaepVar;
                zzaefVar.zzh(zzerVar.zzi(), 0, 4, false);
                if (zzerVar.zzB() != 1751476579) {
                    return false;
                }
                zzaefVar.zzj(i3 - 4, false);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    ((zzaef) zzaepVar).zzj(i3, false);
                }
            }
            z2 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzb = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        while (true) {
            int i2 = this.zzg;
            if (i2 == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaepVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaepVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzerVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzaepVar.zzn();
                    this.zzk = jZzn;
                    long j = this.zzj;
                    zzaho zzahoVar = new zzaho(0L, jZzn - j, -9223372036854775807L, jZzn, jZzJ - j);
                    this.zzc = zzahoVar;
                    zzaer zzaerVar = this.zzb;
                    zzaerVar.getClass();
                    zzaga zzagaVarZzu = zzaerVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/heic");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahoVar));
                    zzagaVarZzu.zzu(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i2 == 1) {
                zzaepVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaepVar != this.zzd) {
                        this.zzd = zzaepVar;
                        this.zze = new zzafw(zzaepVar, this.zzk);
                    }
                    zzakp zzakpVar = this.zzf;
                    zzakpVar.getClass();
                    int iZzd = zzakpVar.zzd(this.zze, zzafoVar);
                    if (iZzd == 1) {
                        zzafoVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakp(zzalw.zza, 8);
                }
                zzafw zzafwVar = new zzafw(zzaepVar, this.zzk);
                this.zze = zzafwVar;
                if (this.zzf.zza(zzafwVar)) {
                    zzakp zzakpVar2 = this.zzf;
                    long j2 = this.zzk;
                    zzaer zzaerVar2 = this.zzb;
                    zzaerVar2.getClass();
                    zzakpVar2.zzc(new zzafy(j2, zzaerVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzakp zzakpVar = this.zzf;
                zzakpVar.getClass();
                zzakpVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
