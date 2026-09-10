package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4980x2 {
    public static final C3663i2 Companion = new C3663i2(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_TEMPLATE = "template";
    public static final String KEY_VM = "vmURL";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private C3573h1 adConfig;
    private final List<C3925l2> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private final C2622Ni config;
    private Map<String, String> incentivizedTextSettings;
    private C4126nJ logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;

    public C4980x2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        AbstractC2995aW.p(strQuote, "quote(oldValue)");
        Pattern patternCompile = Pattern.compile(strQuote);
        AbstractC2995aW.p(patternCompile, "compile(pattern)");
        String strValueOrEmpty = valueOrEmpty(str3);
        AbstractC2995aW.q(str, "input");
        AbstractC2995aW.q(strValueOrEmpty, "replacement");
        String strReplaceAll = patternCompile.matcher(str).replaceAll(strValueOrEmpty);
        AbstractC2995aW.p(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    private final C3925l2 getAd() {
        List<C3925l2> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    private final C3311e2 getAdMarkup() {
        C3925l2 ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public static /* synthetic */ List getTpatUrls$default(C4980x2 c4980x2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c4980x2.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final void write$Self(C4980x2 c4980x2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4980x2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c4980x2.ads != null) {
            interfaceC4596sh.r(d40, 0, new T5(C3749j2.INSTANCE, 0), c4980x2.ads);
        }
        if (interfaceC4596sh.j(d40) || c4980x2.config != null) {
            interfaceC4596sh.r(d40, 1, C3720ii.INSTANCE, c4980x2.config);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(c4980x2.mraidFiles, new ConcurrentHashMap())) {
            C3186cf c3186cfA = AbstractC3263dY.a(ConcurrentHashMap.class);
            W90 w90 = W90.f3912a;
            interfaceC4596sh.B(d40, 2, new C2831Vj(c3186cfA, new InterfaceC4123nG[]{w90, w90}), c4980x2.mraidFiles);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(c4980x2.incentivizedTextSettings, new HashMap())) {
            W90 w91 = W90.f3912a;
            interfaceC4596sh.B(d40, 3, new C4095mz(w91, w91, 1), c4980x2.incentivizedTextSettings);
        }
        if (interfaceC4596sh.j(d40) || c4980x2.assetsFullyDownloaded) {
            interfaceC4596sh.C(d40, 4, c4980x2.assetsFullyDownloaded);
        }
    }

    public final int adHeight() {
        C3046b2 adSizeInfo;
        Integer height;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final C3311e2 adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        C3046b2 adSizeInfo;
        Integer width;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final C2622Ni config() {
        return this.config;
    }

    public final FF createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC2995aW.q(key, "key");
        }
        return new FF(linkedHashMap);
    }

    public final String eventId() {
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final C3573h1 getAdConfig() {
        return this.adConfig;
    }

    public final String getAdSource() {
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final String getCreativeId() {
        String creativeId;
        C3311e2 adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final List<C2955a1> getDownloadableAssets(File file) {
        C4189o2 templateSettings;
        Map<String, C3575h2> cacheableReplacements;
        String templateURL;
        String vmURL;
        AbstractC2995aW.q(file, "dir");
        this.assetDirectory = file;
        ArrayList arrayList = new ArrayList();
        if (!isNativeTemplateType()) {
            C3311e2 adMarkup = getAdMarkup();
            if (adMarkup == null || (vmURL = adMarkup.getVmURL()) == null) {
                C3311e2 adMarkup2 = getAdMarkup();
                if (adMarkup2 != null && (templateURL = adMarkup2.getTemplateURL()) != null && C3300du.INSTANCE.isValidUrl(templateURL)) {
                    String absolutePath = new File(file, "template").getAbsolutePath();
                    AbstractC2995aW.p(absolutePath, "filePath");
                    arrayList.add(new C2955a1("template", templateURL, absolutePath, Y0.ZIP, true));
                }
            } else if (C3300du.INSTANCE.isValidUrl(vmURL)) {
                String absolutePath2 = new File(file, C2390Ej.AD_INDEX_FILE_NAME).getAbsolutePath();
                AbstractC2995aW.p(absolutePath2, "filePath");
                arrayList.add(new C2955a1(KEY_VM, vmURL, absolutePath2, Y0.ASSET, true));
            }
        }
        C3311e2 adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, C3575h2> entry : cacheableReplacements.entrySet()) {
                C3575h2 value = entry.getValue();
                if (value.getUrl() != null) {
                    C3300du c3300du = C3300du.INSTANCE;
                    if (c3300du.isValidUrl(value.getUrl())) {
                        Boolean required = value.getRequired();
                        boolean zBooleanValue = (!isNativeTemplateType() && adLoadOptimizationEnabled()) ? !C3457fi.INSTANCE.isCacheableAssetsRequired() ? false : required != null ? required.booleanValue() : false : true;
                        String absolutePath3 = new File(file, c3300du.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                        String key = entry.getKey();
                        String url = value.getUrl();
                        AbstractC2995aW.p(absolutePath3, "filePath");
                        arrayList.add(new C2955a1(key, url, absolutePath3, Y0.ASSET, zBooleanValue));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            AbstractC2775Tf.Z(arrayList, new C4892w2());
        }
        return arrayList;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final C4126nJ getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        C4189o2 templateSettings;
        Map<String, C3575h2> cacheableReplacements;
        C4189o2 templateSettings2;
        Map<String, String> normalReplacements;
        C3311e2 adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3311e2 adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        C3311e2 adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, C3575h2> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (AbstractC2995aW.i(bool, Boolean.TRUE)) {
            C3311e2 adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        C3311e2 adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final List<String> getTpatUrls(String str, String str2, String str3) {
        ArrayList arrayList;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_EVENT);
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(str)) {
            new C3272dd0(EnumC4719u30.INVALID_TPAT_KEY, "Arbitrary tpat key: ".concat(str)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        C3311e2 adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(str);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new C3272dd0(EnumC4719u30.EMPTY_TPAT_ERROR, "Empty tpat key: ".concat(str)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (str) {
            case "checkpoint.0":
                List<String> list3 = list;
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list3));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), C2390Ej.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), C2390Ej.NETWORK_OPERATOR_KEY, str2), C2390Ej.DEVICE_VOLUME_KEY, str3));
                }
                break;
            case "video.length":
                List<String> list4 = list;
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list4));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(complexReplace((String) it2.next(), C2390Ej.VIDEO_LENGTH_KEY, str2));
                }
                break;
            case "ad.loadDuration":
                List<String> list5 = list;
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list5));
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList.add(complexReplace((String) it3.next(), C2390Ej.AD_LOAD_DURATION_KEY, str2));
                }
                break;
            case "ad.close":
                List<String> list6 = list;
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list6));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList.add(complexReplace(complexReplace((String) it4.next(), C2390Ej.AD_DURATION_KEY, str2), C2390Ej.DEVICE_VOLUME_KEY, str3));
                }
                break;
            case "deeplink.click":
                List<String> list7 = list;
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list7));
                Iterator<T> it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList.add(complexReplace((String) it5.next(), C2390Ej.DEEPLINK_SUCCESS_KEY, str2));
                }
                break;
            default:
                return list;
        }
        return arrayList;
    }

    public final List<String> getWinNotifications() {
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        C3311e2 adMarkup = getAdMarkup();
        return (adMarkup == null || (expiry = adMarkup.getExpiry()) == null || ((long) expiry.intValue()) >= System.currentTimeMillis() / 1000) ? false : true;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String str) {
        C4189o2 templateSettings;
        Map<String, C3575h2> cacheableReplacements;
        AbstractC2995aW.q(str, "failingUrl");
        if (!isNativeTemplateType()) {
            C3311e2 adMarkup = getAdMarkup();
            if (AbstractC2995aW.i(adMarkup != null ? adMarkup.getTemplateURL() : null, str)) {
                return true;
            }
        }
        C3311e2 adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C3575h2> entry : cacheableReplacements.entrySet()) {
            if (AbstractC2995aW.i(entry.getValue().getUrl(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return AbstractC2995aW.i(templateType(), "native");
    }

    public final boolean omEnabled() {
        C4540s2 viewAbility;
        C4804v2 om;
        Boolean boolIsEnabled;
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        C3925l2 ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(C3573h1 c3573h1) {
        this.adConfig = c3573h1;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final void setIncentivizedText(String str, String str2, String str3, String str4) {
        AbstractC2995aW.q(str, CampaignEx.JSON_KEY_TITLE);
        AbstractC2995aW.q(str2, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(str3, "keepWatching");
        AbstractC2995aW.q(str4, "close");
        if (str.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (str2.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (str3.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (str4.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        AbstractC2995aW.q(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(C4126nJ c4126nJ) {
        this.logEntry = c4126nJ;
    }

    public final String templateType() {
        C3311e2 adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(C2955a1 c2955a1) {
        if (c2955a1 != null) {
            if (!AbstractC2995aW.i("template", c2955a1.getAdIdentifier())) {
                File file = new File(c2955a1.getLocalPath());
                if (file.exists()) {
                    String adIdentifier = c2955a1.getAdIdentifier();
                    this.mraidFiles.put(adIdentifier, FILE_SCHEME + file.getPath());
                }
            }
        }
    }

    public /* synthetic */ C4980x2(List list, C2622Ni c2622Ni, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c2622Ni);
    }

    public /* synthetic */ C4980x2(int i, List list, C2622Ni c2622Ni, ConcurrentHashMap concurrentHashMap, @VisibleForTesting Map map, boolean z, O40 o40) {
        if ((i & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = c2622Ni;
        }
        if ((i & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z;
        }
        this.adConfig = null;
        this.logEntry = null;
        this.assetDirectory = null;
    }

    public C4980x2(List<C3925l2> list, C2622Ni c2622Ni) {
        this.ads = list;
        this.config = c2622Ni;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }
}
