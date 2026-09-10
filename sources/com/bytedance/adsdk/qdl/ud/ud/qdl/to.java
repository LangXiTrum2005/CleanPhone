package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class to implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private com.bytedance.adsdk.qdl.ud.qdl.qdl lnr;
    private boolean mml;
    private com.bytedance.adsdk.qdl.ud.ud.qdl[] qdl;
    private String ud;

    public to(String str) {
        this.ud = str;
    }

    public boolean lnr() {
        return this.mml;
    }

    public void qdl(com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr) {
        this.qdl = qdlVarArr;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ud);
        sb.append("(");
        com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr = this.qdl;
        if (qdlVarArr != null && qdlVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr2 = this.qdl;
                if (i2 >= qdlVarArr2.length) {
                    break;
                }
                sb.append(qdlVarArr2[i2].ud());
                sb.append(",");
                i2++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void qdl(boolean z2) {
        this.mml = z2;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        com.bytedance.adsdk.qdl.ud.qdl.qdl qdlVar = new com.bytedance.adsdk.qdl.ud.qdl.qdl();
        this.lnr = qdlVar;
        qdlVar.qdl(this.ud);
        Object[] objArr = new Object[this.qdl.length];
        int i2 = 0;
        while (true) {
            com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr = this.qdl;
            if (i2 < qdlVarArr.length) {
                com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2 = qdlVarArr[i2];
                if (qdlVar2 != null) {
                    objArr[i2] = qdlVar2.qdl(map);
                }
                i2++;
            } else {
                this.lnr.qdl(objArr);
                return com.bytedance.adsdk.qdl.jtx.qdl(this.ud).qdl(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.ud.METHOD;
    }
}
