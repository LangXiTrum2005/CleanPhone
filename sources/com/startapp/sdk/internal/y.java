package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y {
    public static void a(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        w6.a("adNotDisplayed", adDisplayListener != null, null, ad != null ? ad.getErrorMessage() : null);
        h0.a(adDisplayListener != null ? new x(context, adDisplayListener, ad) : null);
    }
}
