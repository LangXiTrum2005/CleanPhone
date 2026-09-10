package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final hkc ud;

    public to(hkc hkcVar) {
        this.ud = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl(qdl, new to(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.ud.tvp(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.ud.to(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.ud.qdl(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.ud.jpc(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.ud.wd(jSONObject);
        }
        return null;
    }
}
