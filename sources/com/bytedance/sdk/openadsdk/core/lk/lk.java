package com.bytedance.sdk.openadsdk.core.lk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    protected PAGBannerAdWrapperListener JXs;
    protected tD LD;
    protected final Context Lxb;
    protected AdSlot ZU;
    protected String lc;
    protected com.bytedance.sdk.openadsdk.core.model.tD lk;

    public lk(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot) {
        super(context);
        this.lc = "banner_ad";
        this.Lxb = context;
        this.lk = tDVar;
        this.ZU = adSlot;
        Lxb();
        AdSlot adSlot2 = this.ZU;
        if (adSlot2 != null) {
            Lxb(adSlot2.getExpressViewAcceptedWidth(), this.ZU.getExpressViewAcceptedHeight());
        }
    }

    public void LD() {
        tD tDVar = this.LD;
        if (tDVar != null) {
            tDVar.QAg();
        }
    }

    public void Lxb() {
        tD tDVar = new tD(this.Lxb, this.lk, this.ZU, this.lc);
        this.LD = tDVar;
        addView(tDVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.JXs;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public tD getCurView() {
        return this.LD;
    }

    public void lk() {
        if (this.LD != null) {
            QAg.LD().lc(this.LD.getClosedListenerKey());
            removeView(this.LD);
            this.LD.JVA();
            this.LD = null;
        }
        QAg.LD().Sfi();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LD == null) {
            Lxb();
        }
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, this.lk);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.JXs = pAGBannerAdWrapperListener;
        tD tDVar = this.LD;
        if (tDVar != null) {
            tDVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.core.lk.lk.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.lc
                public void Lxb() {
                    lk.this.JXs.onAdClicked();
                }
            });
            this.LD.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.lk.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = lk.this.lk;
                    if (tDVar2 == null || !tDVar2.Iyd() || (pAGBannerAdWrapperListener2 = lk.this.JXs) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    lk lkVar = lk.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = lkVar.JXs;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(lkVar, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    tD tDVar2 = lk.this.LD;
                    if (tDVar2 != null) {
                        tDVar2.setSoundMute(true);
                    }
                    tD tDVar3 = lk.this.LD;
                    if (tDVar3 != null && !com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(tDVar3.getDynamicShowType())) {
                        lk.this.Lxb(f, f2);
                    }
                    lk lkVar = lk.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = lkVar.JXs;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(lkVar, f, f2);
                    }
                }
            });
        }
    }

    public void Lxb(float f, float f2) {
        int iLk = le.lk(this.Lxb, f);
        int iLk2 = le.lk(this.Lxb, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iLk, iLk2);
        }
        layoutParams.width = iLk;
        layoutParams.height = iLk2;
        setLayoutParams(layoutParams);
    }
}
