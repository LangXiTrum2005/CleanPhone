package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.CSn;

/* JADX INFO: loaded from: classes2.dex */
public class JVA implements ebl<ViewGroup> {
    private final FrameLayout LD;
    private final com.bytedance.sdk.component.adexpress.lc.nBu Lxb;

    public JVA(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.lc.nBu nbu = new com.bytedance.sdk.component.adexpress.lc.nBu(context);
        this.Lxb = nbu;
        nbu.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.LD = frameLayout;
        frameLayout.addView(nbu, new FrameLayout.LayoutParams(-2, -2));
        double dAe = eblVar.ae();
        dAe = dAe == 0.0d ? 1.0d : dAe;
        double dXr = eblVar.xr();
        double d = dXr != 0.0d ? dXr : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) jXs.getDynamicWidth()) * 0.32d * dAe), (int) (((double) jXs.getDynamicWidth()) * 0.32d * d));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            Lxb(context, frameLayout, eblVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, eblVar.Of() > 0 ? eblVar.Of() : com.bytedance.sdk.component.adexpress.ZU.LD() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void Lxb(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -CSn.Lxb(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(com.bytedance.sdk.component.utils.tD.LD(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, CSn.Lxb(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(com.bytedance.sdk.component.utils.tD.LD(context, "tt_splash_brush_mask_hint")));
        if (eblVar != null && !TextUtils.isEmpty(eblVar.Ns())) {
            textView2.setText(eblVar.Ns());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.lc();
        ViewParent parent = this.LD.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.LD);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public ViewGroup lk() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.OY();
    }
}
