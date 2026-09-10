package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt implements com.bytedance.adsdk.ri.lr.lr.ri {
    private com.bytedance.adsdk.ri.lr.ri.ri ik;
    private boolean ka;
    private String lr;
    private com.bytedance.adsdk.ri.lr.lr.ri[] ri;

    public qt(String str) {
        this.lr = str;
    }

    public boolean ik() {
        return this.ka;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lr);
        sb.append("(");
        com.bytedance.adsdk.ri.lr.lr.ri[] riVarArr = this.ri;
        if (riVarArr != null && riVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.ri.lr.lr.ri[] riVarArr2 = this.ri;
                if (i >= riVarArr2.length) {
                    break;
                }
                sb.append(riVarArr2[i].lr());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void ri(com.bytedance.adsdk.ri.lr.lr.ri[] riVarArr) {
        this.ri = riVarArr;
    }

    public void ri(boolean z) {
        this.ka = z;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        com.bytedance.adsdk.ri.lr.ri.ri riVar = new com.bytedance.adsdk.ri.lr.ri.ri();
        this.ik = riVar;
        riVar.ri(this.lr);
        Object[] objArr = new Object[this.ri.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.ri.lr.lr.ri[] riVarArr = this.ri;
            if (i < riVarArr.length) {
                com.bytedance.adsdk.ri.lr.lr.ri riVar2 = riVarArr[i];
                if (riVar2 != null) {
                    objArr[i] = riVar2.ri(map);
                }
                i++;
            } else {
                this.ik.ri(objArr);
                return com.bytedance.adsdk.ri.slm.ri(this.lr).ri(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.lr.METHOD;
    }
}
