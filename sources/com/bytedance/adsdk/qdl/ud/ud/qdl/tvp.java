package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends yt {
    public tvp() {
        super(com.bytedance.adsdk.qdl.ud.mml.lnr.LT);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl;
        Object objQdl2 = this.qdl.qdl(map);
        if (objQdl2 == null || (objQdl = this.ud.qdl(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.qdl.ud.mzz.qdl.mml.qdl(objQdl2, (Number) objQdl);
    }
}
