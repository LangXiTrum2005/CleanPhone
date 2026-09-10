package com.bytedance.sdk.openadsdk.core.co.di.ri;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr {
    protected wjv ri;

    public static class ri {
        public static lr ri(wjv wjvVar, com.bytedance.sdk.openadsdk.core.co.di.ri riVar) {
            if (wjvVar == null) {
                return null;
            }
            int iGo = wjvVar.go();
            if (iGo == 1) {
                return new com.bytedance.sdk.openadsdk.core.co.di.ri.ri(wjvVar, riVar);
            }
            if (iGo == 3) {
                return new ka(wjvVar, riVar);
            }
            if (iGo == 7 || iGo == 8) {
                return new fi(wjvVar, riVar);
            }
            return null;
        }
    }

    public lr(wjv wjvVar) {
        this.ri = wjvVar;
    }

    public abstract JSONObject lr();

    public abstract String ri();

    public void ri(JSONObject jSONObject) {
    }
}
