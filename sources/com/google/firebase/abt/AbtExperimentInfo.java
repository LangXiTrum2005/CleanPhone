package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class AbtExperimentInfo {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f20163h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20166c;
    public final Date d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20167e;
    public final long f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.f20164a = str;
        this.f20165b = str2;
        this.f20166c = str3;
        this.d = date;
        this.f20167e = j;
        this.f = j2;
    }

    public final AnalyticsConnector.ConditionalUserProperty a() {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f20175a = "frc";
        conditionalUserProperty.m = this.d.getTime();
        conditionalUserProperty.f20176b = this.f20164a;
        conditionalUserProperty.f20177c = this.f20165b;
        String str = this.f20166c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        conditionalUserProperty.d = str;
        conditionalUserProperty.f20178e = this.f20167e;
        conditionalUserProperty.j = this.f;
        return conditionalUserProperty;
    }
}
