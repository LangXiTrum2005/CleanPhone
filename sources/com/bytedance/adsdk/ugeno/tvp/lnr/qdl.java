package com.bytedance.adsdk.ugeno.tvp.lnr;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.tvp.mml.lnr;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl extends lnr {
    private int kr;

    public qdl(Context context) {
        super(context);
        this.kr = -16777216;
    }

    private String jtx(String str) {
        String strRdp = rdp(str);
        return TextUtils.isEmpty(strRdp) ? "" : "local://".concat(String.valueOf(strRdp));
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mml.lnr
    public String lnr() {
        return k.d;
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mml.lnr, com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.kr = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
        }
    }

    public abstract String rdp(String str);

    @Override // com.bytedance.adsdk.ugeno.tvp.mml.lnr, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        ((lnr) this).qdl = jtx(((lnr) this).qdl);
        super.ud();
        ((com.bytedance.adsdk.ugeno.tvp.mml.qdl) this.mzz).setColorFilter(this.kr);
        ((com.bytedance.adsdk.ugeno.tvp.mml.qdl) this.mzz).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
