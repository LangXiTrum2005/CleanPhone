package com.unity3d.services.ads.gmascar;

import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import java.util.List;
import ph.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class GMA {
    private static GMA instance;
    private final GMAScarAdapterBridge _gmaScarAdapterBridge;

    private GMA(GMAEventSender gMAEventSender) {
        this._gmaScarAdapterBridge = new GMAScarAdapterBridge(new MobileAdsBridgeFactory().createMobileAdsBridge(), new InitializeListenerBridge(), new InitializationStatusBridge(), new AdapterStatusBridge(), new WebViewErrorHandler(gMAEventSender), new ScarAdapterFactory(), gMAEventSender);
    }

    public static GMA getInstance() {
        return getInstance(new GMAEventSender());
    }

    public GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public void getSCARBiddingSignals(boolean z10, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z10, new BiddingSignalsHandler(z10, iBiddingSignalsListener));
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    public static GMA getInstance(GMAEventSender gMAEventSender) {
        if (instance == null) {
            instance = new GMA(gMAEventSender);
        }
        return instance;
    }

    public void getSCARBiddingSignals(List<d> list, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(list, new BiddingSignalsHandler(list.contains(d.f48379d), iBiddingSignalsListener));
    }
}
