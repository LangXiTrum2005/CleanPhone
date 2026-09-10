package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private int xha;
    private String ri = "";
    private String lr = "";
    private String ik = "";
    private String ka = "";
    private double fi = -1.0d;
    private int di = -1;

    public int di() {
        return this.xha;
    }

    public int fi() {
        return this.di;
    }

    public String ik() {
        return this.ik;
    }

    public double ka() {
        return this.fi;
    }

    public String lr() {
        return this.lr;
    }

    public JSONObject mj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", lr());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, di());
            jSONObject.put("comment_num", fi());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, ri());
            jSONObject.put("package_name", ik());
            jSONObject.put("score", ka());
            jSONObject.put("app_category", xha());
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik(e.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public String ri() {
        return this.ri;
    }

    public String xha() {
        return this.ka;
    }

    public void ik(String str) {
        this.ik = str;
    }

    public void ka(String str) {
        this.ka = str;
    }

    public void lr(String str) {
        this.lr = str;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(int i) {
        this.xha = i;
    }

    public void ri(double d) {
        if (d >= 1.0d && d <= 5.0d) {
            this.fi = d;
        } else {
            this.fi = -1.0d;
        }
    }

    public void ri(int i) {
        if (i <= 0) {
            this.di = -1;
        } else {
            this.di = i;
        }
    }
}
