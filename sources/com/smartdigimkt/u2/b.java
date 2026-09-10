package com.smartdigimkt.u2;

import com.smartdigimkt.expressad.video.module.AnythinkContainerView;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;

/* JADX INFO: loaded from: classes6.dex */
public class b extends d {
    private AnythinkVideoView m0;
    private AnythinkContainerView n0;

    public b(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.smartdigimkt.x.d dVar, com.smartdigimkt.d3.c cVar, com.smartdigimkt.c3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        super(dVar, cVar2, cVar, str, str2, aVar, i2, z2);
        this.m0 = anythinkVideoView;
        this.n0 = anythinkContainerView;
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    @Override // com.smartdigimkt.u2.d, com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        if (this.W) {
            if (i2 == 8) {
                AnythinkContainerView anythinkContainerView = this.n0;
                if (anythinkContainerView == null) {
                    AnythinkVideoView anythinkVideoView = this.m0;
                    if (anythinkVideoView != null) {
                        anythinkVideoView.showAlertView();
                    }
                } else if (anythinkContainerView.showAlertWebView()) {
                    AnythinkVideoView anythinkVideoView2 = this.m0;
                    if (anythinkVideoView2 != null) {
                        anythinkVideoView2.alertWebViewShowed();
                    }
                } else {
                    AnythinkVideoView anythinkVideoView3 = this.m0;
                    if (anythinkVideoView3 != null) {
                        anythinkVideoView3.showAlertView();
                    }
                }
            } else if (i2 == 107) {
                this.n0.showVideoClickView(-1);
                this.m0.setCover(false);
                this.m0.videoOperate(1);
            } else if (i2 == 112) {
                this.m0.setCover(true);
                this.m0.videoOperate(2);
            } else if (i2 == 115) {
                this.n0.resizeMiniCard(this.m0.getBorderViewWidth(), this.m0.getBorderViewHeight(), this.m0.getBorderViewRadius());
            }
        }
        super.a(i2, obj);
    }
}
