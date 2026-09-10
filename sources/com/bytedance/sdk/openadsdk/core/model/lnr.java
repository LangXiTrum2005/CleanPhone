package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    public int lnr = 1;
    public ArrayList<Integer> mml;
    public String mo;
    public AdSlot mzz;
    public String qdl;
    public int ud;
    public int wd;

    public int lnr() {
        return this.lnr;
    }

    public AdSlot mml() {
        return this.mzz;
    }

    public ArrayList<Integer> mzz() {
        return this.mml;
    }

    public String qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.ud;
    }

    public void lnr(int i2) {
        this.wd = i2;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(int i2) {
        this.lnr = i2;
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(AdSlot adSlot) {
        this.mzz = adSlot;
    }

    public void qdl(ArrayList<Integer> arrayList) {
        this.mml = arrayList;
    }

    public static void qdl(lnr lnrVar) {
        int iUd;
        if (lnrVar == null || lnrVar.mml() == null || (iUd = lnrVar.ud()) >= 0 || iUd == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.model.lnr.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", lnr.this.lnr());
                jSONObject.put("err_code", lnr.this.ud());
                jSONObject.put("err_msg", lnr.this.mo);
                jSONObject.put("ext_from", lnr.this.wd);
                jSONObject.put("server_res_str", lnr.this.qdl());
                if (lnr.this.mzz() != null && lnr.this.mzz().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) lnr.this.mzz()).toString());
                }
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("rd_client_custom_error").qdl(lnr.this.mml().getDurationSlotType()).ud(jSONObject.toString());
            }
        });
    }
}
