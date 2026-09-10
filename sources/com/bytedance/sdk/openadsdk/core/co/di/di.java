package com.bytedance.sdk.openadsdk.core.co.di;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.tan;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private final String ri = "UGenV3OpenLinks";
    private final String lr = "landingStyle";
    private final String ik = "url";
    private final String ka = "fallbackUrl";

    public void ri(Context context, boolean z, wjv wjvVar, String str, Map<String, String> map, com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (ri(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                tan.ri(context, z, ri(map), wjvVar, str, ig.ri(str), null, fiVar);
            }
        } catch (Throwable th) {
            ac.ik("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean ri(int i, String str, String str2) {
        if (i == 1) {
            if (!nr.ri(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!nr.ri(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !nr.ri(str2)) {
            return false;
        }
        return true;
    }

    private JSONObject ri(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
