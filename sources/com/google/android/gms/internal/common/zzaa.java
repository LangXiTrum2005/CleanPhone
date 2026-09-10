package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i2) {
    }

    public final zzaa zza(Object obj) {
        int i2;
        obj.getClass();
        int length = this.zza.length;
        int i3 = this.zzb;
        int i4 = i3 + 1;
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= length) {
            i2 = length;
        } else {
            i2 = (length >> 1) + length + 1;
            if (i2 < i4) {
                int iHighestOneBit = Integer.highestOneBit(i3);
                i2 = iHighestOneBit + iHighestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
        }
        if (i2 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i2);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }
}
