package com.smartdigimkt.z2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.x;
import com.smartdigimkt.x.t;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j extends c {
    private static final String D0 = "j";
    private static final String E0 = "camp_position";
    private Activity r0;
    private String s0;
    private String t0;
    private Context u0;
    private com.smartdigimkt.x.d v0;
    private List<com.smartdigimkt.x.d> w0;
    private int x0;
    private String y0 = "";
    private String z0 = "";
    private boolean A0 = false;
    private boolean B0 = false;
    private boolean C0 = true;

    public j(Activity activity, com.smartdigimkt.x.d dVar) {
        this.r0 = activity;
        this.v0 = dVar;
    }

    private void b(String str) {
        List<com.smartdigimkt.x.d> list;
        if (this.v0 == null || (list = this.w0) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(E0)) {
                this.v0 = this.w0.get(jSONObject.getInt(E0));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a());
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put("appSetting", new JSONObject(strD));
                return jSONObject;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private com.smartdigimkt.o.a n() {
        if (this.n0 == null) {
            this.n0 = new com.smartdigimkt.o.a(com.smartdigimkt.m6.b.p().k(), this.k0);
        }
        return this.n0;
    }

    private JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        com.smartdigimkt.v0.c cVar = new com.smartdigimkt.v0.c(com.smartdigimkt.m6.b.p().k());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.p0);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(d9.h.G, cVar.a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(com.smartdigimkt.x.d.b(this.v0));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", s());
            String strD = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a());
            if (!TextUtils.isEmpty(strD)) {
                JSONObject jSONObject3 = new JSONObject(strD);
                a(jSONObject3);
                String strB = com.smartdigimkt.n1.b.b().b(this.k0);
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject3.put("ivreward", strB);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", r());
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.h.G, new com.smartdigimkt.v0.c(com.smartdigimkt.m6.b.p().k()).a());
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject r() {
        JSONObject jSONObject = new JSONObject();
        com.smartdigimkt.f3.a aVarC = com.smartdigimkt.f3.c.b().c();
        return aVarC != null ? aVarC.j() : jSONObject;
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        com.smartdigimkt.f3.d dVar = this.l0;
        return dVar != null ? dVar.b0() : jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", com.smartdigimkt.f1.b.f34972a + ",3.0.1");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.p0);
            jSONObject2.put("instanceId", this.y0);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    private String v() {
        JSONObject jSONObject = new JSONObject();
        com.smartdigimkt.v0.c cVar = new com.smartdigimkt.v0.c(com.smartdigimkt.m6.b.p().k());
        try {
            jSONObject.put("unit_id", this.k0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.y0);
            jSONObject2.put("rootViewInstanceId", this.z0);
            jSONObject2.put("isRootTemplateWebView", this.A0);
            jSONObject.put("sdk_info", com.smartdigimkt.f1.b.f34972a + ",3.0.1");
            jSONObject2.put("playVideoMute", this.p0);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(d9.h.G, cVar.a());
            JSONArray jSONArray = new JSONArray();
            List<com.smartdigimkt.x.d> list = this.w0;
            if (list == null || list.size() <= 0) {
                jSONArray.put(com.smartdigimkt.x.d.b(this.v0));
            } else {
                for (com.smartdigimkt.x.d dVar : this.w0) {
                    jSONArray.put(com.smartdigimkt.x.d.a(dVar, dVar.L2(), a(dVar)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", s());
            String strD = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a());
            if (!TextUtils.isEmpty(strD)) {
                JSONObject jSONObject3 = new JSONObject(strD);
                a(jSONObject3);
                String strB = com.smartdigimkt.n1.b.b().b(this.k0);
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject3.put("ivreward", new JSONObject(strB));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", r());
            if (!TextUtils.isEmpty(this.k0)) {
                jSONObject.put("unit_id", this.k0);
            }
            jSONObject.put("rw_plus", this.B0 ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.k0)) {
                jSONObject.put("unit_id", this.k0);
                return jSONObject;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.smartdigimkt.f3.d dVar = this.l0;
            if (dVar != null) {
                jSONObject.put("unitSetting", dVar.b0());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void a(List<com.smartdigimkt.x.d> list) {
        this.w0 = list;
    }

    public void c(com.smartdigimkt.x.d dVar) {
        this.v0 = dVar;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.d
    public void click(int i2, String str) {
        com.smartdigimkt.k1.c cVarA;
        List<com.smartdigimkt.x.d> list;
        int iQ;
        super.click(i2, str);
        com.smartdigimkt.x.d dVar = this.v0;
        if (dVar != null && dVar.t0() == 5) {
            b(str);
        }
        try {
            if (i2 == 1) {
                if (this.v0 == null && (list = this.w0) != null && list.size() > 0) {
                    this.v0 = this.w0.get(0);
                }
                com.smartdigimkt.x.d dVar2 = this.v0;
                if (dVar2 == null) {
                    return;
                }
                com.smartdigimkt.x.d dVarA = a(str, dVar2);
                if (dVarA != null && (cVarA = com.smartdigimkt.k1.a.a().a(dVarA)) != null) {
                    cVarA.b(true);
                    com.smartdigimkt.k1.a.a().a(cVarA, dVarA);
                }
                b(dVarA);
                return;
            }
            if (i2 != 3) {
                return;
            }
            com.smartdigimkt.x.d dVar3 = this.v0;
            if (dVar3 == null || dVar3.l0() <= -2) {
                com.smartdigimkt.f3.d dVar4 = this.l0;
                if (dVar4 != null) {
                    iQ = dVar4.q();
                }
                click(1, str);
            }
            iQ = this.v0.l0();
            if (iQ == -1) {
                a(new c.b(this, this.o0));
            }
            click(1, str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void d(boolean z2) {
        this.C0 = z2;
    }

    public void e(boolean z2) {
        this.B0 = z2;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public String f(int i2) {
        switch (i2) {
            case 1:
                return t().toString();
            case 2:
                return w().toString();
            case 3:
                return m().toString();
            case 4:
                return x().toString();
            case 5:
                return p().toString();
            case 6:
                return u().toString();
            default:
                return o().toString();
        }
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public String g() {
        return this.t0;
    }

    public void h(int i2) {
        this.x0 = i2;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.d
    public void handlerH5Exception(int i2, String str) {
        super.handlerH5Exception(i2, str);
        try {
            this.o0.a(i2, str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void l() {
        this.s0 = "";
    }

    public int q() {
        return this.x0;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void setActivity(Activity activity) {
        this.r0 = activity;
    }

    public boolean y() {
        return this.C0;
    }

    public boolean z() {
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            String string = x.b(contextD, "Anythink_ConfirmTitle" + this.k0, "").toString();
            String string2 = x.b(contextD, "Anythink_ConfirmContent" + this.k0, "").toString();
            String string3 = x.b(contextD, "Anythink_CancelText" + this.k0, "").toString();
            String string4 = x.b(contextD, "Anythink_ConfirmText" + this.k0, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(com.smartdigimkt.o1.b.u2, string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put(com.smartdigimkt.o1.b.v2, string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put(com.smartdigimkt.o1.b.w2, string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put(com.smartdigimkt.o1.b.y2, string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put(com.smartdigimkt.o1.b.x2, string4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c(boolean z2) {
        this.A0 = z2;
    }

    public void d(String str) {
        this.z0 = str;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void h() {
        super.h();
        com.smartdigimkt.x2.c.a aVar = this.o0;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c(String str) {
        this.y0 = str;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public String d() {
        this.o0.a();
        this.X = true;
        if (TextUtils.isEmpty(this.s0)) {
            this.s0 = v();
        } else {
            this.s0 = v.b(this.s0, "tun", com.smartdigimkt.v0.n.q() + "");
        }
        return this.s0;
    }

    public j(Activity activity, com.smartdigimkt.x.d dVar, List<com.smartdigimkt.x.d> list) {
        this.r0 = activity;
        this.v0 = dVar;
        this.w0 = list;
    }

    private void b(com.smartdigimkt.x.d dVar) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(dVar.r1()).getQueryParameter(com.smartdigimkt.b0.a.j2);
        } catch (Throwable unused) {
        }
        this.o0.a(dVar, (!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        n().a(this.o0);
        n().a(dVar);
    }

    private com.smartdigimkt.x.d a(String str, com.smartdigimkt.x.d dVar) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        if (TextUtils.isEmpty(str) && dVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectB = com.smartdigimkt.x.d.b(dVar);
                com.smartdigimkt.x.d dVarB = com.smartdigimkt.x.d.b(jSONObjectB);
                if (dVarB == null) {
                    dVarB = dVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(jSONObjectB, dVarB);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.smartdigimkt.b0.a.i2);
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf = String.valueOf(v.a(this.r0, Integer.valueOf(jSONObjectOptJSONObject.getString(com.smartdigimkt.b0.a.g2)).intValue()));
                        strValueOf2 = String.valueOf(v.a(this.r0, Integer.valueOf(jSONObjectOptJSONObject.getString(com.smartdigimkt.b0.a.h2)).intValue()));
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = "-999";
                    }
                    dVarB.H(com.smartdigimkt.o.b.a(dVarB.p0(), strValueOf, strValueOf2));
                    String strR1 = dVarB.r1();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb.append(d9.i.f24749c);
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next);
                            if (com.smartdigimkt.b0.a.g2.equals(next) || com.smartdigimkt.b0.a.h2.equals(next)) {
                                strOptString = String.valueOf(v.a(this.r0, Integer.valueOf(strOptString).intValue()));
                            }
                            sb.append(next);
                            sb.append(d9.i.f24747b);
                            sb.append(strOptString);
                        }
                        dVarB.g0(strR1 + ((Object) sb));
                    }
                }
                return dVarB;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return dVar;
            } catch (Throwable th) {
                th.printStackTrace();
                return dVar;
            }
        }
        try {
            JSONObject jSONObjectB2 = com.smartdigimkt.x.d.b(dVar);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.opt(com.smartdigimkt.x.j.a0) == null) {
                jSONObject.put(com.smartdigimkt.x.j.a0, "");
            }
            try {
                if (!jSONObject.has("deep_link")) {
                    jSONObjectB2.put("deep_link", "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectB2.put(next2, jSONObject.getString(next2));
            }
            com.smartdigimkt.x.d dVarB2 = com.smartdigimkt.x.d.b(jSONObjectB2);
            a(jSONObjectB2, dVarB2);
            return dVarB2;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return dVar;
        }
    }

    public void a(JSONObject jSONObject, com.smartdigimkt.x.d dVar) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            dVar.G(strOptString);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void a(int i2, String str) {
        super.a(i2, str);
        if (i2 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("event", "event");
            String strOptString2 = jSONObject.optString("template", x4.DISABLED_AUCTION_FALLBACK_ID);
            String strOptString3 = jSONObject.optString("layout", x4.DISABLED_AUCTION_FALLBACK_ID);
            String strOptString4 = jSONObject.optString("unit_id", this.k0);
            int iH = com.smartdigimkt.v0.n.h(this.r0.getApplication());
            new t(t.f39831U, strOptString, strOptString2, strOptString3, strOptString4, this.v0.j(), iH, com.smartdigimkt.v0.n.a(this.r0.getApplication(), iH));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void a() {
        super.a();
        try {
            Activity activity = this.r0;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean a(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.n1.a aVarC;
        try {
            String strA = com.smartdigimkt.u.a.f().a();
            long jG0 = (TextUtils.isEmpty(strA) || (aVarC = com.smartdigimkt.n1.b.b().c(strA)) == null) ? 0L : aVarC.G0() * 1000;
            com.smartdigimkt.f3.a aVarC2 = com.smartdigimkt.f3.c.b().c();
            long jF = aVarC2 != null ? aVarC2.f() : 0L;
            if (dVar != null) {
                return dVar.a(jF, jG0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void a(Context context) {
        this.u0 = context;
    }

    @Override // com.smartdigimkt.z2.c, com.smartdigimkt.x2.c
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.t0 = str;
    }
}
