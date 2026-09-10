package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhj {
    final zzhhk zza;
    final long[] zzb;

    public zzhhj(zzhhk zzhhkVar, long[] jArr) {
        this.zza = zzhhkVar;
        this.zzb = jArr;
    }

    public zzhhj() {
        this(new zzhhk(), new long[10]);
    }

    public zzhhj(zzhhj zzhhjVar) {
        this.zza = new zzhhk(zzhhjVar.zza);
        this.zzb = Arrays.copyOf(zzhhjVar.zzb, 10);
    }
}
