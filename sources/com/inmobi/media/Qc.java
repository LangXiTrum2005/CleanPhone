package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Qc extends V1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f23112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qc(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        Intrinsics.f(adView, "adView");
        Intrinsics.f(adQualityConfig, "adQualityConfig");
        this.f23112b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.InterfaceC3169p0
    public final Object a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        View view = (View) this.f23112b.get();
        if (view == null) {
            Log.i("ScreenShotProcess", "view reference lost. aborting...");
            String message = "fail - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
            Intrinsics.f(message, "message");
            Log.i("ScreenShotProcess", message);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        String message2 = "success - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        Intrinsics.f(message2, "message");
        Log.i("ScreenShotProcess", message2);
        return a(bitmapCreateBitmap);
    }
}
