package com.smartdigimkt.v0;

import android.content.Context;
import com.p004ironsource.d9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f38965A = "landscape";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f38966z = "portrait";
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38970e;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f38971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f38972i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f38973l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f38974n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f38975p;
    public String q;
    public String r;
    public String s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f38976u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f38977w;
    public String x;
    public JSONObject y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38969c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38967a = n.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38968b = n.j();
    public String f = com.smartdigimkt.n8.c.y();

    public c(Context context) {
        this.d = com.smartdigimkt.n8.c.a(context);
        int iH = n.h(context);
        this.g = String.valueOf(iH);
        this.f38971h = n.a(context, iH);
        this.f38972i = com.smartdigimkt.n8.c.w();
        this.j = com.smartdigimkt.u.a.f().b();
        this.k = com.smartdigimkt.u.a.f().a();
        this.f38973l = String.valueOf(v.g(context));
        this.m = String.valueOf(v.f(context));
        this.r = String.valueOf(v.d(context));
        this.s = com.smartdigimkt.u.a.f().h().toString();
        this.f38976u = com.smartdigimkt.n8.c.I();
        this.v = com.smartdigimkt.o6.a.b().d();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f38974n = "landscape";
        } else {
            this.f38974n = "portrait";
        }
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        String[] strArrSplit = (cVarB != null ? cVarB.fillCDataParam("at_device1|||at_device2|||at_device3") : "|||").split("\\|\\|\\|");
        if (strArrSplit != null) {
            this.f38970e = strArrSplit.length > 0 ? strArrSplit[0] : "";
            this.f38977w = strArrSplit.length > 1 ? strArrSplit[1] : "";
            this.q = strArrSplit.length > 2 ? strArrSplit[2] : "";
        }
        this.o = com.smartdigimkt.b0.a.s2;
        this.f38975p = com.smartdigimkt.b0.a.t2;
        this.t = n.o();
        this.x = d.b();
        this.y = a(context, true);
    }

    private JSONObject a(Context context, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", n.e() + "");
            jSONObject.put("dmt", n.p() + "");
            jSONObject.put("dmf", n.d());
            jSONObject.put(com.smartdigimkt.o1.b.y3, n.f());
            jSONObject.put(com.smartdigimkt.n8.b.a("aW1laQ=="), this.f38970e);
            jSONObject.put(com.smartdigimkt.n8.b.a("bWFj"), this.f38977w);
            jSONObject.put("oaid", this.q);
            jSONObject.put("android_id", this.d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.h.G, this.f38967a);
            jSONObject.put("system_version", this.f38968b);
            jSONObject.put("network_type", this.g);
            jSONObject.put("network_type_str", this.f38971h);
            jSONObject.put("device_ua", this.f38972i);
            com.smartdigimkt.v6.d dVarN = com.smartdigimkt.n8.c.N();
            if (dVarN != null) {
                jSONObject.put("has_wx", dVarN.d());
                jSONObject.put("integrated_wx", dVarN.c());
                jSONObject.put("opensdk_ver", dVarN.a() + "");
                jSONObject.put("wx_api_ver", dVarN.b() + "");
            }
            jSONObject.put("brand", this.f38976u);
            jSONObject.put("mnc", com.smartdigimkt.n8.c.q(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("mcc", com.smartdigimkt.n8.c.p(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("plantform", this.f38969c);
            jSONObject.put(com.smartdigimkt.n8.b.a("ZGV2aWNlX2ltZWk="), this.f38970e);
            jSONObject.put("android_id", this.d);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.q);
            jSONObject.put("az_aid_info", this.x);
            jSONObject.put("appkey", this.j);
            jSONObject.put(com.smartdigimkt.f3.b.f35043u, this.k);
            jSONObject.put("screen_width", this.f38973l);
            jSONObject.put("screen_height", this.m);
            jSONObject.put("orientation", this.f38974n);
            jSONObject.put("scale", this.r);
            jSONObject.put("b", this.o);
            jSONObject.put("c", this.f38975p);
            jSONObject.put("web_env", this.s);
            jSONObject.put(com.smartdigimkt.h5.f.j, this.t);
            jSONObject.put(com.smartdigimkt.w7.a.n0, this.v);
            if (n.q() != 0) {
                jSONObject.put("tun", n.q() + "");
            }
            jSONObject.put("dvi", com.smartdigimkt.r4.a.c(this.y.toString()));
            jSONObject.put(com.smartdigimkt.p0.b.g, (com.smartdigimkt.k8.a.e().b().z() == 2 && com.smartdigimkt.n8.f.b()) ? "1" : "0");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }
}
