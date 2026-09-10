package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxz {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzxz(int i2) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i2) {
        int i3 = this.zzc[i2] + 1;
        int[] iArr = this.zzb;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    public final int zzc(int i2) {
        int i3 = this.zzc[i2] - 1;
        if (i3 >= 0) {
            return this.zzb[i3];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzxz zzf(int i2, int i3) {
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            Random random = this.zza;
            iArr[i4] = random.nextInt(this.zzb.length + 1);
            int i5 = i4 + 1;
            int iNextInt = random.nextInt(i5);
            iArr2[i4] = iArr2[iNextInt];
            iArr2[iNextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i3];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr3.length + i3; i8++) {
            if (i6 >= i3 || i7 != iArr[i6]) {
                int i9 = i7 + 1;
                int i10 = iArr3[i7];
                iArr4[i8] = i10;
                if (i10 >= 0) {
                    iArr4[i8] = i10 + i3;
                }
                i7 = i9;
            } else {
                iArr4[i8] = iArr2[i6];
                i6++;
            }
        }
        return new zzxz(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzxz zzg(int i2, int i3) {
        int[] iArr = this.zzb;
        int[] iArr2 = new int[iArr.length - i3];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < 0 || i6 >= i3) {
                int i7 = i5 - i4;
                if (i6 >= 0) {
                    i6 -= i3;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        return new zzxz(iArr2, new Random(this.zza.nextLong()));
    }

    public final zzxz zzh() {
        return new zzxz(0, new Random(this.zza.nextLong()));
    }

    private zzxz(int i2, Random random) {
        this(new int[0], random);
    }

    private zzxz(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzc[iArr[i2]] = i2;
        }
    }
}
