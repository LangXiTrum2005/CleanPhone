package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ekw extends mo implements com.bytedance.sdk.component.adexpress.dynamic.mzz {
    boolean aaj;
    TextView qdl;
    FrameLayout ud;

    public ekw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.aaj = false;
        View view = new View(context);
        this.bjy = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.qdl = new TextView(context);
        this.ud = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.qdl.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.qdl.setBackground(gradientDrawable);
        this.qdl.setTextSize(10.0f);
        this.qdl.setGravity(17);
        this.qdl.setTextColor(-1);
        this.qdl.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            addView(this.ud, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.qdl);
        addView(this.bjy, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.mml.ud()) {
            addView(this.ud, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.ud;
        dynamicRootView.setVideoListener(this);
    }

    private void lnr(View view) {
        if (view == this.qdl || view == ((mo) this).exc) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.mo)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i2 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i2 >= viewGroup.getChildCount()) {
                return;
            }
            lnr(viewGroup.getChildAt(i2));
            i2++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public boolean mzz() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz
    public void qdl() {
        this.qdl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz
    public void setTimeUpdate(int i2) {
        if (!this.exu.to().mzz().hr() || i2 <= 0 || this.aaj) {
            this.aaj = true;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                lnr(getChildAt(i3));
            }
            this.qdl.setVisibility(8);
            return;
        }
        String strM = a.m(i2 >= 60 ? "0" + (i2 / 60) : "00", ":");
        int i4 = i2 % 60;
        this.qdl.setText(i4 > 9 ? strM + i4 : androidx.datastore.preferences.protobuf.a.m(strM, "0", i4));
        this.qdl.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        double dMzz = 0.0d;
        double dMml = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarFs = this.exu; jpcVarFs != null; jpcVarFs = jpcVarFs.fs()) {
            double dMo = dMml + ((double) jpcVarFs.mo());
            double dWd = dMzz + ((double) jpcVarFs.wd());
            dMml = dMo - ((double) jpcVarFs.mml());
            dMzz = dWd - ((double) jpcVarFs.mzz());
        }
        try {
            float f = (float) dMml;
            int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f);
            int iQdl2 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f + this.mzz);
            if (com.bytedance.sdk.component.adexpress.mml.ud.qdl(getContext())) {
                int dynamicWidth = ((jl) this.rdp.getChildAt(0)).getDynamicWidth();
                int i2 = dynamicWidth - iQdl2;
                iQdl2 = dynamicWidth - iQdl;
                iQdl = i2;
            }
            if ("open_ad".equals(this.rdp.getRenderRequest().mml())) {
                this.rdp.videoView = this.ud;
            } else {
                float f2 = (float) dMzz;
                ((jl) this.rdp.getChildAt(0)).qdl.qdl(iQdl, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f2), iQdl2, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f2 + this.mo));
            }
        } catch (Exception unused) {
        }
        this.rdp.updateRenderInfoForVideo(dMml, dMzz, this.mzz, this.mo, this.fs.bjy());
        return true;
    }
}
