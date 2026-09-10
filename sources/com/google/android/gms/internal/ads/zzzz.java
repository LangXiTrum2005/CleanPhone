package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzz {
    private final int[] zza;
    private final zzyh[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzyh zze;

    public zzzz(String[] strArr, int[] iArr, zzyh[] zzyhVarArr, int[] iArr2, int[][][] iArr3, zzyh zzyhVar) {
        this.zza = iArr;
        this.zzb = zzyhVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzyhVar;
    }

    public final int zza(int i2) {
        return this.zza[i2];
    }

    public final zzyh zzb(int i2) {
        return this.zzb[i2];
    }

    public final int zzc(int i2, int i3, int i4) {
        return this.zzd[i2][i3][i4];
    }

    public final int zzd(int i2, int i3, boolean z2) {
        zzyh[] zzyhVarArr = this.zzb;
        int i4 = zzyhVarArr[i2].zza(i3).zza;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            if ((this.zzd[i2][i3][i7] & 7) == 4) {
                iArr[i6] = i7;
                i6++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
        String str = null;
        int i8 = 0;
        int iMin = 16;
        boolean z3 = false;
        while (i5 < iArrCopyOf.length) {
            String str2 = zzyhVarArr[i2].zza(i3).zza(iArrCopyOf[i5]).zzo;
            int i9 = i8 + 1;
            if (i8 == 0) {
                str = str2;
            } else {
                z3 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i2][i3][i5] & 24);
            i5++;
            i8 = i9;
        }
        return z3 ? Math.min(iMin, this.zzc[i2]) : iMin;
    }

    public final zzyh zze() {
        return this.zze;
    }
}
