package com.airbnb.lottie;

import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f9693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f9694c;

    public /* synthetic */ j(LottieDrawable lottieDrawable, float f, int i2) {
        this.f9692a = i2;
        this.f9693b = lottieDrawable;
        this.f9694c = f;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        float f = this.f9694c;
        LottieDrawable lottieDrawable = this.f9693b;
        switch (this.f9692a) {
            case 0:
                int i2 = LottieDrawable.L0;
                LottieComposition lottieComposition = lottieDrawable.X;
                if (lottieComposition != null) {
                    float fD = MiscUtils.d(lottieComposition.k, lottieComposition.f9520l, f);
                    LottieValueAnimator lottieValueAnimator = lottieDrawable.f9524Y;
                    lottieValueAnimator.l(lottieValueAnimator.i0, fD);
                } else {
                    lottieDrawable.h0.add(new j(lottieDrawable, f, 0));
                }
                break;
            case 1:
                int i3 = LottieDrawable.L0;
                LottieComposition lottieComposition2 = lottieDrawable.X;
                if (lottieComposition2 != null) {
                    lottieDrawable.p((int) MiscUtils.d(lottieComposition2.k, lottieComposition2.f9520l, f));
                } else {
                    lottieDrawable.h0.add(new j(lottieDrawable, f, 1));
                }
                break;
            default:
                int i4 = LottieDrawable.L0;
                lottieDrawable.r(f);
                break;
        }
    }
}
