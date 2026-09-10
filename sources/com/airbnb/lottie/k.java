package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f9695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9697c;

    public /* synthetic */ k(LottieDrawable lottieDrawable, int i2, int i3) {
        this.f9695a = lottieDrawable;
        this.f9696b = i2;
        this.f9697c = i3;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i2 = LottieDrawable.L0;
        LottieDrawable lottieDrawable = this.f9695a;
        LottieComposition lottieComposition = lottieDrawable.X;
        int i3 = this.f9696b;
        int i4 = this.f9697c;
        if (lottieComposition == null) {
            lottieDrawable.h0.add(new k(lottieDrawable, i3, i4));
        } else {
            lottieDrawable.f9524Y.l(i3, i4 + 0.99f);
        }
    }
}
