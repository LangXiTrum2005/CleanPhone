package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzajc {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i3 + 1;
            if ((zza[i3] & ((long) i2)) != 0) {
                return i4;
            }
            i3 = i4;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i2, boolean z2) {
        long j = ((long) bArr[0]) & 255;
        if (z2) {
            j &= ~zza[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j = (j << 8) | (((long) bArr[i3]) & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzaep zzaepVar, boolean z2, boolean z3, int i2) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzaepVar.zzb(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i3 = this.zzd;
        if (i3 > i2) {
            this.zzc = 0;
            return -2L;
        }
        if (i3 != 1) {
            zzaepVar.zzc(this.zzb, 1, i3 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z3);
    }

    public final int zzc() {
        return this.zzd;
    }
}
