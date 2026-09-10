package lj;

import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 {
    public static final q a(BillingResult billingResult) {
        p pVar;
        kotlin.jvm.internal.n.f(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 12) {
            pVar = p.ERROR;
            switch (responseCode) {
                case -2:
                    pVar = p.FEATURE_NOT_SUPPORTED;
                    break;
                case -1:
                    pVar = p.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    pVar = p.OK;
                    break;
                case 1:
                    pVar = p.USER_CANCELED;
                    break;
                case 2:
                    pVar = p.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    pVar = p.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    pVar = p.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    pVar = p.DEVELOPER_ERROR;
                    break;
                case 7:
                    pVar = p.ITEM_ALREADY_OWNED;
                    break;
                case 8:
                    pVar = p.ITEM_NOT_OWNED;
                    break;
            }
        } else {
            pVar = p.NETWORK_ERROR;
        }
        String debugMessage = billingResult.getDebugMessage();
        kotlin.jvm.internal.n.e(debugMessage, "getDebugMessage(...)");
        return new q(pVar, debugMessage, billingResult.getOnPurchasesUpdatedSubResponseCode());
    }

    public static final List b(List list) {
        Iterator it;
        if (list == null) {
            return xj.v.f53866a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it) {
            Purchase purchase = (Purchase) it2.next();
            kotlin.jvm.internal.n.f(purchase, "purchase");
            AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
            t tVar = null;
            j jVar = accountIdentifiers != null ? new j(accountIdentifiers.getObfuscatedAccountId(), accountIdentifiers.getObfuscatedProfileId()) : null;
            Purchase.PendingPurchaseUpdate pendingPurchaseUpdate = purchase.getPendingPurchaseUpdate();
            if (pendingPurchaseUpdate != null) {
                List<String> products = pendingPurchaseUpdate.getProducts();
                kotlin.jvm.internal.n.e(products, "getProducts(...)");
                String purchaseToken = pendingPurchaseUpdate.getPurchaseToken();
                kotlin.jvm.internal.n.e(purchaseToken, "getPurchaseToken(...)");
                tVar = new t(purchaseToken, products);
            }
            t tVar2 = tVar;
            String orderId = purchase.getOrderId();
            String packageName = purchase.getPackageName();
            kotlin.jvm.internal.n.e(packageName, "getPackageName(...)");
            long purchaseTime = purchase.getPurchaseTime();
            String purchaseToken2 = purchase.getPurchaseToken();
            kotlin.jvm.internal.n.e(purchaseToken2, "getPurchaseToken(...)");
            String signature = purchase.getSignature();
            kotlin.jvm.internal.n.e(signature, "getSignature(...)");
            List<String> products2 = purchase.getProducts();
            kotlin.jvm.internal.n.e(products2, "getProducts(...)");
            boolean zIsAutoRenewing = purchase.isAutoRenewing();
            String originalJson = purchase.getOriginalJson();
            kotlin.jvm.internal.n.e(originalJson, "getOriginalJson(...)");
            String developerPayload = purchase.getDeveloperPayload();
            kotlin.jvm.internal.n.e(developerPayload, "getDeveloperPayload(...)");
            boolean zIsAcknowledged = purchase.isAcknowledged();
            long quantity = purchase.getQuantity();
            int purchaseState = purchase.getPurchaseState();
            c0 c0Var = c0.UNSPECIFIED;
            if (purchaseState != 0) {
                it = it2;
                if (purchaseState == 1) {
                    c0Var = c0.PURCHASED;
                } else if (purchaseState == 2) {
                    c0Var = c0.PENDING;
                }
            } else {
                it = it2;
            }
            arrayList.add(new z(orderId, packageName, purchaseTime, purchaseToken2, signature, products2, zIsAutoRenewing, originalJson, developerPayload, zIsAcknowledged, quantity, c0Var, jVar, tVar2));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        String str;
        List<e0> list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        for (e0 platformProduct : list2) {
            kotlin.jvm.internal.n.f(platformProduct, "platformProduct");
            QueryProductDetailsParams.Product.Builder productId = QueryProductDetailsParams.Product.newBuilder().setProductId(platformProduct.f45362a);
            int iOrdinal = platformProduct.f45363b.ordinal();
            if (iOrdinal == 0) {
                str = "inapp";
            } else {
                if (iOrdinal != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                str = "subs";
            }
            QueryProductDetailsParams.Product productBuild = productId.setProductType(str).build();
            kotlin.jvm.internal.n.e(productBuild, "build(...)");
            arrayList.add(productBuild);
        }
        return arrayList;
    }
}
