package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzern implements zzezx {
    private final Context zza;

    public zzern(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzero(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 2;
    }
}
