package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends lc {
    public QAg(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            this.IeN = new ImageView(context);
        } else {
            this.IeN = new com.bytedance.sdk.component.adexpress.lc.QAg(context);
        }
        this.IeN.setTag(3);
        addView(this.IeN, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.IeN);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            Drawable drawableLxb = com.bytedance.sdk.component.adexpress.ZU.lk.Lxb(getContext(), this.sLN);
            if (drawableLxb != null) {
                this.IeN.setBackground(drawableLxb);
            }
            int iZU = com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_close_btn");
            if (iZU > 0) {
                ((ImageView) this.IeN).setImageResource(iZU);
            }
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.kqm());
        View view = this.IeN;
        if (view instanceof com.bytedance.sdk.component.adexpress.lc.QAg) {
            ((com.bytedance.sdk.component.adexpress.lc.QAg) view).setRadius((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.IeN()));
            ((com.bytedance.sdk.component.adexpress.lc.QAg) this.IeN).setStrokeWidth(iLxb);
            ((com.bytedance.sdk.component.adexpress.lc.QAg) this.IeN).setStrokeColor(this.sLN.VVE());
            ((com.bytedance.sdk.component.adexpress.lc.QAg) this.IeN).setBgColor(this.sLN.KPU());
            ((com.bytedance.sdk.component.adexpress.lc.QAg) this.IeN).setDislikeColor(this.sLN.ebl());
            ((com.bytedance.sdk.component.adexpress.lc.QAg) this.IeN).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, 1.0f));
        }
        return true;
    }
}
