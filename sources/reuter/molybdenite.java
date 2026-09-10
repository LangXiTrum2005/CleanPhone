package reuter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import fright.VerifySubRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: IapManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u008a\u0001_B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J1\u0010.\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010'J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010'J7\u00108\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u00020!042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J)\u0010;\u001a\u0004\u0018\u00010\u001f2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u0010<J\r\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020=¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bG\u0010FJ\u001d\u0010J\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ7\u0010Q\u001a\u00020\u000b2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L042\b\b\u0002\u0010N\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u00062\u0006\u0010D\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010D\u001a\u00020S¢\u0006\u0004\bT\u0010UJ%\u0010V\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\u001eJ%\u0010X\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010D\u001a\u00020W¢\u0006\u0004\bX\u0010YJ!\u0010\\\u001a\u00020\u000b2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0Z¢\u0006\u0004\b\\\u0010]R\u001c\u0010a\u001a\n ^*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010`R\u0016\u0010v\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010`R$\u0010{\u001a\u0012\u0012\u0004\u0012\u00020C0wj\b\u0012\u0004\u0012\u00020C`x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R(\u0010\u0085\u0001\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"Lreuter/molybdenite;", "", "<init>", "()V", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "responseCode", "debugMsg", "logStr", "toastStr", "", "grimness", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "timberyard", "(Landroid/content/Context;)V", X3.i.m, "milliradian", "(Ljava/lang/String;)V", "", "isShowToast", "Lreuter/molybdenite$attabal;", "callback", "empress", "(ZLreuter/molybdenite$attabal;)V", "Landroid/app/Activity;", "activity", "hydrovane", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/Purchase;", "purchase", "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "purchaseType", "kattegat", "(Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "rotuma", "(Lcom/android/billingclient/api/Purchase;Ljava/lang/String;)V", "Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;", "acknowledgePurchaseResponseListener", "gintrap", "(Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;)V", "privatdozent", "(Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/ProductDetails;)V", "creditor", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/Purchase;)V", "yemenite", "stratoscope", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "productDetailsList", "targetProductId", "targetProductType", "seminary", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/ProductDetails;", "purchases", "splinterproof", "(Ljava/util/List;Ljava/lang/String;)Lcom/android/billingclient/api/Purchase;", "Ljava/util/concurrent/ExecutorService;", "polder", "()Ljava/util/concurrent/ExecutorService;", "executor", "sayid", "(Ljava/util/concurrent/ExecutorService;)V", "Lmagenta/dern;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "itchy", "(Lmagenta/dern;)V", "coi", "Landroid/app/Application;", "showToast", "saran", "(Landroid/app/Application;Z)V", "Lloungewear/marial;", "purchaseItem", "retryCount", "queryRetryCount", "Lreuter/molybdenite$saneness;", "clubfoot", "(Ljava/util/List;IILreuter/molybdenite$saneness;)V", "Lcom/android/billingclient/api/PurchasesResponseListener;", "cultivated", "(Ljava/lang/String;Lcom/android/billingclient/api/PurchasesResponseListener;)V", "mathsort", "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "permissivist", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/ProductDetailsResponseListener;)V", "Lkotlin/Function1;", "onCompleteUpdate", "coffeecake", "(Lkotlin/jvm/functions/Function1;)V", "kotlin.jvm.PlatformType", "saneness", "Ljava/lang/String;", "TAG", "dern", "Z", "mBillingClientDisconnected", "Lcom/android/billingclient/api/BillingClient;", "wireman", "Lcom/android/billingclient/api/BillingClient;", "mBillingClient", "Landroid/os/Handler;", "marial", "Landroid/os/Handler;", "mainHandler", "beachfront", "Ljava/util/concurrent/ExecutorService;", "executorService", "competently", "Lcom/android/billingclient/api/ProductDetails;", "mCurrentProductDetails", "impromptu", "mCurrentProductId", "taiyuan", "mCurrentProductType", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cutely", "Ljava/util/ArrayList;", "payListeners", "apical", "Lmagenta/dern;", "currentListener", "formularize", "Landroid/app/Application;", "merc", "()Landroid/app/Application;", "lotta", "(Landroid/app/Application;)V", "application", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "impassible", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "purchasesUpdatedListener", "attabal", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static magenta.dern currentListener;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static ExecutorService executorService;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static ProductDetails mCurrentProductDetails;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static boolean mBillingClientDisconnected;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public static Application application;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static BillingClient mBillingClient;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f36681attabal = new molybdenite();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = molybdenite.class.getSimpleName();

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static String mCurrentProductId = "";

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static String mCurrentProductType = "inapp";

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final ArrayList<magenta.dern> payListeners = new ArrayList<>();

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public static final PurchasesUpdatedListener purchasesUpdatedListener = new PurchasesUpdatedListener() { // from class: reuter.saneness
        @Override // com.android.billingclient.api.PurchasesUpdatedListener
        public final void onPurchasesUpdated(BillingResult billingResult, List list) {
            molybdenite.overspeculate(billingResult, list);
        }
    };

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lreuter/molybdenite$attabal;", "", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "attabal", "(Lcom/android/billingclient/api/BillingResult;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface attabal {
        void attabal(BillingResult billingResult);
    }

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"reuter/molybdenite$beachfront", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "onBillingSetupFinished", "(Lcom/android/billingclient/api/BillingResult;)V", "onBillingServiceDisconnected", "()V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class beachfront implements BillingClientStateListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ boolean f36693attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ attabal f36694saneness;

        public beachfront(boolean z, attabal attabalVar) {
            this.f36693attabal = z;
            this.f36694saneness = attabalVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            molybdenite.mBillingClientDisconnected = true;
            String unused = molybdenite.TAG;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            molybdenite.mBillingClientDisconnected = false;
            String unused = molybdenite.TAG;
            if (billingResult.getResponseCode() == 0) {
                nestlike.wireman wiremanVar = nestlike.wireman.f33881attabal;
                Application applicationMerc = molybdenite.f36681attabal.merc();
                int responseCode = billingResult.getResponseCode();
                String debugMessage = billingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
                wiremanVar.impromptu(applicationMerc, responseCode, debugMessage);
            } else {
                nestlike.wireman wiremanVar2 = nestlike.wireman.f33881attabal;
                Application applicationMerc2 = molybdenite.f36681attabal.merc();
                int responseCode2 = billingResult.getResponseCode();
                String debugMessage2 = billingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage2, "getDebugMessage(...)");
                wiremanVar2.competently(applicationMerc2, responseCode2, debugMessage2);
            }
            billingResult.getResponseCode();
            this.f36694saneness.attabal(billingResult);
        }
    }

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"reuter/molybdenite$dern", "Lreuter/molybdenite$attabal;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "attabal", "(Lcom/android/billingclient/api/BillingResult;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Application f36695attabal;

        public dern(Application application) {
            this.f36695attabal = application;
        }

        @Override // reuter.molybdenite.attabal
        public void attabal(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (billingResult.getResponseCode() != 0) {
                return;
            }
            adultoid.f36626attabal.impromptu();
            molybdenite.f36681attabal.timberyard(this.f36695attabal);
        }
    }

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"reuter/molybdenite$marial", "Lreuter/molybdenite$attabal;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "attabal", "(Lcom/android/billingclient/api/BillingResult;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class marial implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f36696attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ int f36697dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ List<PurchaseItem> f36698saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ saneness f36699wireman;

        public marial(int i, List<PurchaseItem> list, int i2, saneness sanenessVar) {
            this.f36696attabal = i;
            this.f36698saneness = list;
            this.f36697dern = i2;
            this.f36699wireman = sanenessVar;
        }

        @Override // reuter.molybdenite.attabal
        public void attabal(BillingResult billingResult) {
            int i;
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (billingResult.getResponseCode() != 0 || (i = this.f36696attabal) > 2) {
                return;
            }
            molybdenite.f36681attabal.clubfoot(this.f36698saneness, i + 1, this.f36697dern, this.f36699wireman);
        }
    }

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lreuter/molybdenite$saneness;", "", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "attabal", "(ILjava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface saneness {
        void attabal(int code, String msg);
    }

    /* JADX INFO: compiled from: IapManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"reuter/molybdenite$wireman", "Lreuter/molybdenite$attabal;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "attabal", "(Lcom/android/billingclient/api/BillingResult;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class wireman implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Activity f36700attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f36701dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f36702saneness;

        public wireman(Activity activity, String str, String str2) {
            this.f36700attabal = activity;
            this.f36702saneness = str;
            this.f36701dern = str2;
        }

        @Override // reuter.molybdenite.attabal
        public void attabal(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (billingResult.getResponseCode() == 0) {
                molybdenite.f36681attabal.hydrovane(this.f36700attabal, this.f36702saneness, this.f36701dern);
                return;
            }
            magenta.dern dernVar = molybdenite.currentListener;
            if (dernVar != null) {
                dernVar.beachfront(this.f36702saneness, this.f36701dern);
            }
        }
    }

    public static final void cord(BillingResult it, final Purchase purchase, final String purchaseType) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        if (it.getResponseCode() != 0) {
            molybdenite molybdeniteVar = f36681attabal;
            molybdeniteVar.rotuma(purchase, purchaseType);
            nestlike.wireman.f33881attabal.saneness(molybdeniteVar.merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), it.getResponseCode(), it.getDebugMessage(), purchaseType);
            return;
        }
        babyless.beachfront.apical("sp_iap_notify_status", purchase.getOriginalJson());
        molybdenite molybdeniteVar2 = f36681attabal;
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        Object objLerp = CollectionsKt.lerp(products);
        Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
        molybdeniteVar2.permissivist((String) objLerp, "subs", new ProductDetailsResponseListener() { // from class: reuter.impromptu
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                molybdenite.cuirassed(purchase, purchaseType, billingResult, list);
            }
        });
    }

    public static final void cuirassed(Purchase purchase, String purchaseType, BillingResult billingResult, List detailsList) {
        Purchase purchase2;
        String str;
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(detailsList, "detailsList");
        if (detailsList.isEmpty()) {
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                preprohormone.dern(dernVar, 6, billingResult != null ? billingResult.getDebugMessage() : null, mCurrentProductId, false, 8, null);
                return;
            }
            return;
        }
        ProductDetails productDetails = (ProductDetails) CollectionsKt.lerp(detailsList);
        if (currentListener != null) {
            purchase2 = purchase;
            str = purchaseType;
            cord.f36653attabal.marial(currentListener, billingResult, purchase2, productDetails, str);
        } else {
            purchase2 = purchase;
            str = purchaseType;
            rotuma.f36709attabal.taiyuan(purchase2, productDetails, str, "subs");
        }
        Purchase purchase3 = purchase2;
        nestlike.wireman.f33881attabal.dern(f36681attabal.merc(), mCurrentProductType, mCurrentProductId, purchase3.getPurchaseToken(), purchase3.getOrderId(), str);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    public static final void dent(int i, List purchaseItem, int i2, saneness listener, BillingResult result, List products) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        Object next;
        String formattedPrice;
        ProductDetails.PricingPhases pricingPhases2;
        List<ProductDetails.PricingPhase> pricingPhaseList2;
        Object next2;
        Intrinsics.checkNotNullParameter(purchaseItem, "$purchaseItem");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(products, "products");
        if (result.getResponseCode() != 0) {
            if (i <= 2) {
                f36681attabal.clubfoot(purchaseItem, i2, i + 1, listener);
                return;
            }
            return;
        }
        Iterator it = products.iterator();
        while (it.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it.next();
            Iterator it2 = purchaseItem.iterator();
            while (it2.hasNext()) {
                PurchaseItem purchaseItem2 = (PurchaseItem) it2.next();
                if (Intrinsics.wireman(purchaseItem2.getProductId(), productDetails.getProductId())) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        String formattedPrice2 = null;
                        if (Intrinsics.wireman(purchaseItem2.beachfront(), "inapp")) {
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails != null) {
                                formattedPrice2 = oneTimePurchaseOfferDetails.getFormattedPrice();
                            }
                        } else {
                            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
                            if (subscriptionOfferDetails2 != null) {
                                Intrinsics.beachfront(subscriptionOfferDetails2);
                                subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.lerp(subscriptionOfferDetails2);
                            } else {
                                subscriptionOfferDetails = null;
                            }
                            String offerId = subscriptionOfferDetails != null ? subscriptionOfferDetails.getOfferId() : null;
                            String str = "";
                            if (offerId == null) {
                                offerId = "";
                            } else {
                                Intrinsics.beachfront(offerId);
                            }
                            purchaseItem2.apical(offerId);
                            String offerId2 = subscriptionOfferDetails != null ? subscriptionOfferDetails.getOfferId() : null;
                            purchaseItem2.impassible(!(offerId2 == null || offerId2.length() == 0));
                            if (purchaseItem2.getOpenOffer()) {
                                if (subscriptionOfferDetails == null || (pricingPhases2 = subscriptionOfferDetails.getPricingPhases()) == null || (pricingPhaseList2 = pricingPhases2.getPricingPhaseList()) == null) {
                                    formattedPrice = null;
                                } else {
                                    Intrinsics.beachfront(pricingPhaseList2);
                                    Iterator<T> it3 = pricingPhaseList2.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        next2 = it3.next();
                                    } while (((ProductDetails.PricingPhase) next2).getRecurrenceMode() != 2);
                                    ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) next2;
                                    if (pricingPhase != null) {
                                        formattedPrice = pricingPhase.getFormattedPrice();
                                    } else {
                                        formattedPrice = null;
                                    }
                                }
                                if (formattedPrice != null) {
                                    Intrinsics.beachfront(formattedPrice);
                                    str = formattedPrice;
                                }
                                purchaseItem2.formularize(str);
                            }
                            if (subscriptionOfferDetails != null && (pricingPhases = subscriptionOfferDetails.getPricingPhases()) != null && (pricingPhaseList = pricingPhases.getPricingPhaseList()) != null) {
                                Intrinsics.beachfront(pricingPhaseList);
                                Iterator<T> it4 = pricingPhaseList.iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    next = it4.next();
                                } while (((ProductDetails.PricingPhase) next).getRecurrenceMode() != 1);
                                ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) next;
                                if (pricingPhase2 != null) {
                                    formattedPrice2 = pricingPhase2.getFormattedPrice();
                                }
                            }
                        }
                        if (formattedPrice2 != null && !StringsKt.empress(formattedPrice2)) {
                            purchaseItem2.cutely(formattedPrice2);
                            String name = productDetails.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            purchaseItem2.taiyuan(name);
                        }
                        Result.m3351constructorimpl(Unit.f29295attabal);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                    }
                }
            }
        }
        int responseCode = result.getResponseCode();
        String debugMessage = result.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        listener.attabal(responseCode, debugMessage);
    }

    public static final void lerp(final Function1 onCompleteUpdate, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(onCompleteUpdate, "$onCompleteUpdate");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            onCompleteUpdate.invoke(Boolean.FALSE);
            return;
        }
        final Purchase purchase = (Purchase) list.get(0);
        molybdenite molybdeniteVar = f36681attabal;
        String str = purchase.getProducts().get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        molybdeniteVar.permissivist(str, "subs", new ProductDetailsResponseListener() { // from class: reuter.taiyuan
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult2, List list2) {
                molybdenite.nosophobia(purchase, onCompleteUpdate, billingResult2, list2);
            }
        });
    }

    public static final void nosophobia(Purchase purchase, Function1 onCompleteUpdate, BillingResult billingResult, List detailsList) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(onCompleteUpdate, "$onCompleteUpdate");
        Intrinsics.checkNotNullParameter(detailsList, "detailsList");
        if (detailsList.isEmpty()) {
            onCompleteUpdate.invoke(Boolean.FALSE);
            return;
        }
        ProductDetails productDetails = (ProductDetails) detailsList.get(0);
        if (purchase.getPurchaseState() == 1 && !purchase.isAcknowledged()) {
            onCompleteUpdate.invoke(Boolean.FALSE);
            return;
        }
        if (productDetails.getSubscriptionOfferDetails() == null) {
            onCompleteUpdate.invoke(Boolean.FALSE);
            return;
        }
        String str = purchase.getProducts().get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = str;
        String purchaseToken = purchase.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        Intrinsics.beachfront(subscriptionOfferDetails);
        String formattedPrice = subscriptionOfferDetails.get(0).getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        rotuma.competently(rotuma.f36709attabal, f36681attabal.merc(), new VerifySubRequest(str2, purchaseToken, formattedPrice, orderId, 0, null, null, 96, null), productDetails, "subs", null, 16, null);
        onCompleteUpdate.invoke(Boolean.TRUE);
    }

    public static final void oilcan(Purchase purchase, ProductDetails it, String purchaseType) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        f36681attabal.kattegat(purchase, it, purchaseType);
    }

    public static final void overspeculate(BillingResult purchasesBillingResult, List list) {
        Purchase purchase;
        Purchase purchase2;
        Purchase purchase3;
        Purchase purchase4;
        Purchase purchase5;
        Intrinsics.checkNotNullParameter(purchasesBillingResult, "purchasesBillingResult");
        if (list != null && (purchase5 = (Purchase) CollectionsKt.lerp(list)) != null) {
            purchase5.getOrderId();
        }
        if (list != null && (purchase4 = (Purchase) CollectionsKt.lerp(list)) != null) {
            purchase4.getPurchaseToken();
        }
        if (list != null && (purchase3 = (Purchase) CollectionsKt.lerp(list)) != null) {
            purchase3.getPurchaseState();
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase6 = (Purchase) it.next();
                Bundle bundle = new Bundle();
                bundle.putString("pkg", purchase6.getPackageName());
                bundle.putString("order_id", purchase6.getOrderId());
                bundle.putString("token", purchase6.getPurchaseToken());
                nestlike.attabal.f33869attabal.attabal(f36681attabal.merc(), "debug_purchase_info", bundle, "");
            }
        }
        if (purchasesBillingResult.getResponseCode() != 0) {
            nestlike.wireman.f33881attabal.wireman(f36681attabal.merc(), mCurrentProductType, mCurrentProductId, (list == null || (purchase2 = (Purchase) CollectionsKt.lerp(list)) == null) ? null : purchase2.getPurchaseToken(), (list == null || (purchase = (Purchase) CollectionsKt.lerp(list)) == null) ? null : purchase.getOrderId(), purchasesBillingResult.getResponseCode(), purchasesBillingResult.getDebugMessage());
        }
        switch (purchasesBillingResult.getResponseCode()) {
            case -3:
                molybdenite molybdeniteVar = f36681attabal;
                String str = mCurrentProductId;
                int responseCode = purchasesBillingResult.getResponseCode();
                String debugMessage = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
                molybdeniteVar.grimness(str, responseCode, debugMessage, "SERVICE_TIMEOUT", "Google Play error.please try again");
                break;
            case -2:
                molybdenite molybdeniteVar2 = f36681attabal;
                String str2 = mCurrentProductId;
                int responseCode2 = purchasesBillingResult.getResponseCode();
                String debugMessage2 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage2, "getDebugMessage(...)");
                molybdeniteVar2.grimness(str2, responseCode2, debugMessage2, "FEATURE_NOT_SUPPORTED", "Please upgrade Google Play and try again");
                break;
            case -1:
                molybdenite molybdeniteVar3 = f36681attabal;
                String str3 = mCurrentProductId;
                int responseCode3 = purchasesBillingResult.getResponseCode();
                String debugMessage3 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage3, "getDebugMessage(...)");
                molybdeniteVar3.grimness(str3, responseCode3, debugMessage3, "SERVICE_DISCONNECTED", "Google Play error.please try again");
                break;
            case 0:
                if (list != null) {
                    if (list.size() != 0) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            Purchase purchase7 = (Purchase) it2.next();
                            String packageName = purchase7.getPackageName();
                            molybdenite molybdeniteVar4 = f36681attabal;
                            if (Intrinsics.wireman(packageName, molybdeniteVar4.merc().getPackageName())) {
                                if (Intrinsics.wireman(mCurrentProductType, "inapp")) {
                                    Intrinsics.beachfront(purchase7);
                                    molybdeniteVar4.stratoscope(purchase7, "new");
                                } else {
                                    Intrinsics.beachfront(purchase7);
                                    molybdeniteVar4.yemenite(purchase7, "new");
                                }
                            }
                        }
                    } else {
                        magenta.dern dernVar = currentListener;
                        if (dernVar != null) {
                            preprohormone.dern(dernVar, 6, "purchases size is zero", mCurrentProductId, false, 8, null);
                        }
                        magenta.dern dernVar2 = currentListener;
                        if (dernVar2 != null) {
                            dernVar2.impromptu(6, "purchases size is zero", mCurrentProductId);
                        }
                        nestlike.wireman wiremanVar = nestlike.wireman.f33881attabal;
                        Application applicationMerc = f36681attabal.merc();
                        String str4 = mCurrentProductType;
                        String str5 = mCurrentProductId;
                        Purchase purchase8 = (Purchase) CollectionsKt.lerp(list);
                        String purchaseToken = purchase8 != null ? purchase8.getPurchaseToken() : null;
                        Purchase purchase9 = (Purchase) CollectionsKt.lerp(list);
                        wiremanVar.wireman(applicationMerc, str4, str5, purchaseToken, purchase9 != null ? purchase9.getOrderId() : null, purchasesBillingResult.getResponseCode(), "purchases size is 0");
                    }
                    break;
                }
                break;
            case 1:
                cord cordVar = cord.f36653attabal;
                magenta.dern dernVar3 = currentListener;
                String str6 = mCurrentProductType;
                String str7 = mCurrentProductId;
                int responseCode4 = purchasesBillingResult.getResponseCode();
                String debugMessage4 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage4, "getDebugMessage(...)");
                cordVar.attabal(dernVar3, str6, str7, responseCode4, debugMessage4);
                break;
            case 2:
                molybdenite molybdeniteVar5 = f36681attabal;
                String str8 = mCurrentProductId;
                int responseCode5 = purchasesBillingResult.getResponseCode();
                String debugMessage5 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage5, "getDebugMessage(...)");
                molybdeniteVar5.grimness(str8, responseCode5, debugMessage5, "SERVICE_UNAVAILABLE", "Network unavailable! Please check your network and try again");
                break;
            case 3:
                molybdenite molybdeniteVar6 = f36681attabal;
                String str9 = mCurrentProductId;
                int responseCode6 = purchasesBillingResult.getResponseCode();
                String debugMessage6 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage6, "getDebugMessage(...)");
                molybdeniteVar6.grimness(str9, responseCode6, debugMessage6, "BILLING_UNAVAILABLE", "Please upgrade Google Play and try again");
                break;
            case 4:
                molybdenite molybdeniteVar7 = f36681attabal;
                String str10 = mCurrentProductId;
                int responseCode7 = purchasesBillingResult.getResponseCode();
                String debugMessage7 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage7, "getDebugMessage(...)");
                molybdeniteVar7.grimness(str10, responseCode7, debugMessage7, "ITEM_UNAVAILABLE", "Please upgrade Google Play and try again");
                break;
            case 5:
                molybdenite molybdeniteVar8 = f36681attabal;
                String str11 = mCurrentProductId;
                int responseCode8 = purchasesBillingResult.getResponseCode();
                String debugMessage8 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage8, "getDebugMessage(...)");
                molybdeniteVar8.grimness(str11, responseCode8, debugMessage8, "DEVELOPER_ERROR", "Please upgrade APP and try again");
                break;
            case 6:
                molybdenite molybdeniteVar9 = f36681attabal;
                String str12 = mCurrentProductId;
                int responseCode9 = purchasesBillingResult.getResponseCode();
                String debugMessage9 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage9, "getDebugMessage(...)");
                molybdeniteVar9.grimness(str12, responseCode9, debugMessage9, "ERROR", "Google Play error.please try again");
                break;
            case 7:
                if (list == null || list.size() == 0) {
                    cord cordVar2 = cord.f36653attabal;
                    magenta.dern dernVar4 = currentListener;
                    String str13 = mCurrentProductType;
                    String str14 = mCurrentProductId;
                    int responseCode10 = purchasesBillingResult.getResponseCode();
                    String debugMessage10 = purchasesBillingResult.getDebugMessage();
                    Intrinsics.checkNotNullExpressionValue(debugMessage10, "getDebugMessage(...)");
                    cordVar2.attabal(dernVar4, str13, str14, responseCode10, debugMessage10);
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Purchase purchase10 = (Purchase) it3.next();
                        String packageName2 = purchase10.getPackageName();
                        molybdenite molybdeniteVar10 = f36681attabal;
                        if (Intrinsics.wireman(packageName2, molybdeniteVar10.merc().getPackageName())) {
                            if (Intrinsics.wireman(mCurrentProductId, "inapp")) {
                                Intrinsics.beachfront(purchase10);
                                molybdeniteVar10.stratoscope(purchase10, "old");
                            } else {
                                Intrinsics.beachfront(purchase10);
                                molybdeniteVar10.yemenite(purchase10, "old");
                            }
                        }
                    }
                }
                break;
            case 8:
                molybdenite molybdeniteVar11 = f36681attabal;
                String str15 = mCurrentProductId;
                int responseCode11 = purchasesBillingResult.getResponseCode();
                String debugMessage11 = purchasesBillingResult.getDebugMessage();
                Intrinsics.checkNotNullExpressionValue(debugMessage11, "getDebugMessage(...)");
                molybdeniteVar11.grimness(str15, responseCode11, debugMessage11, "ITEM_NOT_OWNED", "Google Play error.please try again");
                break;
        }
    }

    public static final void peridotite(BillingResult billingResult, List purchaseList, String productId, Activity activity, String productType) {
        Intrinsics.checkNotNullParameter(billingResult, "$billingResult");
        Intrinsics.checkNotNullParameter(purchaseList, "$purchaseList");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productType, "$productType");
        if (billingResult.getResponseCode() == 0) {
            molybdenite molybdeniteVar = f36681attabal;
            molybdeniteVar.creditor(activity, productType, productId, molybdeniteVar.splinterproof(purchaseList, productId));
            return;
        }
        cord cordVar = cord.f36653attabal;
        magenta.dern dernVar = currentListener;
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        cordVar.attabal(dernVar, productType, "", responseCode, debugMessage);
        nestlike.wireman.f33881attabal.graveside(f36681attabal.merc(), billingResult.getResponseCode(), billingResult.getDebugMessage(), productType);
    }

    public static final void premeiotic(PurchasesResponseListener listener, BillingResult billingResult, List purchaseList) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        if (billingResult.getResponseCode() == 0) {
            billingResult.getResponseCode();
            Objects.toString(purchaseList);
            listener.onQueryPurchasesResponse(billingResult, purchaseList);
        } else {
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                preprohormone.dern(dernVar, 6, billingResult.getDebugMessage(), null, false, 12, null);
            }
        }
    }

    public static final void preprohormone(final Purchase purchase, final String purchaseType, final BillingResult it) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(it, "it");
        mainHandler.post(new Runnable() { // from class: reuter.marial
            @Override // java.lang.Runnable
            public final void run() {
                molybdenite.cord(it, purchase, purchaseType);
            }
        });
    }

    public static final void restrictive(BillingResult billingResult, ProductDetails productDetails, Purchase purchase, String purchaseType) {
        Intrinsics.checkNotNullParameter(billingResult, "$billingResult");
        Intrinsics.checkNotNullParameter(productDetails, "$productDetails");
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        if (billingResult.getResponseCode() == 0) {
            if (currentListener != null) {
                cord.f36653attabal.dern(currentListener, productDetails, purchase, purchaseType);
            } else {
                rotuma.f36709attabal.taiyuan(purchase, productDetails, purchaseType, "inapp");
            }
            nestlike.wireman.f33881attabal.apical(f36681attabal.merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
            return;
        }
        magenta.dern dernVar = currentListener;
        if (dernVar != null) {
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            Object objLerp = CollectionsKt.lerp(products);
            Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
            dernVar.impromptu(6, debugMessage, (String) objLerp);
        }
        nestlike.wireman.f33881attabal.cutely(f36681attabal.merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), billingResult.getResponseCode(), billingResult.getDebugMessage(), purchaseType);
    }

    public static final void sealless(Purchase purchase, String purchaseType, BillingResult billingResult, List detailsList) {
        Purchase purchase2;
        String str;
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(detailsList, "detailsList");
        if (detailsList.isEmpty()) {
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                preprohormone.dern(dernVar, 6, billingResult != null ? billingResult.getDebugMessage() : null, mCurrentProductId, false, 8, null);
                return;
            }
            return;
        }
        ProductDetails productDetails = (ProductDetails) detailsList.get(0);
        if (currentListener != null) {
            purchase2 = purchase;
            str = purchaseType;
            cord.f36653attabal.marial(currentListener, billingResult, purchase2, productDetails, str);
        } else {
            purchase2 = purchase;
            str = purchaseType;
            rotuma.f36709attabal.taiyuan(purchase2, productDetails, str, "subs");
        }
        Purchase purchase3 = purchase2;
        nestlike.wireman.f33881attabal.dern(f36681attabal.merc(), mCurrentProductType, mCurrentProductId, purchase3.getPurchaseToken(), purchase3.getOrderId(), str);
    }

    public static final void starveling(String productType, String productId, Activity activity, BillingResult billingResult, List productDetailsList) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(productType, "$productType");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        if (billingResult.getResponseCode() == 0) {
            nestlike.wireman.f33881attabal.polloi(f36681attabal.merc(), productType, productId);
            str = productType;
            str2 = productId;
        } else {
            str = productType;
            str2 = productId;
            nestlike.wireman.f33881attabal.monoploid(f36681attabal.merc(), str, str2, billingResult.getResponseCode(), billingResult.getDebugMessage());
        }
        molybdenite molybdeniteVar = f36681attabal;
        ProductDetails productDetailsSeminary = molybdeniteVar.seminary(billingResult, productDetailsList, str2, str);
        if (productDetailsSeminary != null) {
            nestlike.wireman.f33881attabal.formularize(molybdeniteVar.merc(), str, str2);
            molybdeniteVar.privatdozent(activity, str, productDetailsSeminary);
        } else {
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                dernVar.beachfront(str, str2);
            }
        }
    }

    public static final void supplicat(final ProductDetails productDetails, final Purchase purchase, final String purchaseType, final BillingResult billingResult, String p1) {
        Intrinsics.checkNotNullParameter(productDetails, "$productDetails");
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(p1, "p1");
        mainHandler.post(new Runnable() { // from class: reuter.beachfront
            @Override // java.lang.Runnable
            public final void run() {
                molybdenite.restrictive(billingResult, productDetails, purchase, purchaseType);
            }
        });
    }

    public static final void treadless(String productType, BillingResult billingResult, List purchaseList) {
        Intrinsics.checkNotNullParameter(productType, "$productType");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        if (billingResult.getResponseCode() != 0) {
            nestlike.wireman.f33881attabal.graveside(f36681attabal.merc(), billingResult.getResponseCode(), billingResult.getDebugMessage(), productType);
            return;
        }
        if (purchaseList.size() <= 0) {
            nestlike.wireman.f33881attabal.adultoid(f36681attabal.merc(), productType);
            return;
        }
        Iterator it = purchaseList.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (Intrinsics.wireman(productType, "inapp")) {
                molybdenite molybdeniteVar = f36681attabal;
                Intrinsics.beachfront(purchase);
                molybdeniteVar.stratoscope(purchase, "old");
            } else {
                molybdenite molybdeniteVar2 = f36681attabal;
                Intrinsics.beachfront(purchase);
                molybdeniteVar2.yemenite(purchase, "old");
            }
        }
    }

    public static final void trm(final Purchase purchase, final String purchaseType, BillingResult billingResult, List productDetailsList) {
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(purchaseType, "$purchaseType");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        molybdenite molybdeniteVar = f36681attabal;
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        Object objLerp = CollectionsKt.lerp(products);
        Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
        final ProductDetails productDetailsSeminary = molybdeniteVar.seminary(billingResult, productDetailsList, (String) objLerp, "inapp");
        if (productDetailsSeminary != null) {
            mainHandler.post(new Runnable() { // from class: reuter.arytenoidectomy
                @Override // java.lang.Runnable
                public final void run() {
                    molybdenite.oilcan(purchase, productDetailsSeminary, purchaseType);
                }
            });
        }
    }

    public static final void walach(final String productId, final Activity activity, final String productType, final BillingResult billingResult, final List purchaseList) {
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productType, "$productType");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        mainHandler.post(new Runnable() { // from class: reuter.monoploid
            @Override // java.lang.Runnable
            public final void run() {
                molybdenite.peridotite(billingResult, purchaseList, productId, activity, productType);
            }
        });
    }

    public final void clubfoot(final List<PurchaseItem> purchaseItem, final int retryCount, final int queryRetryCount, final saneness listener) {
        Intrinsics.checkNotNullParameter(purchaseItem, "purchaseItem");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (purchaseItem.isEmpty()) {
            listener.attabal(-1, "empty purchaseItem");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<PurchaseItem> list = purchaseItem;
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        for (PurchaseItem purchaseItem2 : list) {
            QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductId(purchaseItem2.getProductId()).setProductType(purchaseItem2.beachfront()).build();
            Intrinsics.checkNotNullExpressionValue(productBuild, "build(...)");
            arrayList2.add(productBuild);
        }
        arrayList.addAll(arrayList2);
        QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductList(arrayList);
        BillingClient billingClient = mBillingClient;
        if (billingClient == null) {
            mBillingClient = BillingClient.newBuilder(merc().getApplicationContext()).setListener(purchasesUpdatedListener).enablePendingPurchases().build();
            clubfoot(purchaseItem, retryCount, queryRetryCount, listener);
        } else {
            if (billingClient == null || !billingClient.isReady()) {
                empress(true, new marial(retryCount, purchaseItem, queryRetryCount, listener));
                return;
            }
            BillingClient billingClient2 = mBillingClient;
            if (billingClient2 != null) {
                billingClient2.queryProductDetailsAsync(builderNewBuilder.build(), new ProductDetailsResponseListener() { // from class: reuter.triweekly
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                        molybdenite.dent(queryRetryCount, purchaseItem, retryCount, listener, billingResult, list2);
                    }
                });
            }
        }
    }

    public final void coffeecake(final Function1<? super Boolean, Unit> onCompleteUpdate) {
        Intrinsics.checkNotNullParameter(onCompleteUpdate, "onCompleteUpdate");
        cultivated("subs", new PurchasesResponseListener() { // from class: reuter.polloi
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                molybdenite.lerp(onCompleteUpdate, billingResult, list);
            }
        });
    }

    public final void coi(magenta.dern listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList<magenta.dern> arrayList = payListeners;
        arrayList.remove(listener);
        currentListener = !arrayList.isEmpty() ? (magenta.dern) CollectionsKt.igbo(arrayList) : null;
    }

    public final void creditor(final Activity activity, final String productType, final String productId, Purchase purchase) {
        if (Intrinsics.wireman(productType, "subs")) {
            cord.f36653attabal.wireman(currentListener);
        } else {
            cord.f36653attabal.saneness(currentListener);
        }
        mCurrentProductId = productId;
        mCurrentProductType = productType;
        if (purchase != null) {
            if (Intrinsics.wireman(productType, "inapp")) {
                stratoscope(purchase, "old");
                return;
            } else {
                yemenite(purchase, "old");
                return;
            }
        }
        nestlike.wireman wiremanVar = nestlike.wireman.f33881attabal;
        wiremanVar.adultoid(merc(), productType);
        wiremanVar.arytenoidectomy(merc(), productType, productId);
        permissivist(productId, productType, new ProductDetailsResponseListener() { // from class: reuter.competently
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                molybdenite.starveling(productType, productId, activity, billingResult, list);
            }
        });
    }

    public final void cultivated(String productType, final PurchasesResponseListener listener) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BillingClient billingClient = mBillingClient;
        if (billingClient == null || billingClient.isReady()) {
            QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType(productType).build();
            Intrinsics.checkNotNullExpressionValue(queryPurchasesParamsBuild, "build(...)");
            BillingClient billingClient2 = mBillingClient;
            if (billingClient2 != null) {
                billingClient2.queryPurchasesAsync(queryPurchasesParamsBuild, new PurchasesResponseListener() { // from class: reuter.wireman
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                        molybdenite.premeiotic(listener, billingResult, list);
                    }
                });
            }
        }
    }

    public final void empress(boolean isShowToast, attabal callback) {
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            billingClient.startConnection(new beachfront(isShowToast, callback));
        }
    }

    public final void gintrap(Purchase purchase, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        AcknowledgePurchaseParams acknowledgePurchaseParamsBuild = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(acknowledgePurchaseParamsBuild, "build(...)");
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            billingClient.acknowledgePurchase(acknowledgePurchaseParamsBuild, acknowledgePurchaseResponseListener);
        }
    }

    public final void grimness(String productId, int responseCode, String debugMsg, String logStr, String toastStr) {
        cord.f36653attabal.attabal(currentListener, mCurrentProductType, productId, responseCode, debugMsg);
    }

    public final void hydrovane(final Activity activity, final String productType, final String productId) {
        nestlike.wireman.f33881attabal.molybdenite(merc(), productType);
        QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType(productType).build();
        Intrinsics.checkNotNullExpressionValue(queryPurchasesParamsBuild, "build(...)");
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(queryPurchasesParamsBuild, new magenta.marial(new PurchasesResponseListener() { // from class: reuter.formularize
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    molybdenite.walach(productId, activity, productType, billingResult, list);
                }
            }));
        }
    }

    public final void itchy(magenta.dern listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        payListeners.add(listener);
        currentListener = listener;
    }

    public final void kattegat(final Purchase purchase, final ProductDetails productDetails, final String purchaseType) {
        nestlike.wireman.f33881attabal.taiyuan(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(consumeParamsBuild, "build(...)");
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            billingClient.consumeAsync(consumeParamsBuild, new ConsumeResponseListener() { // from class: reuter.dern
                @Override // com.android.billingclient.api.ConsumeResponseListener
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    molybdenite.supplicat(productDetails, purchase, purchaseType, billingResult, str);
                }
            });
        }
    }

    public final void lotta(Application application2) {
        Intrinsics.checkNotNullParameter(application2, "<set-?>");
        application = application2;
    }

    public final void mathsort(Activity activity, String productType, String productId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            if (billingClient == null || billingClient.isReady()) {
                hydrovane(activity, productType, productId);
                return;
            } else {
                empress(true, new wireman(activity, productType, productId));
                return;
            }
        }
        Application application2 = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
        saran(application2, false);
        magenta.dern dernVar = currentListener;
        if (dernVar != null) {
            dernVar.beachfront(productType, productId);
        }
    }

    public final Application merc() {
        Application application2 = application;
        if (application2 != null) {
            return application2;
        }
        Intrinsics.preprohormone("application");
        return null;
    }

    public final void milliradian(final String productType) {
        nestlike.wireman.f33881attabal.molybdenite(merc(), productType);
        cultivated(productType, new PurchasesResponseListener() { // from class: reuter.kowloon
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                molybdenite.treadless(productType, billingResult, list);
            }
        });
    }

    public final void permissivist(String productId, String productType, ProductDetailsResponseListener listener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (StringsKt.empress(productId)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductId(productId).setProductType(productType).build();
        Intrinsics.checkNotNullExpressionValue(productBuild, "build(...)");
        arrayList.add(productBuild);
        QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductList(arrayList);
        BillingClient billingClient = mBillingClient;
        if (billingClient != null) {
            billingClient.queryProductDetailsAsync(builderNewBuilder.build(), listener);
        }
    }

    public final ExecutorService polder() {
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(2);
        }
        ExecutorService executorService2 = executorService;
        Intrinsics.beachfront(executorService2);
        return executorService2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final void privatdozent(Activity activity, String productType, ProductDetails productDetails) {
        BillingFlowParams.ProductDetailsParams productDetailsParamsBuild;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        mCurrentProductDetails = productDetails;
        if (Intrinsics.wireman(productType, "subs")) {
            BillingClient billingClient = mBillingClient;
            BillingResult billingResultIsFeatureSupported = billingClient != null ? billingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS) : null;
            if (billingResultIsFeatureSupported == null || billingResultIsFeatureSupported.getResponseCode() != 0) {
                nestlike.wireman.f33881attabal.impassible(merc(), productType, productDetails.getProductId(), 0, "sdk not support subscribe");
                magenta.dern dernVar = currentListener;
                if (dernVar != null) {
                    String debugMessage = billingResultIsFeatureSupported != null ? billingResultIsFeatureSupported.getDebugMessage() : null;
                    String productId = productDetails.getProductId();
                    Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
                    preprohormone.dern(dernVar, 6, debugMessage, productId, false, 8, null);
                    return;
                }
                return;
            }
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
            String offerToken = (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.lerp(subscriptionOfferDetails2)) == null) ? null : subscriptionOfferDetails.getOfferToken();
            if (offerToken != null) {
                productDetailsParamsBuild = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(offerToken).build();
            } else {
                productDetailsParamsBuild = null;
            }
        } else {
            productDetailsParamsBuild = null;
        }
        if (Intrinsics.wireman(productType, "inapp")) {
            productDetailsParamsBuild = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build();
        }
        if (productDetailsParamsBuild == null) {
            nestlike.wireman.f33881attabal.impassible(merc(), productType, productDetails.getProductId(), 0, "productDetailsParams is null");
            return;
        }
        BillingFlowParams billingFlowParamsBuild = BillingFlowParams.newBuilder().setProductDetailsParamsList(p002kotlin.collections.graveside.marial(productDetailsParamsBuild)).build();
        Intrinsics.checkNotNullExpressionValue(billingFlowParamsBuild, "build(...)");
        if (activity.isFinishing() || activity.isDestroyed()) {
            nestlike.wireman.f33881attabal.impassible(merc(), productType, productDetails.getProductId(), 0, "activity is finishing or destroyed");
            return;
        }
        BillingClient billingClient2 = mBillingClient;
        BillingResult billingResultLaunchBillingFlow = billingClient2 != null ? billingClient2.launchBillingFlow(activity, billingFlowParamsBuild) : null;
        if (billingResultLaunchBillingFlow == null) {
            nestlike.wireman.f33881attabal.impassible(merc(), productType, productDetails.getProductId(), 0, "billingResult is null");
            return;
        }
        if (billingResultLaunchBillingFlow.getResponseCode() == 0) {
            nestlike.wireman wiremanVar = nestlike.wireman.f33881attabal;
            Application applicationMerc = merc();
            String productType2 = productDetails.getProductType();
            Intrinsics.checkNotNullExpressionValue(productType2, "getProductType(...)");
            wiremanVar.triweekly(applicationMerc, productType2, productDetails.getProductId());
            return;
        }
        nestlike.wireman wiremanVar2 = nestlike.wireman.f33881attabal;
        Application applicationMerc2 = merc();
        String productType3 = productDetails.getProductType();
        Intrinsics.checkNotNullExpressionValue(productType3, "getProductType(...)");
        BillingResult billingResult = billingResultLaunchBillingFlow;
        wiremanVar2.impassible(applicationMerc2, productType3, productDetails.getProductId(), billingResult.getResponseCode(), billingResult.getDebugMessage());
    }

    public final void rotuma(final Purchase purchase, final String purchaseType) {
        nestlike.wireman.f33881attabal.attabal(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
        gintrap(purchase, new AcknowledgePurchaseResponseListener() { // from class: reuter.impassible
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                molybdenite.preprohormone(purchase, purchaseType, billingResult);
            }
        });
    }

    public final void saran(Application context, boolean showToast) {
        Intrinsics.checkNotNullParameter(context, "context");
        lotta(context);
        bally.attabal attabalVar = bally.attabal.f14909attabal;
        attabalVar.saneness(context);
        if (mBillingClient == null) {
            mBillingClient = BillingClient.newBuilder(context).setListener(purchasesUpdatedListener).enablePendingPurchases().build();
        }
        BillingClient billingClient = mBillingClient;
        if (billingClient != null && billingClient.isReady()) {
            timberyard(context);
            return;
        }
        empress(showToast, new dern(context));
        if (attabalVar.attabal().getOpenUpdateDate()) {
            adultoid.f36626attabal.formularize(context);
        }
    }

    public final void sayid(ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        executorService = executor;
    }

    public final ProductDetails seminary(BillingResult billingResult, List<ProductDetails> productDetailsList, String targetProductId, String targetProductType) {
        Object next;
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        List<ProductDetails> list = productDetailsList;
        if (list == null || list.isEmpty()) {
            cord.f36653attabal.attabal(currentListener, targetProductType, targetProductId, 6, debugMessage);
            return null;
        }
        if (responseCode != 0) {
            cord.f36653attabal.attabal(currentListener, targetProductType, targetProductId, 6, debugMessage);
            return null;
        }
        Iterator<T> it = productDetailsList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.wireman(((ProductDetails) next).getProductId(), targetProductId));
        ProductDetails productDetails = (ProductDetails) next;
        if (productDetails != null) {
            return productDetails;
        }
        cord.f36653attabal.attabal(currentListener, targetProductType, targetProductId, 6, debugMessage);
        return null;
    }

    public final Purchase splinterproof(List<? extends Purchase> purchases, String productId) {
        if (purchases == null) {
            return null;
        }
        for (Purchase purchase : purchases) {
            if (Intrinsics.wireman(purchase.getProducts().get(0), productId)) {
                return purchase;
            }
        }
        return null;
    }

    public final void stratoscope(final Purchase purchase, final String purchaseType) {
        int purchaseState = purchase.getPurchaseState();
        if (purchaseState == 1) {
            nestlike.wireman.f33881attabal.beachfront(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            Object objLerp = CollectionsKt.lerp(products);
            Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
            permissivist((String) objLerp, "inapp", new ProductDetailsResponseListener() { // from class: reuter.apical
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    molybdenite.trm(purchase, purchaseType, billingResult, list);
                }
            });
            return;
        }
        if (purchaseState == 2) {
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                List<String> products2 = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                Object objLerp2 = CollectionsKt.lerp(products2);
                Intrinsics.checkNotNullExpressionValue(objLerp2, "first(...)");
                dernVar.impromptu(6, "purchase state is pending", (String) objLerp2);
                return;
            }
            return;
        }
        magenta.dern dernVar2 = currentListener;
        if (dernVar2 != null) {
            String str = "purchase state is " + purchase.getPurchaseState();
            List<String> products3 = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products3, "getProducts(...)");
            Object objLerp3 = CollectionsKt.lerp(products3);
            Intrinsics.checkNotNullExpressionValue(objLerp3, "first(...)");
            dernVar2.impromptu(6, str, (String) objLerp3);
        }
        nestlike.wireman.f33881attabal.wireman(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), 0, "purchase state is " + purchase.getPurchaseState());
    }

    public final void timberyard(Context context) {
        milliradian("subs");
        milliradian("inapp");
        rotuma.f36709attabal.dern(context);
    }

    public final void yemenite(final Purchase purchase, final String purchaseType) {
        if (purchase.isAcknowledged()) {
            String strTaiyuan = babyless.beachfront.taiyuan("sp_iap_notify_status", "");
            Intrinsics.beachfront(strTaiyuan);
            if (strTaiyuan.length() > 0) {
                String str = purchase.getProducts().get(0);
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                permissivist(str, "subs", new ProductDetailsResponseListener() { // from class: reuter.cutely
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                        molybdenite.sealless(purchase, purchaseType, billingResult, list);
                    }
                });
                return;
            }
            magenta.dern dernVar = currentListener;
            if (dernVar != null) {
                List<String> products = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                Object objLerp = CollectionsKt.lerp(products);
                Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
                dernVar.saneness(6, "purchase has been acknowledged", (String) objLerp, true);
            }
            nestlike.wireman.f33881attabal.wireman(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), 0, "purchase has been acknowledged");
            return;
        }
        if (purchase.getPurchaseState() == 1) {
            nestlike.wireman.f33881attabal.beachfront(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
            rotuma(purchase, purchaseType);
            return;
        }
        if (purchase.getPurchaseState() == 2) {
            nestlike.wireman.f33881attabal.marial(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), purchaseType);
            magenta.dern dernVar2 = currentListener;
            if (dernVar2 != null) {
                List<String> products2 = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                Object objLerp2 = CollectionsKt.lerp(products2);
                Intrinsics.checkNotNullExpressionValue(objLerp2, "first(...)");
                dernVar2.impromptu(6, "purchase state is pending", (String) objLerp2);
                return;
            }
            return;
        }
        magenta.dern dernVar3 = currentListener;
        if (dernVar3 != null) {
            List<String> products3 = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products3, "getProducts(...)");
            Object objLerp3 = CollectionsKt.lerp(products3);
            Intrinsics.checkNotNullExpressionValue(objLerp3, "first(...)");
            preprohormone.dern(dernVar3, 6, "purchase state is not Purchase.PurchaseState.PURCHASED", (String) objLerp3, false, 8, null);
        }
        nestlike.wireman.f33881attabal.wireman(merc(), mCurrentProductType, mCurrentProductId, purchase.getPurchaseToken(), purchase.getOrderId(), 0, "purchase state is " + purchase.getPurchaseState());
    }
}
