package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzany implements zzaeo {
    private final zzanz zza = new zzanz(null, 0, "audio/ac4");
    private final zzer zzb = new zzer(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        int i2;
        zzer zzerVar = new zzer(10);
        int i3 = 0;
        while (true) {
            zzaef zzaefVar = (zzaef) zzaepVar;
            zzaefVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i3 += iZzG + 10;
            zzaefVar.zzj(iZzG, false);
        }
        zzaepVar.zzl();
        zzaef zzaefVar2 = (zzaef) zzaepVar;
        zzaefVar2.zzj(i3, false);
        int i4 = 0;
        int i5 = i3;
        while (true) {
            int i6 = 7;
            zzaefVar2.zzh(zzerVar.zzi(), 0, 7, false);
            zzerVar.zzh(0);
            int iZzt = zzerVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzerVar.zzi();
                if (bArrZzi.length < 7) {
                    i2 = -1;
                } else {
                    int i7 = ((bArrZzi[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i7 == 65535) {
                        i7 = ((bArrZzi[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrZzi[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i6 = 4;
                    }
                    if (iZzt == 44097) {
                        i6 += 2;
                    }
                    i2 = i7 + i6;
                }
                if (i2 == -1) {
                    return false;
                }
                zzaefVar2.zzj(i2 - 7, false);
            } else {
                zzaepVar.zzl();
                i5++;
                if (i5 - i3 >= 8192) {
                    return false;
                }
                zzaefVar2.zzj(i5, false);
                i4 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zza.zzb(zzaerVar, new zzapu(Integer.MIN_VALUE, 0, 1));
        zzaerVar.zzv();
        zzaerVar.zzw(new zzafq(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        zzer zzerVar = this.zzb;
        int iZza = zzaepVar.zza(zzerVar.zzi(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
