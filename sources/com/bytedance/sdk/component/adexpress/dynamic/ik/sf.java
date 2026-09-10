package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dw;
import com.bytedance.sdk.component.utils.uq;

/* JADX INFO: loaded from: classes2.dex */
public class sf implements xha<ViewGroup> {
    private final FrameLayout lr;
    private final com.bytedance.sdk.component.adexpress.di.qt ri;

    public sf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.di.qt qtVar = new com.bytedance.sdk.component.adexpress.di.qt(context);
        this.ri = qtVar;
        qtVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.lr = frameLayout;
        frameLayout.addView(qtVar, new FrameLayout.LayoutParams(-2, -2));
        double dAac = xhaVar.aac();
        dAac = dAac == 0.0d ? 1.0d : dAac;
        double dXe = xhaVar.xe();
        double d = dXe != 0.0d ? dXe : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) fiVar.getDynamicWidth()) * 0.32d * dAac), (int) (((double) fiVar.getDynamicWidth()) * 0.32d * d));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            ri(context, frameLayout, xhaVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, xhaVar.fe() > 0 ? xhaVar.fe() : com.bytedance.sdk.component.adexpress.ka.lr() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void ri(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -dw.ri(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(uq.lr(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, dw.ri(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(uq.lr(context, "tt_splash_brush_mask_hint")));
        if (xhaVar != null && !TextUtils.isEmpty(xhaVar.whw())) {
            textView2.setText(xhaVar.whw());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public ViewGroup ik() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.di();
        ViewParent parent = this.lr.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.lr);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.mj();
    }
}
