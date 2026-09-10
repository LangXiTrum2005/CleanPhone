package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.H0;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a0 {
    public static void a(Context context, AdEventListener adEventListener, Ad ad, boolean z2) {
        if (!z2) {
            w6.a("onLoadFailed", adEventListener != null, null, ad != null ? ad.getErrorMessage() : null);
        }
        h0.a(adEventListener != null ? new H0(context, adEventListener, ad, 26) : null);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad, boolean z2) {
        if (!z2) {
            w6.a("onLoad", adEventListener != null, null, null);
        }
        h0.a(adEventListener != null ? new z(context, adEventListener, ad) : null);
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad) {
        try {
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad);
            adEventListener.onFailedToReceiveAd(ad);
        } catch (Throwable th) {
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad);
            vi.a((Object) adEventListener, th);
        }
    }
}
