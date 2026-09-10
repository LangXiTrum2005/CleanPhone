package com.unity3d.ads;

import ak.f;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.BannerAd$Companion$load$1", f = "BannerAd.kt", l = {}, m = "invokeSuspend")
public final class BannerAd$Companion$load$1 extends i implements jk.c {
    final /* synthetic */ BannerConfiguration $configuration;
    final /* synthetic */ LoadListener<BannerAd> $listener;
    int label;

    /* JADX INFO: renamed from: com.unity3d.ads.BannerAd$Companion$load$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"com/unity3d/ads/BannerAd$Companion$load$1$2", "Lcom/unity3d/services/banners/BannerView$IListener;", "Lcom/unity3d/ads/BannerShowListenerWithOnFailedToShow;", "Lcom/unity3d/services/banners/BannerView;", "bannerAdView", "Lwj/r;", "onBannerLoaded", "(Lcom/unity3d/services/banners/BannerView;)V", "Lcom/unity3d/services/banners/BannerErrorInfo;", "errorInfo", "onBannerFailedToLoad", "(Lcom/unity3d/services/banners/BannerView;Lcom/unity3d/services/banners/BannerErrorInfo;)V", "onBannerClick", "onBannerLeftApplication", "onBannerFailedToShow", "onBannerShown", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass2 implements BannerView.IListener, BannerShowListenerWithOnFailedToShow {
        final /* synthetic */ AtomicReference<BannerAd> $bannerAdRef;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ BannerConfiguration $configuration;
        final /* synthetic */ LoadListener<BannerAd> $listener;
        final /* synthetic */ UUID $opportunityId;

        public AnonymousClass2(UUID uuid, LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, BannerView bannerView, AtomicReference<BannerAd> atomicReference) {
            this.$opportunityId = uuid;
            this.$listener = loadListener;
            this.$configuration = bannerConfiguration;
            this.$bannerView = bannerView;
            this.$bannerAdRef = atomicReference;
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerAdView) {
            n.f(bannerAdView, "bannerAdView");
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onClicked(bannerAd);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerAdView, BannerErrorInfo errorInfo) {
            n.f(bannerAdView, "bannerAdView");
            n.f(errorInfo, "errorInfo");
            LoadListener<BannerAd> loadListener = this.$listener;
            int i10 = errorInfo.publicErrorCode;
            String str = errorInfo.errorMessage;
            if (str == null) {
                str = "Failed to load banner ad for placement: " + bannerAdView.getPlacementId() + '.';
            }
            loadListener.onAdLoaded(null, new UnityAdsError(i10, str));
        }

        @Override // com.unity3d.ads.BannerShowListenerWithOnFailedToShow
        public void onBannerFailedToShow(BannerView bannerAdView, BannerErrorInfo errorInfo) {
            n.f(bannerAdView, "bannerAdView");
            n.f(errorInfo, "errorInfo");
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                BannerShowListener listener = this.$configuration.getListener();
                int i10 = errorInfo.publicErrorCode;
                String str = errorInfo.errorMessage;
                n.e(str, "errorInfo.errorMessage");
                listener.onFailedToShow(bannerAd, new UnityAdsError(i10, str));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerAdView) {
            n.f(bannerAdView, "bannerAdView");
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerAdView) {
            n.f(bannerAdView, "bannerAdView");
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            IServicesRegistry registry = serviceProvider.getRegistry();
            e0 e0Var = d0.f44761a;
            AdRepository adRepository = (AdRepository) registry.resolveService(new ServiceKey(null, e0Var.b(AdRepository.class), 1, null));
            SafeCallbackInvoke safeCallbackInvoke = (SafeCallbackInvoke) serviceProvider.getRegistry().resolveService(new ServiceKey(null, e0Var.b(SafeCallbackInvoke.class), 1, null));
            UUID opportunityId = this.$opportunityId;
            n.e(opportunityId, "opportunityId");
            AdObject ad2 = adRepository.getAd(ProtobufExtensionsKt.toByteString(opportunityId));
            if (ad2 != null) {
                BannerAd bannerAd = new BannerAd(ad2, this.$bannerView, safeCallbackInvoke);
                this.$bannerAdRef.set(bannerAd);
                this.$listener.onAdLoaded(bannerAd, null);
            } else {
                this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId()));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerAdView) {
            n.f(bannerAdView, "bannerAdView");
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onImpression(bannerAd);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$Companion$load$1(LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, f fVar) {
        super(2, fVar);
        this.$listener = loadListener;
        this.$configuration = bannerConfiguration;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new BannerAd$Companion$load$1(this.$listener, this.$configuration, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((BannerAd$Companion$load$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        Context applicationContext = ClientProperties.getApplicationContext();
        r rVar = r.f53297a;
        if (applicationContext == null) {
            this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId() + ". Verify that Unity Ads has been initialized."));
            return rVar;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        BannerConfiguration bannerConfiguration = this.$configuration;
        unityAdsLoadOptions.setObjectId(uuidRandomUUID.toString());
        unityAdsLoadOptions.setAdMarkup(bannerConfiguration.getAdMarkup());
        unityAdsLoadOptions.loadConfiguration = new LoadConfigurationInternal(bannerConfiguration.getPlacementId(), bannerConfiguration.getAdMarkup(), bannerConfiguration.getMediationAdUnitId(), bannerConfiguration.getMediationInfo(), bannerConfiguration.getExtras());
        if (!this.$configuration.getExtras().isEmpty()) {
            MetaData metaData = new MetaData(applicationContext);
            for (Map.Entry<String, String> entry : this.$configuration.getExtras().entrySet()) {
                metaData.set(entry.getKey(), entry.getValue());
            }
            metaData.commit();
        }
        AtomicReference atomicReference = new AtomicReference(null);
        BannerView bannerView = new BannerView(applicationContext, this.$configuration.getPlacementId(), new UnityBannerSize(this.$configuration.getBannerSize().getWidth(), this.$configuration.getBannerSize().getHeight()));
        bannerView.setListener(new AnonymousClass2(uuidRandomUUID, this.$listener, this.$configuration, bannerView, atomicReference));
        bannerView.load(unityAdsLoadOptions);
        return rVar;
    }
}
