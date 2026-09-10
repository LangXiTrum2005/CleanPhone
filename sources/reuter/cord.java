package reuter;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PayListenerWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\bJ7\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001c\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lreuter/cord;", "", "<init>", "()V", "Lmagenta/dern;", "payListener", "", "wireman", "(Lmagenta/dern;)V", "Lcom/android/billingclient/api/BillingResult;", "result", "Lcom/android/billingclient/api/Purchase;", "purchase", "Lcom/android/billingclient/api/ProductDetails;", "productDetail", "", "purchaseType", "marial", "(Lmagenta/dern;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "saneness", X3.i.m, InAppPurchaseMetaData.KEY_PRODUCT_ID, "", X3.i.g, "errMsg", "attabal", "(Lmagenta/dern;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "productDetails", "dern", "(Lmagenta/dern;Lcom/android/billingclient/api/ProductDetails;Lcom/android/billingclient/api/Purchase;Ljava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cord f36653attabal = new cord();

    public final void attabal(magenta.dern payListener, String productType, String productId, int errCode, String errMsg) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        if (payListener == null) {
            return;
        }
        if (Intrinsics.wireman(productType, "inapp")) {
            payListener.impromptu(errCode, errMsg, productId);
        } else {
            preprohormone.dern(payListener, errCode, errMsg, productId, false, 8, null);
        }
    }

    public final void dern(magenta.dern payListener, ProductDetails productDetails, Purchase purchase, String purchaseType) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (payListener == null) {
            return;
        }
        payListener.taiyuan(productDetails, purchase, purchaseType);
    }

    public final void marial(magenta.dern payListener, BillingResult result, Purchase purchase, ProductDetails productDetail, String purchaseType) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(productDetail, "productDetail");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (payListener == null) {
            return;
        }
        payListener.formularize(result, purchase, productDetail, purchaseType);
    }

    public final void saneness(magenta.dern payListener) {
        if (payListener == null) {
            return;
        }
        payListener.competently();
    }

    public final void wireman(magenta.dern payListener) {
        if (payListener == null) {
            return;
        }
        payListener.apical();
    }
}
