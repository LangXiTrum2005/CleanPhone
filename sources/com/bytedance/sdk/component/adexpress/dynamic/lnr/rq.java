package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.component.utils.rc;

/* JADX INFO: loaded from: classes.dex */
public class rq implements wd<ViewGroup> {
    private final com.bytedance.sdk.component.adexpress.mo.to qdl;
    private final FrameLayout ud;

    public rq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.mo.to toVar = new com.bytedance.sdk.component.adexpress.mo.to(context);
        this.qdl = toVar;
        toVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.ud = frameLayout;
        frameLayout.addView(toVar, new FrameLayout.LayoutParams(-2, -2));
        double dDk = wdVar.dk();
        dDk = dDk == 0.0d ? 1.0d : dDk;
        double dIjp = wdVar.ijp();
        double d = dIjp != 0.0d ? dIjp : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) mzzVar.getDynamicWidth()) * 0.32d * dDk), (int) (((double) mzzVar.getDynamicWidth()) * 0.32d * d));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            qdl(context, frameLayout, wdVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, wdVar.wak() > 0 ? wdVar.wak() : com.bytedance.sdk.component.adexpress.mml.ud() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void qdl(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -rc.qdl(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(ljh.ud(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, rc.qdl(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(ljh.ud(context, "tt_splash_brush_mask_hint")));
        if (wdVar != null && !TextUtils.isEmpty(wdVar.jjk())) {
            textView2.setText(wdVar.jjk());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public ViewGroup lnr() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.mo();
        ViewParent parent = this.ud.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.ud);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.jpc();
    }
}
