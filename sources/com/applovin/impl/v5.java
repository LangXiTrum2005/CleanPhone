package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C0375hc;
import com.ironsource.O6;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class v5 extends k5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f9890j = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f9893i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends k5 {
        public c(com.applovin.impl.sdk.l lVar) {
            super("TaskTimeoutFetchBasicSettings", lVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v5.this.f9893i != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Timing out fetch basic settings...");
                }
                v5.this.a(new JSONObject());
            }
        }
    }

    public v5(int i10, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchBasicSettings", lVar, true);
        this.f9892h = new Object();
        this.f9891g = i10;
        this.f9893i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return s0.a((String) this.f8297a.a(z4.f10182k0), "5.0/i", b());
    }

    private String g() {
        return s0.a((String) this.f8297a.a(z4.f10173j0), "5.0/i", b());
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.l lVar = this.f8297a;
            z4 z4Var = z4.E5;
            if (((Boolean) lVar.a(z4Var)).booleanValue() || ((Boolean) this.f8297a.a(z4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.f9891g);
            jSONObject.put("server_installed_at", this.f8297a.a(z4.f10214o));
            if (this.f8297a.E0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f8297a.B0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", q7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", q7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f8297a.a(z4.R3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f8297a.X());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f8297a.D());
            jSONObject.put("installed_mediation_adapters", y3.b(this.f8297a));
            Map mapG = this.f8297a.B().G();
            jSONObject.put("package_name", mapG.get("package_name"));
            jSONObject.put("app_version", mapG.get("app_version"));
            jSONObject.put("debug", mapG.get("debug"));
            jSONObject.put("tg", mapG.get("tg"));
            jSONObject.put("target_sdk", mapG.get("target_sdk"));
            jSONObject.put("session_id", mapG.get("session_id"));
            List list = (List) mapG.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapG.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f8297a.L() != null ? this.f8297a.L().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, mapG.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapG.get("IABTCF_gdprApplies"));
            Object obj = mapG.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f8297a.y().b());
            Map mapN = this.f8297a.B().N();
            jSONObject.put(O6.H, mapN.get(O6.H));
            jSONObject.put(O6.F, mapN.get(O6.F));
            jSONObject.put("locale", mapN.get("locale"));
            jSONObject.put("brand", mapN.get("brand"));
            jSONObject.put("brand_name", mapN.get("brand_name"));
            jSONObject.put("hardware", mapN.get("hardware"));
            jSONObject.put(O6.B, mapN.get(O6.B));
            jSONObject.put("revision", mapN.get("revision"));
            jSONObject.put("is_tablet", mapN.get("is_tablet"));
            jSONObject.put("screen_size_in", mapN.get("screen_size_in"));
            jSONObject.put("supported_abis", mapN.get("supported_abis"));
            if (((Boolean) this.f8297a.a(z4.c4)).booleanValue()) {
                jSONObject.put("mtl", this.f8297a.o0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a aVarF = this.f8297a.B().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = q0.c().b(a());
            if (((Boolean) this.f8297a.a(z4.M3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            com.applovin.impl.sdk.m.b bVarH = this.f8297a.B().H();
            if (((Boolean) this.f8297a.a(z4.F3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f9540a);
                jSONObject.put("idfv_scope", bVarH.f9541b);
            }
            if (((Boolean) this.f8297a.a(z4.I3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f8297a.v());
            }
            if (((Boolean) this.f8297a.a(z4.K3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f8297a.j0());
            }
            if (((Boolean) this.f8297a.a(z4.O3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f8297a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f8297a.F());
            if (this.f8297a.u0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f8297a.u0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f8297a.p0().getExtraParameters()));
            Map mapM0 = this.f8297a.m0();
            if (!CollectionUtils.isEmpty(mapM0)) {
                jSONObject.put("segments", new JSONObject(mapM0));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Failed to create JSON body", e10);
            }
            this.f8297a.E().a(this.f8298b, "createJSONBody", e10);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f8297a.a(z4.F5)).booleanValue() && !((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f8297a.a(z4.f10227p5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8297a.k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f8297a.r(), map);
        Boolean boolB = q0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = q0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = q0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!p0.g() && f9890j.compareAndSet(false, true)) {
            try {
                ga.a.a(com.applovin.impl.sdk.l.p());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Cannot update security provider", th2);
                }
            }
        }
        this.f8297a.x0().d(f2.f7851g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map mapH = h();
        com.applovin.impl.sdk.network.a.C0018a c0018aB = com.applovin.impl.sdk.network.a.a(this.f8297a).b(g()).a(f()).b(mapH).a(e()).b(((Boolean) this.f8297a.a(z4.R5)).booleanValue()).c(C0375hc.f28789b).a((Object) new JSONObject()).a(((Integer) this.f8297a.a(z4.f10159h3)).intValue()).b(((Integer) this.f8297a.a(z4.f10185k3)).intValue());
        com.applovin.impl.sdk.l lVar = this.f8297a;
        z4 z4Var = z4.f10151g3;
        com.applovin.impl.sdk.network.a aVarA = c0018aB.c(((Integer) lVar.a(z4Var)).intValue()).e(((Boolean) this.f8297a.a(z4.f10254t3)).booleanValue()).a(w4.a.a(((Integer) this.f8297a.a(z4.f10264u5)).intValue())).f(true).a();
        this.f8297a.s0().a(new c(this.f8297a), f6.b.TIMEOUT, ((long) ((Integer) this.f8297a.a(z4Var)).intValue()) + 250);
        a aVar = new a(aVarA, this.f8297a, d(), jElapsedRealtime);
        aVar.c(z4.f10173j0);
        aVar.b(z4.f10182k0);
        this.f8297a.s0().a(aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f9894n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10, long j10) {
            super(aVar, lVar, z10);
            this.f9894n = j10;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9894n;
            v5.this.a(jSONObject);
            this.f8297a.x0().d(f2.f7853h, v5.this.a(str, jElapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9894n;
            v5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f8297a.x0().d(f2.f7855i, v5.this.a(str, jElapsedRealtime, i10, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, X3.j.D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f9891g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j10));
        map.put("code", Integer.toString(i10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f9892h) {
            bVar = this.f9893i;
            this.f9893i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
