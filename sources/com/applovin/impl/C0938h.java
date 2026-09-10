package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0938h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10891c;
    private final int d;

    public C0938h(int i2, int i3, int i4, int i5) {
        this.f10889a = i2;
        this.f10890b = i3;
        this.f10891c = i4;
        this.d = i5;
    }

    public boolean a(Object obj) {
        return obj instanceof C0938h;
    }

    public int b() {
        return this.f10891c;
    }

    public int c() {
        return this.f10890b;
    }

    public int d() {
        return this.f10889a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f10889a));
        map.put("air_num", Integer.valueOf(this.f10890b));
        map.put("fsr_num", Integer.valueOf(this.f10891c));
        map.put("fir_num", Integer.valueOf(this.d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0938h)) {
            return false;
        }
        C0938h c0938h = (C0938h) obj;
        return c0938h.a(this) && d() == c0938h.d() && c() == c0938h.c() && b() == c0938h.b() && a() == c0938h.a();
    }

    public int hashCode() {
        return a() + ((b() + ((c() + ((d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.d;
    }
}
