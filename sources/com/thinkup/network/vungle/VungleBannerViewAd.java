package com.thinkup.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class VungleBannerViewAd extends VungleTUBanner {
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private VungleBannerView f42629n;
    private final String o = "VungleBannerViewAd";
    private FrameLayout o0;
    private boolean om;
    private VungleAdSize oo;

    public VungleBannerViewAd(Context context, Map<String, Object> map, String str, String str2) {
        VungleAdSize vungleAdSize = VungleAdSize.BANNER;
        this.oo = vungleAdSize;
        this.m = str2;
        byte b2 = 0;
        this.om = false;
        this.o0 = new FrameLayout(context);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                if (!str.equals("0")) {
                    b2 = -1;
                }
                break;
            case 49:
            default:
                b2 = -1;
                break;
            case 50:
                b2 = !str.equals("2") ? (byte) -1 : (byte) 1;
                break;
            case AD_REWARD_USER_VALUE:
                b2 = !str.equals("3") ? (byte) -1 : (byte) 2;
                break;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                b2 = !str.equals("4") ? (byte) -1 : (byte) 3;
                break;
            case 53:
                b2 = !str.equals("5") ? (byte) -1 : (byte) 4;
                break;
        }
        switch (b2) {
            case 0:
                this.oo = VungleAdSize.MREC;
                break;
            case 1:
                this.oo = vungleAdSize;
                break;
            case 2:
                this.oo = VungleAdSize.BANNER_SHORT;
                break;
            case 3:
                this.oo = VungleAdSize.BANNER_LEADERBOARD;
                break;
            case 4:
                if (map != null) {
                    int iPx2dip = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
                    int iPx2dip2 = 50;
                    try {
                        iPx2dip = map.containsKey("key_width") ? px2dip(context, Integer.parseInt(map.get("key_width").toString())) : iPx2dip;
                        if (map.containsKey("key_height")) {
                            iPx2dip2 = px2dip(context, Integer.parseInt(map.get("key_height").toString()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    this.oo = VungleAdSize.getAdSizeWithWidthAndHeight(iPx2dip, iPx2dip2);
                }
                break;
        }
    }

    public static /* synthetic */ boolean m(VungleBannerViewAd vungleBannerViewAd) {
        vungleBannerViewAd.om = true;
        return true;
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public void destroy() {
        VungleBannerView vungleBannerView = this.f42629n;
        if (vungleBannerView != null) {
            vungleBannerView.setAdListener(null);
            this.f42629n.finishAd();
            this.f42629n = null;
        }
        FrameLayout frameLayout = this.o0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.o0 = null;
        }
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public View getBannerView() {
        return this.o0;
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public boolean isAdReady() {
        return this.f42629n != null && this.om;
    }

    @Override // com.thinkup.network.vungle.VungleTUBanner
    public void loadAd(Context context, final String str, final TUCustomLoadListener tUCustomLoadListener, final CustomBannerAdapter customBannerAdapter) throws Throwable {
        this.om = false;
        this.f42629n = new VungleBannerView(context, str, this.oo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.o0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.o0.addView(this.f42629n, layoutParams);
        }
        this.f42629n.setAdListener(new BannerAdListener() { // from class: com.thinkup.network.vungle.VungleBannerViewAd.1
            @Override // com.vungle.ads.BaseAdListener
            public final void onAdClicked(BaseAd baseAd) {
                if (customBannerAdapter != null) {
                    String unused = VungleBannerViewAd.this.o;
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
                String unused = VungleBannerViewAd.this.o;
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
                    String unused = VungleBannerViewAd.this.o;
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
                String unused = VungleBannerViewAd.this.o;
                baseAd.canPlayAd();
                if (!baseAd.canPlayAd().booleanValue()) {
                    TUCustomLoadListener tUCustomLoadListener2 = tUCustomLoadListener;
                    if (tUCustomLoadListener2 != null) {
                        tUCustomLoadListener2.onAdLoadError("", "Load success but couldn't play banner");
                        return;
                    }
                    return;
                }
                VungleBannerViewAd.m(VungleBannerViewAd.this);
                TUCustomLoadListener tUCustomLoadListener3 = tUCustomLoadListener;
                if (tUCustomLoadListener3 != null) {
                    tUCustomLoadListener3.onAdCacheLoaded(new com.thinkup.core.api.BaseAd[0]);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public final void onAdStart(BaseAd baseAd) {
                String unused = VungleBannerViewAd.this.o;
            }
        });
        this.f42629n.load(this.m);
    }

    public int px2dip(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }
}
