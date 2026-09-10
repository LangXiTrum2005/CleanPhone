package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.jn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class od {
    public static Integer j;
    public static final String k = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f14779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f14780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONArray f14781c;
    public final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f14782e;
    public final JSONObject f;
    public final gf g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f14783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final id f14784i;

    public od(gf gfVar, x xVar, id idVar) {
        j = gfVar.e();
        this.g = gfVar;
        this.f14783h = xVar;
        this.f14784i = idVar;
        this.f14780b = new JSONObject();
        this.f14781c = new JSONArray();
        this.d = new JSONObject();
        this.f14782e = new JSONObject();
        this.f = new JSONObject();
        this.f14779a = new JSONObject();
        q();
        n();
        o();
        m();
        p();
        r();
    }

    public final JSONObject a(y8 y8Var, id idVar) {
        JSONObject jSONObject = new JSONObject();
        if (y8Var.d() != null) {
            s2.a(jSONObject, "appsetid", y8Var.d());
        }
        if (y8Var.e() != null) {
            s2.a(jSONObject, "appsetidscope", y8Var.e());
        }
        Partner partnerC = idVar.c();
        if (idVar.g() && partnerC != null) {
            s2.a(jSONObject, "omidpn", partnerC.getName());
            s2.a(jSONObject, "omidpv", partnerC.getVersion());
        }
        return jSONObject;
    }

    public final Integer b() {
        gf gfVar = this.g;
        if (gfVar != null) {
            return gfVar.f().d();
        }
        return null;
    }

    public final int c() {
        gf gfVar = this.g;
        if (gfVar == null || gfVar.f().c() == null) {
            return 0;
        }
        return this.g.f().c().intValue();
    }

    public final Collection d() {
        gf gfVar = this.g;
        return gfVar != null ? gfVar.f().i() : new ArrayList();
    }

    public final int e() {
        gf gfVar = this.g;
        if (gfVar == null || gfVar.f().e() == null) {
            return 0;
        }
        return this.g.f().e().intValue();
    }

    public final String f() {
        gf gfVar = this.g;
        if (gfVar != null) {
            return gfVar.f().a();
        }
        return null;
    }

    public final String g() {
        gf gfVar = this.g;
        if (gfVar != null) {
            return gfVar.f().b();
        }
        return null;
    }

    public JSONObject h() {
        return this.f14779a;
    }

    public final int i() {
        return this.g.g().d().c();
    }

    public final String j() {
        if (this.f14783h.a() == y.b.g) {
            za.b("INTERSTITIAL NOT COMPATIBLE WITH OPENRTB", null);
        } else if (this.f14783h.a() == y.c.g) {
            za.b("REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB", null);
        }
        return this.f14783h.a().b().toLowerCase(Locale.ROOT);
    }

    public final String k() {
        gf gfVar = this.g;
        if (gfVar != null) {
            return gfVar.f().h();
        }
        return null;
    }

    public final Integer l() {
        return Integer.valueOf(this.f14783h.a().e() ? 1 : 0);
    }

    public final void m() {
        s2.a(this.d, "id", this.g.f14024h);
        JSONObject jSONObject = this.d;
        Object obj = JSONObject.NULL;
        s2.a(jSONObject, "name", obj);
        s2.a(this.d, "bundle", this.g.f);
        s2.a(this.d, "storeurl", obj);
        JSONObject jSONObject2 = new JSONObject();
        s2.a(jSONObject2, "id", obj);
        s2.a(jSONObject2, "name", obj);
        s2.a(this.d, jn.f25434b, jSONObject2);
        s2.a(this.d, "cat", obj);
        s2.a(this.f14779a, "app", this.d);
    }

    public final void n() {
        y8 y8VarC = this.g.c();
        s2.a(this.f14780b, "devicetype", j);
        s2.a(this.f14780b, "w", Integer.valueOf(this.g.b().c()));
        s2.a(this.f14780b, com.smartdigimkt.m3.h.f36614b, Integer.valueOf(this.g.b().a()));
        s2.a(this.f14780b, "ifa", y8VarC.a());
        s2.a(this.f14780b, com.p004ironsource.ne.f26257F, k);
        s2.a(this.f14780b, "lmt", Integer.valueOf(y8VarC.f().b()));
        s2.a(this.f14780b, com.p004ironsource.dc.f24783e, Integer.valueOf(i()));
        s2.a(this.f14780b, com.p004ironsource.ne.f26256E, com.p004ironsource.d9.d);
        s2.a(this.f14780b, "geo", a());
        s2.a(this.f14780b, "ip", JSONObject.NULL);
        s2.a(this.f14780b, "language", this.g.d);
        s2.a(this.f14780b, "ua", vh.f15428b.a());
        s2.a(this.f14780b, com.p004ironsource.ne.t, this.g.k);
        s2.a(this.f14780b, "model", this.g.f14020a);
        s2.a(this.f14780b, com.p004ironsource.ne.O0, this.g.f14027n);
        s2.a(this.f14780b, "ext", a(y8VarC, this.f14784i));
        s2.a(this.f14779a, com.ironsource.d9.h.G, this.f14780b);
    }

    public final void o() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        s2.a(jSONObject, "id", obj);
        JSONObject jSONObject2 = new JSONObject();
        s2.a(jSONObject2, "w", this.f14783h.e());
        s2.a(jSONObject2, com.smartdigimkt.m3.h.f36614b, this.f14783h.b());
        s2.a(jSONObject2, "btype", obj);
        s2.a(jSONObject2, "battr", obj);
        s2.a(jSONObject2, "pos", obj);
        s2.a(jSONObject2, "topframe", obj);
        s2.a(jSONObject2, "api", obj);
        JSONObject jSONObject3 = new JSONObject();
        s2.a(jSONObject3, "placementtype", j());
        s2.a(jSONObject3, "playableonly", obj);
        s2.a(jSONObject3, "allowscustomclosebutton", obj);
        s2.a(jSONObject2, "ext", jSONObject3);
        s2.a(jSONObject, "banner", jSONObject2);
        s2.a(jSONObject, "instl", l());
        s2.a(jSONObject, "tagid", this.f14783h.d());
        s2.a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        s2.a(jSONObject, "displaymanagerver", this.g.g);
        s2.a(jSONObject, "bidfloor", obj);
        s2.a(jSONObject, "bidfloorcur", "USD");
        s2.a(jSONObject, "secure", 1);
        this.f14781c.put(jSONObject);
        s2.a(this.f14779a, "imp", this.f14781c);
    }

    public final void p() {
        Integer numB = b();
        if (numB != null) {
            s2.a(this.f14782e, "coppa", numB);
        }
        JSONObject jSONObject = new JSONObject();
        s2.a(jSONObject, "gdpr", Integer.valueOf(e()));
        s2.a(jSONObject, "gpp", g());
        s2.a(jSONObject, "gpp_sid", f());
        for (DataUseConsent dataUseConsent : d()) {
            if (!dataUseConsent.getPrivacyStandardName().equals("coppa")) {
                s2.a(jSONObject, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent());
            }
        }
        s2.a(this.f14782e, "ext", jSONObject);
        s2.a(this.f14779a, "regs", this.f14782e);
    }

    public final void q() {
        JSONObject jSONObject = this.f14779a;
        Object obj = JSONObject.NULL;
        s2.a(jSONObject, "id", obj);
        s2.a(this.f14779a, "test", obj);
        s2.a(this.f14779a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        s2.a(this.f14779a, com.smartdigimkt.o1.b.Z2, 2);
    }

    public final void r() {
        s2.a(this.f, "id", JSONObject.NULL);
        s2.a(this.f, "geo", a());
        String strK = k();
        if (strK != null) {
            s2.a(this.f, com.ironsource.d9.i.f24748b0, strK);
        }
        JSONObject jSONObject = new JSONObject();
        s2.a(jSONObject, com.ironsource.d9.i.f24748b0, Integer.valueOf(c()));
        s2.a(jSONObject, "impdepth", Integer.valueOf(this.f14783h.c()));
        s2.a(this.f, "ext", jSONObject);
        s2.a(this.f14779a, "user", this.f);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        s2.a(jSONObject, "lat", obj);
        s2.a(jSONObject, "lon", obj);
        s2.a(jSONObject, "country", this.g.f14022c);
        s2.a(jSONObject, "type", 2);
        return jSONObject;
    }
}
