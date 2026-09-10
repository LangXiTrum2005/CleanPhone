package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazg implements zzazh {
    final /* synthetic */ Activity zza;

    public zzazg(zzazi zzaziVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzaziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
