package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3325e9 {
    public static final Z8 Companion = new Z8(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<C2955a1> adAssets;
    private R1 adLoaderCallback;
    private C5115yc0 adOptionalDownloadDurationMetric;
    private final F2 adRequest;
    private C5115yc0 adRequiredDownloadDurationMetric;
    private C4980x2 advertisement;
    private C5115yc0 assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final AtomicLong downloadRequiredCount;
    private final InterfaceC2526Jp downloader;
    private AtomicBoolean fullyDownloaded;
    private C4126nJ logEntry;
    private C3586h70 mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final C3080bS omInjector;
    private final ZT pathProvider;
    private AtomicBoolean requiredAssetDownloaded;
    private final InterfaceC4615ss sdkExecutors;
    private C3586h70 templateHtmlSizeMetric;
    private C3586h70 templateSizeMetric;
    private final VungleApiClient vungleApiClient;

    public AbstractC3325e9(Context context, VungleApiClient vungleApiClient, InterfaceC4615ss interfaceC4615ss, C3080bS c3080bS, InterfaceC2526Jp interfaceC2526Jp, ZT zt, F2 f2) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(vungleApiClient, "vungleApiClient");
        AbstractC2995aW.q(interfaceC4615ss, "sdkExecutors");
        AbstractC2995aW.q(c3080bS, "omInjector");
        AbstractC2995aW.q(interfaceC2526Jp, "downloader");
        AbstractC2995aW.q(zt, "pathProvider");
        AbstractC2995aW.q(f2, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = interfaceC4615ss;
        this.omInjector = c3080bS;
        this.downloader = interfaceC2526Jp;
        this.pathProvider = zt;
        this.adRequest = f2;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.mainVideoSizeMetric = new C3586h70(B30.ASSET_FILE_SIZE);
        this.templateSizeMetric = new C3586h70(B30.TEMPLATE_ZIP_SIZE);
        this.templateHtmlSizeMetric = new C3586h70(B30.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new C5115yc0(B30.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new C5115yc0(B30.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new C5115yc0(B30.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AtomicLong atomicLong = this.downloadRequiredCount;
        List<C2955a1> list = this.adAssets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C2955a1) obj).isRequired()) {
                arrayList.add(obj);
            }
        }
        atomicLong.set(arrayList.size());
        for (C2955a1 c2955a1 : this.adAssets) {
            C2474Hp c2474Hp = new C2474Hp(getAssetPriority(c2955a1), c2955a1, this.logEntry);
            if (c2474Hp.isTemplate()) {
                c2474Hp.startRecord();
            }
            ((C4197o6) this.downloader).download(c2474Hp, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, C2955a1 c2955a1) {
        return file.exists() && file.length() == c2955a1.getFileSize();
    }

    private final InterfaceC3757j6 getAssetDownloadListener() {
        return new C2971a9(this);
    }

    private final EnumC2448Gp getAssetPriority(C2955a1 c2955a1) {
        return c2955a1.isRequired() ? EnumC2448Gp.CRITICAL : EnumC2448Gp.HIGHEST;
    }

    private final File getDestinationDir(C4980x2 c4980x2) {
        return this.pathProvider.getDownloadsDirForAd(c4980x2.eventId());
    }

    private final Ei0 getErrorInfo(C4980x2 c4980x2) {
        C3311e2 c3311e2AdUnit = c4980x2.adUnit();
        Integer errorCode = c3311e2AdUnit != null ? c3311e2AdUnit.getErrorCode() : null;
        C3311e2 c3311e2AdUnit2 = c4980x2.adUnit();
        Integer sleep = c3311e2AdUnit2 != null ? c3311e2AdUnit2.getSleep() : null;
        C3311e2 c3311e2AdUnit3 = c4980x2.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (c3311e2AdUnit3 != null ? c3311e2AdUnit3.getInfo() : null);
        if ((errorCode == null || errorCode.intValue() != 10001) && ((errorCode == null || errorCode.intValue() != 10002) && ((errorCode == null || errorCode.intValue() != 20001) && ((errorCode == null || errorCode.intValue() != 30001) && (errorCode == null || errorCode.intValue() != 30002))))) {
            return new C5068y2(EnumC4719u30.PLACEMENT_SLEEP, str);
        }
        EnumC4719u30 enumC4719u30ForNumber = EnumC4719u30.forNumber(errorCode.intValue());
        AbstractC2995aW.p(enumC4719u30ForNumber, "forNumber(errorCode)");
        return new C5068y2(enumC4719u30ForNumber, str);
    }

    private final Ei0 getTemplateError(C4980x2 c4980x2) {
        C3311e2 c3311e2AdUnit = c4980x2.adUnit();
        C4189o2 templateSettings = c3311e2AdUnit != null ? c3311e2AdUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new C4636t6("Missing template settings");
        }
        Map<String, C3575h2> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!c4980x2.isNativeTemplateType()) {
            C3311e2 c3311e2AdUnit2 = c4980x2.adUnit();
            String templateURL = c3311e2AdUnit2 != null ? c3311e2AdUnit2.getTemplateURL() : null;
            C3311e2 c3311e2AdUnit3 = c4980x2.adUnit();
            String vmURL = c3311e2AdUnit3 != null ? c3311e2AdUnit3.getVmURL() : null;
            if ((templateURL == null || templateURL.length() == 0) && (vmURL == null || vmURL.length() == 0)) {
                return new C3507gE("Failed to prepare null vmURL or templateURL for downloading.");
            }
            if (templateURL != null && templateURL.length() != 0 && !Zg0.INSTANCE.isUrlValid(templateURL)) {
                return new C4548s6(AbstractC3888ke0.i("Failed to load template: ", templateURL));
            }
            if (vmURL != null && vmURL.length() != 0 && !Zg0.INSTANCE.isUrlValid(vmURL)) {
                return new C4548s6(AbstractC3888ke0.i("Failed to load vm url: ", vmURL));
            }
        } else if (cacheableReplacements != null) {
            C3575h2 c3575h2 = cacheableReplacements.get(SQ.TOKEN_MAIN_IMAGE);
            if ((c3575h2 != null ? c3575h2.getUrl() : null) == null) {
                return new C3608hR("Unable to load null main image.");
            }
            C3575h2 c3575h3 = cacheableReplacements.get(SQ.TOKEN_VUNGLE_PRIVACY_ICON_URL);
            if ((c3575h3 != null ? c3575h3.getUrl() : null) == null) {
                return new C3608hR("Unable to load null privacy image.");
            }
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, C3575h2>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new C2977aE(AbstractC3888ke0.i("Invalid asset URL ", url));
                }
                if (!Zg0.INSTANCE.isUrlValid(url)) {
                    return new C4548s6(AbstractC3888ke0.i("Invalid asset URL ", url));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: handleAdMetaData$lambda-5, reason: not valid java name */
    private static final L60 m235handleAdMetaData$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (L60) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(AbstractC3325e9 abstractC3325e9, C4980x2 c4980x2, C3586h70 c3586h70, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i & 2) != 0) {
            c3586h70 = null;
        }
        abstractC3325e9.handleAdMetaData$vungle_ads_release(c4980x2, c3586h70);
    }

    private final boolean injectMraidJS(File file) {
        try {
            File file2 = new File(file.getPath(), C2390Ej.AD_MRAID_JS_FILE_NAME);
            File file3 = new File(this.pathProvider.getJsAssetDir(C3457fi.INSTANCE.getMraidJsVersion()), C2390Ej.MRAID_JS_FILE_NAME);
            if (file3.exists()) {
                AbstractC3388eu.Z(file3, file2);
                return true;
            }
            new RP(EnumC4719u30.MRAID_JS_DOES_NOT_EXIST, "mraid js source file not exist.").setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Failed to inject mraid.js: " + e.getMessage());
            new RP(EnumC4719u30.MRAID_JS_COPY_FAILED, "Failed to copy mraid js to ad folder: " + e.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m236loadAd$lambda0(AbstractC3325e9 abstractC3325e9) {
        AbstractC2995aW.q(abstractC3325e9, "this$0");
        abstractC3325e9.requestAd();
    }

    private final void onAdReady() {
        C4980x2 c4980x2 = this.advertisement;
        if (c4980x2 == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        onAdLoadReady();
        R1 r1 = this.adLoaderCallback;
        if (r1 != null) {
            r1.onSuccess(c4980x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void onDownloadCompleted(F2 f2) {
        C4917wJ.Companion.d(TAG, "All download completed " + f2);
        C4980x2 c4980x2 = this.advertisement;
        if (c4980x2 != null) {
            c4980x2.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        C2961a4 c2961a4 = C2961a4.INSTANCE;
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() {
        this.adRequiredDownloadDurationMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(C2955a1 c2955a1, C4980x2 c4980x2) {
        if (c4980x2 == null || c2955a1.getStatus() != Z0.DOWNLOAD_SUCCESS || c2955a1.getLocalPath().length() == 0) {
            return false;
        }
        File file = new File(c2955a1.getLocalPath());
        if (!fileIsValid(file, c2955a1)) {
            return false;
        }
        File destinationDir = getDestinationDir(c4980x2);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            C4917wJ.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        if (c2955a1.getFileType() == Y0.ZIP && !unzipFile(file, destinationDir)) {
            return false;
        }
        if (c4980x2.omEnabled()) {
            try {
                this.omInjector.injectJsFiles$vungle_ads_release(destinationDir);
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Failed to inject OMSDK: " + e.getMessage());
                new AS(EnumC4719u30.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        boolean zInjectMraidJS = injectMraidJS(destinationDir);
        C3300du.printDirectoryTree(destinationDir);
        return zInjectMraidJS;
    }

    private final boolean unzipFile(File file, File file2) {
        ArrayList arrayList = new ArrayList();
        for (C2955a1 c2955a1 : this.adAssets) {
            if (c2955a1.getFileType() == Y0.ASSET) {
                arrayList.add(c2955a1.getLocalPath());
            }
        }
        try {
            C3542gg0 c3542gg0 = C3542gg0.INSTANCE;
            String path = file.getPath();
            String path2 = file2.getPath();
            AbstractC2995aW.p(path2, "destinationDir.path");
            c3542gg0.unzip(path, path2, new C3237d9(arrayList));
            if (new File(file2.getPath(), C2390Ej.AD_INDEX_FILE_NAME).exists()) {
                C3300du.delete(file);
                return true;
            }
            new ZC(EnumC4719u30.INVALID_INDEX_URL, "Failed to retrieve indexFileUrl from the Ad").setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        } catch (Exception e) {
            new Hb0("Unzip failed: " + e.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
    }

    private final Ei0 validateAdMetadata(C4980x2 c4980x2) {
        C3311e2 c3311e2AdUnit = c4980x2.adUnit();
        if (c3311e2AdUnit != null && c3311e2AdUnit.getSleep() != null) {
            return getErrorInfo(c4980x2);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        C4980x2 c4980x3 = this.advertisement;
        if (!AbstractC2995aW.i(referenceId, c4980x3 != null ? c4980x3.placementId() : null)) {
            StringBuilder sb = new StringBuilder("Requests and responses don't match ");
            C4980x2 c4980x4 = this.advertisement;
            return new H2(DM.l(sb, c4980x4 != null ? c4980x4.placementId() : null, '.'));
        }
        Ei0 templateError = getTemplateError(c4980x2);
        if (templateError != null) {
            return templateError;
        }
        if (c4980x2.hasExpired()) {
            return new C4450r1("The ad markup has expired for playback.");
        }
        String strEventId = c4980x2.eventId();
        if (strEventId == null || strEventId.length() == 0) {
            return new C3331eE("Event id is invalid.");
        }
        return null;
    }

    public final void cancel() {
        ((C4197o6) this.downloader).cancelAll();
    }

    public final F2 getAdRequest() {
        return this.adRequest;
    }

    public final C4980x2 getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final C4126nJ getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final ZT getPathProvider() {
        return this.pathProvider;
    }

    public final InterfaceC4615ss getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(C4980x2 c4980x2, C3586h70 c3586h70) {
        List<String> loadAdUrls;
        AbstractC2995aW.q(c4980x2, "advertisement");
        this.advertisement = c4980x2;
        c4980x2.setLogEntry$vungle_ads_release(this.logEntry);
        C4126nJ c4126nJ = this.logEntry;
        if (c4126nJ != null) {
            c4126nJ.setEventId$vungle_ads_release(c4980x2.eventId());
        }
        C4126nJ c4126nJ2 = this.logEntry;
        if (c4126nJ2 != null) {
            c4126nJ2.setCreativeId$vungle_ads_release(c4980x2.getCreativeId());
        }
        C4126nJ c4126nJ3 = this.logEntry;
        if (c4126nJ3 != null) {
            c4126nJ3.setAdSource$vungle_ads_release(c4980x2.getAdSource());
        }
        C2622Ni c2622NiConfig = c4980x2.config();
        if (c2622NiConfig != null) {
            C3457fi.INSTANCE.initWithConfig$vungle_ads_release(this.context, c2622NiConfig, false, c3586h70);
        }
        Ei0 ei0ValidateAdMetadata = validateAdMetadata(c4980x2);
        if (ei0ValidateAdMetadata != null) {
            onAdLoadFailed(ei0ValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(c4980x2);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new C2965a6(EnumC4719u30.ASSET_WRITE_ERROR, "Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.f4736a, new C3060b9(this.context));
        C3311e2 c3311e2AdUnit = c4980x2.adUnit();
        if (c3311e2AdUnit != null && (loadAdUrls = c3311e2AdUnit.getLoadAdUrls()) != null) {
            C3624hd0 c3624hd0 = new C3624hd0(this.vungleApiClient, this.logEntry, ((C4893w20) this.sdkExecutors).getIoExecutor(), this.pathProvider, m235handleAdMetaData$lambda5(interfaceC3069bHH));
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                c3624hd0.sendTpat((String) it.next(), ((C4893w20) this.sdkExecutors).getJobExecutor());
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(c4980x2.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdLoadFailed(new C2965a6(EnumC4719u30.INVALID_ASSET_URL, "No assets to download.").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
        } else {
            VP.INSTANCE.downloadJs(this.pathProvider, this.downloader, ((C4893w20) this.sdkExecutors).getBackgroundExecutor(), new C3148c9(this), c4980x2);
        }
    }

    public final void loadAd(R1 r1) {
        AbstractC2995aW.q(r1, "adLoaderCallback");
        this.adLoaderCallback = r1;
        ((C4893w20) this.sdkExecutors).getBackgroundExecutor().execute(new RunnableC2928Zc(this, 27));
    }

    public final void onAdLoadFailed(Ei0 ei0) {
        R1 r1;
        AbstractC2995aW.q(ei0, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (r1 = this.adLoaderCallback) == null) {
            return;
        }
        r1.onFailure(ei0);
    }

    public abstract void onAdLoadReady();

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(C4980x2 c4980x2) {
        this.advertisement = c4980x2;
    }

    public final void setLogEntry$vungle_ads_release(C4126nJ c4126nJ) {
        this.logEntry = c4126nJ;
    }
}
