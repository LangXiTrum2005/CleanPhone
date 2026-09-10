package reuter;

import com.android.billingclient.api.ProductDetails;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.ui.AdActivity;
import fright.VerifySubRequest;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PayListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lreuter/preprohormone;", "", "<init>", "()V", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMsg", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "isAcknowledged", "", "saneness", "(ILjava/lang/String;Ljava/lang/String;Z)V", "Lfright/attabal;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "purchaseType", "attabal", "(ILjava/lang/String;Lfright/attabal;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class preprohormone {
    public static /* synthetic */ void dern(preprohormone preprohormoneVar, int i, String str, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSubsFailure");
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        preprohormoneVar.saneness(i, str, str2, z);
    }

    public abstract void attabal(int errorCode, String errorMsg, VerifySubRequest request, ProductDetails productDetails, String purchaseType);

    public abstract void saneness(int errorCode, String errorMsg, String productId, boolean isAcknowledged);
}
