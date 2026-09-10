package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f9702b;

    public /* synthetic */ m(LottieDrawable lottieDrawable, int i2) {
        this.f9701a = i2;
        this.f9702b = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        LottieDrawable lottieDrawable = this.f9702b;
        switch (this.f9701a) {
            case 0:
                int i2 = LottieDrawable.L0;
                lottieDrawable.k();
                break;
            default:
                int i3 = LottieDrawable.L0;
                lottieDrawable.i();
                break;
        }
    }
}
