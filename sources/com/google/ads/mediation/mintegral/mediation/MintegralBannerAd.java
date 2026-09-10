package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import android.view.View;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralBannerAd extends BannerAdWithCodeListener implements MediationBannerAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MBBannerView f18996arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18997kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationBannerAdCallback f18998monoploid;

    public MintegralBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18997kowloon = mediationAdLoadCallback;
    }

    public static BannerSize getMintegralBannerSizeFromAdMobAdSize(AdSize adSize, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(AdSize.MEDIUM_RECTANGLE_WIDTH, AdSize.MEDIUM_RECTANGLE_HEIGHT));
        arrayList.add(new AdSize(AdSize.LEADERBOARD_WIDTH, 90));
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        BannerSize bannerSize = null;
        if (adSizeFindClosestSize == null) {
            if (z) {
            }
            return bannerSize;
        }
        adSize = adSizeFindClosestSize;
        bannerSize = adSize.equals(AdSize.BANNER) ? new BannerSize(4, 0, 0) : null;
        if (adSize.equals(AdSize.MEDIUM_RECTANGLE)) {
            bannerSize = new BannerSize(2, 0, 0);
        }
        if (adSize.equals(AdSize.LEADERBOARD)) {
            bannerSize = new BannerSize(3, adSize.getWidth(), 0);
        }
        if (bannerSize == null) {
            return new BannerSize(5, adSize.getWidth(), adSize.getHeight());
        }
        return bannerSize;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void closeFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18996arytenoidectomy;
    }

    public abstract void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onClick(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onCloseBanner(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLeaveApp(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        this.f18997kowloon.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds) {
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback = this.f18997kowloon;
        if (mediationAdLoadCallback != null) {
            this.f18998monoploid = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLogImpression(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void showFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18998monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }
}
