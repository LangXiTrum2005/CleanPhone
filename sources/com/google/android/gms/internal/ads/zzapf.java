package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapf implements zzaeo {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzapb zzi;
    private zzaer zzj;
    private boolean zzk;
    private final zzfg zza = new zzfg(0);
    private final zzer zzc = new zzer(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzapc zzd = new zzapc();

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        byte[] bArr = new byte[14];
        zzaef zzaefVar = (zzaef) zzaepVar;
        zzaefVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaefVar.zzj(bArr[13] & 7, false);
        zzaefVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzj = zzaerVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        zzaog zzaoiVar;
        zzaer zzaerVar = this.zzj;
        zzaerVar.getClass();
        long jZzo = zzaepVar.zzo();
        if (jZzo != -1) {
            zzapc zzapcVar = this.zzd;
            if (!zzapcVar.zza()) {
                return zzapcVar.zzc(zzaepVar, zzafoVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzapc zzapcVar2 = this.zzd;
            if (zzapcVar2.zzd() != -9223372036854775807L) {
                zzapb zzapbVar = new zzapb(zzapcVar2.zzb(), zzapcVar2.zzd(), jZzo);
                this.zzi = zzapbVar;
                this.zzj.zzw(zzapbVar.zza());
            } else {
                zzaerVar.zzw(new zzafq(zzapcVar2.zzd(), 0L));
            }
        }
        zzapb zzapbVar2 = this.zzi;
        if (zzapbVar2 != null && zzapbVar2.zzc()) {
            return zzapbVar2.zzd(zzaepVar, zzafoVar);
        }
        zzaepVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zzaepVar.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        zzer zzerVar = this.zzc;
        if (!zzaepVar.zzh(zzerVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        if (iZzB == 441) {
            return -1;
        }
        if (iZzB == 442) {
            zzaepVar.zzi(zzerVar.zzi(), 0, 10);
            zzerVar.zzh(9);
            zzaepVar.zzf((zzerVar.zzs() & 7) + 14);
            return 0;
        }
        if (iZzB == 443) {
            zzaepVar.zzi(zzerVar.zzi(), 0, 2);
            zzerVar.zzh(0);
            zzaepVar.zzf(zzerVar.zzt() + 6);
            return 0;
        }
        if ((iZzB >> 8) != 1) {
            zzaepVar.zzf(1);
            return 0;
        }
        int i2 = iZzB & 255;
        SparseArray sparseArray = this.zzb;
        zzapd zzapdVar = (zzapd) sparseArray.get(i2);
        if (!this.zze) {
            if (zzapdVar == null) {
                zzaog zzaogVar = null;
                if (i2 == 189) {
                    zzaoiVar = new zzanw(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaepVar.zzn();
                } else if ((iZzB & 224) == 192) {
                    zzaoiVar = new zzaos(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaepVar.zzn();
                } else if ((iZzB & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    zzaoiVar = new zzaoi(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzaepVar.zzn();
                } else if (zzaogVar != null) {
                    zzaogVar.zzb(this.zzj, new zzapu(Integer.MIN_VALUE, i2, 256));
                    zzapdVar = new zzapd(zzaogVar, this.zza);
                    sparseArray.put(i2, zzapdVar);
                }
                zzaogVar = zzaoiVar;
                if (zzaogVar != null) {
                    zzaogVar.zzb(this.zzj, new zzapu(Integer.MIN_VALUE, i2, 256));
                    zzapdVar = new zzapd(zzaogVar, this.zza);
                    sparseArray.put(i2, zzapdVar);
                }
            }
            boolean z2 = this.zzf;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z2 && this.zzg) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzaepVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzaepVar.zzi(zzerVar.zzi(), 0, 2);
        zzerVar.zzh(0);
        int iZzt = zzerVar.zzt() + 6;
        if (zzapdVar == null) {
            zzaepVar.zzf(iZzt);
        } else {
            zzerVar.zza(iZzt);
            zzaepVar.zzc(zzerVar.zzi(), 0, iZzt);
            zzerVar.zzh(6);
            zzapdVar.zzb(zzerVar);
            zzerVar.zzf(zzerVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        zzfg zzfgVar = this.zza;
        if (zzfgVar.zzc() != -9223372036854775807L) {
            long jZza = zzfgVar.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                zzfgVar.zzd(j2);
            }
        } else {
            zzfgVar.zzd(j2);
        }
        zzapb zzapbVar = this.zzi;
        int i2 = 0;
        if (zzapbVar != null) {
            zzapbVar.zzb(j2);
        }
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((zzapd) sparseArray.valueAt(i2)).zza();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
