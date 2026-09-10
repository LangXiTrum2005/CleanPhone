package com.bytedance.sdk.openadsdk.core.co.lr.ka;

import android.content.Context;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.adsdk.ugeno.lr.ik<ri> {
    private int akr;
    private int de;
    private String ri;
    private float xlq;
    private float zv;

    public ik(Context context) {
        super(context);
        this.ri = "line";
        this.akr = com.bytedance.adsdk.ugeno.xha.ri.ri("#FFD813");
        this.de = com.bytedance.adsdk.ugeno.xha.ri.ri("rgba(0, 0, 0, 0.5)");
        this.zv = mj.ri(this.lr, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public ri ri() {
        ri riVar = new ri(this.lr);
        riVar.ri(this);
        return riVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        ((ri) this.fi).ri(this.ri).ri(this.akr).lr(this.de).lr(this.xlq).ri(this.zv);
    }

    public void xha(int i) {
        ((ri) this.fi).setAnimationDuration(i);
    }

    public void ri(int i) {
        ((ri) this.fi).setProgress(i);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.de = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "progressSize":
                this.zv = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f));
                break;
            case "progressType":
                this.ri = str2;
                break;
            case "progressColor":
                this.akr = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.xlq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                } else {
                    this.xlq = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                }
                break;
        }
    }
}
