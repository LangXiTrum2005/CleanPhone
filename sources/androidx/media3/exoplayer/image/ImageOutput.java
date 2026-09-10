package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageOutput f6254a = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.image.ImageOutput$1, reason: invalid class name */
    public class AnonymousClass1 implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
