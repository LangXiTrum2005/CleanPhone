package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeView extends BaseShakeView {
    public static final String TAG = "ShakeView";
    private View r0;
    private View s0;
    TextView t0;
    TextView u0;
    String v0;
    private Boolean w0;

    public ShakeView(Context context) {
        super(context);
        this.w0 = Boolean.FALSE;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        setOrientation(1);
        setGravity(1);
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_shake_button", "layout"), (ViewGroup) null);
        this.r0 = viewInflate;
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(h.a(getContext(), 300.0f), h.a(getContext(), 100.0f)));
        TextView textView = (TextView) this.r0.findViewById(h.a(b.p().k(), "tv_splash_shake_view_hint_text", "id"));
        this.t0 = textView;
        if (textView != null) {
            textView.setText(h.a(b.p().k(), "myoffer_shake_full_title", k.f38992h));
        }
        this.e0 = (ImageView) this.r0.findViewById(h.a(b.p().k(), "tv_splash_shake_view_icon", "id"));
        View viewInflate2 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.s0 = viewInflate2;
        viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = (TextView) this.s0.findViewById(h.a(b.p().k(), "tv_splash_shake_hint_text", "id"));
        this.u0 = textView2;
        if (textView2 != null) {
            textView2.setText(h.a(b.p().k(), "myoffer_shake_full_title", k.f38992h));
        }
        this.f0 = (ImageView) this.s0.findViewById(h.a(b.p().k(), "tv_splash_shake_hint_icon", "id"));
        this.s0.setVisibility(8);
        addView(this.r0);
        addView(this.s0);
    }

    public void replaceShakeCTAButton(View view) {
        View view2;
        if (view == null || (view2 = this.r0) == null) {
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.r0.setVisibility(8);
            this.r0 = view;
            view.setVisibility(0);
            if (view.getLayoutParams() != null && view.getLayoutParams() != null) {
                layoutParams = view.getLayoutParams();
            }
            c.a(view);
            if (b.p().D()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta success");
            }
            addView(view, layoutParams);
        } catch (Throwable th) {
            if (b.p().D()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta fail:" + th.getMessage());
            }
            c.a(this.r0);
            addView(this.r0);
            this.r0.setVisibility(0);
        }
    }

    public void setNeedHideShakeIcon(boolean z2) {
        this.w0 = Boolean.valueOf(z2);
        if (z2) {
            View view = this.s0;
            if (view != null) {
                view.setVisibility(0);
                ImageView imageView = this.f0;
                if (imageView != null) {
                    this.e0 = imageView;
                }
            }
            View view2 = this.r0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.r0.setOnClickListener(onClickListener);
            this.s0.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public void setShakeHintText(String str) {
        this.v0 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.t0;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.u0;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void setShakeSetting(g gVar, int i2) {
        super.setShakeSetting(gVar, i2);
        if (TextUtils.isEmpty(this.v0)) {
            if (TextUtils.isEmpty(this.k0)) {
                TextView textView = this.t0;
                if (textView != null) {
                    textView.setText(i.a(getContext(), i2));
                }
                TextView textView2 = this.u0;
                if (textView2 != null) {
                    textView2.setText(i.a(getContext(), i2));
                    return;
                }
                return;
            }
            TextView textView3 = this.t0;
            if (textView3 != null) {
                textView3.setText(this.k0);
            }
            TextView textView4 = this.u0;
            if (textView4 != null) {
                textView4.setText(this.k0);
            }
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        super.startAnimation(animation);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w0 = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.w0 = Boolean.FALSE;
    }
}
