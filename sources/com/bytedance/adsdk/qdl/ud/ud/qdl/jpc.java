package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends yt {
    public jpc() {
        super(com.bytedance.adsdk.qdl.ud.mml.lnr.LT_EQ);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl;
        Object objQdl2 = this.qdl.qdl(map);
        if (objQdl2 == null || (objQdl = this.ud.qdl(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr.qdl(objQdl2, (Number) objQdl)).booleanValue());
    }
}
