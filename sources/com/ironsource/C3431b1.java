package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3431b1 extends Vd {
    private static String h = "type";
    private static String i = "numOfAdUnits";
    private static String j = "firstCampaignCredits";
    private static String k = "totalNumberCredits";
    private static String l = "productType";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;

    public C3431b1(String str) {
        super(str);
        if (a(h)) {
            k(d(h));
        }
        if (a(i)) {
            h(d(i));
            a(true);
        } else {
            a(false);
        }
        if (a(j)) {
            g(d(j));
        }
        if (a(k)) {
            j(d(k));
        }
        if (a(l)) {
            i(d(l));
        }
    }

    private void a(boolean z) {
        this.g = z;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.b;
    }

    public void g(String str) {
        this.e = str;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.c = str;
    }

    public void j(String str) {
        this.f = str;
    }

    public void k(String str) {
        this.b = str;
    }

    public boolean g() {
        return this.g;
    }
}
