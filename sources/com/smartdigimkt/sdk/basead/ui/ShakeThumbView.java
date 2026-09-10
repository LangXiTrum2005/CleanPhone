package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeThumbView extends BaseShakeView {
    private FrameLayout r0;
    private TextView s0;

    public ShakeThumbView(Context context) {
        super(context);
    }

    private void setBgDrawable(View view) {
        int iA = h.a(getContext(), 88.0f);
        int color = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iA);
        view.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h.a(getContext(), 80.0f), h.a(getContext(), 80.0f));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        setBgDrawable(imageView);
        this.e0 = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(h.a(getContext(), 48.0f), h.a(getContext(), 48.0f));
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = h.a(getContext(), 16.0f);
        this.e0.setLayoutParams(layoutParams2);
        this.s0 = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        this.s0.setGravity(1);
        this.s0.setMaxWidth(h.a(getContext(), 124.0f));
        this.s0.setMaxLines(2);
        this.s0.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = h.a(getContext(), 86.0f);
        this.s0.setLayoutParams(layoutParams3);
        this.s0.setText(h.a(b.p().k(), "myoffer_shake_full_title", k.f38992h));
        this.s0.setTextSize(1, 12.0f);
        this.s0.setTextColor(-1);
        this.s0.setBackgroundResource(h.a(b.p().k(), "myoffer_bg_shake_thumb_hint", k.d));
        int iA = h.a(getContext(), 6.0f);
        int iA2 = h.a(getContext(), 12.0f);
        this.s0.setPadding(iA2, iA, iA2, iA);
        this.r0 = new FrameLayout(getContext());
        this.r0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.r0.addView(imageView);
        this.r0.addView(this.e0);
        this.r0.addView(this.s0);
        addView(this.r0);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            FrameLayout frameLayout = this.r0;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(onClickListener);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void setShakeSetting(g gVar, int i2) {
        super.setShakeSetting(gVar, i2);
        if (this.s0 != null) {
            if (TextUtils.isEmpty(this.l0)) {
                this.s0.setText(i.a(getContext(), i2));
            } else {
                this.s0.setText(this.l0);
            }
        }
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
