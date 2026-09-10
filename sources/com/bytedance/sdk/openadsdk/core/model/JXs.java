package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private List<String> JXs;
    private int LD;
    private int Lxb;
    private int ZU;
    private int ebl;
    private int lc;
    private List<Integer> lk;

    public int JXs() {
        return this.LD;
    }

    public int LD() {
        int i = this.ebl;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public boolean Lxb() {
        return this.lc == 1;
    }

    public JSONObject OY() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.Lxb);
            jSONObject.put("interceptor_y", this.LD);
            if (this.lk != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.lk.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.ZU);
            if (this.JXs != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.JXs.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.lc);
            jSONObject.put("boc_index", this.ebl);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
        }
        return jSONObject;
    }

    public int ZU() {
        return this.Lxb;
    }

    public int ebl() {
        return this.ZU;
    }

    public List<Integer> lc() {
        return this.lk;
    }

    public List<String> lk() {
        return this.JXs;
    }

    public void JXs(int i) {
        this.ZU = i;
    }

    public void LD(int i) {
        this.ebl = i;
    }

    public void Lxb(int i) {
        this.lc = i;
    }

    public void ZU(int i) {
        this.LD = i;
    }

    public void lk(int i) {
        this.Lxb = i;
    }

    public void LD(List<Integer> list) {
        this.lk = list;
    }

    public void Lxb(List<String> list) {
        this.JXs = list;
    }
}
