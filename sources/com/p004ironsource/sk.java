package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class sk extends AbstractC3351e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27196i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = dc.f24777Q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f27197l = "data";

    public sk(int i2) {
        this.g = i2;
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String c() {
        return "ironbeast";
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<zb> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObject2.put(dc.f24777Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }
}
