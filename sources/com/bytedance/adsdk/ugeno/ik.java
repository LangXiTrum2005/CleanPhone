package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ik extends com.bytedance.adsdk.ugeno.lr.ri<com.bytedance.adsdk.ugeno.di.lr> {
    private int adz;
    private String akr;
    private float bzf;
    private boolean de;
    private String eu;
    private JSONArray evm;
    private float ezp;
    private float fb;
    private int jm;
    private float smj;
    private com.bytedance.adsdk.ugeno.lr.ik sz;
    private boolean tpb;
    private float xlq;
    private boolean zv;
    private float zxp;

    public ik(Context context) {
        super(context);
        this.de = true;
        this.zv = true;
        this.xlq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zxp = 2000.0f;
        this.eu = "normal";
        this.tpb = true;
        this.jm = Color.parseColor("#666666");
        this.adz = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        JSONArray jSONArray = this.evm;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).xha((int) this.fb).mj((int) this.bzf).jbs((int) this.smj).ik(this.tpb).fi(this.adz).di(this.jm).ik(this.eu).ka(this.de).fi(this.ezp).ri(this.zv).ka((int) this.zxp).ik(this.tpb);
        for (int i = 0; i < this.evm.length(); i++) {
            co coVar = new co(this.lr);
            coVar.ri(this.vt);
            com.bytedance.adsdk.ugeno.lr.ik<View> ikVarLr = coVar.lr(this.sz.ory(), (com.bytedance.adsdk.ugeno.lr.ik<View>) null);
            coVar.lr(this.evm.optJSONObject(i));
            ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ri(ikVarLr);
        }
        if (this.zv) {
            ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ik();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public View ri() {
        com.bytedance.adsdk.ugeno.di.lr lrVar = new com.bytedance.adsdk.ugeno.di.lr(this.lr);
        this.fi = lrVar;
        lrVar.ri((ka) this);
        return this.fi;
    }

    public void ri(com.bytedance.adsdk.ugeno.di.ik ikVar) {
        T t = this.fi;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.di.lr) t).setOnPageChangeListener(ikVar);
        }
    }

    public void ri(int i) {
        T t = this.fi;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.di.lr) t).aw(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.sz = ikVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.xlq = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "indicatorColor":
                this.jm = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "nextMargin":
                this.smj = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "effect":
                this.eu = str2;
                break;
            case "direction":
                this.akr = str2;
                break;
            case "indicator":
                this.tpb = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case "previousMargin":
                this.bzf = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "loop":
                this.de = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case "speed":
                this.zxp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 500.0f);
                break;
            case "pageCount":
                this.ezp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case "pageMargin":
                this.fb = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "indicatorSelectedColor":
                this.adz = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "autoplay":
                this.zv = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case "dataList":
                this.evm = com.bytedance.adsdk.ugeno.xha.lr.ri(str2, (JSONArray) null);
                break;
        }
    }
}
