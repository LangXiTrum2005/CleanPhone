package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzauj {
    public final ArrayList zza = new ArrayList();
    public int zzb = 0;

    public zzauj(int i2) {
    }

    public final int zza(long j) throws zzauh {
        long j2;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c(((~i2) & i3) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 438792350;
        if (j >= 0) {
            j2 = ((long) (this.zzb + (iC ^ i10))) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.zzb) {
            throw new zzauh();
        }
        return (int) j2;
    }

    public final void zzb(zzaus zzausVar) throws zzaui {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = this.zzb;
        if (i10 >= ((i9 % 937558955) ^ iC)) {
            throw new zzaui();
        }
        ArrayList arrayList = this.zza;
        if (i10 == arrayList.size()) {
            arrayList.add(zzausVar);
        } else {
            arrayList.set(this.zzb, zzausVar);
        }
        this.zzb++;
    }

    public final zzaus zzc() throws zzauh {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 459541652;
        int i11 = this.zzb;
        if (i11 <= 0) {
            throw new zzauh();
        }
        int i12 = i10 ^ iC;
        ArrayList arrayList = this.zza;
        zzaus zzausVar = (zzaus) arrayList.get(i11 + i12);
        arrayList.set(this.zzb + i12, null);
        this.zzb += i12;
        return zzausVar;
    }

    public final zzaus zzd(long j) throws zzauh {
        return (zzaus) this.zza.get(zza(j));
    }

    public final void zze(long j, zzaus zzausVar) throws zzauh {
        this.zza.set(zza(j), zzausVar);
    }
}
