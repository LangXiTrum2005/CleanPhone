package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarb {
    private final Executor zza;

    public zzarb(Handler handler) {
        this.zza = new zzaqz(this, handler);
    }

    public final void zza(zzark zzarkVar, zzarq zzarqVar, Runnable runnable) {
        zzarkVar.zzp();
        zzarkVar.zzc("post-response");
        ((zzaqz) this.zza).zza.post(new zzara(zzarkVar, zzarqVar, runnable));
    }

    public final void zzb(zzark zzarkVar, zzart zzartVar) {
        zzarkVar.zzc("post-error");
        ((zzaqz) this.zza).zza.post(new zzara(zzarkVar, zzarq.zzb(zzartVar), null));
    }
}
