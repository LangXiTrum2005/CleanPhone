package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33845a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f33846a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33847b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f33848b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33849c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f33850c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33851d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f33852d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33853e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f33854e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33855f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f33856f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33861k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f33862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f33867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f33868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f33869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f33870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f33871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f33872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f33873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f33874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f33875z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f33876a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f33855f + this.L;
    }

    private void c() {
        this.A = this.f33874y + this.f33875z;
        this.H = this.f33874y + this.G;
        i.b().f(this.f33874y);
    }

    public static d h() {
        return b.f33876a;
    }

    public void d(int i10) {
        this.f33856f0 = i10;
    }

    public void e() {
        this.Q = this.f33859i + this.P;
        this.C = this.f33859i + this.B;
        this.T = this.f33859i + this.S;
        this.J = this.f33859i + this.I;
        this.W = this.f33859i + this.V;
    }

    public void f() {
        this.R = this.f33862m + this.P;
        this.D = this.f33862m + this.B;
        this.U = this.f33862m + this.S;
        this.K = this.f33862m + this.I;
        this.X = this.f33862m + this.V;
    }

    public boolean g() {
        try {
            if (this.f33868s) {
                ArrayList<String> arrayList = this.f33873x;
                if (arrayList != null && this.f33872w <= arrayList.size() - 1) {
                    if (!a(this.f33873x.get(this.f33872w))) {
                        this.f33862m = this.f33873x.get(this.f33872w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f33870u;
                if (arrayList2 != null && this.f33871v <= arrayList2.size() - 1) {
                    this.f33859i = this.f33870u.get(this.f33871v);
                    e();
                    return true;
                }
            }
            if (this.f33867r) {
                this.f33871v = 0;
                this.f33872w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f33856f0;
    }

    public void j() {
        HashMap<String, String> mapE;
        g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
        if (gVarI != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarI.j();
            if (aVarJ != null) {
                this.l = aVarJ.f();
                this.f33865p = aVarJ.g();
                this.f33858h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarA = gVarI.A();
            if (dVarA != null) {
                this.f33861k = dVarA.d();
                this.f33864o = dVarA.e();
                this.f33855f = dVarA.c();
                b();
                a(gVarI);
            }
            this.f33868s = gVarI.t0() == 2;
            this.f33869t = gVarI.t0();
            a(!gVarI.b(2));
            if (gVarI.E() != null && gVarI.E().size() > 0 && (mapE = gVarI.E()) != null && mapE.size() > 0) {
                if (mapE.containsKey("v") && !TextUtils.isEmpty(mapE.get("v")) && a(mapE.get("v"))) {
                    this.f33853e = mapE.get("v");
                    d();
                }
                if (mapE.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapE.get(CampaignEx.JSON_KEY_HB)) && a(mapE.get(CampaignEx.JSON_KEY_HB))) {
                    this.f33874y = mapE.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapE.containsKey("lg") && !TextUtils.isEmpty(mapE.get("lg"))) {
                    String str = mapE.get("lg");
                    if (a(str)) {
                        this.f33851d = str;
                    } else {
                        this.f33860j = str;
                    }
                }
                if (mapE.containsKey("lgt") && !TextUtils.isEmpty(mapE.get("lgt"))) {
                    String str2 = mapE.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f33860j = strB;
                        }
                    } else {
                        this.f33860j = str2;
                    }
                }
            }
            String strV = gVarI.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f33859i = strV;
                e();
                this.f33870u.add(0, strV);
            }
            String strW = gVarI.w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            this.f33862m = strW;
            f();
            this.f33873x.add(0, strW);
        }
    }

    private d() {
        this.f33845a = "RequestUrlUtil";
        this.f33847b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f33849c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f33851d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f33853e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f33855f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f33857g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f33858h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f33859i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f33860j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f33861k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f33862m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f33863n = 9377;
        this.f33864o = 9377;
        this.f33865p = 9988;
        this.f33866q = 9377;
        this.f33867r = false;
        this.f33868s = false;
        this.f33869t = 1;
        this.f33870u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f33871v = 0;
        this.f33872w = 0;
        this.f33873x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f33874y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f33875z = "/bid";
        this.A = this.f33874y + this.f33875z;
        this.B = "/sdk/customid";
        this.C = this.f33859i + this.B;
        this.D = this.f33862m + this.B;
        this.E = "/image";
        this.F = this.f33853e + this.E;
        this.G = "/load";
        this.H = this.f33874y + this.G;
        this.I = "/mapping";
        this.J = this.f33859i + this.I;
        this.K = this.f33862m + this.I;
        this.L = "";
        this.M = this.f33858h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f33858h + this.N;
        this.P = "/setting";
        this.Q = this.f33859i + this.P;
        this.R = this.f33862m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f33859i + this.S;
        this.U = this.f33862m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f33859i + this.V;
        this.X = this.f33862m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f33853e + this.Y;
        this.f33846a0 = "/openapi/ad/v4";
        this.f33848b0 = this.f33853e + this.f33846a0;
        this.f33850c0 = "/openapi/ad/v5";
        this.f33852d0 = this.f33853e + this.f33850c0;
        this.f33854e0 = true;
        this.f33856f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f33853e + this.Y;
        this.f33848b0 = this.f33853e + this.f33846a0;
        this.f33852d0 = this.f33853e + this.f33850c0;
        this.F = this.f33853e + this.E;
    }

    public void c(int i10) {
        this.f33866q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f33852d0 : this.Z;
    }

    public void b(int i10) {
        this.f33863n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z10) {
        this.f33854e0 = z10;
    }

    private void a() {
        this.O = this.f33858h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarA;
        if (gVar == null || (dVarA = gVar.A()) == null || dVarA.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarA.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f33861k, h().f33864o);
        }
        return new p(new h(), h().M, 0);
    }
}
