package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0500oc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0674y7 f29937b = Kb.Y().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S6 f29936a = new S6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f29936a.a(O6.f26732n, Boolean.valueOf(this.f29937b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f29936a.a(O6.f26718i, new JSONObject(controllerConfig).opt(X3.a.f27681q));
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void c() {
        this.f29936a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f29936a.a(O6.V, "9.4.3");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(O6.E, Gc.f26169f);
        map.put(O6.D, Gc.f26168e);
        this.f29936a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f29936a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f29936a.a(O6.l, jSONObject);
    }

    public void a(C0514p8.c cVar) {
        this.f29936a.a(O6.f26765y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f29936a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.f29936a.a(O6.B1, list);
    }

    public void a(boolean z10) {
        this.f29936a.a(O6.U0, Boolean.valueOf(z10));
    }
}
