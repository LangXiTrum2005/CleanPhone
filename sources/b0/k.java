package b0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f5136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f5137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5139h;

    public static IconCompat f(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f4014k;
            return go.c.e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.b((Bitmap) parcelable);
        }
        return null;
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) kVar.f42287b).setBigContentTitle(this.f5122b);
        IconCompat iconCompat = this.f5136e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                j.a(bigContentTitle, iconCompat.g());
            } else {
                int type = iconCompat.f4015a;
                if (type == -1) {
                    type = ((Icon) iconCompat.f4016b).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.f5136e;
                    int i10 = iconCompat2.f4015a;
                    if (i10 == -1) {
                        Object obj = iconCompat2.f4016b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i10 == 1) {
                        bitmap = (Bitmap) iconCompat2.f4016b;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f4016b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f10 = iMin;
                        float f11 = 0.5f * f10;
                        float f12 = 0.9166667f * f11;
                        float f13 = 0.010416667f * f10;
                        paint.setColor(0);
                        paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f11, f11, f12, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f5138g) {
            IconCompat iconCompat3 = this.f5137f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.g());
            }
        }
        if (this.f5124d) {
            bigContentTitle.setSummaryText(this.f5123c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            j.c(bigContentTitle, this.f5139h);
            j.b(bigContentTitle, null);
        }
    }

    @Override // b0.g0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // b0.g0
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
            this.f5137f = f(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
            this.f5138g = true;
        }
        Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
        this.f5136e = parcelable != null ? f(parcelable) : f(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        this.f5139h = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
    }

    public final void g(Bitmap bitmap) {
        this.f5137f = bitmap == null ? null : IconCompat.b(bitmap);
        this.f5138g = true;
    }
}
