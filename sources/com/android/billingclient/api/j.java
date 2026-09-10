package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public final Context K;
    public volatile int L;
    public volatile com.google.android.gms.internal.play_billing.h M;
    public volatile i N;
    public volatile ScheduledExecutorService O;

    public j(Context context, BillingClient.Builder builder) {
        super(context, builder);
        this.L = 0;
        this.K = context;
    }

    public final s0 M(final int i10) {
        if (U()) {
            return d0.c.W(new k4() { // from class: com.android.billingclient.api.zzbv
                @Override // com.google.android.gms.internal.play_billing.k4
                public final Object zza(j4 j4Var) {
                    String str;
                    j jVar = this.zza;
                    int i11 = i10;
                    try {
                        if (jVar.M == null) {
                            throw null;
                        }
                        com.google.android.gms.internal.play_billing.h hVar = jVar.M;
                        String packageName = jVar.K.getPackageName();
                        if (i11 == 2) {
                            str = "LAUNCH_BILLING_FLOW";
                        } else if (i11 == 3) {
                            str = "ACKNOWLEDGE_PURCHASE";
                        } else if (i11 == 4) {
                            str = "CONSUME_ASYNC";
                        } else if (i11 != 5) {
                            str = i11 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
                        } else {
                            str = "IS_FEATURE_SUPPORTED";
                        }
                        y5.c cVar = new y5.c(j4Var);
                        com.google.android.gms.internal.play_billing.f fVar = (com.google.android.gms.internal.play_billing.f) hVar;
                        Parcel parcelY1 = fVar.y1();
                        parcelY1.writeString(packageName);
                        parcelY1.writeString(str);
                        int i12 = com.google.android.gms.internal.play_billing.e.f24258a;
                        parcelY1.writeStrongBinder(cVar);
                        fVar.B1(parcelY1, 1);
                        return "billingOverrideService.getBillingOverride";
                    } catch (Exception e10) {
                        jVar.N(28, k.F, j3.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
                        u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
                        j4Var.a(0);
                        return "billingOverrideService.getBillingOverride";
                    }
                }
            });
        }
        u.h("BillingClientTesting", "Billing Override Service is not ready.");
        N(28, k.a(-1, "Billing Override Service connection is disconnected."), j3.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
        return new r0(0);
    }

    public final void N(int i10, BillingResult billingResult, j3 j3Var) {
        int i11 = zzcg.zza;
        f3 f3VarZzb = zzcg.zzb(j3Var, i10, billingResult, null, m3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(f3VarZzb, "ApiFailure should not be null");
        this.f7230h.c(f3VarZzb);
    }

    public final void O(int i10) {
        int i11 = zzcg.zza;
        h3 h3VarZzc = zzcg.zzc(i10, m3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(h3VarZzc, "ApiSuccess should not be null");
        wi.b bVar = this.f7230h;
        bVar.getClass();
        try {
            bVar.q(h3VarZzc, (p3) bVar.f53211a);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void P(int i10, l0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        s0 s0VarM = M(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.O == null) {
                    this.O = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.O;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!s0VarM.isDone()) {
            u0 u0Var = new u0();
            u0Var.f24479h = s0VarM;
            t0 t0Var = new t0();
            t0Var.f24471a = u0Var;
            u0Var.f24480i = scheduledExecutorService.schedule(t0Var, 28500L, timeUnit);
            s0VarM.m(t0Var, p0.f24441a);
            s0VarM = u0Var;
        }
        h9.k kVar = new h9.k();
        kVar.f42286a = i10;
        kVar.f42287b = aVar;
        kVar.f42288c = runnable;
        kVar.f42289d = this;
        s0VarM.m(new q0(s0VarM, kVar), a());
    }

    public final synchronized boolean U() {
        return (this.L != 2 || this.M == null || this.N == null) ? false : true;
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        P(3, new l0.a() { // from class: com.android.billingclient.api.zzbw
            @Override // l0.a
            public final void accept(Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbx
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        P(4, new l0.a() { // from class: com.android.billingclient.api.zzbt
            @Override // l0.a
            public final void accept(Object obj) {
                consumeResponseListener.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.consumeAsync(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        synchronized (this) {
            O(27);
            try {
                try {
                    if (this.N != null && this.M != null) {
                        u.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.K.unbindService(this.N);
                        this.N = new i(this);
                    }
                    this.M = null;
                    if (this.O != null) {
                        this.O.shutdownNow();
                        this.O = null;
                    }
                } catch (RuntimeException e10) {
                    u.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
                }
                this.L = 3;
            } catch (Throwable th2) {
                this.L = 3;
                throw th2;
            }
        }
        super.endConnection();
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        l0.a aVar = new l0.a() { // from class: com.android.billingclient.api.zzby
            @Override // l0.a
            public final void accept(Object obj) {
                this.zza.L((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzbz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.a*/.launchBillingFlow(activity, billingFlowParams);
            }
        };
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) M(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            N(28, k.F, j3.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            N(28, k.F, j3.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            BillingResult billingResultA = k.a(iIntValue, "Billing override value was set by a license tester.");
            N(2, billingResultA, j3.LICENSE_TESTER_BILLING_OVERRIDE);
            aVar.accept(billingResultA);
            return billingResultA;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e12) {
            BillingResult billingResult = k.f7274h;
            N(2, billingResult, j3.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR);
            u.i("BillingClientTesting", "An internal error occurred.", e12);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        P(7, new l0.a() { // from class: com.android.billingclient.api.zzbr
            @Override // l0.a
            public final void accept(Object obj) {
                QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
                productDetailsResponseListener.onProductDetailsResponse((BillingResult) obj, queryProductDetailsResult);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        synchronized (this) {
            if (U()) {
                u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                O(26);
            } else if (this.L == 1) {
                u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.L == 3) {
                u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                N(26, k.a(-1, "Billing Override Service connection is disconnected."), j3.BILLING_CLIENT_CLOSED);
            } else {
                this.L = 1;
                u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                this.N = new i(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.K;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                j3 j3Var = j3.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    j3Var = j3.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            j3Var = j3.BILLING_SERVICE_BLOCKED;
                            u.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, this.N, 1)) {
                                u.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                j3Var = j3.BILLING_SERVICE_BLOCKED;
                                u.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.L = 0;
                u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                N(26, k.a(2, "Billing Override Service unavailable on device."), j3Var);
            }
        }
        q(billingClientStateListener, 0);
    }

    public j(PendingPurchasesParams pendingPurchasesParams, Context context, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, builder);
        this.L = 0;
        this.K = context;
    }

    public j(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, builder);
        this.L = 0;
        this.K = context;
    }

    public j(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, builder);
        this.L = 0;
        this.K = context;
    }
}
