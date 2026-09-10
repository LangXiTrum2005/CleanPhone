package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r5 extends k5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f9172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f9173k = new Object();
    private static final Map l = defpackage.e.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f9174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f9175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f9176i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c implements e5.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f9177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f9178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f9180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection f9181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f9182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f9183g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9180d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.l lVar) {
            this.f9179c = i10;
            this.f9177a = bVar;
            this.f9182f = lVar;
            this.f9183g = lVar.Q();
            this.f9178b = new Object();
            this.f9181e = new ArrayList(i10);
            this.f9180d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.e5.a
        public void a(e5 e5Var) {
            boolean z10;
            synchronized (this.f9178b) {
                this.f9181e.add(e5Var);
                int i10 = this.f9179c - 1;
                this.f9179c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f9180d.compareAndSet(false, true)) {
                if (q7.i() && ((Boolean) this.f9182f.a(z4.P)).booleanValue()) {
                    this.f9182f.s0().a((k5) new u6(this.f9182f, "handleSignalCollectionCompleted", new u9(this, 2)), f6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<e5> arrayList;
            synchronized (this.f9178b) {
                arrayList = new ArrayList(this.f9181e);
            }
            JSONArray jSONArray = new JSONArray();
            for (e5 e5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    f5 f5VarF = e5Var.f();
                    jSONObject.put("name", f5VarF.c());
                    jSONObject.put("class", f5VarF.b());
                    jSONObject.put("adapter_version", e5Var.a());
                    jSONObject.put("sdk_version", e5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = e5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", e5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", e5Var.b());
                    jSONObject2.put("is_cached", e5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f9183g.a("TaskCollectSignals", "Collected signal from " + f5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f9183g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f9182f.E().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f9177a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public r5(c3 c3Var, Context context, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskCollectSignals", lVar);
        this.f9174g = c3Var;
        this.f9175h = context;
        this.f9176i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f9176i, this.f8297a);
        this.f8297a.s0().a(new u6(this.f8297a, "timeoutCollectSignal", cVar), f6.b.TIMEOUT, ((Long) this.f8297a.a(t3.B7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new f5(this.f9174g, jSONArray.getJSONObject(i10), jSONObject, this.f8297a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) l.get(this.f9174g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f9174g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f9173k) {
                jSONArray = JsonUtils.getJSONArray(f9172j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (l.size() > 0) {
                    b(jSONArray, f9172j);
                    return;
                } else {
                    a(jSONArray, f9172j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.k(this.f8298b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f8297a.a(b5.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f8297a.E().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f8297a.E().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.f8297a.E().a("TaskCollectSignals", "collectSignals", th2);
        }
    }

    private void a(f5 f5Var, e5.a aVar) {
        if (f5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new androidx.fragment.app.d(this, f5Var, aVar, 18));
        } else {
            this.f8297a.Z().collectSignal(f5Var, this.f9175h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(f5 f5Var, e5.a aVar) {
        this.f8297a.Z().collectSignal(f5Var, this.f9175h, aVar);
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "No signals collected: " + str, th2);
        }
        b bVar = this.f9176i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f9173k) {
            f9172j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.p.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            lVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }
}
