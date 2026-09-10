package com.unity3d.services.banners.bridge;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import m0.s0;
import org.json.JSONObject;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010 \u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0019H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010\u0018J\u0019\u0010&\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b&\u0010\u0018J\u0019\u0010'\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010\u0018J\u0019\u0010(\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010\u0018J\u0019\u0010)\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b)\u0010\u0018J\u0019\u0010*\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b*\u0010\u0018¨\u0006,"}, d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge;", "", "<init>", "()V", "", "placementId", "bannerAdId", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lwj/r;", "load", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/banners/UnityBannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;)V", "Lcom/unity3d/services/banners/BannerView;", "bannerAdView", "onBannerLoaded", "(Lcom/unity3d/services/banners/BannerView;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;)V", "Lorg/json/JSONObject;", "data", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "(Lorg/json/JSONObject;)Z", "destroy", "(Ljava/lang/String;)V", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.RIGHT, "bottom", "", "alpha", "resize", "(Ljava/lang/String;IIIIF)V", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "visibilityChanged", "(Ljava/lang/String;I)V", "didLoad", "didDestroy", "didAttach", "didDetach", "didAttachScarBanner", "didDetachScarBanner", "BannerEvent", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BannerBridge {
    public static final BannerBridge INSTANCE = new BannerBridge();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "", "(Ljava/lang/String;I)V", "BANNER_VISIBILITY_CHANGED", "BANNER_RESIZED", "BANNER_LOADED", "BANNER_DESTROYED", "BANNER_ATTACHED", "BANNER_DETACHED", "BANNER_LOAD_PLACEMENT", "BANNER_DESTROY_BANNER", "SCAR_BANNER_LOADED", "SCAR_BANNER_LOAD_FAILED", "SCAR_BANNER_ATTACHED", "SCAR_BANNER_DETACHED", "SCAR_BANNER_OPENED", "SCAR_BANNER_CLOSED", "SCAR_BANNER_IMPRESSION", "SCAR_BANNER_CLICKED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    private BannerBridge() {
    }

    public static final void destroy(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, bannerAdId);
        }
    }

    public static final void didAttach(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, bannerAdId);
        }
    }

    public static final void didAttachScarBanner(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, bannerAdId);
        }
    }

    public static final void didDestroy(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, bannerAdId);
        }
    }

    public static final void didDetach(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, bannerAdId);
        }
    }

    public static final void didDetachScarBanner(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, bannerAdId);
        }
    }

    public static final void didLoad(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, bannerAdId);
        }
    }

    private final boolean isHeaderBidding(JSONObject data) {
        if (data == null) {
            return false;
        }
        return data.has("adMarkup");
    }

    public static final void load(final String placementId, final String bannerAdId, UnityBannerSize bannerSize, final UnityAdsLoadOptions loadOptions) {
        n.f(loadOptions, "loadOptions");
        final SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        final Map mapP = b0.P(new f("is_header_bidding", String.valueOf(INSTANCE.isHeaderBidding(loadOptions.getData()))));
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(bannerAdId);
        IServiceProvider iServiceProvider = null;
        byte b10 = 0;
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_load_not_found", null, mapP));
            return;
        }
        final boolean zInvoke = ((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke();
        int i10 = 1;
        boolean z10 = loadOptions.getObjectId() != null;
        if (zInvoke && !z10) {
            loadOptions.setObjectId(bannerAdId);
        }
        final BannerView.IListener listener = bannerView.getListener();
        if (zInvoke) {
            new UnityAdsSDK(iServiceProvider, i10, b10 == true ? 1 : 0).load(placementId, loadOptions, new InternalLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    n.f(error, "error");
                    BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                    if (bannerView2 == null || bannerView2.getListener() == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, mapP));
                    } else {
                        bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error));
                    }
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    n.f(adObject, "adObject");
                    BannerBridge bannerBridge = BannerBridge.INSTANCE;
                    BannerView bannerAdView = bannerView;
                    n.e(bannerAdView, "bannerAdView");
                    bannerBridge.onBannerLoaded(bannerAdView, bannerAdId, placementId, loadOptions);
                }
            }, bannerSize);
        } else {
            LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(placementId, bannerAdId, bannerSize, new IUnityAdsLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$2
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    if (listener == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", null, mapP));
                    }
                    if (zInvoke) {
                        BannerBridge bannerBridge = BannerBridge.INSTANCE;
                        BannerView bannerAdView = bannerView;
                        n.e(bannerAdView, "bannerAdView");
                        bannerBridge.onBannerLoaded(bannerAdView, bannerAdId, placementId2, loadOptions);
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    n.f(error, "error");
                    BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                    if (bannerView2 == null || bannerView2.getListener() == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, mapP));
                    } else {
                        bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error, message));
                    }
                }
            }, loadOptions, new ConfigurationReader().getCurrentConfiguration()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerLoaded(BannerView bannerAdView, final String bannerAdId, final String placementId, final UnityAdsLoadOptions loadOptions) {
        final BannerView bannerView;
        final BannerView.IListener listener = bannerAdView.getListener();
        final BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView2 == null) {
            if (listener != null) {
                listener.onBannerFailedToLoad(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = s0.f45746a;
        if (bannerView2.isAttachedToWindow()) {
            if (BannerViewCache.getInstance().getBannerView(bannerAdId) != null) {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(loadOptions.getObjectId());
                LoadConfigurationInternal loadConfigurationInternal = loadOptions.loadConfiguration;
                IServiceProvider iServiceProvider = null;
                byte b10 = 0;
                if (loadConfigurationInternal != null) {
                    unityAdsShowOptions.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                }
                new UnityAdsSDK(iServiceProvider, 1, b10 == true ? 1 : 0).show(placementId, unityAdsShowOptions, new BannerBridge$onBannerLoaded$1$2(listener, bannerAdView));
            } else if (listener instanceof BannerShowListenerWithOnFailedToShow) {
                ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
            }
            bannerView = bannerAdView;
        } else {
            bannerView = bannerAdView;
            bannerView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$onBannerLoaded$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    n.f(view, "view");
                    bannerView2.removeOnAttachStateChangeListener(this);
                    if (BannerViewCache.getInstance().getBannerView(bannerAdId) == null) {
                        BannerView.IListener iListener = listener;
                        if (iListener instanceof BannerShowListenerWithOnFailedToShow) {
                            n.d(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
                            ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                            return;
                        }
                        return;
                    }
                    UnityAdsShowOptions unityAdsShowOptions2 = new UnityAdsShowOptions();
                    unityAdsShowOptions2.setObjectId(loadOptions.getObjectId());
                    IServiceProvider iServiceProvider2 = null;
                    byte b11 = 0;
                    if (loadOptions.loadConfiguration != null) {
                        unityAdsShowOptions2.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                    }
                    new UnityAdsSDK(iServiceProvider2, 1, b11 == true ? 1 : 0).show(placementId, unityAdsShowOptions2, new BannerBridge$onBannerLoaded$1$2(listener, bannerView));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    n.f(view, "view");
                }
            });
        }
        if (listener != null) {
            listener.onBannerLoaded(bannerView);
        }
    }

    public static final void resize(String bannerAdId, int left, int top, int right, int bottom, float alpha) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, bannerAdId, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom), Float.valueOf(alpha));
        }
    }

    public static final void visibilityChanged(String bannerAdId, int visibility) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, bannerAdId, Integer.valueOf(visibility));
        }
    }
}
