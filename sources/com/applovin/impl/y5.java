package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C0375hc;
import com.ironsource.O6;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r0.e f10076g;

    public y5(r0.e eVar, com.applovin.impl.sdk.l lVar) {
        super("TaskFetchMediationDebuggerInfo", lVar, true);
        this.f10076g = eVar;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f8297a.a(z4.f10227p5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8297a.k0());
        }
        Map mapG = this.f8297a.B().G();
        map.put("package_name", String.valueOf(mapG.get("package_name")));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f8297a.B().N();
        map.put(O6.H, String.valueOf(mapN.get(O6.H)));
        map.put(O6.F, String.valueOf(mapN.get(O6.F)));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f8297a.a(z4.H5)).booleanValue() || ((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8297a).c(C0375hc.f28789b).b(n3.i(this.f8297a)).a(n3.h(this.f8297a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f8297a.a(t3.f9792y7)).intValue()).a(w4.a.a(((Integer) this.f8297a.a(z4.f10276w5)).intValue())).a(), this.f8297a, d());
        aVar.c(t3.f9785u7);
        aVar.b(t3.f9787v7);
        this.f8297a.s0().a(aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
            super(aVar, lVar, z10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            y5.this.f10076g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            y5.this.f10076g.a(str, i10, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", y3.b(this.f8297a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f8297a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapM0 = this.f8297a.m0();
        if (!CollectionUtils.isEmpty(mapM0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapM0));
        }
        return jSONObject;
    }
}
