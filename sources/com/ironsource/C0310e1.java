package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0310e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f28496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f28497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.a f28498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28502g;

    public C0310e1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f28496a = networkSettings;
        this.f28497b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f28501f = iOptInt;
        this.f28499d = iOptInt == 2;
        this.f28500e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f28502g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f28498c = aVar;
    }

    public String a() {
        return this.f28496a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f28498c;
    }

    public JSONObject c() {
        return this.f28497b;
    }

    public int d() {
        return this.f28501f;
    }

    public int e() {
        return this.f28502g;
    }

    public String f() {
        return this.f28496a.getProviderName();
    }

    public String g() {
        return this.f28496a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f28496a;
    }

    public String i() {
        return this.f28496a.getSubProviderId();
    }

    public boolean j() {
        return this.f28499d;
    }

    public boolean k() {
        return this.f28500e;
    }
}
