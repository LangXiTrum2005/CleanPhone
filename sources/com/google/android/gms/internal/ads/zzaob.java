package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaob implements zzaeo {
    private final zzaoc zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaer zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaob() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzer zzerVar;
        int i2 = 0;
        while (true) {
            zzerVar = this.zzc;
            zzaef zzaefVar = (zzaef) zzaepVar;
            zzaefVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i2 += iZzG + 10;
            zzaefVar.zzj(iZzG, false);
        }
        zzaepVar.zzl();
        zzaef zzaefVar2 = (zzaef) zzaepVar;
        zzaefVar2.zzj(i2, false);
        if (this.zzg == -1) {
            this.zzg = i2;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        do {
            zzaefVar2.zzh(zzerVar.zzi(), 0, 2, false);
            zzerVar.zzh(0);
            if (zzaoc.zzf(zzerVar.zzt())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzaefVar2.zzh(zzerVar.zzi(), 0, 4, false);
                zzeq zzeqVar = this.zzd;
                zzeqVar.zzf(14);
                int iZzj = zzeqVar.zzj(13);
                if (iZzj <= 6) {
                    i5++;
                    zzaepVar.zzl();
                    zzaefVar2.zzj(i5, false);
                } else {
                    zzaefVar2.zzj(iZzj - 6, false);
                    i4 += iZzj;
                }
            } else {
                i5++;
                zzaepVar.zzl();
                zzaefVar2.zzj(i5, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i2 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zze = zzaerVar;
        this.zza.zzb(zzaerVar, new zzapu(Integer.MIN_VALUE, 0, 1));
        zzaerVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int iZza = zzaepVar.zza(zzerVar.zzi(), 0, com.p004ironsource.mediationsdk.metadata.a.f25965n);
        if (!this.zzi) {
            this.zze.zzw(new zzafq(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public zzaob(int i2) {
        this.zza = new zzaoc(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(com.p004ironsource.mediationsdk.metadata.a.f25965n);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] bArrZzi = zzerVar.zzi();
        this.zzd = new zzeq(bArrZzi, bArrZzi.length);
    }
}
