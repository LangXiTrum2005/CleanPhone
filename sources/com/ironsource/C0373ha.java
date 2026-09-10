package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class C0373ha extends AbstractC0308e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f28785i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f28786j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f28787k = B5.R;
    private final String l = "data";

    public C0373ha(int i10) {
        this.f28494g = i10;
    }

    @Override // com.ironsource.AbstractC0308e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC0308e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC0308e
    public String a(ArrayList<C0654x5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f28493f = new JSONObject();
        } else {
            this.f28493f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C0654x5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObject2.put(B5.R, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
