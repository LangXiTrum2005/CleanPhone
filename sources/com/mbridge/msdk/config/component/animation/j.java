package com.mbridge.msdk.config.component.animation;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31822b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f31821a = i10;
        this.f31822b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31821a;
        Object obj = this.f31822b;
        switch (i10) {
            case 0:
                b.a((GradientDrawable) obj, valueAnimator);
                break;
            case 1:
                b.a((TextView) obj, valueAnimator);
                break;
            case 2:
                b.a((ImageView) obj, valueAnimator);
                break;
            default:
                b.a((View) obj, valueAnimator);
                break;
        }
    }
}
