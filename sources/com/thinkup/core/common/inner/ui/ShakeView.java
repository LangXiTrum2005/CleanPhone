package com.thinkup.core.common.inner.ui;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.inner.ui.oo.n;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeView extends BaseShakeView {
    public static final String TAG = "ShakeView";
    TextView n0;
    String nm;
    private View nn;
    TextView no;
    private View o00;
    private Boolean o0o;

    public ShakeView(Context context) {
        super(context);
        this.o0o = Boolean.FALSE;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseShakeView
    public final void o() {
        setOrientation(1);
        setGravity(1);
        View viewInflate = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_splash_shake_button", "layout"), (ViewGroup) null);
        this.nn = viewInflate;
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(o00.o(getContext(), 300.0f), o00.o(getContext(), 100.0f)));
        TextView textView = (TextView) this.nn.findViewById(o00.o(o0n.m().on(), "tv_splash_shake_view_hint_text", "id"));
        this.n0 = textView;
        if (textView != null) {
            textView.setText(o00.o(o0n.m().on(), "myoffer_shake_full_title", k.f38992h));
        }
        this.o = (ImageView) this.nn.findViewById(o00.o(o0n.m().on(), "tv_splash_shake_view_icon", "id"));
        View viewInflate2 = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.o00 = viewInflate2;
        viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = (TextView) this.o00.findViewById(o00.o(o0n.m().on(), "tv_splash_shake_hint_text", "id"));
        this.no = textView2;
        if (textView2 != null) {
            textView2.setText(o00.o(o0n.m().on(), "myoffer_shake_full_title", k.f38992h));
        }
        this.m = (ImageView) this.o00.findViewById(o00.o(o0n.m().on(), "tv_splash_shake_hint_icon", "id"));
        this.o00.setVisibility(8);
        addView(this.nn);
        addView(this.o00);
    }

    public void replaceShakeCTAButton(View view) {
        View view2;
        if (view == null || (view2 = this.nn) == null) {
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.nn.setVisibility(8);
            this.nn = view;
            view.setVisibility(0);
            if (view.getLayoutParams() != null && view.getLayoutParams() != null) {
                layoutParams = view.getLayoutParams();
            }
            moo.o(view);
            if (o0n.m().m0o()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta success");
            }
            addView(view, layoutParams);
        } catch (Throwable th) {
            if (o0n.m().m0o()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta fail:" + th.getMessage());
            }
            moo.o(this.nn);
            addView(this.nn);
            this.nn.setVisibility(0);
        }
    }

    public void setNeedHideShakeIcon(boolean z2) {
        this.o0o = Boolean.valueOf(z2);
        if (z2) {
            View view = this.o00;
            if (view != null) {
                view.setVisibility(0);
                ImageView imageView = this.m;
                if (imageView != null) {
                    this.o = imageView;
                }
            }
            View view2 = this.nn;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.nn.setOnClickListener(onClickListener);
            this.o00.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public void setShakeHintText(String str) {
        this.nm = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.n0;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.no;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseShakeView
    public void setShakeSetting(oon oonVar, int i2) {
        super.setShakeSetting(oonVar, i2);
        if (TextUtils.isEmpty(this.nm)) {
            if (TextUtils.isEmpty(this.om)) {
                TextView textView = this.n0;
                if (textView != null) {
                    textView.setText(n.o(getContext(), i2));
                }
                TextView textView2 = this.no;
                if (textView2 != null) {
                    textView2.setText(n.o(getContext(), i2));
                    return;
                }
                return;
            }
            TextView textView3 = this.n0;
            if (textView3 != null) {
                textView3.setText(this.om);
            }
            TextView textView4 = this.no;
            if (textView4 != null) {
                textView4.setText(this.om);
            }
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        super.startAnimation(animation);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0o = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o0o = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.o0o = Boolean.FALSE;
    }
}
