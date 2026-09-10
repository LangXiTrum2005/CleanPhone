package com.zg.adlib.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUSDK;
import com.thinkup.interstitial.api.TUInterstitial;
import com.thinkup.interstitial.api.TUInterstitialListener;
import com.zg.adlib.ZGAd;
import com.zg.adlib.service.ZGADLogManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class MagicAdUtil {
    private static MagicAdUtil instance;
    private static HashMap<String, MaxAdModel> maxAdCache;
    private static HashMap<String, ToponAdModel> toponAdCache;
    private Application ctx;
    private boolean isInitAd = false;
    private HashSet<String> onLoadAdSet = new HashSet<>();
    private ArrayList<String> adMaxPlaces = new ArrayList<>();
    private ArrayList<String> adToponPlaces = new ArrayList<>();
    private String currentAct = null;
    private Activity currentActInstance = null;

    public interface MAdActionListener {
        void click();

        void close();

        void show();

        void showError();
    }

    public interface MAdLoadListener {
        void onFail();

        void onLoad();
    }

    public static class MaxAdModel {
        public MaxInterstitialAd maxInterstitialAd;
        public double ecpm = 0.0d;
        public String network = "";
        public String dsp = "";
        public String adId = "";
    }

    public static class ToponAdModel {
        public TUInterstitial atInterstitial;
        public double ecpm = 0.0d;
        public String network = "";
        public String dsp = "";
        public String adId = "";
    }

    private MagicAdUtil(Application application) {
        this.ctx = application;
        this.adMaxPlaces.add("xx");
        this.adMaxPlaces.add("xx");
        this.adMaxPlaces.add("xx");
        this.adToponPlaces.add(AdPlaces.AD_INST_TOPON_1);
        this.adToponPlaces.add(AdPlaces.AD_INST_TOPON_2);
        this.adToponPlaces.add(AdPlaces.AD_INST_TOPON_3);
        toponAdCache = new HashMap<>();
        maxAdCache = new HashMap<>();
    }

    private boolean checkAd(String str) {
        return (toponAdCache.get(str) == null && maxAdCache.get(str) == null) ? false : true;
    }

    public static MagicAdUtil getInstance(Application application) {
        if (instance == null) {
            instance = new MagicAdUtil(application);
        }
        return instance;
    }

    private Object getMagicAd() {
        MaxAdModel value = null;
        for (Map.Entry<String, MaxAdModel> entry : maxAdCache.entrySet()) {
            if (value == null) {
                value = entry.getValue();
            } else if (value.ecpm < entry.getValue().ecpm) {
                value = entry.getValue();
            }
        }
        ToponAdModel value2 = null;
        for (Map.Entry<String, ToponAdModel> entry2 : toponAdCache.entrySet()) {
            if (value2 == null) {
                value2 = entry2.getValue();
            } else if (value2.ecpm < entry2.getValue().ecpm) {
                value2 = entry2.getValue();
            }
        }
        if (value2 == null && value == null) {
            return null;
        }
        if (value2 == null) {
            return value;
        }
        return (value != null && value.ecpm >= value2.ecpm) ? value : value2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean isAdActivity(Activity activity) {
        return Boolean.valueOf("AdActivity".equals(activity.getClass().getSimpleName()) || "AudienceNetworkActivity".equals(activity.getClass().getSimpleName()) || "AppLovinFullscreenActivity".equals(activity.getClass().getSimpleName()) || "AdColonyInterstitialActivity".equals(activity.getClass().getSimpleName()) || "AdUnitActivity".equals(activity.getClass().getSimpleName()) || "MBRewardVideoActivity".equals(activity.getClass().getSimpleName()) || "MBRewardVideoActivity".equals(activity.getClass().getName()) || "VungleActivity".equals(activity.getClass().getSimpleName()));
    }

    private void loadMaxAd(Context context, final String str, final MAdLoadListener mAdLoadListener) {
        final MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(str, context);
        maxInterstitialAd.setListener(new MaxAdListener() { // from class: com.zg.adlib.util.MagicAdUtil.4
            @Override // com.applovin.mediation.MaxAdListener
            public void onAdClicked(MaxAd maxAd) {
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
                MagicAdUtil.maxAdCache.remove(str);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayed(MaxAd maxAd) {
                MagicAdUtil.maxAdCache.remove(str);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdHidden(MaxAd maxAd) {
                MagicAdUtil.maxAdCache.remove(str);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str2, MaxError maxError) {
                mAdLoadListener.onFail();
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                MaxAdModel maxAdModel = new MaxAdModel();
                maxAdModel.maxInterstitialAd = maxInterstitialAd;
                maxAdModel.adId = str;
                maxAdModel.ecpm = maxAd.getRevenue() * 1000.0d;
                maxAdModel.network = maxAd.getNetworkName();
                maxAdModel.dsp = maxAd.getDspName();
                MagicAdUtil.maxAdCache.put(str, maxAdModel);
                mAdLoadListener.onLoad();
                try {
                    ZGADLogManager.INSTANCE.getInstance().sendCustomLog(MAnalysisUtil.EVENT_AD_LOAD_MAX, maxAdModel.ecpm + "", maxAdModel.network + "", maxAdModel.dsp + "");
                } catch (Exception unused) {
                }
            }
        });
        maxInterstitialAd.loadAd();
    }

    private void loadToponAd(Context context, final String str, final MAdLoadListener mAdLoadListener) {
        final TUInterstitial tUInterstitial = new TUInterstitial(context, str);
        tUInterstitial.setAdListener(new TUInterstitialListener() { // from class: com.zg.adlib.util.MagicAdUtil.5
            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdClicked(TUAdInfo tUAdInfo) {
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdClose(TUAdInfo tUAdInfo) {
                MagicAdUtil.toponAdCache.remove(str);
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdLoadFail(AdError adError) {
                mAdLoadListener.onFail();
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdLoaded() {
                ToponAdModel toponAdModel = new ToponAdModel();
                TUInterstitial tUInterstitial2 = tUInterstitial;
                toponAdModel.atInterstitial = tUInterstitial2;
                toponAdModel.adId = str;
                TUAdInfo tUTopAdInfo = tUInterstitial2.checkAdStatus().getTUTopAdInfo();
                if (tUTopAdInfo != null) {
                    toponAdModel.ecpm = tUTopAdInfo.getEcpm();
                    toponAdModel.network = tUTopAdInfo.getNetworkName();
                }
                MagicAdUtil.toponAdCache.put(str, toponAdModel);
                mAdLoadListener.onLoad();
                try {
                    ZGADLogManager.INSTANCE.getInstance().sendCustomLog(MAnalysisUtil.EVENT_AD_LOAD_TOPON, toponAdModel.ecpm + "", toponAdModel.network + "");
                } catch (Exception unused) {
                }
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdShow(TUAdInfo tUAdInfo) {
                MagicAdUtil.toponAdCache.remove(str);
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo) {
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdVideoError(AdError adError) {
                MagicAdUtil.toponAdCache.remove(str);
            }

            @Override // com.thinkup.interstitial.api.TUInterstitialListener
            public void onInterstitialAdVideoStart(TUAdInfo tUAdInfo) {
            }
        });
        tUInterstitial.load();
    }

    private static void showAdMax(Activity activity, final MaxAdModel maxAdModel, final MAdActionListener mAdActionListener) {
        MaxInterstitialAd maxInterstitialAd = maxAdModel.maxInterstitialAd;
        if (maxInterstitialAd == null) {
            mAdActionListener.showError();
        } else {
            maxInterstitialAd.setListener(new MaxAdListener() { // from class: com.zg.adlib.util.MagicAdUtil.7
                @Override // com.applovin.mediation.MaxAdListener
                public void onAdClicked(MaxAd maxAd) {
                    mAdActionListener.click();
                }

                @Override // com.applovin.mediation.MaxAdListener
                public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
                    MagicAdUtil.maxAdCache.remove(maxAdModel.adId);
                    mAdActionListener.showError();
                    MagicAdUtil.instance.loadAllInst();
                }

                @Override // com.applovin.mediation.MaxAdListener
                public void onAdDisplayed(MaxAd maxAd) {
                    MagicAdUtil.maxAdCache.remove(maxAdModel.adId);
                    mAdActionListener.show();
                    try {
                        ZGADLogManager.INSTANCE.getInstance().sendCustomLog(MAnalysisUtil.EVENT_AD_SHOW_MAX, maxAdModel.ecpm + "", maxAdModel.network + "", maxAdModel.dsp + "");
                    } catch (Exception unused) {
                    }
                    MagicAdUtil.instance.loadAllInst();
                }

                @Override // com.applovin.mediation.MaxAdListener
                public void onAdHidden(MaxAd maxAd) {
                    mAdActionListener.close();
                }

                @Override // com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                }

                @Override // com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                }
            });
            maxAdModel.maxInterstitialAd.showAd(activity);
        }
    }

    private void showAdTopon(Activity activity, final ToponAdModel toponAdModel, final MAdActionListener mAdActionListener) {
        TUInterstitial tUInterstitial = toponAdModel.atInterstitial;
        if (tUInterstitial == null) {
            mAdActionListener.showError();
        } else {
            tUInterstitial.setAdListener(new TUInterstitialListener() { // from class: com.zg.adlib.util.MagicAdUtil.6
                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdClicked(TUAdInfo tUAdInfo) {
                    mAdActionListener.click();
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdClose(TUAdInfo tUAdInfo) {
                    mAdActionListener.close();
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdLoadFail(AdError adError) {
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdLoaded() {
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdShow(TUAdInfo tUAdInfo) {
                    MagicAdUtil.toponAdCache.remove(toponAdModel.adId);
                    mAdActionListener.show();
                    try {
                        ZGADLogManager.INSTANCE.getInstance().sendCustomLog(MAnalysisUtil.EVENT_AD_SHOW_TOPON, toponAdModel.ecpm + "", toponAdModel.network + "");
                    } catch (Exception unused) {
                    }
                    MagicAdUtil.instance.loadAllInst();
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo) {
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdVideoError(AdError adError) {
                    MagicAdUtil.toponAdCache.remove(toponAdModel.adId);
                    mAdActionListener.showError();
                    MagicAdUtil.instance.loadAllInst();
                }

                @Override // com.thinkup.interstitial.api.TUInterstitialListener
                public void onInterstitialAdVideoStart(TUAdInfo tUAdInfo) {
                }
            });
            toponAdModel.atInterstitial.show(activity);
        }
    }

    private void startAutoLoadAd() {
        this.ctx.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.zg.adlib.util.MagicAdUtil.8
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                MagicAdUtil.this.currentAct = activity.getClass().getSimpleName();
                if (MagicAdUtil.this.isAdActivity(activity).booleanValue()) {
                    return;
                }
                MagicAdUtil.this.currentActInstance = activity;
                MagicAdUtil.this.loadAllInst();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                MagicAdUtil.this.currentAct = activity.getClass().getSimpleName();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }
        });
    }

    public boolean canShowAd() {
        return (toponAdCache.isEmpty() && maxAdCache.isEmpty()) ? false : true;
    }

    public void initAd() {
        AppLovinSdkInitializationConfiguration.Builder mediationProvider = AppLovinSdkInitializationConfiguration.builder("max").setMediationProvider("max");
        MaxSegmentCollection.Builder builder = MaxSegmentCollection.builder();
        Object[] objArr = {1, 3};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        AppLovinSdk.getInstance(this.ctx).initialize(mediationProvider.setSegmentCollection(builder.addSegment(new MaxSegment(849, Collections.unmodifiableList(arrayList))).build()).build(), new AppLovinSdk.SdkInitializationListener() { // from class: com.zg.adlib.util.MagicAdUtil.1
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                try {
                    ZGAd.getInstance().setCountry(appLovinSdkConfiguration.getCountryCode());
                } catch (Exception unused) {
                }
            }
        });
        TUSDK.init(this.ctx, AdPlaces.TOPON_APP_ID, AdPlaces.TOPON_APP_KEY);
        this.isInitAd = true;
        loadAllInst();
        startAutoLoadAd();
    }

    public void loadAllInst() {
        if (this.isInitAd) {
            for (final String str : this.adMaxPlaces) {
                if (!this.onLoadAdSet.contains(str) && !checkAd(str)) {
                    this.onLoadAdSet.add(str);
                    loadMaxAd(this.ctx, str, new MAdLoadListener() { // from class: com.zg.adlib.util.MagicAdUtil.2
                        @Override // com.zg.adlib.util.MagicAdUtil.MAdLoadListener
                        public void onFail() {
                            MagicAdUtil.this.onLoadAdSet.remove(str);
                        }

                        @Override // com.zg.adlib.util.MagicAdUtil.MAdLoadListener
                        public void onLoad() {
                            MagicAdUtil.this.onLoadAdSet.remove(str);
                        }
                    });
                }
            }
            for (final String str2 : this.adToponPlaces) {
                if (!this.onLoadAdSet.contains(str2) && !checkAd(str2)) {
                    this.onLoadAdSet.add(str2);
                    loadToponAd(this.ctx, str2, new MAdLoadListener() { // from class: com.zg.adlib.util.MagicAdUtil.3
                        @Override // com.zg.adlib.util.MagicAdUtil.MAdLoadListener
                        public void onFail() {
                            MagicAdUtil.this.onLoadAdSet.remove(str2);
                        }

                        @Override // com.zg.adlib.util.MagicAdUtil.MAdLoadListener
                        public void onLoad() {
                            MagicAdUtil.this.onLoadAdSet.remove(str2);
                        }
                    });
                }
            }
        }
    }

    public void showInstAd(Activity activity, MAdActionListener mAdActionListener) {
        Object magicAd = getMagicAd();
        if (magicAd == null) {
            mAdActionListener.showError();
        } else if (magicAd instanceof MaxAdModel) {
            showAdMax(activity, (MaxAdModel) magicAd, mAdActionListener);
        } else {
            showAdTopon(activity, (ToponAdModel) magicAd, mAdActionListener);
        }
    }
}
