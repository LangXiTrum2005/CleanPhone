package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class brP extends kqm {
    private static final ThreadLocal<StringBuilder> ZU = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.Lxb.LD.LD.Lxb.brP.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public brP() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.PLUS);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        if (!(objLxb2 instanceof String) && !(objLxb instanceof String)) {
            return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.OY.Lxb((Number) objLxb2, (Number) objLxb);
        }
        StringBuilder sb = ZU.get();
        sb.append(objLxb2);
        sb.append(objLxb);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
