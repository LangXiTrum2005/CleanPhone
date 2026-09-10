package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lnr {
    protected String jpc;
    protected com.bytedance.adsdk.ugeno.mml.mo lnr;
    protected com.bytedance.adsdk.ugeno.mml.mo.qdl mml;
    protected String mo;
    protected Map<String, String> mzz;
    protected com.bytedance.adsdk.ugeno.mml.rq qdl;
    protected Context to;
    protected String tvp;
    protected com.bytedance.adsdk.ugeno.ud.lnr ud;
    protected String wd;

    public static class qdl {
        public static lnr qdl(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.mml.mo moVarQdl;
            com.bytedance.adsdk.ugeno.mml.mo.qdl qdlVarQdl;
            if (lnrVar == null || jSONObject == null || (moVarQdl = com.bytedance.adsdk.ugeno.mml.mo.qdl(jSONObject, jSONObject2)) == null || (qdlVarQdl = moVarQdl.qdl()) == null) {
                return null;
            }
            String strQdl = qdlVarQdl.qdl();
            if (TextUtils.equals(strQdl, "custom")) {
                mml mmlVar = new mml(context);
                mmlVar.qdl(lnrVar);
                mmlVar.qdl(moVarQdl);
                mmlVar.lnr();
                return mmlVar;
            }
            com.bytedance.adsdk.ugeno.mml.wd wdVarQdl = (TextUtils.isEmpty(strQdl) || TextUtils.equals(strQdl, "global")) ? com.bytedance.adsdk.ugeno.mml.to.qdl(qdlVarQdl.ud()) : com.bytedance.adsdk.ugeno.mml.to.qdl(qdlVarQdl.mzz());
            if (wdVarQdl == null) {
                return null;
            }
            lnr lnrVarQdl = wdVarQdl.qdl(context);
            lnrVarQdl.qdl(lnrVar);
            lnrVarQdl.qdl(moVarQdl);
            lnrVarQdl.lnr();
            return lnrVarQdl;
        }
    }

    public lnr(Context context) {
        this.to = context;
    }

    public void lnr() {
        this.mml = this.lnr.qdl();
        com.bytedance.adsdk.ugeno.mml.mo moVar = this.lnr;
        if (moVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.mml.mo.qdl qdlVarQdl = moVar.qdl();
        this.mml = qdlVarQdl;
        if (qdlVarQdl == null) {
            return;
        }
        this.mzz = qdlVarQdl.lnr();
        this.mo = this.mml.ud();
        this.wd = this.mml.qdl();
        this.jpc = this.mml.mml();
        this.tvp = this.mml.mzz();
    }

    public String mml() {
        return this.mo;
    }

    public com.bytedance.adsdk.ugeno.mml.mo mo() {
        return this.lnr;
    }

    public String mzz() {
        return this.jpc;
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.ud = lnrVar;
    }

    public abstract boolean qdl(Object... objArr);

    public void qdl(com.bytedance.adsdk.ugeno.mml.mo moVar) {
        this.lnr = moVar;
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.rq rqVar) {
        this.qdl = rqVar;
    }
}
