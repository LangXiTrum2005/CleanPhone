package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class IndicatorViewController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f19514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f19515B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19518c;
    public final TimeInterpolator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f19519e;
    public final TimeInterpolator f;
    public final Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f19520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f19521i;
    public int j;
    public FrameLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f19522l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19523n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f19524p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19525u;
    public ColorStateList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f19526w;
    public boolean x;
    public AppCompatTextView y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19527z;

    public IndicatorViewController(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.f19520h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f19516a = MotionUtils.c(context, R.attr.motionDurationShort4, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f19517b = MotionUtils.c(context, R.attr.motionDurationMedium4, 167);
        this.f19518c = MotionUtils.c(context, R.attr.motionDurationShort4, 167);
        this.d = MotionUtils.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.d);
        LinearInterpolator linearInterpolator = AnimationUtils.f19078a;
        this.f19519e = MotionUtils.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = MotionUtils.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i2) {
        if (this.f19521i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f19521i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f19521i;
            TextInputLayout textInputLayout = this.f19520h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f19521i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.k.setVisibility(0);
            this.k.addView(appCompatTextView);
        } else {
            this.f19521i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f19521i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f19521i != null) {
            TextInputLayout textInputLayout = this.f19520h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean zD = MaterialResources.d(context);
                LinearLayout linearLayout = this.f19521i;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f19522l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, AppCompatTextView appCompatTextView, int i2, int i3, int i4) {
        if (appCompatTextView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z3 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i5 = this.f19518c;
            objectAnimatorOfFloat.setDuration(z3 ? this.f19517b : i5);
            objectAnimatorOfFloat.setInterpolator(z3 ? this.f19519e : this.f);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i5);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f19516a);
            objectAnimatorOfFloat2.setInterpolator(this.d);
            objectAnimatorOfFloat2.setStartDelay(i5);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.f19524p = null;
        c();
        if (this.f19523n == 1) {
            if (!this.x || TextUtils.isEmpty(this.f19526w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.f19523n, this.o, h(this.r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f19521i;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i3 = this.j - 1;
        this.j = i3;
        LinearLayout linearLayout2 = this.f19521i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        TextInputLayout textInputLayout = this.f19520h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.o == this.f19523n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(final int i2, final int i3, boolean z2) {
        TextView textViewE;
        TextView textViewE2;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f19522l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.x, this.y, 2, i2, i3);
            d(arrayList, this.q, this.r, 1, i2, i3);
            AnimatorSetCompat.a(animatorSet, arrayList);
            final TextView textViewE3 = e(i2);
            final TextView textViewE4 = e(i3);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AppCompatTextView appCompatTextView;
                    int i4 = i3;
                    IndicatorViewController indicatorViewController = IndicatorViewController.this;
                    indicatorViewController.f19523n = i4;
                    indicatorViewController.f19522l = null;
                    TextView textView = textViewE3;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i2 == 1 && (appCompatTextView = indicatorViewController.r) != null) {
                            appCompatTextView.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = textViewE4;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        textView2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    TextView textView = textViewE4;
                    if (textView != null) {
                        textView.setVisibility(0);
                        textView.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewE2 = e(i3)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewE = e(i2)) != null) {
                textViewE.setVisibility(4);
                if (i2 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f19523n = i3;
        }
        TextInputLayout textInputLayout = this.f19520h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
