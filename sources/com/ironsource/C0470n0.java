package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0470n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSource.a f29775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkSettings f29777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f29780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f29781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29783i;

    public C0470n0(IronSource.a aVar, String str, int i10, JSONObject jSONObject, String str2, int i11, String str3, NetworkSettings networkSettings, int i12) {
        this.f29775a = aVar;
        this.f29776b = str;
        this.f29779e = i10;
        this.f29780f = jSONObject;
        this.f29781g = str2;
        this.f29782h = i11;
        this.f29783i = str3;
        this.f29777c = networkSettings;
        this.f29778d = i12;
    }

    public IronSource.a a() {
        return this.f29775a;
    }

    public String b() {
        return this.f29783i;
    }

    public String c() {
        return this.f29781g;
    }

    public int d() {
        return this.f29782h;
    }

    public JSONObject e() {
        return this.f29780f;
    }

    public int f() {
        return this.f29778d;
    }

    public NetworkSettings g() {
        return this.f29777c;
    }

    public int h() {
        return this.f29779e;
    }

    public String i() {
        return this.f29776b;
    }
}
