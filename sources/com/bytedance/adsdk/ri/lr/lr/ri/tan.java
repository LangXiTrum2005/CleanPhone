package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan implements com.bytedance.adsdk.ri.lr.lr.lr {
    private com.bytedance.adsdk.ri.lr.lr.ri ik;
    private com.bytedance.adsdk.ri.lr.lr.ri lr;
    private com.bytedance.adsdk.ri.lr.lr.ri ri;

    @Override // com.bytedance.adsdk.ri.lr.lr.lr
    public void ik(com.bytedance.adsdk.ri.lr.lr.ri riVar) {
        this.ik = riVar;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.lr
    public void lr(com.bytedance.adsdk.ri.lr.lr.ri riVar) {
        this.lr = riVar;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi = this.ri.ri(map);
        if (objRi == null) {
            return null;
        }
        return ((Boolean) objRi).booleanValue() ? this.lr.ri(map) : this.ik.ri(map);
    }

    public String toString() {
        return lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return this.ri.lr() + "?" + this.lr.lr() + ":" + this.ik.lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.di.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.lr
    public void ri(com.bytedance.adsdk.ri.lr.lr.ri riVar) {
        this.ri = riVar;
    }
}
