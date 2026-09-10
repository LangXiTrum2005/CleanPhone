package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33634c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f33641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33642k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f33643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f33648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f33649s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f33652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f33653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f33654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f33655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f33656z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f33632a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33635d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33650t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f33647q = str;
        this.f33651u = i10;
        this.f33652v = str5;
        this.f33646p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f33653w = URLEncoder.encode(str2, B5.O);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f33654x = str3;
        this.C = i14;
        this.f33640i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f33633b;
    }

    public void b(String str) {
        this.f33637f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33638g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f33637f;
    }

    public String e() {
        return this.f33638g;
    }

    public String f() {
        return this.f33639h;
    }

    public String g() {
        return this.f33640i;
    }

    public String h() {
        return this.f33641j;
    }

    public String i() {
        return this.f33642k;
    }

    public void j(String str) {
        this.f33647q = str;
    }

    public String k() {
        return this.f33643m;
    }

    public void l(String str) {
        this.f33652v = str;
    }

    public void m(String str) {
        this.f33654x = str;
    }

    public String n() {
        return this.f33647q;
    }

    public void o(String str) {
        this.f33656z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f33651u;
    }

    public String r() {
        return this.f33652v;
    }

    public String s() {
        return this.f33653w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f33654x) ? "" : this.f33654x;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardReportData [key=");
        sb2.append(this.f33647q);
        sb2.append(", networkType=");
        sb2.append(this.f33651u);
        sb2.append(", isCompleteView=");
        sb2.append(this.f33646p);
        sb2.append(", watchedMillis=");
        sb2.append(this.M);
        sb2.append(", videoLength=");
        sb2.append(this.J);
        sb2.append(", offerUrl=");
        sb2.append(this.f33653w);
        sb2.append(", reason=");
        sb2.append(this.f33654x);
        sb2.append(", result=");
        sb2.append(this.C);
        sb2.append(", duration=");
        sb2.append(this.f33640i);
        sb2.append(", videoSize=");
        return defpackage.e.r(sb2, this.K, X3.j.f27836e);
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f33656z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f33633b = str;
    }

    public int b() {
        return this.f33634c;
    }

    public void d(String str) {
        this.f33639h = str;
    }

    public void e(String str) {
        this.f33640i = str;
    }

    public void f(String str) {
        this.f33641j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f33642k = URLEncoder.encode(str, B5.O);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f33645o = URLEncoder.encode(str, B5.O);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.l;
    }

    public void k(String str) {
        this.f33649s = str;
    }

    public String l() {
        return this.f33645o;
    }

    public int m() {
        return this.f33646p;
    }

    public void n(String str) {
        this.f33655y = str;
    }

    public String o() {
        return this.f33648r;
    }

    public int p() {
        return this.f33650t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, B5.O);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f33655y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, B5.O);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f33634c = i10;
    }

    public void b(int i10) {
        this.f33650t = i10;
    }

    public void c(int i10) {
        this.f33651u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f33632a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f33632a == null) {
            this.f33632a = new HashMap();
        }
        try {
            this.f33632a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f33636e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f33647q = str;
        this.f33652v = str4;
        this.f33651u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f33653w = URLEncoder.encode(str2, B5.O);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f33654x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f33647q = str;
        this.f33651u = i10;
        this.f33652v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f33653w = URLEncoder.encode(str2, B5.O);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f33640i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f33647q = "m_download_end";
        } else if (i11 == 95) {
            this.f33647q = "2000025";
        }
        int iS = m0.s(context);
        this.f33651u = iS;
        this.f33652v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f33655y = campaignEx.getRequestId();
        this.f33656z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f33653w)) {
            try {
                this.f33653w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), B5.O);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f33640i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f33647q = str;
        this.f33643m = str2;
        this.H = str3;
        this.f33648r = str4;
        this.I = str5;
        this.f33637f = str6;
        this.f33651u = i10;
        this.f33652v = str7;
    }

    public n(String str) {
        this.f33644n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f33647q = str;
        this.C = i10;
        this.f33640i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f33642k = URLEncoder.encode(str3, B5.O);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f33637f = str4;
        this.I = str5;
        this.f33654x = str6;
        this.f33641j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f33647q = str;
        this.f33637f = str2;
        this.f33655y = str3;
        this.f33656z = str4;
        this.I = str5;
        this.f33651u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f33647q = str;
        this.f33637f = str2;
        this.f33655y = str3;
        this.f33656z = str4;
        this.I = str5;
        this.f33651u = i10;
        this.f33654x = str6;
        this.f33636e = i11;
    }
}
