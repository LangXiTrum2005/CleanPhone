package com.google.firebase.analytics.connector;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
    }

    public interface AnalyticsConnectorListener {
        void a(int i2, Bundle bundle);
    }

    public static class ConditionalUserProperty {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20177c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20178e;
        public String f;
        public Bundle g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20179h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Bundle f20180i;
        public long j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Bundle f20181l;
        public long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f20182n;
        public long o;
    }

    void a(ConditionalUserProperty conditionalUserProperty);

    ArrayList b();

    void c(String str, String str2, Bundle bundle);

    void d(String str);

    Map e(boolean z2);

    int f();

    AnalyticsConnectorHandle g(String str, AnalyticsConnectorListener analyticsConnectorListener);
}
