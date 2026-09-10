package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbct implements zzbcx {
    final /* synthetic */ Activity zza;

    public zzbct(zzbcy zzbcyVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbcyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcx
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
