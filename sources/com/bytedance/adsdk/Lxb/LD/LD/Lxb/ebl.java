package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ebl implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private final Object Lxb;

    public ebl(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.Lxb = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.Lxb = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.Lxb = null;
        }
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        Object obj = this.Lxb;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        return this.Lxb;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.Lxb + "]";
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.lc.CONSTANT;
    }
}
