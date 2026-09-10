package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f816a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.f816a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f816a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((View) obj).setAlpha(0.0f);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) obj, valueAnimator);
                break;
            default:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) obj, valueAnimator);
                break;
        }
    }
}
