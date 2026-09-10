package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements com.bytedance.adsdk.ri.lr.lr.ri {
    private final com.bytedance.adsdk.ri.lr.ka.ik ri;

    public slm(com.bytedance.adsdk.ri.lr.ka.ik ikVar) {
        this.ri = ikVar;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return this.ri.ri();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return this.ri;
    }
}
