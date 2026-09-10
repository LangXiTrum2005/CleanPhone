package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.n;
import com.applovin.impl.f3;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import defpackage.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f10366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f10367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f10368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f10369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f10370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f10371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f10372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f10373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f10374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f10375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f10376k;
    private final FrameLayout l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f10377m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f10378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10379b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f10378a = weakReference;
            this.f10379b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f10378a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                l.E0.Q();
                if (p.a()) {
                    l.E0.Q().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f10378a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10379b.getLayoutParams();
            layoutParams.height = ((View) this.f10379b.getParent()).getWidth();
            this.f10379b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    @Nullable
    public b getAdViewTracker() {
        return this.f10377m;
    }

    public TextView getAdvertiserTextView() {
        return this.f10368c;
    }

    public TextView getBodyTextView() {
        return this.f10369d;
    }

    public Button getCallToActionButton() {
        return this.f10370e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f10367b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f10368c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f10369d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f10370e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f10371f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f10372g;
    }

    public ImageView getIconImageView() {
        return this.f10371f;
    }

    public View getMainView() {
        return this.f10366a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f10376k;
        return viewGroup != null ? viewGroup : this.l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f10374i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f10373h;
        return viewGroup != null ? viewGroup : this.f10374i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f10375j;
    }

    public TextView getTitleTextView() {
        return this.f10367b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f10377m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        p.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f10377m;
        if (bVar != null) {
            bVar.a();
            this.f10377m = null;
        }
        View view = this.f10366a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f10366a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f10366a);
    }

    public void render(f3 f3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, l lVar) {
        recycle();
        if (!f3Var.y0().get() || !f3Var.x0().get()) {
            this.f10377m = new b(f3Var, this, interfaceC0010a, lVar);
        }
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (f3Var.z0() && nativeAd.isContainerClickable()) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new com.applovin.mediation.nativeAds.a(nativeAd, 0));
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            return "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException(e.n("Attempting to render MAX native ad with invalid template: ", str));
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f10367b.setText(maxNativeAd.getTitle());
        } else {
            this.f10367b.setVisibility(8);
        }
        if (this.f10368c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f10368c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f10368c.setVisibility(8);
            }
        }
        if (this.f10369d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f10369d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f10369d.setVisibility(8);
            } else {
                this.f10369d.setVisibility(4);
            }
        }
        if (this.f10370e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f10370e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f10370e.setVisibility(8);
            } else {
                this.f10370e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f10372g;
        if (frameLayout != null) {
            if (icon == null || this.f10371f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f10372g.removeAllViews();
                    this.f10372g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f10371f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f10372g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f10371f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f10374i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f10374i.addView(optionsView);
            this.f10374i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.l.setVisibility(8);
            }
        }
        if (this.f10375j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f10375j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10375j.addView(appLovinStarRatingView);
            } else {
                this.f10375j.setVisibility(8);
            }
        }
        b();
        postDelayed(new n(this, 12), 2000L);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f10366a = view;
        } else {
            if (z10) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f10366a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f10366a);
        this.f10367b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f10368c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f10369d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f10370e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f10371f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f10372g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f10373h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f10374i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f10375j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f10376k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f10367b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f10369d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f10368c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f10370e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f10371f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f10371f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f10371f, icon.getUri());
                } else {
                    this.f10371f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f10376k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10376k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f10373h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10373h.addView(optionsView);
                this.f10373h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f10375j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10375j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
