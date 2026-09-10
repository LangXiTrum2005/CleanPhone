package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeTextHintView extends BaseShakeView {
    protected TextView r0;

    public ShakeTextHintView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        int iA = h.a(getContext(), 4.0f);
        setPadding(iA, iA, iA, iA);
        int iA2 = h.a(b.p().k(), "myoffer_shake_text_hint_img", "id");
        int iA3 = h.a(b.p().k(), "myoffer_shake_text_hint_title", "id");
        this.e0 = (ImageView) findViewById(iA2);
        this.r0 = (TextView) findViewById(iA3);
    }

    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_text_hint", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void setShakeSetting(g gVar, int i2) {
        super.setShakeSetting(gVar, i2);
        if (this.r0 != null) {
            if (TextUtils.isEmpty(this.k0)) {
                this.r0.setText(i.a(getContext(), i2));
            } else {
                this.r0.setText(this.k0);
            }
        }
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
