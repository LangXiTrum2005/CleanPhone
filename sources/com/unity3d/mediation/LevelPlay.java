package com.unity3d.mediation;

import an.p;
import android.content.Context;
import com.ironsource.C0481nb;
import com.ironsource.C0533q9;
import com.ironsource.C0606ub;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import l1.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38493a;

        AdFormat(String str) {
            this.f38493a = str;
        }

        public final String getValue() {
            return this.f38493a;
        }
    }

    private LevelPlay() {
    }

    private final void a(String str) {
        if (p.i0(str, "do_not_sell")) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> listA = C0481nb.f29838c.a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (p.i0((String) it.next(), str)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        n.f(listener, "listener");
        IronLog.API.info("adding listener: ".concat(listener.getClass().getSimpleName()));
        C0606ub.f30810a.a(listener);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.3";
    }

    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        n.f(context, "context");
        n.f(initRequest, "initRequest");
        n.f(listener, "listener");
        C0606ub.f30810a.a(context, initRequest, listener);
    }

    public static final void launchTestSuite(Context context) {
        n.f(context, "context");
        IronLog.API.info("");
        com.ironsource.mediationsdk.p.h().c(context);
    }

    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        n.f(listener, "listener");
        IronLog.API.info("removing listener: ".concat(listener.getClass().getSimpleName()));
        C0606ub.f30810a.b(listener);
    }

    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        com.ironsource.mediationsdk.p.h().a(z10);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        com.ironsource.mediationsdk.p.h().b(z10);
    }

    public static final boolean setDynamicUserId(String dynamicUserId) {
        n.f(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: ".concat(dynamicUserId));
        return com.ironsource.mediationsdk.p.h().b(dynamicUserId);
    }

    public static final void setMetaData(String key, String value) {
        n.f(key, "key");
        n.f(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        INSTANCE.a(key);
        C0606ub.f30810a.a(key, value);
    }

    public static final void setNetworkData(String networkKey, JSONObject networkData) {
        n.f(networkKey, "networkKey");
        n.f(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        com.ironsource.mediationsdk.p.h().b(networkKey, networkData);
    }

    public static final void setSegment(LevelPlaySegment segment) {
        n.f(segment, "segment");
        IronLog.API.info("");
        C0606ub.f30810a.b(segment);
    }

    public static final void validateIntegration(Context context) {
        n.f(context, "context");
        IronLog.API.info("");
        C0533q9.f30115a.a(context);
    }

    public static final void setMetaData(String key, List<String> values) {
        n.f(key, "key");
        n.f(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        INSTANCE.a(key);
        C0606ub.f30810a.a(key, values);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning(d.h("Setting '", str, "' via setMetaData is deprecated. Use ", str2, " instead."));
    }
}
