package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends com.bytedance.sdk.component.ri.nr<JSONObject, JSONObject> {
    public static final HashSet<String> ri = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final dzy lr;

    public qt(dzy dzyVar) {
        this.lr = dzyVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri(ri, new qt(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.lr.jbs(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.lr.qt(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.lr.ri(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.lr.mj(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.lr.xha(jSONObject);
        }
        return null;
    }
}
