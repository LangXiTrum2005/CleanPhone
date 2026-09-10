package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f8395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8396b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f8398d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j5 f8401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final j5 f8402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8404j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8397c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Object f8399e = new Object();

    public m3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f8395a = lVar;
        if (((Boolean) lVar.a(z4.G6)).booleanValue()) {
            this.f8401g = new j5(jSONObject2);
            this.f8402h = new j5(jSONObject);
            this.f8396b = null;
            this.f8398d = null;
        } else {
            this.f8396b = jSONObject2;
            this.f8398d = jSONObject;
            this.f8401g = null;
            this.f8402h = null;
        }
        this.f8400f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f8395a.a(t3.f9770g8)).intValue()));
    }

    public double a(String str, double d10) {
        double d11;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, d10);
        }
        synchronized (this.f8397c) {
            d11 = JsonUtils.getDouble(this.f8396b, str, d10);
        }
        return d11;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, bool);
        }
        synchronized (this.f8397c) {
            bool2 = JsonUtils.getBoolean(this.f8396b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str);
        }
        synchronized (this.f8399e) {
            zHas = this.f8398d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str);
        }
        synchronized (this.f8397c) {
            zHas = this.f8396b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.b(str);
        }
        synchronized (this.f8399e) {
            objOpt = this.f8398d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a();
        }
        synchronized (this.f8397c) {
            jSONObject = this.f8396b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f8403i;
    }

    public Map i() {
        return this.f8400f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            j5 j5Var = this.f8402h;
            bundle = j5Var != null ? (Bundle) j5Var.a(new ae.b(23)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f8395a.p0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f8395a.a(t3.C7)).longValue());
    }

    public Boolean n() {
        String str = this.f8395a.p0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f8395a.p0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.f8404j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public JSONObject a() {
        JSONObject jSONObject;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a();
        }
        synchronized (this.f8399e) {
            jSONObject = this.f8398d;
        }
        return jSONObject;
    }

    public int b(String str, int i10) {
        int i11;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, i10);
        }
        synchronized (this.f8397c) {
            i11 = JsonUtils.getInt(this.f8396b, str, i10);
        }
        return i11;
    }

    public void c(String str, int i10) {
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            j5Var.b(str, i10);
            return;
        }
        synchronized (this.f8399e) {
            JsonUtils.putInt(this.f8398d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f8395a.t0().j();
    }

    public String e() {
        return this.f8404j;
    }

    public void g(String str) {
        this.f8403i = str;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, bool);
        }
        synchronized (this.f8399e) {
            bool2 = JsonUtils.getBoolean(this.f8398d, str, bool);
        }
        return bool2;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, jSONArray);
        }
        synchronized (this.f8397c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8396b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j10) {
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            j5Var.b(str, j10);
            return;
        }
        synchronized (this.f8399e) {
            JsonUtils.putLong(this.f8398d, str, j10);
        }
    }

    public double a(String str, float f10) {
        double d10;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, f10);
        }
        synchronized (this.f8399e) {
            d10 = JsonUtils.getDouble(this.f8398d, str, f10);
        }
        return d10;
    }

    public long b(String str, long j10) {
        long j11;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, j10);
        }
        synchronized (this.f8397c) {
            j11 = JsonUtils.getLong(this.f8396b, str, j10);
        }
        return j11;
    }

    public void c(String str, String str2) {
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            j5Var.b(str, str2);
            return;
        }
        synchronized (this.f8399e) {
            JsonUtils.putString(this.f8398d, str, str2);
        }
    }

    public int a(String str, int i10) {
        int i11;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, i10);
        }
        synchronized (this.f8399e) {
            i11 = JsonUtils.getInt(this.f8398d, str, i10);
        }
        return i11;
    }

    public String b(String str, String str2) {
        String string;
        j5 j5Var = this.f8401g;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.f8397c) {
            string = JsonUtils.getString(this.f8396b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, jSONArray);
        }
        synchronized (this.f8399e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8398d, str, jSONArray);
        }
        return jSONArray2;
    }

    public float b(String str, float f10) {
        float f11;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, f10);
        }
        synchronized (this.f8399e) {
            f11 = JsonUtils.getFloat(this.f8398d, str, f10);
        }
        return f11;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, jSONObject);
        }
        synchronized (this.f8399e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8398d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            j5 j5Var = this.f8401g;
            if (j5Var != null) {
                listOptList = j5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            j5 j5Var2 = this.f8402h;
            if (j5Var2 != null) {
                listOptList2 = j5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j10) {
        long j11;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, j10);
        }
        synchronized (this.f8399e) {
            j11 = JsonUtils.getLong(this.f8398d, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.f8399e) {
            string = JsonUtils.getString(this.f8398d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            j5Var.a(str, obj);
            return;
        }
        synchronized (this.f8399e) {
            JsonUtils.putObject(this.f8398d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(j5 j5Var) {
        return JsonUtils.toBundle(j5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
