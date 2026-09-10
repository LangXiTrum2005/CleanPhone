package reuter;

import ammonoid.VipStatusResponse;
import android.content.Context;
import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.gson.Gson;
import com.vungle.ads.internal.ui.AdActivity;
import fright.VerifySubRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: IapVipStatusHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(R6\u0010-\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001b\u0018\u00010)j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001b\u0018\u0001`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RB\u00102\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010)j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u0001`*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00103¨\u00065"}, d2 = {"Lreuter/rotuma;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfright/attabal;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "", "purchaseType", "Lmagenta/dern;", "iapPayListener", "", "beachfront", "(Landroid/content/Context;Lfright/attabal;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;Lmagenta/dern;)V", "Lcom/android/billingclient/api/Purchase;", "purchase", "productDetail", "type", "taiyuan", "(Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;Ljava/lang/String;)V", "dern", "(Landroid/content/Context;)V", "marial", "()Lfright/attabal;", "Lmagenta/wireman;", "", "onFinishListener", "impassible", "(Lmagenta/wireman;)V", "vipStatus", "formularize", "(Z)V", "wireman", "()Lcom/android/billingclient/api/ProductDetails;", "", "result", "apical", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "saneness", "Ljava/util/ArrayList;", "serverOrderListenerList", "getVipStatusListenerList", "()Ljava/util/ArrayList;", "setVipStatusListenerList", "(Ljava/util/ArrayList;)V", "vipStatusListenerList", "Z", "isRequesting", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final rotuma f36709attabal = new rotuma();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static ArrayList<magenta.wireman<Boolean>> vipStatusListenerList;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static ArrayList<magenta.wireman<Integer>> serverOrderListenerList;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static boolean isRequesting;

    public static /* synthetic */ void competently(rotuma rotumaVar, Context context, VerifySubRequest verifySubRequest, ProductDetails productDetails, String str, magenta.dern dernVar, int i, Object obj) {
        if ((i & 16) != 0) {
            dernVar = null;
        }
        rotumaVar.beachfront(context, verifySubRequest, productDetails, str, dernVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void cutely(Purchase purchase, Ref$ObjectRef price, ProductDetails productDetail, String purchaseType) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(price, "$price");
        Intrinsics.checkNotNullParameter(productDetail, "$productDetail");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
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
        competently(f36709attabal, molybdenite.f36681attabal.merc(), new VerifySubRequest(str, purchaseToken, str2, str3, 0, null, null, 96, null), productDetail, purchaseType, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void impromptu(Context context, Ref$ObjectRef productType, VerifySubRequest request, String purchaseType, ProductDetails productDetails, magenta.dern dernVar, pancuronium.saneness response) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(productType, "$productType");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(productDetails, "$productDetails");
        Intrinsics.checkNotNullParameter(response, "response");
        int iAttabal = response.attabal();
        if (iAttabal == 0) {
            babyless.beachfront.dern("sp_iap_un_notify_server_order_info_str");
            babyless.beachfront.dern("sp_iap_notify_status");
            if (response.dern() != null) {
                f36709attabal.formularize(true);
            } else {
                f36709attabal.formularize(false);
            }
            nestlike.wireman.f33881attabal.rotuma(context, (String) productType.element, request.getProduct_id(), request.getIap_token(), request.getOrder_id(), purchaseType);
            nestlike.saneness.dern(nestlike.saneness.f33880attabal, context, (String) productType.element, productDetails, request.getProduct_id(), request.getOrder_id(), false, 32, null);
            if (dernVar != null) {
                dernVar.attabal(0, "", request, productDetails, purchaseType);
            }
        } else if (iAttabal == 81) {
            babyless.beachfront.dern("sp_iap_un_notify_server_order_info_str");
            babyless.beachfront.dern("sp_iap_notify_status");
            f36709attabal.formularize(false);
            nestlike.wireman.f33881attabal.gintrap(context, (String) productType.element, request.getProduct_id(), request.getIap_token(), request.getOrder_id(), response.attabal(), response.saneness(), purchaseType);
            if (dernVar != null) {
                dernVar.attabal(-1003, "", request, productDetails, purchaseType);
            }
        } else if (iAttabal != 82) {
            nestlike.wireman.f33881attabal.gintrap(context, (String) productType.element, request.getProduct_id(), request.getIap_token(), request.getOrder_id(), response.attabal(), response.saneness(), purchaseType);
            f36709attabal.formularize(false);
            if (dernVar != null) {
                dernVar.attabal(-1004, "", request, productDetails, purchaseType);
            }
        } else {
            babyless.beachfront.dern("sp_iap_un_notify_server_order_info_str");
            babyless.beachfront.dern("sp_iap_notify_status");
            nestlike.wireman.f33881attabal.gintrap(context, (String) productType.element, request.getProduct_id(), request.getIap_token(), request.getOrder_id(), response.attabal(), response.saneness(), purchaseType);
            f36709attabal.formularize(true);
            if (dernVar != null) {
                dernVar.attabal(0, "", request, productDetails, purchaseType);
            }
        }
        f36709attabal.apical(response.attabal());
        isRequesting = false;
    }

    public final void apical(int result) {
        ArrayList<magenta.wireman<Integer>> arrayList = serverOrderListenerList;
        if (arrayList == null) {
            return;
        }
        Intrinsics.beachfront(arrayList);
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((magenta.wireman) it.next()).attabal(Integer.valueOf(result));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void beachfront(final Context context, final VerifySubRequest request, final ProductDetails productDetails, final String purchaseType, final magenta.dern iapPayListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (isRequesting) {
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        if (request.getType() == 0) {
            ref$ObjectRef.element = "subs";
        } else if (request.getType() == 1) {
            ref$ObjectRef.element = "inapp";
        }
        nestlike.wireman.f33881attabal.dovishness(context, (String) ref$ObjectRef.element, request.getProduct_id(), request.getIap_token(), request.getOrder_id(), purchaseType);
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        if (marialVar.attabal().length() > 0) {
            request.restrictive(marialVar.attabal());
        }
        if (!marialVar.saneness().isEmpty()) {
            request.oilcan().clear();
            for (Map.Entry<String, String> entry : marialVar.saneness().entrySet()) {
                request.oilcan().put(entry.getKey(), entry.getValue());
            }
        }
        babyless.beachfront.apical("sp_iap_un_notify_server_order_info_str", new Gson().toJson(request));
        babyless.beachfront.apical("sp_iap_un_notify_product_details_str", new Gson().toJson(productDetails));
        if (!NetworkUtils.dern()) {
            if (iapPayListener != null) {
                iapPayListener.attabal(-1002, "productDetails.oneTimePurchaseOfferDetails is null", request, productDetails, purchaseType);
            }
        } else {
            dextrorotary.attabal attabalVar = dextrorotary.attabal.f25229attabal;
            String strAttabal = attabalVar.attabal(attabalVar.dern());
            isRequesting = true;
            panocha.wireman.marial().dern(strAttabal, request, VipStatusResponse.class, new pancuronium.attabal() { // from class: reuter.gintrap
                @Override // pancuronium.attabal
                public final void attabal(pancuronium.saneness sanenessVar) {
                    rotuma.impromptu(context, ref$ObjectRef, request, purchaseType, productDetails, iapPayListener, sanenessVar);
                }
            });
        }
    }

    public final void dern(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VerifySubRequest verifySubRequestMarial = marial();
        ProductDetails productDetailsWireman = wireman();
        if (verifySubRequestMarial == null || productDetailsWireman == null || TextUtils.isEmpty(verifySubRequestMarial.getOrder_id())) {
            return;
        }
        competently(this, context, verifySubRequestMarial, productDetailsWireman, "old", null, 16, null);
    }

    public final void formularize(boolean vipStatus) {
        ArrayList<magenta.wireman<Boolean>> arrayList = vipStatusListenerList;
        if (arrayList == null) {
            return;
        }
        Intrinsics.beachfront(arrayList);
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((magenta.wireman) it.next()).attabal(Boolean.valueOf(vipStatus));
        }
    }

    public final void impassible(magenta.wireman<Boolean> onFinishListener) {
        Intrinsics.checkNotNullParameter(onFinishListener, "onFinishListener");
        if (vipStatusListenerList == null) {
            vipStatusListenerList = new ArrayList<>();
        }
        ArrayList<magenta.wireman<Boolean>> arrayList = vipStatusListenerList;
        Intrinsics.beachfront(arrayList);
        if (arrayList.contains(onFinishListener)) {
            return;
        }
        ArrayList<magenta.wireman<Boolean>> arrayList2 = vipStatusListenerList;
        Intrinsics.beachfront(arrayList2);
        arrayList2.add(onFinishListener);
    }

    public final VerifySubRequest marial() {
        String strTaiyuan = babyless.beachfront.taiyuan("sp_iap_un_notify_server_order_info_str", "");
        if (strTaiyuan == null || strTaiyuan.length() == 0) {
            return null;
        }
        return (VerifySubRequest) new Gson().fromJson(strTaiyuan, VerifySubRequest.class);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.Object, java.lang.String] */
    public final void taiyuan(final Purchase purchase, final ProductDetails productDetail, final String purchaseType, String type) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(productDetail, "productDetail");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(type, "type");
        String orderId = purchase.getOrderId();
        if (orderId == null || !p002kotlin.text.dovishness.starveling(orderId, "GPA", false, 2, null)) {
            return;
        }
        if (Intrinsics.wireman(purchaseType, "new")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 31, type, productDetail.getProductId(), 0, null, 48, null);
        } else if (Intrinsics.wireman(purchaseType, "old")) {
            nestlike.marial.marial(nestlike.marial.f33872attabal, molybdenite.f36681attabal.merc(), 41, type, productDetail.getProductId(), 0, null, 48, null);
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
        molybdenite.f36681attabal.polder().submit(new Runnable() { // from class: reuter.dovishness
            @Override // java.lang.Runnable
            public final void run() {
                rotuma.cutely(purchase, ref$ObjectRef, productDetail, purchaseType);
            }
        });
    }

    public final ProductDetails wireman() {
        String strTaiyuan = babyless.beachfront.taiyuan("sp_iap_un_notify_product_details_str", "");
        Object objFromJson = null;
        if (strTaiyuan != null && strTaiyuan.length() != 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objFromJson = new Gson().fromJson(strTaiyuan, (Class<Object>) ProductDetails.class);
                Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }
        return (ProductDetails) objFromJson;
    }
}
