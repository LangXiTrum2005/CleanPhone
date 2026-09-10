package com.bytedance.sdk.openadsdk.component.reward.lr;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.mj;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.google.android.material.card.MaterialCardView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends lr {
    public ik(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar);
    }

    private void lr(mj mjVar) {
        if (mjVar == null) {
            return;
        }
        Context context = mjVar.getContext();
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(1);
        mjVar.addView(fiVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar.setId(slm.dzy);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        fiVar.addView(ikVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar2.setId(slm.f18175co);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        ikVar.addView(ikVar2, layoutParams2);
        ikVar2.addView(lr.ri(context));
        if (this.lr.vz() != 3 && this.lr.vz() != 5) {
            com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
            kaVar.setId(slm.mf);
            kaVar.setVisibility(8);
            kaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qd.lr(context, 28.0f), qd.lr(context, 28.0f));
            layoutParams3.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_END;
            layoutParams3.rightMargin = qd.lr(context, 20.0f);
            layoutParams3.bottomMargin = qd.lr(context, 10.0f);
            ikVar.addView(kaVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.di.ik ikVar3 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar3.setId(slm.ihz);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fiVar.addView(ikVar3, layoutParams4);
        ikVar3.addView(ka.ri(context, this.ri.lr));
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar3, this.lr);
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean fi() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean ka() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(FrameLayout frameLayout) {
    }

    public static boolean ri(wjv wjvVar) {
        ac.ik(wjvVar);
        return ac.ik(wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(mj mjVar) {
        lr(mjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void di() {
    }
}
