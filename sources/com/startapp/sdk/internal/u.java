package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f41527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f41528b;

    public u(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f41527a = adDisplayListener;
        this.f41528b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adHidden() of " + this.f41527a + " with parameter " + this.f41528b;
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(3, "StartAppSDK", str);
            this.f41527a.adHidden(this.f41528b);
        } catch (Throwable th) {
            String str2 = "Failed method adHidden() of " + this.f41527a + " with parameter " + this.f41528b;
            WeakHashMap weakHashMap2 = vi.f41589a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f41527a, th);
        }
    }
}
