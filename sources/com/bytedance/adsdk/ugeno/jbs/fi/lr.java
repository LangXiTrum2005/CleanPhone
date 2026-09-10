package com.bytedance.adsdk.ugeno.jbs.fi;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik<ri> {
    private int akr;
    private float de;
    private int ri;
    private float xlq;
    private float zv;
    private static final int zxp = Color.parseColor("#FFC642");
    private static final int eu = Color.parseColor("#e3e3e4");

    public lr(Context context) {
        super(context);
        this.ri = zxp;
        this.akr = eu;
        this.de = 4.0f;
        this.zv = 20.0f;
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
        if (hcw()) {
            ((ri) this.fi).ri(this.de, this.ri, this.akr, this.zv, (int) this.xlq);
        } else {
            ((ri) this.fi).ri(this.de, this.ri, this.akr, this.zv, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.ri = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.akr = com.bytedance.adsdk.ugeno.xha.ri.ri(str2, eu);
                break;
            case "gap":
                this.xlq = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "size":
                this.zv = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 20.0f);
                break;
            case "score":
                this.de = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 4.0f);
                break;
        }
    }
}
