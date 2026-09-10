package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.cm1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/B\u0019\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b.\u00102B!\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b.\u00104B)\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\b.\u00106J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR(\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u000fR(\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u000fR(\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u000fR(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u0018\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00067"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/BaseAdAssetViewContainer;", "Landroid/widget/FrameLayout;", "", "destroy", "()V", "Landroid/view/View;", "child", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "removeView", "(Landroid/view/View;)V", "removeAllViews", "bringChildToFront", "Lads_mobile_sdk/cm1;", "a", "Lads_mobile_sdk/cm1;", "getNativeAdViewContainer", "()Lads_mobile_sdk/cm1;", "nativeAdViewContainer", "value", "getHeadlineView", "()Landroid/view/View;", "setHeadlineView", "headlineView", "getCallToActionView", "setCallToActionView", "callToActionView", "getIconView", "setIconView", "iconView", "getStarRatingView", "setStarRatingView", "starRatingView", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesView;", "getAdChoicesView", "()Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesView;", "setAdChoicesView", "(Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesView;)V", "adChoicesView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class BaseAdAssetViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final cm1 nativeAdViewContainer;
    private final FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdAssetViewContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayoutA = a(context);
        this.b = frameLayoutA;
        this.nativeAdViewContainer = new cm1(this, frameLayoutA);
    }

    private final FrameLayout a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        super.bringChildToFront(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View child) {
        super.bringChildToFront(child);
        if (Intrinsics.wireman(this.b, child)) {
            return;
        }
        super.bringChildToFront(this.b);
    }

    public final void destroy() {
        cm1 cm1Var = this.nativeAdViewContainer;
        synchronized (cm1Var) {
            try {
                if (cm1Var.d.get()) {
                    return;
                }
                InternalNativeAd internalNativeAd = cm1Var.i;
                if (internalNativeAd != null) {
                    cm1Var.c(internalNativeAd);
                }
                cm1Var.i = null;
                FrameLayout frameLayout = cm1Var.b;
                if (frameLayout != null) {
                    frameLayout.setOnClickListener(null);
                }
                FrameLayout frameLayout2 = cm1Var.b;
                if (frameLayout2 != null) {
                    frameLayout2.setOnTouchListener(null);
                }
                cm1Var.h.clear();
                FrameLayout frameLayout3 = cm1Var.b;
                if (frameLayout3 != null) {
                    frameLayout3.removeAllViews();
                }
                FrameLayout frameLayout4 = cm1Var.c;
                if (frameLayout4 != null) {
                    frameLayout4.removeAllViews();
                }
                cm1Var.e = null;
                cm1Var.b = null;
                cm1Var.c = null;
                cm1Var.d.set(true);
                cm1Var.g = null;
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AdChoicesView getAdChoicesView() {
        View viewB = this.nativeAdViewContainer.b("3011");
        if (viewB instanceof AdChoicesView) {
            return (AdChoicesView) viewB;
        }
        return null;
    }

    public final View getCallToActionView() {
        return this.nativeAdViewContainer.b("3002");
    }

    public final View getHeadlineView() {
        return this.nativeAdViewContainer.b("3001");
    }

    public final View getIconView() {
        return this.nativeAdViewContainer.b("3003");
    }

    public final cm1 getNativeAdViewContainer() {
        return this.nativeAdViewContainer;
    }

    public final View getStarRatingView() {
        return this.nativeAdViewContainer.b("3009");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (Intrinsics.wireman(this.b, view)) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        this.nativeAdViewContainer.a(adChoicesView, "3011");
    }

    public final void setCallToActionView(View view) {
        this.nativeAdViewContainer.a(view, "3002");
    }

    public final void setHeadlineView(View view) {
        this.nativeAdViewContainer.a(view, "3001");
    }

    public final void setIconView(View view) {
        this.nativeAdViewContainer.a(view, "3003");
    }

    public final void setStarRatingView(View view) {
        this.nativeAdViewContainer.a(view, "3009");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdAssetViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        FrameLayout frameLayoutA = a(context);
        this.b = frameLayoutA;
        this.nativeAdViewContainer = new cm1(this, frameLayoutA);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdAssetViewContainer(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        FrameLayout frameLayoutA = a(context);
        this.b = frameLayoutA;
        this.nativeAdViewContainer = new cm1(this, frameLayoutA);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdAssetViewContainer(Context context, AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        FrameLayout frameLayoutA = a(context);
        this.b = frameLayoutA;
        this.nativeAdViewContainer = new cm1(this, frameLayoutA);
    }
}
