package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class K9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0317e8 f26407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f26408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Hc f26409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f26410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26412j;

    public K9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Hc hc2, C0317e8 c0317e8) {
        this.f26404b = str;
        this.f26405c = str2;
        this.f26403a = z10;
        this.f26406d = z11;
        this.f26408f = map;
        this.f26409g = hc2;
        this.f26407e = c0317e8;
        this.f26411i = z12;
        this.f26412j = z13;
        this.f26410h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f26404b);
        map.put("instanceName", this.f26405c);
        map.put("rewarded", Boolean.toString(this.f26403a));
        map.put("inAppBidding", Boolean.toString(this.f26406d));
        map.put("isOneFlow", Boolean.toString(this.f26411i));
        map.put(X3.f27659s, String.valueOf(2));
        C0317e8 c0317e8 = this.f26407e;
        map.put("width", c0317e8 != null ? Integer.toString(c0317e8.c()) : "0");
        C0317e8 c0317e9 = this.f26407e;
        map.put("height", c0317e9 != null ? Integer.toString(c0317e9.a()) : "0");
        C0317e8 c0317e10 = this.f26407e;
        map.put("label", c0317e10 != null ? c0317e10.b() : "");
        map.put(X3.f27663w, Boolean.toString(i()));
        if (this.f26412j) {
            map.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        String str = this.f26410h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f26408f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Hc b() {
        return this.f26409g;
    }

    public String c() {
        return this.f26410h;
    }

    public Map<String, String> d() {
        return this.f26408f;
    }

    public String e() {
        return this.f26404b;
    }

    public String f() {
        return this.f26405c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f26405c;
    }

    public C0317e8 h() {
        return this.f26407e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f26406d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f26412j;
    }

    public boolean m() {
        return this.f26411i;
    }

    public boolean n() {
        return this.f26403a;
    }

    public void a(Hc hc2) {
        this.f26409g = hc2;
    }

    public void a(String str) {
        this.f26410h = str;
    }
}
