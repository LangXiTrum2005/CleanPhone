package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f31392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31393k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f31394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f31395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f31396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31398q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31385c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31383a = m0.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31384b = m0.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31386d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f31387e = String.valueOf(iS);
        this.f31388f = m0.a(context, iS);
        this.f31389g = m0.l(context);
        this.f31390h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f31391i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f31392j = String.valueOf(v0.g(context));
        this.f31393k = String.valueOf(v0.f(context));
        this.f31394m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = X3.i.C;
        } else {
            this.l = X3.i.D;
        }
        this.f31395n = m0.w();
        this.f31396o = g.e();
        this.f31397p = g.a();
        this.f31398q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(X3.i.G, this.f31383a);
                jSONObject.put("system_version", this.f31384b);
                jSONObject.put("network_type", this.f31387e);
                jSONObject.put("network_type_str", this.f31388f);
                jSONObject.put("device_ua", this.f31389g);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f31397p);
                jSONObject.put("adid_limit_dev", this.f31398q);
            }
            jSONObject.put("plantform", this.f31385c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f31386d);
                jSONObject.put("az_aid_info", this.f31396o);
            }
            jSONObject.put("appkey", this.f31390h);
            jSONObject.put("appId", this.f31391i);
            jSONObject.put("screen_width", this.f31392j);
            jSONObject.put("screen_height", this.f31393k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.f31394m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put("f", this.f31395n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
