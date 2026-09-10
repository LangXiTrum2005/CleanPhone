package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends LinearLayout {
    public OY(Context context) {
        super(context);
        Lxb();
    }

    private static ImageView Lxb(Context context, float f, float f2, float f3, float f4) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setClickable(true);
        zu.setFocusable(true);
        zu.setPadding(le.lk(context, f3), le.lk(context, f4), le.lk(context, f3), le.lk(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(le.lk(context, 40.0f), le.lk(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = le.lk(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = le.lk(context, f2);
        }
        zu.setLayoutParams(layoutParams);
        return zu;
    }

    private void Lxb() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.STP.Lv);
        setLayoutParams(new ViewGroup.LayoutParams(-1, le.lk(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, le.lk(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(0);
        addView(jXs, new LinearLayout.LayoutParams(-1, le.lk(context, 44.0f)));
        ImageView imageViewLxb = Lxb(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewLxb.setId(com.bytedance.sdk.openadsdk.utils.STP.FGm);
        imageViewLxb.setImageResource(tD.ZU(context, "tt_ad_arrow_backward"));
        jXs.addView(imageViewLxb);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        jXs.addView(view2, layoutParams);
        ImageView imageViewLxb2 = Lxb(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewLxb2.setId(com.bytedance.sdk.openadsdk.utils.STP.Wi);
        imageViewLxb2.setImageResource(tD.ZU(context, "tt_ad_arrow_forward"));
        jXs.addView(imageViewLxb2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        jXs.addView(view3, layoutParams2);
        ImageView imageViewLxb3 = Lxb(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewLxb3.setId(com.bytedance.sdk.openadsdk.utils.STP.oc);
        imageViewLxb3.setImageResource(tD.ZU(context, "tt_ad_refresh"));
        jXs.addView(imageViewLxb3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        jXs.addView(view4, layoutParams3);
        ImageView imageViewLxb4 = Lxb(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewLxb4.setId(com.bytedance.sdk.openadsdk.utils.STP.ro);
        imageViewLxb4.setImageResource(tD.ZU(context, "tt_ad_link"));
        jXs.addView(imageViewLxb4);
    }
}
