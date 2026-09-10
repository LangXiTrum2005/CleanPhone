package com.bytedance.sdk.openadsdk.Lxb.LD.Lxb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.Lxb.LD.OY;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends OY {
    protected String JVA;
    protected final Context OY;
    protected AdSlot QAg;
    protected tD nBu;
    private boolean sLN;

    public lk(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot) {
        super(context, tDVar, 5, true);
        this.JVA = "embeded_ad";
        this.sLN = false;
        this.LD.OY(1);
        this.ZU.Lxb(this);
        this.OY = context;
        this.QAg = adSlot;
        Lxb();
        LD();
    }

    private void LD() {
        tD tDVar = this.nBu;
        if (tDVar != null) {
            tDVar.setBackupListener(new com.bytedance.sdk.component.adexpress.LD.lk() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk.1
                @Override // com.bytedance.sdk.component.adexpress.LD.lk
                public boolean Lxb(ViewGroup viewGroup, int i) {
                    Lxb lxb = new Lxb(lk.this.nBu.getContext());
                    lxb.setExtraFuncationHelper(((OY) lk.this).ZU);
                    lxb.Lxb(lk.this.nBu);
                    return true;
                }
            });
        }
    }

    public void JXs() {
        tD tDVar = this.nBu;
        if (tDVar != null) {
            tDVar.QAg();
        }
    }

    public tD ZU() {
        return this.nBu;
    }

    public void lk() {
        tD tDVar = this.nBu;
        if (tDVar != null) {
            tDVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (!lk.this.nBu.NXR()) {
                        lk.this.Lxb(f, f2);
                        if (lk.this.sLN) {
                            lk.this.nBu.OY();
                            return;
                        }
                        return;
                    }
                    lk lkVar = lk.this;
                    Context context = lkVar.OY;
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = ((OY) lkVar).LD;
                    lk lkVar2 = lk.this;
                    com.bytedance.sdk.openadsdk.Lxb.LD.LD ld = new com.bytedance.sdk.openadsdk.Lxb.LD.LD(context, tDVar2, 5, lkVar2.QAg, ((OY) lkVar2).ZU, ((OY) lk.this).Lxb);
                    lk lkVar3 = lk.this;
                    if (lkVar3 instanceof LD) {
                        ld.Lxb(((brP) lkVar3.ZU()).getVideoAdListener());
                    }
                    ((OY) lk.this).ZU.Lxb((com.bytedance.sdk.openadsdk.core.LD.Lxb) lk.this.nBu.getClickCreativeListener());
                    PAGMediaView pAGMediaViewQAg = ((OY) lk.this).ZU.QAg();
                    if (pAGMediaViewQAg == null) {
                        pAGMediaViewQAg = new PAGMediaView(lk.this.OY);
                    }
                    lk.this.nBu.addView(pAGMediaViewQAg);
                }
            });
        }
    }

    public void Lxb() {
        this.nBu = new tD(this.OY, this.LD, this.QAg, this.JVA);
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(float f, float f2) {
        tD tDVar = this.nBu;
        if (tDVar != null && com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(tDVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.nBu.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.nBu.setLayoutParams(layoutParams);
            return;
        }
        int iLk = le.lk(this.OY, f);
        int iLk2 = le.lk(this.OY, f2);
        ViewGroup.LayoutParams layoutParams2 = this.nBu.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iLk, iLk2);
        } else {
            layoutParams2.width = iLk;
            layoutParams2.height = iLk2;
        }
        this.nBu.setLayoutParams(layoutParams2);
    }

    public void Lxb(boolean z) {
        this.sLN = z;
    }
}
