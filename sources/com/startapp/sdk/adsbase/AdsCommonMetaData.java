package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AdsCommonMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40573a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f40574b = new HashSet(Arrays.asList("BOLD"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f40575c = -16777216;
    public static final Integer d = -14803426;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Integer f40576e = -1;
    private static AdsCommonMetaData f = new AdsCommonMetaData();
    private static final long serialVersionUID = -7993856006767514058L;

    @TypeInfo(complex = true)
    private AdRules adRules;
    private boolean appPresence;
    private boolean autoInterstitialEnabled;
    private int defaultActivitiesBetweenAds;
    private int defaultSecondsBetweenAds;
    private boolean disableInAppStore;
    private boolean disableTwoClicks;
    private boolean enableForceExternalBrowser;
    private boolean enableSmartRedirect;
    private boolean enforceForeground;
    private Long explicitLoadIntervalMillis;
    private int forceExternalBrowserDaysInterval;
    private Integer itemDescriptionTextColor;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration;
    private Integer itemDescriptionTextSize;
    private Integer itemTitleTextColor;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration;
    private Integer itemTitleTextSize;
    private Integer poweredByBackgroundColor;
    private Integer poweredByTextColor;
    private long smartRedirectLoadedTimeout;
    private int smartRedirectTimeout;

    @TypeInfo(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates;

    @TypeInfo(complex = true)
    private VideoConfig video;
    private String acMetadataUpdateVersion = "5.2.4";
    private Integer probability3D = 0;
    private Integer homeProbability3D = 80;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer backgroundGradientTop = -14606047;
    private Integer backgroundGradientBottom = -14606047;
    private Integer maxAds = 10;
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleTextSize = 18;
    private Integer titleTextColor = -1;

    @TypeInfo(type = HashSet.class)
    private Set<String> titleTextDecoration = f40574b;
    private Integer titleLineColor = f40575c;
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;

    public AdsCommonMetaData() {
        HashSet hashSet = MetaDataStyle.f40711a;
        this.itemTitleTextSize = 18;
        this.itemTitleTextColor = -1;
        this.itemTitleTextDecoration = MetaDataStyle.f40711a;
        this.itemDescriptionTextSize = MetaDataStyle.f40712b;
        this.itemDescriptionTextColor = MetaDataStyle.f40713c;
        this.itemDescriptionTextDecoration = MetaDataStyle.d;
        this.templates = new HashMap<>();
        this.adRules = new AdRules();
        this.poweredByBackgroundColor = d;
        this.poweredByTextColor = f40576e;
        this.smartRedirectTimeout = 5;
        this.smartRedirectLoadedTimeout = 1000L;
        this.enableSmartRedirect = true;
        this.autoInterstitialEnabled = true;
        this.defaultActivitiesBetweenAds = 1;
        this.defaultSecondsBetweenAds = 0;
        this.disableTwoClicks = false;
        this.appPresence = true;
        this.disableInAppStore = false;
        this.video = new VideoConfig();
        this.forceExternalBrowserDaysInterval = 7;
        this.enableForceExternalBrowser = false;
        this.enforceForeground = false;
    }

    public static void a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) g7.c(context, "StartappAdsMetadata");
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData == null) {
            f = adsCommonMetaData2;
            return;
        }
        boolean zA = vi.a((Serializable) adsCommonMetaData, (Serializable) adsCommonMetaData2);
        if ("5.2.4".equals(adsCommonMetaData.acMetadataUpdateVersion) && zA) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "metadata_null";
            g9Var.a();
        }
        adsCommonMetaData.adRules.a();
        f = adsCommonMetaData;
    }

    public static AdsCommonMetaData k() {
        return f;
    }

    public final String A() {
        return this.titleContent;
    }

    public final Integer B() {
        return this.titleLineColor;
    }

    public final Integer C() {
        return this.titleTextColor;
    }

    public final Set D() {
        return this.titleTextDecoration;
    }

    public final Integer E() {
        return this.titleTextSize;
    }

    public final VideoConfig F() {
        return this.video;
    }

    public final boolean G() {
        return this.appPresence;
    }

    public final boolean H() {
        return this.autoInterstitialEnabled;
    }

    public final boolean I() {
        return this.disableInAppStore;
    }

    public final boolean J() {
        return this.disableTwoClicks;
    }

    public final boolean K() {
        return this.enableSmartRedirect;
    }

    public final boolean L() {
        return this.enforceForeground;
    }

    public final AdRules b() {
        return this.adRules;
    }

    public final int c() {
        return this.backgroundGradientBottom.intValue();
    }

    public final int d() {
        return this.backgroundGradientTop.intValue();
    }

    public final int e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
            if (this.smartRedirectTimeout == adsCommonMetaData.smartRedirectTimeout && this.smartRedirectLoadedTimeout == adsCommonMetaData.smartRedirectLoadedTimeout && this.enableSmartRedirect == adsCommonMetaData.enableSmartRedirect && this.autoInterstitialEnabled == adsCommonMetaData.autoInterstitialEnabled && this.defaultActivitiesBetweenAds == adsCommonMetaData.defaultActivitiesBetweenAds && this.defaultSecondsBetweenAds == adsCommonMetaData.defaultSecondsBetweenAds && this.disableTwoClicks == adsCommonMetaData.disableTwoClicks && this.appPresence == adsCommonMetaData.appPresence && this.disableInAppStore == adsCommonMetaData.disableInAppStore && this.forceExternalBrowserDaysInterval == adsCommonMetaData.forceExternalBrowserDaysInterval && this.enableForceExternalBrowser == adsCommonMetaData.enableForceExternalBrowser && this.enforceForeground == adsCommonMetaData.enforceForeground && vi.a((Object) this.acMetadataUpdateVersion, (Object) adsCommonMetaData.acMetadataUpdateVersion) && vi.a((Object) this.probability3D, (Object) adsCommonMetaData.probability3D) && vi.a((Object) this.homeProbability3D, (Object) adsCommonMetaData.homeProbability3D) && vi.a((Object) this.fullpageOfferWallProbability, (Object) adsCommonMetaData.fullpageOfferWallProbability) && vi.a((Object) this.fullpageOverlayProbability, (Object) adsCommonMetaData.fullpageOverlayProbability) && vi.a((Object) this.backgroundGradientTop, (Object) adsCommonMetaData.backgroundGradientTop) && vi.a((Object) this.backgroundGradientBottom, (Object) adsCommonMetaData.backgroundGradientBottom) && vi.a((Object) this.maxAds, (Object) adsCommonMetaData.maxAds) && vi.a((Object) this.explicitLoadIntervalMillis, (Object) adsCommonMetaData.explicitLoadIntervalMillis) && vi.a((Object) this.titleBackgroundColor, (Object) adsCommonMetaData.titleBackgroundColor) && vi.a((Object) this.titleContent, (Object) adsCommonMetaData.titleContent) && vi.a((Object) this.titleTextSize, (Object) adsCommonMetaData.titleTextSize) && vi.a((Object) this.titleTextColor, (Object) adsCommonMetaData.titleTextColor) && vi.a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) && vi.a((Object) this.titleLineColor, (Object) adsCommonMetaData.titleLineColor) && vi.a((Object) this.itemGradientTop, (Object) adsCommonMetaData.itemGradientTop) && vi.a((Object) this.itemGradientBottom, (Object) adsCommonMetaData.itemGradientBottom) && vi.a((Object) this.itemTitleTextSize, (Object) adsCommonMetaData.itemTitleTextSize) && vi.a((Object) this.itemTitleTextColor, (Object) adsCommonMetaData.itemTitleTextColor) && vi.a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) && vi.a((Object) this.itemDescriptionTextSize, (Object) adsCommonMetaData.itemDescriptionTextSize) && vi.a((Object) this.itemDescriptionTextColor, (Object) adsCommonMetaData.itemDescriptionTextColor) && vi.a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) && vi.a((Object) this.templates, (Object) adsCommonMetaData.templates) && vi.a((Object) this.adRules, (Object) adsCommonMetaData.adRules) && vi.a((Object) this.poweredByBackgroundColor, (Object) adsCommonMetaData.poweredByBackgroundColor) && vi.a((Object) this.poweredByTextColor, (Object) adsCommonMetaData.poweredByTextColor) && vi.a((Object) this.video, (Object) adsCommonMetaData.video)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.defaultActivitiesBetweenAds;
    }

    public final int g() {
        return this.defaultSecondsBetweenAds;
    }

    public final Long h() {
        return this.explicitLoadIntervalMillis;
    }

    public final int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    public final int j() {
        return this.fullpageOverlayProbability.intValue();
    }

    public final Integer l() {
        return this.itemDescriptionTextColor;
    }

    public final Set m() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer n() {
        return this.itemDescriptionTextSize;
    }

    public final int o() {
        return this.itemGradientBottom.intValue();
    }

    public final int p() {
        return this.itemGradientTop.intValue();
    }

    public final Integer q() {
        return this.itemTitleTextColor;
    }

    public final Set r() {
        return this.itemTitleTextDecoration;
    }

    public final Integer s() {
        return this.itemTitleTextSize;
    }

    public final int t() {
        return this.maxAds.intValue();
    }

    public final Integer u() {
        return this.poweredByBackgroundColor;
    }

    public final Integer v() {
        return this.poweredByTextColor;
    }

    public final int w() {
        return this.probability3D.intValue();
    }

    public final long x() {
        return this.smartRedirectLoadedTimeout;
    }

    public final long y() {
        return TimeUnit.SECONDS.toMillis(this.smartRedirectTimeout);
    }

    public final Integer z() {
        return this.titleBackgroundColor;
    }

    public final MetaDataStyle a(String str) {
        return this.templates.get(str);
    }

    public final boolean a() {
        return this.enableForceExternalBrowser;
    }

    public static void a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f40573a) {
            adsCommonMetaData.acMetadataUpdateVersion = "5.2.4";
            f = adsCommonMetaData;
            g7.a(context, "StartappAdsMetadata", adsCommonMetaData);
        }
    }
}
