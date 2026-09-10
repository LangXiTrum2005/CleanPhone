package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbAppOpenAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbBannerAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbInterstitialAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbNativeAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbRewardedAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallAppOpenAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallBannerAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallInterstitialAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallNativeAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static MBridgeSDK f18973cuirassed;
    public static final Map<MintegralSlotIdentifier, WeakReference<Object>> loadedSlotIdentifiers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public MintegralRtbInterstitialAd f18974adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MintegralWaterfallInterstitialAd f18975arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public MintegralRtbRewardedAd f18977dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public MintegralRtbNativeAd f18978gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public MintegralRtbBannerAd f18979graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MintegralWaterfallBannerAd f18980kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MintegralWaterfallAppOpenAd f18981molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MintegralWaterfallRewardedAd f18982monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MintegralWaterfallNativeAd f18983polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public MintegralRtbAppOpenAd f18985rotuma;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public ExecutorService f18984preprohormone = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final FlagValueGetter f18976cord = new FlagValueGetter();

    public class attabal implements SDKInitStatusListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18986attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18988saneness;

        public attabal(Context context, InitializationCompleteCallback initializationCompleteCallback) {
            this.f18986attabal = context;
            this.f18988saneness = initializationCompleteCallback;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String str) {
            this.f18988saneness.onInitializationFailed(MintegralConstants.createSdkError(105, str).getMessage());
            String str2 = MintegralMediationAdapter.TAG;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
            MintegralUtils.attabal(this.f18986attabal, MintegralMediationAdapter.f18973cuirassed);
            this.f18988saneness.onInitializationSucceeded();
        }
    }

    public static /* synthetic */ void attabal(MintegralMediationAdapter mintegralMediationAdapter, Map map, Context context, InitializationCompleteCallback initializationCompleteCallback) {
        mintegralMediationAdapter.getClass();
        f18973cuirassed.init((Map<String, String>) map, context, mintegralMediationAdapter.new attabal(context, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (this.f18976cord.shouldRestrictMultipleAdLoads()) {
            Iterator<MintegralSlotIdentifier> it = MintegralUtils.getMintegralSlotIdentifiers(rtbSignalData).iterator();
            while (it.hasNext()) {
                WeakReference<Object> weakReference = loadedSlotIdentifiers.get(it.next());
                if (weakReference != null && weakReference.get() != null) {
                    signalCallbacks.onFailure(new AdError(106, MintegralConstants.ERROR_MSG_AD_ALREADY_LOADED, "com.google.ads.mediation.mintegral"));
                    return;
                }
            }
        }
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = MintegralUtils.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("_");
        if (strArrSplit.length > 1) {
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            if (strArrSplit2.length >= 3) {
                return new VersionInfo(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2]));
            }
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = MintegralUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(final Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString("app_id");
            String string2 = serverParameters.getString("app_key");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            adErrorCreateAdapterError.toString();
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        String str2 = (String) hashSet2.iterator().next();
        if (size > 1) {
            String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str);
        }
        if (size2 > 1) {
            String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2);
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        f18973cuirassed = mBridgeSDK;
        final Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        try {
            Aa aa = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f18984preprohormone.submit(new Runnable() { // from class: pimpled.attabal
            @Override // java.lang.Runnable
            public final void run() {
                MintegralMediationAdapter.attabal(this.f35382kowloon, mBConfigurationMap, context, initializationCompleteCallback);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationAppOpenAdConfiguration.getServerParameters());
        MintegralWaterfallAppOpenAd mintegralWaterfallAppOpenAd = new MintegralWaterfallAppOpenAd(mediationAdLoadCallback, this.f18976cord);
        this.f18981molybdenite = mintegralWaterfallAppOpenAd;
        mintegralWaterfallAppOpenAd.loadAd(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationBannerAdConfiguration.getServerParameters());
        MintegralWaterfallBannerAd mintegralWaterfallBannerAd = new MintegralWaterfallBannerAd(mediationAdLoadCallback);
        this.f18980kowloon = mintegralWaterfallBannerAd;
        mintegralWaterfallBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationInterstitialAdConfiguration.getServerParameters());
        MintegralWaterfallInterstitialAd mintegralWaterfallInterstitialAd = new MintegralWaterfallInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f18976cord);
        this.f18975arytenoidectomy = mintegralWaterfallInterstitialAd;
        mintegralWaterfallInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationNativeAdConfiguration.getServerParameters());
        MintegralWaterfallNativeAd mintegralWaterfallNativeAd = new MintegralWaterfallNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f18983polloi = mintegralWaterfallNativeAd;
        mintegralWaterfallNativeAd.loadAd(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationRewardedAdConfiguration.getServerParameters());
        MintegralWaterfallRewardedAd mintegralWaterfallRewardedAd = new MintegralWaterfallRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f18976cord);
        this.f18982monoploid = mintegralWaterfallRewardedAd;
        mintegralWaterfallRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationAppOpenAdConfiguration.getServerParameters());
        MintegralRtbAppOpenAd mintegralRtbAppOpenAd = new MintegralRtbAppOpenAd(mediationAdLoadCallback, this.f18976cord);
        this.f18985rotuma = mintegralRtbAppOpenAd;
        mintegralRtbAppOpenAd.loadAd(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationBannerAdConfiguration.getServerParameters());
        MintegralRtbBannerAd mintegralRtbBannerAd = new MintegralRtbBannerAd(mediationAdLoadCallback);
        this.f18979graveside = mintegralRtbBannerAd;
        mintegralRtbBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationInterstitialAdConfiguration.getServerParameters());
        MintegralRtbInterstitialAd mintegralRtbInterstitialAd = new MintegralRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f18976cord);
        this.f18974adultoid = mintegralRtbInterstitialAd;
        mintegralRtbInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationNativeAdConfiguration.getServerParameters());
        MintegralRtbNativeAd mintegralRtbNativeAd = new MintegralRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f18978gintrap = mintegralRtbNativeAd;
        mintegralRtbNativeAd.loadAd(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18976cord.processMultipleAdLoadsServerParam(mediationRewardedAdConfiguration.getServerParameters());
        MintegralRtbRewardedAd mintegralRtbRewardedAd = new MintegralRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f18976cord);
        this.f18977dovishness = mintegralRtbRewardedAd;
        mintegralRtbRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }
}
