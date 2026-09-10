package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbcv implements zzbcx {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzbcv(zzbcy zzbcyVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzbcyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcx
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
