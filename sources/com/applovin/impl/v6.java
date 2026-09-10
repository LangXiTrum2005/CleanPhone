package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.B5;
import com.ironsource.C0375hc;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class v6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r2 f9897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Exception f9898h;

    public v6(com.applovin.impl.sdk.l lVar, r2 r2Var, Exception exc) {
        super("TaskValidateLicense", lVar);
        this.f9897g = r2Var;
        this.f9898h = exc;
    }

    private String e() {
        return s0.a((String) this.f8297a.a(z4.f10266v0), (String) this.f8297a.a(z4.f10273w0), this.f8297a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f8297a.B().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f8297a.a(z4.E3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        com.applovin.impl.sdk.m.b bVarH = this.f8297a.B().H();
        if (((Boolean) this.f8297a.a(z4.F3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f9540a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f9541b);
        }
        String strE = this.f8297a.y0().e();
        if (((Boolean) this.f8297a.a(z4.G3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f8297a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8297a.v());
        }
        if (((Boolean) this.f8297a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8297a.j0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f8297a.B().e());
        JSONObject jSONObject2 = new JSONObject();
        r2 r2Var = this.f9897g;
        if (r2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", r2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f9897g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f9897g.c());
            JsonUtils.putInt(jSONObject2, B5.f25703q, this.f9897g.b());
        }
        Exception exc = this.f9898h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return s0.a((String) this.f8297a.a(z4.f10259u0), (String) this.f8297a.a(z4.f10273w0), this.f8297a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8297a).b(g()).a(e()).a(f()).c(C0375hc.f28789b).b(((Boolean) this.f8297a.a(z4.W5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f8297a.a(z4.f10290y3)).intValue()).a(w4.a.a(((Integer) this.f8297a.a(z4.D5)).intValue())).a(), this.f8297a);
        aVar.c(z4.f10259u0);
        aVar.b(z4.f10266v0);
        this.f8297a.s0().a(aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "License Validation successful");
            }
            c5.b(b5.f7551i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            Map map = CollectionUtils.map("code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f8297a.x0().d(f2.l, map);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Failed to validate license: ");
            }
            if (!this.f8297a.c(z4.A).contains(String.valueOf(i10))) {
                c5.b(b5.f7551i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f8297a.x0().d(f2.f7866m, map);
        }
    }
}
