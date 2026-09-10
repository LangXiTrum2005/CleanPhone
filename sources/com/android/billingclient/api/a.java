package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.p12;
import com.google.android.gms.internal.ads.yz1;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.r3;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v;
import com.google.android.gms.internal.play_billing.y0;
import com.google.android.gms.internal.play_billing.z0;
import com.ironsource.Xa;
import ea.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a extends BillingClient {
    public boolean A;
    public boolean B;
    public boolean C;
    public final PendingPurchasesParams D;
    public final boolean E;
    public final boolean F;
    public volatile BillingClientStateListener G;
    public ExecutorService H;
    public final Long I;
    public final r9.b J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7226d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile p12 f7228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f7229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi.b f7230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.d f7231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f7232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7233k;
    public boolean l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7246y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7247z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7223a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f7224b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7227e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7234m = 0;

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, BillingClient.Builder builder) {
        long jNextLong = new Random().nextLong();
        this.I = Long.valueOf(jNextLong);
        this.J = com.google.android.gms.internal.play_billing.j.f24297a;
        this.f7225c = "8.0.0";
        String strD = D();
        this.f7226d = strD;
        this.f7229g = context.getApplicationContext();
        o3 o3VarX = p3.x();
        o3VarX.c();
        p3.v((p3) o3VarX.f24469b);
        if (strD != null) {
            o3VarX.c();
            p3.w((p3) o3VarX.f24469b, strD);
        }
        String packageName = this.f7229g.getPackageName();
        o3VarX.c();
        p3.t((p3) o3VarX.f24469b, packageName);
        o3VarX.c();
        p3.q((p3) o3VarX.f24469b, jNextLong);
        boolean z10 = builder.f7085g;
        o3VarX.c();
        p3.u((p3) o3VarX.f24469b, z10);
        int i10 = Build.VERSION.SDK_INT;
        o3VarX.c();
        p3.n((p3) o3VarX.f24469b, i10);
        o3VarX.e();
        try {
            int i11 = this.f7229g.getPackageManager().getPackageInfo(this.f7229g.getPackageName(), 0).versionCode;
            o3VarX.c();
            p3.o((p3) o3VarX.f24469b, i11);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f7230h = new wi.b(this.f7229g, (p3) o3VarX.a());
        if (purchasesUpdatedListener == null) {
            u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7228f = new p12(this.f7229g, purchasesUpdatedListener, userChoiceBillingListener, this.f7230h);
        this.D = pendingPurchasesParams;
        this.F = userChoiceBillingListener != null;
        this.E = builder.f7085g;
    }

    public static String D() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Future b(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void v(a aVar, int i10) {
        aVar.f7234m = i10;
        aVar.C = i10 >= 26;
        aVar.B = i10 >= 24;
        aVar.A = i10 >= 23;
        aVar.f7247z = i10 >= 22;
        aVar.f7246y = i10 >= 21;
        aVar.f7245x = i10 >= 20;
        aVar.f7244w = i10 >= 19;
        aVar.f7243v = i10 >= 18;
        aVar.f7242u = i10 >= 17;
        aVar.f7241t = i10 >= 16;
        aVar.f7240s = i10 >= 15;
        aVar.f7239r = i10 >= 14;
        aVar.f7238q = i10 >= 12;
        aVar.f7237p = i10 >= 9;
        aVar.f7236o = i10 >= 8;
        aVar.f7235n = i10 >= 6;
    }

    public static void w(a aVar, int i10) {
        if (i10 != 0) {
            aVar.p(0);
            return;
        }
        synchronized (aVar.f7223a) {
            try {
                if (aVar.f7224b == 3) {
                    return;
                }
                aVar.p(2);
                p12 p12Var = aVar.f7228f != null ? aVar.f7228f : null;
                if (p12Var != null) {
                    boolean z10 = aVar.f7246y;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    p12Var.f18437a = z10;
                    x0 x0Var = (x0) p12Var.f18443g;
                    Context context = (Context) p12Var.f18438b;
                    x0Var.a(context, intentFilter2);
                    if (!p12Var.f18437a) {
                        ((x0) p12Var.f18442f).a(context, intentFilter);
                        return;
                    }
                    x0 x0Var2 = (x0) p12Var.f18442f;
                    synchronized (x0Var2) {
                        try {
                            if (x0Var2.f39902b) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(x0Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != x0Var2.f39903c ? 4 : 2);
                            } else {
                                context.registerReceiver(x0Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            x0Var2.f39902b = true;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final BillingResult A() {
        int[] iArr = {0, 3};
        synchronized (this.f7223a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f7224b == iArr[i10]) {
                    return k.f7276j;
                }
            }
            return k.f7274h;
        }
    }

    public final s0 B(final int i10) {
        if (this.E && !u()) {
            return d0.c.W(new k4() { // from class: com.android.billingclient.api.zzu
                @Override // com.google.android.gms.internal.play_billing.k4
                public final Object zza(j4 j4Var) {
                    a aVar = this.zza;
                    aVar.q(new y5.a(aVar, j4Var), i10);
                    return "reconnectIfNeeded";
                }
            });
        }
        u.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new r0(k.f7275i);
    }

    public final void C() {
        if (TextUtils.isEmpty(null)) {
            this.f7229g.getPackageName();
        }
    }

    public final zzcw E(BillingResult billingResult, j3 j3Var, String str, Exception exc) {
        I(j3Var, 9, billingResult, zzcg.zza(exc));
        u.i("BillingClient", str, exc);
        return new zzcw(billingResult, null);
    }

    public final void F(int i10, BillingResult billingResult, j3 j3Var) {
        h3 h3Var = null;
        f3 f3Var = null;
        if (billingResult.getResponseCode() == 0) {
            int i11 = zzcg.zza;
            try {
                g3 g3VarT = h3.t();
                g3VarT.c();
                h3.s((h3) g3VarT.f24469b, 5);
                r3 r3VarO = s3.o();
                r3VarO.c();
                s3.n((s3) r3VarO.f24469b, i10);
                s3 s3Var = (s3) r3VarO.a();
                g3VarT.c();
                h3.p((h3) g3VarT.f24469b, s3Var);
                h3Var = (h3) g3VarT.a();
            } catch (Exception e10) {
                u.i("BillingLogger", "Unable to create logging payload", e10);
            }
            n(h3Var);
            return;
        }
        int i12 = zzcg.zza;
        try {
            e3 e3VarV = f3.v();
            i3 i3VarS = k3.s();
            i3VarS.e(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            i3VarS.c();
            k3.o((k3) i3VarS.f24469b, debugMessage);
            i3VarS.d(j3Var);
            e3VarV.d(i3VarS);
            e3VarV.f(5);
            r3 r3VarO2 = s3.o();
            r3VarO2.c();
            s3.n((s3) r3VarO2.f24469b, i10);
            s3 s3Var2 = (s3) r3VarO2.a();
            e3VarV.c();
            f3.r((f3) e3VarV.f24469b, s3Var2);
            f3Var = (f3) e3VarV.a();
        } catch (Exception e11) {
            u.i("BillingLogger", "Unable to create logging payload", e11);
        }
        m(f3Var);
    }

    public final void G(int i10, BillingResult billingResult, j3 j3Var) {
        try {
            int i11 = zzcg.zza;
            m(zzcg.zzb(j3Var, i10, billingResult, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void H(j3 j3Var, BillingResult billingResult, long j10) {
        try {
            int i10 = zzcg.zza;
            try {
                this.f7230h.i(zzcg.zzb(j3Var, 2, billingResult, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7234m, j10);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void I(j3 j3Var, int i10, BillingResult billingResult, String str) {
        try {
            int i11 = zzcg.zza;
            m(zzcg.zzb(j3Var, i10, billingResult, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void J(j3 j3Var, BillingResult billingResult, long j10, boolean z10) {
        try {
            int i10 = zzcg.zza;
            try {
                this.f7230h.k(zzcg.zzb(j3Var, 2, billingResult, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7234m, j10, z10);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void K(j3 j3Var, BillingResult billingResult, String str, long j10, boolean z10) {
        try {
            int i10 = zzcg.zza;
            try {
                this.f7230h.k(zzcg.zzb(j3Var, 2, billingResult, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7234m, j10, z10);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void L(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f7227e.post(new Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingResult billingResult2 = billingResult;
                if (((PurchasesUpdatedListener) aVar.f7228f.f18439c) != null) {
                    ((PurchasesUpdatedListener) aVar.f7228f.f18439c).onPurchasesUpdated(billingResult2, null);
                } else {
                    u.h("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    public final synchronized ExecutorService a() {
        try {
            if (this.H == null) {
                this.H = Executors.newFixedThreadPool(u.f24478a, new q9.a(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.H;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        j3 j3Var = j3.SERVICE_CONNECTION_NOT_READY;
                        BillingResult billingResult = k.f7276j;
                        aVar.G(3, billingResult, j3Var);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult);
                        return null;
                    }
                    if (TextUtils.isEmpty(acknowledgePurchaseParams2.getPurchaseToken())) {
                        u.h("BillingClient", "Please provide a valid purchase token.");
                        j3 j3Var2 = j3.EMPTY_PURCHASE_TOKEN;
                        BillingResult billingResult2 = k.f7273g;
                        aVar.G(3, billingResult2, j3Var2);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult2);
                        return null;
                    }
                    if (!aVar.f7237p) {
                        j3 j3Var3 = j3.API_VERSION_NOT_V9;
                        BillingResult billingResult3 = k.f7267a;
                        aVar.G(3, billingResult3, j3Var3);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult3);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.c(acknowledgePurchaseResponseListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    Bundle bundleD1 = ((com.google.android.gms.internal.play_billing.b) dVar).D1(packageName, bundle, purchaseToken);
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(k.a(u.a(bundleD1, "BillingClient"), u.f(bundleD1, "BillingClient")));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.c(acknowledgePurchaseResponseListener2, k.f7276j, j3.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.c(acknowledgePurchaseResponseListener2, k.f7274h, j3.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                BillingResult billingResult = k.f7277k;
                aVar.G(3, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult);
            }
        }, x(), a()) == null) {
            BillingResult billingResultA = A();
            G(3, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultA);
        }
    }

    public final void c(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        u.i("BillingClient", "Error in acknowledge purchase!", exc);
        I(j3Var, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzak
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r11v3 */
            /* JADX WARN: Type inference failed for: r11v30 */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r11v9 */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.android.billingclient.api.a] */
            /* JADX WARN: Type inference failed for: r2v0, types: [com.android.billingclient.api.ConsumeResponseListener] */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r3v16 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r4v10, types: [com.google.android.gms.internal.play_billing.b] */
            /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.auth.a, com.google.android.gms.internal.play_billing.b] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r5v4, types: [android.os.Parcel] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Exception exc;
                ?? r3;
                DeadObjectException deadObjectException;
                ?? r11;
                ?? r10;
                com.google.android.gms.internal.play_billing.d dVar;
                int i10;
                String strF;
                ?? r2 = this.zza;
                ?? r12 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                if (!r2.t()) {
                    j3 j3Var = j3.SERVICE_CONNECTION_NOT_READY;
                    BillingResult billingResult = k.f7276j;
                    r2.G(4, billingResult, j3Var);
                    r12.onConsumeResponse(billingResult, consumeParams2.getPurchaseToken());
                    return null;
                }
                ?? purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    u.g("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    ?? r13 = r2.f7223a;
                    synchronized (r13) {
                        try {
                            dVar = r2.f7231i;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        if (dVar == null) {
                            try {
                                r2.e(r12, purchaseToken, k.f7276j, j3.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                                return null;
                            } catch (DeadObjectException e10) {
                                e = e10;
                                r13 = purchaseToken;
                                deadObjectException = e;
                                r10 = r13;
                                r2.e(r12, r10, k.f7276j, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e11) {
                                e = e11;
                                r13 = purchaseToken;
                                exc = e;
                                r11 = r13;
                                r2.e(r12, r11, k.f7274h, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", exc);
                                return null;
                            }
                        }
                        r13 = purchaseToken;
                        try {
                            try {
                                if (r2.f7237p) {
                                    String packageName = r2.f7229g.getPackageName();
                                    boolean z10 = r2.f7237p;
                                    String str = r2.f7225c;
                                    String str2 = r2.f7226d;
                                    long jLongValue = r2.I.longValue();
                                    Bundle bundle = new Bundle();
                                    if (z10) {
                                        u.b(jLongValue, bundle, str, str2);
                                    }
                                    try {
                                        Bundle bundleE1 = ((com.google.android.gms.internal.play_billing.b) dVar).E1(packageName, bundle, r13);
                                        i10 = bundleE1.getInt("RESPONSE_CODE");
                                        strF = u.f(bundleE1, "BillingClient");
                                    } catch (DeadObjectException e12) {
                                        e = e12;
                                        deadObjectException = e;
                                        r10 = r13;
                                        r2.e(r12, r10, k.f7276j, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", deadObjectException);
                                        return null;
                                    } catch (Exception e13) {
                                        e = e13;
                                        exc = e;
                                        r11 = r13;
                                        r2.e(r12, r11, k.f7274h, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", exc);
                                        return null;
                                    }
                                } else {
                                    String packageName2 = r2.f7229g.getPackageName();
                                    try {
                                        ?? r14 = (com.google.android.gms.internal.play_billing.b) dVar;
                                        ?? Y1 = r14.y1();
                                        Y1.writeInt(3);
                                        Y1.writeString(packageName2);
                                        Y1.writeString(r13);
                                        Parcel parcelZ1 = r14.z1(Y1, 5);
                                        i10 = parcelZ1.readInt();
                                        parcelZ1.recycle();
                                        strF = "";
                                    } catch (DeadObjectException e14) {
                                        e = e14;
                                        purchaseToken = r13;
                                        r3 = purchaseToken;
                                        deadObjectException = e;
                                        r10 = r3;
                                        r2.e(r12, r10, k.f7276j, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", deadObjectException);
                                        return null;
                                    }
                                }
                                BillingResult billingResultA = k.a(i10, strF);
                                if (i10 == 0) {
                                    u.g("BillingClient", "Successfully consumed purchase.");
                                    r12.onConsumeResponse(billingResultA, r13);
                                    return null;
                                }
                                r2.e(r12, r13, billingResultA, j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + i10, null);
                                return null;
                            } catch (DeadObjectException e15) {
                                e = e15;
                                r3 = r13;
                                deadObjectException = e;
                                r10 = r3;
                                r2.e(r12, r10, k.f7276j, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", deadObjectException);
                                return null;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            purchaseToken = r13;
                            exc = e;
                            r11 = purchaseToken;
                            r2.e(r12, r11, k.f7274h, j3.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e17) {
                        e = e17;
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (DeadObjectException e19) {
                    e = e19;
                } catch (Exception e20) {
                    e = e20;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                BillingResult billingResult = k.f7277k;
                aVar.G(4, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                consumeResponseListener2.onConsumeResponse(billingResult, consumeParams2.getPurchaseToken());
            }
        }, x(), a()) == null) {
            BillingResult billingResultA = A();
            G(4, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            consumeResponseListener.onConsumeResponse(billingResultA, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        aVar.f(alternativeBillingOnlyReportingDetailsListener2, k.f7276j, j3.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.f7246y) {
                        u.h("BillingClient", "Current client doesn't support alternative billing only.");
                        aVar.f(alternativeBillingOnlyReportingDetailsListener2, k.D, j3.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.f(alternativeBillingOnlyReportingDetailsListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).K1(packageName, bundle, new y5.b(alternativeBillingOnlyReportingDetailsListener2, aVar.f7230h, aVar.f7234m));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.f(alternativeBillingOnlyReportingDetailsListener2, k.f7276j, j3.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.f(alternativeBillingOnlyReportingDetailsListener2, k.f7274h, j3.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.f(alternativeBillingOnlyReportingDetailsListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, x(), a()) == null) {
            f(alternativeBillingOnlyReportingDetailsListener, A(), j3.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        final String str = null;
        if (b(new Callable(externalOfferReportingDetailsListener, str) { // from class: com.android.billingclient.api.zzaq
            public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = this.zzb;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        aVar.g(externalOfferReportingDetailsListener2, k.f7276j, j3.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.f7247z) {
                        u.h("BillingClient", "Current client doesn't support external offer.");
                        aVar.g(externalOfferReportingDetailsListener2, k.f7285t, j3.EXTERNAL_OFFER_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.g(externalOfferReportingDetailsListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    long j10 = aVar.f7229g.getPackageManager().getPackageInfo(aVar.f7229g.getPackageName(), 0).firstInstallTime;
                    String str2 = aVar.f7225c;
                    String str3 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str2, str3);
                    bundle.putLong("appInstallTimeMillis", j10);
                    ((com.google.android.gms.internal.play_billing.b) dVar).L1(packageName, bundle, new y5.b(externalOfferReportingDetailsListener2, aVar.f7230h, aVar.f7234m));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.g(externalOfferReportingDetailsListener2, k.f7276j, j3.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.g(externalOfferReportingDetailsListener2, k.f7274h, j3.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g(externalOfferReportingDetailsListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, x(), a()) == null) {
            g(externalOfferReportingDetailsListener, A(), j3.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    public final void d(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final void e(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, j3 j3Var, String str2, Exception exc) {
        u.i("BillingClient", str2, exc);
        I(j3Var, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #5 {, blocks: (B:20:0x0050, B:22:0x0054), top: B:50:0x0050, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        ExecutorService executorService;
        try {
            int i10 = zzcg.zza;
            n(zzcg.zzc(12, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f7223a) {
            try {
                if (this.f7228f != null) {
                    p12 p12Var = this.f7228f;
                    x0 x0Var = (x0) p12Var.f18442f;
                    Context context = (Context) p12Var.f18438b;
                    x0Var.c(context);
                    ((x0) p12Var.f18443g).c(context);
                    try {
                        u.g("BillingClient", "Unbinding from service.");
                        r();
                    } catch (Throwable th3) {
                        u.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th3);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.H;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.H = null;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            u.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th4);
                        } catch (Throwable th5) {
                            p(3);
                            this.G = null;
                            throw th5;
                        }
                    }
                    p(3);
                    this.G = null;
                } else {
                    u.g("BillingClient", "Unbinding from service.");
                    r();
                    synchronized (this) {
                        executorService = this.H;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.H = null;
                        }
                        p(3);
                        this.G = null;
                    }
                }
            } catch (Throwable th6) {
                u.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th6);
            }
            throw th;
        }
    }

    public final void f(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final void g(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        u.h("BillingClient", "Service disconnected.");
                        j3 j3Var = j3.SERVICE_CONNECTION_NOT_READY;
                        BillingResult billingResult = k.f7276j;
                        aVar.G(13, billingResult, j3Var);
                        billingConfigResponseListener2.onBillingConfigResponse(billingResult, null);
                        return null;
                    }
                    if (!aVar.f7243v) {
                        u.h("BillingClient", "Current client doesn't support get billing config.");
                        j3 j3Var2 = j3.GET_BILLING_CONFIG_NOT_SUPPORTED;
                        BillingResult billingResult2 = k.f7290y;
                        aVar.G(13, billingResult2, j3Var2);
                        billingConfigResponseListener2.onBillingConfigResponse(billingResult2, null);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.j(billingConfigResponseListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).N1(packageName, bundle, new f(billingConfigResponseListener2, aVar.f7230h, aVar.f7234m));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.j(billingConfigResponseListener2, k.f7276j, j3.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.j(billingConfigResponseListener2, k.f7274h, j3.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                BillingResult billingResult = k.f7277k;
                aVar.G(13, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                billingConfigResponseListener2.onBillingConfigResponse(billingResult, null);
            }
        }, x(), a()) == null) {
            BillingResult billingResultA = A();
            G(13, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            billingConfigResponseListener.onBillingConfigResponse(billingResultA, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i10;
        synchronized (this.f7223a) {
            i10 = this.f7224b;
        }
        return i10;
    }

    public final void h(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final void i(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        aVar.d(alternativeBillingOnlyAvailabilityListener2, k.f7276j, j3.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.f7246y) {
                        u.h("BillingClient", "Current client doesn't support alternative billing only.");
                        aVar.d(alternativeBillingOnlyAvailabilityListener2, k.D, j3.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.d(alternativeBillingOnlyAvailabilityListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).P1(packageName, bundle, new y5.b(alternativeBillingOnlyAvailabilityListener2, aVar.f7230h, aVar.f7234m));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.d(alternativeBillingOnlyAvailabilityListener2, k.f7276j, j3.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.d(alternativeBillingOnlyAvailabilityListener2, k.f7274h, j3.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(alternativeBillingOnlyAvailabilityListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, x(), a()) == null) {
            d(alternativeBillingOnlyAvailabilityListener, A(), j3.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzau
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                aVar.getClass();
                try {
                    if (!aVar.t()) {
                        aVar.h(externalOfferAvailabilityListener2, k.f7276j, j3.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.B) {
                        u.h("BillingClient", "Current client doesn't support launching external offer flow.");
                        aVar.h(externalOfferAvailabilityListener2, k.A, j3.LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.h(externalOfferAvailabilityListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).Q1(packageName, bundle, new y5.b(externalOfferAvailabilityListener2, aVar.f7230h, aVar.f7234m));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.h(externalOfferAvailabilityListener2, k.f7276j, j3.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.h(externalOfferAvailabilityListener2, k.f7274h, j3.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.h(externalOfferAvailabilityListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, x(), a()) == null) {
            h(externalOfferAvailabilityListener, A(), j3.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!s()) {
            BillingResult billingResult = k.f7276j;
            if (billingResult.getResponseCode() != 0) {
                G(5, billingResult, j3.SERVICE_CONNECTION_NOT_READY);
                return billingResult;
            }
            try {
                int i10 = zzcg.zza;
                n(zzcg.zzc(5, m3.BROADCAST_ACTION_UNSPECIFIED));
                return billingResult;
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
                return billingResult;
            }
        }
        BillingResult billingResult2 = k.f7267a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    BillingResult billingResult3 = this.l ? k.f7275i : k.f7278m;
                    F(3, billingResult3, j3.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED);
                    return billingResult3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    BillingResult billingResult4 = this.f7240s ? k.f7275i : k.f7280o;
                    F(6, billingResult4, j3.CROSS_APP_NOT_SUPPORTED);
                    return billingResult4;
                }
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    BillingResult billingResult5 = this.f7238q ? k.f7275i : k.f7284s;
                    F(5, billingResult5, j3.IN_APP_MESSAGE_NOT_SUPPORTED);
                    return billingResult5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    BillingResult billingResult6 = this.f7241t ? k.f7275i : k.f7281p;
                    F(8, billingResult6, j3.MULTI_ITEM_NOT_SUPPORTED);
                    return billingResult6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    BillingResult billingResult7 = this.f7239r ? k.f7275i : k.f7282q;
                    F(7, billingResult7, j3.OFFER_ID_TOKEN_NOT_SUPPORTED);
                    return billingResult7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    BillingResult billingResult8 = this.f7241t ? k.f7275i : k.f7281p;
                    F(9, billingResult8, j3.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED);
                    return billingResult8;
                }
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    BillingResult billingResult9 = this.f7242u ? k.f7275i : k.f7283r;
                    F(10, billingResult9, j3.PRODUCT_DETAILS_NOT_SUPPORTED);
                    return billingResult9;
                }
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    BillingResult billingResult10 = this.f7243v ? k.f7275i : k.f7290y;
                    F(11, billingResult10, j3.GET_BILLING_CONFIG_NOT_SUPPORTED);
                    return billingResult10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    BillingResult billingResult11 = this.f7243v ? k.f7275i : k.f7291z;
                    F(12, billingResult11, j3.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED);
                    return billingResult11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    BillingResult billingResult12 = this.f7245x ? k.f7275i : k.C;
                    F(13, billingResult12, j3.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED);
                    return billingResult12;
                }
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    BillingResult billingResult13 = this.f7246y ? k.f7275i : k.D;
                    F(14, billingResult13, j3.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED);
                    return billingResult13;
                }
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    BillingResult billingResult14 = this.B ? k.f7275i : k.A;
                    F(18, billingResult14, j3.LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED);
                    return billingResult14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    BillingResult billingResult15 = this.A ? k.f7275i : k.f7286u;
                    F(19, billingResult15, j3.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED);
                    return billingResult15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    BillingResult billingResult16 = this.B ? k.f7275i : k.f7287v;
                    F(20, billingResult16, j3.AUTO_PAY_NOT_SUPPORTED);
                    return billingResult16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    BillingResult billingResult17 = this.C ? k.f7275i : k.f7288w;
                    F(21, billingResult17, j3.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED);
                    return billingResult17;
                }
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    BillingResult billingResult18 = this.f7236o ? k.f7275i : k.f7279n;
                    F(4, billingResult18, j3.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED);
                    return billingResult18;
                }
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    BillingResult billingResult19 = this.f7233k ? k.f7275i : k.l;
                    F(2, billingResult19, j3.SUBSCRIPTIONS_NOT_SUPPORTED);
                    return billingResult19;
                }
                break;
        }
        u.h("BillingClient", "Unsupported feature: ".concat(str));
        BillingResult billingResult20 = k.f7289x;
        F(1, billingResult20, j3.UNKNOWN_FEATURE);
        return billingResult20;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.E) {
            return true;
        }
        return u();
    }

    public final void j(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        u.i("BillingClient", "getBillingConfig got an exception.", exc);
        I(j3Var, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final void k(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, j3 j3Var, Exception exc) {
        I(j3Var, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final void l(int i10, j3 j3Var, Exception exc) {
        f3 f3Var;
        u.i("BillingClient", "showInAppMessages error.", exc);
        String strZza = zzcg.zza(exc);
        try {
            i3 i3VarS = k3.s();
            i3VarS.e(i10);
            i3VarS.d(j3Var);
            if (strZza != null) {
                i3VarS.c();
                k3.n((k3) i3VarS.f24469b, strZza);
            }
            e3 e3VarV = f3.v();
            e3VarV.d(i3VarS);
            e3VarV.f(30);
            f3Var = (f3) e3VarV.a();
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to create logging payload", th2);
            f3Var = null;
        }
        this.f7230h.c(f3Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:113:0x0259  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c1 A[EDGE_INSN: B:130:0x02c1->B:79:0x0134 BREAK  A[LOOP:6: B:81:0x0141->B:89:0x0180]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02de  */
    /* JADX WARN: Code duplicated, block: B:139:0x0317  */
    /* JADX WARN: Code duplicated, block: B:142:0x032a  */
    /* JADX WARN: Code duplicated, block: B:145:0x033d  */
    /* JADX WARN: Code duplicated, block: B:148:0x034c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0358  */
    /* JADX WARN: Code duplicated, block: B:154:0x0374  */
    /* JADX WARN: Code duplicated, block: B:157:0x0386  */
    /* JADX WARN: Code duplicated, block: B:158:0x0391  */
    /* JADX WARN: Code duplicated, block: B:161:0x039d  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e4 A[LOOP:1: B:174:0x03de->B:176:0x03e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:182:0x0414  */
    /* JADX WARN: Code duplicated, block: B:185:0x043f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0459  */
    /* JADX WARN: Code duplicated, block: B:190:0x0495  */
    /* JADX WARN: Code duplicated, block: B:191:0x0498  */
    /* JADX WARN: Code duplicated, block: B:195:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:197:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:203:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:206:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:209:0x04fa A[LOOP:3: B:207:0x04f4->B:209:0x04fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0525  */
    /* JADX WARN: Code duplicated, block: B:215:0x055b  */
    /* JADX WARN: Code duplicated, block: B:217:0x056f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0595  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a8 A[LOOP:5: B:223:0x058f->B:228:0x05a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:233:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:240:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:243:0x0602  */
    /* JADX WARN: Code duplicated, block: B:246:0x060d  */
    /* JADX WARN: Code duplicated, block: B:259:0x064c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x064e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0673  */
    /* JADX WARN: Code duplicated, block: B:269:0x067e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0686  */
    /* JADX WARN: Code duplicated, block: B:272:0x0692  */
    /* JADX WARN: Code duplicated, block: B:278:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:282:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:284:0x06c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:288:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:289:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:291:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:305:0x0732 A[Catch: Exception -> 0x071e, CancellationException | TimeoutException -> 0x0721, TryCatch #2 {Exception -> 0x071e, blocks: (B:295:0x0717, B:305:0x0732, B:307:0x074f, B:321:0x07be, B:323:0x07c2, B:334:0x07f1, B:330:0x07da, B:320:0x07ab, B:340:0x07fd), top: B:356:0x070d }] */
    /* JADX WARN: Code duplicated, block: B:307:0x074f A[Catch: Exception -> 0x071e, CancellationException | TimeoutException -> 0x0721, TRY_LEAVE, TryCatch #2 {Exception -> 0x071e, blocks: (B:295:0x0717, B:305:0x0732, B:307:0x074f, B:321:0x07be, B:323:0x07c2, B:334:0x07f1, B:330:0x07da, B:320:0x07ab, B:340:0x07fd), top: B:356:0x070d }] */
    /* JADX WARN: Code duplicated, block: B:317:0x0781 A[Catch: all -> 0x0770, TryCatch #0 {all -> 0x0770, blocks: (B:309:0x076d, B:312:0x0772, B:314:0x077a, B:315:0x077d, B:317:0x0781, B:318:0x078c), top: B:354:0x076b }] */
    /* JADX WARN: Code duplicated, block: B:318:0x078c A[Catch: all -> 0x0770, TRY_LEAVE, TryCatch #0 {all -> 0x0770, blocks: (B:309:0x076d, B:312:0x0772, B:314:0x077a, B:315:0x077d, B:317:0x0781, B:318:0x078c), top: B:354:0x076b }] */
    /* JADX WARN: Code duplicated, block: B:323:0x07c2 A[Catch: Exception -> 0x071e, CancellationException | TimeoutException -> 0x0721, CancellationException | TimeoutException -> 0x0721, TryCatch #2 {Exception -> 0x071e, blocks: (B:295:0x0717, B:305:0x0732, B:307:0x074f, B:321:0x07be, B:323:0x07c2, B:334:0x07f1, B:330:0x07da, B:320:0x07ab, B:340:0x07fd), top: B:356:0x070d }] */
    /* JADX WARN: Code duplicated, block: B:326:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:340:0x07fd A[Catch: Exception -> 0x071e, CancellationException | TimeoutException -> 0x0721, CancellationException | TimeoutException -> 0x0721, TRY_LEAVE, TryCatch #2 {Exception -> 0x071e, blocks: (B:295:0x0717, B:305:0x0732, B:307:0x074f, B:321:0x07be, B:323:0x07c2, B:334:0x07f1, B:330:0x07da, B:320:0x07ab, B:340:0x07fd), top: B:356:0x070d }] */
    /* JADX WARN: Code duplicated, block: B:359:0x07ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x070f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0249 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:? A[LOOP:8: B:111:0x0253->B:391:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0130  */
    /* JADX WARN: Code duplicated, block: B:80:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01da  */
    /* JADX WARN: Instruction removed from duplicated block: B:307:0x074f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:318:0x078c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.android.billingclient.api.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v15, types: [long] */
    /* JADX WARN: Type inference failed for: r5v16, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    @Override // com.android.billingclient.api.BillingClient
    public BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        boolean z10;
        int i10;
        String productId;
        String productType;
        String str;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        int i11;
        long j10;
        HashMap map;
        HashSet hashSet;
        r rVar;
        int size;
        int i12;
        Iterator it;
        String strZzb;
        BillingResult billingResultA;
        ProductDetails.OneTimePurchaseOfferDetails next;
        String str2;
        int i13;
        BillingFlowParams.ProductDetailsParams productDetailsParams2;
        int i14;
        BillingFlowParams.ProductDetailsParams productDetailsParams3;
        BillingResult billingResult;
        long j11;
        long j12;
        boolean z11;
        String str3;
        Future futureB;
        ?? r10;
        String str4;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        boolean z12;
        long j13;
        Bundle bundle;
        int iA;
        String strF;
        j3 j3VarA;
        String string;
        Object obj;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Bundle bundle2;
        String str5;
        boolean z17;
        ArrayList arrayList;
        SkuDetails skuDetails;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<Integer> arrayList7;
        int i15;
        BillingFlowParams.ProductDetailsParams productDetailsParams4;
        ProductDetails productDetailsZza;
        String strZzc;
        ArrayList arrayList8;
        Iterator it2;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        Iterator it3;
        boolean z18;
        Intent intent;
        int i16;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        ArrayList<String> arrayList11;
        ArrayList<Integer> arrayList12;
        ArrayList<String> arrayList13;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        ArrayList<String> arrayList14;
        ArrayList<String> arrayList15;
        int i17;
        int iZza;
        boolean z23;
        long jNextLong = new Random().nextLong();
        if (this.f7228f == null || ((PurchasesUpdatedListener) this.f7228f.f18439c) == null) {
            j3 j3Var = j3.MISSING_LISTENER;
            BillingResult billingResult2 = k.E;
            H(j3Var, billingResult2, jNextLong);
            return billingResult2;
        }
        if (!s()) {
            j3 j3Var2 = j3.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult3 = k.f7276j;
            H(j3Var2, billingResult3, jNextLong);
            L(billingResult3);
            return billingResult3;
        }
        synchronized (this.f7223a) {
            try {
                z10 = false;
                if (this.f7232j != null) {
                    z10 = this.f7232j.f7255d > 0;
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList<SkuDetails> arrayListZzj = billingFlowParams.zzj();
        List listZzk = billingFlowParams.zzk();
        Iterator it4 = arrayListZzj.iterator();
        SkuDetails skuDetails2 = (SkuDetails) (it4.hasNext() ? it4.next() : null);
        Iterator it5 = listZzk.iterator();
        BillingFlowParams.ProductDetailsParams productDetailsParams5 = (BillingFlowParams.ProductDetailsParams) (it5.hasNext() ? it5.next() : null);
        if (skuDetails2 != null) {
            productId = skuDetails2.getSku();
            productType = skuDetails2.getType();
        } else {
            productId = productDetailsParams5.zza().getProductId();
            productType = productDetailsParams5.zza().getProductType();
        }
        if (productType.equals("subs") && !this.f7233k) {
            u.h("BillingClient", "Current client doesn't support subscriptions.");
            j3 j3Var3 = j3.SUBSCRIPTIONS_NOT_SUPPORTED;
            BillingResult billingResult4 = k.l;
            J(j3Var3, billingResult4, jNextLong, z10);
            L(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.f7088b == null && billingFlowParams.f7089c == null) {
            BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams = billingFlowParams.f7090d;
            str = null;
            if (subscriptionUpdateParams.f7105b == null && subscriptionUpdateParams.f7106c == 0 && !billingFlowParams.f7087a && !billingFlowParams.f7093g) {
                r rVar2 = billingFlowParams.f7091e;
                if (rVar2 != null) {
                    int size2 = rVar2.size();
                    while (i10 < size2) {
                        i10++;
                    }
                }
            }
            if (arrayListZzj.size() <= 1 && !this.f7241t) {
                u.h("BillingClient", "Current client doesn't support multi-item purchases.");
                j3 j3Var4 = j3.MULTI_ITEM_NOT_SUPPORTED;
                BillingResult billingResult5 = k.f7281p;
                J(j3Var4, billingResult5, jNextLong, z10);
                L(billingResult5);
                return billingResult5;
            }
            if (listZzk.isEmpty() && !this.f7242u) {
                u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                j3 j3Var5 = j3.PRODUCT_DETAILS_NOT_SUPPORTED;
                BillingResult billingResult6 = k.f7283r;
                J(j3Var5, billingResult6, jNextLong, z10);
                L(billingResult6);
                return billingResult6;
            }
            if (billingFlowParams.f7091e.isEmpty()) {
                productDetailsParams = (BillingFlowParams.ProductDetailsParams) billingFlowParams.f7091e.get(0);
                i11 = 1;
                while (true) {
                    j10 = jNextLong;
                    if (i11 < billingFlowParams.f7091e.size()) {
                        String strZza = productDetailsParams.zza().zza();
                        map = new HashMap();
                        hashSet = new HashSet();
                        rVar = billingFlowParams.f7091e;
                        size = rVar.size();
                        i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                i13 = size;
                                productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) rVar.get(i12);
                                if (productDetailsParams2.zza().getSubscriptionOfferDetails() != null || productDetailsParams2.zzb() != null) {
                                    i14 = i12;
                                    if (map.containsKey(productDetailsParams2.zza().getProductId())) {
                                        billingResultA = k.a(5, "ProductId can not be duplicated. Invalid product id: " + productDetailsParams2.zza().getProductId() + ".");
                                        break;
                                    }
                                    map.put(productDetailsParams2.zza().getProductId(), productDetailsParams2);
                                    if (productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams2.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams2.zza().zza())) {
                                        billingResultA = k.a(5, "All products must have the same package name.");
                                        break;
                                    }
                                    i12 = i14 + 1;
                                    size = i13;
                                } else {
                                    billingResultA = k.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + productDetailsParams2.zza().getProductId());
                                    break;
                                }
                            } else {
                                it = hashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
                                        strZzb = productDetailsParams.zzb();
                                        if (strZzb != null && oneTimePurchaseOfferDetailsList != null) {
                                            Iterator<ProductDetails.OneTimePurchaseOfferDetails> it6 = oneTimePurchaseOfferDetailsList.iterator();
                                            do {
                                                if (!it6.hasNext()) {
                                                    next = str;
                                                    break;
                                                }
                                                next = it6.next();
                                            } while (!strZzb.equals(next.getOfferToken()));
                                            if (next != 0 && next.zza() != null) {
                                                billingResultA = k.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                break;
                                            }
                                            billingResultA = k.f7275i;
                                            break;
                                        }
                                        billingResultA = k.f7275i;
                                        break;
                                    }
                                    str2 = (String) it.next();
                                    if (map.containsKey(str2)) {
                                        billingResultA = k.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str2 + ".");
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) billingFlowParams.f7091e.get(i11);
                        if (productDetailsParams3.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams3.zza().getProductType().equals("play_pass_subs")) {
                            billingResultA = k.a(5, "All products should have same ProductType.");
                            break;
                        }
                        i11++;
                        jNextLong = j10;
                    }
                }
            } else {
                billingResultA = k.f7275i;
                j10 = jNextLong;
            }
            billingResult = billingResultA;
            if (billingResult != k.f7275i) {
                J(j3.INVALID_BILLING_FLOW_PARAMS, billingResult, j10, z10);
                L(billingResult);
                return billingResult;
            }
            j11 = j10;
            if (this.f7235n) {
                z13 = this.f7237p;
                z14 = this.f7244w;
                PendingPurchasesParams pendingPurchasesParams = this.D;
                pendingPurchasesParams.getClass();
                boolean z24 = pendingPurchasesParams.f7124a;
                z15 = this.F;
                String str6 = this.f7225c;
                String str7 = this.f7226d;
                z16 = z10;
                long jLongValue = this.I.longValue();
                this.f7229g.getPackageName();
                int i18 = u.f24478a;
                bundle2 = new Bundle();
                u.b(jLongValue, bundle2, str6, str7);
                bundle2.putLong("billingClientTransactionId", j11);
                if (billingFlowParams.zzb() != 0) {
                    bundle2.putInt("prorationMode", billingFlowParams.zzb());
                }
                if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                    bundle2.putString("accountId", billingFlowParams.zze());
                }
                if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                    bundle2.putString("obfuscatedProfileId", billingFlowParams.zzf());
                }
                if (billingFlowParams.zzs()) {
                    bundle2.putBoolean("isOfferPersonalizedByDeveloper", true);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
                }
                if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
                    bundle2.putString("oldSkuPurchaseToken", billingFlowParams.zzh());
                }
                billingFlowParams.zzg();
                if (TextUtils.isEmpty(str)) {
                    str5 = str;
                } else {
                    billingFlowParams.zzg();
                    str5 = str;
                    bundle2.putString("oldSkuPurchaseId", str5);
                }
                if (!TextUtils.isEmpty(billingFlowParams.zzi())) {
                    bundle2.putString("originalExternalTransactionId", billingFlowParams.zzi());
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle2.putString("paymentsPurchaseParams", str5);
                }
                if (z13) {
                    z17 = true;
                    bundle2.putBoolean("enablePendingPurchases", true);
                } else {
                    z17 = true;
                }
                if (z14 && z24) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z17);
                }
                if (z15) {
                    bundle2.putBoolean("enableAlternativeBilling", z17);
                }
                billingFlowParams.zzc();
                billingFlowParams.zza();
                arrayList = new ArrayList();
                for (BillingFlowParams.ProductDetailsParams productDetailsParams6 : billingFlowParams.zzk()) {
                }
                if (!arrayList.isEmpty()) {
                    y0 y0VarN = z0.n();
                    y0VarN.c();
                    z0.o((z0) y0VarN.f24469b, arrayList);
                    bundle2.putByteArray("subscriptionProductReplacementParamsList", ((z0) y0VarN.a()).a());
                }
                if (arrayListZzj.isEmpty()) {
                    j12 = j11;
                    skuDetails = skuDetails2;
                    arrayList2 = new ArrayList<>(listZzk.size() - 1);
                    arrayList3 = new ArrayList<>(listZzk.size() - 1);
                    arrayList4 = new ArrayList<>();
                    arrayList5 = new ArrayList<>();
                    arrayList6 = new ArrayList<>();
                    arrayList7 = new ArrayList<>();
                    i15 = 0;
                    while (i15 < listZzk.size()) {
                        BillingFlowParams.ProductDetailsParams productDetailsParams7 = (BillingFlowParams.ProductDetailsParams) listZzk.get(i15);
                        productDetailsZza = productDetailsParams7.zza();
                        BillingFlowParams.ProductDetailsParams productDetailsParams8 = productDetailsParams5;
                        if (!productDetailsZza.f7134h.isEmpty()) {
                            arrayList4.add(productDetailsZza.f7134h);
                        }
                        arrayList5.add(productDetailsParams7.zzb());
                        strZzc = productDetailsZza.zzc();
                        arrayList8 = productDetailsZza.f7137k;
                        if (arrayList8 != null && !arrayList8.isEmpty()) {
                            it2 = productDetailsZza.f7137k.iterator();
                            while (it2.hasNext()) {
                                oneTimePurchaseOfferDetails = (ProductDetails.OneTimePurchaseOfferDetails) it2.next();
                                it3 = it2;
                                if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.l)) {
                                    strZzc = oneTimePurchaseOfferDetails.l;
                                    break;
                                }
                                it2 = it3;
                            }
                        }
                        if (!TextUtils.isEmpty(strZzc)) {
                            arrayList6.add(strZzc);
                        }
                        if (i15 > 0) {
                            arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i15)).zza().getProductId());
                            arrayList3.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i15)).zza().getProductType());
                        }
                        i15++;
                        productDetailsParams5 = productDetailsParams8;
                    }
                    productDetailsParams4 = productDetailsParams5;
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                    if (!arrayList7.isEmpty()) {
                        bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                    }
                    if (!arrayList4.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                    }
                    if (!arrayList6.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle2.putStringArrayList("additionalSkus", arrayList2);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                    }
                } else {
                    arrayList9 = new ArrayList<>();
                    arrayList10 = new ArrayList<>();
                    arrayList11 = new ArrayList<>();
                    arrayList12 = new ArrayList<>();
                    arrayList13 = new ArrayList<>();
                    z19 = false;
                    z20 = false;
                    z21 = false;
                    z22 = false;
                    for (SkuDetails skuDetails3 : arrayListZzj) {
                        long j14 = j11;
                        SkuDetails skuDetails4 = skuDetails2;
                        if (!skuDetails3.f7208b.optString("skuDetailsToken").isEmpty()) {
                            arrayList9.add(skuDetails3.f7208b.optString("skuDetailsToken"));
                        }
                        String strZzc2 = skuDetails3.zzc();
                        String strZzb2 = skuDetails3.zzb();
                        iZza = skuDetails3.zza();
                        String strZze = skuDetails3.zze();
                        arrayList10.add(strZzc2);
                        z19 |= !TextUtils.isEmpty(strZzc2);
                        arrayList11.add(strZzb2);
                        z20 |= !TextUtils.isEmpty(strZzb2);
                        arrayList12.add(Integer.valueOf(iZza));
                        if (iZza != 0) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        z21 |= z23;
                        z22 |= !TextUtils.isEmpty(strZze);
                        arrayList13.add(strZze);
                        skuDetails2 = skuDetails4;
                        j11 = j14;
                    }
                    j12 = j11;
                    skuDetails = skuDetails2;
                    if (!arrayList9.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                    }
                    if (z19) {
                        bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                    }
                    if (z20) {
                        bundle2.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                    }
                    if (z21) {
                        bundle2.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                    }
                    if (z22) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                    }
                    if (arrayListZzj.size() > 1) {
                        arrayList14 = new ArrayList<>(arrayListZzj.size() - 1);
                        arrayList15 = new ArrayList<>(arrayListZzj.size() - 1);
                        for (i17 = 1; i17 < arrayListZzj.size(); i17++) {
                            arrayList14.add(((SkuDetails) arrayListZzj.get(i17)).getSku());
                            arrayList15.add(((SkuDetails) arrayListZzj.get(i17)).getType());
                        }
                        bundle2.putStringArrayList("additionalSkus", arrayList14);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList15);
                    }
                    productDetailsParams4 = productDetailsParams5;
                }
                if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f7239r) {
                    j3 j3Var6 = j3.OFFER_ID_TOKEN_NOT_SUPPORTED;
                    BillingResult billingResult7 = k.f7282q;
                    J(j3Var6, billingResult7, j12, z16);
                    L(billingResult7);
                    return billingResult7;
                }
                if (skuDetails != null || TextUtils.isEmpty(skuDetails.zzd())) {
                    if (productDetailsParams4 != null || TextUtils.isEmpty(productDetailsParams4.zza().zza())) {
                        str3 = null;
                        z18 = false;
                    } else {
                        bundle2.putString("skuPackageName", productDetailsParams4.zza().zza());
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle2.putString("accountName", str3);
                    }
                    intent = activity.getIntent();
                    if (intent == null) {
                        u.h("BillingClient", "Activity's intent is null.");
                    } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle2.putString("proxyPackage", stringExtra);
                        try {
                            bundle2.putString("proxyPackageVersion", this.f7229g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle2.putString("proxyPackageVersion", "package not found");
                        }
                    }
                    if (!this.f7242u && !listZzk.isEmpty()) {
                        i16 = 17;
                    } else if (!this.f7240s && z18) {
                        i16 = 15;
                    } else if (this.f7237p) {
                        i16 = 9;
                    } else {
                        i16 = 6;
                    }
                    final int i19 = i16;
                    final Bundle bundle3 = bundle2;
                    final String str8 = productId;
                    final String str9 = productType;
                    futureB = b(new Callable() { // from class: com.android.billingclient.api.zzw
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle bundleC;
                            com.google.android.gms.internal.play_billing.d dVar;
                            a aVar = this.zza;
                            int i20 = i19;
                            String str10 = str8;
                            String str11 = str9;
                            Bundle bundle4 = bundle3;
                            aVar.getClass();
                            try {
                                synchronized (aVar.f7223a) {
                                    dVar = aVar.f7231i;
                                }
                                if (dVar == null) {
                                    return u.c(k.f7276j, j3.SERVICE_RESET_TO_NULL);
                                }
                                return ((com.google.android.gms.internal.play_billing.b) dVar).G1(i20, aVar.f7229g.getPackageName(), str10, str11, bundle4);
                            } catch (DeadObjectException e10) {
                                BillingResult billingResult8 = k.f7276j;
                                String strZza2 = zzcg.zza(e10);
                                bundleC = u.c(billingResult8, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                                if (strZza2 != null) {
                                    bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza2);
                                }
                                return bundleC;
                            } catch (Exception e11) {
                                BillingResult billingResult9 = k.f7274h;
                                String strZza3 = zzcg.zza(e11);
                                bundleC = u.c(billingResult9, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                                if (strZza3 != null) {
                                    bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza3);
                                }
                                return bundleC;
                            }
                        }
                    }, 5000L, null, this.f7227e, a());
                    str4 = str9;
                    r10 = bundle3;
                    z11 = z16;
                } else {
                    bundle2.putString("skuPackageName", skuDetails.zzd());
                }
                str3 = null;
                z18 = true;
                if (!TextUtils.isEmpty(str3)) {
                    bundle2.putString("accountName", str3);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    u.h("BillingClient", "Activity's intent is null.");
                } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle2.putString("proxyPackage", stringExtra2);
                    bundle2.putString("proxyPackageVersion", this.f7229g.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
                if (!this.f7242u) {
                    if (!this.f7240s) {
                        if (this.f7237p) {
                            i16 = 9;
                        } else {
                            i16 = 6;
                        }
                    } else if (this.f7237p) {
                        i16 = 9;
                    } else {
                        i16 = 6;
                    }
                } else if (!this.f7240s) {
                    if (this.f7237p) {
                        i16 = 9;
                    } else {
                        i16 = 6;
                    }
                } else if (this.f7237p) {
                    i16 = 9;
                } else {
                    i16 = 6;
                }
                final int i110 = i16;
                final Bundle bundle4 = bundle2;
                final String str10 = productId;
                final String str11 = productType;
                futureB = b(new Callable() { // from class: com.android.billingclient.api.zzw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleC;
                        com.google.android.gms.internal.play_billing.d dVar;
                        a aVar = this.zza;
                        int i20 = i110;
                        String str12 = str10;
                        String str13 = str11;
                        Bundle bundle5 = bundle4;
                        aVar.getClass();
                        try {
                            synchronized (aVar.f7223a) {
                                dVar = aVar.f7231i;
                            }
                            if (dVar == null) {
                                return u.c(k.f7276j, j3.SERVICE_RESET_TO_NULL);
                            }
                            return ((com.google.android.gms.internal.play_billing.b) dVar).G1(i20, aVar.f7229g.getPackageName(), str12, str13, bundle5);
                        } catch (DeadObjectException e10) {
                            BillingResult billingResult8 = k.f7276j;
                            String strZza2 = zzcg.zza(e10);
                            bundleC = u.c(billingResult8, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strZza2 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza2);
                            }
                            return bundleC;
                        } catch (Exception e11) {
                            BillingResult billingResult9 = k.f7274h;
                            String strZza3 = zzcg.zza(e11);
                            bundleC = u.c(billingResult9, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strZza3 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza3);
                            }
                            return bundleC;
                        }
                    }
                }, 5000L, null, this.f7227e, a());
                str4 = str11;
                r10 = bundle4;
                z11 = z16;
            } else {
                j12 = j11;
                z11 = z10;
                final String str12 = productId;
                final String str13 = productType;
                str3 = str;
                futureB = b(new Callable() { // from class: com.android.billingclient.api.zzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleC;
                        com.google.android.gms.internal.play_billing.d dVar;
                        a aVar = this.zza;
                        String str14 = str12;
                        String str15 = str13;
                        aVar.getClass();
                        try {
                            synchronized (aVar.f7223a) {
                                dVar = aVar.f7231i;
                            }
                            if (dVar == null) {
                                return u.c(k.f7276j, j3.SERVICE_RESET_TO_NULL);
                            }
                            return ((com.google.android.gms.internal.play_billing.b) dVar).F1(aVar.f7229g.getPackageName(), str14, str15);
                        } catch (DeadObjectException e10) {
                            BillingResult billingResult8 = k.f7276j;
                            String strZza2 = zzcg.zza(e10);
                            bundleC = u.c(billingResult8, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strZza2 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza2);
                            }
                            return bundleC;
                        } catch (Exception e11) {
                            BillingResult billingResult9 = k.f7274h;
                            String strZza3 = zzcg.zza(e11);
                            bundleC = u.c(billingResult9, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strZza3 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza3);
                            }
                            return bundleC;
                        }
                    }
                }, 5000L, null, this.f7227e, a());
                str4 = str13;
                r10 = z10;
            }
            try {
                try {
                    if (futureB == null) {
                        try {
                            j3 j3Var7 = j3.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                            BillingResult billingResult8 = k.f7269c;
                            J(j3Var7, billingResult8, j12, z11);
                            L(billingResult8);
                            return billingResult8;
                        } catch (CancellationException | TimeoutException e10) {
                            e = e10;
                            r13 = z11;
                            r14 = j12;
                            u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            j3 j3Var8 = j3.LAUNCH_BILLING_FLOW_TIMEOUT;
                            BillingResult billingResult9 = k.f7277k;
                            K(j3Var8, billingResult9, zzcg.zza(e), r14, r13);
                            L(billingResult9);
                            return billingResult9;
                        } catch (Exception e11) {
                            e = e11;
                            r11 = z11;
                            r12 = j12;
                            u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            j3 j3Var9 = j3.LAUNCH_BILLING_FLOW_EXCEPTION;
                            BillingResult billingResult10 = k.f7276j;
                            K(j3Var9, billingResult10, zzcg.zza(e), r12, r11);
                            L(billingResult10);
                            return billingResult10;
                        }
                    }
                    z12 = z11;
                    j13 = j12;
                    bundle = (Bundle) futureB.get(5000L, TimeUnit.MILLISECONDS);
                    iA = u.a(bundle, "BillingClient");
                    strF = u.f(bundle, "BillingClient");
                    if (iA != 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                        intent2.putExtra("billingClientTransactionId", j13);
                        intent2.putExtra("wasServiceAutoReconnected", z12);
                        activity.startActivity(intent2);
                        return k.f7275i;
                    }
                    u.h("BillingClient", "Unable to buy item, Error response code: " + iA);
                    BillingResult billingResultA2 = k.a(iA, strF);
                    try {
                        if (bundle != null || (obj = bundle.get("LOG_REASON")) == null) {
                            j3VarA = j3.REASON_UNSPECIFIED;
                        } else if (obj instanceof Integer) {
                            j3VarA = j3.a(((Integer) obj).intValue());
                        } else {
                            u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            j3VarA = j3.REASON_UNSPECIFIED;
                        }
                    } catch (Throwable th3) {
                        u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                        j3VarA = j3.REASON_UNSPECIFIED;
                    }
                    if (j3VarA == j3.REASON_UNSPECIFIED) {
                        j3VarA = j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    }
                    j3 j3Var10 = j3VarA;
                    if (bundle == null) {
                        string = str3;
                    } else {
                        try {
                            string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                        } catch (Throwable th4) {
                            u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                            string = str3;
                        }
                    }
                    try {
                        K(j3Var10, billingResultA2, string, j13, z12);
                        L(billingResultA2);
                        return billingResultA2;
                    } catch (CancellationException | TimeoutException e12) {
                        e = e12;
                        r14 = j13;
                        r13 = z12;
                        u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        j3 j3Var11 = j3.LAUNCH_BILLING_FLOW_TIMEOUT;
                        BillingResult billingResult11 = k.f7277k;
                        K(j3Var11, billingResult11, zzcg.zza(e), r14, r13);
                        L(billingResult11);
                        return billingResult11;
                    } catch (Exception e13) {
                        e = e13;
                        r12 = j13;
                        r11 = z12;
                        u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        j3 j3Var12 = j3.LAUNCH_BILLING_FLOW_EXCEPTION;
                        BillingResult billingResult12 = k.f7276j;
                        K(j3Var12, billingResult12, zzcg.zza(e), r12, r11);
                        L(billingResult12);
                        return billingResult12;
                    }
                } catch (CancellationException | TimeoutException e14) {
                    e = e14;
                    r14 = str4;
                    r13 = r10;
                }
            } catch (Exception e15) {
                e = e15;
                r12 = str4;
                r11 = r10;
            }
        } else {
            str = null;
        }
        if (!this.f7235n) {
            u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            j3 j3Var13 = j3.EXTRA_PARAMS_NOT_SUPPORTED;
            BillingResult billingResult13 = k.f7272f;
            J(j3Var13, billingResult13, jNextLong, z10);
            L(billingResult13);
            return billingResult13;
        }
        if (arrayListZzj.size() <= 1) {
        }
        if (listZzk.isEmpty()) {
        }
        if (billingFlowParams.f7091e.isEmpty()) {
            productDetailsParams = (BillingFlowParams.ProductDetailsParams) billingFlowParams.f7091e.get(0);
            i11 = 1;
            while (true) {
                j10 = jNextLong;
                if (i11 < billingFlowParams.f7091e.size()) {
                    String strZza2 = productDetailsParams.zza().zza();
                    map = new HashMap();
                    hashSet = new HashSet();
                    rVar = billingFlowParams.f7091e;
                    size = rVar.size();
                    i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            it = hashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList2 = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
                                    strZzb = productDetailsParams.zzb();
                                    if (strZzb != null) {
                                        billingResultA = k.f7275i;
                                        break;
                                    }
                                    billingResultA = k.f7275i;
                                    break;
                                }
                                str2 = (String) it.next();
                                if (map.containsKey(str2)) {
                                    billingResultA = k.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str2 + ".");
                                    break;
                                }
                            }
                        } else {
                            i13 = size;
                            productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) rVar.get(i12);
                            if (productDetailsParams2.zza().getSubscriptionOfferDetails() != null) {
                                i14 = i12;
                                if (map.containsKey(productDetailsParams2.zza().getProductId())) {
                                    billingResultA = k.a(5, "ProductId can not be duplicated. Invalid product id: " + productDetailsParams2.zza().getProductId() + ".");
                                    break;
                                }
                                map.put(productDetailsParams2.zza().getProductId(), productDetailsParams2);
                                if (productDetailsParams.zza().getProductType().equals("play_pass_subs")) {
                                }
                                i12 = i14 + 1;
                                size = i13;
                            } else {
                                i14 = i12;
                                if (map.containsKey(productDetailsParams2.zza().getProductId())) {
                                    billingResultA = k.a(5, "ProductId can not be duplicated. Invalid product id: " + productDetailsParams2.zza().getProductId() + ".");
                                    break;
                                }
                                map.put(productDetailsParams2.zza().getProductId(), productDetailsParams2);
                                if (productDetailsParams.zza().getProductType().equals("play_pass_subs")) {
                                }
                                i12 = i14 + 1;
                                size = i13;
                            }
                        }
                    }
                } else {
                    productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) billingFlowParams.f7091e.get(i11);
                    if (productDetailsParams3.zza().getProductType().equals(productDetailsParams.zza().getProductType())) {
                    }
                    i11++;
                    jNextLong = j10;
                }
            }
        } else {
            billingResultA = k.f7275i;
            j10 = jNextLong;
        }
        billingResult = billingResultA;
        if (billingResult != k.f7275i) {
            J(j3.INVALID_BILLING_FLOW_PARAMS, billingResult, j10, z10);
            L(billingResult);
            return billingResult;
        }
        j11 = j10;
        if (this.f7235n) {
            z13 = this.f7237p;
            z14 = this.f7244w;
            PendingPurchasesParams pendingPurchasesParams2 = this.D;
            pendingPurchasesParams2.getClass();
            boolean z25 = pendingPurchasesParams2.f7124a;
            z15 = this.F;
            String str14 = this.f7225c;
            String str15 = this.f7226d;
            z16 = z10;
            long jLongValue2 = this.I.longValue();
            this.f7229g.getPackageName();
            int i111 = u.f24478a;
            bundle2 = new Bundle();
            u.b(jLongValue2, bundle2, str14, str15);
            bundle2.putLong("billingClientTransactionId", j11);
            if (billingFlowParams.zzb() != 0) {
                bundle2.putInt("prorationMode", billingFlowParams.zzb());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle2.putString("accountId", billingFlowParams.zze());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                bundle2.putString("obfuscatedProfileId", billingFlowParams.zzf());
            }
            if (billingFlowParams.zzs()) {
                bundle2.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
                bundle2.putString("oldSkuPurchaseToken", billingFlowParams.zzh());
            }
            billingFlowParams.zzg();
            if (TextUtils.isEmpty(str)) {
                billingFlowParams.zzg();
                str5 = str;
                bundle2.putString("oldSkuPurchaseId", str5);
            } else {
                str5 = str;
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzi())) {
                bundle2.putString("originalExternalTransactionId", billingFlowParams.zzi());
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle2.putString("paymentsPurchaseParams", str5);
            }
            if (z13) {
                z17 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z17 = true;
            }
            if (z14) {
                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z17);
            }
            if (z15) {
                bundle2.putBoolean("enableAlternativeBilling", z17);
            }
            billingFlowParams.zzc();
            billingFlowParams.zza();
            arrayList = new ArrayList();
            while (r5.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
                y0 y0VarN2 = z0.n();
                y0VarN2.c();
                z0.o((z0) y0VarN2.f24469b, arrayList);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((z0) y0VarN2.a()).a());
            }
            if (arrayListZzj.isEmpty()) {
                arrayList9 = new ArrayList<>();
                arrayList10 = new ArrayList<>();
                arrayList11 = new ArrayList<>();
                arrayList12 = new ArrayList<>();
                arrayList13 = new ArrayList<>();
                z19 = false;
                z20 = false;
                z21 = false;
                z22 = false;
                while (r19.hasNext()) {
                    long j15 = j11;
                    SkuDetails skuDetails5 = skuDetails2;
                    if (!skuDetails3.f7208b.optString("skuDetailsToken").isEmpty()) {
                        arrayList9.add(skuDetails3.f7208b.optString("skuDetailsToken"));
                    }
                    String strZzc3 = skuDetails3.zzc();
                    String strZzb3 = skuDetails3.zzb();
                    iZza = skuDetails3.zza();
                    String strZze2 = skuDetails3.zze();
                    arrayList10.add(strZzc3);
                    z19 |= !TextUtils.isEmpty(strZzc3);
                    arrayList11.add(strZzb3);
                    z20 |= !TextUtils.isEmpty(strZzb3);
                    arrayList12.add(Integer.valueOf(iZza));
                    if (iZza != 0) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z21 |= z23;
                    z22 |= !TextUtils.isEmpty(strZze2);
                    arrayList13.add(strZze2);
                    skuDetails2 = skuDetails5;
                    j11 = j15;
                }
                j12 = j11;
                skuDetails = skuDetails2;
                if (!arrayList9.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (z19) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                }
                if (z20) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                }
                if (z21) {
                    bundle2.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                }
                if (z22) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                }
                if (arrayListZzj.size() > 1) {
                    arrayList14 = new ArrayList<>(arrayListZzj.size() - 1);
                    arrayList15 = new ArrayList<>(arrayListZzj.size() - 1);
                    while (i17 < arrayListZzj.size()) {
                        arrayList14.add(((SkuDetails) arrayListZzj.get(i17)).getSku());
                        arrayList15.add(((SkuDetails) arrayListZzj.get(i17)).getType());
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList14);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList15);
                }
                productDetailsParams4 = productDetailsParams5;
            } else {
                j12 = j11;
                skuDetails = skuDetails2;
                arrayList2 = new ArrayList<>(listZzk.size() - 1);
                arrayList3 = new ArrayList<>(listZzk.size() - 1);
                arrayList4 = new ArrayList<>();
                arrayList5 = new ArrayList<>();
                arrayList6 = new ArrayList<>();
                arrayList7 = new ArrayList<>();
                i15 = 0;
                while (i15 < listZzk.size()) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams9 = (BillingFlowParams.ProductDetailsParams) listZzk.get(i15);
                    productDetailsZza = productDetailsParams9.zza();
                    BillingFlowParams.ProductDetailsParams productDetailsParams10 = productDetailsParams5;
                    if (!productDetailsZza.f7134h.isEmpty()) {
                        arrayList4.add(productDetailsZza.f7134h);
                    }
                    arrayList5.add(productDetailsParams9.zzb());
                    strZzc = productDetailsZza.zzc();
                    arrayList8 = productDetailsZza.f7137k;
                    if (arrayList8 != null) {
                        it2 = productDetailsZza.f7137k.iterator();
                        while (it2.hasNext()) {
                            oneTimePurchaseOfferDetails = (ProductDetails.OneTimePurchaseOfferDetails) it2.next();
                            it3 = it2;
                            if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.l)) {
                                strZzc = oneTimePurchaseOfferDetails.l;
                                break;
                            }
                            it2 = it3;
                        }
                    }
                    if (!TextUtils.isEmpty(strZzc)) {
                        arrayList6.add(strZzc);
                    }
                    if (i15 > 0) {
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i15)).zza().getProductId());
                        arrayList3.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i15)).zza().getProductType());
                    }
                    i15++;
                    productDetailsParams5 = productDetailsParams10;
                }
                productDetailsParams4 = productDetailsParams5;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList2);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            }
            if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST")) {
            }
            if (skuDetails != null) {
                if (productDetailsParams4 != null) {
                }
                str3 = null;
                z18 = false;
            } else {
                if (productDetailsParams4 != null) {
                }
                str3 = null;
                z18 = false;
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle2.putString("accountName", str3);
            }
            intent = activity.getIntent();
            if (intent == null) {
                u.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra3 = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra3);
                bundle2.putString("proxyPackageVersion", this.f7229g.getPackageManager().getPackageInfo(stringExtra3, 0).versionName);
            }
            if (!this.f7242u) {
                if (!this.f7240s) {
                    if (this.f7237p) {
                        i16 = 9;
                    } else {
                        i16 = 6;
                    }
                } else if (this.f7237p) {
                    i16 = 9;
                } else {
                    i16 = 6;
                }
            } else if (!this.f7240s) {
                if (this.f7237p) {
                    i16 = 9;
                } else {
                    i16 = 6;
                }
            } else if (this.f7237p) {
                i16 = 9;
            } else {
                i16 = 6;
            }
            final int i112 = i16;
            final Bundle bundle5 = bundle2;
            final String str16 = productId;
            final String str17 = productType;
            futureB = b(new Callable() { // from class: com.android.billingclient.api.zzw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    com.google.android.gms.internal.play_billing.d dVar;
                    a aVar = this.zza;
                    int i20 = i112;
                    String str18 = str16;
                    String str19 = str17;
                    Bundle bundle6 = bundle5;
                    aVar.getClass();
                    try {
                        synchronized (aVar.f7223a) {
                            dVar = aVar.f7231i;
                        }
                        if (dVar == null) {
                            return u.c(k.f7276j, j3.SERVICE_RESET_TO_NULL);
                        }
                        return ((com.google.android.gms.internal.play_billing.b) dVar).G1(i20, aVar.f7229g.getPackageName(), str18, str19, bundle6);
                    } catch (DeadObjectException e16) {
                        BillingResult billingResult14 = k.f7276j;
                        String strZza3 = zzcg.zza(e16);
                        bundleC = u.c(billingResult14, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strZza3 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza3);
                        }
                        return bundleC;
                    } catch (Exception e17) {
                        BillingResult billingResult15 = k.f7274h;
                        String strZza4 = zzcg.zza(e17);
                        bundleC = u.c(billingResult15, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strZza4 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza4);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f7227e, a());
            str4 = str17;
            r10 = bundle5;
            z11 = z16;
        } else {
            j12 = j11;
            z11 = z10;
            final String str18 = productId;
            final String str19 = productType;
            str3 = str;
            futureB = b(new Callable() { // from class: com.android.billingclient.api.zzx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    com.google.android.gms.internal.play_billing.d dVar;
                    a aVar = this.zza;
                    String str110 = str18;
                    String str111 = str19;
                    aVar.getClass();
                    try {
                        synchronized (aVar.f7223a) {
                            dVar = aVar.f7231i;
                        }
                        if (dVar == null) {
                            return u.c(k.f7276j, j3.SERVICE_RESET_TO_NULL);
                        }
                        return ((com.google.android.gms.internal.play_billing.b) dVar).F1(aVar.f7229g.getPackageName(), str110, str111);
                    } catch (DeadObjectException e16) {
                        BillingResult billingResult14 = k.f7276j;
                        String strZza3 = zzcg.zza(e16);
                        bundleC = u.c(billingResult14, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strZza3 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza3);
                        }
                        return bundleC;
                    } catch (Exception e17) {
                        BillingResult billingResult15 = k.f7274h;
                        String strZza4 = zzcg.zza(e17);
                        bundleC = u.c(billingResult15, j3.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strZza4 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strZza4);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f7227e, a());
            str4 = str19;
            r10 = z10;
        }
        if (futureB == null) {
            j3 j3Var14 = j3.MISSING_RESULT_FROM_EXECUTE_ASYNC;
            BillingResult billingResult14 = k.f7269c;
            J(j3Var14, billingResult14, j12, z11);
            L(billingResult14);
            return billingResult14;
        }
        z12 = z11;
        j13 = j12;
        bundle = (Bundle) futureB.get(5000L, TimeUnit.MILLISECONDS);
        iA = u.a(bundle, "BillingClient");
        strF = u.f(bundle, "BillingClient");
        if (iA != 0) {
            Intent intent3 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent3.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
            intent3.putExtra("billingClientTransactionId", j13);
            intent3.putExtra("wasServiceAutoReconnected", z12);
            activity.startActivity(intent3);
            return k.f7275i;
        }
        u.h("BillingClient", "Unable to buy item, Error response code: " + iA);
        BillingResult billingResultA3 = k.a(iA, strF);
        if (bundle != null) {
            j3VarA = j3.REASON_UNSPECIFIED;
        } else if (obj instanceof Integer) {
            j3VarA = j3.a(((Integer) obj).intValue());
        } else {
            u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
            j3VarA = j3.REASON_UNSPECIFIED;
        }
        if (j3VarA == j3.REASON_UNSPECIFIED) {
            j3VarA = j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
        }
        j3 j3Var15 = j3VarA;
        if (bundle == null) {
            string = str3;
        } else {
            string = bundle.getString("ADDITIONAL_LOG_DETAILS");
        }
        K(j3Var15, billingResultA3, string, j13, z12);
        L(billingResultA3);
        return billingResultA3;
    }

    public final void m(f3 f3Var) {
        try {
            this.f7230h.d(f3Var, this.f7234m);
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void n(h3 h3Var) {
        try {
            wi.b bVar = this.f7230h;
            int i10 = this.f7234m;
            bVar.getClass();
            try {
                o3 o3Var = (o3) ((p3) bVar.f53211a).g();
                o3Var.c();
                p3.p((p3) o3Var.f24469b, i10);
                p3 p3Var = (p3) o3Var.a();
                bVar.f53211a = p3Var;
                try {
                    bVar.q(h3Var, p3Var);
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                u.i("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            u.i("BillingClient", "Unable to log.", th4);
        }
    }

    public final void o(int i10, BillingResult billingResult, j3 j3Var) {
        try {
            int i11 = zzcg.zza;
            e3 e3Var = (e3) zzcg.zzb(j3Var, 6, billingResult, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            d4 d4VarR = e4.r();
            d4VarR.d(i10 > 0);
            d4VarR.e(i10);
            e3Var.e(d4VarR);
            m((f3) e3Var.a());
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void p(int i10) {
        String str;
        String str2;
        synchronized (this.f7223a) {
            try {
                if (this.f7224b == 3) {
                    return;
                }
                int i11 = this.f7224b;
                if (i11 == 0) {
                    str = "DISCONNECTED";
                } else if (i11 != 1) {
                    str = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i10 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i10 != 1) {
                    str2 = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                u.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f7224b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(BillingClientStateListener billingClientStateListener, int i10) {
        j3 j3Var;
        BillingResult billingResultZ;
        BillingResult billingResult;
        synchronized (this.f7223a) {
            try {
                if (u()) {
                    billingResultZ = z(i10);
                } else {
                    if (this.f7224b == 1) {
                        u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        j3 j3Var2 = j3.BILLING_CLIENT_CONNECTING;
                        billingResult = k.f7270d;
                        o(i10, billingResult, j3Var2);
                    } else if (this.f7224b == 3) {
                        u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        j3 j3Var3 = j3.BILLING_CLIENT_CLOSED;
                        billingResult = k.f7276j;
                        o(i10, billingResult, j3Var3);
                    } else {
                        p(1);
                        if (i10 == 0) {
                            this.G = billingClientStateListener;
                            i10 = 0;
                        }
                        r();
                        u.g("BillingClient", "Starting in-app billing setup.");
                        this.f7232j = new d(this, billingClientStateListener, i10);
                        yz1 yz1Var = this.f7232j.f7253b;
                        yz1Var.f22418c = 0L;
                        yz1Var.f22417b = false;
                        yz1Var.b();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f7229g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            j3Var = j3.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    j3Var = j3.INVALID_PHONESKY_PACKAGE;
                                    u.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f7225c);
                                    synchronized (this.f7223a) {
                                        try {
                                            if (this.f7224b == 2) {
                                                billingResultZ = z(i10);
                                            } else if (this.f7224b != 1) {
                                                u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                j3 j3Var4 = j3.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                billingResult = k.f7276j;
                                                o(i10, billingResult, j3Var4);
                                            } else {
                                                d dVar = this.f7232j;
                                                if (i10 > 0 ? this.f7229g.bindService(intent2, 1, a(), dVar) : this.f7229g.bindService(intent2, dVar, 1)) {
                                                    u.g("BillingClient", "Service was bonded successfully.");
                                                    billingResultZ = null;
                                                } else {
                                                    j3Var = j3.BILLING_SERVICE_BLOCKED;
                                                    u.h("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                j3Var = j3.INVALID_PHONESKY_PACKAGE;
                                u.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        p(0);
                        u.g("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult2 = k.f7268b;
                        o(i10, billingResult2, j3Var);
                        billingResultZ = billingResult2;
                    }
                    billingResultZ = billingResult;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (billingResultZ != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultZ);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                h9.k kVar;
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                Exception exc = null;
                if (!aVar.t()) {
                    j3 j3Var = j3.SERVICE_CONNECTION_NOT_READY;
                    BillingResult billingResult = k.f7276j;
                    aVar.G(7, billingResult, j3Var);
                    p pVar = r.f24456b;
                    v vVar = v.f24489e;
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(vVar, vVar));
                    return null;
                }
                if (!aVar.f7242u) {
                    u.h("BillingClient", "Querying product details is not supported.");
                    j3 j3Var2 = j3.PRODUCT_DETAILS_NOT_SUPPORTED;
                    BillingResult billingResult2 = k.f7283r;
                    aVar.G(7, billingResult2, j3Var2);
                    p pVar2 = r.f24456b;
                    v vVar2 = v.f24489e;
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(vVar2, vVar2));
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String strZzb = queryProductDetailsParams2.zzb();
                r rVarZza = queryProductDetailsParams2.zza();
                int size = rVarZza.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 20;
                    ArrayList<QueryProductDetailsParams.Product> arrayList3 = new ArrayList(rVarZza.subList(i10, i11 > size ? size : i11));
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i12)).zza());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                    String str = aVar.f7225c;
                    bundle.putString("playBillingLibraryVersion", str);
                    try {
                        synchronized (aVar.f7223a) {
                            dVar = aVar.f7231i;
                        }
                        if (dVar == null) {
                            kVar = aVar.y(k.f7276j, j3.SERVICE_RESET_TO_NULL, "Service has been reset to null.", exc);
                        } else {
                            boolean z10 = aVar.f7244w && aVar.D.f7124a;
                            aVar.C();
                            aVar.C();
                            aVar.C();
                            aVar.C();
                            r rVar = rVarZza;
                            Bundle bundleJ1 = ((com.google.android.gms.internal.play_billing.b) dVar).J1(true != aVar.f7245x ? 17 : 20, aVar.f7229g.getPackageName(), strZzb, bundle, u.d(str, aVar.f7226d, arrayList3, new mb.b(z10), aVar.I.longValue()));
                            if (bundleJ1 == null) {
                                kVar = aVar.y(k.B, j3.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                            } else if (bundleJ1.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleJ1.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    kVar = aVar.y(k.B, j3.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                                } else {
                                    ArrayList arrayList5 = new ArrayList();
                                    int size3 = stringArrayList.size();
                                    for (int i13 = 0; i13 < size3; i13++) {
                                        try {
                                            ProductDetails productDetails = new ProductDetails(stringArrayList.get(i13));
                                            u.g("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                            arrayList5.add(productDetails);
                                        } catch (JSONException e10) {
                                            kVar = aVar.y(k.a(6, "Error trying to decode SkuDetails."), j3.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                        }
                                    }
                                    ArrayList<String> stringArrayList2 = bundleJ1.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                    new ArrayList();
                                    try {
                                        ArrayList arrayList6 = new ArrayList();
                                        if (stringArrayList2 == null) {
                                            for (QueryProductDetailsParams.Product product : arrayList3) {
                                                Iterator it = arrayList5.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                                        break;
                                                    }
                                                    ProductDetails productDetails2 = (ProductDetails) it.next();
                                                    if (product.zza().equals(productDetails2.getProductId()) && product.zzb().equals(productDetails2.getProductType())) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            Iterator<String> it2 = stringArrayList2.iterator();
                                            while (it2.hasNext()) {
                                                UnfetchedProduct unfetchedProduct = new UnfetchedProduct(it2.next());
                                                u.g("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                                                arrayList6.add(unfetchedProduct);
                                            }
                                        }
                                        arrayList.addAll(arrayList5);
                                        arrayList2.addAll(arrayList6);
                                        i10 = i11;
                                        rVarZza = rVar;
                                        exc = null;
                                    } catch (JSONException e11) {
                                        kVar = aVar.y(k.a(6, "Error trying to decode SkuDetails."), j3.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                                    }
                                }
                            } else {
                                int iA = u.a(bundleJ1, "BillingClient");
                                String strF = u.f(bundleJ1, "BillingClient");
                                kVar = iA != 0 ? aVar.y(k.a(iA, strF), j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, l1.d.e(iA, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : aVar.y(k.a(6, strF), j3.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                            }
                        }
                    } catch (DeadObjectException e12) {
                        kVar = aVar.y(k.f7276j, j3.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
                    } catch (Exception e13) {
                        kVar = aVar.y(k.f7274h, j3.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
                    }
                    productDetailsResponseListener2.onProductDetailsResponse(k.a(kVar.f42286a, (String) kVar.f42289d), new QueryProductDetailsResult((ArrayList) kVar.f42287b, (ArrayList) kVar.f42288c));
                    return null;
                }
                kVar = new h9.k(0, "", arrayList, arrayList2);
                productDetailsResponseListener2.onProductDetailsResponse(k.a(kVar.f42286a, (String) kVar.f42289d), new QueryProductDetailsResult((ArrayList) kVar.f42287b, (ArrayList) kVar.f42288c));
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzap
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                BillingResult billingResult = k.f7277k;
                aVar.G(7, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                p pVar = r.f24456b;
                v vVar = v.f24489e;
                productDetailsResponseListener2.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(vVar, vVar));
            }
        }, x(), a()) == null) {
            BillingResult billingResultA = A();
            G(7, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            p pVar = r.f24456b;
            v vVar = v.f24489e;
            productDetailsResponseListener.onProductDetailsResponse(billingResultA, new QueryProductDetailsResult(vVar, vVar));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (b(new com.google.android.gms.internal.consent_sdk.i(this, purchasesResponseListener, queryPurchasesParams.zza()), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzat
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                BillingResult billingResult = k.f7277k;
                aVar.G(9, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                p pVar = r.f24456b;
                purchasesResponseListener2.onQueryPurchasesResponse(billingResult, v.f24489e);
            }
        }, x(), a()) == null) {
            BillingResult billingResultA = A();
            G(9, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            p pVar = r.f24456b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResultA, v.f24489e);
        }
    }

    public final void r() {
        synchronized (this.f7223a) {
            if (this.f7232j != null) {
                try {
                    this.f7229g.unbindService(this.f7232j);
                    this.f7231i = null;
                    this.f7232j = null;
                } catch (Throwable th2) {
                    try {
                        u.i("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f7231i = null;
                        this.f7232j = null;
                    } catch (Throwable th3) {
                        this.f7231i = null;
                        this.f7232j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    public final boolean s() {
        try {
            BillingResult billingResult = (BillingResult) B(1).get(Xa.C, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                u.g("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                u.h("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            u.i("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return u();
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!s()) {
            BillingResult billingResult = k.f7276j;
            G(16, billingResult, j3.SERVICE_CONNECTION_NOT_READY);
            return billingResult;
        }
        if (!this.f7246y) {
            u.h("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = k.D;
            G(16, billingResult2, j3.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED);
            return billingResult2;
        }
        Handler handler = this.f7227e;
        final b bVar = new b(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (b(new Callable() { // from class: com.android.billingclient.api.zzy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = bVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.k(alternativeBillingOnlyInformationDialogListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).M1(packageName, bundle, new e(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.k(alternativeBillingOnlyInformationDialogListener2, k.f7276j, j3.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.k(alternativeBillingOnlyInformationDialogListener2, k.f7274h, j3.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.k(alternativeBillingOnlyInformationDialogListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, a()) != null) {
            return k.f7275i;
        }
        BillingResult billingResultA = A();
        G(16, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
        return billingResultA;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!s()) {
            BillingResult billingResult = k.f7276j;
            G(25, billingResult, j3.SERVICE_CONNECTION_NOT_READY);
            return billingResult;
        }
        if (!this.f7247z) {
            u.h("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = k.f7285t;
            G(25, billingResult2, j3.EXTERNAL_OFFER_NOT_SUPPORTED);
            return billingResult2;
        }
        Handler handler = this.f7227e;
        final c cVar = new c(this, handler, externalOfferInformationDialogListener);
        if (b(new Callable() { // from class: com.android.billingclient.api.zzan
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = cVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.i(externalOfferInformationDialogListener2, k.f7276j, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.f7229g.getPackageName();
                    String str = aVar.f7225c;
                    String str2 = aVar.f7226d;
                    long jLongValue = aVar.I.longValue();
                    int i10 = u.f24478a;
                    Bundle bundle = new Bundle();
                    u.b(jLongValue, bundle, str, str2);
                    ((com.google.android.gms.internal.play_billing.b) dVar).O1(packageName, bundle, new g(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.i(externalOfferInformationDialogListener2, k.f7276j, j3.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.i(externalOfferInformationDialogListener2, k.f7274h, j3.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzao
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.i(externalOfferInformationDialogListener, k.f7277k, j3.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, a()) != null) {
            return k.f7275i;
        }
        BillingResult billingResultA = A();
        G(25, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
        return billingResultA;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!s()) {
            u.h("BillingClient", "Service disconnected.");
            return k.f7276j;
        }
        if (!this.f7238q) {
            u.h("BillingClient", "Current client doesn't support showing in-app messages.");
            return k.f7284s;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f7225c);
        String str = this.f7226d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.f7120a);
        Handler handler = this.f7227e;
        final ka.c cVar = new ka.c(this, handler, inAppMessageResponseListener);
        b(new Callable() { // from class: com.android.billingclient.api.zzas
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.d dVar;
                a aVar = this.zza;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = cVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f7223a) {
                        dVar = aVar.f7231i;
                    }
                    if (dVar == null) {
                        aVar.l(-1, j3.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    ((com.google.android.gms.internal.play_billing.b) dVar).R1(aVar.f7229g.getPackageName(), bundle2, new h(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.l(-1, j3.SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.l(6, j3.SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 5000L, null, handler, a());
        return k.f7275i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        q(billingClientStateListener, 0);
    }

    public final boolean t() {
        r9.b bVar = this.J;
        if (bVar == null) {
            throw new NullPointerException("ticker");
        }
        long jP = bVar.P();
        long j10 = 30000;
        int i10 = 1;
        long jConvert = 30000;
        while (i10 <= 3) {
            try {
                long jMax = Math.max(0L, jConvert);
                if (jMax <= 0) {
                    u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return u();
                }
                BillingResult billingResult = (BillingResult) B(i10).get(jMax, TimeUnit.MILLISECONDS);
                if (billingResult.getResponseCode() == 0) {
                    u.g("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                    return u();
                }
                u.h("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jP2 = (bVar.P() - jP) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j10 - timeUnit.convert(jP2, timeUnit2);
                long j11 = j10;
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jConvert < jPow) {
                    u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return u();
                }
                if (i10 < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j11 - timeUnit.convert((bVar.P() - jP) + 0, timeUnit2);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
                i10++;
                j10 = j11;
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                u.i("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        u.h("BillingClient", "Max retries reached.");
        return u();
    }

    public final boolean u() {
        boolean z10;
        synchronized (this.f7223a) {
            try {
                z10 = false;
                if (this.f7224b == 2 && this.f7231i != null && this.f7232j != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final Handler x() {
        return Looper.myLooper() == null ? this.f7227e : new Handler(Looper.myLooper());
    }

    public final h9.k y(BillingResult billingResult, j3 j3Var, String str, Exception exc) {
        u.i("BillingClient", str, exc);
        I(j3Var, 7, billingResult, zzcg.zza(exc));
        return new h9.k(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    public final BillingResult z(int i10) {
        u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        g3 g3VarT = h3.t();
        g3VarT.c();
        h3.s((h3) g3VarT.f24469b, 6);
        d4 d4VarR = e4.r();
        d4VarR.c();
        e4.q((e4) d4VarR.f24469b);
        d4VarR.d(i10 > 0);
        d4VarR.e(i10);
        g3VarT.c();
        h3.r((h3) g3VarT.f24469b, (e4) d4VarR.a());
        n((h3) g3VarT.a());
        return k.f7275i;
    }

    public a(Context context, BillingClient.Builder builder) {
        long jNextLong = new Random().nextLong();
        this.I = Long.valueOf(jNextLong);
        this.J = com.google.android.gms.internal.play_billing.j.f24297a;
        this.f7225c = "8.0.0";
        String strD = D();
        this.f7226d = strD;
        this.f7229g = context.getApplicationContext();
        o3 o3VarX = p3.x();
        o3VarX.c();
        p3.v((p3) o3VarX.f24469b);
        if (strD != null) {
            o3VarX.c();
            p3.w((p3) o3VarX.f24469b, strD);
        }
        String packageName = this.f7229g.getPackageName();
        o3VarX.c();
        p3.t((p3) o3VarX.f24469b, packageName);
        o3VarX.c();
        p3.q((p3) o3VarX.f24469b, jNextLong);
        boolean z10 = builder.f7085g;
        o3VarX.c();
        p3.u((p3) o3VarX.f24469b, z10);
        int i10 = Build.VERSION.SDK_INT;
        o3VarX.c();
        p3.n((p3) o3VarX.f24469b, i10);
        o3VarX.e();
        try {
            int i11 = this.f7229g.getPackageManager().getPackageInfo(this.f7229g.getPackageName(), 0).versionCode;
            o3VarX.c();
            p3.o((p3) o3VarX.f24469b, i11);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f7230h = new wi.b(this.f7229g, (p3) o3VarX.a());
        this.f7229g.getPackageName();
        this.E = builder.f7085g;
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, BillingClient.Builder builder) {
        long jNextLong = new Random().nextLong();
        this.I = Long.valueOf(jNextLong);
        this.J = com.google.android.gms.internal.play_billing.j.f24297a;
        this.f7225c = "8.0.0";
        String strD = D();
        this.f7226d = strD;
        this.f7229g = context.getApplicationContext();
        o3 o3VarX = p3.x();
        o3VarX.c();
        p3.v((p3) o3VarX.f24469b);
        if (strD != null) {
            o3VarX.c();
            p3.w((p3) o3VarX.f24469b, strD);
        }
        String packageName = this.f7229g.getPackageName();
        o3VarX.c();
        p3.t((p3) o3VarX.f24469b, packageName);
        o3VarX.c();
        p3.q((p3) o3VarX.f24469b, jNextLong);
        boolean z10 = builder.f7085g;
        o3VarX.c();
        p3.u((p3) o3VarX.f24469b, z10);
        int i10 = Build.VERSION.SDK_INT;
        o3VarX.c();
        p3.n((p3) o3VarX.f24469b, i10);
        o3VarX.e();
        try {
            int i11 = this.f7229g.getPackageManager().getPackageInfo(this.f7229g.getPackageName(), 0).versionCode;
            o3VarX.c();
            p3.o((p3) o3VarX.f24469b, i11);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f7230h = new wi.b(this.f7229g, (p3) o3VarX.a());
        u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f7228f = new p12(this.f7229g, null, null, this.f7230h);
        this.D = pendingPurchasesParams;
        this.f7229g.getPackageName();
        this.E = builder.f7085g;
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, BillingClient.Builder builder) {
        long jNextLong = new Random().nextLong();
        this.I = Long.valueOf(jNextLong);
        this.J = com.google.android.gms.internal.play_billing.j.f24297a;
        this.f7225c = "8.0.0";
        String strD = D();
        this.f7226d = strD;
        this.f7229g = context.getApplicationContext();
        o3 o3VarX = p3.x();
        o3VarX.c();
        p3.v((p3) o3VarX.f24469b);
        if (strD != null) {
            o3VarX.c();
            p3.w((p3) o3VarX.f24469b, strD);
        }
        String packageName = this.f7229g.getPackageName();
        o3VarX.c();
        p3.t((p3) o3VarX.f24469b, packageName);
        o3VarX.c();
        p3.q((p3) o3VarX.f24469b, jNextLong);
        boolean z10 = builder.f7085g;
        o3VarX.c();
        p3.u((p3) o3VarX.f24469b, z10);
        int i10 = Build.VERSION.SDK_INT;
        o3VarX.c();
        p3.n((p3) o3VarX.f24469b, i10);
        o3VarX.e();
        try {
            int i11 = this.f7229g.getPackageManager().getPackageInfo(this.f7229g.getPackageName(), 0).versionCode;
            o3VarX.c();
            p3.o((p3) o3VarX.f24469b, i11);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f7230h = new wi.b(this.f7229g, (p3) o3VarX.a());
        if (purchasesUpdatedListener == null) {
            u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7228f = new p12(this.f7229g, purchasesUpdatedListener, null, this.f7230h);
        this.D = pendingPurchasesParams;
        this.F = false;
        this.f7229g.getPackageName();
        this.E = builder.f7085g;
    }
}
