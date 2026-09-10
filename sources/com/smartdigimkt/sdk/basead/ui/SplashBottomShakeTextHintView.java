package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class SplashBottomShakeTextHintView extends ShakeTextHintView {
    public SplashBottomShakeTextHintView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeTextHintView, com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        super.b();
        setOrientation(1);
        setGravity(1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeTextHintView
    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_text_hint_splash_bottom", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeTextHintView, com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void setShakeSetting(g gVar, int i2) {
        super.setShakeSetting(gVar, i2);
        if (this.r0 != null) {
            if (TextUtils.isEmpty(this.m0)) {
                this.r0.setText(i.a(getContext(), i2));
            } else {
                this.r0.setText(this.m0);
            }
        }
    }

    public SplashBottomShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplashBottomShakeTextHintView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public SplashBottomShakeTextHintView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
