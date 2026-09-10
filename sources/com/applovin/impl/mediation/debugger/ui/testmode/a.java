package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.g3;
import com.applovin.impl.p3;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Yf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f8621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f8622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f8623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f8624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f8625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f8626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f8627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f8628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f8629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f8630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8631k;
    private AdControlButton l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f8632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f8633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f8634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f8635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f8636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f8637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f8638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f8639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f8640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f8641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f8642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f8643x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0011a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f8644a;

        public C0011a(MaxNativeAdView maxNativeAdView) {
            this.f8644a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f8628h != null) {
                a.this.f8629i.destroy(a.this.f8628h);
            }
            a.this.f8628h = maxAd;
            a.this.f8629i.render(this.f8644a, maxAd);
            a.this.f8640u.removeAllViews();
            a.this.f8640u.addView(this.f8644a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f8621a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f8621a.m();
        this.f8631k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f8622b.A0(), this);
        this.f8627g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
        this.f8627g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f8635p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f8635p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.p3
    public l getSdk() {
        return this.f8622b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f8621a.x() == null || !this.f8621a.x().containsKey(maxAdFormat)) ? this.f8621a.m() : (String) this.f8621a.x().get(maxAdFormat);
    }

    public void initialize(g3 g3Var) {
        this.f8621a = g3Var;
        this.f8622b = g3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        q7.a(Yf.f28050f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        q7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        q7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        q7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        q7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        q7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        q7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f8623c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f8624d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8625e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8626f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8627g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8629i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f8643x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f8643x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f8621a == null) {
            p.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f8621a.g() + " Test Ads");
        this.f8630j = this.f8622b.u0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f8637r = (Button) findViewById(R.id.show_mrec_button);
        this.f8638s = (Button) findViewById(R.id.show_native_button);
        if (this.f8621a.I() && this.f8621a.r().contains(MaxAdFormat.MREC)) {
            this.f8640u.setVisibility(8);
            this.f8637r.setBackgroundColor(-1);
            this.f8638s.setBackgroundColor(-3355444);
            final int i10 = 0;
            this.f8637r.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f8647b;

                {
                    this.f8647b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = i10;
                    a aVar = this.f8647b;
                    switch (i11) {
                        case 0:
                            aVar.a(view);
                            break;
                        case 1:
                            aVar.b(view);
                            break;
                        case 2:
                            aVar.c(view);
                            break;
                        default:
                            aVar.d(view);
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.f8638s.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f8647b;

                {
                    this.f8647b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i11;
                    a aVar = this.f8647b;
                    switch (i12) {
                        case 0:
                            aVar.a(view);
                            break;
                        case 1:
                            aVar.b(view);
                            break;
                        case 2:
                            aVar.c(view);
                            break;
                        default:
                            aVar.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f8637r.setVisibility(8);
            this.f8638s.setVisibility(8);
        }
        this.f8641v = (Switch) findViewById(R.id.native_banner_switch);
        this.f8642w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f8621a.J()) {
            final int i12 = 2;
            this.f8641v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f8647b;

                {
                    this.f8647b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i12;
                    a aVar = this.f8647b;
                    switch (i13) {
                        case 0:
                            aVar.a(view);
                            break;
                        case 1:
                            aVar.b(view);
                            break;
                        case 2:
                            aVar.c(view);
                            break;
                        default:
                            aVar.d(view);
                            break;
                    }
                }
            });
            final int i13 = 3;
            this.f8642w.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f8647b;

                {
                    this.f8647b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i13;
                    a aVar = this.f8647b;
                    switch (i14) {
                        case 0:
                            aVar.a(view);
                            break;
                        case 1:
                            aVar.b(view);
                            break;
                        case 2:
                            aVar.c(view);
                            break;
                        default:
                            aVar.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f8641v.setVisibility(8);
            this.f8642w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f8621a.e()) || this.f8621a.d() == null || this.f8621a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f8621a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f8621a.d().size());
        for (MaxAdFormat maxAdFormat : this.f8621a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f8621a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f8643x = map;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8622b.u0().a(this.f8630j);
        MaxAdView maxAdView = this.f8623c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f8624d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f8625e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8627g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8629i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f8628h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f8629i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f8624d.removeAllViews();
        this.f8632m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f8640u.setVisibility(0);
        this.f8639t.setVisibility(8);
        this.f8638s.setBackgroundColor(-1);
        this.f8637r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f8623c.removeAllViews();
        this.l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f8639t.setVisibility(0);
        this.f8640u.setVisibility(8);
        this.f8637r.setBackgroundColor(-1);
        this.f8638s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f8640u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f8621a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f8629i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8629i.setNativeAdListener(new C0011a(maxNativeAdView));
            this.f8629i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f8636q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8636q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f8640u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f8624d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f8625e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f8626f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f8627g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f8629i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f8623c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f8639t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f8621a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f8622b.A0(), this);
            this.f8624d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8624d.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8624d.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8624d.stopAutoRefresh();
            this.f8624d.setListener(this);
            this.f8639t.addView(this.f8624d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f8632m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8632m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f8639t.setVisibility(8);
    }

    private void b() {
        List listR = this.f8621a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f8622b.A0(), this);
            this.f8625e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8625e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f8633n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8633n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f8621a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f8622b.A0(), this);
            this.f8623c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f8623c.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8623c.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8623c.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8623c.stopAutoRefresh();
            this.f8623c.setListener(this);
            frameLayout.addView(this.f8623c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f8621a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8625e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8626f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8627g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f8621a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f8641v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f8642w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f8622b.u0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f8622b.u0().a(this.f8621a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f8623c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f8624d.loadAd();
            this.f8637r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8625e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8626f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8627g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8629i.loadAd();
            this.f8638s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f8632m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f8633n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f8634o;
            }
            if (str.equals(this.f8631k)) {
                return this.f8635p;
            }
            if (str.equals("test_mode_native")) {
                return this.f8636q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.l;
    }
}
