package com.ironsource.sdk.controller;

import com.ironsource.C0306df;
import com.ironsource.C0474n4;
import com.ironsource.InterfaceC0478n8;
import com.ironsource.J3;
import com.ironsource.K3;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.Z6;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FeaturesManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f30237d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30238e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ?> f30239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f30240b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0478n8 f30241c = Kb.Y().t();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends ArrayList<String> {
        public a() {
            add(X3.d.f27721f);
            add(X3.d.f27720e);
            add(X3.d.f27722g);
            add(X3.d.f27723h);
            add(X3.d.f27724i);
            add(X3.d.f27725j);
            add(X3.d.f27726k);
            add(X3.d.l);
            add(X3.d.f27727m);
        }
    }

    private FeaturesManager() {
        if (f30237d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f30239a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f30237d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (f30237d == null) {
                        f30237d = new FeaturesManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30237d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.f30240b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(X3.a.f27669d) ? networkConfiguration.optJSONObject(X3.a.f27669d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f30239a.containsKey("debugMode")) {
                num = (Integer) this.f30239a.get("debugMode");
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public J3 getFeatureFlagCatchUrlError() {
        return new J3(SDKUtils.getNetworkConfiguration().optJSONObject(J3.a.f26334c));
    }

    public K3 getFeatureFlagClickCheck() {
        return new K3(SDKUtils.getNetworkConfiguration());
    }

    public Z6 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f30241c.a(X3.a.f27682r);
        return jSONObjectA != null ? new Z6(jSONObjectA) : new Z6(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(X3.a.f27687w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(X3.a.f27670e, 0);
        }
        return 0;
    }

    public C0306df getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new C0306df(networkConfiguration.has(X3.a.f27683s) ? networkConfiguration.optJSONObject(X3.a.f27683s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f30241c.c(X3.a.f27685u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f30239a = map;
    }
}
