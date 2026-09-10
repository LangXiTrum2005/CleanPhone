package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.JVA;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.sLN;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends LD {
    public ZU(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    public static void LD(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(1);
        frameLayout.addView(jXs, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar.setId(STP.CG);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        jXs.addView(lkVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar2.setId(STP.nBu);
        lkVar.addView(lkVar2, new FrameLayout.LayoutParams(-1, -1));
        lkVar2.addView(LD.Lxb(context));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar3.setId(STP.brP);
        lkVar3.setVisibility(8);
        lkVar3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lkVar2.addView(lkVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(STP.tD);
        zu.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lkVar3.addView(zu, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.LD(lkVar);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar4 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar4.setId(STP.DY);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        jXs.addView(lkVar4, layoutParams3);
        lkVar4.addView(LD(context));
        LinearLayout linearLayoutLk = lk(context);
        linearLayoutLk.setBackgroundColor(Color.parseColor("#70161823"));
        lkVar4.addView(linearLayoutLk);
        linearLayoutLk.addView(ZU(context));
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.Lxb(lkVar4);
    }

    public static boolean Lxb(tD tDVar) {
        return kqm.LD(tDVar) || kqm.ZU(tDVar) || kqm.JXs(tDVar);
    }

    private static ImageView ZU(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setScaleType(ImageView.ScaleType.FIT_XY);
        zu.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(context, "tt_up_slide"));
        zu.setId(STP.eK);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(le.lk(context, 18.0f), le.lk(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = le.lk(context, 45.0f);
        zu.setLayoutParams(layoutParams);
        return zu;
    }

    private static LinearLayout lk(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setId(STP.HD);
        jXs.setOrientation(1);
        jXs.setVisibility(8);
        jXs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return jXs;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void NXR() {
        com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu;
        kqm kqmVar;
        if (kqm.LD(this.Lxb.LD) && (nbu = this.Lxb.BcA) != null && (kqmVar = nbu.IeN) != null) {
            if (kqmVar.ZU()) {
                this.Lxb.BcA.LD(0);
                this.Lxb.VVE.set(true);
            } else {
                this.Lxb.kqm.set(true);
                Lxb(true, false, true, 80);
            }
        }
        if (kqm.ZU(this.Lxb.LD) || kqm.JXs(this.Lxb.LD)) {
            Lxb(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public RFEndCardBackUpLayout OY() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        if (kqm.LD(this.Lxb.LD)) {
            return true;
        }
        return (kqm.ZU(this.Lxb.LD) || kqm.JXs(this.Lxb.LD)) ? false : true;
    }

    public static void Lxb(tD tDVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        if (kqm.LD(tDVar)) {
            LD(frameLayout);
        } else if (kqm.ZU(tDVar) || kqm.JXs(tDVar)) {
            lk(frameLayout);
        } else {
            LD.Lxb(frameLayout, lxb);
        }
    }

    public static void lk(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar.setId(STP.DY);
        frameLayout.addView(lkVar, new FrameLayout.LayoutParams(-1, -1));
        lkVar.addView(LD(context));
        LinearLayout linearLayoutLk = lk(context);
        linearLayoutLk.setBackgroundColor(Color.parseColor("#99161823"));
        lkVar.addView(linearLayoutLk);
        linearLayoutLk.addView(ZU(context));
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.Lxb(lkVar);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar2.setId(STP.CG);
        frameLayout.addView(lkVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar3.setId(STP.nBu);
        lkVar2.addView(lkVar3, new FrameLayout.LayoutParams(-1, -1));
        lkVar3.addView(LD.Lxb(context));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar4 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar4.setId(STP.brP);
        lkVar4.setVisibility(8);
        lkVar4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lkVar3.addView(lkVar4, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(STP.tD);
        zu.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lkVar4.addView(zu, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.LD(lkVar2);
        View jva = new JVA(context);
        jva.setId(STP.nJ);
        jva.setClickable(true);
        jva.setFocusable(true);
        frameLayout.addView(jva, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        Lxb(this.LD, eblVar, this.Lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        sLN sln;
        if (!kqm.ZU(this.Lxb.LD) || (sln = (lxb = this.Lxb).MGT) == null) {
            return;
        }
        sln.Lxb(lxb.LD.QAg().LD() * 1000);
    }

    private static com.bytedance.sdk.component.QAg.ZU LD(Context context) {
        com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(context, true);
        zu.setId(STP.Sfi);
        zu.setLayerType(2, null);
        zu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return zu;
    }
}
