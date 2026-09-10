package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.sdk.openadsdk.core.di.ik {
    private com.bytedance.sdk.openadsdk.activity.single.mj di;
    private float fi;
    private com.bytedance.sdk.openadsdk.core.di.ik ik;
    private float ka;
    private final boolean lr;
    private final boolean ri;
    private boolean xha;

    public lr(Context context, boolean z, boolean z2, final int i) {
        super(context);
        this.ri = z;
        this.lr = z2;
        if (z) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lr.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.ik = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.ik, layoutParams);
        this.ik.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lr.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
            }
        });
        this.ik.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy;
        super.onAttachedToWindow();
        if (this.xha || (mjVar = this.di) == null || (riVarAy = mjVar.ay()) == null) {
            return;
        }
        riVarAy.su.lr(true);
        this.xha = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy;
        super.onDetachedFromWindow();
        if (!this.xha || (mjVar = this.di) == null || (riVarAy = mjVar.ay()) == null) {
            return;
        }
        riVarAy.su.lr(false);
        this.xha = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.ik, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.lr) {
            float f = this.ka;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iMax = Math.max(0, (size - ((int) (size2 * f))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f2 = this.fi;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f2))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.ri) {
            float f3 = this.ka;
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f3), 1073741824);
            } else {
                float f4 = this.fi;
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f4), 1073741824);
                }
            }
        } else {
            float f5 = this.ka;
            if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f5))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f6 = this.fi;
                if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f6))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy;
        super.onWindowFocusChanged(z);
        if (this.xha == z || (mjVar = this.di) == null || (riVarAy = mjVar.ay()) == null) {
            return;
        }
        riVarAy.su.lr(z);
    }

    public void ri(mj mjVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = this.ik;
        if (ikVar != null) {
            ikVar.addView(mjVar, layoutParams);
        } else {
            addView(mjVar, layoutParams);
        }
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.mj mjVar) {
        this.di = mjVar;
    }

    public void setWidthAndHeightRatio(float f) {
        this.ka = f;
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.fi = f;
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = this.ik;
        if (ikVar != null) {
            ikVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
