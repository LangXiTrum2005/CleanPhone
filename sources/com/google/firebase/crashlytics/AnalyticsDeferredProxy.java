package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f20273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AnalyticsEventLogger f20274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile BreadcrumbSource f20275c;
    public final ArrayList d;

    public AnalyticsDeferredProxy(Deferred deferred) {
        DisabledBreadcrumbSource disabledBreadcrumbSource = new DisabledBreadcrumbSource();
        UnavailableAnalyticsEventLogger unavailableAnalyticsEventLogger = new UnavailableAnalyticsEventLogger();
        this.f20273a = deferred;
        this.f20275c = disabledBreadcrumbSource;
        this.d = new ArrayList();
        this.f20274b = unavailableAnalyticsEventLogger;
        deferred.a(new a(this));
    }
}
