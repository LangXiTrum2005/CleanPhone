package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzzh implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzzu zza;

    public zzzh(zzzj zzzjVar, zzzu zzzuVar) {
        this.zza = zzzuVar;
        Objects.requireNonNull(zzzjVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        this.zza.zzl();
    }
}
