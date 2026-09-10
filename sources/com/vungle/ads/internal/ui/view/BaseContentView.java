package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.NativeAdInternal;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseContentView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/ui/view/BaseContentView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/NativeAdInternal;", "internal", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/NativeAdInternal;)V", "", "render", "(Landroid/content/Context;)V", "destroy$vungle_ads_release", "()V", "destroy", "Lcom/vungle/ads/internal/NativeAdInternal;", "getInternal", "()Lcom/vungle/ads/internal/NativeAdInternal;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView$vungle_ads_release", "()Landroid/widget/ImageView;", "setImageView$vungle_ads_release", "(Landroid/widget/ImageView;)V", "Lmetairie/dern;", "nativeVideoListener", "Lmetairie/dern;", "getNativeVideoListener", "()Lmetairie/dern;", "setNativeVideoListener", "(Lmetairie/dern;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BaseContentView extends RelativeLayout {
    private ImageView imageView;
    private final NativeAdInternal internal;
    private metairie.dern nativeVideoListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentView(Context context, NativeAdInternal internal) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.internal = internal;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void destroy$vungle_ads_release() {
        removeAllViews();
        try {
            Result.Companion companion = Result.INSTANCE;
            ImageView imageView = this.imageView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: getImageView$vungle_ads_release, reason: from getter */
    public final ImageView getImageView() {
        return this.imageView;
    }

    public final NativeAdInternal getInternal() {
        return this.internal;
    }

    public final metairie.dern getNativeVideoListener() {
        return this.nativeVideoListener;
    }

    public void render(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.internal.displayMainImage(this.imageView);
        requestLayout();
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setNativeVideoListener(metairie.dern dernVar) {
        this.nativeVideoListener = dernVar;
    }
}
