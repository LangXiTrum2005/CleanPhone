package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i2) {
        zzgqa.zzi(!this.zzb);
        this.zza.append(i2, true);
        return this;
    }

    public final zzs zzb() {
        zzgqa.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
