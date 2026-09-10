package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class SO extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SO(Context context) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        if (imageView == null) {
            AbstractC2995aW.x0("imageView");
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            AbstractC2995aW.x0("imageView");
            throw null;
        }
        imageView2.setAdjustViewBounds(true);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            AbstractC2995aW.x0("imageView");
            throw null;
        }
        addView(imageView3);
        requestLayout();
    }

    public final void destroy() {
        try {
            ImageView imageView = this.imageView;
            if (imageView == null) {
                AbstractC2995aW.x0("imageView");
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
                AbstractC2995aW.x0("imageView");
                throw null;
            }
            imageView2.setImageDrawable(null);
            ImageView imageView3 = this.imageView;
            if (imageView3 == null) {
                AbstractC2995aW.x0("imageView");
                throw null;
            }
            if (imageView3.getParent() != null) {
                ImageView imageView4 = this.imageView;
                if (imageView4 == null) {
                    AbstractC2995aW.x0("imageView");
                    throw null;
                }
                ViewParent parent = imageView4.getParent();
                AbstractC2995aW.o(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                ImageView imageView5 = this.imageView;
                if (imageView5 != null) {
                    viewGroup.removeView(imageView5);
                } else {
                    AbstractC2995aW.x0("imageView");
                    throw null;
                }
            }
        } catch (Exception e) {
            C4917wJ.Companion.w("NativeAd", "error msg: " + e.getLocalizedMessage());
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        AbstractC2995aW.x0("imageView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }
}
