package com.bytedance.adsdk.ugeno.jbs.ik;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.jbs.ka.ik;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri extends ik {
    private int xlq;

    public ri(Context context) {
        super(context);
        this.xlq = -16777216;
    }

    private String vr(String str) {
        String strAw = aw(str);
        return TextUtils.isEmpty(strAw) ? "" : "local://".concat(String.valueOf(strAw));
    }

    public abstract String aw(String str);

    @Override // com.bytedance.adsdk.ugeno.jbs.ka.ik
    public String ik() {
        return "drawable";
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.ka.ik, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        ((ik) this).ri = vr(((ik) this).ri);
        super.lr();
        ((com.bytedance.adsdk.ugeno.jbs.ka.ri) this.fi).setColorFilter(this.xlq);
        ((com.bytedance.adsdk.ugeno.jbs.ka.ri) this.fi).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.ka.ik, com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.xlq = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
        }
    }
}
