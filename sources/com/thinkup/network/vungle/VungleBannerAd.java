package com.thinkup.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class VungleBannerAd extends VungleTUBanner {
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BannerAd f42627n;
    private final String o = "VungleBannerAd";
    private View o0;
    private BannerAdSize oo;

    public VungleBannerAd(String str, String str2, String str3) {
        BannerAdSize bannerAdSize = BannerAdSize.BANNER;
        this.oo = bannerAdSize;
        this.m = str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("1")) {
            this.oo = BannerAdSize.VUNGLE_MREC;
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.oo = bannerAdSize;
            return;
        }
        str2.getClass();
        switch (str2) {
            case "2":
                this.oo = bannerAdSize;
                break;
            case "3":
                this.oo = BannerAdSize.BANNER_SHORT;
                break;
            case "4":
                this.oo = BannerAdSize.BANNER_LEADERBOARD;
                break;
            default:
                this.oo = bannerAdSize;
                break;
        }
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public void destroy() {
        BannerAd bannerAd = this.f42627n;
        if (bannerAd != null) {
            bannerAd.setAdListener(null);
            this.f42627n.finishAd();
            this.f42627n = null;
        }
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public View getBannerView() {
        BannerAd bannerAd;
        if (this.o0 == null && (bannerAd = this.f42627n) != null) {
            this.o0 = bannerAd.getBannerView();
        }
        return this.o0;
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public boolean isAdReady() {
        BannerAd bannerAd = this.f42627n;
        if (bannerAd != null) {
            return bannerAd.canPlayAd().booleanValue();
        }
        return false;
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public void loadAd(Context context, final String str, final TUCustomLoadListener tUCustomLoadListener, final CustomBannerAdapter customBannerAdapter) throws Throwable {
        BannerAd bannerAd = new BannerAd(context, str, this.oo);
        this.f42627n = bannerAd;
        bannerAd.setAdListener(new BannerAdListener() { // from class: com.thinkup.network.vungle.VungleBannerAd.1
            @Override // com.vungle.ads.BaseAdListener
            public final void onAdClicked(BaseAd baseAd) {
                if (customBannerAdapter != null) {
                    String unused = VungleBannerAd.this.o;
                    Objects.toString(customBannerAdapter.mImpressionEventListener);
                    CustomBannerEventListener customBannerEventListener = customBannerAdapter.mImpressionEventListener;
                    if (customBannerEventListener != null) {
                        customBannerEventListener.onBannerAdClicked();
                    }
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdEnd(BaseAd baseAd) {
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
                String unused = VungleBannerAd.this.o;
                vungleError.getCode();
                vungleError.getLocalizedMessage();
                TUCustomLoadListener tUCustomLoadListener2 = tUCustomLoadListener;
                if (tUCustomLoadListener2 != null) {
                    tUCustomLoadListener2.onAdLoadError(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdImpression(BaseAd baseAd) {
                if (customBannerAdapter != null) {
                    String unused = VungleBannerAd.this.o;
                    Objects.toString(customBannerAdapter.mImpressionEventListener);
                    CustomBannerEventListener customBannerEventListener = customBannerAdapter.mImpressionEventListener;
                    if (customBannerEventListener != null) {
                        customBannerEventListener.onBannerAdShow();
                    }
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdLeftApplication(BaseAd baseAd) {
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdLoaded(BaseAd baseAd) {
                String unused = VungleBannerAd.this.o;
                baseAd.canPlayAd();
                if (baseAd.canPlayAd().booleanValue()) {
                    TUCustomLoadListener tUCustomLoadListener2 = tUCustomLoadListener;
                    if (tUCustomLoadListener2 != null) {
                        tUCustomLoadListener2.onAdCacheLoaded(new com.thinkup.core.api.BaseAd[0]);
                        return;
                    }
                    return;
                }
                TUCustomLoadListener tUCustomLoadListener3 = tUCustomLoadListener;
                if (tUCustomLoadListener3 != null) {
                    tUCustomLoadListener3.onAdLoadError("", "Load success but couldn't play banner");
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdStart(BaseAd baseAd) {
                String unused = VungleBannerAd.this.o;
            }
        });
        this.f42627n.load(this.m);
    }
}
