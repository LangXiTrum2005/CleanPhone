package com.bytedance.sdk.component.Lxb;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IeN {
    private final Map<String, Object> Lxb = new ConcurrentHashMap();

    private IeN() {
    }

    public static IeN Lxb() {
        return new IeN();
    }

    public String LD() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.Lxb.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public IeN Lxb(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.Lxb.put(str, obj);
        }
        return this;
    }
}
