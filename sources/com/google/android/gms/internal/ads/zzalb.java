package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzalb implements zzali {
    private final zzalh zza;
    private final long zzb;
    private final long zzc;
    private final zzalm zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzalb(zzalm zzalmVar, long j, long j2, long j3, long j4, boolean z2) {
        zzgqa.zza(j >= 0 && j2 > j);
        this.zzd = zzalmVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z2) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzalh();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzali
    public final long zza(zzaep zzaepVar) throws IOException {
        long j;
        long j2;
        long jMax;
        int i2 = this.zze;
        if (i2 == 0) {
            long jZzn = zzaepVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j3 = this.zzc - 65307;
            if (j3 > jZzn) {
                return j3;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j4 = this.zzi;
                long j5 = this.zzj;
                if (j4 == j5) {
                    jMax = -1;
                    j2 = -1;
                } else {
                    long jZzn2 = zzaepVar.zzn();
                    zzalh zzalhVar = this.zza;
                    if (zzalhVar.zzb(zzaepVar, j5)) {
                        zzalhVar.zzc(zzaepVar, false);
                        zzaepVar.zzl();
                        long j6 = this.zzh;
                        j = 2;
                        long j7 = zzalhVar.zzb;
                        long j8 = j6 - j7;
                        int i3 = zzalhVar.zzd + zzalhVar.zze;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j7;
                            } else {
                                this.zzi = zzaepVar.zzn() + ((long) i3);
                                this.zzk = j7;
                            }
                            long j9 = this.zzj;
                            long j10 = this.zzi;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.zzj = j10;
                                j2 = -1;
                                jMax = j10;
                            } else {
                                long jZzn3 = zzaepVar.zzn() - (((long) i3) * (j8 <= 0 ? 2L : 1L));
                                j2 = -1;
                                String str = zzfj.zza;
                                jMax = Math.max(j10, Math.min(((j8 * j11) / (this.zzl - this.zzk)) + jZzn3, j9 - 1));
                            }
                        } else {
                            jMax = -1;
                            j2 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                    }
                    if (jMax != j2) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j = 2;
                if (jMax != j2) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i2 != 3) {
                    return -1L;
                }
                j2 = -1;
                j = 2;
            }
            while (true) {
                zzalh zzalhVar2 = this.zza;
                zzalhVar2.zzb(zzaepVar, j2);
                zzalhVar2.zzc(zzaepVar, false);
                if (zzalhVar2.zzb > this.zzh) {
                    zzaepVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j);
                }
                zzaepVar.zzf(zzalhVar2.zzd + zzalhVar2.zze);
                this.zzi = zzaepVar.zzn();
                this.zzk = zzalhVar2.zzb;
                j2 = -1;
            }
        }
        zzalh zzalhVar3 = this.zza;
        zzalhVar3.zza();
        if (!zzalhVar3.zzb(zzaepVar, -1L)) {
            throw new EOFException();
        }
        zzalhVar3.zzc(zzaepVar, false);
        zzaepVar.zzf(zzalhVar3.zzd + zzalhVar3.zze);
        long j12 = zzalhVar3.zzb;
        while ((zzalhVar3.zza & 4) != 4 && zzalhVar3.zzb(zzaepVar, -1L) && zzaepVar.zzn() < this.zzc && zzalhVar3.zzc(zzaepVar, true) && zzaes.zzd(zzaepVar, zzalhVar3.zzd + zzalhVar3.zze)) {
            j12 = zzalhVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final /* bridge */ /* synthetic */ zzafr zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzala(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzalm zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
