package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8055d;

    public h(int i10, int i11, int i12, int i13) {
        this.f8052a = i10;
        this.f8053b = i11;
        this.f8054c = i12;
        this.f8055d = i13;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f8054c;
    }

    public int c() {
        return this.f8053b;
    }

    public int d() {
        return this.f8052a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f8052a));
        map.put("air_num", Integer.valueOf(this.f8053b));
        map.put("fsr_num", Integer.valueOf(this.f8054c));
        map.put("fir_num", Integer.valueOf(this.f8055d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return a() + ((b() + ((c() + ((d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f8055d;
    }
}
