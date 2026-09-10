package com.thinkup.network.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.metadata.a;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceTUInitManager extends TUInitMediation {
    public static long mVideoAdLastShowTime = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42593n = "IronsourceTUInitManager";
    private static volatile IronsourceTUInitManager oo;
    private String mm;
    private List<MediationInitCallback> no;
    private final Object o0 = new Object();
    private volatile boolean mn = false;
    private volatile boolean n0 = false;
    ISDemandOnlyInterstitialListener o = new ISDemandOnlyInterstitialListener() { // from class: com.thinkup.network.ironsource.IronsourceTUInitManager.1
        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdClicked(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyClick();
            }
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdClosed(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyClose();
            }
            IronsourceTUInitManager.this.o("inter_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.m0.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ironSourceError.getErrorCode());
                ironsourceTUEventListener.notifyLoadFail(sb.toString(), ironSourceError.getErrorMessage());
            }
            IronsourceTUInitManager.this.oo("inter_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdOpened(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyPlayStart();
            }
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdReady(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.m0.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyLoaded();
            }
            IronsourceTUInitManager.this.oo("inter_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("inter_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ironSourceError.getErrorCode());
                ironsourceTUEventListener.notifyPlayFail(sb.toString(), ironSourceError.getErrorMessage());
            }
            IronsourceTUInitManager.this.o("inter_".concat(String.valueOf(str)));
        }
    };
    ISDemandOnlyRewardedVideoListener m = new ISDemandOnlyRewardedVideoListener() { // from class: com.thinkup.network.ironsource.IronsourceTUInitManager.2
        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdClicked(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyClick();
            }
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdClosed(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyPlayEnd();
                ironsourceTUEventListener.notifyClose();
            }
            IronsourceTUInitManager.this.o("rv_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.m0.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ironSourceError.getErrorCode());
                ironsourceTUEventListener.notifyLoadFail(sb.toString(), ironSourceError.getErrorMessage());
            }
            IronsourceTUInitManager.this.oo("rv_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdLoadSuccess(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.m0.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyLoaded();
            }
            IronsourceTUInitManager.this.oo("rv_".concat(String.valueOf(str)));
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdOpened(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyPlayStart();
            }
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdRewarded(String str) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                ironsourceTUEventListener.notifyReward();
            }
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public final void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
            IronsourceTUEventListener ironsourceTUEventListener = (IronsourceTUEventListener) IronsourceTUInitManager.this.on.get("rv_".concat(String.valueOf(str)));
            if (ironsourceTUEventListener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ironSourceError.getErrorCode());
                ironsourceTUEventListener.notifyPlayFail(sb.toString(), ironSourceError.getErrorMessage());
            }
            IronsourceTUInitManager.this.o("rv_".concat(String.valueOf(str)));
        }
    };
    private ConcurrentHashMap<String, IronsourceTUEventListener> on = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, IronsourceTUEventListener> m0 = new ConcurrentHashMap<>();
    private Set<String> mo = new HashSet();
    private Handler om = new Handler(Looper.getMainLooper());

    private IronsourceTUInitManager() {
    }

    public static IronsourceTUInitManager getInstance() {
        if (oo == null) {
            synchronized (IronsourceTUInitManager.class) {
                try {
                    if (oo == null) {
                        oo = new IronsourceTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void oo(String str) {
        this.m0.remove(str);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Ironsource";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.ironsource.mediationsdk.IronSource";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return IronsourceTUConst.getNetworkVersion();
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    public void loadInterstitial(Activity activity, String str, IronsourceTUEventListener ironsourceTUEventListener) {
        refreshInterstitialDelegate();
        m("inter_".concat(String.valueOf(str)), ironsourceTUEventListener);
        IronSource.loadISDemandOnlyInterstitial(activity, str);
    }

    public void loadRewardedVideo(Activity activity, String str, IronsourceTUEventListener ironsourceTUEventListener) {
        refreshRewardedVideoDelegate();
        m("rv_".concat(String.valueOf(str)), ironsourceTUEventListener);
        IronSource.loadISDemandOnlyRewardedVideo(activity, str);
    }

    public final boolean n(String str) {
        boolean zContains;
        synchronized (this.mo) {
            zContains = this.mo.contains(str);
        }
        return zContains;
    }

    public final void o0(String str) {
        synchronized (this.mo) {
            this.mo.remove(str);
        }
    }

    public synchronized void refreshInterstitialDelegate() {
        IronSource.setISDemandOnlyInterstitialListener(this.o);
    }

    public synchronized void refreshRewardedVideoDelegate() {
        IronSource.setISDemandOnlyRewardedVideoListener(this.m);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        IronSource.setConsent(z2);
        return true;
    }

    private synchronized void m(String str, IronsourceTUEventListener ironsourceTUEventListener) {
        this.m0.put(str, ironsourceTUEventListener);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_key");
        if (TextUtils.isEmpty(stringFromMap)) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail("app_key can not be empty.");
                return;
            }
            return;
        }
        if (this.mn && stringFromMap.equals(this.mm)) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        synchronized (this.o0) {
            try {
                if (this.mn && stringFromMap.equals(this.mm)) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                if (this.no == null) {
                    this.no = new ArrayList();
                }
                if (mediationInitCallback != null) {
                    this.no.add(mediationInitCallback);
                }
                if (this.n0) {
                    return;
                }
                this.n0 = true;
                try {
                    IronSource.setISDemandOnlyInterstitialListener(this.o);
                    IronSource.setISDemandOnlyRewardedVideoListener(this.m);
                    try {
                        if (TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch")) {
                            IronSource.setMetaData(a.f25958a, a.g);
                        }
                    } catch (Throwable unused) {
                    }
                    this.mm = stringFromMap;
                    IronSourceAds.init(context, new InitRequest.Builder(stringFromMap).withLegacyAdFormats(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED)).build(), new InitListener() { // from class: com.thinkup.network.ironsource.IronsourceTUInitManager.3
                        @Override // com.unity3d.ironsourceads.InitListener
                        public final void onInitFailed(IronSourceError ironSourceError) {
                            String str;
                            if (ironSourceError != null) {
                                str = ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage();
                            } else {
                                str = "";
                            }
                            IronsourceTUInitManager.this.o(false, str);
                        }

                        @Override // com.unity3d.ironsourceads.InitListener
                        public final void onInitSuccess() {
                            IronsourceTUInitManager.this.o(true, "");
                        }
                    });
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("init failed: ");
                    sb.append(th);
                    sb.append(":");
                    o(false, androidx.datastore.preferences.protobuf.a.o(th, sb));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(String str) {
        synchronized (this.mo) {
            this.mo.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z2, String str) {
        this.n0 = false;
        this.mn = z2;
        if (this.no != null) {
            synchronized (this.o0) {
                try {
                    for (MediationInitCallback mediationInitCallback : this.no) {
                        if (mediationInitCallback != null) {
                            if (z2) {
                                mediationInitCallback.onSuccess();
                            } else {
                                mediationInitCallback.onFail(str);
                            }
                        }
                    }
                    this.no.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void o(String str, IronsourceTUEventListener ironsourceTUEventListener) {
        this.on.put(str, ironsourceTUEventListener);
    }

    public final synchronized void o(String str) {
        this.on.remove(str);
    }

    private void o(Runnable runnable, long j) {
        this.om.postDelayed(runnable, j);
    }

    public final void o(final Context context, final Map<String, Object> map, final TUBidRequestInfoListener tUBidRequestInfoListener, final int i2) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.ironsource.IronsourceTUInitManager.4
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                IronsourceTUInitManager.this.runOnThreadPool(new Runnable() { // from class: com.thinkup.network.ironsource.IronsourceTUInitManager.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        IronsourceBidRequestInfo ironsourceBidRequestInfo = new IronsourceBidRequestInfo(context, map);
                        AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                        ironsourceBidRequestInfo.fillAdSize(context, map, i2);
                        if (ironsourceBidRequestInfo.isValid()) {
                            TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener2 != null) {
                                tUBidRequestInfoListener2.onSuccess(ironsourceBidRequestInfo);
                                return;
                            }
                            return;
                        }
                        TUBidRequestInfoListener tUBidRequestInfoListener3 = tUBidRequestInfoListener;
                        if (tUBidRequestInfoListener3 != null) {
                            tUBidRequestInfoListener3.onFailed(TUBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                        }
                    }
                });
            }
        });
    }
}
