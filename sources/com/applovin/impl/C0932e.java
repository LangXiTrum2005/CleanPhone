package com.applovin.impl;

import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0932e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10754c;
    private final boolean d;

    public C0932e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f10753b;
    }

    public Map b() {
        return this.f10754c;
    }

    public String c() {
        return this.f10752a;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdEventPostback{url='");
        sb.append(this.f10752a);
        sb.append("', backupUrl='");
        sb.append(this.f10753b);
        sb.append("', headers='");
        sb.append(this.f10754c);
        sb.append("', shouldFireInWebView='");
        return android.support.v4.media.a.t(sb, this.d, "'}");
    }

    public C0932e(String str, String str2, Map map, boolean z2) {
        this.f10752a = str;
        this.f10753b = str2;
        this.f10754c = map;
        this.d = z2;
    }
}
