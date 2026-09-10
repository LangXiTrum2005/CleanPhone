package com.bytedance.sdk.openadsdk.core.co.lr;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.jbs.di.lr {
    private String de;
    private String zv;

    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr
    public void aw(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.zv) || TextUtils.equals(this.zv, "null")) {
            this.zv = "";
        }
        if (TextUtils.isEmpty(this.de) || TextUtils.equals(this.de, "null")) {
            this.de = "";
        }
        String str2 = this.de + str + this.zv;
        ((com.bytedance.adsdk.ugeno.jbs.di.lr) this).ri = str2;
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setText(str2);
        try {
            float f = this.oh ? this.igq : this.su;
            float f2 = this.xd ? this.zf : this.su;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).getPaint().measureText(((com.bytedance.adsdk.ugeno.jbs.di.lr) this).ri);
            if (fMeasureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fi((int) (f + fMeasureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        if (TextUtils.isEmpty(this.zv) || TextUtils.equals(this.zv, "null")) {
            this.zv = "";
        }
        if (TextUtils.isEmpty(this.de) || TextUtils.equals(this.de, "null")) {
            this.de = "";
        }
        String str = this.de + this.zv;
        ((com.bytedance.adsdk.ugeno.jbs.di.lr) this).ri = str;
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setText(str);
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr, com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.de = str2;
        } else if (str.equals("after")) {
            this.zv = str2;
        }
    }
}
