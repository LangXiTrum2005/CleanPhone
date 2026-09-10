package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f41127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f41128b;

    public j1(Context context, BannerListener bannerListener, View view) {
        this.f41127a = bannerListener;
        this.f41128b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f41127a + " with parameter " + this.f41128b;
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", str);
            this.f41127a.onClick(this.f41128b);
        } catch (Throwable th) {
            String str2 = "Calling method onClick() of " + this.f41127a + " with parameter " + this.f41128b;
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f41127a, th);
        }
    }
}
