package mi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends View implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageReader f46027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Image f46028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f46029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f46030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10, int i11, int i12) {
        super(context, null);
        ImageReader imageReaderD = d(i10, i11);
        this.f46031e = false;
        this.f46033g = false;
        this.f46027a = imageReaderD;
        this.f46032f = i12;
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f46031e = r9.b.p(getContext());
    }

    public static ImageReader d(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i10 + ", set width=1");
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i11 + ", set height=1");
            i13 = 1;
        } else {
            i13 = i11;
        }
        return ImageReader.newInstance(i12, i13, 1, 3, 768L);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (v0.i.c(this.f46032f) == 0) {
            Surface surface = this.f46027a.getSurface();
            hVar.f43249c = surface;
            hVar.f43247a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f46030d = hVar;
        this.f46033g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f46033g) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c();
            this.f46029c = null;
            Image image = this.f46028b;
            if (image != null) {
                image.close();
                this.f46028b = null;
            }
            invalidate();
            this.f46033g = false;
        }
    }

    public final boolean c() {
        if (!this.f46033g) {
            return false;
        }
        Image imageAcquireLatestImage = this.f46027a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f46028b;
            if (image != null) {
                image.close();
                this.f46028b = null;
            }
            this.f46028b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void e(int i10, int i11) {
        if (this.f46030d == null) {
            return;
        }
        if (i10 == this.f46027a.getWidth() && i11 == this.f46027a.getHeight()) {
            return;
        }
        Image image = this.f46028b;
        if (image != null) {
            image.close();
            this.f46028b = null;
        }
        this.f46027a.close();
        this.f46027a = d(i10, i11);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    @Nullable
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f46030d;
    }

    public ImageReader getImageReader() {
        return this.f46027a;
    }

    @NonNull
    public Surface getSurface() {
        return this.f46027a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f46028b;
        if (image != null) {
            HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
            this.f46029c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
        }
        Bitmap bitmap = this.f46029c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f46031e) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i10), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i11), View.MeasureSpec.getMode(i11) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f46027a.getWidth() && i11 == this.f46027a.getHeight()) && this.f46032f == 1 && this.f46033g) {
            e(i10, i11);
            io.flutter.embedding.engine.renderer.h hVar = this.f46030d;
            Surface surface = this.f46027a.getSurface();
            hVar.f43249c = surface;
            hVar.f43247a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void resume() {
    }
}
