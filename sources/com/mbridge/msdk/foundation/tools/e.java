package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34089h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34092k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f34094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34096p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f34098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f34099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f34100t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f34102v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f34097q = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34090i = m0.u();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f34101u = m0.r();
    public String l = g.d();

    public e(Context context) {
        int iS = m0.s(context);
        this.f34094n = String.valueOf(iS);
        this.f34095o = m0.a(context, iS);
        this.f34091j = m0.l(context);
        this.f34086e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f34085d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f34100t = String.valueOf(v0.g(context));
        this.f34099s = String.valueOf(v0.f(context));
        this.f34098r = String.valueOf(v0.d(context));
        this.f34102v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f34088g = m0.t();
        this.f34093m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f34096p = X3.i.C;
        } else {
            this.f34096p = X3.i.D;
        }
        this.f34087f = com.mbridge.msdk.foundation.same.a.V;
        this.f34089h = com.mbridge.msdk.foundation.same.a.f33721g;
        this.f34092k = m0.w();
        this.f34084c = g.e();
        this.f34082a = g.a();
        this.f34083b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(X3.i.G, this.f34090i);
                jSONObject.put("system_version", this.f34101u);
                jSONObject.put("network_type", this.f34094n);
                jSONObject.put("network_type_str", this.f34095o);
                jSONObject.put("device_ua", this.f34091j);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.f34088g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f34082a);
                jSONObject.put("adid_limit_dev", this.f34083b);
            }
            jSONObject.put("plantform", this.f34097q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.l);
                jSONObject.put("az_aid_info", this.f34084c);
            }
            jSONObject.put("appkey", this.f34086e);
            jSONObject.put("appId", this.f34085d);
            jSONObject.put("screen_width", this.f34100t);
            jSONObject.put("screen_height", this.f34099s);
            jSONObject.put("orientation", this.f34096p);
            jSONObject.put("scale", this.f34098r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f34087f);
            jSONObject.put("c", this.f34089h);
            jSONObject.put("web_env", this.f34102v);
            jSONObject.put("f", this.f34092k);
            jSONObject.put("misk_spt", this.f34093m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f33881f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f34082a);
                jSONObject2.put("adid_limit_dev", this.f34083b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
