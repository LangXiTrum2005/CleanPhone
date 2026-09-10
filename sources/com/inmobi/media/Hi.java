package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Hi extends AbstractC3239t2 {
    public final WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hi(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View adView = (View) this.b.get();
        if (adView == null) {
            System.currentTimeMillis();
            return null;
        }
        Intrinsics.checkNotNullParameter(adView, "adView");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(bitmapCreateBitmap);
    }
}
