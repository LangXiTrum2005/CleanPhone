package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private String fs;
    private double jpc;
    lnr lnr;
    private String mml;
    private String mo;
    private String mzz;
    final com.bytedance.sdk.openadsdk.core.model.mml qdl = new com.bytedance.sdk.openadsdk.core.model.mml();
    private String rq = "VAST_ACTION_BUTTON";
    private int to;
    private int tvp;
    ud ud;
    private String wd;

    private JSONArray bjy() {
        Set<to> setUd = this.qdl.ud();
        if (setUd == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (to toVar : setUd) {
            if (toVar != null) {
                jSONArray.put(toVar.mml());
            }
        }
        return jSONArray;
    }

    public Set<to> exu() {
        return this.qdl.ud();
    }

    public int fs() {
        return this.to;
    }

    public double jpc() {
        return this.jpc;
    }

    public lnr lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public String mzz() {
        return this.mzz;
    }

    public mml qdl() {
        return this.qdl.qdl();
    }

    public com.bytedance.sdk.openadsdk.core.model.mml rdp() {
        return this.qdl;
    }

    public int rq() {
        return this.tvp;
    }

    public JSONObject to() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mml mmlVarQdl = this.qdl.qdl();
        if (mmlVarQdl != null) {
            jSONObject.put("videoTrackers", mmlVarQdl.qdl());
        }
        ud udVar = this.ud;
        if (udVar != null) {
            jSONObject.put("vastIcon", udVar.qdl());
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            jSONObject.put("endCard", lnrVar.qdl());
        }
        jSONObject.put("title", this.mml);
        jSONObject.put("description", this.mzz);
        jSONObject.put("clickThroughUrl", this.mo);
        jSONObject.put("videoUrl", this.wd);
        jSONObject.put("videDuration", this.jpc);
        jSONObject.put("videoWidth", this.tvp);
        jSONObject.put("videoHeight", this.to);
        jSONObject.put("viewabilityVendor", bjy());
        return jSONObject;
    }

    public String tvp() {
        lnr lnrVar;
        String str = this.mo;
        if (!TextUtils.isEmpty(this.fs)) {
            String str2 = this.fs;
            this.fs = null;
            return str2;
        }
        String str3 = this.rq;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            ud udVar = this.ud;
            if (udVar != null && !TextUtils.isEmpty(udVar.jpc)) {
                str = this.ud.jpc;
            }
        } else if (str3.equals("VAST_END_CARD") && (lnrVar = this.lnr) != null && !TextUtils.isEmpty(lnrVar.jpc)) {
            str = this.lnr.jpc;
        }
        this.rq = "VAST_ACTION_BUTTON";
        return str;
    }

    public ud ud() {
        return this.ud;
    }

    public String wd() {
        return this.wd;
    }

    public void lnr(String str) {
        this.mo = str;
    }

    public void mml(String str) {
        this.wd = str;
    }

    public void mo(String str) {
        this.fs = str;
    }

    public void mzz(String str) {
        this.rq = str;
    }

    public void qdl(ud udVar) {
        if (udVar != null) {
            udVar.qdl(this.wd);
        }
        this.ud = udVar;
    }

    public void ud(String str) {
        this.mzz = str;
    }

    public void ud(int i2) {
        this.to = i2;
    }

    public void qdl(lnr lnrVar) {
        if (lnrVar != null) {
            lnrVar.qdl(this.wd);
        }
        this.lnr = lnrVar;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public void qdl(double d) {
        this.jpc = d;
    }

    public static qdl qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        mml mmlVarQdl = qdlVar.qdl.qdl();
        if (mmlVarQdl == null) {
            mmlVarQdl = new mml();
            qdlVar.qdl.qdl(mmlVarQdl);
        }
        mmlVarQdl.qdl(jSONObject.optJSONObject("videoTrackers"));
        qdlVar.ud = ud.qdl(jSONObject.optJSONObject("vastIcon"));
        qdlVar.lnr = lnr.ud(jSONObject.optJSONObject("endCard"));
        qdlVar.mml = jSONObject.optString("title");
        qdlVar.mzz = jSONObject.optString("description");
        qdlVar.mo = jSONObject.optString("clickThroughUrl");
        qdlVar.wd = jSONObject.optString("videoUrl");
        qdlVar.jpc = jSONObject.optDouble("videDuration");
        qdlVar.tvp = jSONObject.optInt("videoWidth");
        qdlVar.tvp = jSONObject.optInt("videoHeight");
        Set<to> setUd = qdlVar.qdl.ud();
        if (setUd == null) {
            setUd = new HashSet<>();
            qdlVar.qdl.qdl(setUd);
        }
        setUd.addAll(to.qdl(jSONObject.optJSONArray("viewabilityVendor")));
        return qdlVar;
    }

    public void qdl(ljh ljhVar) {
        this.qdl.qdl(ljhVar);
        ud udVar = this.ud;
        if (udVar != null) {
            udVar.qdl(ljhVar);
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.qdl(ljhVar);
        }
    }

    public void qdl(int i2) {
        this.tvp = i2;
    }

    public void qdl(Set<to> set) {
        this.qdl.ud(set);
    }
}
