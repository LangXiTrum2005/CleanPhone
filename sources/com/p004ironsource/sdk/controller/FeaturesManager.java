package com.p004ironsource.sdk.controller;

import com.p004ironsource.d9;
import com.p004ironsource.kh;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.on;
import com.p004ironsource.q8;
import com.p004ironsource.q9;
import com.p004ironsource.r8;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.xt;
import com.p004ironsource.ze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class FeaturesManager {
    private static volatile FeaturesManager d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26810e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ?> f26811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f26812b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kh f26813c = on.U().A();

    public class a extends ArrayList<String> {
        public a() {
            add(d9.d.f);
            add(d9.d.f24665e);
            add(d9.d.g);
            add(d9.d.f24666h);
            add(d9.d.f24667i);
            add(d9.d.j);
            add(d9.d.k);
            add(d9.d.f24668l);
            add(d9.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f26811a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (d == null) {
                        d = new FeaturesManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.f26812b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(d9.a.d) ? networkConfiguration.optJSONObject(d9.a.d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f26811a.containsKey("debugMode")) {
                num = (Integer) this.f26811a.get("debugMode");
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public q8 getFeatureFlagCatchUrlError() {
        return new q8(SDKUtils.getNetworkConfiguration().optJSONObject(q8.a.FLAG_NAME));
    }

    public r8 getFeatureFlagClickCheck() {
        return new r8(SDKUtils.getNetworkConfiguration());
    }

    public ze getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f26813c.a(d9.a.r);
        return jSONObjectA != null ? new ze(jSONObjectA) : new ze(null);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(d9.a.f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(d9.a.f24635e, 0);
        }
        return 0;
    }

    public xt getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new xt(networkConfiguration.has(d9.a.s) ? networkConfiguration.optJSONObject(d9.a.s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f26813c.c(d9.a.f24641u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f26811a = map;
    }
}
