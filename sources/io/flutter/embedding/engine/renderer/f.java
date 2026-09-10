package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f43222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f43223b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43224c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f43225d;

    public f(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f43225d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f43222a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.e
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image imageAcquireLatestImage;
                f fVar = this.f43221a;
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = fVar.f43225d;
                try {
                    imageAcquireLatestImage = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e10) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e10);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (flutterRenderer$ImageReaderSurfaceProducer2.released || fVar.f43224c) {
                    imageAcquireLatestImage.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, imageAcquireLatestImage);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
