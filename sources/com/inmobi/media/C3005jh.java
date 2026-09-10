package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.AbstractC2879eh;
import com.inmobi.media.C3005jh;
import com.inmobi.media.Wg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.arytenoidectomy;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3005jh {
    public Function1 a;
    public BillingClient b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final Wg d = new Wg();
    public final int e = 2;

    public static final void a(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static final void b(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new PurchasesUpdatedListener() { // from class: adsuki.spatterdash
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    C3005jh.b(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            taiyuan taiyuanVar2 = P9.a;
            P9.a(new L2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new Yg((short) 2236), (Wg) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new Yg((short) 2233), (Wg) null);
                return;
            }
            this.b = billingClient;
            Function1 onComplete2 = new Function1() { // from class: adsuki.sonnetize
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3005jh.a(this.f3675kowloon, (AbstractC2879eh) obj);
                }
            };
            Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
            BillingClient billingClient2 = this.b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C2905fh(onComplete2, this));
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
            a(new Yg((short) 2237), (Wg) null);
        }
    }

    public static final void b(final C3005jh c3005jh, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        Wg wg = c3005jh.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg.a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: adsuki.incidentally
            @Override // java.lang.Runnable
            public final void run() {
                C3005jh.b(function1, c3005jh);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final Unit a(final C3005jh c3005jh, AbstractC2879eh result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof C2828ch) {
            c3005jh.a(new Xg(String.valueOf(((C2828ch) result).a)), (Wg) null);
            return Unit.f29295attabal;
        }
        c3005jh.a(new Function1() { // from class: adsuki.unbalanced
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3005jh.a(this.f3726kowloon, (Wg) obj);
            }
        });
        return Unit.f29295attabal;
    }

    public static final void b(Function1 function1, C3005jh c3005jh) {
        function1.invoke(c3005jh.d);
    }

    public static final Unit a(C3005jh c3005jh, Wg data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (c3005jh.c.incrementAndGet() != c3005jh.e) {
            return Unit.f29295attabal;
        }
        int i = data.a;
        if (i == 0 && data.b == 0) {
            c3005jh.a(new Yg((short) 2234), (Wg) null);
            return Unit.f29295attabal;
        }
        arytenoidectomy.formularize("No of In-App Purchases: " + i + "\n                                    | and No of Subscriptions: " + data.b + "\n                                ", null, 1, null);
        c3005jh.a(Zg.a, data);
        return Unit.f29295attabal;
    }

    public final Function1 a(String str) {
        if (dovishness.starveling(str, "6", false, 2, null)) {
            return new C2931gh(this);
        }
        if (dovishness.starveling(str, com.ironsource.Bc.e, false, 2, null)) {
            return new C2956hh(this);
        }
        return new C2980ih(this);
    }

    public final void a(AbstractC2776ah abstractC2776ah, Wg wg) {
        AbstractC2802bh.a(abstractC2776ah);
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(wg);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: adsuki.cyclery
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    C3005jh.a(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            taiyuan taiyuanVar2 = P9.a;
            P9.a(new L2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(final Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener() { // from class: adsuki.dabble
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    C3005jh.b(this.f3393attabal, onComplete, billingResult, list);
                }
            });
        }
        BillingClient billingClient2 = this.b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener() { // from class: adsuki.scoleces
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    C3005jh.a(this.f3656attabal, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final C3005jh c3005jh, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        Wg wg = c3005jh.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg.b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: adsuki.nsa
            @Override // java.lang.Runnable
            public final void run() {
                C3005jh.a(function1, c3005jh);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void a(Function1 function1, C3005jh c3005jh) {
        function1.invoke(c3005jh.d);
    }
}
