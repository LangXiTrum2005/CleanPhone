package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C0375hc;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t6 extends k5 {
    public t6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, r0.e eVar) {
        Map mapC = s0.c(this.f8297a);
        if (((Boolean) this.f8297a.a(z4.L5)).booleanValue() || ((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8297a).b(s0.b(f(), this.f8297a)).a(s0.a(f(), this.f8297a)).b(mapC).a(jSONObject).c(C0375hc.f28789b).b(((Boolean) this.f8297a.a(z4.V5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(w4.a.a(((Integer) this.f8297a.a(z4.C5)).intValue())).a(), this.f8297a, eVar);
        aVar.c(z4.f10207n0);
        aVar.b(z4.f10215o0);
        this.f8297a.s0().a(aVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f8297a.y0().e();
        if (((Boolean) this.f8297a.a(z4.H3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f8297a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8297a.v());
        }
        if (((Boolean) this.f8297a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8297a.j0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ r0.e f9802n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, r0.e eVar) {
            super(aVar, lVar);
            this.f9802n = eVar;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f9802n.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f9802n.a(str, i10, str2, jSONObject);
        }
    }

    public void a(int i10) {
        s0.a(i10, this.f8297a);
    }
}
