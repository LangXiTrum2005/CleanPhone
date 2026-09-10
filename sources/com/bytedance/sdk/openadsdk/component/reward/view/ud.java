package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private com.bytedance.sdk.openadsdk.core.mo.lnr lnr;
    private float mml;
    private com.bytedance.sdk.openadsdk.activity.jpc mo;
    private float mzz;
    private final boolean qdl;
    private final boolean ud;
    private boolean wd;

    public ud(Context context, boolean z2, boolean z3, final int i2) {
        super(context);
        this.qdl = z2;
        this.ud = z3;
        if (z2) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ud.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i2);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.lnr = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.lnr, layoutParams);
        this.lnr.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ud.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i2);
            }
        });
        this.lnr.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onAttachedToWindow();
        if (this.wd || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(true);
        this.wd = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onDetachedFromWindow();
        if (!this.wd || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(false);
        this.wd = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.lnr, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (this.ud) {
            float f = this.mml;
            if (f > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f2 = this.mzz;
                if (f2 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f2))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.qdl) {
            float f3 = this.mml;
            if (f3 > 0.0f) {
                i3 = View.MeasureSpec.makeMeasureSpec((int) (size / f3), 1073741824);
            } else {
                float f4 = this.mzz;
                if (f4 > 0.0f) {
                    i3 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f4), 1073741824);
                }
            }
        } else {
            float f5 = this.mml;
            if (f5 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f5))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f6 = this.mzz;
                if (f6 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f6))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onWindowFocusChanged(z2);
        if (this.wd == z2 || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(z2);
    }

    public void qdl(tvp tvpVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.addView(tvpVar, layoutParams);
        } else {
            addView(tvpVar, layoutParams);
        }
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.jpc jpcVar) {
        this.mo = jpcVar;
    }

    public void setWidthAndHeightRatio(float f) {
        this.mml = f;
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.mzz = f;
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
