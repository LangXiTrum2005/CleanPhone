package com.bytedance.sdk.component.ri;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aw {
    private final Map<String, Object> ri = new ConcurrentHashMap();

    private aw() {
    }

    public static aw ri() {
        return new aw();
    }

    public String lr() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.ri.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public aw ri(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.ri.put(str, obj);
        }
        return this;
    }
}
