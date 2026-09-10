package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class rdp extends mo {
    public rdp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        ImageView imageView = new ImageView(context);
        this.bjy = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            this.jpc = Math.max(dynamicRootView.getLogoUnionHeight(), this.jpc);
        }
        addView(this.bjy, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.rdp;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.rdp.getRenderRequest().bqt())) {
            setVisibility(8);
        } else {
            String strBqt = this.rdp.getRenderRequest().bqt();
            if (strBqt.equals("logo")) {
                ((ImageView) this.bjy).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.mzz.to toVarMzz = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mzz().qdl(strBqt).qdl(this.wd).ud(this.jpc).mml(this.wd).mzz(this.jpc);
                String strRdp = this.rdp.getRenderRequest().rdp();
                if (!TextUtils.isEmpty(strRdp)) {
                    toVarMzz.ud(strRdp);
                }
                toVarMzz.qdl((ImageView) this.bjy);
            }
        }
        ((ImageView) this.bjy).setColorFilter(this.fs.wd(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
