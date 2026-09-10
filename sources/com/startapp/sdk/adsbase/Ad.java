package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Ad {
    private static boolean init = false;
    protected ActivityExtra activityExtra;
    protected final lb adCacheManager;
    private AdInformationOverrides adInfoOverride;
    protected ConsentData consentData;
    protected final lb consentManager;
    protected final Context context;
    private String erid;
    private String eridUrl;
    protected String errorMessage;
    protected final lb eventTracer;
    protected final lb httpClient;
    protected final lb motionProcessor;
    protected final lb networkApiExecutor;
    private NotDisplayedReason notDisplayedReason;
    protected final AdPreferences.Placement placement;
    private String requestUrl;
    private boolean tiedToAdm;
    private AdType type;
    protected final lb videoAdCacheManager;
    private boolean videoCancelCallBack;
    protected final lb webViewCacheLoader;
    protected final lb webViewFactory;
    private WeakReference<Activity> adapterCompatActivity = new WeakReference<>(null);
    protected Serializable extraData = null;
    protected Long adCacheTtl = null;
    private AdState state = AdState.UN_INITIALIZED;
    private Long lastLoadTime = null;
    protected boolean belowMinCPM = false;

    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    public Ad(Context context, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        this.context = context;
        this.placement = placement;
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        WeakHashMap weakHashMap = vi.f41589a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    private static boolean b(String str) {
        EnabledConfig enabledConfigE;
        if (str == null || (enabledConfigE = MetaData.E().e()) == null) {
            return true;
        }
        return enabledConfigE.a(new com.google.common.net.a(16));
    }

    public boolean canShowAd() {
        return MetaData.E().b();
    }

    public abstract b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str);

    public Long getAdCacheTtl() {
        long fallbackAdCacheTtl = getFallbackAdCacheTtl();
        Long l2 = this.adCacheTtl;
        if (l2 != null) {
            fallbackAdCacheTtl = Math.min(l2.longValue(), fallbackAdCacheTtl);
        }
        return Long.valueOf(fallbackAdCacheTtl);
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDParam() {
        return null;
    }

    public String getErid() {
        return this.erid;
    }

    public String getEridUrl() {
        return this.eridUrl;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public long getFallbackAdCacheTtl() {
        return CacheMetaData.b().a().a();
    }

    public Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public AdPreferences.Placement getPlacement() {
        return this.placement;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    public boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

    public boolean hasAdCacheTtlPassed() {
        return this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > getAdCacheTtl().longValue();
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !hasAdCacheTtlPassed();
    }

    public boolean isTiedToAdm() {
        return this.tiedToAdm;
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), null);
    }

    public final void loadAds(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        this.tiedToAdm = str != null;
        b2 b2VarCreateService = createService(adPreferences, adEventListener, str);
        if (b2VarCreateService != null) {
            ((z6) ((y6) this.eventTracer.a())).a(this, b2VarCreateService);
            b2VarCreateService.a();
        } else if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }

    public Activity resolveActivityToShowAd() {
        Object obj = this.context;
        if (!(obj instanceof Activity)) {
            obj = this.adapterCompatActivity.get();
        }
        Activity activity = (Activity) obj;
        return activity == null ? ih.f41097a.k : activity;
    }

    public void setActivityExtra(ActivityExtra activityExtra) {
        this.activityExtra = activityExtra;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        if (context instanceof Activity) {
            this.adapterCompatActivity = new WeakReference<>((Activity) context);
        }
    }

    public void setErid(String str) {
        this.erid = str;
    }

    public void setEridUrl(String str) {
        this.eridUrl = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public void setNotDisplayedReason(NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    public void setVideoCancelCallBack(boolean z2) {
        this.videoCancelCallBack = z2;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, null);
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String str2;
        boolean z2;
        String name;
        a aVar = new a(this, adEventListener);
        ((tk) this.webViewFactory.a()).b();
        boolean z3 = true;
        if (!init) {
            g.f(this.context);
            init = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str2 = "load() was already called.";
            z2 = true;
        } else {
            str2 = "";
            z2 = false;
        }
        Context context = this.context;
        WeakHashMap weakHashMap = vi.f41589a;
        if (!((g6) com.startapp.sdk.components.a.a(context).t.a()).b()) {
            str2 = "network not available.";
            z2 = true;
        }
        if (canShowAd()) {
            z3 = z2;
        } else {
            str2 = "serving ads disabled";
        }
        if (z3) {
            setErrorMessage("Ad wasn't loaded: ".concat(str2));
            a0.a(this.context, aVar, this, false);
            return;
        }
        setState(AdState.PROCESSING);
        b bVar = new b(this, adPreferences, aVar, str);
        if (adPreferences != null && adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        if (adPreferences != null && adPreferences.getPlacementId() == null) {
            Context baseContext = this.context;
            String packageName = baseContext.getPackageName();
            String name2 = getClass().getName();
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    name = null;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        name = baseContext.getClass().getName();
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            adPreferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
        }
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f41110l);
        ((z6) ((y6) this.eventTracer.a())).a(this, bVar);
        MetaData.E().a(this.context, adPreferences, pg.d.f41373c, b(str), bVar, false);
    }
}
