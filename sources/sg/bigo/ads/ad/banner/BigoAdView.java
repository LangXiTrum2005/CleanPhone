package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InnerBannerAd;

/* JADX INFO: loaded from: classes7.dex */
public class BigoAdView extends sg.bigo.ads.api.a<sg.bigo.ads.core.adview.d> implements Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BannerAd f45513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdLoadListener<BigoAdView> f45514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup.LayoutParams f45515c;
    private final AdLoadListener<BannerAd> d;

    public BigoAdView(Context context) {
        super(context);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(Ad ad) {
                BigoAdView.this.f45513a = (BannerAd) ad;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(AdError adError) {
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.Ad
    public void destroy() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public AdBid getBid() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getExtraInfo(String str) {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.getExtraInfo(str);
        }
        return null;
    }

    public int getHeightInDP() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.getHeight();
        }
        return 0;
    }

    public int getWidthInDP() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.isExpired();
        }
        return false;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        new BannerAdLoader.Builder().withAdLoadListener(this.d).build().loadAd(bannerAdRequest);
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(adInteractionListener);
        }
    }

    public void setAdLoadListener(AdLoadListener<BigoAdView> adLoadListener) {
        this.f45514b = adLoadListener;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f45515c = layoutParams;
        a(false);
        super.setLayoutParams(layoutParams);
    }

    public BigoAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(Ad ad) {
                BigoAdView.this.f45513a = (BannerAd) ad;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(AdError adError) {
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onError(adError);
                }
            }
        };
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad) {
        BannerAd bannerAd = this.f45513a;
        if (bannerAd != null) {
            return bannerAd.compareTo(ad);
        }
        return 0;
    }

    public void loadAd(BannerAdRequest bannerAdRequest, String str) {
        new BannerAdLoader.Builder().withAdLoadListener(this.d).withExt(str).build().loadAd(bannerAdRequest);
    }

    public BigoAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(Ad ad) {
                BigoAdView.this.f45513a = (BannerAd) ad;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(AdError adError) {
                if (BigoAdView.this.f45514b != null) {
                    BigoAdView.this.f45514b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.a
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        BannerAd bannerAd = this.f45513a;
        if (!(bannerAd instanceof InnerBannerAd) || bannerAd.adView() == null) {
            return;
        }
        View viewAdView = this.f45513a.adView();
        int iA = sg.bigo.ads.common.utils.e.a(getContext(), this.f45513a.getWidth());
        int iA2 = sg.bigo.ads.common.utils.e.a(getContext(), this.f45513a.getHeight());
        BannerAd bannerAd2 = this.f45513a;
        if ((bannerAd2 instanceof i) && (((i) bannerAd2).f45566w instanceof e) && (layoutParams = this.f45515c) != null) {
            int i2 = -2 == layoutParams.width ? iA : 1;
            int i3 = -2 == layoutParams.height ? iA2 : 1;
            if (i2 != 1 || 1 == bannerAd2.getWidth()) {
                iA = i2;
            } else {
                int i4 = this.f45515c.width;
                if (-1 == i4 || i4 > 1) {
                    iA = i4;
                }
            }
            if (i3 != 1 || 1 == this.f45513a.getHeight()) {
                iA2 = i3;
            } else {
                int i5 = this.f45515c.height;
                if (-1 == i5 || i5 > 1) {
                    iA2 = i5;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = viewAdView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iA, iA2);
        } else {
            layoutParams2.width = iA;
            layoutParams2.height = iA2;
        }
        if (((InnerBannerAd) this.f45513a).getWebView() != null) {
            ViewGroup.LayoutParams layoutParams3 = ((InnerBannerAd) this.f45513a).getWebView().getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(iA, iA2);
            } else {
                layoutParams3.width = iA;
                layoutParams3.height = iA2;
            }
            ((InnerBannerAd) this.f45513a).getWebView().setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        viewAdView.setLayoutParams(layoutParams2);
        if (z2) {
            removeAllViews();
            addView(viewAdView);
        }
    }
}
