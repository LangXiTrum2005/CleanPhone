package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaug {
    public final ArrayDeque zza = new ArrayDeque();

    public zzaug(int i2) {
    }

    public final void zza(long j, long j2, long j3) throws zzaue {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzaud zzaudVar = new zzaud(j, j2, j3);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= (Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 452867621))) {
            throw new zzaue();
        }
        arrayDeque.push(zzaudVar);
    }

    public final zzaud zzb() throws zzauf {
        return (zzaud) Optional.ofNullable((zzaud) this.zza.peek()).orElseThrow(zzauc.zza);
    }
}
