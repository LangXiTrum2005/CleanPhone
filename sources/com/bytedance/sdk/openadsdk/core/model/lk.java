package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private int ebl;
    private String Lxb = "";
    private String LD = "";
    private String lk = "";
    private String ZU = "";
    private double JXs = -1.0d;
    private int lc = -1;

    public int JXs() {
        return this.lc;
    }

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public JSONObject OY() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", LD());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, lc());
            jSONObject.put("comment_num", JXs());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, Lxb());
            jSONObject.put("package_name", lk());
            jSONObject.put("score", ZU());
            jSONObject.put("app_category", ebl());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.LD(e.toString());
        }
        return jSONObject;
    }

    public double ZU() {
        return this.JXs;
    }

    public String ebl() {
        return this.ZU;
    }

    public int lc() {
        return this.ebl;
    }

    public String lk() {
        return this.lk;
    }

    public void LD(String str) {
        this.LD = str;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void ZU(String str) {
        this.ZU = str;
    }

    public void lk(String str) {
        this.lk = str;
    }

    public void LD(int i) {
        this.ebl = i;
    }

    public void Lxb(double d) {
        if (d >= 1.0d && d <= 5.0d) {
            this.JXs = d;
        } else {
            this.JXs = -1.0d;
        }
    }

    public void Lxb(int i) {
        if (i <= 0) {
            this.lc = -1;
        } else {
            this.lc = i;
        }
    }
}
