package com.thinkup.core.common.inner.ui;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.inner.ui.oo.n;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeThumbView extends BaseShakeView {
    private FrameLayout n0;
    private TextView no;

    public ShakeThumbView(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseShakeView
    public final void o() {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o00.o(getContext(), 80.0f), o00.o(getContext(), 80.0f));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        int iO = o00.o(getContext(), 88.0f);
        int color = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iO);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.o = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(o00.o(getContext(), 48.0f), o00.o(getContext(), 48.0f));
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = o00.o(getContext(), 16.0f);
        this.o.setLayoutParams(layoutParams2);
        this.no = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        this.no.setGravity(1);
        this.no.setMaxWidth(o00.o(getContext(), 124.0f));
        this.no.setMaxLines(2);
        this.no.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = o00.o(getContext(), 86.0f);
        this.no.setLayoutParams(layoutParams3);
        this.no.setText(o00.o(o0n.m().on(), "myoffer_shake_full_title", k.f38992h));
        this.no.setTextSize(1, 12.0f);
        this.no.setTextColor(-1);
        this.no.setBackgroundResource(o00.o(o0n.m().on(), "myoffer_bg_shake_thumb_hint", k.d));
        int iO2 = o00.o(getContext(), 6.0f);
        int iO3 = o00.o(getContext(), 12.0f);
        this.no.setPadding(iO3, iO2, iO3, iO2);
        this.n0 = new FrameLayout(getContext());
        this.n0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.n0.addView(imageView);
        this.n0.addView(this.o);
        this.n0.addView(this.no);
        addView(this.n0);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            FrameLayout frameLayout = this.n0;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(onClickListener);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseShakeView
    public void setShakeSetting(oon oonVar, int i2) {
        super.setShakeSetting(oonVar, i2);
        if (this.no != null) {
            if (TextUtils.isEmpty(this.on)) {
                this.no.setText(n.o(getContext(), i2));
            } else {
                this.no.setText(this.on);
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

    private void o(View view) {
        int iO = o00.o(getContext(), 88.0f);
        int color = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iO);
        view.setBackgroundDrawable(gradientDrawable);
    }
}
