package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ac implements com.bytedance.adsdk.ri.lr.lr.ri {
    private final String ri;

    public ac(String str) {
        this.ri = str;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return "'" + this.ri + "'";
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        return this.ri;
    }

    public String toString() {
        return lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.di.STRING;
    }
}
