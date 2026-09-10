package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jtx implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final com.bytedance.adsdk.qdl.ud.mml.lnr qdl;

    public jtx(com.bytedance.adsdk.qdl.ud.mml.lnr lnrVar) {
        this.qdl = lnrVar;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ud();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl.qdl();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return this.qdl;
    }
}
