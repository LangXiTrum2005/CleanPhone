package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.sdk.openadsdk.core.di.ik {
    protected String di;
    protected PAGBannerAdWrapperListener fi;
    protected wjv ik;
    private boolean jbs;
    protected AdSlot ka;
    protected ac lr;
    private int mj;
    protected final Context ri;
    protected boolean xha;

    public ka(Context context, wjv wjvVar, AdSlot adSlot, boolean z) {
        super(context);
        this.di = "banner_ad";
        this.xha = false;
        this.mj = -1;
        this.jbs = false;
        if (wjvVar != null && wjvVar.ajz() != 2) {
            wjvVar.tan(1);
        }
        this.xha = z;
        this.ri = context;
        this.ik = wjvVar;
        this.ka = adSlot;
        ik();
        AdSlot adSlot2 = this.ka;
        if (adSlot2 != null) {
            ri(adSlot2.getExpressViewAcceptedWidth(), this.ka.getExpressViewAcceptedHeight());
        }
    }

    public void fi() {
        ac acVar = this.lr;
        if (acVar != null) {
            acVar.tan();
        }
    }

    public ac getCurView() {
        return this.lr;
    }

    public void ik() {
        ac acVar = new ac(this.ri, this.ik, this.ka, this.di) { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
            public com.bytedance.sdk.openadsdk.ay.lr.fi.ri ik(int i) {
                return ka.this.ri(super.ik(i));
            }
        };
        this.lr = acVar;
        addView(acVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fi;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void ka() {
        if (this.lr != null) {
            qt.lr().di(this.lr.getClosedListenerKey());
            removeView(this.lr);
            this.lr.co();
            this.lr = null;
        }
        qt.lr().tan();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.lr == null) {
            ik();
        }
        com.bytedance.sdk.openadsdk.utils.ka.ri(this, this.ik);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i) {
        this.mj = i;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.fi = pAGBannerAdWrapperListener;
        ac acVar = this.lr;
        if (acVar != null) {
            acVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.fi
                public void ri() {
                    ka.this.fi.onAdClicked();
                }
            });
            this.lr.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    wjv wjvVar = ka.this.ik;
                    if (wjvVar == null || !wjvVar.zyu() || (pAGBannerAdWrapperListener2 = ka.this.fi) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    ka kaVar = ka.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = kaVar.fi;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(kaVar, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    ac acVar2 = ka.this.lr;
                    if (acVar2 != null) {
                        acVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.co.fi.ri(ka.this.lr.getDynamicShowType())) {
                            ka kaVar = ka.this;
                            AdSlot adSlot = kaVar.ka;
                            if (adSlot != null) {
                                kaVar.ri(adSlot.getExpressViewAcceptedWidth(), ka.this.ka.getExpressViewAcceptedHeight());
                            }
                        } else {
                            ka.this.ri(f, f2);
                        }
                    }
                    if (ka.this.jbs) {
                        ka.this.lr.nr();
                    }
                    ka kaVar2 = ka.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = kaVar2.fi;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(kaVar2, f, f2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }
            });
        }
    }

    public void setIsShow(boolean z) {
        this.jbs = z;
    }

    public com.bytedance.sdk.openadsdk.ay.lr.fi.ri ri(com.bytedance.sdk.openadsdk.ay.lr.fi.ri riVar) {
        int i;
        if (this.xha && (i = this.mj) >= 0) {
            riVar.lr = i;
        }
        return riVar;
    }

    public void ri(float f, float f2) {
        int iLr = qd.lr(this.ri, f);
        int iLr2 = qd.lr(this.ri, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iLr, iLr2);
        }
        layoutParams.width = iLr;
        layoutParams.height = iLr2;
        setLayoutParams(layoutParams);
    }
}
