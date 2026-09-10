package magenta;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import java.lang.ref.WeakReference;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Weak.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmagenta/marial;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "real", "<init>", "(Lcom/android/billingclient/api/PurchasesResponseListener;)V", "Lcom/android/billingclient/api/BillingResult;", "p0", "", "Lcom/android/billingclient/api/Purchase;", "p1", "", "onQueryPurchasesResponse", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "Ljava/lang/ref/WeakReference;", "attabal", "Ljava/lang/ref/WeakReference;", "mRef", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class marial implements PurchasesResponseListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<PurchasesResponseListener> mRef;

    public marial(PurchasesResponseListener purchasesResponseListener) {
        this.mRef = purchasesResponseListener != null ? new WeakReference<>(purchasesResponseListener) : null;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult p0, List<Purchase> p1) {
        PurchasesResponseListener purchasesResponseListener;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        WeakReference<PurchasesResponseListener> weakReference = this.mRef;
        if (weakReference == null || (purchasesResponseListener = weakReference.get()) == null) {
            return;
        }
        purchasesResponseListener.onQueryPurchasesResponse(p0, p1);
    }
}
