package com.bytedance.adsdk.ri.lr.lr.ri;

import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements com.bytedance.adsdk.ri.lr.lr.ri {
    private final Object ri;

    public xha(String str) {
        if (str.equalsIgnoreCase(a.g)) {
            this.ri = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.ri = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.ri = null;
        }
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        Object obj = this.ri;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        return this.ri;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.ri + X3.j.e;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.di.CONSTANT;
    }
}
