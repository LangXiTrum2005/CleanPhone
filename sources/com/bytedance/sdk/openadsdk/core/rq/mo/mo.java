package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private final String qdl = "UGenV3OpenLinks";
    private final String ud = "landingStyle";
    private final String lnr = "url";
    private final String mml = "fallbackUrl";

    public void qdl(Context context, boolean z2, ljh ljhVar, String str, Map<String, String> map, com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (qdl(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                jl.qdl(context, z2, qdl(map), ljhVar, str, gy.qdl(str), null, mzzVar);
            }
        } catch (Throwable th) {
            aaj.lnr("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean qdl(int i2, String str, String str2) {
        if (i2 == 1) {
            if (!com.bytedance.sdk.component.utils.jl.qdl(str)) {
                return false;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (!com.bytedance.sdk.component.utils.jl.qdl(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !com.bytedance.sdk.component.utils.jl.qdl(str2)) {
            return false;
        }
        return true;
    }

    private JSONObject qdl(Map<String, String> map) {
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
