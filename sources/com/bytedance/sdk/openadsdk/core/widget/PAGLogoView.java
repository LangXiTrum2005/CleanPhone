package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.mo.mml mAdLogo;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, ljh ljhVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(ljhVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iUd = ax.ud(context, 2.0f);
        this.containerHeight = ax.ud(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ax.ud(context, 14.0f), ax.ud(context, 6.0f));
        layoutParams.leftMargin = iUd;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iUd;
        layoutParams2.rightMargin = iUd;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iUd);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(ljh ljhVar) {
        if (ljhVar == null) {
            return;
        }
        initData(ljhVar.rjh());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.mo.tvp.qdl(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.ud udVar) {
        if (udVar == null) {
            return;
        }
        if (udVar.mzz()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_ad_logo"));
        } else {
            String strQdl = udVar.qdl();
            if (TextUtils.isEmpty(strQdl)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strQdl.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.tvp.mml.qdl(strQdl).lnr(1).qdl(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strUd = udVar.ud();
        if (udVar.mzz()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strUd)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strUd);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        initView(context);
    }
}
