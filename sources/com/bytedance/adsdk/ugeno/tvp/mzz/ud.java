package com.bytedance.adsdk.ugeno.tvp.mzz;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.ud.lnr;

/* JADX INFO: loaded from: classes.dex */
public class ud extends lnr<qdl> {
    private int dps;
    private float iw;
    private float kr;
    private float lme;
    private int qdl;
    private static final int xx = Color.parseColor("#FFC642");
    private static final int syy = Color.parseColor("#e3e3e4");

    public ud(Context context) {
        super(context);
        this.qdl = xx;
        this.dps = syy;
        this.iw = 4.0f;
        this.lme = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public qdl qdl() {
        qdl qdlVar = new qdl(this.ud);
        qdlVar.qdl(this);
        return qdlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        if (kdv()) {
            ((qdl) this.mzz).qdl(this.iw, this.qdl, this.dps, this.lme, (int) this.kr);
        } else {
            ((qdl) this.mzz).qdl(this.iw, this.qdl, this.dps, this.lme, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.qdl = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.dps = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, syy);
                break;
            case "gap":
                this.kr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "size":
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 20.0f);
                break;
            case "score":
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 4.0f);
                break;
        }
    }
}
