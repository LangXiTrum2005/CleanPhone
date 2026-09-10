package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BlockingAnalyticsEventLogger f20276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BreadcrumbAnalyticsEventReceiver f20277b;

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public final void a(int i2, Bundle bundle) {
        Logger logger = Logger.f20289a;
        Locale locale = Locale.US;
        logger.e("Analytics listener received message. ID: " + i2 + ", Extras: " + bundle);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle2.getString("_o")) ? this.f20276a : this.f20277b;
            if (analyticsEventReceiver == null) {
                return;
            }
            analyticsEventReceiver.onEvent(string, bundle2);
        }
    }
}
