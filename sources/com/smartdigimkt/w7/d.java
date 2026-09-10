package com.smartdigimkt.w7;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f39641a = android.support.v4.media.a.r(new StringBuilder("https://"), b(), "/sdk/app_strategy");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f39642b = android.support.v4.media.a.r(new StringBuilder("https://"), b(), "/sdk/pl_strategy");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f39643c = android.support.v4.media.a.r(new StringBuilder("https://"), c(), "/request");
        public static final String d = android.support.v4.media.a.r(new StringBuilder("https://"), c(), "/bid");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f39644e = android.support.v4.media.a.r(new StringBuilder("https://"), a(), "/v1");
        public static final String f = android.support.v4.media.a.r(new StringBuilder("https://"), e(), "/v2/open/a_tk");
        public static final String g = android.support.v4.media.a.r(new StringBuilder("https://"), d(), "/v1/open/da");

        private a() {
        }

        public static String a() {
            return "adx-tk-sg.hookspf.com";
        }

        public static String b() {
            return "adx-strategy-api.hookspf.com";
        }

        public static String c() {
            return "adx.hookspf.com";
        }

        public static String d() {
            return "da.hookspf.com";
        }

        public static String e() {
            return "tk.hookspf.com";
        }
    }

    private static String a(String str) {
        return a(str, i());
    }

    public static String b() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        String strC = "";
        if (aVarB != null && aVarB.K() != null) {
            strC = aVarB.K().c();
        }
        return TextUtils.isEmpty(strC) ? a.f39644e : strC;
    }

    public static String c() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        String strC = aVarB != null ? aVarB.C() : "";
        return TextUtils.isEmpty(strC) ? a.g : strC;
    }

    public static String d() {
        return a.b();
    }

    public static String e() {
        return a(a.f39641a);
    }

    public static String f() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        com.smartdigimkt.x6.a aVarK = aVarB != null ? aVarB.K() : null;
        String strA = aVarK != null ? aVarK.a() : "";
        return TextUtils.isEmpty(strA) ? a.d : strA;
    }

    public static String g() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        String strH0 = (aVarB == null || TextUtils.isEmpty(aVarB.h0())) ? "" : aVarB.h0();
        return TextUtils.isEmpty(strH0) ? a(a.f39642b) : strH0;
    }

    public static String h() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        String strB0 = aVarB != null ? aVarB.B0() : "";
        return TextUtils.isEmpty(strB0) ? a.f : strB0;
    }

    public static boolean i() {
        return com.smartdigimkt.m6.b.p().z() && com.smartdigimkt.m6.b.p().w();
    }

    private static String a(String str, boolean z2) {
        return z2 ? str.replace("https://", "http://") : str;
    }

    public static String a() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        String strB = "";
        if (aVarB != null && aVarB.K() != null) {
            strB = aVarB.K().b();
        }
        return TextUtils.isEmpty(strB) ? a.f39643c : strB;
    }
}
