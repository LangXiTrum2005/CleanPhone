package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralNativeAd extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f19004arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Campaign f19005kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationNativeAdCallback f19006monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f19007polloi;

    public class MBridgeNativeMappedImage extends NativeAd.Image {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Drawable f19008attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final double f19009dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Uri f19010saneness;

        public MBridgeNativeMappedImage(Drawable drawable, Uri uri, double d) {
            this.f19008attabal = drawable;
            this.f19010saneness = uri;
            this.f19009dern = d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f19008attabal;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f19009dern;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f19010saneness;
        }
    }

    public MintegralNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f19007polloi = MintegralUtils.shouldMuteAudio(mediationNativeAdConfiguration.getMediationExtras());
        this.f19004arytenoidectomy = mediationAdLoadCallback;
    }

    public void attabal(Campaign campaign, Context context) {
        MintegralNativeAd mintegralNativeAd;
        this.f19005kowloon = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.f19005kowloon.getAppName());
        }
        if (this.f19005kowloon.getAppDesc() != null) {
            setBody(this.f19005kowloon.getAppDesc());
        }
        if (this.f19005kowloon.getAdCall() != null) {
            setCallToAction(this.f19005kowloon.getAdCall());
        }
        setStarRating(Double.valueOf(this.f19005kowloon.getRating()));
        if (TextUtils.isEmpty(this.f19005kowloon.getIconUrl())) {
            mintegralNativeAd = this;
        } else {
            mintegralNativeAd = this;
            setIcon(mintegralNativeAd.new MBridgeNativeMappedImage(null, Uri.parse(this.f19005kowloon.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!mintegralNativeAd.f19007polloi);
        mBMediaView.setNativeAd(mintegralNativeAd.f19005kowloon);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(mintegralNativeAd.f19005kowloon);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    public abstract void loadAd(MediationNativeAdConfiguration mediationNativeAdConfiguration);

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    public List saneness(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    arrayList.addAll(saneness(viewGroup.getChildAt(i)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }
}
