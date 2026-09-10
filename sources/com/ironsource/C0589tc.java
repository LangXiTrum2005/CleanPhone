package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0589tc implements InterfaceC0539qf<JSONObject>, InterfaceC0503of<C0553rc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C0399j1> f30728a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC0316e7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC0521pf mode) throws JSONException {
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C0399j1> entry : this.f30728a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC0503of
    public void a(C0553rc record) {
        kotlin.jvm.internal.n.f(record, "record");
        String strC = record.c();
        Map<String, C0399j1> map = this.f30728a;
        C0399j1 c0399j1 = map.get(strC);
        if (c0399j1 == null) {
            c0399j1 = new C0399j1();
            map.put(strC, c0399j1);
        }
        c0399j1.a(record.a(new C0571sc()));
    }
}
