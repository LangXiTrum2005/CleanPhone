package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private String lr;
    private final dzy ri;

    public jbs(dzy dzyVar, String str) {
        this.ri = dzyVar;
        this.lr = str;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri("endcardDynamicCreatives", new jbs(dzyVar, "endcardDynamicCreatives"));
        vrVar.ri("multiOpenCovert", new jbs(dzyVar, "multiOpenCovert"));
        vrVar.ri("skipToNextAd", new jbs(dzyVar, "skipToNextAd"));
        vrVar.ri("speedVideoOrTimer", new jbs(dzyVar, "speedVideoOrTimer"));
        vrVar.ri("openPlayable", new jbs(dzyVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.lr)) {
            return this.ri.jbs(jSONObject);
        }
        if ("multiOpenCovert".equals(this.lr)) {
            this.ri.qt(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.lr)) {
            this.ri.ri(jSONObject, this.lr);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.lr)) {
            return this.ri.mj(jSONObject);
        }
        if ("openPlayable".equals(this.lr)) {
            return this.ri.xha(jSONObject);
        }
        return null;
    }
}
