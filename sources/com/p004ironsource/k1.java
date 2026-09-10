package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSource.AD_UNIT f25473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkSettings f25475c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25476e;
    private JSONObject f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f25478i;

    public k1(IronSource.AD_UNIT ad_unit, String str, int i2, JSONObject jSONObject, String str2, int i3, String str3, NetworkSettings networkSettings, int i4) {
        this.f25473a = ad_unit;
        this.f25474b = str;
        this.f25476e = i2;
        this.f = jSONObject;
        this.g = str2;
        this.f25477h = i3;
        this.f25478i = str3;
        this.f25475c = networkSettings;
        this.d = i4;
    }

    public IronSource.AD_UNIT a() {
        return this.f25473a;
    }

    public String b() {
        return this.f25478i;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.f25477h;
    }

    public JSONObject e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }

    public NetworkSettings g() {
        return this.f25475c;
    }

    public int h() {
        return this.f25476e;
    }

    public String i() {
        return this.f25474b;
    }
}
