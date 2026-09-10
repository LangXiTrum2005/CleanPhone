package com.bytedance.sdk.openadsdk.ik;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.wjv;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile lr ri;
    private final wjv<com.bytedance.sdk.openadsdk.ka.ri> lr = nr.ik();

    private lr() {
    }

    public static lr ri() {
        if (ri == null) {
            synchronized (lr.class) {
                try {
                    if (ri == null) {
                        ri = new lr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ri(String str, List<FilterWord> list, String str2) {
        ri(str, list, null, null, str2);
    }

    public void ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.lr.ri(str, list, jSONObject, str2, str3);
    }
}
