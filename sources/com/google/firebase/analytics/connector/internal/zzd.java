package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zze f20190a;

    public zzd(zze zzeVar) {
        Objects.requireNonNull(zzeVar);
        this.f20190a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        zze zzeVar = this.f20190a;
        if (zzeVar.f20191a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = zzc.f20186a;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            zzeVar.f20192b.a(2, bundle2);
        }
    }
}
