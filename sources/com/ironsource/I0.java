package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements InterfaceC0539qf<JSONObject>, InterfaceC0503of<G0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C0589tc> f26258a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC0316e7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC0521pf mode) throws JSONException {
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C0589tc> entry : this.f26258a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(an.h.O0(key, "_"), jSONObjectA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC0503of
    public void a(G0 record) {
        kotlin.jvm.internal.n.f(record, "record");
        String strD = record.d();
        Map<String, C0589tc> map = this.f26258a;
        C0589tc c0589tc = map.get(strD);
        if (c0589tc == null) {
            c0589tc = new C0589tc();
            map.put(strD, c0589tc);
        }
        c0589tc.a(record.a(new H0()));
    }
}
