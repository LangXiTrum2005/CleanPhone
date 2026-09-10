package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.g1;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ik;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.vi;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BannerBase extends RelativeLayout {
    private static final int LOAD_BANNER = 1;
    private static final int LOAD_BANNER_DELAYED = 2;
    private static final String LOG_TAG = "BannerBase";
    private static final long MIN_REFRESH_INTERVAL_MILLIS = 10000;
    private static final long RELOAD_CHECK_INTERVAL_MILLIS = 2000;
    protected final lb adCacheManager;
    private AdPreferences adPreferences;
    protected AdRulesResult adRulesResult;
    private boolean attachedToWindow;
    private boolean clicked;
    protected final lb consentManager;
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;
    private String error;
    protected final lb eventTracer;
    private boolean firstLoad;
    private final Handler handler;
    private final Object handlerLock;
    protected final lb httpClient;
    private long loadedUptimeMillis;
    protected final lb motionProcessor;
    protected final lb networkApiExecutor;
    protected int offset;
    protected final lb runtimeClassDetector;
    private final Runnable scheduleReloadTask;
    private boolean shouldReloadBanner;
    protected final lb showIntentionsKeeper;
    protected final lb videoAdCacheManager;
    protected ik viewabilityRunner;
    protected final lb webViewCacheLoader;
    protected final lb webViewFactory;

    public BannerBase(Context context, AttributeSet attributeSet, int i2, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11) {
        super(context, attributeSet, i2);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.scheduleReloadTask = new c0.a(this, 26);
        this.handler = new Handler(Looper.getMainLooper(), new a(this));
        this.handlerLock = new Object();
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        this.runtimeClassDetector = lbVar10;
        this.showIntentionsKeeper = lbVar11;
        setAdTag(new g1(context, attributeSet).f40992a);
        try {
            ((sf) lbVar10.a()).a(512);
        } catch (Throwable unused) {
        }
    }

    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || AdaptMetaData.b().a().b()) {
            setFirstLoad(false);
            t.d.a(new s(AdPreferences.Placement.INAPP_BANNER, getAdTag()));
        }
    }

    public void cancelDelayedLoading() {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
        }
    }

    public void cancelReloadTask() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.scheduleReloadTask);
        cancelDelayedLoading();
    }

    public Point getAdLoadingSize() {
        return new Point(getWidthInDp(), getHeightInDp());
    }

    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.adPreferences = adPreferences2;
        return adPreferences2;
    }

    public String getAdTag() {
        return getAdPreferences().getAdTag();
    }

    public abstract String getBannerName();

    public String getErrorMessage() {
        return this.error;
    }

    public abstract int getHeightInDp();

    public long getRefreshDelayMillis() {
        return 0L;
    }

    public abstract int getRefreshRate();

    public long getTimePassedSinceAdLoadedToViewMillis() {
        return SystemClock.uptimeMillis() - this.loadedUptimeMillis;
    }

    public View getViewableBanner() {
        return this;
    }

    public abstract int getWidthInDp();

    public abstract void hideBanner();

    public void init() {
        if (!isInEditMode()) {
            initRuntime();
            return;
        }
        setMinimumWidth(li.a(getContext(), getWidthInDp()));
        setMinimumHeight(li.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void initRuntime();

    public boolean isAdLoadedToView() {
        return this.loadedUptimeMillis > 0;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    public boolean isTiedToAdm() {
        return false;
    }

    public void load(String str) {
        ik ikVar = this.viewabilityRunner;
        if (ikVar != null) {
            ikVar.a();
            this.viewabilityRunner = null;
        }
        if (this.adRulesResult != null && !AdaptMetaData.b().a().b()) {
            if (this.adRulesResult.b()) {
                reload(str);
            }
        } else {
            AdRulesResult adRulesResultA = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_BANNER, getAdTag());
            this.adRulesResult = adRulesResultA;
            if (adRulesResultA.b()) {
                reload(str);
            } else {
                hideBanner();
            }
        }
    }

    public void loadAd(int i2, int i3) {
        loadAd(i2, i3, null);
    }

    public void loadBanner(String str) {
        try {
            ((sf) this.runtimeClassDetector.a()).a(1024);
        } catch (Throwable unused) {
        }
        synchronized (this.handlerLock) {
            try {
                if (!this.handler.hasMessages(1)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = str;
                    messageObtain.what = 1;
                    this.handler.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void loadBannerDelayed(long j) {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, j);
        }
    }

    public void loadBannerImpl(String str) {
        scheduleReloadTask();
        load(str);
    }

    public void onAdLoadedToView() {
        getContext();
        WeakHashMap weakHashMap = vi.f41589a;
        Log.println(2, "StartAppSDK", "Banner start rendering the ad content");
        this.loadedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ((sf) this.runtimeClassDetector.a()).a(4096);
        } catch (Throwable unused) {
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        cancelReloadTask();
        ik ikVar = this.viewabilityRunner;
        if (ikVar != null) {
            ikVar.a();
            this.viewabilityRunner = null;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.adRulesResult = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("upperState", parcelableOnSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2) {
            this.attachedToWindow = false;
            cancelReloadTask();
            return;
        }
        if (this.shouldReloadBanner) {
            this.shouldReloadBanner = false;
            load(null);
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    public AdPreferences prepareAdPreferences() {
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(h0.a(this));
        }
        adPreferences.setHardwareAccelerated(q0.a(this, this.attachedToWindow));
        return adPreferences;
    }

    public abstract void reload(String str);

    public void scheduleReloadTask() {
        AdRulesResult adRulesResult;
        if (!isInEditMode() && CacheMetaData.d() && this.attachedToWindow && !isTiedToAdm()) {
            long jMax = Math.max(0L, getRefreshDelayMillis());
            long jMax2 = ((this.loadedUptimeMillis + Math.max(10000L, getRefreshRate())) - jMax) - SystemClock.uptimeMillis();
            if (jMax2 > 0) {
                removeCallbacks(this.scheduleReloadTask);
                if (jMax <= 0) {
                    jMax2 = Math.min(2000L, jMax2);
                }
                postDelayed(this.scheduleReloadTask, jMax2);
                return;
            }
            if (isShown() || ((adRulesResult = this.adRulesResult) != null && !adRulesResult.b())) {
                load(null);
            }
            loadBannerDelayed(((long) MetaData.E().M()) * 1000);
        }
    }

    public void setAdPreferences(AdPreferences adPreferences) {
        this.adPreferences = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z2) {
        this.clicked = z2;
    }

    public void setErrorMessage(String str) {
        this.error = str;
    }

    public void setFirstLoad(boolean z2) {
        this.firstLoad = z2;
    }

    public boolean shouldSendImpression(ag agVar) {
        return agVar != null && agVar.j.get() == 0;
    }

    public void startVisibilityRunnable(ag agVar) {
        if (this.viewabilityRunner != null) {
            return;
        }
        ik ikVar = new ik(getViewableBanner(), getAdLoadingSize(), agVar, BannerMetaData.c().a());
        this.viewabilityRunner = ikVar;
        if (ikVar.c()) {
            ikVar.run();
        }
    }

    public void loadAd(int i2, int i3, String str) {
        if (i2 > getWidthInDp() && i3 > getHeightInDp()) {
            this.desirableSizeForManualLoading = new Point(i2, i3);
        }
        loadBanner(str);
    }

    public void loadAd() {
        loadBanner(null);
    }

    public void loadAd(String str) {
        loadBanner(str);
    }
}
