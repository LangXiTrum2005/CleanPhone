package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes2.dex */
public class UnityBannerEventAdapter implements IUnityEventAdapter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediationBannerListener f19158attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MediationBannerAdapter f19159saneness;

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f19160attabal;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f19160attabal = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19160attabal[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19160attabal[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19160attabal[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19160attabal[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public UnityBannerEventAdapter(MediationBannerListener mediationBannerListener, MediationBannerAdapter mediationBannerAdapter) {
        this.f19158attabal = mediationBannerListener;
        this.f19159saneness = mediationBannerAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f19158attabal == null) {
            return;
        }
        int i = attabal.f19160attabal[adEvent.ordinal()];
        if (i == 1) {
            this.f19158attabal.onAdLoaded(this.f19159saneness);
            return;
        }
        if (i == 2) {
            this.f19158attabal.onAdOpened(this.f19159saneness);
            return;
        }
        if (i == 3) {
            this.f19158attabal.onAdClicked(this.f19159saneness);
        } else if (i == 4) {
            this.f19158attabal.onAdClosed(this.f19159saneness);
        } else {
            if (i != 5) {
                return;
            }
            this.f19158attabal.onAdLeftApplication(this.f19159saneness);
        }
    }
}
