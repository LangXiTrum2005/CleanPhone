package com.bytedance.sdk.openadsdk.component.tvp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends lnr {
    qdl exu;

    public interface qdl {
        void qdl(View view, int i2);
    }

    public mzz(Context context, ljh ljhVar) {
        super(context);
        qdl(context, ljhVar);
    }

    private void qdl(Context context, ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.tvp.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.tvp.mzz(context);
        com.bytedance.sdk.openadsdk.core.tvp.mml.qdl().lnr(mzzVar);
        mzzVar.qdl(ljhVar, new com.bytedance.sdk.openadsdk.core.tvp.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.tvp.mzz.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.mzz.ud
            public void qdl(int i2, int i3) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.mzz.ud
            public void ud() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.mzz.ud
            public View qdl() {
                return mzz.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.mzz.ud
            public void qdl(View view, int i2) {
                qdl qdlVar = mzz.this.exu;
                if (qdlVar != null) {
                    qdlVar.qdl(view, i2);
                }
            }
        }, "open_ad");
        addView(mzzVar, new ViewGroup.LayoutParams(-1, -1));
        mzzVar.aaj();
        int iUd = ax.ud(context, 9.0f);
        int iUd2 = ax.ud(context, 10.0f);
        this.mml = PAGLogoView.createPAGLogoViewByMaterial(context, ljhVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams.leftMargin = iUd2;
        layoutParams.bottomMargin = iUd2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.mml, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.widget.lnr(context);
        this.fs = lnrVar;
        lnrVar.setPadding(iUd, 0, iUd, 0);
        this.fs.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ax.ud(context, 32.0f), ax.ud(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iUd2, iUd2);
        addView(this.fs, layoutParams2);
        View view = this.jpc;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.mml getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.jpc getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public jtx getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.exu = null;
    }

    public void setRenderListener(qdl qdlVar) {
        this.exu = qdlVar;
    }
}
