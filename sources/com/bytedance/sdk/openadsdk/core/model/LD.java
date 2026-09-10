package com.bytedance.sdk.openadsdk.core.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public AdSlot JXs;
    public int LD;
    public String Lxb;
    public ArrayList<Integer> ZU;
    public int lk = 1;

    public ArrayList<Integer> JXs() {
        return this.ZU;
    }

    public int LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public AdSlot ZU() {
        return this.JXs;
    }

    public int lk() {
        return this.lk;
    }

    public void LD(int i) {
        this.lk = i;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    public void Lxb(AdSlot adSlot) {
        this.JXs = adSlot;
    }

    public void Lxb(ArrayList<Integer> arrayList) {
        this.ZU = arrayList;
    }

    public static void Lxb(LD ld) {
        int iLD;
        if (ld == null || ld.ZU() == null || (iLD = ld.LD()) >= 0 || iLD == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.STP.lk.Lxb();
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.model.LD.1
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_FROM, LD.this.lk());
                jSONObject.put("err_code", LD.this.LD());
                jSONObject.put("server_res_str", LD.this.Lxb());
                if (LD.this.JXs() != null && LD.this.JXs().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) LD.this.JXs()).toString());
                }
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("rd_client_custom_error").Lxb(LD.this.ZU().getDurationSlotType()).LD(jSONObject.toString());
            }
        });
    }
}
