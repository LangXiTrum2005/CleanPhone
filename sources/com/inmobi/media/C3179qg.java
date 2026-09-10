package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.C3179qg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3179qg extends AbstractC3239t2 {
    public final Window b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3179qg(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: adsuki.yaounde
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                C3179qg.a(ref$BooleanRef, this, i);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.b.getDecorView().setLayerType(layerType, null);
        if (ref$BooleanRef.element) {
            return a(bitmapCreateBitmap);
        }
        return null;
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, C3179qg c3179qg, int i) {
        if (i == 0) {
            ref$BooleanRef.element = true;
        }
        boolean z = ref$BooleanRef.element;
        c3179qg.c.set(true);
    }
}
