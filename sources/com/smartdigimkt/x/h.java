package com.smartdigimkt.x;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f39734A = "candidate failed";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f39735B = "v3 params invalid";
    private static final String C = "v3 request error";
    private static final String D = "v3 time out";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f39736E = "v3 response error";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f39737F = "video download error";
    private static final String G = "big template download error";
    private static final String H = "template download error";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f39738I = "endcard template download error";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f39739J = "big template render error";
    private static final String K = "template render error";
    private static final String L = " isready false error";
    private static final String M = " load time out error";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f39740N = " no fill";
    private static final String O = "current unit is loading";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f39741P = "app already install";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f39742Q = "adn no offer fill";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final String f39743R = "ad over cap ";
    private static final String S = " unknown error";
    private static final String T = "load exception";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39744h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39745i = 1;
    public static final int j = 2;
    public static final int k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39746l = 4;
    public static final int m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f39747n = 6;
    public static final int o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f39748p = 8;
    public static final int q = 9;
    public static final int r = 10;
    public static final int s = 11;
    public static final int t = 15;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f39749u = 16;
    public static final int v = 18;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f39750w = 17;
    public static final int x = 19;
    public static final int y = 20;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f39751z = 21;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39754c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f39755e;
    private String f;
    private int g = -1;

    public h(int i2, String str, Map<String, String> map) {
        this.f39753b = i2;
        this.f39754c = str;
        this.f39755e = map;
        g();
    }

    private void g() {
        try {
            switch (this.f39753b) {
                case 0:
                    this.f39752a = f39735B;
                    break;
                case 1:
                    this.f39752a = C;
                    break;
                case 2:
                    this.f39752a = D;
                    break;
                case 3:
                    this.f39752a = f39736E;
                    break;
                case 4:
                    this.f39752a = f39737F;
                    break;
                case 5:
                    this.f39752a = G;
                    break;
                case 6:
                    this.f39752a = H;
                    break;
                case 7:
                    this.f39752a = f39738I;
                    break;
                case 8:
                    this.f39752a = f39739J;
                    break;
                case 9:
                    this.f39752a = K;
                    break;
                case 10:
                    this.f39752a = M;
                    break;
                case 11:
                    this.f39752a = f39740N;
                    break;
                case 12:
                case 13:
                case 14:
                default:
                    break;
                case 15:
                    this.f39752a = L;
                    break;
                case 16:
                    this.f39752a = O;
                    break;
                case 17:
                    this.f39752a = f39742Q;
                    break;
                case 18:
                    this.f39752a = f39741P;
                    break;
                case 19:
                    this.f39752a = f39743R;
                    break;
                case 20:
                    this.f39752a = T;
                    break;
                case 21:
                    this.f39752a = f39734A;
                    break;
            }
        } catch (Exception unused) {
            this.f39752a = S;
        }
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public void c(int i2) {
        this.f39753b = i2;
    }

    public Map<String, String> d() {
        return this.f39755e;
    }

    public int e() {
        return this.f39753b;
    }

    public String f() {
        return this.f39754c;
    }

    public void a(String str) {
        this.f = str;
    }

    public void b(String str) {
        this.f39754c = str;
    }

    public int c() {
        return this.d;
    }

    public void a(int i2) {
        this.g = i2;
    }

    public void b(int i2) {
        this.d = i2;
    }

    public h(int i2, String str, boolean z2) {
        this.f39753b = 0;
        if (z2) {
            if (i2 == 200) {
                this.f39753b = 4;
            } else if (i2 == 201) {
                this.f39753b = 7;
            } else if (i2 == 203) {
                this.f39753b = 6;
            } else if (i2 == 205) {
                this.f39753b = 5;
            }
        }
        this.f39754c = str;
        g();
    }

    public h(int i2, String str) {
        this.f39753b = i2;
        this.f39754c = str;
        g();
    }
}
