package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.wd.jpc;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class lnr extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.mo.ud> {
    private int ca;
    private String dps;
    private float fge;
    private int gsp;
    private com.bytedance.adsdk.ugeno.ud.lnr hd;
    private JSONArray hr;
    private boolean iw;
    private float kr;
    private boolean lme;
    private float se;
    private String syy;
    private boolean tdy;
    private float vc;
    private float xx;
    private float ygv;

    public lnr(Context context) {
        super(context);
        this.iw = true;
        this.lme = true;
        this.kr = 0.0f;
        this.xx = 2000.0f;
        this.syy = "normal";
        this.tdy = true;
        this.ca = Color.parseColor("#666666");
        this.gsp = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        JSONArray jSONArray = this.hr;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).wd((int) this.se).jpc((int) this.vc).tvp((int) this.fge).lnr(this.tdy).mzz(this.gsp).mo(this.ca).lnr(this.syy).mml(this.iw).mzz(this.ygv).qdl(this.lme).mml((int) this.xx).lnr(this.tdy);
        for (int i2 = 0; i2 < this.hr.length(); i2++) {
            fs fsVar = new fs(this.ud);
            fsVar.qdl(this.zvv);
            com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarUd = fsVar.ud(this.hd.rc(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) null);
            fsVar.ud(this.hr.optJSONObject(i2));
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(lnrVarUd);
        }
        if (this.lme) {
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public View qdl() {
        com.bytedance.adsdk.ugeno.mo.ud udVar = new com.bytedance.adsdk.ugeno.mo.ud(this.ud);
        this.mzz = udVar;
        udVar.qdl((mml) this);
        return this.mzz;
    }

    public void qdl(com.bytedance.adsdk.ugeno.mo.lnr lnrVar) {
        T t = this.mzz;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.mo.ud) t).setOnPageChangeListener(lnrVar);
        }
    }

    public void qdl(int i2) {
        T t = this.mzz;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.mo.ud) t).exu(i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.hd = lnrVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.kr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "indicatorColor":
                this.ca = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "nextMargin":
                this.fge = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "effect":
                this.syy = str2;
                break;
            case "direction":
                this.dps = str2;
                break;
            case "indicator":
                this.tdy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "previousMargin":
                this.vc = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "loop":
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "speed":
                this.xx = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 500.0f);
                break;
            case "pageCount":
                this.ygv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case "pageMargin":
                this.se = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.gsp = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "autoplay":
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "dataList":
                this.hr = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONArray) null);
                break;
        }
    }
}
