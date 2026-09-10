package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzajb {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaep zzaepVar) throws IOException {
        int i2;
        zzer zzerVar = this.zza;
        zzaef zzaefVar = (zzaef) zzaepVar;
        int i3 = 0;
        zzaefVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i4 = zzerVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while (true) {
            i2 = i6 + 1;
            if ((i4 & i5) != 0) {
                break;
            }
            i5 >>= 1;
            i6 = i2;
        }
        int i7 = i4 & (~i5);
        zzaefVar.zzh(zzerVar.zzi(), 1, i6, false);
        while (i3 < i6) {
            i3++;
            i7 = (zzerVar.zzi()[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i7 << 8);
        }
        this.zzb += i2;
        return i7;
    }

    public final boolean zza(zzaep zzaepVar) throws IOException {
        long jZzo = zzaepVar.zzo();
        long j = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j = jZzo;
        }
        zzer zzerVar = this.zza;
        zzaef zzaefVar = (zzaef) zzaepVar;
        zzaefVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzerVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzerVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
            int i2 = (int) j;
            int i3 = this.zzb + 1;
            this.zzb = i3;
            if (i3 == i2) {
                return false;
            }
            zzaefVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzaepVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzo == -1 || j3 < jZzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzaepVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaepVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i4 = (int) jZzb2;
                            zzaefVar.zzj(i4, false);
                            this.zzb += i4;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
