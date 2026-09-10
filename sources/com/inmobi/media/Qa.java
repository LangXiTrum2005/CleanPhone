package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.Qa;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final class Qa extends V1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f23109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qa(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.f(window, "window");
        Intrinsics.f(config, "config");
        this.f23109b = window;
        this.f23110c = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [A.A] */
    @Override // com.inmobi.media.InterfaceC3169p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = this.f23109b.getDecorView().getWidth();
        int height = this.f23109b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.e(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int layerType = this.f23109b.getDecorView().getLayerType();
        this.f23109b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f23109b, rect, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: A.A
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i2) {
                Qa.a(booleanRef, this, i2);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f23110c.get()) {
            Thread.sleep(500L);
        }
        String message = "success - " + booleanRef.X + " - time - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        Intrinsics.f(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this.f23109b.getDecorView().setLayerType(layerType, null);
        if (!booleanRef.X) {
            return null;
        }
        Log.i("PixelCopyScreenShotProcess", "success");
        return a(bitmapCreateBitmap);
    }

    public static final void a(Ref.BooleanRef isSuccess, Qa this$0, int i2) {
        Intrinsics.f(isSuccess, "$isSuccess");
        Intrinsics.f(this$0, "this$0");
        if (i2 == 0) {
            isSuccess.X = true;
        }
        String message = "capture result - success - " + isSuccess.X;
        Intrinsics.f(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this$0.f23110c.set(true);
    }
}
