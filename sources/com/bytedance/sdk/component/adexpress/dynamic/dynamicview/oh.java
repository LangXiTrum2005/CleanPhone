package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public class oh extends di implements com.bytedance.sdk.component.adexpress.dynamic.fi {
    boolean ac;
    FrameLayout lr;
    TextView ri;

    public oh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ac = false;
        View view = new View(context);
        this.vr = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.ri = new TextView(context);
        this.lr = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 15.0f));
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_END;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.ri.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.ri.setBackground(gradientDrawable);
        this.ri.setTextSize(10.0f);
        this.ri.setGravity(17);
        this.ri.setTextColor(-1);
        this.ri.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            addView(this.lr, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.ri);
        addView(this.vr, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
            addView(this.lr, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.lr;
        dynamicRootView.setVideoListener(this);
    }

    private void ik(View view) {
        if (view == this.ri || view == ((di) this).tan) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.ri.di)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            ik(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public boolean fi() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        double dFi = 0.0d;
        double dKa = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarCo = this.aw; mjVarCo != null; mjVarCo = mjVarCo.co()) {
            double dDi = dKa + ((double) mjVarCo.di());
            double dXha = dFi + ((double) mjVarCo.xha());
            dKa = dDi - ((double) mjVarCo.ka());
            dFi = dXha - ((double) mjVarCo.fi());
        }
        try {
            float f = (float) dKa;
            int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), f);
            int iRi2 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), f + this.fi);
            if (com.bytedance.sdk.component.adexpress.ka.lr.ri(getContext())) {
                int dynamicWidth = ((nr) this.bgr.getChildAt(0)).getDynamicWidth();
                int i = dynamicWidth - iRi2;
                iRi2 = dynamicWidth - iRi;
                iRi = i;
            }
            if ("open_ad".equals(this.bgr.getRenderRequest().ka())) {
                this.bgr.videoView = this.lr;
            } else {
                float f2 = (float) dFi;
                ((nr) this.bgr.getChildAt(0)).ri.ri(iRi, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), f2), iRi2, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), f2 + this.di));
            }
        } catch (Exception unused) {
        }
        this.bgr.updateRenderInfoForVideo(dKa, dFi, this.fi, this.di, this.f18035co.vr());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fi
    public void ri() {
        this.ri.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fi
    public void setTimeUpdate(int i) {
        if (!this.aw.qt().fi().evm() || i <= 0 || this.ac) {
            this.ac = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                ik(getChildAt(i2));
            }
            this.ri.setVisibility(8);
            return;
        }
        String str = (i >= 60 ? "0" + (i / 60) : "00") + ":";
        int i3 = i % 60;
        this.ri.setText(i3 > 9 ? str + i3 : str + "0" + i3);
        this.ri.setVisibility(0);
    }
}
