package com.google.android.gms.internal.fido;

import android.support.v4.media.a;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzbb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            boolean z2 = true;
            zzam.zzd(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z2 = false;
            }
            zzam.zzd(z2, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            boolean z2 = zzbbVar.zzh;
            if (Arrays.equals(this.zzf, zzbbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i2) {
        return this.zzf[i2];
    }

    public final boolean zzb(char c2) {
        return this.zzg[61] != -1;
    }

    private zzbb(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzbh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i2 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i3 = 0; i3 < this.zzd; i3++) {
                zArr[zzbh.zza(i3 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(a.h(cArr.length, "Illegal alphabet length "), e2);
        }
    }
}
