package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes2.dex */
public class UnityInterstitialEventAdapter implements IUnityEventAdapter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediationInterstitialListener f19161attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MediationInterstitialAdapter f19162saneness;

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f19163attabal;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f19163attabal = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19163attabal[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19163attabal[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19163attabal[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19163attabal[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public UnityInterstitialEventAdapter(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f19161attabal = mediationInterstitialListener;
        this.f19162saneness = mediationInterstitialAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f19161attabal == null) {
            return;
        }
        int i = attabal.f19163attabal[adEvent.ordinal()];
        if (i == 1) {
            this.f19161attabal.onAdLoaded(this.f19162saneness);
            return;
        }
        if (i == 2) {
            this.f19161attabal.onAdOpened(this.f19162saneness);
            return;
        }
        if (i == 3) {
            this.f19161attabal.onAdClicked(this.f19162saneness);
        } else if (i == 4) {
            this.f19161attabal.onAdClosed(this.f19162saneness);
        } else {
            if (i != 5) {
                return;
            }
            this.f19161attabal.onAdLeftApplication(this.f19162saneness);
        }
    }
}
