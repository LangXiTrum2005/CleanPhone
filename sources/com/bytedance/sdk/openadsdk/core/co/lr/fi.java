package com.bytedance.sdk.openadsdk.core.co.lr;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.adsdk.ugeno.lr.ik<FrameLayout> {
    public fi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public FrameLayout ri() {
        FrameLayout frameLayout = new FrameLayout(this.lr);
        com.bytedance.sdk.openadsdk.core.model.lr lrVar = new com.bytedance.sdk.openadsdk.core.model.lr();
        lrVar.ri(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.lr);
        pAGLogoView.initData(lrVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
    }
}
