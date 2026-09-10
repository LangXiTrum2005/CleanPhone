package com.p004ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.IronSourceQaProperties;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ro {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vf f26684b = on.U().f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    re f26683a = new re();

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f26683a.a("debug", jSONObject);
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f26683a.a(ne.f26275i, new JSONObject(controllerConfig).opt(d9.a.q));
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void c() {
        this.f26683a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f26683a.a(ne.f26264U, "8.10.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(ne.D, jp.f);
        map.put(ne.C, "7");
        this.f26683a.a(map);
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f26683a.a(ne.f26277n, Boolean.valueOf(this.f26684b.a((Activity) context)));
        }
    }

    public void b(Context context) {
        this.f26683a.a("gpi", Boolean.valueOf(fq.d(context)));
    }

    public void a(mh.c cVar) {
        this.f26683a.a(ne.w1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(List<String> list) {
        this.f26683a.a(ne.z1, list);
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f26683a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(JSONObject jSONObject) {
        this.f26683a.a(ne.f26276l, jSONObject);
    }

    public void a(boolean z2) {
        this.f26683a.a(ne.Q0, Boolean.valueOf(z2));
    }
}
