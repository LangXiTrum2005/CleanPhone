package com.mbridge.msdk.splash.common;

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
    public String f35726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35732k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f35733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35737q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35724c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35722a = m0.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35723b = m0.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35725d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f35726e = String.valueOf(iS);
        this.f35727f = m0.a(context, iS);
        this.f35728g = m0.l(context);
        this.f35729h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f35730i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f35731j = String.valueOf(v0.g(context));
        this.f35732k = String.valueOf(v0.f(context));
        this.f35733m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = X3.i.C;
        } else {
            this.l = X3.i.D;
        }
        this.f35734n = m0.w();
        this.f35735o = g.e();
        this.f35736p = g.a();
        this.f35737q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(X3.i.G, this.f35722a);
                jSONObject.put("system_version", this.f35723b);
                jSONObject.put("network_type", this.f35726e);
                jSONObject.put("network_type_str", this.f35727f);
                jSONObject.put("device_ua", this.f35728g);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f35736p);
                jSONObject.put("adid_limit_dev", this.f35737q);
            }
            jSONObject.put("plantform", this.f35724c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f35725d);
                jSONObject.put("az_aid_info", this.f35735o);
            }
            jSONObject.put("appkey", this.f35729h);
            jSONObject.put("appId", this.f35730i);
            jSONObject.put("screen_width", this.f35731j);
            jSONObject.put("screen_height", this.f35732k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.f35733m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put("f", this.f35734n);
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
