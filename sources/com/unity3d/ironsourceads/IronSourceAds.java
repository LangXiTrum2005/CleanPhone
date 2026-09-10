package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38434a;

        AdFormat(String str) {
            this.f38434a = str;
        }

        public final String getValue() {
            return this.f38434a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        p.h().a(z10);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.3";
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        n.f(context, "context");
        n.f(initRequest, "initRequest");
        n.f(initializationListener, "initializationListener");
        O9.f26774a.a(context, initRequest, initializationListener);
    }

    public static final void setConsent(boolean z10) throws JSONException {
        IronLog.API.info("consent: " + z10);
        O9.f26774a.b(z10);
    }

    public static final void setMetaData(String key, String value) {
        n.f(key, "key");
        n.f(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        O9.f26774a.a(key, value);
    }

    public static final void setMetaData(String key, List<String> values) {
        n.f(key, "key");
        n.f(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        p.h().a(key, values);
    }
}
