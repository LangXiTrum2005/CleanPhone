package com.bytedance.adsdk.ugeno.QAg.lk;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.QAg.ZU.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb extends lk {
    private int ZU;

    public Lxb(Context context) {
        super(context);
        this.ZU = ViewCompat.MEASURED_STATE_MASK;
    }

    private String QAg(String str) {
        String strEbl = ebl(str);
        return TextUtils.isEmpty(strEbl) ? "" : "local://".concat(String.valueOf(strEbl));
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.ZU.lk, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        ((lk) this).Lxb = QAg(((lk) this).Lxb);
        super.LD();
        ((com.bytedance.adsdk.ugeno.QAg.ZU.Lxb) this.OY).setColorFilter(this.ZU);
        ((com.bytedance.adsdk.ugeno.QAg.ZU.Lxb) this.OY).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.ZU.lk, com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.ZU = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
        }
    }

    public abstract String ebl(String str);
}
