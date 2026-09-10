package com.bytedance.sdk.openadsdk.core.rq.ud.lnr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.wd.jpc;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends com.bytedance.adsdk.ugeno.ud.lnr<qdl> {
    private int dps;
    private int iw;
    private float kr;
    private float lme;
    private String qdl;

    public lnr(Context context) {
        super(context);
        this.qdl = "line";
        this.dps = com.bytedance.adsdk.ugeno.wd.qdl.qdl("#FFD813");
        this.iw = com.bytedance.adsdk.ugeno.wd.qdl.qdl("rgba(0, 0, 0, 0.5)");
        this.lme = jpc.qdl(this.ud, 1.0f);
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
        ((qdl) this.mzz).qdl(this.qdl).qdl(this.dps).ud(this.iw).ud(this.kr).qdl(this.lme);
    }

    public void wd(int i2) {
        ((qdl) this.mzz).setAnimationDuration(i2);
    }

    public void qdl(int i2) {
        ((qdl) this.mzz).setProgress(i2);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.iw = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "progressSize":
                this.lme = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f));
                break;
            case "progressType":
                this.qdl = str2;
                break;
            case "progressColor":
                this.dps = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f) <= 0.0f) {
                    this.kr = 0.0f;
                    break;
                } else {
                    this.kr = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                    break;
                }
                break;
        }
    }
}
