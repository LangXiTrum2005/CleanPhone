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

/* JADX INFO: renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3585jc {
    private final InterfaceC3806w7 b = Gb.U().a();
    P6 a = new P6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(L6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(L6.i, new JSONObject(controllerConfig).opt(X3.a.q));
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(L6.V, "9.3.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(L6.E, Bc.f);
        map.put(L6.D, Bc.e);
        this.a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void b(Context context) {
        this.a.a("gpi", Boolean.valueOf(Xc.e(context)));
    }

    public void a(JSONObject jSONObject) {
        this.a.a(L6.l, jSONObject);
    }

    public void a(C3653n8.c cVar) {
        this.a.a(L6.y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.a.a(L6.B1, list);
    }

    public void a(boolean z) {
        this.a.a(L6.S0, Boolean.valueOf(z));
    }
}
