package com.bytedance.sdk.component.qdl;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class exu {
    private final Map<String, Object> qdl = new ConcurrentHashMap();

    private exu() {
    }

    public static exu qdl() {
        return new exu();
    }

    public String ud() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.qdl.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public exu qdl(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.qdl.put(str, obj);
        }
        return this;
    }
}
