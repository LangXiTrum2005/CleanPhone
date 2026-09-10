package nestlike;

import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.ProductDetails;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IapAndSubReportUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnestlike/saneness;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "purchaseType", "Lcom/android/billingclient/api/ProductDetails;", "productDetails", InAppPurchaseMetaData.KEY_PRODUCT_ID, "orderId", "", "isFreeTrial", "", "saneness", "(Landroid/content/Context;Ljava/lang/String;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "bundle", "attabal", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f33880attabal = new saneness();

    public static /* synthetic */ void dern(saneness sanenessVar, Context context, String str, ProductDetails productDetails, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        sanenessVar.saneness(context, str, productDetails, str2, str3, z);
    }

    public final Bundle attabal(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        double d = bundle.getDouble("value");
        if (d != 0.0d) {
            d /= (double) 2;
        }
        bundle.putDouble("value", d);
        return bundle;
    }

    public final void saneness(Context context, String purchaseType, ProductDetails productDetails, String productId, String orderId, boolean isFreeTrial) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        try {
            Bundle bundle = new Bundle();
            bundle.putString("sku_id", productId);
            bundle.putString("order_id", orderId);
            double priceAmountMicros = 0.0d;
            if (Intrinsics.wireman(purchaseType, "inapp")) {
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                Intrinsics.beachfront(oneTimePurchaseOfferDetails);
                String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
                if (!isFreeTrial) {
                    priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros() / 1000000.0d;
                }
                bundle.putString("currency", priceCurrencyCode);
                bundle.putDouble("value", priceAmountMicros);
                attabal attabalVar = attabal.f33869attabal;
                dern dernVar = dern.f33870attabal;
                String str = dernVar.attabal().get("uac_purchase");
                if (str == null) {
                    str = "";
                }
                attabalVar.attabal(context, "uac_purchase", bundle, str);
                if (!isFreeTrial) {
                    String str2 = dernVar.attabal().get("uac_pay");
                    if (str2 == null) {
                        str2 = "";
                    }
                    attabalVar.attabal(context, "uac_pay", bundle, str2);
                }
                bundle.putString("open_source", marial.f33872attabal.attabal());
                String str3 = dernVar.attabal().get("ud_iap");
                if (str3 == null) {
                    str3 = "";
                }
                attabalVar.attabal(context, "ud_iap", bundle, str3);
                attabal.saneness(attabalVar, context, "uac_real_purchase", attabal(bundle), null, 8, null);
                return;
            }
            if (Intrinsics.wireman(purchaseType, "subs")) {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                Intrinsics.beachfront(subscriptionOfferDetails);
                ProductDetails.PricingPhase pricingPhase = subscriptionOfferDetails.get(0).getPricingPhases().getPricingPhaseList().get(0);
                String priceCurrencyCode2 = pricingPhase.getPriceCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(priceCurrencyCode2, "getPriceCurrencyCode(...)");
                if (!isFreeTrial) {
                    priceAmountMicros = pricingPhase.getPriceAmountMicros() / 1000000.0d;
                }
                bundle.putString("currency", priceCurrencyCode2);
                bundle.putDouble("value", priceAmountMicros);
                attabal attabalVar2 = attabal.f33869attabal;
                dern dernVar2 = dern.f33870attabal;
                String str4 = dernVar2.attabal().get("uac_purchase");
                if (str4 == null) {
                    str4 = "";
                }
                attabalVar2.attabal(context, "uac_purchase", bundle, str4);
                if (!isFreeTrial) {
                    String str5 = dernVar2.attabal().get("uac_pay");
                    if (str5 == null) {
                        str5 = "";
                    }
                    attabalVar2.attabal(context, "uac_pay", bundle, str5);
                }
                bundle.putString("open_source", marial.f33872attabal.attabal());
                String str6 = dernVar2.attabal().get("ud_sub");
                if (str6 == null) {
                    str6 = "";
                }
                attabalVar2.attabal(context, "ud_sub", bundle, str6);
                attabal.saneness(attabalVar2, context, "uac_real_purchase", attabal(bundle), null, 8, null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
