package com.thinkup.core.common.inner.mixad.shake;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class MixNativeAdNetworkShakeView extends FrameLayout implements com.thinkup.core.common.mn.o {
    public MixNativeAdNetworkShakeView(Context context) {
        super(context);
    }

    public MixNativeAdNetworkShakeView(Context context, View view, int i2, int i3) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
    }
}
