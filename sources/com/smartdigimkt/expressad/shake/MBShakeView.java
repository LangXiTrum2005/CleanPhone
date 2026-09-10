package com.smartdigimkt.expressad.shake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class MBShakeView extends LinearLayout {
    private static final String g0 = "MBSplashShakeView";
    private ImageView e0;
    private Animation f0;

    public MBShakeView(Context context) {
        super(context);
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? getContext().getString(k.a(getContext(), "sdm_cm_shake_view_view_other_app", k.f38992h)) : str;
    }

    private void setBgDrawable(View view) {
        int color = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200);
        view.setBackgroundDrawable(gradientDrawable);
    }

    public void initView(String str) {
        initView(str, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public MBShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void initView(String str, boolean z2) {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(v.a(getContext(), z2 ? 60.0f : 80.0f), v.a(getContext(), z2 ? 60.0f : 80.0f)));
        setBgDrawable(imageView);
        this.e0 = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(v.a(getContext(), z2 ? 20.0f : 40.0f), v.a(getContext(), z2 ? 20.0f : 40.0f));
        layoutParams.gravity = 17;
        this.e0.setLayoutParams(layoutParams);
        this.e0.setImageResource(k.a(getContext(), "sdm_splash_btn_shake", k.d));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.e0);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = v.a(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        getContext().getResources().getConfiguration().locale.getLanguage();
        textView.setText(getContext().getString(k.a(getContext(), "sdm_cm_shake_view_hint_text", k.f38992h)));
        textView.setTextSize(z2 ? 16.0f : 20.0f);
        textView.setTextColor(-1);
        textView.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        String strA = a(str);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = v.a(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(strA);
        textView2.setTextSize(z2 ? 12.0f : 16.0f);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f0 = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f0.setRepeatMode(2);
        this.f0.setRepeatCount(-1);
        this.e0.startAnimation(this.f0);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
