package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.exc;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends mml {
    private com.bytedance.sdk.openadsdk.qdl.qdl.ud jpc;
    private int to;
    private int tvp;

    public lnr(Context context, ljh ljhVar, AdSlot adSlot, boolean z2) {
        super(context, ljhVar, adSlot, z2);
        this.tvp = 1;
        this.to = -1;
    }

    public com.bytedance.sdk.openadsdk.multipro.ud.qdl getVideoModel() {
        aaj aajVar = this.ud;
        if (aajVar != null) {
            return ((exc) aajVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mml.mml
    public void lnr() {
        exc excVar = new exc(this.qdl, this.lnr, this.mml, this.mo, this.wd) { // from class: com.bytedance.sdk.openadsdk.core.mml.lnr.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
            public com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl lnr(int i2) {
                return lnr.this.qdl(super.lnr(i2));
            }
        };
        this.ud = excVar;
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController = excVar.getVideoController();
        if (videoController != null) {
            videoController.mml(this.tvp);
        }
        addView(this.ud, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.mzz;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        aaj aajVar = this.ud;
        if (aajVar != null) {
            ((exc) aajVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.qdl.ud.lnr() { // from class: com.bytedance.sdk.openadsdk.core.mml.lnr.2
                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void lnr(PAGNativeAd pAGNativeAd) {
                    if (lnr.this.jpc != null) {
                        lnr.this.jpc.qdl();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void qdl(int i2, int i3) {
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void ud(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void qdl(PAGNativeAd pAGNativeAd) {
                    if (lnr.this.to == 3) {
                        lnr lnrVar = lnr.this;
                        lnrVar.qdl(lnrVar.jpc);
                    } else if (lnr.this.to == 2) {
                        lnr.this.qdl();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mml.mml
    public void mml() {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController;
        aaj aajVar = this.ud;
        if ((aajVar instanceof exc) && (videoController = ((exc) aajVar).getVideoController()) != null) {
            this.tvp = videoController.ax();
        }
        super.mml();
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.qdl.ud udVar) {
        aaj aajVar = this.ud;
        if (aajVar != null) {
            ((exc) aajVar).jtx();
            this.jpc = udVar;
            this.to = 3;
        }
    }

    public void ud() {
        aaj aajVar = this.ud;
        if (aajVar != null) {
            ((exc) aajVar).yt();
        }
    }

    public void qdl() {
        aaj aajVar = this.ud;
        if (aajVar != null) {
            ((exc) aajVar).bjy();
            this.to = 2;
        }
    }
}
