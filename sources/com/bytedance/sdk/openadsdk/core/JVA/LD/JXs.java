package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.adsdk.ugeno.LD.lk<FrameLayout> {
    public JXs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public FrameLayout ZU() {
        FrameLayout frameLayout = new FrameLayout(this.JXs);
        frameLayout.addView(new PAGLogoView(this.JXs));
        return frameLayout;
    }
}
