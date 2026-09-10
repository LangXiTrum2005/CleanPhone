package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagz implements zzaeo {
    private final byte[] zza;
    private final zzer zzb;
    private final zzaev zzc;
    private zzaer zzd;
    private zzaga zze;
    private int zzf;
    private zzap zzg;
    private zzafb zzh;
    private int zzi;
    private int zzj;
    private zzagx zzk;
    private int zzl;
    private long zzm;

    public zzagz() {
        throw null;
    }

    private final long zzh(zzer zzerVar, boolean z2) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzerVar.zzg();
        while (iZzg <= zzerVar.zze() - 16) {
            zzerVar.zzh(iZzg);
            zzafb zzafbVar = this.zzh;
            int i2 = this.zzj;
            zzaev zzaevVar = this.zzc;
            if (zzaew.zza(zzerVar, zzafbVar, i2, zzaevVar)) {
                zzerVar.zzh(iZzg);
                return zzaevVar.zza;
            }
            iZzg++;
        }
        if (!z2) {
            zzerVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzerVar.zze() - this.zzi) {
            zzerVar.zzh(iZzg);
            try {
                zZza = zzaew.zza(zzerVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzerVar.zzg() <= zzerVar.zze() && zZza) {
                zzerVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzerVar.zzh(zzerVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        zzafb zzafbVar = this.zzh;
        String str = zzfj.zza;
        this.zze.zzx(j / ((long) zzafbVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzaey.zza(zzaepVar, false);
        zzer zzerVar = new zzer(4);
        ((zzaef) zzaepVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzd = zzaerVar;
        this.zze = zzaerVar.zzu(0, 1);
        zzaerVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        boolean zZzb;
        zzafb zzafbVar;
        zzafr zzafqVar;
        boolean z2;
        int i2 = this.zzf;
        if (i2 == 0) {
            zzaepVar.zzl();
            long jZzm = zzaepVar.zzm();
            zzap zzapVarZza = zzaey.zza(zzaepVar, true);
            zzaepVar.zzf((int) (zzaepVar.zzm() - jZzm));
            this.zzg = zzapVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i2 == 1) {
            zzaepVar.zzi(this.zza, 0, 42);
            zzaepVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i2 == 2) {
            zzer zzerVar = new zzer(4);
            zzaepVar.zzc(zzerVar.zzi(), 0, 4);
            if (zzerVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i2 == 3) {
            zzaex zzaexVar = new zzaex(this.zzh);
            do {
                zZzb = zzaey.zzb(zzaepVar, zzaexVar);
                zzafbVar = zzaexVar.zza;
                String str = zzfj.zza;
                this.zzh = zzafbVar;
            } while (!zZzb);
            zzafbVar.getClass();
            this.zzi = Math.max(zzafbVar.zzc, 6);
            zzv zzvVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzaga zzagaVar = this.zze;
            zzt zztVarZza = zzvVarZzc.zza();
            zztVarZza.zzl("audio/flac");
            zzagaVar.zzu(zztVarZza.zzM());
            this.zzh.zza();
            this.zzf = 4;
            return 0;
        }
        if (i2 == 4) {
            zzaepVar.zzl();
            zzer zzerVar2 = new zzer(2);
            zzaepVar.zzi(zzerVar2.zzi(), 0, 2);
            int iZzt = zzerVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzaepVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzaepVar.zzl();
            this.zzj = iZzt;
            zzaer zzaerVar = this.zzd;
            String str2 = zzfj.zza;
            long jZzn = zzaepVar.zzn();
            long jZzo = zzaepVar.zzo();
            zzafb zzafbVar2 = this.zzh;
            zzafbVar2.getClass();
            zzafa zzafaVar = zzafbVar2.zzk;
            if (zzafaVar != null && zzafaVar.zza.length > 0) {
                zzafqVar = new zzaez(zzafbVar2, jZzn);
            } else if (jZzo == -1 || zzafbVar2.zzj <= 0) {
                zzafqVar = new zzafq(zzafbVar2.zza(), 0L);
            } else {
                zzagx zzagxVar = new zzagx(zzafbVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzagxVar;
                zzafqVar = zzagxVar.zza();
            }
            zzaerVar.zzw(zzafqVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzafb zzafbVar3 = this.zzh;
        zzafbVar3.getClass();
        zzagx zzagxVar2 = this.zzk;
        if (zzagxVar2 != null && zzagxVar2.zzc()) {
            return zzagxVar2.zzd(zzaepVar, zzafoVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzaew.zzb(zzaepVar, zzafbVar3);
            return 0;
        }
        zzer zzerVar3 = this.zzb;
        int iZze = zzerVar3.zze();
        if (iZze < 32768) {
            int iZza = zzaepVar.zza(zzerVar3.zzi(), iZze, 32768 - iZze);
            z2 = iZza == -1;
            if (!z2) {
                zzerVar3.zzf(iZze + iZza);
            } else if (zzerVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z2 = false;
        }
        int iZzg = zzerVar3.zzg();
        int i3 = this.zzl;
        int i4 = this.zzi;
        if (i3 < i4) {
            zzerVar3.zzk(Math.min(i4 - i3, zzerVar3.zzd()));
        }
        long jZzh = zzh(zzerVar3, z2);
        int iZzg2 = zzerVar3.zzg() - iZzg;
        zzerVar3.zzh(iZzg);
        this.zze.zzz(zzerVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = jZzh;
        }
        int length = zzerVar3.zzi().length - zzerVar3.zze();
        if (zzerVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzerVar3.zzd();
        System.arraycopy(zzerVar3.zzi(), zzerVar3.zzg(), zzerVar3.zzi(), 0, iZzd);
        zzerVar3.zzh(0);
        zzerVar3.zzf(iZzd);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzagx zzagxVar = this.zzk;
            if (zzagxVar != null) {
                zzagxVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public zzagz(int i2) {
        this.zza = new byte[42];
        this.zzb = new zzer(new byte[32768], 0);
        this.zzc = new zzaev();
        this.zzf = 0;
    }
}
