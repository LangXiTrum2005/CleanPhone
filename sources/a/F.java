package A;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.C0942j;
import com.applovin.impl.C0945k0;
import com.applovin.impl.EnumC0940i;
import com.applovin.impl.d2;
import com.applovin.impl.e2;
import com.applovin.impl.f1;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.n2;
import com.applovin.impl.r1;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinAd;
import com.chartboost.sdk.ads.Ad;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.ump.FormError;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C3016f7;
import com.inmobi.media.C3040h;
import com.inmobi.media.C3224s8;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.Se;
import com.inmobi.media.Te;
import com.inmobi.media.Y6;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.p004ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.p004ironsource.bt;
import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.ts;
import com.p004ironsource.vs;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import java.io.File;
import java.util.Map;
import java.util.logging.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3136Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.X = i2;
        this.f3136Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.f3136Y;
        ?? r1 = this.f0;
        Object obj2 = this.e0;
        Object obj3 = this.Z;
        switch (this.X) {
            case 0:
                Se.b((C3040h) obj, (AdConfig) obj3, (Te) obj2, (InterfaceC3333z5) r1);
                break;
            case 1:
                C3016f7.a((C3016f7) obj, (Context) obj3, (String) obj2, (Y6) r1);
                break;
            case 2:
                C3224s8.a((String) obj, (C3224s8) obj3, (JSONObject) obj2, (String) r1);
                break;
            case 3:
                InMobiSdk.a((Context) obj, (SdkInitializationListener) obj3, (String) obj2, (JSONObject) r1);
                break;
            case 4:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) obj, (JSONObject) obj3, (NativeAdSmashListener) obj2, (String) r1);
                break;
            case 5:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj, (AdapterNativeAdData) obj3, (AdapterNativeAdViewBinder) obj2, (AdInfo) r1);
                break;
            case 6:
                ((com.smartdigimkt.k6.c) obj).b((com.smartdigimkt.g6.e) obj3, (String) obj2, (String) r1);
                break;
            case 7:
                ((com.smartdigimkt.k6.c) obj).b((WebView) obj3, (String) obj2, (String) r1);
                break;
            case 8:
                ((e2) obj).a((String) obj3, (d2) obj2, (JSONObject) r1);
                break;
            case 9:
                ((f1) obj).a((com.applovin.impl.adview.a) obj3, (Activity) obj2, (Uri) r1);
                break;
            case 10:
                ((f1) obj).a((AppLovinNativeAdImpl) obj3, (Activity) obj2, (Uri) r1);
                break;
            case 11:
                ((C0942j) obj).a((C0942j.b) obj3, (String) obj2, (String) r1);
                break;
            case 12:
                ((MaxFullscreenAdImpl) obj).a((Activity) obj3, (Context) obj2, (EnumC0940i) r1);
                break;
            case 13:
                ((MaxFullscreenAdImpl) obj).a((String) obj3, (String) obj2, (Activity) r1);
                break;
            case 14:
                ((n2) obj).a((ViewGroup) obj3, (Activity) obj2, (AppLovinFullscreenAdViewObserver) r1);
                break;
            case 15:
                ((com.applovin.impl.privacy.cmp.a) obj).a((FormError) obj3, (C0945k0) obj2, (com.applovin.impl.privacy.cmp.a.InterfaceC0037a) r1);
                break;
            case 16:
                ((r1) obj).a((String) obj3, (String) obj2, (Throwable) r1);
                break;
            case 17:
                ((EventServiceImpl) obj).b((String) obj3, (Map) obj2, (Map) r1);
                break;
            case 18:
                ((com.applovin.impl.sdk.c) obj).a((File) obj3, (com.applovin.impl.sdk.c.InterfaceC0040c) obj2, (com.applovin.impl.sdk.c.a) r1);
                break;
            case 19:
                ImageViewUtils.a((String) obj, (com.applovin.impl.sdk.k) obj3, (ImageView) obj2, (Uri) r1);
                break;
            case 20:
                t2.b((AppLovinAdViewEventListener) obj, (AppLovinAd) obj3, (AppLovinAdView) obj2, (AppLovinAdViewDisplayErrorCode) r1);
                break;
            case 21:
                bt.a((ts) obj, (Context) obj3, (vs) obj2, (Context) r1);
                break;
            case 22:
                VungleInitializer.m3199init$lambda2((VungleInitializer) obj, (Context) obj3, (String) obj2, r1);
                break;
            case 23:
                BaseAdLoader$assetDownloadListener$1.m3220onSuccess$lambda2((File) obj, (BaseAdLoader$assetDownloadListener$1) obj3, (DownloadRequest) obj2, (BaseAdLoader) r1);
                break;
            case 24:
                BaseAdLoader$assetDownloadListener$1.m3218onError$lambda1((DownloadRequest) obj, (BaseAdLoader) obj3, (BaseAdLoader$assetDownloadListener$1) obj2, (AssetDownloadListener.DownloadError) r1);
                break;
            case 25:
                com.chartboost.sdk.impl.d.a((Ad) obj, (com.chartboost.sdk.impl.d) obj3, (String) obj2, (String) r1);
                break;
            default:
                TransportContext transportContext = (TransportContext) obj3;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) obj2;
                EventInternal eventInternal = (EventInternal) r1;
                Logger logger = DefaultScheduler.f;
                DefaultScheduler defaultScheduler = (DefaultScheduler) obj;
                defaultScheduler.getClass();
                Logger logger2 = DefaultScheduler.f;
                try {
                    TransportBackend transportBackend = defaultScheduler.f16900c.get(transportContext.b());
                    if (transportBackend == null) {
                        String str = "Transport backend '" + transportContext.b() + "' is not registered";
                        logger2.warning(str);
                        transportScheduleCallback.a(new IllegalArgumentException(str));
                    } else {
                        defaultScheduler.f16901e.a(new androidx.media3.exoplayer.analytics.o(defaultScheduler, transportContext, transportBackend.a(eventInternal), 11));
                        transportScheduleCallback.a(null);
                    }
                } catch (Exception e2) {
                    logger2.warning("Error scheduling event " + e2.getMessage());
                    transportScheduleCallback.a(e2);
                    return;
                }
                break;
        }
    }
}
