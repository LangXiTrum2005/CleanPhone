package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ik {
    ri aw;

    public interface ri {
        void ri(View view, int i);
    }

    public fi(Context context, wjv wjvVar) {
        super(context);
        ri(context, wjvVar);
    }

    private void ri(Context context, wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.jbs.fi fiVar = new com.bytedance.sdk.openadsdk.core.jbs.fi(context);
        com.bytedance.sdk.openadsdk.core.jbs.ka.ri().ik(fiVar);
        fiVar.ri(wjvVar, new com.bytedance.sdk.openadsdk.core.jbs.fi.lr() { // from class: com.bytedance.sdk.openadsdk.component.jbs.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
            public void ri(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
            public View ri() {
                return fi.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
            public void ri(View view, int i) {
                ri riVar = fi.this.aw;
                if (riVar != null) {
                    riVar.ri(view, i);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
            public void lr() {
            }
        }, "open_ad");
        addView(fiVar, new ViewGroup.LayoutParams(-1, -1));
        fiVar.ac();
        int iLr = qd.lr(context, 9.0f);
        int iLr2 = qd.lr(context, 10.0f);
        this.ka = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, qd.lr(context, 14.0f));
        layoutParams.leftMargin = iLr2;
        layoutParams.bottomMargin = iLr2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.ka, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.ik ikVar = new com.bytedance.sdk.openadsdk.core.widget.ik(context);
        this.f18092co = ikVar;
        ikVar.setPadding(iLr, 0, iLr, 0);
        this.f18092co.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(qd.lr(context, 32.0f), qd.lr(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iLr2, iLr2);
        addView(this.f18092co, layoutParams2);
        View view = this.mj;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.ka getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.mj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public slm getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.aw = null;
    }

    public void setRenderListener(ri riVar) {
        this.aw = riVar;
    }
}
