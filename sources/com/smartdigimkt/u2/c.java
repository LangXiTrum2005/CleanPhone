package com.smartdigimkt.u2;

import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;

/* JADX INFO: loaded from: classes6.dex */
public class c extends d {
    private IJSFactory m0;

    public c(IJSFactory iJSFactory, com.smartdigimkt.x.d dVar, com.smartdigimkt.d3.c cVar, com.smartdigimkt.c3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        super(dVar, cVar2, cVar, str, str2, aVar, i2, z2);
        this.m0 = iJSFactory;
        if (iJSFactory == null) {
            this.W = false;
        }
    }

    @Override // com.smartdigimkt.u2.d, com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        if (this.W) {
            if (i2 != 8) {
                if (i2 == 105) {
                    this.m0.getJSNotifyProxy().a(3, obj.toString());
                    i2 = -1;
                } else if (i2 == 107) {
                    this.m0.getJSContainerModule().showVideoClickView(-1);
                    this.m0.getJSVideoModule().setCover(false);
                    this.m0.getJSVideoModule().videoOperate(1);
                } else if (i2 == 112) {
                    this.m0.getJSVideoModule().setCover(true);
                    this.m0.getJSVideoModule().videoOperate(2);
                } else if (i2 == 115) {
                    com.smartdigimkt.x2.j jSVideoModule = this.m0.getJSVideoModule();
                    this.m0.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.m0.getJSContainerModule().showAlertWebView()) {
                this.m0.getJSVideoModule().alertWebViewShowed();
            } else {
                this.m0.getJSVideoModule().showAlertView();
            }
        }
        super.a(i2, obj);
    }
}
