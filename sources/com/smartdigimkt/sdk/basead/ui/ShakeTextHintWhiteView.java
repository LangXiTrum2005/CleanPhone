package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeTextHintWhiteView extends ShakeTextHintView {
    public ShakeTextHintWhiteView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeTextHintView
    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_text_hint_white", "layout");
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
