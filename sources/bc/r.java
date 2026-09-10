package bc;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.f2;
import com.applovin.impl.g1;
import com.applovin.impl.g2;
import com.applovin.impl.m0;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.p2;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.v2;
import com.applovin.sdk.AppLovinAd;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.ump.FormError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.AbstractC0330f3;
import com.ironsource.Ca;
import com.ironsource.L2;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import org.json.JSONObject;
import tj.g0;
import tj.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5579e;

    public /* synthetic */ r(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.f5575a = i10;
        this.f5576b = str;
        this.f5577c = obj;
        this.f5578d = obj2;
        this.f5579e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterError flutterError;
        StackTraceElement stackTraceElement;
        switch (this.f5575a) {
            case 0:
                fc.f fVar = (fc.f) this.f5577c;
                String str = (String) this.f5576b;
                Map map = (Map) this.f5578d;
                List list = (List) this.f5579e;
                h hVar = (h) fVar.f40781c;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) fVar.f40786h;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.j(str, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                hVar.i(str, list);
                return;
            case 1:
                cj.m mVar = (cj.m) this.f5577c;
                String str2 = (String) this.f5576b;
                String str3 = (String) this.f5578d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5579e;
                try {
                    FirebaseAnalytics firebaseAnalytics = mVar.f6466a;
                    if (firebaseAnalytics == null) {
                        kotlin.jvm.internal.n.l("analytics");
                        throw null;
                    }
                    c8 c8Var = firebaseAnalytics.f24659a;
                    c8Var.getClass();
                    c8Var.c(new l7(c8Var, (String) null, str2, (Object) str3, false));
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 2:
                ((g1) this.f5577c).a((AppLovinNativeAdImpl) this.f5576b, (Activity) this.f5578d, (Uri) this.f5579e);
                return;
            case 3:
                ((g1) this.f5577c).a((com.applovin.impl.adview.a) this.f5576b, (Activity) this.f5578d, (Uri) this.f5579e);
                return;
            case 4:
                ((g2) this.f5577c).a((String) this.f5576b, (f2) this.f5578d, (JSONObject) this.f5579e);
                return;
            case 5:
                ((com.applovin.impl.j) this.f5577c).a((com.applovin.impl.j.b) this.f5578d, (String) this.f5576b, (String) this.f5579e);
                return;
            case 6:
                ((MaxFullscreenAdImpl) this.f5577c).a((Activity) this.f5576b, (Context) this.f5578d, (com.applovin.impl.i) this.f5579e);
                return;
            case 7:
                ((MaxFullscreenAdImpl) this.f5577c).a((String) this.f5576b, (String) this.f5578d, (Activity) this.f5579e);
                return;
            case 8:
                ((p2) this.f5577c).a((ViewGroup) this.f5576b, (Activity) this.f5578d, (AppLovinFullscreenAdViewObserver) this.f5579e);
                return;
            case 9:
                ((com.applovin.impl.privacy.cmp.a) this.f5577c).a((FormError) this.f5576b, (m0) this.f5578d, (com.applovin.impl.privacy.cmp.a.InterfaceC0014a) this.f5579e);
                return;
            case 10:
                ((s1) this.f5577c).a((String) this.f5576b, (String) this.f5578d, (Throwable) this.f5579e);
                return;
            case 11:
                ((EventServiceImpl) this.f5577c).b((String) this.f5576b, (Map) this.f5578d, (Map) this.f5579e);
                return;
            case 12:
                ((com.applovin.impl.sdk.d) this.f5577c).a((File) this.f5576b, (com.applovin.impl.sdk.d.c) this.f5578d, (com.applovin.impl.sdk.d.a) this.f5579e);
                return;
            case 13:
                ImageViewUtils.a((String) this.f5576b, (com.applovin.impl.sdk.l) this.f5577c, (ImageView) this.f5578d, (Uri) this.f5579e);
                return;
            case 14:
                v2.b((AppLovinAdViewEventListener) this.f5577c, (AppLovinAd) this.f5576b, (AppLovinAdView) this.f5578d, (AppLovinAdViewDisplayErrorCode) this.f5579e);
                return;
            case 15:
                InAppPurchaseBillingClientWrapperV2V4.querySkuDetailsAsync$lambda$1((InAppPurchaseBillingClientWrapperV2V4) this.f5577c, (Runnable) this.f5576b, (InAppPurchaseUtils.IAPProductType) this.f5578d, (List) this.f5579e);
                return;
            case 16:
                InAppPurchaseBillingClientWrapperV5V7.queryProductDetailsAsync$lambda$2((InAppPurchaseBillingClientWrapperV5V7) this.f5577c, (Runnable) this.f5576b, (InAppPurchaseUtils.IAPProductType) this.f5578d, (List) this.f5579e);
                return;
            case 17:
                Ca.a((Ca) this.f5577c, (L2) this.f5576b, (AbstractC0330f3) this.f5578d, (Long) this.f5579e);
                return;
            case 18:
                final String str4 = (String) this.f5576b;
                final String str5 = (String) this.f5577c;
                cj.c cVar = (cj.c) this.f5578d;
                ej.d dVar = (ej.d) this.f5579e;
                try {
                    final zb.r rVar = vb.c.a().f52533a;
                    final int i10 = 0;
                    rVar.f54750p.f3462a.a(new Runnable() { // from class: zb.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    String str6 = str4;
                                    String str7 = str5;
                                    l lVar = rVar.f54743h;
                                    lVar.getClass();
                                    try {
                                        ((bc.s) lVar.f54707d.f40783e).d(str6, str7);
                                        return;
                                    } catch (IllegalArgumentException e11) {
                                        Context context = lVar.f54704a;
                                        if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                            throw e11;
                                        }
                                        Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                                        return;
                                    }
                                default:
                                    rVar.f54743h.k(str4, str5);
                                    return;
                            }
                        }
                    });
                    cVar.invoke(new wj.h(wj.r.f53297a));
                    return;
                } catch (Exception e11) {
                    dVar.getClass();
                    ej.d.a(cVar, e11);
                    return;
                }
            case 19:
                fj.f fVar2 = (fj.f) this.f5577c;
                ej.d dVar2 = (ej.d) this.f5576b;
                cj.c cVar2 = (cj.c) this.f5578d;
                Handler handler = (Handler) this.f5579e;
                try {
                    vb.c cVarA = vb.c.a();
                    final zb.r rVar2 = cVarA.f52533a;
                    final String str6 = fVar2.f40964a;
                    String str7 = fVar2.f40966c;
                    String str8 = fVar2.f40965b;
                    boolean z10 = fVar2.f40967d;
                    final String str9 = fVar2.f40968e;
                    List list2 = fVar2.f40969f;
                    String str10 = dVar2.f40109c;
                    if (str10 != null) {
                        str9 = str10;
                    }
                    if (str9.length() > 0) {
                        final zb.r rVar3 = vb.c.a().f52533a;
                        final String str11 = "com.crashlytics.flutter.build-id.0";
                        final int i11 = 1;
                        rVar3.f54750p.f3462a.a(new Runnable() { // from class: zb.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        String str12 = str11;
                                        String str13 = str9;
                                        l lVar = rVar3.f54743h;
                                        lVar.getClass();
                                        try {
                                            ((bc.s) lVar.f54707d.f40783e).d(str12, str13);
                                            return;
                                        } catch (IllegalArgumentException e12) {
                                            Context context = lVar.f54704a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e12;
                                            }
                                            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                                            return;
                                        }
                                    default:
                                        rVar3.f54743h.k(str11, str9);
                                        return;
                                }
                            }
                        });
                    }
                    Iterator it = list2.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            xj.o.V();
                            throw null;
                        }
                        final String str12 = (String) next;
                        final zb.r rVar4 = vb.c.a().f52533a;
                        final String str13 = "com.crashlytics.flutter.build-id." + i13;
                        final int i14 = 1;
                        rVar4.f54750p.f3462a.a(new Runnable() { // from class: zb.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        String str14 = str13;
                                        String str15 = str12;
                                        l lVar = rVar4.f54743h;
                                        lVar.getClass();
                                        try {
                                            ((bc.s) lVar.f54707d.f40783e).d(str14, str15);
                                            return;
                                        } catch (IllegalArgumentException e12) {
                                            Context context = lVar.f54704a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e12;
                                            }
                                            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                                            return;
                                        }
                                    default:
                                        rVar4.f54743h.k(str13, str12);
                                        return;
                                }
                            }
                        });
                        it = it;
                        i12 = i13;
                    }
                    if (str7 != null) {
                        final String strConcat = "thrown ".concat(str7);
                        xi.g gVar = dVar2.f40108b;
                        if (gVar != null) {
                            handler.post(new com.unity3d.services.ads.operation.show.b(9, gVar, strConcat));
                        }
                        final String str14 = "flutter_error_reason";
                        final int i15 = 0;
                        rVar2.f54750p.f3462a.a(new Runnable() { // from class: zb.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        String str15 = str14;
                                        String str16 = strConcat;
                                        l lVar = rVar2.f54743h;
                                        lVar.getClass();
                                        try {
                                            ((bc.s) lVar.f54707d.f40783e).d(str15, str16);
                                            return;
                                        } catch (IllegalArgumentException e12) {
                                            Context context = lVar.f54704a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e12;
                                            }
                                            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                                            return;
                                        }
                                    default:
                                        rVar2.f54743h.k(str14, strConcat);
                                        return;
                                }
                            }
                        });
                        flutterError = new FlutterError(str6 + ". Error thrown " + str7 + ".");
                    } else {
                        flutterError = new FlutterError(str6);
                    }
                    final String str15 = "flutter_error_exception";
                    final int i16 = 0;
                    rVar2.f54750p.f3462a.a(new Runnable() { // from class: zb.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    String str16 = str15;
                                    String str17 = str6;
                                    l lVar = rVar2.f54743h;
                                    lVar.getClass();
                                    try {
                                        ((bc.s) lVar.f54707d.f40783e).d(str16, str17);
                                        return;
                                    } catch (IllegalArgumentException e12) {
                                        Context context = lVar.f54704a;
                                        if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                            throw e12;
                                        }
                                        Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                                        return;
                                    }
                                default:
                                    rVar2.f54743h.k(str15, str6);
                                    return;
                            }
                        }
                    });
                    List<fj.a> list3 = fVar2.f40970g;
                    ArrayList arrayList = new ArrayList();
                    for (fj.a aVar : list3) {
                        try {
                            String str16 = aVar.f40953a;
                            if (str16 == null) {
                                str16 = "";
                            }
                            stackTraceElement = new StackTraceElement(str16, aVar.f40954b, aVar.f40955c, Integer.parseInt(aVar.f40956d));
                        } catch (Exception unused) {
                            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
                            stackTraceElement = null;
                        }
                        if (stackTraceElement != null) {
                            arrayList.add(stackTraceElement);
                        }
                        break;
                    }
                    flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    if (str8.length() > 0) {
                        zb.r rVar5 = cVarA.f52533a;
                        rVar5.f54750p.f3462a.b(new zb.p(rVar5, System.currentTimeMillis() - rVar5.f54739d, str8));
                    }
                    if (z10) {
                        a.a.F(flutterError);
                    } else {
                        zb.r rVar6 = cVarA.f52533a;
                        Map map2 = Collections.EMPTY_MAP;
                        rVar6.f54750p.f3462a.a(new zb.n(rVar6, flutterError, 0));
                    }
                    cVar2.invoke(new wj.h(wj.r.f53297a));
                    return;
                } catch (Exception e12) {
                    dVar2.getClass();
                    ej.d.a(cVar2, e12);
                    return;
                }
            case 20:
                ((wi.j) this.f5577c).b((String) this.f5576b, (String) this.f5578d, this.f5579e);
                return;
            case 21:
                ViewOnClickListener.predictAndProcess$lambda$0((JSONObject) this.f5577c, (String) this.f5576b, (ViewOnClickListener) this.f5578d, (String) this.f5579e);
                return;
            case 22:
                s0 s0Var = (s0) this.f5577c;
                WebView viewArg = (WebView) this.f5576b;
                Message dontResendArg = (Message) this.f5578d;
                Message resendArg = (Message) this.f5579e;
                tj.l lVar = s0Var.f50905a;
                bh.a aVar2 = new bh.a(26);
                lVar.getClass();
                kotlin.jvm.internal.n.f(viewArg, "viewArg");
                kotlin.jvm.internal.n.f(dontResendArg, "dontResendArg");
                kotlin.jvm.internal.n.f(resendArg, "resendArg");
                nf nfVar = lVar.f50859a;
                nfVar.getClass();
                if (!((tj.c) nfVar.f23783c).d(s0Var)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", nfVar.e(), (Object) null).y(xj.o.Q(s0Var, viewArg, dontResendArg, resendArg), new g0(aVar2, 12));
                    return;
                }
            case 23:
                s0 s0Var2 = (s0) this.f5577c;
                WebView viewArg2 = (WebView) this.f5576b;
                SslErrorHandler handlerArg = (SslErrorHandler) this.f5578d;
                SslError errorArg = (SslError) this.f5579e;
                tj.l lVar2 = s0Var2.f50905a;
                bh.a aVar3 = new bh.a(26);
                lVar2.getClass();
                kotlin.jvm.internal.n.f(viewArg2, "viewArg");
                kotlin.jvm.internal.n.f(handlerArg, "handlerArg");
                kotlin.jvm.internal.n.f(errorArg, "errorArg");
                nf nfVar2 = lVar2.f50859a;
                nfVar2.getClass();
                if (!((tj.c) nfVar2.f23783c).d(s0Var2)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar2.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", nfVar2.e(), (Object) null).y(xj.o.Q(s0Var2, viewArg2, handlerArg, errorArg), new g0(aVar3, 13));
                    return;
                }
            case 24:
                s0 s0Var3 = (s0) this.f5577c;
                WebView webViewArg = (WebView) this.f5576b;
                WebResourceRequest requestArg = (WebResourceRequest) this.f5578d;
                WebResourceError errorArg2 = (WebResourceError) this.f5579e;
                tj.l lVar3 = s0Var3.f50905a;
                bh.a aVar4 = new bh.a(26);
                lVar3.getClass();
                kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
                kotlin.jvm.internal.n.f(requestArg, "requestArg");
                kotlin.jvm.internal.n.f(errorArg2, "errorArg");
                nf nfVar3 = lVar3.f50859a;
                nfVar3.getClass();
                if (!((tj.c) nfVar3.f23783c).d(s0Var3)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar3.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", nfVar3.e(), (Object) null).y(xj.o.Q(s0Var3, webViewArg, requestArg, errorArg2), new g0(aVar4, 9));
                    return;
                }
            case 25:
                s0 s0Var4 = (s0) this.f5577c;
                WebView webViewArg2 = (WebView) this.f5576b;
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f5578d;
                WebResourceResponse responseArg = (WebResourceResponse) this.f5579e;
                tj.l lVar4 = s0Var4.f50905a;
                bh.a aVar5 = new bh.a(26);
                lVar4.getClass();
                kotlin.jvm.internal.n.f(webViewArg2, "webViewArg");
                kotlin.jvm.internal.n.f(requestArg2, "requestArg");
                kotlin.jvm.internal.n.f(responseArg, "responseArg");
                nf nfVar4 = lVar4.f50859a;
                nfVar4.getClass();
                if (!((tj.c) nfVar4.f23783c).d(s0Var4)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar4.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", nfVar4.e(), (Object) null).y(xj.o.Q(s0Var4, webViewArg2, requestArg2, responseArg), new g0(aVar5, 2));
                    return;
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) this.f5577c, (JSONObject) this.f5578d, (NativeAdSmashListener) this.f5579e, (String) this.f5576b);
                return;
            case 27:
                w8.a aVar6 = (w8.a) this.f5577c;
                r8.i iVar = (r8.i) this.f5576b;
                String str17 = iVar.f49489a;
                o8.g gVar2 = (o8.g) this.f5578d;
                r8.h hVar2 = (r8.h) this.f5579e;
                aVar6.getClass();
                Logger logger = w8.a.f52994f;
                try {
                    s8.e eVarA = aVar6.f52997c.a(str17);
                    if (eVarA == null) {
                        String str18 = "Transport backend '" + str17 + "' is not registered";
                        logger.warning(str18);
                        gVar2.a(new IllegalArgumentException(str18));
                    } else {
                        ((y8.h) aVar6.f52999e).o(new ac.a(aVar6, iVar, ((p8.b) eVarA).a(hVar2), 13));
                        gVar2.a(null);
                    }
                    return;
                } catch (Exception e13) {
                    logger.warning("Error scheduling event " + e13.getMessage());
                    gVar2.a(e13);
                    return;
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f5577c, (AdapterNativeAdData) this.f5576b, (AdapterNativeAdViewBinder) this.f5578d, (AdInfo) this.f5579e);
                return;
            default:
                ((wi.j) ((wi.j) this.f5577c).f53247b).b((String) this.f5576b, (String) this.f5578d, this.f5579e);
                return;
        }
    }

    public /* synthetic */ r(com.applovin.impl.j jVar, com.applovin.impl.j.b bVar, String str, String str2) {
        this.f5575a = 5;
        this.f5577c = jVar;
        this.f5578d = bVar;
        this.f5576b = str;
        this.f5579e = str2;
    }

    public /* synthetic */ r(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        this.f5575a = 26;
        this.f5577c = ironSourceNativeAdAdapter;
        this.f5578d = jSONObject;
        this.f5579e = nativeAdSmashListener;
        this.f5576b = str;
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5575a = i10;
        this.f5577c = obj;
        this.f5576b = obj2;
        this.f5578d = obj3;
        this.f5579e = obj4;
    }
}
