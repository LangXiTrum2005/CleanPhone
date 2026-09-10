package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzchn implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzchn(zzhb zzhbVar, int i2, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i2;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i2, (int) Math.min(i3, j2 - j));
            long j3 = this.zzd + ((long) iZza);
            this.zzd = j3;
            i4 = iZza;
            j = j3;
        } else {
            i4 = 0;
        }
        if (j < j2) {
            return i4;
        }
        int iZza2 = this.zzc.zza(bArr, i2 + i4, i3 - i4);
        int i5 = i4 + iZza2;
        this.zzd += (long) iZza2;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        Uri uri;
        zzhf zzhfVar2;
        Uri uri2 = zzhfVar.zza;
        this.zze = uri2;
        long j = zzhfVar.zze;
        long j2 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzhfVar2 = null;
        } else {
            long j3 = zzhfVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            uri = uri2;
            zzhfVar2 = new zzhf(uri, j, jMin, null);
        }
        long j4 = zzhfVar.zzf;
        if (j4 == -1 || j + j4 > j2) {
            zzhfVar3 = new zzhf(uri, Math.max(j2, j), j4 != -1 ? Math.min(j4, (j + j4) - j2) : -1L, null);
        }
        long jZzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long jZzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgtg.zza();
    }
}
