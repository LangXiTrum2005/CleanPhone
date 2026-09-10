package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rdp extends yt {
    public rdp() {
        super(com.bytedance.adsdk.qdl.ud.mml.lnr.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl = this.qdl.qdl(map);
        Object objQdl2 = this.ud.qdl(map);
        if (objQdl == null && objQdl2 == null) {
            return Boolean.FALSE;
        }
        if (objQdl == null && objQdl2 != null) {
            return Boolean.TRUE;
        }
        if (objQdl == null || objQdl2 != null) {
            return ((objQdl instanceof Number) && (objQdl2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud.qdl((Number) objQdl, (Number) objQdl2)) : Boolean.valueOf(!objQdl.equals(objQdl2));
        }
        return Boolean.TRUE;
    }
}
