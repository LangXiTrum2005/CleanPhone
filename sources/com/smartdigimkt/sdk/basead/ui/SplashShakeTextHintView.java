package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class SplashShakeTextHintView extends ShakeTextHintView {
    public SplashShakeTextHintView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeTextHintView
    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_text_hint_splash", "layout");
    }

    public void setTextSize(int i2) {
        TextView textView = this.r0;
        if (textView != null) {
            textView.setTextSize(1, i2);
        }
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
