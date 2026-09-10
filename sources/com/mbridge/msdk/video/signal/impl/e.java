package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        q0.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        q0.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        q0.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        q0.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        q0.a("DefaultJSContainerModule", "readyStatus:isReady=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        StringBuilder sbL = l1.d.l("showMiniCard width = ", i10, " height = ", i11, " radius = ");
        sbL.append(i12);
        q0.a("DefaultJSContainerModule", sbL.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        q0.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        q0.a("DefaultJSContainerModule", "showEndcard,type=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sbL = l1.d.l("showMiniCard top = ", i10, " left = ", i11, " width = ");
        l1.d.o(sbL, i12, " height = ", i13, " radius = ");
        sbL.append(i14);
        q0.a("DefaultJSContainerModule", sbL.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        q0.a("DefaultJSContainerModule", "showVideoClickView:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        q0.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
    }
}
