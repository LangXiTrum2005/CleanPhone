package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyticsConfig implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40696a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = -9181934006548728711L;

    @TypeInfo(complex = true)
    private AdCallbacksConfig adCallbacks;

    @TypeInfo(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    private boolean dns;
    private int fuIef;
    private String hostPeriodic;
    private String hostSecured;
    private String noNetworkTimeout;
    private int retryNum;
    private int retryTime;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig scheduledImpressionInfoEvents;
    private boolean sendHopsOnFirstSucceededSmartRedirect;
    private boolean sendViewabilityInfo;
    private float succeededSmartRedirectInfoProbability;

    public AnalyticsConfig() {
        String str = f40696a;
        this.hostSecured = str;
        this.hostPeriodic = str;
        this.dns = false;
        this.retryNum = 3;
        this.retryTime = 10;
        this.succeededSmartRedirectInfoProbability = 0.01f;
        this.sendHopsOnFirstSucceededSmartRedirect = false;
        this.adCallbacks = new AdCallbacksConfig();
        this.sendViewabilityInfo = false;
        this.scheduledImpressionInfoEvents = null;
    }

    public final AdCallbacksConfig a() {
        return this.adCallbacks;
    }

    public final Map b() {
        return this.categories;
    }

    public final int c() {
        return this.fuIef;
    }

    public final String d() {
        String str = this.hostSecured;
        return str != null ? str : f40696a;
    }

    public final String e() {
        String str = this.hostPeriodic;
        return str != null ? str : f40696a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
            if (this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && this.fuIef == analyticsConfig.fuIef && vi.a((Object) this.hostSecured, (Object) analyticsConfig.hostSecured) && vi.a((Object) this.hostPeriodic, (Object) analyticsConfig.hostPeriodic) && vi.a((Object) this.noNetworkTimeout, (Object) analyticsConfig.noNetworkTimeout) && vi.a(this.categories, analyticsConfig.categories) && vi.a((Object) this.adCallbacks, (Object) analyticsConfig.adCallbacks) && vi.a((Object) this.scheduledImpressionInfoEvents, (Object) analyticsConfig.scheduledImpressionInfoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.noNetworkTimeout;
    }

    public final int g() {
        return this.retryNum;
    }

    public final long h() {
        return TimeUnit.SECONDS.toMillis(this.retryTime);
    }

    public final int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, this.adCallbacks, Boolean.valueOf(this.sendViewabilityInfo), Integer.valueOf(this.fuIef), this.scheduledImpressionInfoEvents};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final ComponentInfoEventConfig i() {
        return this.scheduledImpressionInfoEvents;
    }

    public final float j() {
        return this.succeededSmartRedirectInfoProbability;
    }

    public final boolean k() {
        return this.dns;
    }

    public final boolean l() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    public final boolean m() {
        return this.sendViewabilityInfo;
    }
}
