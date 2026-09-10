package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0256b1 extends C0395ie {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f28240h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f28241i = "numOfAdUnits";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f28242j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f28243k = "totalNumberCredits";
    private static String l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28249g;

    public C0256b1(String str) {
        super(str);
        if (a(f28240h)) {
            k(d(f28240h));
        }
        if (a(f28241i)) {
            h(d(f28241i));
            a(true);
        } else {
            a(false);
        }
        if (a(f28242j)) {
            g(d(f28242j));
        }
        if (a(f28243k)) {
            j(d(f28243k));
        }
        if (a(l)) {
            i(d(l));
        }
    }

    private void a(boolean z10) {
        this.f28249g = z10;
    }

    public String b() {
        return this.f28247e;
    }

    public String c() {
        return this.f28246d;
    }

    public String d() {
        return this.f28245c;
    }

    public String e() {
        return this.f28248f;
    }

    public String f() {
        return this.f28244b;
    }

    public void g(String str) {
        this.f28247e = str;
    }

    public void h(String str) {
        this.f28246d = str;
    }

    public void i(String str) {
        this.f28245c = str;
    }

    public void j(String str) {
        this.f28248f = str;
    }

    public void k(String str) {
        this.f28244b = str;
    }

    public boolean g() {
        return this.f28249g;
    }
}
