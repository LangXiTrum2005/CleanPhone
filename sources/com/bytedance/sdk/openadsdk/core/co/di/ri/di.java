package com.bytedance.sdk.openadsdk.core.co.di.ri;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.co.di.xha;
import com.bytedance.sdk.openadsdk.core.jbs.ay;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends xha {
    private static Boolean dw;
    private float fr;
    private boolean igq;
    private float su;
    private final lr zf;

    public di(Context context, wjv wjvVar, boolean z, com.bytedance.sdk.openadsdk.core.co.di.ri riVar, ViewGroup viewGroup, float f, float f2, boolean z2, String str) {
        super(context, wjvVar, z, riVar, viewGroup);
        this.zf = lr.ri.ri(wjvVar, riVar);
        this.uq = str;
        this.fr = f;
        this.su = f2;
        this.igq = z2;
    }

    private boolean aw() {
        return this.fi != null && bgr() && dw.ik(this.fi);
    }

    private boolean bgr() {
        wjv wjvVar = this.fi;
        if (wjvVar == null) {
            return false;
        }
        int iGo = wjvVar.go();
        boolean z = iGo == 7 || iGo == 8;
        int iNd = this.fi.nd();
        return z && (iNd == 43 || iNd == 44);
    }

    private JSONObject ri(float f, float f2, boolean z, wjv wjvVar, String str) {
        JSONObject jSONObjectRi = com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(f, f2, z, wjvVar, str);
        this.ay = jSONObjectRi;
        if (jSONObjectRi == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectRi.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", co());
            }
            JSONObject jSONObjectOptJSONObject2 = this.ay.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", wjv.fi(this.fi));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", aw());
                jSONObjectOptJSONObject2.put("isFeedDraw", bgr());
            }
            lr lrVar = this.zf;
            if (lrVar != null) {
                lrVar.ri(this.ay);
            }
        } catch (Exception unused) {
        }
        return this.ay;
    }

    public float co() {
        wjv wjvVar = this.fi;
        if (wjvVar == null) {
            return 1.0f;
        }
        int iVz = wjvVar.vz();
        if (iVz == 3) {
            return 1.91f;
        }
        if (iVz == 5) {
            return 1.78f;
        }
        if (iVz == 15 || iVz == 173) {
            return 0.5625f;
        }
        if (iVz != 33 && iVz != 50) {
            if (iVz == 1010) {
                return 1.2f;
            }
            if (iVz == 1011) {
                return 6.4f;
            }
            if (iVz == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka, com.bytedance.sdk.component.adexpress.lr.ka
    public int ik() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.xha, com.bytedance.sdk.openadsdk.core.co.di.ka
    public JSONObject lr() {
        return ri(this.fr, this.su, this.igq, this.fi, this.uq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.xha, com.bytedance.sdk.openadsdk.core.co.di.ka
    public com.bytedance.adsdk.ugeno.lr.ik mj() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return null;
        }
        return ikVar.xha("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.xha, com.bytedance.sdk.openadsdk.core.co.di.ka
    public JSONObject ri() {
        lr lrVar = this.zf;
        if (lrVar != null) {
            try {
                return new JSONObject(lrVar.ri());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.xha
    public JSONObject ri(oh ohVar) {
        lr lrVar = this.zf;
        if (lrVar != null) {
            return lrVar.lr();
        }
        return null;
    }

    public static boolean ri(String str) {
        if (dw == null) {
            dw = Boolean.valueOf(com.bytedance.sdk.openadsdk.wjv.fi.ri("express_backup_type", 0) == 1);
        }
        return dw.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || ay.lr(str) || (TextUtils.equals(str, "open_ad") && com.bytedance.sdk.openadsdk.component.xha.ri.sf()));
    }
}
