package com.bytedance.sdk.openadsdk.component.reward.lr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.mj;
import com.bytedance.sdk.openadsdk.component.reward.view.sf;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.bgr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends lr {
    public ka(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar);
    }

    private static ImageView ik(Context context) {
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kaVar.setImageResource(uq.ka(context, "tt_up_slide"));
        kaVar.setId(slm.ay);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qd.lr(context, 18.0f), qd.lr(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = qd.lr(context, 45.0f);
        kaVar.setLayoutParams(layoutParams);
        return kaVar;
    }

    private static LinearLayout lr(Context context) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setId(slm.wjv);
        fiVar.setOrientation(1);
        fiVar.setVisibility(8);
        fiVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fiVar;
    }

    public static boolean ri(wjv wjvVar) {
        return ac.lr(wjvVar) || ac.ka(wjvVar) || ac.xha(wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean fi() {
        if (ac.lr(this.ri.lr)) {
            return true;
        }
        return (ac.ka(this.ri.lr) || ac.xha(this.ri.lr)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean ka() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void sf() {
        sf sfVar;
        ac acVar;
        if (ac.lr(this.ri.lr) && (sfVar = this.ri.dzy) != null && (acVar = sfVar.vr) != null) {
            if (acVar.ka()) {
                this.ri.dzy.lr(0);
                this.ri.aw.set(true);
            } else {
                this.ri.bgr.set(true);
                ri(true, false, true, 80);
            }
        }
        if (ac.ka(this.ri.lr) || ac.xha(this.ri.lr)) {
            ri(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public RFEndCardBackUpLayout xha() {
        return null;
    }

    public static void ri(wjv wjvVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (ac.lr(wjvVar)) {
            ri(frameLayout, wjvVar);
        } else if (ac.ka(wjvVar) || ac.xha(wjvVar)) {
            lr(frameLayout, wjvVar);
        } else {
            lr.ri(frameLayout, riVar);
        }
    }

    public static void lr(FrameLayout frameLayout, wjv wjvVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar.setId(slm.ihz);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = qd.lr(nr.ri(), 58.0f);
        frameLayout.addView(ikVar, layoutParams);
        ikVar.addView(ri(context, wjvVar));
        LinearLayout linearLayoutLr = lr(context);
        linearLayoutLr.setBackgroundColor(Color.parseColor("#99161823"));
        ikVar.addView(linearLayoutLr);
        linearLayoutLr.addView(ik(context));
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar, wjvVar);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar2.setId(slm.dzy);
        frameLayout.addView(ikVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar3 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar3.setId(slm.f18175co);
        ikVar2.addView(ikVar3, new FrameLayout.LayoutParams(-1, -1));
        ikVar3.addView(lr.ri(context));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar4 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar4.setId(slm.tan);
        ikVar4.setVisibility(8);
        ikVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        ikVar3.addView(ikVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setId(slm.ac);
        kaVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ikVar4.addView(kaVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar2);
    }

    public static void ri(FrameLayout frameLayout, wjv wjvVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(1);
        frameLayout.addView(fiVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar.setId(slm.dzy);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        fiVar.addView(ikVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar2.setId(slm.f18175co);
        ikVar.addView(ikVar2, new FrameLayout.LayoutParams(-1, -1));
        ikVar2.addView(lr.ri(context));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar3 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar3.setId(slm.tan);
        ikVar3.setVisibility(8);
        ikVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        ikVar2.addView(ikVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setId(slm.ac);
        kaVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ikVar3.addView(kaVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar4 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar4.setId(slm.ihz);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fiVar.addView(ikVar4, layoutParams3);
        ikVar4.addView(ri(context, wjvVar));
        LinearLayout linearLayoutLr = lr(context);
        linearLayoutLr.setBackgroundColor(Color.parseColor("#70161823"));
        ikVar4.addView(linearLayoutLr);
        linearLayoutLr.addView(ik(context));
        com.bytedance.sdk.openadsdk.component.reward.view.fi.ri(ikVar4, wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void di() {
    }

    public static com.bytedance.sdk.component.jbs.di ri(Context context, wjv wjvVar) {
        com.bytedance.sdk.component.jbs.di diVarLr = com.bytedance.sdk.openadsdk.bgr.ri.ri().lr(wjvVar);
        if (diVarLr != null) {
            diVarLr.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) diVarLr.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(diVarLr);
            }
        } else {
            diVarLr = new com.bytedance.sdk.component.jbs.di(context, true, com.bytedance.sdk.component.jbs.di.ik.LANDING_PAGE_LOADING);
            diVarLr.setLayerType(2, null);
        }
        qd.ri((View) diVarLr, 0);
        diVarLr.setId(slm.uq);
        diVarLr.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return diVarLr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(mj mjVar) {
        ri(this.lr, mjVar, this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar;
        bgr bgrVar;
        if (!ac.ka(this.ri.lr) || this.ri.lr.zyn() || (bgrVar = (riVar = this.ri).aac) == null) {
            return;
        }
        bgrVar.ri(riVar.lr.ay().lr() * 1000);
    }
}
