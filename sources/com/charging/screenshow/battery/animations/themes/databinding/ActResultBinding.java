package com.charging.screenshow.battery.animations.themes.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.charging.screenshow.battery.animations.themes.view.CompleteView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActResultBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f13143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f13144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f13145c;
    public final TextView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f13146e;
    public final CompleteView f;

    public ActResultBinding(LinearLayout linearLayout, FrameLayout frameLayout, View view, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2, CompleteView completeView) {
        this.f13143a = frameLayout;
        this.f13144b = view;
        this.f13145c = lottieAnimationView;
        this.d = textView;
        this.f13146e = textView2;
        this.f = completeView;
    }
}
