package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class hg extends lc implements com.bytedance.sdk.component.adexpress.dynamic.JXs {
    boolean DY;
    FrameLayout LD;
    TextView Lxb;

    public hg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.DY = false;
        View view = new View(context);
        this.IeN = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.Lxb = new TextView(context);
        this.LD = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.Lxb.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.Lxb.setBackground(gradientDrawable);
        this.Lxb.setTextSize(10.0f);
        this.Lxb.setGravity(17);
        this.Lxb.setTextColor(-1);
        this.Lxb.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            addView(this.LD, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.Lxb);
        addView(this.IeN, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
            addView(this.LD, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.LD;
        dynamicRootView.setVideoListener(this);
    }

    private void lk(View view) {
        if (view == this.Lxb || view == ((lc) this).tD) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.lc)).intValue() == 1) {
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
            lk(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public boolean JXs() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.JXs
    public void Lxb() {
        this.Lxb.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        double dJXs = 0.0d;
        double dZU = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oySLN = this.NXR; oySLN != null; oySLN = oySLN.sLN()) {
            double dLc = dZU + ((double) oySLN.lc());
            double dEbl = dJXs + ((double) oySLN.ebl());
            dZU = dLc - ((double) oySLN.ZU());
            dJXs = dEbl - ((double) oySLN.JXs());
        }
        try {
            float f = (float) dZU;
            int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), f);
            int iLxb2 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), f + this.JXs);
            if (com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(getContext())) {
                int dynamicWidth = ((brP) this.STP.getChildAt(0)).getDynamicWidth();
                int i = dynamicWidth - iLxb2;
                iLxb2 = dynamicWidth - iLxb;
                iLxb = i;
            }
            if ("open_ad".equals(this.STP.getRenderRequest().ZU())) {
                this.STP.videoView = this.LD;
            } else {
                float f2 = (float) dJXs;
                ((brP) this.STP.getChildAt(0)).Lxb.Lxb(iLxb, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), f2), iLxb2, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), f2 + this.lc));
            }
        } catch (Exception unused) {
        }
        this.STP.updateRenderInfoForVideo(dZU, dJXs, this.JXs, this.lc, this.sLN.IeN());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.JXs
    public void setTimeUpdate(int i) {
        if (!this.NXR.nBu().JXs().goy() || i <= 0 || this.DY) {
            this.DY = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                lk(getChildAt(i2));
            }
            this.Lxb.setVisibility(8);
            return;
        }
        String strH = DM.h(i >= 60 ? "0" + (i / 60) : "00", ":");
        int i3 = i % 60;
        this.Lxb.setText(i3 > 9 ? strH + i3 : strH + "0" + i3);
        this.Lxb.setVisibility(0);
    }
}
