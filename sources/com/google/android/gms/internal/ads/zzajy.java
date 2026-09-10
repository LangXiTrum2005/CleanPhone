package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes4.dex */
final class zzajy implements zzaju {
    private final zzer zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzajy(zzfv zzfvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zza = zzerVar;
        zzerVar.zzh(12);
        this.zzc = zzerVar.zzH() & 255;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zzc() {
        int i2 = this.zzc;
        if (i2 == 8) {
            return this.zza.zzs();
        }
        if (i2 == 16) {
            return this.zza.zzt();
        }
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        if (i3 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
