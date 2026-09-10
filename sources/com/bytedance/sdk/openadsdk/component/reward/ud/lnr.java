package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.tvp;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends ud {
    public lnr(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    private void ud(tvp tvpVar) {
        if (tvpVar == null) {
            return;
        }
        Context context = tvpVar.getContext();
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(1);
        tvpVar.addView(mzzVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.ekw);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        mzzVar.addView(lnrVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar2.setId(jtx.to);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lnrVar.addView(lnrVar2, layoutParams2);
        lnrVar2.addView(ud.qdl(context));
        if (this.ud.vxg() != 3 && this.ud.vxg() != 5) {
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
            mmlVar.setId(jtx.vxm);
            mmlVar.setVisibility(8);
            mmlVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(ax.ud(context, 28.0f), ax.ud(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = ax.ud(context, 20.0f);
            layoutParams3.bottomMargin = ax.ud(context, 10.0f);
            lnrVar.addView(mmlVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar3 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar3.setId(jtx.exc);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        mzzVar.addView(lnrVar3, layoutParams4);
        lnrVar3.addView(mml.qdl(context, this.qdl.ud));
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar3, this.ud);
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mzz() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void qdl(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void wd() {
    }

    public static boolean qdl(ljh ljhVar) {
        aaj.lnr(ljhVar);
        return aaj.lnr(ljhVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void qdl(tvp tvpVar) {
        ud(tvpVar);
    }
}
