package com.bytedance.sdk.openadsdk.JVA.Lxb;

import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private final String LD;
    private final Ivz Lxb;

    public OY(Ivz ivz, String str) {
        this.Lxb = ivz;
        this.LD = str;
    }

    public static void Lxb(kqm kqmVar, Ivz ivz) {
        kqmVar.Lxb("endcardDynamicCreatives", new OY(ivz, "endcardDynamicCreatives"));
        kqmVar.Lxb("multiOpenCovert", new OY(ivz, "multiOpenCovert"));
        kqmVar.Lxb("skipToNextAd", new OY(ivz, "skipToNextAd"));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.LD)) {
            return this.Lxb.ebl(jSONObject);
        }
        if ("multiOpenCovert".equals(this.LD)) {
            this.Lxb.OY(jSONObject);
            return null;
        }
        if (!"skipToNextAd".equals(this.LD)) {
            return null;
        }
        this.Lxb.Lxb(jSONObject, this.LD);
        return null;
    }
}
