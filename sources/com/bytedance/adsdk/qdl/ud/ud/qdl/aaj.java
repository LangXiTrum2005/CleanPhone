package com.bytedance.adsdk.qdl.ud.ud.qdl;

import android.support.v4.media.a;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aaj implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final String qdl;

    public aaj(String str) {
        this.qdl = str;
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
        return a.r(new StringBuilder("'"), this.qdl, "'");
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.STRING;
    }
}
