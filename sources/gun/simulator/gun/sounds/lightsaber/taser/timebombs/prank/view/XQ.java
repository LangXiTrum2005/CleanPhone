package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.RewardPlus;

/* JADX INFO: loaded from: classes4.dex */
public final class XQ extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final WQ Companion = new WQ(null);
    private ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQ(Context context) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int iDpToPixels = Th0.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        ImageView imageView = this.icon;
        if (imageView == null) {
            AbstractC2995aW.x0(RewardPlus.ICON);
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            addView(imageView2);
        } else {
            AbstractC2995aW.x0(RewardPlus.ICON);
            throw null;
        }
    }

    public final void destroy() {
        try {
            ImageView imageView = this.icon;
            if (imageView == null) {
                AbstractC2995aW.x0(RewardPlus.ICON);
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
                AbstractC2995aW.x0(RewardPlus.ICON);
                throw null;
            }
            imageView2.setImageDrawable(null);
            removeAllViews();
            if (getParent() != null) {
                ViewParent parent = getParent();
                AbstractC2995aW.o(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this);
            }
        } catch (Exception e) {
            C4917wJ.Companion.w("NativeAd", "error msg: " + e.getLocalizedMessage());
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        AbstractC2995aW.x0(RewardPlus.ICON);
        throw null;
    }

    public final void renderTo(FrameLayout frameLayout, int i) {
        AbstractC2995aW.q(frameLayout, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            AbstractC2995aW.o(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        frameLayout.addView(this);
        Th0 th0 = Th0.INSTANCE;
        Context context = getContext();
        AbstractC2995aW.p(context, com.umeng.analytics.pro.f.X);
        int iDpToPixels = th0.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        if (i == 0) {
            layoutParams.gravity = 8388659;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        initView(context);
    }
}
