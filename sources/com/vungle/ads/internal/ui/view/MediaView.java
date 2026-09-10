package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\r\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "destroy", "", "getMainImage", "getMainImage$vungle_ads_release", "initView", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 13);
        ImageView imageView = this.imageView;
        if (imageView == null) {
            Intrinsics.m("imageView");
            throw null;
        }
        imageView.setLayoutParams(layoutParamsF);
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            Intrinsics.m("imageView");
            throw null;
        }
        imageView2.setAdjustViewBounds(true);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.m("imageView");
            throw null;
        }
        addView(imageView3);
        requestLayout();
    }

    public final void destroy() {
        try {
            ImageView imageView = this.imageView;
            if (imageView == null) {
                Intrinsics.m("imageView");
                throw null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                Intrinsics.m("imageView");
                throw null;
            }
            imageView2.setImageDrawable(null);
            ImageView imageView3 = this.imageView;
            if (imageView3 == null) {
                Intrinsics.m("imageView");
                throw null;
            }
            if (imageView3.getParent() != null) {
                ImageView imageView4 = this.imageView;
                if (imageView4 == null) {
                    Intrinsics.m("imageView");
                    throw null;
                }
                ViewParent parent = imageView4.getParent();
                Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                ImageView imageView5 = this.imageView;
                if (imageView5 != null) {
                    viewGroup.removeView(imageView5);
                } else {
                    Intrinsics.m("imageView");
                    throw null;
                }
            }
        } catch (Exception e2) {
            Logger.INSTANCE.w("NativeAd", "error msg: " + e2.getLocalizedMessage());
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m("imageView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.f(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        initView(context);
    }
}
