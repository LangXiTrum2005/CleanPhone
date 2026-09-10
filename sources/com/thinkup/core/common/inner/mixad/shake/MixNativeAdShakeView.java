package com.thinkup.core.common.inner.mixad.shake;

import android.content.Context;
import android.widget.FrameLayout;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.inner.ui.ShakeThumbView;
import com.thinkup.core.common.on.oon;

/* JADX INFO: loaded from: classes6.dex */
public class MixNativeAdShakeView extends FrameLayout implements com.thinkup.core.common.mn.o {
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TUShakeViewListener f41823n;
    private oon o;

    public MixNativeAdShakeView(Context context) {
        super(context);
    }

    public void initView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        this.f41823n = tUShakeViewListener;
        ShakeThumbView shakeThumbView = new ShakeThumbView(getContext());
        if (i2 <= 0) {
            i2 = -2;
        }
        if (i3 <= 0) {
            i3 = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        layoutParams.gravity = 17;
        shakeThumbView.setLayoutParams(layoutParams);
        addView(shakeThumbView);
        shakeThumbView.setShakeSetting(this.o, this.m != 1 ? 3 : 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TUShakeViewListener tUShakeViewListener = this.f41823n;
        if (tUShakeViewListener != null) {
            tUShakeViewListener.onDismiss();
        }
    }

    public MixNativeAdShakeView(Context context, oon oonVar, int i2) {
        super(context);
        this.o = oonVar;
        this.m = i2;
    }
}
