package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends com.bytedance.adsdk.ugeno.QAg.lc.LD {
    private String ZU;
    private String lk;

    public LD(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        if (TextUtils.isEmpty(this.ZU) || TextUtils.equals(this.ZU, "null")) {
            this.ZU = "";
        }
        if (TextUtils.isEmpty(this.lk) || TextUtils.equals(this.lk, "null")) {
            this.lk = "";
        }
        String str = this.lk + this.ZU;
        ((com.bytedance.adsdk.ugeno.QAg.lc.LD) this).Lxb = str;
        ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setText(str);
        ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD, com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.lk = str2;
        } else if (str.equals("after")) {
            this.ZU = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD
    public void ebl(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.ZU) || TextUtils.equals(this.ZU, "null")) {
            this.ZU = "";
        }
        if (TextUtils.isEmpty(this.lk) || TextUtils.equals(this.lk, "null")) {
            this.lk = "";
        }
        String str2 = this.lk + str + this.ZU;
        ((com.bytedance.adsdk.ugeno.QAg.lc.LD) this).Lxb = str2;
        ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setText(str2);
        try {
            float f = this.nJ ? this.nE : this.Ivz;
            float f2 = this.le ? this.xan : this.Ivz;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).getPaint().measureText(((com.bytedance.adsdk.ugeno.QAg.lc.LD) this).Lxb);
            if (fMeasureText >= 0.0f) {
                JXs((int) (f + fMeasureText + f2));
            }
        } catch (Throwable unused) {
        }
    }
}
