package com.p004ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class yp extends AbstractC3351e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27800i = mq.f26191a;

    public yp(int i2) {
        this.g = i2;
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String a() {
        return mq.f26191a;
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String c() {
        return "outcome";
    }

    @Override // com.p004ironsource.AbstractC3351e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f = jSONObject;
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
        return a(jSONArray);
    }
}
