package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends lc {
    public ebl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.Lxb lxb = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.Lxb(context);
        this.IeN = lxb;
        lxb.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (TextUtils.equals("download-progress-button", this.NXR.nBu().LD()) && TextUtils.isEmpty(this.sLN.nBu())) {
            this.IeN.setVisibility(4);
            return true;
        }
        this.IeN.setTextAlignment(this.sLN.OY());
        ((TextView) this.IeN).setText(this.sLN.nBu());
        ((TextView) this.IeN).setTextColor(this.sLN.ebl());
        ((TextView) this.IeN).setTextSize(this.sLN.JXs());
        ((TextView) this.IeN).setGravity(17);
        ((TextView) this.IeN).setIncludeFontPadding(false);
        if ("fillButton".equals(this.NXR.nBu().LD())) {
            this.IeN.setPadding(0, 0, 0, 0);
        } else {
            this.IeN.setPadding(this.sLN.lk(), this.sLN.LD(), this.sLN.ZU(), this.sLN.Lxb());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.ZU.LD() || !"fillButton".equals(this.NXR.nBu().LD())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.IeN).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.IeN).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.sLN.brP() * 2;
        widgetLayoutParams.height -= this.sLN.brP() * 2;
        widgetLayoutParams.topMargin = this.sLN.brP() + widgetLayoutParams.topMargin;
        int iBrP = this.sLN.brP() + widgetLayoutParams.leftMargin;
        widgetLayoutParams.leftMargin = iBrP;
        widgetLayoutParams.setMarginStart(iBrP);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }
}
