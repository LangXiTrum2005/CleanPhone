package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ka {
    private int jbs;
    private com.bytedance.sdk.openadsdk.ri.ri.lr mj;
    private int qt;

    public ik(Context context, wjv wjvVar, AdSlot adSlot, boolean z) {
        super(context, wjvVar, adSlot, z);
        this.jbs = 1;
        this.qt = -1;
    }

    public com.bytedance.sdk.openadsdk.tan.ik.ri getVideoModel() {
        ac acVar = this.lr;
        if (acVar != null) {
            return ((tan) acVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ka.ka
    public void ik() {
        tan tanVar = new tan(this.ri, this.ik, this.ka, this.di, this.xha) { // from class: com.bytedance.sdk.openadsdk.core.ka.ik.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
            public com.bytedance.sdk.openadsdk.ay.lr.fi.ri ik(int i) {
                return ik.this.ri(super.ik(i));
            }
        };
        this.lr = tanVar;
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik videoController = tanVar.getVideoController();
        if (videoController != null) {
            videoController.ka(this.jbs);
        }
        addView(this.lr, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fi;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        ac acVar = this.lr;
        if (acVar != null) {
            ((tan) acVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.ri.lr.ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.ik.2
                @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
                public void ik(PAGNativeAd pAGNativeAd) {
                    if (ik.this.mj != null) {
                        ik.this.mj.ri();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
                public void ri(int i, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
                public void ri(PAGNativeAd pAGNativeAd) {
                    if (ik.this.qt == 3) {
                        ik ikVar = ik.this;
                        ikVar.ri(ikVar.mj);
                    } else if (ik.this.qt == 2) {
                        ik.this.ri();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
                public void lr(PAGNativeAd pAGNativeAd) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ka.ka
    public void ka() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik videoController;
        ac acVar = this.lr;
        if ((acVar instanceof tan) && (videoController = ((tan) acVar).getVideoController()) != null) {
            this.jbs = videoController.qd();
        }
        super.ka();
    }

    public void lr() {
        ac acVar = this.lr;
        if (acVar != null) {
            ((tan) acVar).bu();
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.ri.ri.lr lrVar) {
        ac acVar = this.lr;
        if (acVar != null) {
            ((tan) acVar).slm();
            this.mj = lrVar;
            this.qt = 3;
        }
    }

    public void ri() {
        ac acVar = this.lr;
        if (acVar != null) {
            ((tan) acVar).vr();
            this.qt = 2;
        }
    }
}
