package com.vungle.ads.internal.presenter;

import A.O;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u0000 92\u00020\u0001:\u00019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u000fH\u0002J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010%H\u0002J\u0006\u0010)\u001a\u00020\"J\u0012\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J\u0006\u0010,\u001a\u00020\"J\u001a\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020%2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010%J\u0010\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u00010\u0011J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\u000e\u00104\u001a\u00020\"2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020%H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006:²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "", "context", "Landroid/content/Context;", "delegate", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "(Landroid/content/Context;Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "Ljava/lang/Long;", "adViewed", "", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "currentDialog", "Landroid/app/Dialog;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "Lkotlin/Lazy;", "omTracker", "Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "detach", "", "initOMTracker", "omSdkData", "", "needShowGdpr", "onDownload", "ctaUrl", "onImpression", "onPrivacy", "privacyUrl", "prepare", "processCommand", "action", "value", "setEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showGdpr", "start", "startTracking", "rootView", "Landroid/view/View;", "triggerEventMetricForTpat", "key", "Companion", "vungle-ads_release", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdPresenter {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final AdPayload advertisement;
    private AdEventListener bus;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final Lazy logEntry;
    private NativeOMTracker omTracker;
    private final Platform platform;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final Lazy tpatSender;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = MapsKt.j(new Pair(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), new Pair(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter$Companion;", "", "()V", "DOWNLOAD", "", "OPEN_PRIVACY", "TAG", "TPAT", "VIDEO_VIEWED", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return NativeAdPresenter.eventMap;
        }

        private Companion() {
        }
    }

    public NativeAdPresenter(final Context context, NativePresenterDelegate delegate, AdPayload adPayload, Platform platform) {
        Intrinsics.f(context, "context");
        Intrinsics.f(delegate, "delegate");
        Intrinsics.f(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = adPayload;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.tpatSender = LazyKt.a(LazyThreadSafetyMode.X, new Function0<TpatSender>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        this.logEntry = LazyKt.b(new Function0<LogEntry>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$logEntry$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LogEntry invoke() {
                AdPayload adPayload2 = this.this$0.advertisement;
                if (adPayload2 != null) {
                    return adPayload2.getLogEntry();
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getX();
    }

    /* JADX INFO: renamed from: initOMTracker$lambda-10, reason: not valid java name */
    private static final OMInjector m3240initOMTracker$lambda10(Lazy<OMInjector> lazy) {
        return (OMInjector) lazy.getX();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && "unknown".equals(PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String ctaUrl) {
        AdEventListener adEventListener;
        AdPayload.AdUnit adUnit;
        AdPayload adPayload = this.advertisement;
        final String deeplinkUrl = null;
        List tpatUrls$default = adPayload != null ? AdPayload.getTpatUrls$default(adPayload, Constants.CLICK_URL, null, null, 6, null) : null;
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        } else {
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.CLICK_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
            }
        }
        if (ctaUrl != null) {
            TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder(ctaUrl).tpatKey(Constants.CTA_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
        }
        AdPayload adPayload2 = this.advertisement;
        if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
            deeplinkUrl = adUnit.getDeeplinkUrl();
        }
        boolean zLaunch = ExternalRouter.launch(deeplinkUrl, ctaUrl, this.context, getLogEntry(), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean opened) {
                if (!opened) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                AdPayload adPayload3 = this.advertisement;
                List tpatUrls$default2 = adPayload3 != null ? AdPayload.getTpatUrls$default(adPayload3, Constants.DEEPLINK_CLICK, String.valueOf(opened), null, 4, null) : null;
                if (tpatUrls$default2 != null) {
                    NativeAdPresenter nativeAdPresenter = this;
                    Iterator it2 = tpatUrls$default2.iterator();
                    while (it2.hasNext()) {
                        TpatSender.sendTpat$default(nativeAdPresenter.getTpatSender(), new TpatRequest.Builder((String) it2.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        });
        AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext(MRAIDPresenter.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
    }

    private final void onPrivacy(String privacyUrl) throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (privacyUrl != null) {
            if (!FileUtility.INSTANCE.isValidUrl(privacyUrl)) {
                new PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!ExternalRouter.launch$default(null, privacyUrl, this.context, getLogEntry(), null, 16, null)) {
                new PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        nativeAdPresenter.processCommand(str, str2);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            Logger.INSTANCE.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        O o = new O(this, 3);
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, o);
        builder.setNegativeButton(gDPRButtonDeny, o);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m3242showGdpr$lambda9(this.X, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m3241showGdpr$lambda8(NativeAdPresenter this$0, DialogInterface dialogInterface, int i2) {
        String value;
        Intrinsics.f(this$0, "this$0");
        if (i2 != -2) {
            value = i2 != -1 ? "opted_out_by_timeout" : PrivacyConsent.OPT_IN.getValue();
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m3242showGdpr$lambda9(NativeAdPresenter this$0, DialogInterface dialogInterface) {
        Intrinsics.f(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    private final void triggerEventMetricForTpat(String key) throws Throwable {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(key);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l2 = this.adStartTime;
        if (l2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l2.longValue();
            AdPayload adPayload = this.advertisement;
            if (adPayload != null && (tpatUrls = adPayload.getTpatUrls(Constants.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()))) != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.END, null, this.delegate.getPlacementRefId());
        }
    }

    public final void initOMTracker(String omSdkData) {
        Intrinsics.f(omSdkData, "omSdkData");
        AdPayload adPayload = this.advertisement;
        boolean zOmEnabled = adPayload != null ? adPayload.omEnabled() : false;
        if (omSdkData.length() <= 0 || !zOmEnabled) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        String oMSDKJS$vungle_ads_release = m3240initOMTracker$lambda10(LazyKt.a(LazyThreadSafetyMode.X, new Function0<OMInjector>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$initOMTracker$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OMInjector invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
            }
        })).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            this.omTracker = new NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release);
        }
    }

    public final void onImpression() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void processCommand(String action, String value) throws Throwable {
        String str;
        List<String> tpatUrls$default;
        Intrinsics.f(action, "action");
        switch (action.hashCode()) {
            case -511324706:
                if (action.equals("openPrivacy")) {
                    onPrivacy(value);
                    return;
                }
                break;
            case 3566511:
                if (action.equals("tpat")) {
                    if (value == null || value.length() == 0) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    triggerEventMetricForTpat(value);
                    if (Intrinsics.a(value, Constants.CHECKPOINT_0)) {
                        AdPayload adPayload = this.advertisement;
                        if (adPayload != null) {
                            tpatUrls$default = adPayload.getTpatUrls(value, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                            str = value;
                        } else {
                            str = value;
                            tpatUrls$default = null;
                        }
                    } else {
                        AdPayload adPayload2 = this.advertisement;
                        if (adPayload2 != null) {
                            str = value;
                            tpatUrls$default = AdPayload.getTpatUrls$default(adPayload2, str, null, null, 6, null);
                        } else {
                            str = value;
                            tpatUrls$default = null;
                        }
                    }
                    List<String> list = tpatUrls$default;
                    if (list == null || list.isEmpty()) {
                        new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, android.support.v4.media.a.C("Empty urls for tpat: ", str)).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    Iterator<T> it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(str).withLogEntry(getLogEntry()).build(), false, 2, null);
                    }
                    return;
                }
                break;
            case 1118284383:
                if (action.equals(VIDEO_VIEWED)) {
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener == null || this.adViewed) {
                        return;
                    }
                    this.adViewed = true;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                    }
                    List<String> impressionUrls = this.delegate.getImpressionUrls();
                    if (impressionUrls != null) {
                        Iterator<T> it2 = impressionUrls.iterator();
                        while (it2.hasNext()) {
                            TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it2.next()).tpatKey("impression").withLogEntry(getLogEntry()).build(), false, 2, null);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 1427818632:
                if (action.equals(DOWNLOAD)) {
                    onDownload(value);
                    return;
                }
                break;
        }
        Logger.INSTANCE.w(TAG, "Unknown native ad action: ".concat(action));
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void startTracking(View rootView) {
        Intrinsics.f(rootView, "rootView");
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.start(rootView);
        }
    }
}
