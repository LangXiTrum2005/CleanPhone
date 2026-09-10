package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nBu implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private String LD;
    private com.bytedance.adsdk.Lxb.LD.LD.Lxb[] Lxb;
    private com.bytedance.adsdk.Lxb.LD.Lxb.Lxb lk;

    public nBu(String str) {
        this.LD = str;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LD);
        sb.append("(");
        com.bytedance.adsdk.Lxb.LD.LD.Lxb[] lxbArr = this.Lxb;
        if (lxbArr != null && lxbArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.Lxb.LD.LD.Lxb[] lxbArr2 = this.Lxb;
                if (i >= lxbArr2.length) {
                    break;
                }
                sb.append(lxbArr2[i].LD());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void Lxb(com.bytedance.adsdk.Lxb.LD.LD.Lxb[] lxbArr) {
        this.Lxb = lxbArr;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        com.bytedance.adsdk.Lxb.LD.Lxb.Lxb lxb = new com.bytedance.adsdk.Lxb.LD.Lxb.Lxb();
        this.lk = lxb;
        lxb.Lxb(this.LD);
        Object[] objArr = new Object[this.Lxb.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.Lxb.LD.LD.Lxb[] lxbArr = this.Lxb;
            if (i >= lxbArr.length) {
                this.lk.Lxb(objArr);
                return com.bytedance.adsdk.Lxb.ebl.Lxb(this.LD).Lxb(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb2 = lxbArr[i];
            if (lxb2 != null) {
                objArr[i] = lxb2.Lxb(map);
            }
            i++;
        }
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.LD.METHOD;
    }
}
