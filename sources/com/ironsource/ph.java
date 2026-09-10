package com.ironsource;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.core.webview.WebView;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30032d;

    public /* synthetic */ ph(Object obj, Object obj2, Object obj3, int i10) {
        this.f30029a = i10;
        this.f30030b = obj;
        this.f30031c = obj2;
        this.f30032d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = this.f30029a;
        wj.r rVar = wj.r.f53297a;
        boolean z10 = false;
        Object obj = this.f30032d;
        Object obj2 = this.f30031c;
        Object obj3 = this.f30030b;
        switch (i10) {
            case 0:
                B2.a((B2) obj3, (View) obj2, (FrameLayout.LayoutParams) obj);
                return;
            case 1:
                Be.d.a((Be) obj3, (C0520pe) obj2, (C0300d9) obj);
                return;
            case 2:
                Be.d.a((Be) obj3, (Context) obj2, (C0484ne) obj);
                return;
            case 3:
                Ce.a.a((InterfaceC0591te) obj3, (C0520pe) obj2, (C0300d9) obj);
                return;
            case 4:
                O9.a((C0520pe) obj3, (InitListener) obj2, (C0520pe) obj);
                return;
            case 5:
                O9.a((InitRequest) obj3, (Context) obj2, (InitListener) obj);
                return;
            case 6:
                S1.c.a((S1) obj3, (String) obj2, (S1.d) obj);
                return;
            case 7:
                W2.a.a((W2) obj3, (View) obj2, (View) obj);
                return;
            case 8:
                Ya.a((Ya) obj3, (LevelPlayAdError) obj2, (LevelPlayAdInfo) obj);
                return;
            case 9:
                Ya.a((Activity) obj3, (Ya) obj2, (String) obj);
                return;
            case 10:
                Ya.a((Ya) obj3, (LevelPlayReward) obj2, (LevelPlayAdInfo) obj);
                return;
            case 11:
                C0240a3.a((C0240a3) obj3, (K9) obj2, (C0353g8) obj);
                return;
            case 12:
                C0303dc.a((C0303dc) obj3, (AdapterNativeAdData) obj2, (AdapterNativeAdViewBinder) obj);
                return;
            case 13:
                C0365h2.a((C0365h2) obj3, (ImpressionDataListener) obj2, (W8) obj);
                return;
            case 14:
                ((com.ironsource.sdk.controller.v) obj3).a((Context) obj2, (CountDownLatch) obj);
                return;
            case 15:
                C0606ub.a((C0520pe) obj3, (LevelPlayInitListener) obj2, (C0520pe) obj);
                return;
            case 16:
                C0606ub.b((Context) obj3, (LevelPlayInitRequest) obj2, (LevelPlayInitListener) obj);
                return;
            case 17:
                C0606ub.a.a((LevelPlayInitListener) obj3, (C0350g5) obj2, (C0520pe) obj);
                return;
            case 18:
                ((com.mbridge.msdk.config.manager.a) obj3).a((Context) obj2, (String) obj);
                return;
            case 19:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) obj3, (String) obj2, (Throwable) obj);
                return;
            case 20:
                UnityAds.load$lambda$22$lambda$21$lambda$20((IUnityAdsLoadListener) obj3, (String) obj2, (Throwable) obj);
                return;
            case 21:
                ((LoadOperationState) obj3).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) obj2, (String) obj);
                return;
            case 22:
                ((IUnityAdsInitializationListener) obj3).onInitializationFailed((UnityAds.UnityAdsInitializationError) obj2, (String) obj);
                return;
            case 23:
                WebView.evaluateJavascript$lambda$1((WebView) obj3, (String) obj2, (ValueCallback) obj);
                return;
            case 24:
                String str2 = (String) obj3;
                cj.c cVar = (cj.c) obj2;
                ej.d dVar = (ej.d) obj;
                try {
                    zb.r rVar2 = vb.c.a().f52533a;
                    rVar2.f54750p.f3462a.a(new w1.b(7, rVar2, str2));
                    cVar.invoke(new wj.h(rVar));
                    return;
                } catch (Exception e10) {
                    dVar.getClass();
                    ej.d.a(cVar, e10);
                    return;
                }
            case 25:
                String str3 = (String) obj3;
                cj.c cVar2 = (cj.c) obj2;
                ej.d dVar2 = (ej.d) obj;
                try {
                    zb.r rVar3 = vb.c.a().f52533a;
                    rVar3.f54750p.f3462a.b(new zb.p(rVar3, System.currentTimeMillis() - rVar3.f54739d, str3));
                    cVar2.invoke(new wj.h(rVar));
                    return;
                } catch (Exception e11) {
                    dVar2.getClass();
                    ej.d.a(cVar2, e11);
                    return;
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                zc.t tVar = (zc.t) obj3;
                Context context = (Context) obj2;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj;
                HashMap map = FlutterFirebaseMessagingReceiver.f43402a;
                try {
                    if (tVar.m() != null) {
                        n5.f.p().A(tVar);
                    }
                    if (android.support.v4.media.session.a.w(context)) {
                        if (gj.h.l == null) {
                            gj.h.l = new gj.h();
                        }
                        gj.h.l.h(tVar);
                    } else {
                        Intent intent = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
                        Parcel parcelObtain = Parcel.obtain();
                        tVar.writeToParcel(parcelObtain, 0);
                        intent.putExtra("notification", parcelObtain.marshall());
                        Bundle bundle = tVar.f54874a;
                        String string = bundle.getString("google.original_priority");
                        if (string == null) {
                            string = bundle.getString("google.priority");
                        }
                        if (Constants.HIGH.equals(string)) {
                            z10 = true;
                        } else {
                            Constants.NORMAL.equals(string);
                        }
                        FlutterFirebaseMessagingBackgroundService.d(context, intent, z10);
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 27:
                String str4 = (String) obj3;
                cj.c cVar3 = (cj.c) obj2;
                hj.f fVar = (hj.f) obj;
                HashMap map2 = hj.f.f42368a;
                try {
                    bd.c.a().getClass();
                    Trace trace = new Trace(str4, ld.g.f45301s, new jj.d(23), cd.c.a(), GaugeManager.getInstance());
                    trace.start();
                    int i11 = hj.f.f42370c;
                    hj.f.f42370c = i11 + 1;
                    hj.f.f42369b.put(Integer.valueOf(i11), trace);
                    cVar3.invoke(new wj.h(Long.valueOf(i11)));
                    return;
                } catch (Exception e12) {
                    fVar.getClass();
                    hj.f.a(cVar3, e12);
                    return;
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                hj.i iVar = (hj.i) obj3;
                hj.b bVar = (hj.b) obj2;
                hj.f fVar2 = (hj.f) obj;
                HashMap map3 = hj.f.f42368a;
                try {
                    switch (iVar.f42381b.ordinal()) {
                        case 0:
                            str = "CONNECT";
                            break;
                        case 1:
                            str = "DELETE";
                            break;
                        case 2:
                            str = C0375hc.f28788a;
                            break;
                        case 3:
                            str = "HEAD";
                            break;
                        case 4:
                            str = "OPTIONS";
                            break;
                        case 5:
                            str = "PATCH";
                            break;
                        case 6:
                            str = C0375hc.f28789b;
                            break;
                        case 7:
                            str = "PUT";
                            break;
                        case 8:
                            str = "TRACE";
                            break;
                        default:
                            throw new aa.b((byte) 0, 20);
                    }
                    bd.c cVarA = bd.c.a();
                    String str5 = iVar.f42380a;
                    cVarA.getClass();
                    gd.e eVar = new gd.e(str5, str, ld.g.f45301s, new md.h());
                    md.h hVar = eVar.f41850b;
                    hVar.d();
                    eVar.f41849a.f(hVar.f45967a);
                    int i12 = hj.f.f42371d;
                    hj.f.f42371d = i12 + 1;
                    hj.f.f42368a.put(Integer.valueOf(i12), eVar);
                    bVar.invoke(new wj.h(Long.valueOf(i12)));
                    return;
                } catch (Exception e13) {
                    fVar2.getClass();
                    hj.f.a(bVar, e13);
                    return;
                }
            default:
                ((SessionManager) obj3).lambda$setApplicationContext$0((Context) obj2, (jd.a) obj);
                return;
        }
    }
}
