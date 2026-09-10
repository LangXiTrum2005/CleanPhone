package lj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Application.ActivityLifecycleCallbacks, e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g0 f45386g = g0.UNKNOWN_REPLACEMENT_MODE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BillingClient f45387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45388b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f45390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f45391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f45392f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f45389c = null;

    public i(Context context, g gVar, a aVar) {
        this.f45388b = aVar;
        this.f45390d = context;
        this.f45391e = gVar;
    }

    public static b a() {
        return new b("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public final boolean b(m mVar) {
        String str;
        BillingClient billingClient = this.f45387a;
        if (billingClient == null) {
            throw a();
        }
        switch (mVar.ordinal()) {
            case 0:
                str = BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY;
                break;
            case 1:
                str = BillingClient.FeatureType.BILLING_CONFIG;
                break;
            case 2:
                str = BillingClient.FeatureType.EXTERNAL_OFFER;
                break;
            case 3:
                str = BillingClient.FeatureType.IN_APP_MESSAGING;
                break;
            case 4:
                str = BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION;
                break;
            case 5:
                str = BillingClient.FeatureType.PRODUCT_DETAILS;
                break;
            case 6:
                str = BillingClient.FeatureType.SUBSCRIPTIONS;
                break;
            case 7:
                str = BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE;
                break;
            default:
                throw new aa.b((byte) 0, 20);
        }
        return billingClient.isFeatureSupported(str).getResponseCode() == 0;
    }

    public final q c(o oVar) {
        String str;
        int i10;
        if (this.f45387a == null) {
            throw a();
        }
        String str2 = oVar.f45417a;
        String str3 = oVar.f45421e;
        String str4 = oVar.f45420d;
        g0 g0Var = oVar.f45418b;
        String str5 = oVar.f45422f;
        String str6 = oVar.f45419c;
        HashMap map = this.f45392f;
        ProductDetails productDetails = (ProductDetails) map.get(str2);
        if (productDetails == null) {
            throw new b("NOT_FOUND", defpackage.e.o("Details for product ", str2, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null) {
            Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
            while (true) {
                if (!it.hasNext()) {
                    throw new b("INVALID_OFFER_TOKEN", l1.d.h("Offer token ", str6, " for product ", str2, " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
                }
                ProductDetails.SubscriptionOfferDetails next = it.next();
                if (str6 != null && str6.equals(next.getOfferToken())) {
                    break;
                }
            }
        }
        g0 g0Var2 = f45386g;
        if (str5 == null && g0Var != g0Var2) {
            throw new b("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (str5 != null && !map.containsKey(str5)) {
            throw new b("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", defpackage.e.o("Details for product ", str5, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        if (this.f45389c == null) {
            throw new b("ACTIVITY_UNAVAILABLE", defpackage.e.o("Details for product ", str2, " are not available. This method must be run with the app in foreground."), null);
        }
        BillingFlowParams.ProductDetailsParams.Builder builderNewBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
        builderNewBuilder.setProductDetails(productDetails);
        if (str6 != null) {
            builderNewBuilder.setOfferToken(str6);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder.build());
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList);
        if (str4 != null && !str4.isEmpty()) {
            productDetailsParamsList.setObfuscatedAccountId(str4);
        }
        if (str3 != null && !str3.isEmpty()) {
            productDetailsParamsList.setObfuscatedProfileId(str3);
        }
        BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder2 = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
        if (str5 != null && !str5.isEmpty() && (str = oVar.f45423g) != null) {
            builderNewBuilder2.setOldPurchaseToken(str);
            if (g0Var != g0Var2) {
                int iOrdinal = g0Var.ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        i10 = 2;
                        if (iOrdinal != 2) {
                            i10 = 3;
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    i10 = 5;
                                    if (iOrdinal != 5) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                } else {
                                    i10 = 6;
                                }
                            }
                        }
                    }
                } else {
                    i10 = 0;
                }
                builderNewBuilder2.setSubscriptionReplacementMode(i10);
            }
            productDetailsParamsList.setSubscriptionUpdateParams(builderNewBuilder2.build());
        }
        return n0.a(this.f45387a.launchBillingFlow(this.f45389c, productDetailsParamsList.build()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.f45389c != activity || (context = this.f45390d) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        BillingClient billingClient = this.f45387a;
        if (billingClient != null) {
            billingClient.endConnection();
            this.f45387a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
