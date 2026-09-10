package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zze implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f20192b;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f20192b = analyticsConnectorListener;
        appMeasurementSdk.registerOnMeasurementEventListener(new zzd(this));
        this.f20191a = new HashSet();
    }
}
