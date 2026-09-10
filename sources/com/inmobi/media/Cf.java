package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f22753a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f22753a.entrySet()) {
                jSONObject.put(String.valueOf(AbstractC3195qa.a((EnumC3179pa) entry.getKey())), ((Bf) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return new JSONObject();
        }
    }
}
