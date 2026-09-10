package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f37779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f37780o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f37779n = mBridgeVideoView;
        this.f37780o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f37790a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f37790a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f37780o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f37779n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f37779n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f37779n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f37780o.showVideoClickView(-1);
                this.f37779n.setCover(false);
                this.f37779n.setMiniEndCardState(false);
                this.f37779n.videoOperate(1);
            } else if (i10 == 112) {
                this.f37779n.setCover(true);
                this.f37779n.setMiniEndCardState(true);
                this.f37779n.videoOperate(2);
            } else if (i10 == 115) {
                this.f37780o.resizeMiniCard(this.f37779n.getBorderViewWidth(), this.f37779n.getBorderViewHeight(), this.f37779n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
