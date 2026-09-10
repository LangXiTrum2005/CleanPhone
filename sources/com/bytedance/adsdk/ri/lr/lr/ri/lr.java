package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends bu {
    public lr() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.DOUBLE_AMP);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        return Boolean.valueOf(com.bytedance.adsdk.ri.lr.fi.lr.ri(this.ri.ri(map)) && com.bytedance.adsdk.ri.lr.fi.lr.ri(this.lr.ri(map)));
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri.bu
    public String toString() {
        return lr();
    }
}
