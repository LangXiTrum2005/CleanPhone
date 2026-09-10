package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbk implements zzezx {
    final zzgyw zza;

    public zzfbk(zzbey zzbeyVar, zzgyw zzgywVar, Context context) {
        this.zza = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfbl(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 45;
    }
}
