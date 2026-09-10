package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends LinearLayout {
    public jpc(Context context) {
        super(context);
        qdl();
    }

    private static ImageView qdl(Context context, float f, float f2, float f3, float f4) {
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setClickable(true);
        mmlVar.setFocusable(true);
        mmlVar.setPadding(ax.ud(context, f3), ax.ud(context, f4), ax.ud(context, f3), ax.ud(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ax.ud(context, 40.0f), ax.ud(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = ax.ud(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = ax.ud(context, f2);
        }
        mmlVar.setLayoutParams(layoutParams);
        return mmlVar;
    }

    private void qdl() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.jtx.kab);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ax.ud(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, ax.ud(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(0);
        addView(mzzVar, new LinearLayout.LayoutParams(-1, ax.ud(context, 44.0f)));
        ImageView imageViewQdl = qdl(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewQdl.setId(com.bytedance.sdk.openadsdk.utils.jtx.ra);
        imageViewQdl.setImageResource(ljh.mml(context, "tt_ad_arrow_backward"));
        mzzVar.addView(imageViewQdl);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        mzzVar.addView(view2, layoutParams);
        ImageView imageViewQdl2 = qdl(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewQdl2.setId(com.bytedance.sdk.openadsdk.utils.jtx.qk);
        imageViewQdl2.setImageResource(ljh.mml(context, "tt_ad_arrow_forward"));
        mzzVar.addView(imageViewQdl2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        mzzVar.addView(view3, layoutParams2);
        ImageView imageViewQdl3 = qdl(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewQdl3.setId(com.bytedance.sdk.openadsdk.utils.jtx.tqd);
        imageViewQdl3.setImageResource(ljh.mml(context, "tt_ad_refresh"));
        mzzVar.addView(imageViewQdl3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        mzzVar.addView(view4, layoutParams3);
        ImageView imageViewQdl4 = qdl(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewQdl4.setId(com.bytedance.sdk.openadsdk.utils.jtx.fzn);
        imageViewQdl4.setImageResource(ljh.mml(context, "tt_ad_link"));
        mzzVar.addView(imageViewQdl4);
    }
}
