package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzesb implements zzgxu {
    static final /* synthetic */ zzesb zza = new zzesb();

    private /* synthetic */ zzesb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgym.zza(new zzese(Integer.toString(17))) : zzgym.zza(new zzese(null));
    }
}
