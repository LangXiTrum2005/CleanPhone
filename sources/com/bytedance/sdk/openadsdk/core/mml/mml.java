package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private int jpc;
    protected ljh lnr;
    protected AdSlot mml;
    protected String mo;
    protected PAGBannerAdWrapperListener mzz;
    protected final Context qdl;
    private boolean tvp;
    protected aaj ud;
    protected boolean wd;

    public mml(Context context, ljh ljhVar, AdSlot adSlot, boolean z2) {
        super(context);
        this.mo = "banner_ad";
        this.wd = false;
        this.jpc = -1;
        this.tvp = false;
        if (ljhVar != null && ljhVar.dk() != 2) {
            ljhVar.bjy(1);
        }
        this.wd = z2;
        this.qdl = context;
        this.lnr = ljhVar;
        this.mml = adSlot;
        lnr();
        AdSlot adSlot2 = this.mml;
        if (adSlot2 != null) {
            qdl(adSlot2.getExpressViewAcceptedWidth(), this.mml.getExpressViewAcceptedHeight());
        }
    }

    public aaj getCurView() {
        return this.ud;
    }

    public void lnr() {
        aaj aajVar = new aaj(this.qdl, this.lnr, this.mml, this.mo) { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
            public com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl lnr(int i2) {
                return mml.this.qdl(super.lnr(i2));
            }
        };
        this.ud = aajVar;
        addView(aajVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.mzz;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void mml() {
        if (this.ud != null) {
            com.bytedance.sdk.openadsdk.core.tvp.ud().mo(this.ud.getClosedListenerKey());
            removeView(this.ud);
            this.ud.fs();
            this.ud = null;
        }
        com.bytedance.sdk.openadsdk.core.tvp.ud().jyq();
    }

    public void mzz() {
        aaj aajVar = this.ud;
        if (aajVar != null) {
            aajVar.exc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.ud == null) {
            lnr();
        }
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.lnr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i2) {
        this.jpc = i2;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.mzz = pAGBannerAdWrapperListener;
        aaj aajVar = this.ud;
        if (aajVar != null) {
            aajVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
                public void qdl() {
                    mml.this.mzz.onAdClicked();
                }
            });
            this.ud.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    ljh ljhVar = mml.this.lnr;
                    if (ljhVar == null || !ljhVar.vxm() || (pAGBannerAdWrapperListener2 = mml.this.mzz) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i2) {
                    mml mmlVar = mml.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = mmlVar.mzz;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(mmlVar, str, i2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    aaj aajVar2 = mml.this.ud;
                    if (aajVar2 != null) {
                        aajVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.rq.mml.qdl(mml.this.ud.getDynamicShowType())) {
                            mml mmlVar = mml.this;
                            AdSlot adSlot = mmlVar.mml;
                            if (adSlot != null) {
                                mmlVar.qdl(adSlot.getExpressViewAcceptedWidth(), mml.this.mml.getExpressViewAcceptedHeight());
                            }
                        } else {
                            mml.this.qdl(f, f2);
                        }
                    }
                    if (mml.this.tvp) {
                        mml.this.ud.jl();
                    }
                    mml mmlVar2 = mml.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = mmlVar2.mzz;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(mmlVar2, f, f2);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z2) {
        this.tvp = z2;
    }

    public com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdl(com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVar) {
        int i2;
        if (this.wd && (i2 = this.jpc) >= 0) {
            qdlVar.ud = i2;
        }
        return qdlVar;
    }

    public void qdl(float f, float f2) {
        int iUd = ax.ud(this.qdl, f);
        int iUd2 = ax.ud(this.qdl, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iUd, iUd2);
        }
        layoutParams.width = iUd;
        layoutParams.height = iUd2;
        setLayoutParams(layoutParams);
    }
}
