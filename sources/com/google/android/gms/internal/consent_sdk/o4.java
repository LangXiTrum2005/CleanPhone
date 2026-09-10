package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 implements k6, k7, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o4 f23129b = new o4(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o4 f23130c = new o4(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o4 f23131d = new o4(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o4 f23132e = new o4(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o4 f23133f = new o4(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o4 f23134g = new o4(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o4 f23135h = new o4(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o4 f23136i = new o4(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o4 f23137j = new o4(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o4 f23138k = new o4(9);
    public static final o4 l = new o4(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o4 f23139m = new o4(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o4 f23140n = new o4(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o4 f23141o = new o4(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o4 f23142p = new o4(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o4 f23143q = new o4(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o4 f23144r = new o4(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o4 f23145s = new o4(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o4 f23146t = new o4(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o4 f23147u = new o4(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o4 f23148v = new o4(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23149a;

    public /* synthetic */ o4(int i10) {
        this.f23149a = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public r6 a(Class cls) {
        switch (this.f23149a) {
            case 20:
                if (!w5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (r6) w5.h(cls.asSubclass(w5.class)).f(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public boolean b(Class cls) {
        switch (this.f23149a) {
            case 20:
                return w5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public Object zzb() {
        switch (this.f23149a) {
            case 21:
                return new b();
            default:
                g0 g0Var = h0.f23035b;
                j0.c(g0Var);
                return new t0(g0Var);
        }
    }
}
