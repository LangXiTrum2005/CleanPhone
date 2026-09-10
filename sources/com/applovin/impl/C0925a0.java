package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0925a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10447c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10448e;
    private final int f;
    private final boolean g;

    public C0925a0(String str, int i2) {
        this.f10448e = str;
        this.f = i2;
        String[] strArrSplit = str.split(",");
        boolean z2 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.g = z2;
        if (z2) {
            this.f10445a = a(strArrSplit[0]);
            this.f10446b = a(strArrSplit[1]);
            this.f10447c = a(strArrSplit[2]);
            this.d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f10445a = "";
        this.f10446b = "";
        this.f10447c = "";
        this.d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof C0925a0;
    }

    public String b() {
        return this.f10445a;
    }

    public String c() {
        return this.f10446b;
    }

    public String d() {
        return this.f10448e;
    }

    public String e() {
        return this.f10447c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0925a0)) {
            return false;
        }
        C0925a0 c0925a0 = (C0925a0) obj;
        if (!c0925a0.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = c0925a0.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = c0925a0.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = c0925a0.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = c0925a0.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.f10445a.equals("applovin.com");
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.d;
    }

    public boolean a(C0925a0 c0925a0) {
        if (!c0925a0.b().equals(this.f10445a) || !c0925a0.c().equals(this.f10446b) || !c0925a0.e().equals(this.f10447c)) {
            return false;
        }
        if (c0925a0.a().equals("")) {
            return true;
        }
        return c0925a0.a().equals(this.d);
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public C0925a0(String str) {
        this(str, -1);
    }
}
