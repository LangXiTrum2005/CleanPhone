package com.mbridge.msdk.video.module.listener.impl;

import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeClickMiniCardView f37787b;

    public g(MBridgeClickMiniCardView mBridgeClickMiniCardView, com.mbridge.msdk.video.module.listener.a aVar) {
        super(aVar);
        this.f37787b = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        boolean z10 = false;
        switch (i10) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37787b;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f37787b;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                }
                break;
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
                z10 = true;
                break;
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
                i10 = 107;
                break;
        }
        if (z10) {
            return;
        }
        super.a(i10, obj);
    }
}
