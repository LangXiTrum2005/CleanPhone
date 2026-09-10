package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class IeN implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private Number Lxb;

    public IeN(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.Lxb = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.Lxb = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.Lxb = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.Lxb = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        return this.Lxb.toString();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        return this.Lxb;
    }

    public String toString() {
        return LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.lc.NUMBER;
    }
}
