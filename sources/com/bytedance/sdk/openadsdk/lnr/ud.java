package com.bytedance.sdk.openadsdk.lnr;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private static volatile ud qdl;
    private final oth<com.bytedance.sdk.openadsdk.mml.qdl> ud = yt.lnr();

    private ud() {
    }

    public static ud qdl() {
        if (qdl == null) {
            synchronized (ud.class) {
                try {
                    if (qdl == null) {
                        qdl = new ud();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public void qdl(String str, List<FilterWord> list, String str2) {
        qdl(str, list, null, null, str2);
    }

    public void qdl(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.ud.qdl(str, list, jSONObject, str2, str3);
    }
}
