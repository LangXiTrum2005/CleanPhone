package magenta;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import fright.VerifySubRequest;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.dovishness;
import reuter.molybdenite;
import reuter.preprohormone;
import reuter.rotuma;

/* JADX INFO: compiled from: IapPayListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0003J1\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001f\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmagenta/dern;", "Lreuter/preprohormone;", "<init>", "()V", "", "competently", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMsg", InAppPurchaseMetaData.KEY_PRODUCT_ID, "impromptu", "(ILjava/lang/String;Ljava/lang/String;)V", X3.i.m, "beachfront", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "Lcom/android/billingclient/api/Purchase;", "purchase", "purchaseType", "taiyuan", "(Lcom/android/billingclient/api/ProductDetails;Lcom/android/billingclient/api/Purchase;Ljava/lang/String;)V", "apical", "", "isAcknowledged", "saneness", "(ILjava/lang/String;Ljava/lang/String;Z)V", "Lcom/android/billingclient/api/BillingResult;", "result", "productDetail", "formularize", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class dern extends preprohormone {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void cutely(Purchase purchase, Ref$ObjectRef price, ProductDetails productDetails, String purchaseType, dern this$0) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(price, "$price");
        Intrinsics.checkNotNullParameter(productDetails, "$productDetails");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String purchaseToken = purchase.getPurchaseToken();
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        String str = (String) CollectionsKt.lerp(products);
        String str2 = (String) price.element;
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        Intrinsics.beachfront(str);
        Intrinsics.beachfront(purchaseToken);
        rotuma.f36709attabal.beachfront(molybdenite.f36681attabal.merc(), new VerifySubRequest(str, purchaseToken, str2, orderId, 1, null, null, 96, null), productDetails, purchaseType, this$0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void impassible(Purchase purchase, Ref$ObjectRef price, ProductDetails productDetail, String purchaseType, dern this$0) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(price, "$price");
        Intrinsics.checkNotNullParameter(productDetail, "$productDetail");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String purchaseToken = purchase.getPurchaseToken();
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        String str = (String) CollectionsKt.lerp(products);
        String str2 = (String) price.element;
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        String str3 = orderId;
        Intrinsics.beachfront(str);
        Intrinsics.beachfront(purchaseToken);
        Intrinsics.beachfront(str3);
        rotuma.f36709attabal.beachfront(molybdenite.f36681attabal.merc(), new VerifySubRequest(str, purchaseToken, str2, str3, 0, null, null, 96, null), productDetail, purchaseType, this$0);
    }

    public void beachfront(String productType, String productId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (Intrinsics.wireman(productType, "inapp")) {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 34, "inapp", productId, 1, "google pay connection failed");
        } else {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 34, "subs", productId, 1, "google pay connection failed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object, java.lang.String] */
    public void formularize(BillingResult result, final Purchase purchase, final ProductDetails productDetail, final String purchaseType) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(productDetail, "productDetail");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        String orderId = purchase.getOrderId();
        if (orderId == null || !dovishness.starveling(orderId, "GPA", false, 2, null)) {
            return;
        }
        if (Intrinsics.wireman(purchaseType, "new")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 31, "subs", productDetail.getProductId(), 0, null, 48, null);
        } else if (Intrinsics.wireman(purchaseType, "old")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 41, "subs", productDetail.getProductId(), 0, null, 48, null);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        if (productDetail.getSubscriptionOfferDetails() != null) {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetail.getSubscriptionOfferDetails();
            Intrinsics.beachfront(subscriptionOfferDetails);
            if (subscriptionOfferDetails.size() > 0) {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetail.getSubscriptionOfferDetails();
                Intrinsics.beachfront(subscriptionOfferDetails2);
                ?? formattedPrice = subscriptionOfferDetails2.get(0).getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice();
                Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
                ref$ObjectRef.element = formattedPrice;
            }
        }
        molybdenite.f36681attabal.polder().submit(new Runnable() { // from class: magenta.attabal
            @Override // java.lang.Runnable
            public final void run() {
                dern.impassible(purchase, ref$ObjectRef, productDetail, purchaseType, this);
            }
        });
    }

    public void impromptu(int errorCode, String errorMsg, String productId) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (errorCode == 1) {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 34, "inapp", productId, errorCode, errorMsg);
        } else {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 32, "inapp", productId, errorCode, errorMsg);
        }
    }

    @Override // reuter.preprohormone
    public void saneness(int errorCode, String errorMsg, String productId, boolean isAcknowledged) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (errorCode == 1) {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 34, "subs", productId, errorCode, errorMsg);
        } else {
            nestlike.marial.f33872attabal.wireman(molybdenite.f36681attabal.merc(), 32, "subs", productId, errorCode, errorMsg);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object, java.lang.String] */
    public void taiyuan(final ProductDetails productDetails, final Purchase purchase, final String purchaseType) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        String orderId = purchase.getOrderId();
        if (orderId == null || !dovishness.starveling(orderId, "GPA", false, 2, null)) {
            return;
        }
        if (Intrinsics.wireman(purchaseType, "new")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 31, "inapp", productDetails.getProductId(), 0, null, 48, null);
        } else if (Intrinsics.wireman(purchaseType, "old")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 41, "inapp", productDetails.getProductId(), 0, null, 48, null);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        if (productDetails.getSubscriptionOfferDetails() != null) {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
            Intrinsics.beachfront(subscriptionOfferDetails);
            if (subscriptionOfferDetails.size() > 0) {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
                Intrinsics.beachfront(subscriptionOfferDetails2);
                ?? formattedPrice = subscriptionOfferDetails2.get(0).getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice();
                Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
                ref$ObjectRef.element = formattedPrice;
            }
        }
        molybdenite.f36681attabal.polder().submit(new Runnable() { // from class: magenta.saneness
            @Override // java.lang.Runnable
            public final void run() {
                dern.cutely(purchase, ref$ObjectRef, productDetails, purchaseType, this);
            }
        });
    }

    public void apical() {
    }

    public void competently() {
    }
}
