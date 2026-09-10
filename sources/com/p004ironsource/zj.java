package com.p004ironsource;

import com.p004ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27923c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bh f27924e;
    private Map<String, String> f;
    private kp g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f27925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27926i;
    private boolean j;

    public zj(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, String str3, Map<String, String> map, kp kpVar, bh bhVar) {
        this.f27922b = str;
        this.f27923c = str2;
        this.f27921a = z2;
        this.d = z3;
        this.f = map;
        this.g = kpVar;
        this.f27924e = bhVar;
        this.f27926i = z4;
        this.j = z5;
        this.f27925h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f27922b);
        map.put("instanceName", this.f27923c);
        map.put("rewarded", Boolean.toString(this.f27921a));
        map.put("inAppBidding", Boolean.toString(this.d));
        map.put("isOneFlow", Boolean.toString(this.f27926i));
        map.put(d9.r, String.valueOf(2));
        bh bhVar = this.f27924e;
        map.put("width", bhVar != null ? Integer.toString(bhVar.c()) : "0");
        bh bhVar2 = this.f27924e;
        map.put("height", bhVar2 != null ? Integer.toString(bhVar2.a()) : "0");
        bh bhVar3 = this.f27924e;
        map.put("label", bhVar3 != null ? bhVar3.b() : "");
        map.put(d9.v, Boolean.toString(i()));
        if (this.j) {
            map.put("isMultipleAdObjects", a.g);
        }
        String str = this.f27925h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final kp b() {
        return this.g;
    }

    public String c() {
        return this.f27925h;
    }

    public Map<String, String> d() {
        return this.f;
    }

    public String e() {
        return this.f27922b;
    }

    public String f() {
        return this.f27923c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f27923c;
    }

    public bh h() {
        return this.f27924e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.f27926i;
    }

    public boolean n() {
        return this.f27921a;
    }

    public void a(kp kpVar) {
        this.g = kpVar;
    }

    public void a(String str) {
        this.f27925h = str;
    }
}
