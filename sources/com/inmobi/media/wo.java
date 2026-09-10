package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class wo {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put(String.valueOf(Ef.a((Df) entry.getKey())), ((vo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            return new JSONObject();
        }
    }
}
