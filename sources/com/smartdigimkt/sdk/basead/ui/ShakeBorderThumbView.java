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
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeBorderThumbView extends BaseShakeView {
    TextView r0;

    public ShakeBorderThumbView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        setOrientation(0);
        setGravity(17);
        setClipToPadding(false);
        setBackgroundResource(h.a(b.p().k(), "myoffer_bg_shake_border_thumb", k.d));
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        int iA = h.a(getContext(), 10.0f);
        int iA2 = h.a(getContext(), 10.0f);
        int iA3 = h.a(getContext(), 6.0f);
        setPadding(iA, iA3, iA2, iA3);
        this.e0 = (ImageView) findViewById(h.a(b.p().k(), "myoffer_splash_shake_border_img", "id"));
        this.r0 = (TextView) findViewById(h.a(b.p().k(), "myoffer_splash_shake_hint_text", "id"));
    }

    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_border_thumb", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
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

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
