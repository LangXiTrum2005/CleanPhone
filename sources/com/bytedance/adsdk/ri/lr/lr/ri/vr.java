package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr implements com.bytedance.adsdk.ri.lr.lr.ri {
    private Number ri;

    public vr(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.ri = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.ri = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.ri = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.ri = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return this.ri.toString();
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
        return com.bytedance.adsdk.ri.lr.ka.di.NUMBER;
    }
}
