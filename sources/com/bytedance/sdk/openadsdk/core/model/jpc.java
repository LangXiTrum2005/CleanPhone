package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private List<Integer> lnr;
    private int mml;
    private int mo;
    private List<String> mzz;
    private int qdl;
    private int ud;
    private int wd;

    public JSONObject jpc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.qdl);
            jSONObject.put("interceptor_y", this.ud);
            if (this.lnr != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.lnr.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.mml);
            if (this.mzz != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.mzz.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.mo);
            jSONObject.put("boc_index", this.wd);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public List<String> lnr() {
        return this.mzz;
    }

    public int mml() {
        return this.qdl;
    }

    public List<Integer> mo() {
        return this.lnr;
    }

    public int mzz() {
        return this.ud;
    }

    public boolean qdl() {
        return this.mo == 1;
    }

    public int ud() {
        int i2 = this.wd;
        if (i2 >= 2) {
            return i2;
        }
        return 0;
    }

    public int wd() {
        return this.mml;
    }

    public void lnr(int i2) {
        this.qdl = i2;
    }

    public void mml(int i2) {
        this.ud = i2;
    }

    public void mzz(int i2) {
        this.mml = i2;
    }

    public void qdl(int i2) {
        this.mo = i2;
    }

    public void ud(int i2) {
        this.wd = i2;
    }

    public void qdl(List<String> list) {
        this.mzz = list;
    }

    public void ud(List<Integer> list) {
        this.lnr = list;
    }
}
