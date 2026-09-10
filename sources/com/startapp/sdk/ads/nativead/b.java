package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.internal.zf;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f40504a;

    public b(NativeAdDetails nativeAdDetails) {
        this.f40504a = nativeAdDetails;
    }

    @Override // com.startapp.sdk.internal.zf
    public final void a(String str) {
        this.f40504a.onImpressionSent(str);
    }
}
