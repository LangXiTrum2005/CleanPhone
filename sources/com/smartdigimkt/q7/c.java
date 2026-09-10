package com.smartdigimkt.q7;

import android.content.Context;
import com.smartdigimkt.sdk.api.format.IMyOfferAdManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c implements IMyOfferAdManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f37946b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37947a = "c";

    private c() {
    }

    public static c a() {
        if (f37946b == null) {
            synchronized (c.class) {
                try {
                    if (f37946b == null) {
                        f37946b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37946b;
    }

    @Override // com.smartdigimkt.sdk.api.format.IMyOfferAdManager
    public boolean checkOffersOutOfCap(Context context, String str) {
        if (context != null) {
            com.smartdigimkt.m6.b.p().d(context.getApplicationContext());
        }
        return com.smartdigimkt.i5.b.a(context).a(str);
    }

    @Override // com.smartdigimkt.sdk.api.format.IMyOfferAdManager
    public String getDefaultOfferId(Context context, String str) {
        if (context != null) {
            com.smartdigimkt.m6.b.p().d(context.getApplicationContext());
        }
        return com.smartdigimkt.i5.a.a(context).a(str);
    }

    @Override // com.smartdigimkt.sdk.api.format.IMyOfferAdManager
    public String getOutOfCapOfferIds(Context context) {
        if (context != null) {
            com.smartdigimkt.m6.b.p().d(context.getApplicationContext());
        }
        return com.smartdigimkt.i5.b.a(context).a();
    }

    @Override // com.smartdigimkt.sdk.api.format.IMyOfferAdManager
    public void preloadTopOnOffer(Context context, String str, JSONObject jSONObject) {
        if (context != null) {
            com.smartdigimkt.m6.b.p().d(context.getApplicationContext());
        }
        com.smartdigimkt.i5.a.a(context).a(str, jSONObject);
    }
}
