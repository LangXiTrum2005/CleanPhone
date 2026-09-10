package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class NXR extends lc {
    public NXR(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        TextView textView = new TextView(context);
        this.IeN = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
    }

    private boolean Lxb() {
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.sLN.LD) && this.sLN.LD.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        this.IeN.setTextAlignment(this.sLN.OY());
        ((TextView) this.IeN).setTextColor(this.sLN.ebl());
        ((TextView) this.IeN).setTextSize(this.sLN.JXs());
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            ((TextView) this.IeN).setIncludeFontPadding(false);
            ((TextView) this.IeN).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.OY) - this.sLN.LD()) - this.sLN.Lxb()) - 0.5f, this.sLN.JXs()));
            ((TextView) this.IeN).setText(com.bytedance.sdk.component.utils.tD.Lxb(getContext(), "tt_logo_en"));
            return true;
        }
        if (!Lxb()) {
            ((TextView) this.IeN).setText(com.bytedance.sdk.component.utils.tD.LD(getContext(), "tt_logo_cn"));
            return true;
        }
        if (com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD()) {
            ((TextView) this.IeN).setText(com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.Lxb());
            return true;
        }
        ((TextView) this.IeN).setText(com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.Lxb(this.sLN.LD));
        return true;
    }
}
