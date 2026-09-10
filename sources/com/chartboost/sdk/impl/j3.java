package com.chartboost.sdk.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends b3 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final JSONObject f14226u;
    public final JSONObject v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final JSONObject f14227w;
    public final JSONObject x;
    public final JSONObject y;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14228a;

        static {
            int[] iArr = new int[kh.values().length];
            try {
                iArr[kh.TRACKING_LIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kh.TRACKING_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14228a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(v2.c method, String host, String path, gf requestBodyFields, ae priority, String str, b3.a aVar, y6 eventTracker, uf session) {
        super(method, host, path, requestBodyFields, priority, str, aVar, eventTracker, session);
        Intrinsics.f(method, "method");
        Intrinsics.f(host, "host");
        Intrinsics.f(path, "path");
        Intrinsics.f(requestBodyFields, "requestBodyFields");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(session, "session");
        this.f14226u = new JSONObject();
        this.v = new JSONObject();
        this.f14227w = new JSONObject();
        this.x = new JSONObject();
        this.y = new JSONObject();
    }

    public final void a(ce ceVar) {
        String strH = ceVar.h();
        if (strH != null) {
            s2.a(this.f14227w, com.ironsource.d9.i.f24748b0, strH);
        }
        s2.a(this.f14227w, "pidatauseconsent", ceVar.f());
        JSONObject jSONObjectG = ceVar.g();
        if (jSONObjectG != null) {
            try {
                jSONObjectG.put("gpp", ceVar.b());
                jSONObjectG.put("gpp_sid", ceVar.a());
            } catch (JSONException e2) {
                za.b("Failed to add GPP and/or GPP SID to request body", e2);
            }
            s2.a(this.f14227w, "privacy", jSONObjectG);
        }
    }

    public final void b(String key, Object obj) {
        Intrinsics.f(key, "key");
        s2.a(this.x, key, obj);
        a("ad", this.x);
    }

    public final void c(String key, Object obj) {
        Intrinsics.f(key, "key");
        s2.a(this.f14226u, key, obj);
        a("sdk", this.f14226u);
    }

    @Override // com.chartboost.sdk.impl.b3
    public void f() {
        m();
        n();
        o();
        q();
        l();
    }

    public final void l() {
        JSONObject jSONObject = this.x;
        gf gfVarJ = j();
        s2.a(jSONObject, "session", gfVarJ != null ? Integer.valueOf(gfVarJ.i()) : null);
        if (this.x.isNull(com.smartdigimkt.q0.b.O)) {
            s2.a(this.x, com.smartdigimkt.q0.b.O, Boolean.FALSE);
        }
        if (this.x.isNull("amount")) {
            s2.a(this.x, "amount", 0);
        }
        if (this.x.isNull("retry_count")) {
            s2.a(this.x, "retry_count", 0);
        }
        if (this.x.isNull("location")) {
            s2.a(this.x, "location", "");
        }
        a("ad", this.x);
    }

    public final void m() {
        JSONObject jSONObject = this.v;
        gf gfVarJ = j();
        s2.a(jSONObject, "app", gfVarJ != null ? gfVarJ.f14024h : null);
        JSONObject jSONObject2 = this.v;
        gf gfVarJ2 = j();
        s2.a(jSONObject2, "bundle", gfVarJ2 != null ? gfVarJ2.f14023e : null);
        JSONObject jSONObject3 = this.v;
        gf gfVarJ3 = j();
        s2.a(jSONObject3, "bundle_id", gfVarJ3 != null ? gfVarJ3.f : null);
        s2.a(this.v, "session_id", "");
        s2.a(this.v, "ui", -1);
        s2.a(this.v, "test_mode", Boolean.FALSE);
        a("app", this.v);
    }

    public final void n() {
        s2.a(this.y, "app", s2.a(s2.a("ver", t6.f15176a.b())));
        a("bidrequest", this.y);
    }

    public final void o() {
        x5 x5VarB;
        x5 x5VarB2;
        x5 x5VarB3;
        x5 x5VarB4;
        x5 x5VarB5;
        oe oeVarG;
        zc zcVarD;
        x5 x5VarB6;
        x5 x5VarB7;
        oe oeVarG2;
        og ogVarJ;
        gf gfVarJ = j();
        JSONObject jSONObject = gfVarJ != null ? gfVarJ.m : null;
        s2.a(this.f14227w, com.p004ironsource.ne.O0, s2.a(s2.a("carrier_name", jSONObject != null ? jSONObject.optString("carrier-name") : null), s2.a("mobile_country_code", jSONObject != null ? jSONObject.optString("mobile-country-code") : null), s2.a("mobile_network_code", jSONObject != null ? jSONObject.optString("mobile-network-code") : null), s2.a("iso_country_code", jSONObject != null ? jSONObject.optString("iso-country-code") : null), s2.a("phone_type", jSONObject != null ? Integer.valueOf(jSONObject.optInt("phone-type")) : null)));
        JSONObject jSONObject2 = this.f14227w;
        gf gfVarJ2 = j();
        s2.a(jSONObject2, "model", gfVarJ2 != null ? gfVarJ2.f14020a : null);
        JSONObject jSONObject3 = this.f14227w;
        gf gfVarJ3 = j();
        s2.a(jSONObject3, com.p004ironsource.ne.t, gfVarJ3 != null ? gfVarJ3.k : null);
        JSONObject jSONObject4 = this.f14227w;
        gf gfVarJ4 = j();
        s2.a(jSONObject4, "device_type", gfVarJ4 != null ? gfVarJ4.j : null);
        JSONObject jSONObject5 = this.f14227w;
        gf gfVarJ5 = j();
        s2.a(jSONObject5, "actual_device_type", gfVarJ5 != null ? gfVarJ5.f14026l : null);
        JSONObject jSONObject6 = this.f14227w;
        gf gfVarJ6 = j();
        s2.a(jSONObject6, com.p004ironsource.ne.f26256E, gfVarJ6 != null ? gfVarJ6.f14021b : null);
        JSONObject jSONObject7 = this.f14227w;
        gf gfVarJ7 = j();
        s2.a(jSONObject7, "country", gfVarJ7 != null ? gfVarJ7.f14022c : null);
        JSONObject jSONObject8 = this.f14227w;
        gf gfVarJ8 = j();
        s2.a(jSONObject8, "language", gfVarJ8 != null ? gfVarJ8.d : null);
        gf gfVarJ9 = j();
        s2.a(this.f14227w, "timestamp", (gfVarJ9 == null || (ogVarJ = gfVarJ9.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(ogVarJ.a())));
        JSONObject jSONObject9 = this.f14227w;
        gf gfVarJ10 = j();
        s2.a(jSONObject9, "reachability", (gfVarJ10 == null || (oeVarG2 = gfVarJ10.g()) == null) ? null : oeVarG2.b());
        JSONObject jSONObject10 = this.f14227w;
        gf gfVarJ11 = j();
        s2.a(jSONObject10, "is_portrait", (gfVarJ11 == null || (x5VarB7 = gfVarJ11.b()) == null) ? null : Boolean.valueOf(x5VarB7.k()));
        JSONObject jSONObject11 = this.f14227w;
        gf gfVarJ12 = j();
        s2.a(jSONObject11, "scale", (gfVarJ12 == null || (x5VarB6 = gfVarJ12.b()) == null) ? null : Float.valueOf(x5VarB6.h()));
        JSONObject jSONObject12 = this.f14227w;
        gf gfVarJ13 = j();
        s2.a(jSONObject12, "timezone", gfVarJ13 != null ? gfVarJ13.o : null);
        JSONObject jSONObject13 = this.f14227w;
        gf gfVarJ14 = j();
        s2.a(jSONObject13, com.p004ironsource.dc.f24783e, (gfVarJ14 == null || (oeVarG = gfVarJ14.g()) == null || (zcVarD = oeVarG.d()) == null) ? null : Integer.valueOf(zcVarD.c()));
        JSONObject jSONObject14 = this.f14227w;
        gf gfVarJ15 = j();
        s2.a(jSONObject14, "dw", (gfVarJ15 == null || (x5VarB5 = gfVarJ15.b()) == null) ? null : Integer.valueOf(x5VarB5.c()));
        JSONObject jSONObject15 = this.f14227w;
        gf gfVarJ16 = j();
        s2.a(jSONObject15, "dh", (gfVarJ16 == null || (x5VarB4 = gfVarJ16.b()) == null) ? null : Integer.valueOf(x5VarB4.a()));
        JSONObject jSONObject16 = this.f14227w;
        gf gfVarJ17 = j();
        s2.a(jSONObject16, "dpi", (gfVarJ17 == null || (x5VarB3 = gfVarJ17.b()) == null) ? null : x5VarB3.d());
        JSONObject jSONObject17 = this.f14227w;
        gf gfVarJ18 = j();
        s2.a(jSONObject17, "w", (gfVarJ18 == null || (x5VarB2 = gfVarJ18.b()) == null) ? null : Integer.valueOf(x5VarB2.j()));
        JSONObject jSONObject18 = this.f14227w;
        gf gfVarJ19 = j();
        s2.a(jSONObject18, com.smartdigimkt.m3.h.f36614b, (gfVarJ19 == null || (x5VarB = gfVarJ19.b()) == null) ? null : Integer.valueOf(x5VarB.e()));
        s2.a(this.f14227w, "user_agent", vh.f15428b.a());
        s2.a(this.f14227w, "device_family", "");
        s2.a(this.f14227w, "retina", Boolean.FALSE);
        p();
        gf gfVarJ20 = j();
        ce ceVar = gfVarJ20 != null ? gfVarJ20.r : null;
        if (ceVar != null) {
            a(ceVar);
        }
        a(com.ironsource.d9.h.G, this.f14227w);
    }

    public final void p() {
        gf gfVarJ = j();
        y8 y8VarC = gfVarJ != null ? gfVarJ.c() : null;
        if (y8VarC == null) {
            za.b("Missing identity in the CB SDK. This will affect ads performance.", null);
            return;
        }
        s2.a(this.f14227w, "identity", y8VarC.b());
        int i2 = a.f14228a[y8VarC.f().ordinal()];
        if (i2 == 1) {
            s2.a(this.f14227w, "limit_ad_tracking", Boolean.TRUE);
        } else if (i2 == 2) {
            s2.a(this.f14227w, "limit_ad_tracking", Boolean.FALSE);
        }
        Integer numE = y8VarC.e();
        if (numE != null) {
            s2.a(this.f14227w, "appsetidscope", Integer.valueOf(numE.intValue()));
        }
    }

    public final void q() {
        x4 x4VarA;
        mb mbVarD;
        JSONObject jSONObject = this.f14226u;
        gf gfVarJ = j();
        String strA = null;
        s2.a(jSONObject, "sdk", gfVarJ != null ? gfVarJ.g : null);
        gf gfVarJ2 = j();
        if (gfVarJ2 != null && (mbVarD = gfVarJ2.d()) != null) {
            s2.a(this.f14226u, "mediation", mbVarD.c());
            s2.a(this.f14226u, "mediation_version", mbVarD.b());
            s2.a(this.f14226u, "adapter_version", mbVarD.a());
        }
        s2.a(this.f14226u, "commit_hash", "09decf9845eb8f00ac06b030676751feddd00887");
        gf gfVarJ3 = j();
        if (gfVarJ3 != null && (x4VarA = gfVarJ3.a()) != null) {
            strA = x4VarA.a();
        }
        if (!h1.b().a(strA)) {
            s2.a(this.f14226u, "config_variant", strA);
        }
        a("sdk", this.f14226u);
    }
}
