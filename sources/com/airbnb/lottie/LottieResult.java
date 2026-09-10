package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LottieResult<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f9548b;

    public LottieResult(Object obj) {
        this.f9547a = obj;
        this.f9548b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        Object obj2 = this.f9547a;
        if (obj2 != null && obj2.equals(lottieResult.f9547a)) {
            return true;
        }
        Throwable th = this.f9548b;
        if (th == null || lottieResult.f9548b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9547a, this.f9548b});
    }

    public LottieResult(Throwable th) {
        this.f9548b = th;
        this.f9547a = null;
    }
}
