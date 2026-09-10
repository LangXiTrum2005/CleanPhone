package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f9690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9691c;

    public /* synthetic */ i(LottieDrawable lottieDrawable, String str, int i2) {
        this.f9689a = i2;
        this.f9690b = lottieDrawable;
        this.f9691c = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        String str = this.f9691c;
        LottieDrawable lottieDrawable = this.f9690b;
        switch (this.f9689a) {
            case 0:
                int i2 = LottieDrawable.L0;
                lottieDrawable.o(str);
                break;
            case 1:
                int i3 = LottieDrawable.L0;
                lottieDrawable.n(str);
                break;
            default:
                int i4 = LottieDrawable.L0;
                lottieDrawable.q(str);
                break;
        }
    }
}
