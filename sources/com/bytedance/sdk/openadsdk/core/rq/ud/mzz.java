package com.bytedance.sdk.openadsdk.core.rq.ud;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.adsdk.ugeno.ud.lnr<FrameLayout> {
    public mzz(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public FrameLayout qdl() {
        FrameLayout frameLayout = new FrameLayout(this.ud);
        com.bytedance.sdk.openadsdk.core.model.ud udVar = new com.bytedance.sdk.openadsdk.core.model.ud();
        udVar.qdl(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.ud);
        pAGLogoView.initData(udVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
    }
}
