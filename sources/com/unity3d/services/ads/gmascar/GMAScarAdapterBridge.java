package com.unity3d.services.ads.gmascar;

import android.app.Activity;
import android.content.Context;
import b2.w;
import com.unity3d.scar.adapter.common.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import go.k;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m0.s1;
import n5.i;
import ph.c;
import ph.d;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private e _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private e getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(b.f38577v, b.f38578w, b.f38579x, b.f38580y)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(c cVar) {
        this._scarAdapter.b(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.f48375e), this._gmaEventSender));
    }

    private void loadRewardedAd(c cVar) {
        this._scarAdapter.a(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.f48375e), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(List<d> list, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
            return;
        }
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        k kVar = (k) ((h) scarAdapterObject).f38582a;
        kVar.getClass();
        w wVar = new w((byte) 0, 10);
        s1 s1Var = new s1(17);
        for (d dVar : list) {
            wVar.d();
            kVar.L(applicationContext, dVar, wVar, s1Var);
        }
        i iVar = new i(2, biddingSignalsHandler, s1Var);
        wVar.f5411c = iVar;
        if (wVar.f5410b <= 0) {
            iVar.run();
        }
    }

    public void getSCARSignal(String str, d dVar) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        e eVar = this._scarAdapter;
        if (eVar == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.i) new a(b.f38566j, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        k kVar = (k) ((h) eVar).f38582a;
        kVar.getClass();
        w wVar = new w((byte) 0, 10);
        s1 s1Var = new s1(17);
        wVar.d();
        kVar.K(applicationContext, str, dVar, wVar, s1Var);
        i iVar = new i(2, signalsHandler, s1Var);
        wVar.f5411c = iVar;
        if (wVar.f5410b <= 0) {
            iVar.run();
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            e scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                return true;
            }
        }
        return false;
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(b.f38557a, new Object[0]);
            this._gmaInitializer.initializeGMA();
        } else {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.i) new a(b.f38558b, null, new Object[0]));
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z10, String str, String str2, String str3, String str4, int i10) {
        c cVar = new c(str, str2, str4, str3, Integer.valueOf(i10));
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.i) new a(b.f38569n, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
        } else if (z10) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void loadBanner(Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(this._gmaEventSender, str);
        e eVar = this._scarAdapter;
        if (eVar != null) {
            eVar.c(context, bannerView, cVar, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(String str, String str2) {
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.i) new a(b.f38573r, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
            return;
        }
        Activity activity = ClientProperties.getActivity();
        h hVar = (h) scarAdapterObject;
        ph.a aVar = (ph.a) ((ConcurrentHashMap) hVar.f38583b).get(str);
        if (aVar == null) {
            com.unity3d.scar.adapter.common.c cVar = (com.unity3d.scar.adapter.common.c) hVar.f38585d;
            String strO = defpackage.e.o("Could not find ad for placement '", str, "'.");
            cVar.handleError(new a(b.f38571p, strO, str, str2, strO));
        } else {
            hVar.f38584c = aVar;
            r9.b.y(new i0(hVar, false, activity, 2));
        }
    }

    public void getSCARBiddingSignals(boolean z10, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            e scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                Context applicationContext = ClientProperties.getApplicationContext();
                k kVar = (k) ((h) scarAdapterObject).f38582a;
                kVar.getClass();
                w wVar = new w((byte) 0, 10);
                s1 s1Var = new s1(17);
                wVar.d();
                kVar.L(applicationContext, d.f48377b, wVar, s1Var);
                wVar.d();
                kVar.L(applicationContext, d.f48378c, wVar, s1Var);
                if (z10) {
                    wVar.d();
                    kVar.L(applicationContext, d.f48379d, wVar, s1Var);
                }
                i iVar = new i(2, biddingSignalsHandler, s1Var);
                wVar.f5411c = iVar;
                if (wVar.f5410b <= 0) {
                    iVar.run();
                    return;
                }
                return;
            }
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }
}
