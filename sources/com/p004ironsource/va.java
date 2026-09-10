package com.p004ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class va {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27474h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27475i = 1;
    public static final int j = 2;
    public static final int k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27476l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27479c;
    private Map<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27480e;
    private boolean f;
    private zj g;

    public va(zj zjVar) {
        this(zjVar.e(), zjVar.g(), zjVar.a(), zjVar.b());
        this.g = zjVar;
    }

    public void a() {
        Map<String, String> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.d = null;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f27478b);
        map.put("demandSourceName", this.f27477a);
        Map<String, String> map2 = this.d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public zj c() {
        return this.g;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.f27480e;
    }

    public String f() {
        return this.f27477a;
    }

    public Map<String, String> g() {
        return this.d;
    }

    public String h() {
        return this.f27478b;
    }

    public kp i() {
        if (this.g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f27479c;
    }

    public boolean k() {
        Map<String, String> map = this.d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.d.get("rewarded"));
    }

    public va(String str, String str2, Map<String, String> map, kp kpVar) {
        this.f27479c = -1;
        this.f27478b = str;
        this.f27477a = str2;
        this.d = map;
        this.f27480e = 0;
        this.f = false;
        this.g = null;
    }

    public void a(boolean z2) {
        this.f = z2;
    }

    public synchronized void b(int i2) {
        this.f27480e = i2;
    }

    public void c(int i2) {
        this.f27479c = i2;
    }

    public boolean a(int i2) {
        return this.f27479c == i2;
    }
}
