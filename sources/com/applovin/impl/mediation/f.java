package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.l6;
import com.applovin.impl.m1;
import com.applovin.impl.m3;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8680c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8681d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8682e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f8683f = new JSONArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f8684g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8685h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8686i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8687j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f8688k = new Object();
    private List l;

    public f(com.applovin.impl.sdk.l lVar) {
        this.f8678a = lVar;
        this.f8679b = lVar.Q();
    }

    public void a(Activity activity) {
        if (this.f8680c.compareAndSet(false, true)) {
            String str = (String) this.f8678a.a(b5.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<m3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f8678a.u0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.l = listA;
                    for (m3 m3Var : listA) {
                        this.f8686i.put(m3Var.b(), m3Var);
                    }
                    long j10 = StringUtils.parseLong(this.f8678a.p0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    m5 m5Var = new m5(listA, activity, this.f8678a);
                    if (j10 > 0) {
                        this.f8678a.s0().a(m5Var, f6.b.MEDIATION, j10);
                    } else {
                        this.f8678a.s0().a(m5Var);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8679b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                    m1.a((Throwable) e10);
                }
            }
        }
    }

    public boolean c() {
        return this.f8680c.get();
    }

    private void c(m3 m3Var) {
        String strB = m3Var.b();
        synchronized (this.f8682e) {
            try {
                if (this.f8681d.contains(strB)) {
                    return;
                }
                this.f8681d.add(strB);
                this.f8678a.R().d(f2.f7843d0, h2.a(m3Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f8685h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f8683f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean b(m3 m3Var) {
        boolean zContainsKey;
        synchronized (this.f8685h) {
            zContainsKey = this.f8684g.containsKey(m3Var.b());
        }
        return zContainsKey;
    }

    public u4 a(m3 m3Var, Activity activity) {
        m3 m3VarA = a(m3Var);
        if (m3VarA == null) {
            return u4.a("AdapterInitialization:" + m3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = m3Var.b();
        synchronized (this.f8688k) {
            try {
                u4 u4Var = (u4) this.f8687j.get(strB);
                if (u4Var != null) {
                    boolean z10 = false;
                    boolean z11 = m3VarA.q() && u4Var.e();
                    if (((Boolean) this.f8678a.a(z4.Y6)).booleanValue() && u4Var.a()) {
                        z10 = true;
                    }
                    if (!z11 && !z10) {
                        return u4Var;
                    }
                }
                final u4 u4Var2 = new u4("AdapterInitialization:" + m3Var.c());
                this.f8687j.put(strB, u4Var2);
                h hVarA = this.f8678a.V().a(m3VarA);
                if (hVarA == null) {
                    u4Var2.a("Adapter implementation not found");
                    return u4Var2;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8679b.d("MediationAdapterInitializationManager", "Initializing adapter " + m3VarA);
                }
                c(m3VarA);
                hVarA.a(MaxAdapterParametersImpl.a(m3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.o
                    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                        f.a(u4Var2, initializationStatus, str);
                    }
                });
                l6.a(m3VarA.m(), u4Var2, "The adapter (" + m3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f8678a);
                return u4Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(u4 u4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                u4Var.a(str);
                return;
            } else {
                u4Var.b(initializationStatus);
                return;
            }
        }
        m1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        u4Var.a("Adapter reported INITIALIZING");
    }

    private m3 a(m3 m3Var) {
        List<m3> list;
        if (((Boolean) this.f8678a.a(t3.C8)).booleanValue()) {
            m3 m3Var2 = (m3) this.f8686i.get(m3Var.b());
            return m3Var2 != null ? m3Var2 : m3Var;
        }
        if (!this.f8678a.u0().c() || (list = this.l) == null) {
            return m3Var;
        }
        for (m3 m3Var3 : list) {
            if (m3Var3.b().equals(m3Var.b())) {
                return m3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f8685h) {
            num = (Integer) this.f8684g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f8685h) {
            hashSet = new HashSet(this.f8684g.keySet());
        }
        return hashSet;
    }

    public void a(m3 m3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f8685h) {
            try {
                zB = b(m3Var);
                if (!zB) {
                    this.f8684g.put(m3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", m3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f8683f.put(jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zB) {
            return;
        }
        this.f8678a.a(m3Var);
        this.f8678a.Z().processAdapterInitializationPostback(m3Var, j10, initializationStatus, str);
        this.f8678a.u().a(initializationStatus, m3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new m3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f8678a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f8685h) {
            this.f8684g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f8678a.u().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
