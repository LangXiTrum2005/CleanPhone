package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class exu {
    private JSONObject lnr;
    private exu mml;
    private exu mzz;
    private com.bytedance.adsdk.ugeno.ud.lnr qdl;
    private int ud;

    public JSONObject lnr() {
        return this.lnr;
    }

    public exu mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr qdl() {
        return this.qdl;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.qdl + ", mEventType=" + this.ud + ", mEvent=" + this.lnr + AbstractJsonLexerKt.END_OBJ;
    }

    public int ud() {
        return this.ud;
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.qdl = lnrVar;
    }

    public void ud(exu exuVar) {
        this.mzz = exuVar;
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    public void qdl(JSONObject jSONObject) {
        this.lnr = jSONObject;
    }

    public void qdl(exu exuVar) {
        this.mml = exuVar;
    }
}
