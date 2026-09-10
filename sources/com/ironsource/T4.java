package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class T4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27218h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27219i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27220j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f27221k = 3;
    public static final int l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f27225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private K9 f27228g;

    public T4(String str, String str2, Map<String, String> map, Hc hc2) {
        this.f27224c = -1;
        this.f27223b = str;
        this.f27222a = str2;
        this.f27225d = map;
        this.f27226e = 0;
        this.f27227f = false;
        this.f27228g = null;
    }

    public void a(boolean z10) {
        this.f27227f = z10;
    }

    public synchronized void b(int i10) {
        this.f27226e = i10;
    }

    public K9 c() {
        return this.f27228g;
    }

    public boolean d() {
        return this.f27227f;
    }

    public int e() {
        return this.f27226e;
    }

    public String f() {
        return this.f27222a;
    }

    public Map<String, String> g() {
        return this.f27225d;
    }

    public String h() {
        return this.f27223b;
    }

    public Hc i() {
        if (this.f27228g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f27224c;
    }

    public boolean k() {
        Map<String, String> map = this.f27225d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f27225d.get("rewarded"));
    }

    public boolean a(int i10) {
        return this.f27224c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f27223b);
        map.put("demandSourceName", this.f27222a);
        Map<String, String> map2 = this.f27225d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i10) {
        this.f27224c = i10;
    }

    public void a() {
        Map<String, String> map = this.f27225d;
        if (map != null) {
            map.clear();
        }
        this.f27225d = null;
    }

    public T4(K9 k10) {
        this(k10.e(), k10.g(), k10.a(), k10.b());
        this.f27228g = k10;
    }
}
