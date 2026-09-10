package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\r\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/NativeAdOptionsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Landroid/widget/ImageView;", "destroy", "", "getPrivacyIcon", "getPrivacyIcon$vungle_ads_release", "initView", "renderTo", "rootView", "optionsPosition", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdOptionsView extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    private ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int iDpToPixels = ViewUtility.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        ImageView imageView = this.icon;
        if (imageView == null) {
            Intrinsics.m("icon");
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            addView(imageView2);
        } else {
            Intrinsics.m("icon");
            throw null;
        }
    }

    public final void destroy() {
        try {
            ImageView imageView = this.icon;
            if (imageView == null) {
                Intrinsics.m("icon");
                throw null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            ImageView imageView2 = this.icon;
            if (imageView2 == null) {
                Intrinsics.m("icon");
                throw null;
            }
            imageView2.setImageDrawable(null);
            removeAllViews();
            if (getParent() != null) {
                ViewParent parent = getParent();
                Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this);
            }
        } catch (Exception e2) {
            Logger.INSTANCE.w("NativeAd", "error msg: " + e2.getLocalizedMessage());
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m("icon");
        throw null;
    }

    public final void renderTo(FrameLayout rootView, @NativeAd.AdOptionsPosition int optionsPosition) {
        Intrinsics.f(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        Context context = getContext();
        Intrinsics.e(context, "context");
        int iDpToPixels = viewUtility.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        if (optionsPosition == 0) {
            layoutParams.gravity = 8388659;
        } else if (optionsPosition == 1) {
            layoutParams.gravity = 8388661;
        } else if (optionsPosition == 2) {
            layoutParams.gravity = 8388691;
        } else if (optionsPosition != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.f(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        initView(context);
    }
}
