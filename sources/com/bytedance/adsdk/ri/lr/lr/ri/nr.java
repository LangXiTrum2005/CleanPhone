package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nr extends bu {
    private static final ThreadLocal<StringBuilder> ka = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.ri.lr.lr.ri.nr.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public nr() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.PLUS);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi;
        Object objRi2 = this.ri.ri(map);
        if (objRi2 == null || (objRi = this.lr.ri(map)) == null) {
            return null;
        }
        if (!(objRi2 instanceof String) && !(objRi instanceof String)) {
            return com.bytedance.adsdk.ri.lr.fi.ri.mj.ri((Number) objRi2, (Number) objRi);
        }
        StringBuilder sb = ka.get();
        sb.append(objRi2);
        sb.append(objRi);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
