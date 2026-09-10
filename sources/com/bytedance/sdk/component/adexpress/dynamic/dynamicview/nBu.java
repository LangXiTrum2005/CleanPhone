package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends lc {
    public nBu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            ImageView imageView = new ImageView(context);
            this.IeN = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.ebl = this.OY;
        } else {
            this.IeN = new TextView(context);
        }
        this.IeN.setTag(3);
        addView(this.IeN, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.IeN);
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().OY() && dynamicRootView.getRenderRequest().CSn()) {
                return;
            }
            this.IeN.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            Drawable drawableLxb = com.bytedance.sdk.component.adexpress.ZU.lk.Lxb(getContext(), this.sLN);
            if (drawableLxb != null) {
                ((ImageView) this.IeN).setBackground(drawableLxb);
            }
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iZU = com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_reward_full_feedback");
            if (iZU > 0) {
                ((ImageView) this.IeN).setImageResource(iZU);
            }
            return true;
        }
        ((TextView) this.IeN).setText(getText());
        this.IeN.setTextAlignment(this.sLN.OY());
        ((TextView) this.IeN).setTextColor(this.sLN.ebl());
        ((TextView) this.IeN).setTextSize(this.sLN.JXs());
        this.IeN.setBackground(getBackgroundDrawable());
        if (this.sLN.HD()) {
            int iEK = this.sLN.eK();
            if (iEK > 0) {
                ((TextView) this.IeN).setLines(iEK);
                ((TextView) this.IeN).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.IeN).setMaxLines(1);
            ((TextView) this.IeN).setGravity(17);
            ((TextView) this.IeN).setEllipsize(TextUtils.TruncateAt.END);
        }
        this.IeN.setPadding((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.lk()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.LD()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.Lxb()));
        ((TextView) this.IeN).setGravity(17);
        return true;
    }

    public String getText() {
        return com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_feedback");
    }
}
