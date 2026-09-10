package com.smartdigimkt.i3;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.v0.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f35810U = "AcquireRewardPopViewParameters";
    public com.smartdigimkt.i3.a T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35823c;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35826i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f35827l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35828n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35829p;
    public List<String> q;
    public List<String> r;
    public int d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35824e = 0;
    public boolean f = true;
    public int s = -15750;
    public int t = -27861;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35830u = -1054;
    public int v = -8011;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35831w = -29952;
    public int x = 871331329;
    public int y = -1741031;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35832z = -7772596;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f35811A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f35812B = -2988288;
    public int C = -1;
    public int D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f35813E = -939524096;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f35814F = -1043;
    public int G = -17041;
    public int H = -1280767;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f35815I = 40;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f35816J = 3.0f;
    public float K = 1.5f;
    public float L = 1.8f;
    public int M = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f35817N = -7640251;
    public int O = -12898009;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f35818P = 40;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f35819Q = 3.0f;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f35820R = 1.5f;
    public float S = 1.8f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f35833a;

        public a(String str, String str2, int i2, String str3) {
            c cVar = new c();
            this.f35833a = cVar;
            cVar.f35821a = str;
            cVar.f35822b = str2;
            cVar.f35823c = i2;
            cVar.g = str3;
            a(str3);
        }

        private void a(String str) {
            Context contextK = com.smartdigimkt.m6.b.p().k();
            this.f35833a.f35825h = contextK.getString(k.a(contextK, "sdm_default_question_title_text", k.f38992h));
            this.f35833a.f35826i = contextK.getString(k.a(contextK, "sdm_question_tip_text", k.f38992h));
            this.f35833a.j = contextK.getString(k.a(contextK, "sdm_success_title_text", k.f38992h));
            this.f35833a.k = contextK.getString(k.a(contextK, "sdm_success_tip_text", k.f38992h));
            this.f35833a.f35827l = contextK.getString(k.a(contextK, "sdm_fail_title_text", k.f38992h));
            this.f35833a.m = contextK.getString(k.a(contextK, "sdm_fail_tip_text", k.f38992h));
            this.f35833a.f35828n = contextK.getString(k.a(contextK, "sdm_slide_title_text", k.f38992h));
            this.f35833a.o = contextK.getString(k.a(contextK, "sdm_slide_tip_text", k.f38992h));
            this.f35833a.f35829p = contextK.getString(k.a(contextK, "sdm_slide_success_text", k.f38992h));
            String[] stringArray = contextK.getResources().getStringArray(k.a(contextK, "sdm_random_answers", "array"));
            this.f35833a.r = Arrays.asList(stringArray);
        }

        public a b(String str) {
            this.f35833a.m = str;
            return this;
        }

        public a c(String str) {
            this.f35833a.f35827l = str;
            return this;
        }

        public a d(String str) {
            this.f35833a.f35829p = str;
            return this;
        }

        public a e(String str) {
            this.f35833a.o = str;
            return this;
        }

        public a f(String str) {
            this.f35833a.f35828n = str;
            return this;
        }

        public a g(String str) {
            this.f35833a.k = str;
            return this;
        }

        public a h(String str) {
            this.f35833a.j = str;
            return this;
        }

        public a i(String str) {
            this.f35833a.f35826i = str;
            return this;
        }

        public a j(String str) {
            this.f35833a.f35825h = str;
            return this;
        }

        public a k(int i2) {
            this.f35833a.f35818P = i2;
            return this;
        }

        public a l(int i2) {
            this.f35833a.f35824e = i2;
            return this;
        }

        public a m(int i2) {
            this.f35833a.C = i2;
            return this;
        }

        public a n(int i2) {
            this.f35833a.G = i2;
            return this;
        }

        public a o(int i2) {
            this.f35833a.f35814F = i2;
            return this;
        }

        public a p(int i2) {
            this.f35833a.H = i2;
            return this;
        }

        public a q(int i2) {
            this.f35833a.f35815I = i2;
            return this;
        }

        public a r(int i2) {
            this.f35833a.f35832z = i2;
            return this;
        }

        public a s(int i2) {
            this.f35833a.y = i2;
            return this;
        }

        public a t(int i2) {
            this.f35833a.t = i2;
            return this;
        }

        public a u(int i2) {
            this.f35833a.s = i2;
            return this;
        }

        public a v(int i2) {
            this.f35833a.v = i2;
            return this;
        }

        public a w(int i2) {
            this.f35833a.f35830u = i2;
            return this;
        }

        public a b(ArrayList<String> arrayList) {
            this.f35833a.r = arrayList;
            return this;
        }

        public a c(int i2) {
            this.f35833a.f35831w = i2;
            return this;
        }

        public a d(int i2) {
            this.f35833a.f35812B = i2;
            return this;
        }

        public a e(int i2) {
            this.f35833a.f35811A = i2;
            return this;
        }

        public a f(int i2) {
            this.f35833a.f35813E = i2;
            return this;
        }

        public a g(int i2) {
            this.f35833a.D = i2;
            return this;
        }

        public a h(int i2) {
            this.f35833a.f35817N = i2;
            return this;
        }

        public a i(int i2) {
            this.f35833a.M = i2;
            return this;
        }

        public a j(int i2) {
            this.f35833a.O = i2;
            return this;
        }

        public a b(int i2) {
            this.f35833a.x = i2;
            return this;
        }

        public a c(float f) {
            this.f35833a.f35819Q = f;
            return this;
        }

        public a d(float f) {
            this.f35833a.K = f;
            return this;
        }

        public a e(float f) {
            this.f35833a.L = f;
            return this;
        }

        public a f(float f) {
            this.f35833a.f35816J = f;
            return this;
        }

        public a b(float f) {
            this.f35833a.S = f;
            return this;
        }

        public a a(int i2) {
            this.f35833a.d = i2;
            return this;
        }

        public a a(boolean z2) {
            this.f35833a.f = z2;
            return this;
        }

        public a a(ArrayList<String> arrayList) {
            this.f35833a.q = arrayList;
            return this;
        }

        public a a(float f) {
            this.f35833a.f35820R = f;
            return this;
        }

        public a a(com.smartdigimkt.i3.a aVar) {
            this.f35833a.T = aVar;
            return this;
        }

        public c a() {
            return this.f35833a;
        }
    }

    public static a a(String str, String str2, int i2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new a(str, str2, i2, str3);
    }
}
