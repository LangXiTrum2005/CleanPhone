package com.smartdigimkt.x;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.v0.v;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class t {
    public static final int A0 = 5;
    public static final String A1 = "8";
    public static final int B0 = 6;
    public static int B1 = 1;
    public static final int C0 = 1;
    public static int C1 = 0;
    public static final int D0 = 2;
    public static final int E0 = 3;
    public static final int F0 = 4;
    public static final String G0 = "key";
    public static final String H0 = "network_type";
    public static final String I0 = "network_str";
    public static final String J0 = "is_complete_view";
    private static final String K = "VideoReportData";
    public static final String K0 = "watched_millis";
    public static final String L = "2000020";
    public static final String L0 = "video_length";
    public static final String M = "2000021";
    public static final String M0 = "offer_url";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f39827N = "2000054";
    public static final String N0 = "reason";
    public static final String O = "2000022";
    public static final String O0 = "case";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f39828P = "2000023";
    public static final String P0 = "time";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f39829Q = "2000024";
    public static final String Q0 = "platform";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f39830R = "2000025";
    public static final String R0 = "duration";
    public static final String S = "2000030";
    public static final String S0 = "result";
    public static final String T = "2000037";
    public static final String T0 = "video_size";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f39831U = "2000039";
    public static final String U0 = "ctype";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f39832V = "2000043";
    public static final String V0 = "unit_id";
    public static final String W = "2000044";
    public static final String W0 = "cid";
    public static final String X = "2000045";
    public static final String X0 = "endscreen_type";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f39833Y = "2000060";
    public static final String Y0 = "error";
    public static final String Z = "2000059";
    public static final String Z0 = "template_url";
    public static final String a0 = "2000063";
    public static final String a1 = "template";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f39834b0 = "2000061";
    public static final String b1 = "aback";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f39835c0 = "2000062";
    public static final String c1 = "event";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f39836d0 = "2000073";
    public static final String d1 = "layout";
    public static final String e0 = "2000074";
    public static final String e1 = "type";
    public static final String f0 = "2000075";
    public static final String f1 = "endcard_url";
    public static final String g0 = "2000076";
    public static final String g1 = "video_url";
    public static final int h0 = 14;
    public static final String h1 = "template_url";
    public static final int i0 = 2;
    public static final String i1 = "rid";
    public static final int j0 = 3;
    public static final String j1 = "rid_n";
    public static final int k0 = 20;
    public static final String k1 = "image_url";
    public static final int l0 = 22;
    public static final String l1 = "ad_type";
    public static final int m0 = 21;
    public static final String m1 = "resource_type";
    public static final int n0 = 10;
    public static final String n1 = "devid";
    public static final int o0 = 11;
    public static final String o1 = "creative";
    public static final int p0 = 12;
    public static final String p1 = "mraid_type";
    public static final String q0 = "1";
    public static final String q1 = "adspace_t";
    public static final String r0 = "2";
    public static final String r1 = "1";
    public static final int s0 = 1;
    public static final String s1 = "2";
    public static final int t0 = 2;
    public static final String t1 = "1";
    public static final int u0 = 3;
    public static final String u1 = "2";
    public static final int v0 = 0;
    public static final String v1 = "3";
    public static final int w0 = 1;
    public static final String w1 = "4";
    public static final int x0 = 2;
    public static final String x1 = "5";
    public static final int y0 = 3;
    public static final String y1 = "6";
    public static final int z0 = 4;
    public static final String z1 = "7";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f39837A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f39838B;
    private String C;
    private String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f39839E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f39840F;
    private String G;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f39841I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39842J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39845c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39846e;
    private String f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39848i;
    private String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39849l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f39850n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39851p;
    private int q;
    private String r;
    private String s;
    private String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f39852u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f39853w;
    private String x;
    private String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f39854z;

    public t(String str, int i2, int i3, int i4, int i5, String str2, String str3, int i6, String str4, int i7, String str5) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39846e = i2;
        this.f = str5;
        this.g = i3;
        this.f39847h = i4;
        this.f39848i = i5;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.j = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        this.k = str3;
        this.m = i6;
        this.f39850n = str4;
        this.o = i7;
    }

    public int A() {
        return this.m;
    }

    public String B() {
        return this.f39853w;
    }

    public String C() {
        return this.x;
    }

    public int D() {
        return this.f39851p;
    }

    public String E() {
        return this.t;
    }

    public int F() {
        return this.f39848i;
    }

    public long G() {
        return this.o;
    }

    public String H() {
        return this.f39840F;
    }

    public int I() {
        return this.f39847h;
    }

    public int J() {
        return this.q;
    }

    public String a() {
        return this.H;
    }

    public void b(int i2) {
        this.f39849l = i2;
    }

    public int c() {
        return this.f39849l;
    }

    public void d(String str) {
        this.f39844b = str;
    }

    public String e() {
        return this.f39845c;
    }

    public String f() {
        return this.f39844b;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f39839E = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String h() {
        return this.D;
    }

    public String i() {
        return this.f39839E;
    }

    public void j(String str) {
        this.C = str;
    }

    public void k(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void l(int i2) {
        this.q = i2;
    }

    public void m(String str) {
        this.f39838B = str;
    }

    public String n() {
        return this.G;
    }

    public void o(String str) {
        this.j = str;
    }

    public String p() {
        return this.d;
    }

    public String q() {
        return this.f39838B;
    }

    public int r() {
        return this.f39841I;
    }

    public void s(String str) {
        this.f39854z = str;
    }

    public void t(String str) {
        this.f39843a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardReportData [key=");
        sb.append(this.d);
        sb.append(", networkType=");
        sb.append(this.f39846e);
        sb.append(", isCompleteView=");
        sb.append(this.g);
        sb.append(", watchedMillis=");
        sb.append(this.f39847h);
        sb.append(", videoLength=");
        sb.append(this.f39848i);
        sb.append(", offerUrl=");
        sb.append(this.j);
        sb.append(", reason=");
        sb.append(this.k);
        sb.append(", result=");
        sb.append(this.m);
        sb.append(", duration=");
        sb.append(this.f39850n);
        sb.append(", videoSize=");
        return android.support.v4.media.a.j(this.o, d9.i.f24752e, sb);
    }

    public void u(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f39853w = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    public void v(String str) {
        this.x = str;
    }

    public String w() {
        return this.r;
    }

    public void x(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f39840F = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String y() {
        return this.f39854z;
    }

    public String z() {
        return this.f39843a;
    }

    public void a(String str) {
        this.H = str;
    }

    public int b() {
        return this.f39842J;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f39845c = URLEncoder.encode(str);
    }

    public String d() {
        return this.f39852u;
    }

    public void e(int i2) {
        this.f39841I = i2;
    }

    public void f(String str) {
        this.D = str;
    }

    public void h(int i2) {
        this.f39851p = i2;
    }

    public void i(String str) {
        this.f39837A = str;
    }

    public int j() {
        return this.v;
    }

    public String l() {
        return this.f39837A;
    }

    public String m() {
        return this.C;
    }

    public void n(String str) {
        this.f = str;
    }

    public int o() {
        return this.g;
    }

    public void p(String str) {
        this.k = str;
    }

    public void q(String str) {
        this.r = str;
    }

    public void r(String str) {
        this.s = str;
    }

    public int s() {
        return this.f39846e;
    }

    public String t() {
        return this.f;
    }

    public String v() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public void w(String str) {
        this.t = str;
    }

    public void a(int i2) {
        this.f39842J = i2;
    }

    public void b(String str) {
        this.f39852u = str;
    }

    public void d(int i2) {
        this.g = i2;
    }

    public void e(String str) {
        this.f39850n = str;
    }

    public void f(int i2) {
        this.f39846e = i2;
    }

    public void h(String str) {
        this.y = str;
    }

    public void i(int i2) {
        this.f39848i = i2;
    }

    public void j(int i2) {
        this.o = i2;
    }

    public void l(String str) {
        this.d = str;
    }

    public static String a(List<t> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (t tVar : list) {
            stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
            stringBuffer.append("result=" + tVar.A() + d9.i.f24749c);
            stringBuffer.append("duration=" + tVar.g() + d9.i.f24749c);
            stringBuffer.append("endcard_url=" + tVar.i() + d9.i.f24749c);
            stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
            stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
            stringBuffer.append("reason=" + tVar.v() + d9.i.f24749c);
            stringBuffer.append("ad_type=" + tVar.a() + d9.i.f24749c);
            stringBuffer.append("rid=" + tVar.w() + d9.i.f24749c);
            stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
            stringBuffer.append("type=" + tVar.h() + d9.i.f24749c);
            StringBuilder sb = new StringBuilder("adspace_t=");
            sb.append(tVar.b());
            stringBuffer.append(sb.toString());
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return stringBuffer.toString();
    }

    public static String b(List<t> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().m());
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String d(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
        stringBuffer.append("result=" + tVar.A() + d9.i.f24749c);
        stringBuffer.append("duration=" + tVar.g() + d9.i.f24749c);
        stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
        stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
        stringBuffer.append("reason=" + tVar.v() + d9.i.f24749c);
        stringBuffer.append("ad_type=" + tVar.a() + d9.i.f24749c);
        stringBuffer.append("rid=" + tVar.w() + d9.i.f24749c);
        stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
        stringBuffer.append("network_type=" + tVar.s() + d9.i.f24749c);
        stringBuffer.append("mraid_type=" + tVar.r() + d9.i.f24749c);
        stringBuffer.append("devid=" + tVar.f() + d9.i.f24749c);
        if (tVar.z() != null) {
            stringBuffer.append("resource_type=" + tVar.z() + d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(tVar.i())) {
            stringBuffer.append("endcard_url=" + tVar.i() + d9.i.f24749c);
        }
        stringBuffer.append("type=" + tVar.h());
        return stringBuffer.toString();
    }

    public static String e(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
        stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
        stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
        stringBuffer.append("network_type=" + tVar.s() + d9.i.f24749c);
        stringBuffer.append("mraid_type=" + tVar.r() + d9.i.f24749c);
        stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
        StringBuilder sb = new StringBuilder("rid=");
        sb.append(tVar.w());
        stringBuffer.append(sb.toString());
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        return stringBuffer.toString();
    }

    public static String f(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
        stringBuffer.append("result=" + tVar.A() + d9.i.f24749c);
        stringBuffer.append("duration=" + tVar.g() + d9.i.f24749c);
        stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
        stringBuffer.append("reason=" + tVar.v() + d9.i.f24749c);
        stringBuffer.append("ad_type=" + tVar.a() + d9.i.f24749c);
        stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
        stringBuffer.append("devid=" + tVar.f() + d9.i.f24749c);
        stringBuffer.append("mraid_type=" + tVar.r() + d9.i.f24749c);
        stringBuffer.append("network_type=" + tVar.s() + d9.i.f24749c);
        if (!TextUtils.isEmpty(tVar.i())) {
            stringBuffer.append("endcard_url=" + tVar.i() + d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(tVar.h())) {
            stringBuffer.append("type=" + tVar.h() + d9.i.f24749c);
        }
        if (tVar.z() != null) {
            stringBuffer.append("resource_type=" + tVar.z() + d9.i.f24749c);
        }
        stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
        StringBuilder sb = new StringBuilder("rid=");
        sb.append(tVar.w());
        stringBuffer.append(sb.toString());
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        return stringBuffer.toString();
    }

    public void c(int i2) {
        this.v = i2;
    }

    public String g() {
        return this.f39850n;
    }

    public String k() {
        return this.y;
    }

    public String u() {
        return this.j;
    }

    public String x() {
        return this.s;
    }

    public static String c(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
        stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
        stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
        stringBuffer.append("network_type=" + tVar.s() + d9.i.f24749c);
        stringBuffer.append("rid=" + tVar.w() + d9.i.f24749c);
        stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
        StringBuilder sb = new StringBuilder("reason=");
        sb.append(tVar.v());
        stringBuffer.append(sb.toString());
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        return stringBuffer.toString();
    }

    public void g(int i2) {
        this.m = i2;
    }

    public void k(int i2) {
        this.f39847h = i2;
    }

    public static String g(t tVar) {
        String str;
        if (tVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
            stringBuffer.append("error=" + v.a(tVar.k()) + d9.i.f24749c);
            stringBuffer.append("template_url=" + v.a(tVar.B()) + d9.i.f24749c);
            stringBuffer.append("unit_id=" + v.a(tVar.E()) + d9.i.f24749c);
            stringBuffer.append("cid=" + v.a(tVar.d()) + d9.i.f24749c);
            String str2 = "";
            if (TextUtils.isEmpty(tVar.t())) {
                str = "";
            } else {
                str = "network_str=" + tVar.t() + d9.i.f24749c;
            }
            stringBuffer.append(str);
            if (!TextUtils.isEmpty(tVar.t())) {
                str2 = "network_type=" + tVar.s();
            }
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b(t tVar) {
        if (tVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
            stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
            stringBuffer.append("rid=" + tVar.w() + d9.i.f24749c);
            stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
            stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
            stringBuffer.append("reason=" + tVar.v() + d9.i.f24749c);
            stringBuffer.append("case=" + tVar.c() + d9.i.f24749c);
            StringBuilder sb = new StringBuilder("network_type=");
            sb.append(tVar.s());
            stringBuffer.append(sb.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public t() {
        this.q = 0;
        this.f39841I = 0;
    }

    public t(String str, int i2, int i3, String str2, int i4, int i5, String str3) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39846e = i2;
        this.f = str3;
        this.f39848i = i3;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.j = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.f39851p = i4;
        this.q = i5;
    }

    public static String a(t tVar) {
        if (tVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + tVar.p() + d9.i.f24749c);
            stringBuffer.append("cid=" + tVar.d() + d9.i.f24749c);
            stringBuffer.append("rid=" + tVar.w() + d9.i.f24749c);
            stringBuffer.append("rid_n=" + tVar.x() + d9.i.f24749c);
            stringBuffer.append("unit_id=" + tVar.E() + d9.i.f24749c);
            stringBuffer.append("network_type=" + tVar.s() + d9.i.f24749c);
            stringBuffer.append("mraid_type=" + tVar.r() + d9.i.f24749c);
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public t(String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f = str3;
        this.f39846e = i2;
        this.g = i3;
        this.f39847h = i4;
        this.f39848i = i5;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.j = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.q = i6;
    }

    public t(String str, int i2, String str2, String str3, String str4) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f = str4;
        this.f39846e = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.j = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.k = str3;
    }

    public t(String str, int i2, int i3, String str2, int i4, String str3, int i5, String str4) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39846e = i2;
        this.f = str4;
        this.f39848i = i3;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.j = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.m = i4;
        this.f39850n = str3;
        this.o = i5;
    }

    public t(Context context, d dVar, int i2, String str, long j, int i3) {
        this.q = 0;
        this.f39841I = 0;
        if (i3 == 1 || i3 == 287 || i3 == 94) {
            this.d = O;
        } else if (i3 == 95) {
            this.d = f39830R;
        }
        int iH = com.smartdigimkt.v0.n.h(context);
        this.f39846e = iH;
        this.f = com.smartdigimkt.v0.n.a(context, iH);
        this.f39848i = dVar.t();
        this.r = dVar.N1();
        this.s = dVar.O1();
        if (!TextUtils.isEmpty(this.j)) {
            try {
                this.j = URLEncoder.encode(dVar.r1() == null ? dVar.p0() : dVar.r1(), "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.m = i2;
        this.f39850n = str;
        this.o = j == 0 ? dVar.t2() : j;
    }

    public t(String str, String str2, String str3, String str4, int i2, String str5, int i3, String str6) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.r = str2;
        this.s = str3;
        this.t = str4;
        this.f39846e = i2;
        this.f = str6;
        this.f39852u = str5;
        this.v = i3;
    }

    public t(String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39837A = str2;
        this.x = str3;
        this.f39838B = str4;
        this.t = str5;
        this.f39852u = str6;
        this.f39846e = i2;
        this.f = str7;
    }

    public t(String str) {
        this.q = 0;
        this.f39841I = 0;
        this.C = str;
    }

    public t(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.m = i2;
        this.f39850n = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f39839E = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        this.f39852u = str4;
        this.t = str5;
        this.k = str6;
        this.D = str7;
        if (Integer.valueOf(str2).intValue() > com.smartdigimkt.b0.a.u2) {
            this.m = 2;
        }
    }

    public t(String str, String str2, String str3, String str4, String str5, int i2) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39852u = str2;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.f39846e = i2;
    }

    public t(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        this.q = 0;
        this.f39841I = 0;
        this.d = str;
        this.f39852u = str2;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.f39846e = i2;
        this.k = str6;
        this.f39849l = i3;
    }
}
