package com.startapp.sdk.ads.nativead;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f40510a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f40510a = nativeAdDetails;
    }

    public final void a() {
        if (this.f40510a.displayListener == null || this.f40510a.hiddenSent) {
            return;
        }
        this.f40510a.displayListener.adHidden(this.f40510a);
        this.f40510a.hiddenSent = true;
    }
}
