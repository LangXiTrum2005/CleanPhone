package com.airbnb.lottie;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f9684Y;

    public /* synthetic */ f(Object obj, int i2) {
        this.X = i2;
        this.f9684Y = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f9684Y;
        switch (this.X) {
            case 0:
                return LottieCompositionFactory.c((ByteArrayInputStream) obj, null);
            default:
                HashMap map = LottieCompositionFactory.f9522a;
                return new LottieResult((LottieComposition) obj);
        }
    }
}
