package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f20194a;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f20194a = analyticsConnectorListener;
        appMeasurementSdk.registerOnMeasurementEventListener(new zzf(this));
    }
}
