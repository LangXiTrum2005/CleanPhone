package com.smartdigimkt.c;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final String f34001u = "BaseDeviceInfo";
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34005e;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34007i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f34008l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f34009n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34010p;
    public String q;
    public String r;
    public int s;
    public int t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34004c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34002a = n.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34003b = n.j();
    public String f = com.smartdigimkt.n8.c.y();

    public b(Context context) {
        this.f34005e = com.smartdigimkt.n8.c.a(context);
        int iH = n.h(context);
        this.f34006h = String.valueOf(iH);
        this.f34007i = n.a(context, iH);
        this.j = com.smartdigimkt.n8.c.w();
        this.k = com.smartdigimkt.u.a.f().b();
        this.f34008l = com.smartdigimkt.u.a.f().a();
        this.m = String.valueOf(v.g(context));
        this.f34009n = String.valueOf(v.f(context));
        this.f34010p = String.valueOf(v.d(context));
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
        this.r = com.smartdigimkt.v0.d.b();
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.h.G, this.f34002a);
            jSONObject.put("system_version", this.f34003b);
            jSONObject.put("network_type", this.f34006h);
            jSONObject.put("network_type_str", this.f34007i);
            jSONObject.put("device_ua", this.j);
            com.smartdigimkt.v6.d dVarN = com.smartdigimkt.n8.c.N();
            if (dVarN != null) {
                jSONObject.put("has_wx", dVarN.d());
                jSONObject.put("integrated_wx", dVarN.c());
                jSONObject.put("opensdk_ver", dVarN.a() + "");
                jSONObject.put("wx_api_ver", dVarN.b() + "");
            }
            jSONObject.put("mnc", com.smartdigimkt.n8.c.q(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("mcc", com.smartdigimkt.n8.c.p(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("plantform", this.f34004c);
            jSONObject.put(com.smartdigimkt.n8.b.a("ZGV2aWNlX2ltZWk="), this.d);
            jSONObject.put("android_id", this.f34005e);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.g);
            jSONObject.put("appkey", this.k);
            jSONObject.put(com.smartdigimkt.f3.b.f35043u, this.f34008l);
            jSONObject.put("screen_width", this.m);
            jSONObject.put("screen_height", this.f34009n);
            jSONObject.put("orientation", this.o);
            jSONObject.put("scale", this.f34010p);
            if (n.q() != 0) {
                jSONObject.put("tun", n.q());
            }
            jSONObject.put(f.j, this.q);
            if (!com.smartdigimkt.m6.b.p().y()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }
}
