package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fs extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    private static final HashSet<String> qdl = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final hkc ud;

    public fs(hkc hkcVar) {
        this.ud = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl(qdl, new fs(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.ud.jtx();
                return null;
            case "popupShow":
                this.ud.bjy();
                return null;
            case "getCurrentCountdownStatus":
                return this.ud.yt();
            case "popupRenderDidFinish":
                this.ud.jl();
                return null;
            case "changeCountdownStatus":
                this.ud.rq(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
