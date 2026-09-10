package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzccs {
    public final ListenableFuture zza(Context context, int i2) {
        zzcdt zzcdtVar = new zzcdt();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
            zzcdo.zza.execute(new zzccr(this, context, zzcdtVar));
        }
        return zzcdtVar;
    }
}
