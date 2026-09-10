package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahc implements zzaeo {
    private zzaer zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaha zzo;
    private zzahg zzp;
    private final zzer zza = new zzer(4);
    private final zzer zzb = new zzer(9);
    private final zzer zzc = new zzer(11);
    private final zzer zzd = new zzer();
    private final zzahd zze = new zzahd();
    private int zzg = 1;

    private final zzer zzh(zzaep zzaepVar) throws IOException {
        zzer zzerVar = this.zzd;
        if (this.zzl > zzerVar.zzj()) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzerVar.zzh(0);
        }
        zzerVar.zzf(this.zzl);
        zzaepVar.zzc(zzerVar.zzi(), 0, this.zzl);
        return zzerVar;
    }

    @RequiresNonNull
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzafq(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzer zzerVar = this.zza;
        zzaef zzaefVar = (zzaef) zzaepVar;
        zzaefVar.zzh(zzerVar.zzi(), 0, 3, false);
        zzerVar.zzh(0);
        if (zzerVar.zzx() != 4607062) {
            return false;
        }
        zzaefVar.zzh(zzerVar.zzi(), 0, 2, false);
        zzerVar.zzh(0);
        if ((zzerVar.zzt() & 250) != 0) {
            return false;
        }
        zzaefVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        zzaepVar.zzl();
        zzaef zzaefVar2 = (zzaef) zzaepVar;
        zzaefVar2.zzj(iZzB, false);
        zzaefVar2.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        return zzerVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzf = zzaerVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z2;
        long j2;
        this.zzf.getClass();
        while (true) {
            int i2 = this.zzg;
            int i3 = 8;
            if (i2 == 1) {
                zzer zzerVar = this.zzb;
                if (!zzaepVar.zzb(zzerVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzerVar.zzh(0);
                zzerVar.zzk(4);
                int iZzs = zzerVar.zzs();
                int i4 = iZzs & 4;
                int i5 = iZzs & 1;
                if (i4 != 0 && this.zzo == null) {
                    this.zzo = new zzaha(this.zzf.zzu(8, 1));
                }
                if (i5 != 0 && this.zzp == null) {
                    this.zzp = new zzahg(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzerVar.zzB() - 5;
                this.zzg = 2;
            } else if (i2 == 2) {
                zzaepVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i2 == 3) {
                zzer zzerVar2 = this.zzc;
                if (!zzaepVar.zzb(zzerVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzerVar2.zzh(0);
                this.zzk = zzerVar2.zzs();
                this.zzl = zzerVar2.zzx();
                this.zzm = zzerVar2.zzx();
                this.zzm = (((long) (zzerVar2.zzs() << 24)) | this.zzm) * 1000;
                zzerVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j = this.zzi + this.zzm;
                } else {
                    j = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i6 = this.zzk;
                if (i6 == 8) {
                    if (this.zzo != null) {
                        zzi();
                        zZzf = this.zzo.zzf(zzh(zzaepVar), j);
                    }
                    z2 = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j2 = -this.zzm;
                        } else {
                            j2 = 0;
                        }
                        this.zzi = j2;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z2) {
                        return 0;
                    }
                } else {
                    i3 = i6;
                }
                if (i3 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zZzf = this.zzp.zzf(zzh(zzaepVar), j);
                        z2 = true;
                    } else {
                        zzaepVar.zzf(this.zzl);
                        zZzf = false;
                        z2 = false;
                    }
                } else if (i3 != 18 || this.zzn) {
                    zzaepVar.zzf(this.zzl);
                    zZzf = false;
                    z2 = false;
                } else {
                    zzahd zzahdVar = this.zze;
                    boolean zZzf2 = zzahdVar.zzf(zzh(zzaepVar), j);
                    long jZzc = zzahdVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzafj(zzahdVar.zze(), zzahdVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    zZzf = zZzf2;
                    z2 = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j2 = -this.zzm;
                    } else {
                        j2 = 0;
                    }
                    this.zzi = j2;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
