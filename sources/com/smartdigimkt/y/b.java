package com.smartdigimkt.y;

import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f39977A = 880027;
    private static final String A0 = "view container is null";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f39978B = 880028;
    private static final String B0 = "AD parameter setting error";
    public static final int C = 880029;
    private static final String C0 = "cb is open";
    public static final int D = 880030;
    private static final String D0 = "db restore failed";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f39979E = 880031;
    private static final String E0 = "network no connection error";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f39980F = 880032;
    private static final SparseArray<String> F0;
    public static final int G = 880033;
    public static final int H = 880034;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f39981I = 880035;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f39982J = 880036;
    public static final int K = 880037;
    public static final int L = 880038;
    public static final int M = 880039;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f39983N = 880040;
    public static final int O = 880041;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f39984P = "v3 params invalid";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f39985Q = "v3 request error";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final String f39986R = "v3 time out";
    private static final String S = "v3 response error";
    private static final String T = "video download error";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f39987U = "big template download error";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f39988V = "template download error";
    private static final String W = "endcard template download error";
    private static final String X = "image download error";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f39989Y = "big template render error";
    private static final String Z = "template render error";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39990a = 880000;
    private static final String a0 = "isready false error";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39991b = 880001;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f39992b0 = "load time out error";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39993c = 880002;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f39994c0 = "no fill";
    public static final int d = 880003;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f39995d0 = "render half img fail";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39996e = 880004;
    private static final String e0 = "write marid fail";
    public static final int f = 880005;
    private static final String f0 = "download js file fail";
    public static final int g = 880006;
    private static final String g0 = "current unit is loading";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39997h = 880007;
    private static final String h0 = "app already install";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39998i = 880008;
    private static final String i0 = "adn no offer fill";
    public static final int j = 880009;
    private static final String j0 = "local return empty";
    public static final int k = 880010;
    private static final String k0 = "ad over cap";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39999l = 880012;
    private static final String l0 = "load exception";
    public static final int m = 880013;
    private static final String m0 = "unknown error";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f40000n = 880014;
    private static final String n0 = "exception when request";
    public static final int o = 880015;
    private static final String o0 = "context is null";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f40001p = 880016;
    private static final String p0 = "auto refresh fail because unitId status is pause or stop";
    public static final int q = 880017;
    private static final String q0 = "download resource fail";
    public static final int r = 880018;
    private static final String r0 = "has exception happen : ";
    public static final int s = 880019;
    private static final String s0 = "view width or height is 0 or view size is too small";
    public static final int t = 880020;
    private static final String t0 = "AD display requires webView but current environment not included";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f40002u = 880021;
    private static final String u0 = "view is null";
    public static final int v = 880022;
    private static final String v0 = "webView was destroyed";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f40003w = 880023;
    private static final String w0 = "unitId is null";
    public static final int x = 880024;
    private static final String x0 = "campaign is filtered";
    public static final int y = 880025;
    private static final String y0 = "render dynamic view fail";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f40004z = 880026;
    private static final String z0 = "bid token is null";

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        F0 = sparseArray;
        sparseArray.put(v, n0);
        sparseArray.put(f39991b, f39984P);
        sparseArray.put(f39993c, f39985Q);
        sparseArray.put(d, S);
        sparseArray.put(f39996e, T);
        sparseArray.put(f, f39987U);
        sparseArray.put(g, f39988V);
        sparseArray.put(f39997h, W);
        sparseArray.put(M, X);
        sparseArray.put(f39998i, f39989Y);
        sparseArray.put(j, Z);
        sparseArray.put(k, f39992b0);
        sparseArray.put(f39999l, f39995d0);
        sparseArray.put(m, e0);
        sparseArray.put(f40000n, f0);
        sparseArray.put(o, a0);
        sparseArray.put(f40001p, g0);
        sparseArray.put(q, i0);
        sparseArray.put(r, j0);
        sparseArray.put(f40002u, h0);
        sparseArray.put(s, k0);
        sparseArray.put(t, l0);
        sparseArray.put(f40003w, f39986R);
        sparseArray.put(x, m0);
        sparseArray.put(y, "context is null");
        sparseArray.put(f40004z, p0);
        sparseArray.put(f39977A, q0);
        sparseArray.put(f39990a, r0);
        sparseArray.put(f39978B, s0);
        sparseArray.put(C, t0);
        sparseArray.put(D, u0);
        sparseArray.put(f39979E, v0);
        sparseArray.put(f39980F, w0);
        sparseArray.put(G, x0);
        sparseArray.put(H, y0);
        sparseArray.put(f39981I, z0);
        sparseArray.put(f39982J, A0);
        sparseArray.put(K, B0);
        sparseArray.put(L, C0);
        sparseArray.put(f39983N, D0);
        sparseArray.put(O, E0);
    }

    private b() {
    }

    public static String a(int i2) {
        String str = F0.get(i2);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static int b(int i2) {
        if (i2 == 880023) {
            return 2;
        }
        if (i2 == 880035) {
            return 0;
        }
        if (i2 == 880038) {
            return 21;
        }
        switch (i2) {
            case f39991b /* 880001 */:
                return 0;
            case f39993c /* 880002 */:
                return 1;
            case d /* 880003 */:
                return 3;
            case f39996e /* 880004 */:
                return 4;
            case f /* 880005 */:
                return 5;
            case g /* 880006 */:
                return 6;
            case f39997h /* 880007 */:
                return 7;
            case f39998i /* 880008 */:
                return 8;
            case j /* 880009 */:
                return 9;
            case k /* 880010 */:
                return 10;
            default:
                switch (i2) {
                    case f39999l /* 880012 */:
                        return 12;
                    case m /* 880013 */:
                        return 13;
                    case f40000n /* 880014 */:
                        return 14;
                    case o /* 880015 */:
                        return 15;
                    case f40001p /* 880016 */:
                        return 16;
                    case q /* 880017 */:
                        return 17;
                    case r /* 880018 */:
                        return 18;
                    case s /* 880019 */:
                        return 19;
                    case t /* 880020 */:
                        return 20;
                    case f40002u /* 880021 */:
                        return 11;
                    default:
                        return x;
                }
        }
    }

    public static String b(int i2, String str) {
        return i2 + "#" + F0.get(i2) + "#" + str;
    }

    public static c a(int i2, String str) {
        return new c(i2, str);
    }

    public static c a(int i2, int i3, String str) {
        return new c(i2, i3, str);
    }
}
