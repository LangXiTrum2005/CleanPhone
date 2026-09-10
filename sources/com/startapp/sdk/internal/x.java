package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f41647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f41648b;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f41647a = adDisplayListener;
        this.f41648b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f41647a + " with parameter " + this.f41648b;
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", str);
            this.f41647a.adNotDisplayed(this.f41648b);
        } catch (Throwable th) {
            String str2 = "Failed method adNotDisplayed() of " + this.f41647a + " with parameter " + this.f41648b;
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f41647a, th);
        }
    }
}
