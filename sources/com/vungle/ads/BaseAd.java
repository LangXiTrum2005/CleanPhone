package com.vungle.ads;

import android.content.Context;
import com.p004ironsource.sv;
import com.p004ironsource.yq;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010E\u001a\u00020FH\u0016¢\u0006\u0002\u0010GJ\u0015\u0010H\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H ¢\u0006\u0002\bIJ\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0005H\u0016J\u0015\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020OH\u0010¢\u0006\u0002\bPJ\b\u0010Q\u001a\u00020KH\u0002J\u001d\u0010R\u001a\u00020K2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020UH\u0010¢\u0006\u0002\bVJ\u001f\u0010W\u001a\u00020K2\u0006\u0010S\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0002\bXR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0014\u0010,\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u001c\u0010.\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u0010 R\u0014\u00102\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0014\u00104\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0014\u00106\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0014\u00108\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u001b\u0010:\u001a\u00020;8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0010\u001a\u0004\b<\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006Y"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "context", "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adInternal", "Lcom/vungle/ads/internal/AdInternal;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/AdInternal;", "adInternal$delegate", "Lkotlin/Lazy;", "adListener", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "creativeId", "getCreativeId", "()Ljava/lang/String;", "displayToClickMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "getDisplayToClickMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "eventId", "getEventId", "leaveApplicationMetric", "Lcom/vungle/ads/SingleValueMetric;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/SingleValueMetric;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getPlacementId", "presentToDisplayMetric", "getPresentToDisplayMetric$vungle_ads_release", "requestToResponseMetric", "getRequestToResponseMetric$vungle_ads_release$annotations", "()V", "getRequestToResponseMetric$vungle_ads_release", "responseToShowMetric", "getResponseToShowMetric$vungle_ads_release", "rewardedMetric", "getRewardedMetric$vungle_ads_release", "showToCloseMetric", "getShowToCloseMetric$vungle_ads_release", "showToFailMetric", "getShowToFailMetric$vungle_ads_release", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "signaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignaledAd;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SignaledAd;)V", "canPlayAd", "", "()Ljava/lang/Boolean;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "load", "", "adMarkup", sv.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onLoadEnd", "onLoadFailure", "baseAd", "vungleError", "Lcom/vungle/ads/VungleError;", "onLoadFailure$vungle_ads_release", yq.f, "onLoadSuccess$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseAd implements Ad {
    private final AdConfig adConfig;

    /* JADX INFO: renamed from: adInternal$delegate, reason: from kotlin metadata */
    private final Lazy adInternal;
    private BaseAdListener adListener;
    private final Context context;
    private String creativeId;
    private final TimeIntervalMetric displayToClickMetric;
    private String eventId;
    private final SingleValueMetric leaveApplicationMetric;
    private final LogEntry logEntry;
    private final String placementId;
    private final TimeIntervalMetric presentToDisplayMetric;
    private final TimeIntervalMetric requestToResponseMetric;
    private final TimeIntervalMetric responseToShowMetric;
    private final SingleValueMetric rewardedMetric;
    private final TimeIntervalMetric showToCloseMetric;
    private final TimeIntervalMetric showToFailMetric;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;
    private SignaledAd signaledAd;

    public BaseAd(final Context context, String placementId, AdConfig adConfig) {
        Intrinsics.f(context, "context");
        Intrinsics.f(placementId, "placementId");
        Intrinsics.f(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = LazyKt.b(new Function0<AdInternal>() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AdInternal invoke() {
                BaseAd baseAd = this.this$0;
                AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry());
                return adInternalConstructAdInternal$vungle_ads_release;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = LazyKt.a(LazyThreadSafetyMode.X, new Function0<SignalManager>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
            }
        });
        LogEntry logEntry = new LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = logEntry;
        this.requestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }

    private final void onLoadEnd() throws Throwable {
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal.getX();
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    /* JADX INFO: renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    /* JADX INFO: renamed from: getRequestToResponseMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getRequestToResponseMetric() {
        return this.requestToResponseMetric;
    }

    /* JADX INFO: renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    /* JADX INFO: renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getRewardedMetric() {
        return this.rewardedMetric;
    }

    /* JADX INFO: renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    /* JADX INFO: renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToFailMetric() {
        return this.showToFailMetric;
    }

    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager.getX();
    }

    /* JADX INFO: renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final SignaledAd getSignaledAd() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public void load(final String adMarkup) throws Throwable {
        this.requestToResponseMetric.markStart();
        getAdInternal$vungle_ads_release().loadAd(this.placementId, adMarkup, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) throws Throwable {
                Intrinsics.f(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) throws Throwable {
                Intrinsics.f(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.f(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, final VungleError vungleError) throws Throwable {
        Intrinsics.f(baseAd, "baseAd");
        Intrinsics.f(vungleError, "vungleError");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3152invoke();
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3152invoke() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(this.this$0, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String adMarkup) throws Throwable {
        Intrinsics.f(baseAd, "baseAd");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3153invoke();
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3153invoke() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(this.this$0);
                }
            }
        });
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }
}
