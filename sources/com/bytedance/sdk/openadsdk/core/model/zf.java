package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zf {
    private String di;
    private String fi;
    private int ik;
    private String jbs;
    private int ka;
    private String lr;
    private int mj;
    private String qt;
    private String ri;
    private int sf;
    private String xha;

    public void di(String str) {
        this.ri = str;
    }

    public String fi() {
        return this.di;
    }

    public String ik() {
        return this.jbs;
    }

    public boolean jbs() {
        return this.sf == 1;
    }

    public String ka() {
        return this.fi;
    }

    public int lr() {
        return this.mj;
    }

    public boolean mj() {
        return this.ka == 2;
    }

    public String qt() {
        return this.ik == 2 ? this.lr : this.ri;
    }

    public String ri() {
        return this.xha;
    }

    public JSONObject sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.ri)) {
                jSONObject.put("market_dpl", this.ri);
            }
            if (!TextUtils.isEmpty(this.lr)) {
                jSONObject.put("market_dpl_auto", this.lr);
            }
            if (!TextUtils.isEmpty(this.fi)) {
                jSONObject.put("market_pkg", this.fi);
            }
            if (!TextUtils.isEmpty(this.xha)) {
                jSONObject.put("app_pkg", this.xha);
            }
            if (!TextUtils.isEmpty(this.di)) {
                jSONObject.put("regex", this.di);
            }
            jSONObject.put("exec_type", this.ik);
            jSONObject.put("oem_vendor_type", this.ka);
            jSONObject.put("overlay", this.mj);
            jSONObject.put("gp_card", this.sf);
            if (!TextUtils.isEmpty(this.jbs)) {
                jSONObject.put("caller_id", this.jbs);
            }
            if (!TextUtils.isEmpty(this.qt)) {
                jSONObject.put("ext_map", this.qt);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("OemModel", th.getMessage());
            return null;
        }
    }

    public void xha(String str) {
        this.lr = str;
    }

    public int di() {
        return this.ka;
    }

    public void fi(String str) {
        this.di = str;
    }

    public void ik(String str) {
        this.qt = str;
    }

    public void ka(String str) {
        this.fi = str;
    }

    public void lr(int i) {
        this.mj = i;
    }

    public void ri(String str) {
        this.xha = str;
    }

    public boolean xha() {
        return this.ka == 1;
    }

    public void ik(int i) {
        this.ik = i;
    }

    public void ka(int i) {
        this.ka = i;
    }

    public void lr(String str) {
        this.jbs = str;
    }

    public void ri(int i) {
        this.sf = i;
    }

    public static zf ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zf zfVar = new zf();
        try {
            zfVar.di(jSONObject.optString("market_dpl", ""));
            zfVar.xha(jSONObject.optString("market_dpl_auto", ""));
            zfVar.ik(jSONObject.optInt("exec_type", 0));
            zfVar.ka(jSONObject.optInt("oem_vendor_type", 0));
            zfVar.ka(jSONObject.optString("market_pkg", ""));
            zfVar.fi(jSONObject.optString("regex", ""));
            zfVar.lr(jSONObject.optInt("overlay", 1));
            zfVar.lr(jSONObject.optString("caller_id", ""));
            zfVar.ik(jSONObject.optString("ext_map", null));
            zfVar.ri(jSONObject.optInt("gp_card", 0));
            zfVar.ri(jSONObject.optString("app_pkg", ""));
            return zfVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("OemModel", th.getMessage());
            return zfVar;
        }
    }

    public void ri(Intent intent) {
        if (TextUtils.isEmpty(this.qt)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.qt);
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
