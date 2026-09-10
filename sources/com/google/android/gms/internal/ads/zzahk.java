package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzahk implements zzaeo {
    private zzaer zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaho zzg;
    private zzaep zzh;
    private zzafw zzi;
    private zzakp zzj;
    private final zzer zza = new zzer(2);
    private long zzf = -1;

    private final int zzh(zzaep zzaepVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        ((zzaef) zzaepVar).zzh(zzerVar.zzi(), 0, 2, false);
        return zzerVar.zzt();
    }

    private final int zzi(zzaep zzaepVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        zzaepVar.zzi(zzerVar.zzi(), 0, 2);
        return zzerVar.zzt() - 2;
    }

    private final void zzj() {
        zzaer zzaerVar = this.zzb;
        zzaerVar.getClass();
        zzaerVar.zzv();
        this.zzb.zzw(new zzafq(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        int iZzi;
        if (zzh(zzaepVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzaepVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzaepVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzaef) zzaepVar).zzj(iZzi, false);
                } else {
                    zzer zzerVar = this.zza;
                    zzerVar.zza(iZzi);
                    ((zzaef) zzaepVar).zzh(zzerVar.zzi(), 0, iZzi, false);
                    if (Objects.equals(zzerVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzahn.zzb(zzerVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzb = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        String strZzM;
        zzahm zzahmVarZza;
        long j;
        byte b2 = -1;
        int i2 = this.zzc;
        long j2 = -1;
        if (i2 == 0) {
            zzer zzerVar = this.zza;
            zzerVar.zza(2);
            zzaepVar.zzc(zzerVar.zzi(), 0, 2);
            int iZzt = zzerVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.zze = zzi(zzaepVar);
            zzaepVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaepVar != this.zzh) {
                    this.zzh = zzaepVar;
                    this.zzi = new zzafw(zzaepVar, this.zzf);
                }
                zzakp zzakpVar = this.zzj;
                zzakpVar.getClass();
                int iZzd = zzakpVar.zzd(this.zzi, zzafoVar);
                if (iZzd == 1) {
                    zzafoVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzaepVar.zzn();
            long j3 = this.zzf;
            if (jZzn != j3) {
                zzafoVar.zza = j3;
                return 1;
            }
            if (zzaepVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzaepVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzakp(zzalw.zza, 8);
                }
                zzafw zzafwVar = new zzafw(zzaepVar, this.zzf);
                this.zzi = zzafwVar;
                if (this.zzj.zza(zzafwVar)) {
                    zzakp zzakpVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzaer zzaerVar = this.zzb;
                    zzaerVar.getClass();
                    zzakpVar2.zzc(new zzafy(j4, zzaerVar));
                    zzaho zzahoVar = this.zzg;
                    zzahoVar.getClass();
                    zzaer zzaerVar2 = this.zzb;
                    zzaerVar2.getClass();
                    zzaga zzagaVarZzu = zzaerVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/jpeg");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahoVar));
                    zzagaVarZzu.zzu(zztVar.zzM());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzer zzerVar2 = new zzer(this.zze);
            zzaepVar.zzc(zzerVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzerVar2.zzM((char) 0)) && (strZzM = zzerVar2.zzM((char) 0)) != null) {
                long jZzo = zzaepVar.zzo();
                zzaho zzahoVar2 = null;
                if (jZzo != -1 && (zzahmVarZza = zzahn.zza(strZzM)) != null) {
                    List list = zzahmVarZza.zzb;
                    if (list.size() >= 2) {
                        int size = list.size() - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (size >= 0) {
                            zzahl zzahlVar = (zzahl) list.get(size);
                            byte b3 = b2;
                            String str = zzahlVar.zza;
                            long j9 = j2;
                            boolean z2 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzahlVar.zzc;
                                j = 0;
                            } else {
                                j = jZzo - zzahlVar.zzb;
                            }
                            long j10 = j;
                            long j11 = jZzo;
                            jZzo = j10;
                            if (z2 && jZzo != j11) {
                                j8 = j11 - jZzo;
                                j7 = jZzo;
                            }
                            if (size == 0) {
                                j6 = j11;
                            }
                            if (size == 0) {
                                j5 = jZzo;
                            }
                            size--;
                            b2 = b3;
                            j2 = j9;
                        }
                        long j12 = j2;
                        if (j7 != j12 && j8 != j12 && j5 != j12 && j6 != j12) {
                            zzahoVar2 = new zzaho(j5, j6, zzahmVarZza.zza, j7, j8);
                        }
                    }
                }
                this.zzg = zzahoVar2;
                if (zzahoVar2 != null) {
                    this.zzf = zzahoVar2.zzd;
                }
            }
        } else {
            zzaepVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakp zzakpVar = this.zzj;
            zzakpVar.getClass();
            zzakpVar.zze(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
