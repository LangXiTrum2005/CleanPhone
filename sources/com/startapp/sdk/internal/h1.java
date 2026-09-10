package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f41027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerBase f41028b;

    public h1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f41027a = bannerListener;
        this.f41028b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f41027a + " with parameter " + this.f41028b;
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", str);
            this.f41027a.onFailedToReceiveAd(this.f41028b);
        } catch (Throwable th) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f41027a + " with parameter " + this.f41028b;
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f41027a, th);
        }
    }
}
