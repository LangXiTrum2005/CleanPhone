package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bjy implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private Number qdl;

    public bjy(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.qdl = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.qdl = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.qdl = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.qdl = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        return this.qdl;
    }

    public String toString() {
        return ud();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl.toString();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.NUMBER;
    }
}
