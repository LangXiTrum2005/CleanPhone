package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class x2 extends is {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f27654h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f27655i = "numOfAdUnits";
    private static String j = "firstCampaignCredits";
    private static String k = "totalNumberCredits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f27656l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27658c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27659e;
    private String f;
    private boolean g;

    public x2(String str) {
        boolean z2;
        super(str);
        if (a(f27654h)) {
            k(d(f27654h));
        }
        if (a(f27655i)) {
            h(d(f27655i));
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2);
        if (a(j)) {
            g(d(j));
        }
        if (a(k)) {
            j(d(k));
        }
        if (a(f27656l)) {
            i(d(f27656l));
        }
    }

    private void a(boolean z2) {
        this.g = z2;
    }

    public String b() {
        return this.f27659e;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.f27658c;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.f27657b;
    }

    public void g(String str) {
        this.f27659e = str;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.f27658c = str;
    }

    public void j(String str) {
        this.f = str;
    }

    public void k(String str) {
        this.f27657b = str;
    }

    public boolean g() {
        return this.g;
    }
}
