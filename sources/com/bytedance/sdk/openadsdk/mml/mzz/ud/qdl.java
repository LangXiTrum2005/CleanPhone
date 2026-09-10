package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl<T extends lnr> {
    private JSONObject lnr;
    private T mml;
    private boolean mzz = false;
    private ljh qdl;
    private String ud;

    public qdl(ljh ljhVar, String str, JSONObject jSONObject, T t) {
        this.qdl = ljhVar;
        this.ud = str;
        this.lnr = jSONObject;
        this.mml = t;
    }

    public JSONObject lnr() {
        if (this.lnr == null) {
            this.lnr = new JSONObject();
        }
        return this.lnr;
    }

    public T mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public ljh qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.ud;
    }

    public void qdl(boolean z2) {
        this.mzz = z2;
    }
}
