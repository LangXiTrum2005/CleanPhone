package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class koa {
    private int jpc;
    private int lnr;
    private int mml;
    private String mo;
    private String mzz;
    private String qdl;
    private int rq;
    private String to;
    private String tvp;
    private String ud;
    private String wd;

    public boolean jpc() {
        return this.rq == 1;
    }

    public String lnr() {
        return this.tvp;
    }

    public String mml() {
        return this.mzz;
    }

    public void mo(String str) {
        this.qdl = str;
    }

    public String mzz() {
        return this.mo;
    }

    public String qdl() {
        return this.wd;
    }

    public JSONObject to() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.qdl)) {
                jSONObject.put("market_dpl", this.qdl);
            }
            if (!TextUtils.isEmpty(this.ud)) {
                jSONObject.put("market_dpl_auto", this.ud);
            }
            if (!TextUtils.isEmpty(this.mzz)) {
                jSONObject.put("market_pkg", this.mzz);
            }
            if (!TextUtils.isEmpty(this.wd)) {
                jSONObject.put("app_pkg", this.wd);
            }
            if (!TextUtils.isEmpty(this.mo)) {
                jSONObject.put("regex", this.mo);
            }
            jSONObject.put("exec_type", this.lnr);
            jSONObject.put("oem_vendor_type", this.mml);
            jSONObject.put("overlay", this.jpc);
            jSONObject.put("gp_card", this.rq);
            if (!TextUtils.isEmpty(this.tvp)) {
                jSONObject.put("caller_id", this.tvp);
            }
            if (!TextUtils.isEmpty(this.to)) {
                jSONObject.put("ext_map", this.to);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("OemModel", th.getMessage());
            return null;
        }
    }

    public String tvp() {
        return this.lnr == 2 ? this.ud : this.qdl;
    }

    public int ud() {
        return this.jpc;
    }

    public void wd(String str) {
        this.ud = str;
    }

    public void lnr(String str) {
        this.to = str;
    }

    public void mml(String str) {
        this.mzz = str;
    }

    public int mo() {
        return this.mml;
    }

    public void mzz(String str) {
        this.mo = str;
    }

    public void qdl(String str) {
        this.wd = str;
    }

    public void ud(int i2) {
        this.jpc = i2;
    }

    public boolean wd() {
        return this.mml == 1;
    }

    public void lnr(int i2) {
        this.lnr = i2;
    }

    public void mml(int i2) {
        this.mml = i2;
    }

    public void qdl(int i2) {
        this.rq = i2;
    }

    public void ud(String str) {
        this.tvp = str;
    }

    public static koa qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        koa koaVar = new koa();
        try {
            koaVar.mo(jSONObject.optString("market_dpl", ""));
            koaVar.wd(jSONObject.optString("market_dpl_auto", ""));
            koaVar.lnr(jSONObject.optInt("exec_type", 0));
            koaVar.mml(jSONObject.optInt("oem_vendor_type", 0));
            koaVar.mml(jSONObject.optString("market_pkg", ""));
            koaVar.mzz(jSONObject.optString("regex", ""));
            koaVar.ud(jSONObject.optInt("overlay", 1));
            koaVar.ud(jSONObject.optString("caller_id", ""));
            koaVar.lnr(jSONObject.optString("ext_map", null));
            koaVar.qdl(jSONObject.optInt("gp_card", 0));
            koaVar.qdl(jSONObject.optString("app_pkg", ""));
            return koaVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("OemModel", th.getMessage());
            return koaVar;
        }
    }

    public void qdl(Intent intent) {
        if (TextUtils.isEmpty(this.to)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.to);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
