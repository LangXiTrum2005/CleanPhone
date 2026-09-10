package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzf implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzg f20193a;

    public zzf(zzg zzgVar) {
        Objects.requireNonNull(zzgVar);
        this.f20193a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || zzc.f20186a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.f20193a.f20194a.a(3, bundle2);
    }
}
