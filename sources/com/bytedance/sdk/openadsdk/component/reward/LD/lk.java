package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends LD {
    public lk(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    private void LD(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        if (eblVar == null) {
            return;
        }
        Context context = eblVar.getContext();
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(1);
        eblVar.addView(jXs, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar.setId(STP.CG);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        jXs.addView(lkVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar2.setId(STP.nBu);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lkVar.addView(lkVar2, layoutParams2);
        lkVar2.addView(LD.Lxb(context));
        if (this.LD.FGm() != 3 && this.LD.FGm() != 5) {
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
            zu.setId(STP.aBz);
            zu.setVisibility(8);
            zu.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(le.lk(context, 28.0f), le.lk(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = le.lk(context, 20.0f);
            layoutParams3.bottomMargin = le.lk(context, 10.0f);
            lkVar.addView(zu, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar3.setId(STP.DY);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        jXs.addView(lkVar3, layoutParams4);
        lkVar3.addView(LD(context));
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.Lxb(lkVar3);
        com.bytedance.sdk.openadsdk.component.reward.view.ZU.LD(lkVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        return true;
    }

    public static boolean Lxb(tD tDVar) {
        kqm.lk(tDVar);
        return kqm.lk(tDVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        LD(eblVar);
    }

    private static com.bytedance.sdk.component.QAg.ZU LD(Context context) {
        com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(context, true);
        zu.setId(STP.Sfi);
        zu.setLayerType(2, null);
        zu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return zu;
    }
}
