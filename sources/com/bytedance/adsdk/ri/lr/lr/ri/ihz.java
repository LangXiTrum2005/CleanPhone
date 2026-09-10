package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ihz implements com.bytedance.adsdk.ri.lr.lr.ri {
    private com.bytedance.adsdk.ri.lr.ka.ka ri;

    public ihz(com.bytedance.adsdk.ri.lr.ka.ka kaVar) {
        this.ri = kaVar;
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
