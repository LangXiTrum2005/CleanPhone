package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jl extends yt {
    private static final ThreadLocal<StringBuilder> mml = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.qdl.ud.ud.qdl.jl.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public jl() {
        super(com.bytedance.adsdk.qdl.ud.mml.lnr.PLUS);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl;
        Object objQdl2 = this.qdl.qdl(map);
        if (objQdl2 == null || (objQdl = this.ud.qdl(map)) == null) {
            return null;
        }
        if (!(objQdl2 instanceof String) && !(objQdl instanceof String)) {
            return com.bytedance.adsdk.qdl.ud.mzz.qdl.jpc.qdl((Number) objQdl2, (Number) objQdl);
        }
        StringBuilder sb = mml.get();
        sb.append(objQdl2);
        sb.append(objQdl);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
