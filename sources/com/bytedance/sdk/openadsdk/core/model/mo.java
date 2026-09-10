package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private int wd;
    private String qdl = "";
    private String ud = "";
    private String lnr = "";
    private String mml = "";
    private double mzz = -1.0d;
    private int mo = -1;

    public JSONObject jpc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", ud());
            jSONObject.put("app_size", mo());
            jSONObject.put("comment_num", mzz());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, qdl());
            jSONObject.put("package_name", lnr());
            jSONObject.put("score", mml());
            jSONObject.put("app_category", wd());
            return jSONObject;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.lnr(e2.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public String lnr() {
        return this.lnr;
    }

    public double mml() {
        return this.mzz;
    }

    public int mo() {
        return this.wd;
    }

    public int mzz() {
        return this.mo;
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.ud;
    }

    public String wd() {
        return this.mml;
    }

    public void lnr(String str) {
        this.lnr = str;
    }

    public void mml(String str) {
        this.mml = str;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.ud = str;
    }

    public void qdl(double d) {
        if (d >= 1.0d && d <= 5.0d) {
            this.mzz = d;
        } else {
            this.mzz = -1.0d;
        }
    }

    public void ud(int i2) {
        this.wd = i2;
    }

    public void qdl(int i2) {
        if (i2 <= 0) {
            this.mo = -1;
        } else {
            this.mo = i2;
        }
    }
}
