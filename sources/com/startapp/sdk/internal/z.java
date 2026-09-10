package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f41726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f41727b;

    public z(Context context, AdEventListener adEventListener, Ad ad) {
        this.f41726a = adEventListener;
        this.f41727b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onReceiveAd() of " + this.f41726a + " with parameter " + this.f41727b;
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", str);
            this.f41726a.onReceiveAd(this.f41727b);
        } catch (Throwable th) {
            String str2 = "Failed method onReceiveAd() of " + this.f41726a + " with parameter " + this.f41727b;
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f41726a, th);
        }
    }
}
