package com.vungle.ads.internal.load;

import android.content.Context;
import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.p004ironsource.d9;
import com.p004ironsource.sv;
import com.smartdigimkt.o1.b;
import com.startapp.sdk.internal.C;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u0000 c2\u00020\u0001:\u0001cB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010D\u001a\u00020EJ\b\u0010F\u001a\u00020EH\u0002J\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0013H\u0002J\u0010\u0010L\u001a\u00020M2\u0006\u0010K\u001a\u00020\u0013H\u0002J\u0012\u0010N\u001a\u0004\u0018\u00010J2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001dH\u0002J\u0012\u0010R\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u001dH\u0002J!\u0010S\u001a\u00020E2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010T\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020EH\u0002J\u000e\u0010W\u001a\u00020E2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010X\u001a\u00020E2\u0006\u0010Y\u001a\u00020PJ\b\u0010Z\u001a\u00020EH&J\b\u0010[\u001a\u00020EH\u0002J\u0010\u0010\\\u001a\u00020E2\u0006\u0010]\u001a\u00020\u000fH\u0003J\b\u0010^\u001a\u00020EH\u0002J\u001a\u0010_\u001a\u00020H2\u0006\u0010`\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010a\u001a\u00020EH$J\u0012\u0010b\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u001dH\u0002R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006d²\u0006\n\u0010e\u001a\u00020fX\u008a\u0084\u0002²\u0006\n\u0010g\u001a\u00020hX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/BaseAdLoader;", "", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "adAssets", "", "Lcom/vungle/ads/internal/model/AdAsset;", "adLoaderCallback", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "adOptionalDownloadDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "adPreloadToReadyDurationMetric", "getAdRequest", "()Lcom/vungle/ads/internal/load/AdRequest;", "adRequiredDownloadDurationMetric", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "assetDownloadDurationMetric", "assetDownloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getAssetDownloadListener", "()Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getContext", "()Landroid/content/Context;", "downloadCount", "Ljava/util/concurrent/atomic/AtomicLong;", "downloadRequiredAssets", "", "", "fullyDownloaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loadStart", "", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "mainVideoSizeMetric", "Lcom/vungle/ads/SingleValueMetric;", "notifyFailed", "notifySuccess", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "requiredAssetDownloaded", "getSdkExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "templateHtmlSizeMetric", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", b.P3, "", "downloadAssets", "fileIsValid", "", d9.h.f24719b, "Ljava/io/File;", "adAsset", "getAssetPriority", "Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "getDestinationDir", "getErrorInfo", "Lcom/vungle/ads/VungleError;", "adPayload", "getTemplateError", "handleAdMetaData", "metric", "handleAdMetaData$vungle_ads_release", "injectOMSDKIfNeeded", "loadAd", sv.f27214b, "error", "onAdLoadReady", sv.f27213a, "onDownloadCompleted", "request", "onRequiredDownloadCompleted", "processVmTemplate", "asset", "requestAd", "validateAdMetadata", "Companion", "vungle-ads_release", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseAdLoader {
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<AdAsset> adAssets;
    private AdLoaderCallback adLoaderCallback;
    private TimeIntervalMetric adOptionalDownloadDurationMetric;
    private TimeIntervalMetric adPreloadToReadyDurationMetric;
    private final AdRequest adRequest;
    private TimeIntervalMetric adRequiredDownloadDurationMetric;
    private AdPayload advertisement;
    private TimeIntervalMetric assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final Set<String> downloadRequiredAssets;
    private final Downloader downloader;
    private AtomicBoolean fullyDownloaded;
    private long loadStart;
    private LogEntry logEntry;
    private SingleValueMetric mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final OMInjector omInjector;
    private final PathProvider pathProvider;
    private AtomicBoolean requiredAssetDownloaded;
    private final Executors sdkExecutors;
    private SingleValueMetric templateHtmlSizeMetric;
    private final VungleApiClient vungleApiClient;

    public BaseAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        Intrinsics.f(context, "context");
        Intrinsics.f(vungleApiClient, "vungleApiClient");
        Intrinsics.f(sdkExecutors, "sdkExecutors");
        Intrinsics.f(omInjector, "omInjector");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(pathProvider, "pathProvider");
        Intrinsics.f(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.getIsRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        return adAsset.getIsRequired() ? DownloadRequest.Priority.CRITICAL : DownloadRequest.Priority.HIGHEST;
    }

    private final File getDestinationDir(AdPayload advertisement) {
        return this.pathProvider.getDownloadsDirForAd(advertisement.eventId());
    }

    private final VungleError getErrorInfo(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        Integer errorCode = adUnit != null ? adUnit.getErrorCode() : null;
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (adUnit3 != null ? adUnit3.getInfo() : null);
        if ((errorCode == null || errorCode.intValue() != 10001) && ((errorCode == null || errorCode.intValue() != 10002) && ((errorCode == null || errorCode.intValue() != 20001) && ((errorCode == null || errorCode.intValue() != 30001) && (errorCode == null || errorCode.intValue() != 30002))))) {
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        Sdk.SDKError.Reason reasonForNumber = Sdk.SDKError.Reason.forNumber(errorCode.intValue());
        Intrinsics.e(reasonForNumber, "forNumber(errorCode)");
        return new AdPayloadError(reasonForNumber, str);
    }

    private final VungleError getTemplateError(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        AdPayload.TemplateSettings templateSettings = adUnit != null ? adUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AssetRequestError("Missing template settings");
        }
        Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!adPayload.isNativeTemplateType()) {
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            String vmURL = adUnit2 != null ? adUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!Utils.INSTANCE.isUrlValid(vmURL)) {
                return new AssetRequestError(a.C("Failed to load vm url: ", vmURL));
            }
        } else if (cacheableReplacements != null) {
            AdPayload.CacheableReplacement cacheableReplacement = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE);
            if ((cacheableReplacement != null ? cacheableReplacement.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null main image.");
            }
            AdPayload.CacheableReplacement cacheableReplacement2 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement2 != null ? cacheableReplacement2.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, AdPayload.CacheableReplacement>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError(a.C("Invalid asset URL ", url));
                }
                if (!Utils.INSTANCE.isUrlValid(url)) {
                    return new AssetRequestError(a.C("Invalid asset URL ", url));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: handleAdMetaData$lambda-4, reason: not valid java name */
    private static final TpatSender m3215handleAdMetaData$lambda4(Lazy<TpatSender> lazy) {
        return (TpatSender) lazy.getX();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(BaseAdLoader baseAdLoader, AdPayload adPayload, SingleValueMetric singleValueMetric, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i2 & 2) != 0) {
            singleValueMetric = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(adPayload, singleValueMetric);
    }

    private final void injectOMSDKIfNeeded() {
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || !adPayload.omEnabled()) {
            return;
        }
        try {
            this.omInjector.init();
            this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "Failed to inject OMSDK: " + e2.getMessage());
            new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, Z.m(e2, new StringBuilder("Failed to inject OMSDK: "))).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m3216loadAd$lambda0(BaseAdLoader this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.requestAd();
    }

    private final void onAdReady() {
        final AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (adPayload.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(adPayload.getIndexFilePath());
            Logger.INSTANCE.w(TAG, "start preloading");
            WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, adPayload, this.adRequest.getPlacement(), strValueOf, adPayload.getWebViewSettings(), new PreloadDelegate() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$1$1
                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdFailedToPlay() throws Throwable {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                    Logger.INSTANCE.e("BaseAdLoader", "fail to load ad");
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }

                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdReadyToPlay() throws Throwable {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }
            }, Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onSuccess(adPayload);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        m3217onAdReady$lambda2$lambda1(LazyKt.a(LazyThreadSafetyMode.X, new Function0<JobRunner>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$lambda-2$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final JobRunner invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
            }
        })).execute(ResendTpatJob.INSTANCE.makeJobInfo());
    }

    /* JADX INFO: renamed from: onAdReady$lambda-2$lambda-1, reason: not valid java name */
    private static final JobRunner m3217onAdReady$lambda2$lambda1(Lazy<? extends JobRunner> lazy) {
        return (JobRunner) lazy.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDownloadCompleted(AdRequest request) throws Throwable {
        Logger.INSTANCE.d(TAG, "All download completed " + request);
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() throws Throwable {
        this.adRequiredDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(AdAsset asset, AdPayload advertisement) {
        if (advertisement == null || asset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS || asset.getLocalPath().length() == 0 || !fileIsValid(new File(asset.getLocalPath()), asset)) {
            return false;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            Logger.INSTANCE.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        FileUtility.printDirectoryTree(destinationDir);
        return true;
    }

    private final VungleError validateAdMetadata(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null && adUnit.getSleep() != null) {
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        AdPayload adPayload2 = this.advertisement;
        if (!Intrinsics.a(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            StringBuilder sb = new StringBuilder("Waterfall request and responses placement don't match ");
            AdPayload adPayload3 = this.advertisement;
            return new PlacementMismatchError(androidx.media3.extractor.text.ttml.a.p(sb, adPayload3 != null ? adPayload3.placementId() : null, '.'));
        }
        VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (!adPayload.hasExpired()) {
            String strEventId = adPayload.eventId();
            if (strEventId == null || strEventId.length() == 0) {
                return new InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("The ad markup has expired for playback. Ad expiry: ");
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        sb2.append(adUnit2 != null ? adUnit2.getExpiry() : null);
        sb2.append(", device: ");
        sb2.append(System.currentTimeMillis());
        return new AdExpiredError(sb2.toString());
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    /* JADX INFO: renamed from: getAdvertisement$vungle_ads_release, reason: from getter */
    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(AdPayload advertisement, SingleValueMetric metric) {
        List<String> loadAdUrls;
        Intrinsics.f(advertisement, "advertisement");
        this.advertisement = advertisement;
        advertisement.recordExpiryWindowStart();
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setEventId$vungle_ads_release(advertisement.eventId());
        }
        LogEntry logEntry2 = this.logEntry;
        if (logEntry2 != null) {
            logEntry2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        LogEntry logEntry3 = this.logEntry;
        if (logEntry3 != null) {
            logEntry3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        LogEntry logEntry4 = this.logEntry;
        if (logEntry4 != null) {
            logEntry4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        LogEntry logEntry5 = this.logEntry;
        if (logEntry5 != null) {
            logEntry5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        LogEntry logEntry6 = this.logEntry;
        if (logEntry6 != null) {
            logEntry6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        LogEntry logEntry7 = this.logEntry;
        if (logEntry7 != null) {
            logEntry7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        ConfigPayload config = advertisement.getConfig();
        if (config != null) {
            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, config, false, metric);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError(a.l(destinationDir, "Invalid directory. ")).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.X, new Function0<TpatSender>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$1
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
        AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m3215handleAdMetaData$lambda4(lazyA), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(AdLoaderCallback adLoaderCallback) {
        Intrinsics.f(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBACKGROUND_EXECUTOR().execute(new C(this, 14));
    }

    public final void onAdLoadFailed(VungleError error) {
        AdLoaderCallback adLoaderCallback;
        Intrinsics.f(error, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (adLoaderCallback = this.adLoaderCallback) == null) {
            return;
        }
        adLoaderCallback.onFailure(error);
    }

    public abstract void onAdLoadReady();

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }
}
