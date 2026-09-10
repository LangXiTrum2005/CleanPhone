package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private final hkc qdl;
    private String ud;

    public tvp(hkc hkcVar, String str) {
        this.qdl = hkcVar;
        this.ud = str;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl("endcardDynamicCreatives", new tvp(hkcVar, "endcardDynamicCreatives"));
        bjyVar.qdl("multiOpenCovert", new tvp(hkcVar, "multiOpenCovert"));
        bjyVar.qdl("skipToNextAd", new tvp(hkcVar, "skipToNextAd"));
        bjyVar.qdl("speedVideoOrTimer", new tvp(hkcVar, "speedVideoOrTimer"));
        bjyVar.qdl("openPlayable", new tvp(hkcVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.ud)) {
            return this.qdl.tvp(jSONObject);
        }
        if ("multiOpenCovert".equals(this.ud)) {
            this.qdl.to(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.ud)) {
            this.qdl.qdl(jSONObject, this.ud);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.ud)) {
            return this.qdl.jpc(jSONObject);
        }
        if ("openPlayable".equals(this.ud)) {
            return this.qdl.wd(jSONObject);
        }
        return null;
    }
}
