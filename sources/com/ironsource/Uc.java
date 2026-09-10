package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class Uc extends AbstractC0308e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27317i = C0340fd.f28675a;

    public Uc(int i10) {
        this.f28494g = i10;
    }

    @Override // com.ironsource.AbstractC0308e
    public String a() {
        return C0340fd.f28675a;
    }

    @Override // com.ironsource.AbstractC0308e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC0308e
    public String a(ArrayList<C0654x5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f28493f = new JSONObject();
        } else {
            this.f28493f = jSONObject;
        }
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
        return a(jSONArray);
    }
}
