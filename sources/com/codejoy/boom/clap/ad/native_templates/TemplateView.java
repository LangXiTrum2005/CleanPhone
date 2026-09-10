package com.codejoy.boom.clap.ad.native_templates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.impassible;
import com.codejoy.boom.clap.polloi;
import com.codejoy.boom.clap.triweekly;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.unity3d.services.UnityAdsConstants;
import complexometry.kowloon;
import orometer.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateView extends FrameLayout {
    private static final String MEDIUM_TEMPLATE = "medium_template";
    private static final String SMALL_TEMPLATE = "small_template";
    private ConstraintLayout background;
    private TextView callToActionView;
    private View holderAdView;
    private ImageView iconView;
    private MediaView mediaView;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private TextView primaryView;
    private saneness styles;
    private int templateType;
    private TextView tertiaryView;

    public TemplateView(Context context) {
        super(context);
    }

    private boolean adHasOnlyStore(NativeAd nativeAd) {
        return !TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    private void applyStyles() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable colorDrawableMarial = this.styles.marial();
        if (colorDrawableMarial != null) {
            TextView textView13 = this.primaryView;
            if (textView13 != null) {
                textView13.setBackground(colorDrawableMarial);
            }
            TextView textView14 = this.tertiaryView;
            if (textView14 != null) {
                textView14.setBackground(colorDrawableMarial);
            }
        }
        Typeface typefaceImpromptu = this.styles.impromptu();
        if (typefaceImpromptu != null && (textView12 = this.primaryView) != null) {
            textView12.setTypeface(typefaceImpromptu);
        }
        Typeface typefaceFormularize = this.styles.formularize();
        if (typefaceFormularize != null && (textView11 = this.tertiaryView) != null) {
            textView11.setTypeface(typefaceFormularize);
        }
        Typeface typefaceDern = this.styles.dern();
        if (typefaceDern != null && (textView10 = this.callToActionView) != null) {
            textView10.setTypeface(typefaceDern);
        }
        if (this.styles.taiyuan() != null && (textView9 = this.primaryView) != null) {
            textView9.setTextColor(this.styles.taiyuan().intValue());
        }
        if (this.styles.impassible() != null && (textView8 = this.tertiaryView) != null) {
            textView8.setTextColor(this.styles.impassible().intValue());
        }
        if (this.styles.wireman() != null && (textView7 = this.callToActionView) != null) {
            textView7.setTextColor(this.styles.wireman().intValue());
        }
        float fSaneness = this.styles.saneness();
        if (fSaneness > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView6 = this.callToActionView) != null) {
            textView6.setTextSize(fSaneness);
        }
        float fCompetently = this.styles.competently();
        if (fCompetently > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView5 = this.primaryView) != null) {
            textView5.setTextSize(fCompetently);
        }
        float fApical = this.styles.apical();
        if (fApical > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView4 = this.tertiaryView) != null) {
            textView4.setTextSize(fApical);
        }
        ColorDrawable colorDrawableAttabal = this.styles.attabal();
        if (colorDrawableAttabal != null && (textView3 = this.callToActionView) != null) {
            textView3.setBackground(colorDrawableAttabal);
        }
        ColorDrawable colorDrawableBeachfront = this.styles.beachfront();
        if (colorDrawableBeachfront != null && (textView2 = this.primaryView) != null) {
            textView2.setBackground(colorDrawableBeachfront);
        }
        ColorDrawable colorDrawableCutely = this.styles.cutely();
        if (colorDrawableCutely != null && (textView = this.tertiaryView) != null) {
            textView.setBackground(colorDrawableCutely);
        }
        invalidate();
        requestLayout();
    }

    private void initView(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, polloi.TemplateView, 0, 0);
        try {
            this.templateType = typedArrayObtainStyledAttributes.getResourceId(polloi.TemplateView_gnt_template_type, triweekly.native_template3_view);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType, this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void changeTemplateType(int i) {
        try {
            removeAllViews();
            ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i, this);
            onFinishInflate();
        } catch (Exception unused) {
        }
    }

    public void destroyNativeAdIfNeed() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.nativeAd = null;
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public String getTemplateTypeName() {
        return "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nativeAdView = (NativeAdView) findViewById(impassible.native_ad_view);
        this.holderAdView = findViewById(impassible.holder);
        this.primaryView = (TextView) findViewById(impassible.primary);
        this.tertiaryView = (TextView) findViewById(impassible.body);
        this.callToActionView = (TextView) findViewById(impassible.cta);
        this.iconView = (ImageView) findViewById(impassible.icon);
        this.mediaView = (MediaView) findViewById(impassible.media_view);
        this.background = (ConstraintLayout) findViewById(impassible.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
        this.holderAdView.setVisibility(8);
        this.nativeAdView.setVisibility(0);
        nativeAd.getStore();
        nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        nativeAd.getStarRating();
        kowloon icon = nativeAd.getIcon();
        this.nativeAdView.setCallToActionView(this.callToActionView);
        this.nativeAdView.setHeadlineView(this.primaryView);
        this.primaryView.setText(headline);
        this.callToActionView.setText(callToAction);
        ImageView imageView = this.iconView;
        if (imageView != null) {
            if (icon != null) {
                imageView.setVisibility(0);
                this.iconView.setImageDrawable(icon.getDrawable());
                this.nativeAdView.setIconView(this.iconView);
            } else {
                imageView.setVisibility(8);
            }
        }
        TextView textView = this.tertiaryView;
        if (textView != null) {
            textView.setText(body);
            this.nativeAdView.setBodyView(this.tertiaryView);
        }
        this.nativeAdView.registerNativeAd(nativeAd, this.mediaView);
    }

    public void setStyles(saneness sanenessVar) {
        this.styles = sanenessVar;
        applyStyles();
    }

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public TemplateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }

    public TemplateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context, attributeSet);
    }
}
