package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7341g;

    public a0(String str, int i10) {
        this.f7339e = str;
        this.f7340f = i10;
        String[] strArrSplit = str.split(",");
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f7341g = z10;
        if (z10) {
            this.f7335a = a(strArrSplit[0]);
            this.f7336b = a(strArrSplit[1]);
            this.f7337c = a(strArrSplit[2]);
            this.f7338d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f7335a = "";
        this.f7336b = "";
        this.f7337c = "";
        this.f7338d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof a0;
    }

    public String b() {
        return this.f7335a;
    }

    public String c() {
        return this.f7336b;
    }

    public String d() {
        return this.f7339e;
    }

    public String e() {
        return this.f7337c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f7340f;
    }

    public boolean g() {
        return this.f7335a.equals("applovin.com");
    }

    public boolean h() {
        return this.f7341g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int i10 = iHashCode2 * 59;
        int iHashCode3 = strE == null ? 43 : strE.hashCode();
        String strA = a();
        return ((i10 + iHashCode3) * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.f7338d;
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f7335a) || !a0Var.c().equals(this.f7336b) || !a0Var.e().equals(this.f7337c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.f7338d);
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
