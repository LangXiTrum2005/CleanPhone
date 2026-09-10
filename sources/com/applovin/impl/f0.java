package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7817d;

    public f0(String str, Map map, Map map2, String str2) {
        this.f7814a = str;
        this.f7815b = map;
        this.f7816c = map2;
        this.f7817d = str2;
    }

    public boolean a(Object obj) {
        return obj instanceof f0;
    }

    public String b() {
        return this.f7814a;
    }

    public Map c() {
        return this.f7816c;
    }

    public Map d() {
        return this.f7815b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!f0Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = f0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = f0Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = f0Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = f0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        Map mapD = d();
        int iHashCode2 = ((iHashCode + 59) * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int i10 = iHashCode2 * 59;
        int iHashCode3 = mapC == null ? 43 : mapC.hashCode();
        String strA = a();
        return ((i10 + iHashCode3) * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AxonEventModel(eventName=" + b() + ", parameters=" + d() + ", options=" + c() + ", errorMessage=" + a() + ")";
    }

    public String a() {
        return this.f7817d;
    }
}
