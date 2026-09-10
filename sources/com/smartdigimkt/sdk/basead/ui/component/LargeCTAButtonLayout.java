package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class LargeCTAButtonLayout extends CTAButtonLayout {
    public LargeCTAButtonLayout(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout
    public int a(f fVar, a aVar, boolean z2) {
        return 2;
    }

    public LargeCTAButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LargeCTAButtonLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
