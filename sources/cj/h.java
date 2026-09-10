package cj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.view.MotionEvent;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.UnfetchedProduct;
import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.impl.j5;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.UnityAdsMediationAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.Model;
import com.facebook.appevents.ml.ModelManager;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.unity3d.ads.IUnityAdsTokenListener;
import eb.a0;
import eb.b0;
import f2.c0;
import f2.i0;
import f2.j0;
import i1.k0;
import i1.p;
import i1.p0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.n;
import lj.f0;
import lj.h0;
import lj.m0;
import lj.n0;
import lj.q;
import lj.r;
import lj.w;
import lj.x;
import lj.y;
import m0.s1;
import tb.s;
import xi.o;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements OnCompleteListener, AppLovinSdk.SdkInitializationListener, s.a, OnUserEarnedRewardListener, IUnityAdsTokenListener, ViewIndexingTrigger.OnShakeListener, com.mbridge.msdk.config.component.load.downloader.database.c.a, ej.b, l1.g, ProductDetailsResponseListener, FileDownloadTask.Callback, tb.d, l1.l, l1.k, SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6450c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f6448a = i10;
        this.f6449b = obj;
        this.f6450c = obj2;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        ((com.mbridge.msdk.config.component.load.downloader.core.g) this.f6449b).a((CountDownLatch) this.f6450c, bVar);
    }

    @Override // l1.g
    public void accept(Object obj) {
        i0 i0Var = (i0) this.f6449b;
        ((j0) obj).v(i0Var.f40369a, i0Var.f40370b, (c2.g) this.f6450c);
    }

    @Override // s.a
    public Object apply(Object obj) {
        return ((com.applovin.impl.sdk.ad.b) this.f6449b).a((MotionEvent) this.f6450c, (j5) obj);
    }

    public void b(mj.g gVar) {
        mj.d dVar = (mj.d) this.f6449b;
        jj.f fVar = (jj.f) this.f6450c;
        if (dVar.f46107c.compareAndSet(true, false)) {
            fVar.d(gVar);
        }
    }

    public Object c(va.f fVar) {
        return ((a0) this.f6449b).a(fVar.a(), ((b0) this.f6450c).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    @Override // tb.d
    public Object g(s sVar) {
        String strValueOf;
        String str = (String) this.f6449b;
        i0.a aVar = (i0.a) this.f6450c;
        Context context = (Context) sVar.a(Context.class);
        switch (aVar.f42484a) {
            case 20:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                }
                break;
            case 21:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                }
                break;
            case 22:
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    strValueOf = "tv";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    strValueOf = "watch";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    strValueOf = "auto";
                } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    strValueOf = "";
                } else {
                    strValueOf = "embedded";
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    strValueOf = "";
                } else {
                    strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                }
                break;
        }
        return new od.a(str, strValueOf);
    }

    @Override // l1.k
    public void invoke(Object obj) {
        q1.a aVar = (q1.a) this.f6449b;
        c2.g gVar = (c2.g) this.f6450c;
        q1.i iVar = (q1.i) ((q1.b) obj);
        iVar.getClass();
        c0 c0Var = aVar.f48518d;
        if (c0Var == null) {
            return;
        }
        p pVar = (p) gVar.f5895f;
        pVar.getClass();
        int i10 = gVar.f5892c;
        q1.h hVar = iVar.f48556c;
        p0 p0Var = aVar.f48516b;
        c0Var.getClass();
        b2.p pVar2 = new b2.p(hVar.c(p0Var, c0Var), i10, 11, pVar);
        int i11 = gVar.f5891b;
        if (i11 != 0) {
            if (i11 == 1) {
                iVar.f48569q = pVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                iVar.f48570r = pVar2;
                return;
            }
        }
        iVar.f48568p = pVar2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f6448a) {
            case 0:
                m mVar = (m) this.f6449b;
                c cVar = (c) this.f6450c;
                n.f(task, "task");
                mVar.getClass();
                m.c(task, cVar);
                break;
            case 1:
                m mVar2 = (m) this.f6449b;
                c cVar2 = (c) this.f6450c;
                n.f(task, "task");
                mVar2.getClass();
                m.c(task, cVar2);
                break;
            case 2:
                m mVar3 = (m) this.f6449b;
                c cVar3 = (c) this.f6450c;
                n.f(task, "task");
                mVar3.getClass();
                m.b(task, cVar3);
                break;
            case 3:
                m mVar4 = (m) this.f6449b;
                c cVar4 = (c) this.f6450c;
                n.f(task, "task");
                mVar4.getClass();
                m.c(task, cVar4);
                break;
            case 4:
                m mVar5 = (m) this.f6449b;
                c cVar5 = (c) this.f6450c;
                n.f(task, "task");
                mVar5.getClass();
                m.c(task, cVar5);
                break;
            case 5:
                m mVar6 = (m) this.f6449b;
                c cVar6 = (c) this.f6450c;
                n.f(task, "task");
                mVar6.getClass();
                m.b(task, cVar6);
                break;
            case 6:
                m mVar7 = (m) this.f6449b;
                c cVar7 = (c) this.f6450c;
                n.f(task, "task");
                mVar7.getClass();
                m.c(task, cVar7);
                break;
            case 7:
                m mVar8 = (m) this.f6449b;
                c cVar8 = (c) this.f6450c;
                n.f(task, "task");
                mVar8.getClass();
                m.c(task, cVar8);
                break;
            case 8:
                m mVar9 = (m) this.f6449b;
                c cVar9 = (c) this.f6450c;
                n.f(task, "task");
                mVar9.getClass();
                m.c(task, cVar9);
                break;
            default:
                m mVar10 = (m) this.f6449b;
                c cVar10 = (c) this.f6450c;
                n.f(task, "task");
                mVar10.getClass();
                m.c(task, cVar10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        v vVar;
        List list;
        ?? arrayList;
        lj.s sVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        String str2;
        r rVar;
        lj.s sVar2;
        lj.i iVar = (lj.i) this.f6449b;
        hj.b bVar = (hj.b) this.f6450c;
        iVar.getClass();
        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
        if (productDetailsList != null) {
            for (ProductDetails productDetails : productDetailsList) {
                iVar.f45392f.put(productDetails.getProductId(), productDetails);
            }
        }
        q qVarA = n0.a(billingResult);
        List<ProductDetails> productDetailsList2 = queryProductDetailsResult.getProductDetailsList();
        v vVar2 = v.f53866a;
        if (productDetailsList2 != null) {
            List<ProductDetails> list2 = productDetailsList2;
            ArrayList arrayList4 = new ArrayList(xj.p.W(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ProductDetails detail = (ProductDetails) it.next();
                n.f(detail, "detail");
                String description = detail.getDescription();
                n.e(description, "getDescription(...)");
                String name = detail.getName();
                n.e(name, "getName(...)");
                String productId = detail.getProductId();
                n.e(productId, "getProductId(...)");
                String productType = detail.getProductType();
                n.e(productType, "getProductType(...)");
                boolean zEquals = productType.equals("inapp");
                y yVar = y.INAPP;
                if (!zEquals && productType.equals("subs")) {
                    yVar = y.SUBS;
                }
                y yVar2 = yVar;
                String title = detail.getTitle();
                n.e(title, "getTitle(...)");
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = detail.getOneTimePurchaseOfferDetails();
                Iterator it2 = it;
                String str3 = "getFormattedPrice(...)";
                if (oneTimePurchaseOfferDetails == null) {
                    sVar = null;
                } else {
                    long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
                    n.e(formattedPrice, "getFormattedPrice(...)");
                    String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    n.e(priceCurrencyCode, "getPriceCurrencyCode(...)");
                    sVar = new lj.s(priceAmountMicros, formattedPrice, priceCurrencyCode);
                }
                List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = detail.getOneTimePurchaseOfferDetailsList();
                if (oneTimePurchaseOfferDetailsList != null) {
                    arrayList2 = new ArrayList();
                    for (ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 : oneTimePurchaseOfferDetailsList) {
                        if (oneTimePurchaseOfferDetails2 == null) {
                            sVar2 = null;
                        } else {
                            long priceAmountMicros2 = oneTimePurchaseOfferDetails2.getPriceAmountMicros();
                            String formattedPrice2 = oneTimePurchaseOfferDetails2.getFormattedPrice();
                            n.e(formattedPrice2, "getFormattedPrice(...)");
                            String priceCurrencyCode2 = oneTimePurchaseOfferDetails2.getPriceCurrencyCode();
                            n.e(priceCurrencyCode2, "getPriceCurrencyCode(...)");
                            sVar2 = new lj.s(priceAmountMicros2, formattedPrice2, priceCurrencyCode2);
                        }
                        if (sVar2 != null) {
                            arrayList2.add(sVar2);
                        }
                        name = name;
                        productId = productId;
                        sVar = sVar;
                    }
                } else {
                    arrayList2 = null;
                }
                lj.s sVar3 = sVar;
                String str4 = name;
                String str5 = productId;
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = detail.getSubscriptionOfferDetails();
                if (subscriptionOfferDetails != null) {
                    List<ProductDetails.SubscriptionOfferDetails> list3 = subscriptionOfferDetails;
                    ArrayList arrayList5 = new ArrayList(xj.p.W(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) it3.next();
                        n.f(subscriptionOfferDetails2, "subscriptionOfferDetails");
                        String basePlanId = subscriptionOfferDetails2.getBasePlanId();
                        n.e(basePlanId, "getBasePlanId(...)");
                        String offerId = subscriptionOfferDetails2.getOfferId();
                        String offerToken = subscriptionOfferDetails2.getOfferToken();
                        n.e(offerToken, "getOfferToken(...)");
                        List<String> offerTags = subscriptionOfferDetails2.getOfferTags();
                        Iterator it4 = it3;
                        n.e(offerTags, "getOfferTags(...)");
                        ProductDetails.PricingPhases pricingPhases = subscriptionOfferDetails2.getPricingPhases();
                        ArrayList arrayList6 = arrayList2;
                        n.e(pricingPhases, "getPricingPhases(...)");
                        List<ProductDetails.PricingPhase> pricingPhaseList = pricingPhases.getPricingPhaseList();
                        n.e(pricingPhaseList, "getPricingPhaseList(...)");
                        List<ProductDetails.PricingPhase> list4 = pricingPhaseList;
                        ArrayList arrayList7 = new ArrayList(xj.p.W(list4, 10));
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) it5.next();
                            n.c(pricingPhase);
                            long billingCycleCount = pricingPhase.getBillingCycleCount();
                            Iterator it6 = it5;
                            int recurrenceMode = pricingPhase.getRecurrenceMode();
                            f0 f0Var = recurrenceMode != 1 ? recurrenceMode != 2 ? f0.NON_RECURRING : f0.FINITE_RECURRING : f0.INFINITE_RECURRING;
                            long priceAmountMicros3 = pricingPhase.getPriceAmountMicros();
                            String billingPeriod = pricingPhase.getBillingPeriod();
                            n.e(billingPeriod, "getBillingPeriod(...)");
                            String formattedPrice3 = pricingPhase.getFormattedPrice();
                            n.e(formattedPrice3, str3);
                            String priceCurrencyCode3 = pricingPhase.getPriceCurrencyCode();
                            n.e(priceCurrencyCode3, "getPriceCurrencyCode(...)");
                            arrayList7.add(new lj.v(billingCycleCount, f0Var, priceAmountMicros3, billingPeriod, formattedPrice3, priceCurrencyCode3));
                            it5 = it6;
                        }
                        ProductDetails.InstallmentPlanDetails installmentPlanDetails = subscriptionOfferDetails2.getInstallmentPlanDetails();
                        if (installmentPlanDetails == null) {
                            rVar = null;
                            str2 = basePlanId;
                            str = offerToken;
                        } else {
                            str = offerToken;
                            str2 = basePlanId;
                            rVar = new r(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount(), installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount());
                        }
                        arrayList5.add(new h0(str2, offerId, str, offerTags, arrayList7, rVar));
                        it3 = it4;
                        arrayList2 = arrayList6;
                        str3 = str3;
                    }
                    arrayList3 = arrayList5;
                } else {
                    arrayList3 = null;
                }
                arrayList4.add(new w(description, str4, str5, yVar2, title, sVar3, arrayList2, arrayList3));
                it = it2;
                vVar2 = vVar2;
            }
            vVar = vVar2;
            list = arrayList4;
        } else {
            vVar = vVar2;
            list = vVar;
        }
        List<UnfetchedProduct> unfetchedProductList = queryProductDetailsResult.getUnfetchedProductList();
        if (unfetchedProductList != null) {
            List<UnfetchedProduct> list5 = unfetchedProductList;
            arrayList = new ArrayList(xj.p.W(list5, 10));
            for (UnfetchedProduct unfetchedProduct : list5) {
                n.f(unfetchedProduct, "unfetchedProduct");
                String productId2 = unfetchedProduct.getProductId();
                n.e(productId2, "getProductId(...)");
                arrayList.add(new lj.i0(productId2));
            }
        } else {
            arrayList = vVar;
        }
        m0.a(new x(qVarA, list, arrayList), bVar);
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        ((AppLovinMAX) this.f6449b).lambda$initialize$0((o) this.f6450c, appLovinSdkConfiguration);
    }

    @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
    public void onShake() {
        CodelessManager.onActivityResumed$lambda$0((q7.r) this.f6449b, (String) this.f6450c);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        ((UnityAdsMediationAdapter) this.f6449b).lambda$collectSignal$0((MaxSignalCollectionListener) this.f6450c, str);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((GoogleMediationAdapter) this.f6449b).lambda$showRewardedAd$1((String) this.f6450c, rewardItem);
    }

    @Override // ej.b
    public InputStream open() throws IOException {
        InputStream inputStream = ((ZipFile) this.f6449b).getInputStream((ZipEntry) this.f6450c);
        n.e(inputStream, "getInputStream(...)");
        return inputStream;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        qd.b bVar = (qd.b) this.f6449b;
        qd.c cVar = (qd.c) this.f6450c;
        synchronized (bVar) {
            bVar.f48943c = Tasks.forResult(cVar);
        }
        return Tasks.forResult(cVar);
    }

    @Override // l1.l
    public void a(Object obj, i1.n nVar) {
        q1.i iVar = (q1.i) ((q1.b) obj);
        iVar.k((k0) this.f6450c, new s1(nVar, ((q1.f) this.f6449b).f48533e));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:169:0x001b, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:169:0x001b, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [qd.k] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v55, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        InputStream errorStream;
        ?? r10;
        ?? ValueOf;
        switch (this.f6448a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                qd.g gVar = (qd.g) this.f6449b;
                Date date = (Date) this.f6450c;
                gVar.getClass();
                if (task.isSuccessful()) {
                    qd.m mVar = gVar.f48971g;
                    synchronized (mVar.f49008b) {
                        mVar.f49007a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof pd.e) {
                            qd.m mVar2 = gVar.f48971g;
                            synchronized (mVar2.f49008b) {
                                mVar2.f49007a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            qd.m mVar3 = gVar.f48971g;
                            synchronized (mVar3.f49008b) {
                                mVar3.f49007a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            case 27:
                return ((qd.g) this.f6449b).b(task, 0L, (HashMap) this.f6450c);
            default:
                ?? r0 = (qd.k) this.f6449b;
                ?? inputStream = (Task) this.f6450c;
                p9.b bVar = r0.f49000p;
                boolean z10 = true;
                ?? r11 = 0;
                try {
                    try {
                        if (inputStream.isSuccessful()) {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.getResult();
                            r0.f48991f = httpURLConnection;
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                errorStream = r0.f48991f.getErrorStream();
                                try {
                                    int responseCode = r0.f48991f.getResponseCode();
                                    ValueOf = Integer.valueOf(responseCode);
                                    if (responseCode == 200) {
                                        try {
                                            synchronized (r0) {
                                                r0.f48988c = 8;
                                            }
                                            r0.f49001q.e(0, qd.m.f49006f);
                                            ln0 ln0VarJ = r0.j(r0.f48991f);
                                            r0.f48992g = ln0VarJ;
                                            ln0VarJ.d();
                                        } catch (IOException e10) {
                                            e = e10;
                                            if (r0.f48990e) {
                                                synchronized (r0) {
                                                    r0.f48988c = 8;
                                                }
                                            } else {
                                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                            }
                                            r0.b(inputStream, errorStream);
                                            synchronized (r0) {
                                                r0.f48987b = false;
                                            }
                                            if (r0.f48990e || (ValueOf != 0 && !qd.k.d(ValueOf.intValue()))) {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                bVar.getClass();
                                                r0.k(new Date(System.currentTimeMillis()));
                                            }
                                            if (!z10 || ValueOf.intValue() == 200) {
                                                r0.h();
                                            } else {
                                                String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                                if (ValueOf.intValue() == 403) {
                                                    strF = qd.k.f(r0.f48991f.getErrorStream());
                                                }
                                                new pd.f(ValueOf.intValue(), strF, 0);
                                            }
                                            r0.f48991f = null;
                                            r0.f48992g = null;
                                            return Tasks.forResult(null);
                                        }
                                    }
                                    r0.b(inputStream, errorStream);
                                    synchronized (r0) {
                                        r0.f48987b = false;
                                    }
                                    z10 = !r0.f48990e && qd.k.d(responseCode);
                                    if (z10) {
                                        bVar.getClass();
                                        r0.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z10 && responseCode != 200) {
                                        String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                        if (responseCode == 403) {
                                            strF2 = qd.k.f(r0.f48991f.getErrorStream());
                                        }
                                        new pd.f(responseCode, strF2, 0);
                                        r0.g();
                                    } else {
                                        r0.h();
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    ValueOf = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ValueOf = 0;
                                    r11 = inputStream;
                                    r10 = ValueOf;
                                    r0.b(r11, errorStream);
                                    synchronized (r0) {
                                        r0.f48987b = false;
                                        if (r0.f48990e || (r10 != 0 && !qd.k.d(r10.intValue()))) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            bVar.getClass();
                                            r0.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z10 && r10.intValue() != 200) {
                                            String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                            if (r10.intValue() == 403) {
                                                strF3 = qd.k.f(r0.f48991f.getErrorStream());
                                            }
                                            new pd.f(r10.intValue(), strF3, 0);
                                            r0.g();
                                        } else {
                                            r0.h();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (IOException e12) {
                                e = e12;
                                errorStream = null;
                                inputStream = inputStream;
                                ValueOf = errorStream;
                                if (r0.f48990e) {
                                    synchronized (r0) {
                                        r0.f48988c = 8;
                                    }
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                r0.b(inputStream, errorStream);
                                synchronized (r0) {
                                    r0.f48987b = false;
                                    if (r0.f48990e) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        bVar.getClass();
                                        r0.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z10) {
                                    }
                                    r0.h();
                                    r0.f48991f = null;
                                    r0.f48992g = null;
                                    return Tasks.forResult(null);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                errorStream = null;
                                ValueOf = 0;
                            }
                            r0.f48991f = null;
                            r0.f48992g = null;
                            return Tasks.forResult(null);
                        }
                        throw new IOException(inputStream.getException());
                    } catch (IOException e13) {
                        e = e13;
                        inputStream = 0;
                        errorStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        errorStream = null;
                        r10 = 0;
                        r0.b(r11, errorStream);
                        synchronized (r0) {
                            r0.f48987b = false;
                            if (r0.f48990e) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                bVar.getClass();
                                r0.k(new Date(System.currentTimeMillis()));
                            }
                            if (z10) {
                                r0.h();
                            } else {
                                r0.h();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public void onComplete(File file) {
        ModelManager.TaskHandler.Companion.execute$lambda$1$lambda$0((ModelManager.TaskHandler) this.f6449b, (Model) this.f6450c, file);
    }
}
