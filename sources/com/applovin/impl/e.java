package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7768d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f7766b;
    }

    public Map b() {
        return this.f7767c;
    }

    public String c() {
        return this.f7765a;
    }

    public boolean d() {
        return this.f7768d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f7765a + "', backupUrl='" + this.f7766b + "', headers='" + this.f7767c + "', shouldFireInWebView='" + this.f7768d + "'}";
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f7765a = str;
        this.f7766b = str2;
        this.f7767c = map;
        this.f7768d = z10;
    }
}
