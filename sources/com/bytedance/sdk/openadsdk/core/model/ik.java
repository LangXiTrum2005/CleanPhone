package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public String di;
    public AdSlot fi;
    public int ik = 1;
    public ArrayList<Integer> ka;
    public int lr;
    public String ri;
    public int xha;

    public ArrayList<Integer> fi() {
        return this.ka;
    }

    public int ik() {
        return this.ik;
    }

    public AdSlot ka() {
        return this.fi;
    }

    public int lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public void ik(int i) {
        this.xha = i;
    }

    public void lr(int i) {
        this.ik = i;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(String str) {
        this.di = str;
    }

    public void ri(int i) {
        this.lr = i;
    }

    public void ri(AdSlot adSlot) {
        this.fi = adSlot;
    }

    public void ri(ArrayList<Integer> arrayList) {
        this.ka = arrayList;
    }

    public static void ri(ik ikVar) {
        int iLr;
        if (ikVar == null || ikVar.ka() == null || (iLr = ikVar.lr()) >= 0 || iLr == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.slm.ka.ri("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.model.ik.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", ik.this.ik());
                jSONObject.put("err_code", ik.this.lr());
                jSONObject.put("err_msg", ik.this.di);
                jSONObject.put("ext_from", ik.this.xha);
                jSONObject.put("server_res_str", ik.this.ri());
                if (ik.this.fi() != null && ik.this.fi().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) ik.this.fi()).toString());
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("rd_client_custom_error").ri(ik.this.ka().getDurationSlotType()).lr(jSONObject.toString());
            }
        });
    }
}
