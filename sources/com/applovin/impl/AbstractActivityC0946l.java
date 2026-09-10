package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import com.p004ironsource.sv;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0946l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C0968w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0950n f11024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i8 f11025c;
    private C0948m d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f11026e;
    private MaxInterstitialAd f;
    private MaxAppOpenAd g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f11027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f11028i;
    private MaxNativeAdLoader j;
    private MaxAd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f11029l;
    private List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f11030n;
    private View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f11031p;
    private TextView q;
    private C0968w r;

    /* JADX INFO: renamed from: com.applovin.impl.l$a */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC0946l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC0946l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC0946l.this.k != null) {
                AbstractActivityC0946l.this.j.destroy(AbstractActivityC0946l.this.k);
            }
            AbstractActivityC0946l.this.k = maxAd;
            AbstractActivityC0946l.this.j.render(AbstractActivityC0946l.this.f11028i, maxAd);
            AbstractActivityC0946l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11023a;
    }

    public void initialize(C0950n c0950n, C0952o c0952o, i8 i8Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f11023a = kVar;
        this.f11024b = c0950n;
        this.f11025c = i8Var;
        this.m = kVar.s0().b();
        C0948m c0948m = new C0948m(c0950n, c0952o, i8Var, this);
        this.d = c0948m;
        c0948m.a(new U(this, kVar, c0950n, c0952o));
        b();
        if (c0950n.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = kVar.U().a(c0950n.c())) == null || listA.isEmpty()) {
                return;
            }
            this.r = new C0968w(listA, c0950n.a(), getApplicationContext(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        n7.a(sv.f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f11031p.setControlState(AdControlButton.b.LOAD);
        this.q.setText("");
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f11031p.setControlState(AdControlButton.b.LOAD);
        this.q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f11031p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f11026e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f11024b.a()) {
            a(this.f11028i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C0968w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f11026e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f11027h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f11023a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.d.j() != this.f11024b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f11024b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            C0968w c0968w = this.r;
            if (c0968w != null) {
                c0968w.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.f11030n = (ListView) findViewById(R.id.listView);
        this.o = findViewById(R.id.ad_presenter_view);
        this.f11031p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.q = (TextView) findViewById(R.id.status_textview);
        this.f11030n.setAdapter((ListAdapter) this.d);
        this.q.setText(a());
        this.q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f11031p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f11025c != null) {
            this.f11023a.s0().a(this.m);
        }
        MaxAdView maxAdView = this.f11026e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f11027h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, C0950n c0950n, C0952o c0952o, j2 j2Var, r2 r2Var) {
        if (r2Var instanceof C0948m.b) {
            AbstractC0930d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new U(r2Var, c0950n, c0952o, kVar));
        }
    }

    private void b() {
        String strC = this.f11024b.c();
        if (this.f11024b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f11024b.a());
            this.f11026e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f11026e.setExtraParameter("disable_auto_retries", com.p004ironsource.mediationsdk.metadata.a.g);
            this.f11026e.setExtraParameter("disable_precache", com.p004ironsource.mediationsdk.metadata.a.g);
            this.f11026e.setExtraParameter("allow_pause_auto_refresh_immediately", com.p004ironsource.mediationsdk.metadata.a.g);
            this.f11026e.stopAutoRefresh();
            this.f11026e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f11024b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.p004ironsource.mediationsdk.metadata.a.g);
            this.f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f11024b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", com.p004ironsource.mediationsdk.metadata.a.g);
            this.g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f11024b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f11027h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.p004ironsource.mediationsdk.metadata.a.g);
            this.f11027h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f11024b.a()) {
            this.f11028i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.p004ironsource.mediationsdk.metadata.a.g);
            this.j.setNativeAdListener(new a());
            this.j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, C0950n c0950n, C0952o c0952o, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c0950n, c0952o, ((C0948m.b) r2Var).v(), kVar);
    }

    @Override // com.applovin.impl.C0968w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f11026e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f11027h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f11025c;
        sb.append(i8Var != null ? i8Var.b().a() : this.d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f11025c != null) {
            this.f11023a.s0().a(this.f11025c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f11026e.setPlacement("[Mediation Debugger Live Ad]");
            this.f11026e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f11024b.a()) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f11024b.a()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f11024b.a()) {
            this.f11027h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f11024b.a()) {
            this.j.setPlacement("[Mediation Debugger Live Ad]");
            this.j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f11029l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f11029l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.T
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.X.a(dialogInterface);
            }
        });
        this.f11029l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f11029l = null;
    }

    private String a() {
        if (this.f11023a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.d.j() != this.f11024b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f11025c;
        sb.append(i8Var != null ? i8Var.b().a() : this.d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f11026e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f11024b.a()) {
            this.f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f11024b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f11024b.a()) {
            this.f11027h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f11024b.a()) {
            a(this.f11028i, MaxAdFormat.MREC.getSize());
        }
    }
}
