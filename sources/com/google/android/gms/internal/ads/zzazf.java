package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazf implements zzazh {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzazf(zzazi zzaziVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzaziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
