package com.inmobi.media;

import A.RunnableC0906n0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3259ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2953bb f24027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f24028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f24029c = new AtomicInteger(0);
    public final C3004eb d = new C3004eb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24030e = 2;

    public static final void a(BillingResult billingResult, List list) {
        Intrinsics.f(billingResult, "<anonymous parameter 0>");
    }

    public static final void b(BillingResult billingResult, List list) {
        Intrinsics.f(billingResult, "<anonymous parameter 0>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new A.y0()).build();
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return null;
        } catch (NoClassDefFoundError e3) {
            S5 s6 = S5.f23167a;
            S5.d.a(new C3011f2(e3));
            return null;
        }
    }

    public final void a(Context context, C2953bb onComplete) {
        Function1 c3227sb;
        Intrinsics.f(context, "context");
        Intrinsics.f(onComplete, "onComplete");
        try {
            this.f24027a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.e(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new C3036gb((short) 2236), (C3004eb) null);
                return;
            }
            if (StringsKt.M(string, "6", false)) {
                c3227sb = new C3211rb(this);
            } else {
                c3227sb = StringsKt.M(string, "7", false) ? new C3227sb(this) : new C3243tb(this);
            }
            BillingClient billingClient = (BillingClient) c3227sb.invoke(context);
            if (billingClient == null) {
                a(new C3036gb((short) 2233), (C3004eb) null);
                return;
            }
            this.f24028b = billingClient;
            C3196qb c3196qb = new C3196qb(this);
            BillingClient billingClient2 = this.f24028b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C3164ob(this, c3196qb));
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            a(new C3036gb((short) 2237), (C3004eb) null);
        }
    }

    public static final void b(C3259ub this$0, Function1 onComplete, BillingResult billingResult, List purchasesResult) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(billingResult, "<anonymous parameter 0>");
        Intrinsics.f(purchasesResult, "purchasesResult");
        C3004eb c3004eb = this$0.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3004eb.f23567b = arrayList.size();
        Uc.a(new RunnableC0906n0(onComplete, this$0, 2));
    }

    public static final void b(Function1 onComplete, C3259ub this$0) {
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(this$0, "this$0");
        onComplete.invoke(this$0.d);
    }

    public final void a(AbstractC3084jb abstractC3084jb, C3004eb c3004eb) {
        AbstractC3100kb.a(abstractC3084jb);
        C2953bb c2953bb = this.f24027a;
        if (c2953bb != null) {
            c2953bb.invoke(c3004eb);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new A.y0()).build();
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return null;
        } catch (NoClassDefFoundError e3) {
            S5 s6 = S5.f23167a;
            S5.d.a(new C3011f2(e3));
            return null;
        }
    }

    public final void a(final C3180pb onComplete) {
        Intrinsics.f(onComplete, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.e(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        Intrinsics.e(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.f24028b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener(onComplete) { // from class: A.x0
            });
        }
        BillingClient billingClient2 = this.f24028b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener(onComplete) { // from class: A.x0
            });
        }
    }

    public static final void a(C3259ub this$0, Function1 onComplete, BillingResult billingResult, List purchasesResult) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(billingResult, "<anonymous parameter 0>");
        Intrinsics.f(purchasesResult, "purchasesResult");
        C3004eb c3004eb = this$0.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3004eb.f23566a = arrayList.size();
        Uc.a(new RunnableC0906n0(onComplete, this$0, 1));
    }

    public static final void a(Function1 onComplete, C3259ub this$0) {
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(this$0, "this$0");
        onComplete.invoke(this$0.d);
    }
}
