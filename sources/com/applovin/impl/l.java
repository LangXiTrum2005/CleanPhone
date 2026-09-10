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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.ironsource.Yf;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends p3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f8319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k8 f8320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f8321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f8322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f8323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f8324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f8325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f8326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f8327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxAd f8328k;
    private r l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f8329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f8330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f8331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f8332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f8333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f8334r;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f8328k != null) {
                l.this.f8327j.destroy(l.this.f8328k);
            }
            l.this.f8328k = maxAd;
            l.this.f8327j.render(l.this.f8326i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8318a;
    }

    public void initialize(n nVar, @Nullable o oVar, @Nullable k8 k8Var, com.applovin.impl.sdk.l lVar) {
        List listA;
        this.f8318a = lVar;
        this.f8319b = nVar;
        this.f8320c = k8Var;
        this.f8329m = lVar.u0().b();
        m mVar = new m(nVar, oVar, k8Var, this);
        this.f8321d = mVar;
        mVar.a(new n9(this, lVar, nVar, oVar));
        b();
        if (nVar.f().f()) {
            if ((k8Var != null && !k8Var.b().d().C()) || (listA = lVar.W().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f8334r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
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
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f8332p.setControlState(AdControlButton.b.LOAD);
        this.f8333q.setText("");
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
        this.f8332p.setControlState(AdControlButton.b.LOAD);
        this.f8333q.setText("");
        if (204 == maxError.getCode()) {
            q7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        q7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f8333q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f8332p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f8322e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f8319b.a()) {
            a(this.f8326i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8322e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8323f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8324g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8325h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8327j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f8318a.u0().c()) {
            q7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f8321d.j() != this.f8319b.f()) {
            q7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f8319b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f8334r;
            if (wVar != null) {
                wVar.a();
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

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f8321d.k());
        this.f8330n = (ListView) findViewById(R.id.listView);
        this.f8331o = findViewById(R.id.ad_presenter_view);
        this.f8332p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f8333q = (TextView) findViewById(R.id.status_textview);
        this.f8330n.setAdapter((ListAdapter) this.f8321d);
        this.f8333q.setText(a());
        this.f8333q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8332p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f8331o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f8320c != null) {
            this.f8318a.u0().a(this.f8329m);
        }
        MaxAdView maxAdView = this.f8322e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f8323f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f8324g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8325h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8327j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f8328k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f8327j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    private void b() {
        String strC = this.f8319b.c();
        if (this.f8319b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f8319b.a());
            this.f8322e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f8322e.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8322e.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8322e.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8322e.stopAutoRefresh();
            this.f8322e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8319b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f8323f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8323f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8319b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f8324g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8324g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8319b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f8325h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8325h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f8319b.a()) {
            this.f8326i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.l.p());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f8327j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f29610g);
            this.f8327j.setNativeAdListener(new a());
            this.f8327j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.l lVar, n nVar, o oVar, l2 l2Var, t2 t2Var) {
        if (t2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new n9(t2Var, nVar, oVar, lVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(t2 t2Var, n nVar, o oVar, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) t2Var).v(), lVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8322e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8323f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8324g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8325h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8327j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        k8 k8Var = this.f8320c;
        sb2.append(k8Var != null ? k8Var.b().a() : this.f8321d.j().c());
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f8320c != null) {
            this.f8318a.u0().a(this.f8320c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f8322e.setPlacement("[Mediation Debugger Live Ad]");
            this.f8322e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8319b.a()) {
            this.f8323f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8319b.a()) {
            this.f8324g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8319b.a()) {
            this.f8325h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f8319b.a()) {
            this.f8327j.setPlacement("[Mediation Debugger Live Ad]");
            this.f8327j.loadAd();
        } else {
            q7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.m9
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8416a.a(dialogInterface);
            }
        });
        this.l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.l = null;
    }

    private String a() {
        if (this.f8318a.u0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f8321d.j() != this.f8319b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        k8 k8Var = this.f8320c;
        sb2.append(k8Var != null ? k8Var.b().a() : this.f8321d.j().c());
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f8322e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8319b.a()) {
            this.f8323f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8319b.a()) {
            this.f8324g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f8319b.a()) {
            this.f8325h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f8319b.a()) {
            a(this.f8326i, MaxAdFormat.MREC.getSize());
        }
    }
}
