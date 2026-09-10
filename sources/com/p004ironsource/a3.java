package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f24249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f24250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.AD_UNIT f24251c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24252e;
    private int f;
    private int g;

    public a3(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f24249a = networkSettings;
        this.f24250b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f = iOptInt;
        this.d = iOptInt == 2;
        this.f24252e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f24251c = ad_unit;
    }

    public String a() {
        return this.f24249a.getAdSourceNameForEvents();
    }

    public IronSource.AD_UNIT b() {
        return this.f24251c;
    }

    public JSONObject c() {
        return this.f24250b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.f24249a.getProviderName();
    }

    public String g() {
        return this.f24249a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f24249a;
    }

    public String i() {
        return this.f24249a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.f24252e;
    }
}
