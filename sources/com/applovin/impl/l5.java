package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C0375hc;
import com.ironsource.O6;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class l5 extends k5 {
    public l5(com.applovin.impl.sdk.l lVar) {
        super("TaskApiSubmitData", lVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.m mVarB = this.f8297a.B();
        Map mapP = mVarB.p();
        q7.a(O6.H, "type", mapP);
        q7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = mVarB.G();
        q7.a("sdk_version", "applovin_sdk_version", mapG);
        q7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.d(this.f8298b, "Submitting user data...");
        }
        Map mapC = s0.c(this.f8297a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f8297a.a(z4.K5)).booleanValue() || ((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            l5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            s0.a(i10, this.f8297a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(defpackage.e.x("results", jSONObject), 0, new JSONObject());
        this.f8297a.q0().a(z4.f10139f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f8297a.q0().a(z4.f10172j, JsonUtils.getString(jSONObject2, "device_token", ""));
        s0.a(jSONObject2, this.f8297a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8297a).b(s0.b("2.0/device", this.f8297a)).a(s0.a("2.0/device", this.f8297a)).b(map).a(jSONObject).c(C0375hc.f28789b).b(((Boolean) this.f8297a.a(z4.S5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f8297a.a(z4.f10134e3)).intValue()).a(w4.a.a(((Integer) this.f8297a.a(z4.B5)).intValue())).a(), this.f8297a);
        aVar.c(z4.f10207n0);
        aVar.b(z4.f10215o0);
        this.f8297a.s0().a(aVar);
    }
}
