package com.smartdigimkt.q1;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.n8.c;
import com.smartdigimkt.v0.d;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37847e;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37849i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f37850l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f37851n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37852p;
    public String q;
    public String r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37846c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37844a = n.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37845b = n.j();
    public String f = c.y();

    public a(Context context) {
        this.f37847e = c.a(context);
        int iH = n.h(context);
        this.f37848h = String.valueOf(iH);
        this.f37849i = n.a(context, iH);
        this.j = c.w();
        this.k = com.smartdigimkt.u.a.f().b();
        this.f37850l = com.smartdigimkt.u.a.f().a();
        this.m = String.valueOf(v.g(context));
        this.f37851n = String.valueOf(v.f(context));
        this.f37852p = String.valueOf(v.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.o = d9.h.C;
        } else {
            this.o = d9.h.D;
        }
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        String strFillCDataParam = cVarB != null ? cVarB.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(strFillCDataParam)) {
            this.d = "";
            this.g = "";
        } else {
            String[] strArrSplit = strFillCDataParam.split("\\|\\|\\|");
            try {
                this.d = strArrSplit[0];
            } catch (Throwable unused) {
            }
            try {
                this.g = strArrSplit[2];
            } catch (Throwable unused2) {
            }
        }
        this.q = n.o();
        this.r = d.b();
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.h.G, this.f37844a);
            jSONObject.put("system_version", this.f37845b);
            jSONObject.put("network_type", this.f37848h);
            jSONObject.put("network_type_str", this.f37849i);
            jSONObject.put("device_ua", this.j);
            com.smartdigimkt.v6.d dVarN = c.N();
            if (dVarN != null) {
                jSONObject.put("has_wx", dVarN.d());
                jSONObject.put("integrated_wx", dVarN.c());
                jSONObject.put("opensdk_ver", dVarN.a() + "");
                jSONObject.put("wx_api_ver", dVarN.b() + "");
            }
            jSONObject.put("mnc", c.q(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("mcc", c.p(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("plantform", this.f37846c);
            jSONObject.put(com.smartdigimkt.n8.b.a("ZGV2aWNlX2ltZWk="), this.d);
            jSONObject.put("android_id", this.f37847e);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.g);
            jSONObject.put("az_aid_info", this.r);
            jSONObject.put("appkey", this.k);
            jSONObject.put(com.smartdigimkt.f3.b.f35043u, this.f37850l);
            jSONObject.put("screen_width", this.m);
            jSONObject.put("screen_height", this.f37851n);
            jSONObject.put("orientation", this.o);
            jSONObject.put("scale", this.f37852p);
            if (n.q() != 0) {
                jSONObject.put("tun", n.q());
            }
            jSONObject.put(f.j, this.q);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }
}
