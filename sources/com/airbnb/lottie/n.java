package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f9868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9869c;

    public /* synthetic */ n(LottieDrawable lottieDrawable, int i2, int i3) {
        this.f9867a = i3;
        this.f9868b = lottieDrawable;
        this.f9869c = i2;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i2 = this.f9869c;
        LottieDrawable lottieDrawable = this.f9868b;
        switch (this.f9867a) {
            case 0:
                int i3 = LottieDrawable.L0;
                lottieDrawable.l(i2);
                break;
            case 1:
                int i4 = LottieDrawable.L0;
                lottieDrawable.m(i2);
                break;
            default:
                int i5 = LottieDrawable.L0;
                lottieDrawable.p(i2);
                break;
        }
    }
}
