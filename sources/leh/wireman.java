package leh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GradientBorderDrawable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006/"}, d2 = {"Lleh/wireman;", "Landroid/graphics/drawable/Drawable;", "", "bgColors", "borderColors", "", "cornerRadius", "borderWidth", "<init>", "([I[IFF)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "attabal", "[I", "saneness", "dern", "F", "wireman", "Landroid/graphics/Paint;", "marial", "Landroid/graphics/Paint;", "bgPaint", "beachfront", "borderPaint", "Landroid/graphics/RectF;", "competently", "Landroid/graphics/RectF;", "bgRect", "impromptu", "borderRect", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wireman extends Drawable {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int[] bgColors;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Paint borderPaint;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final RectF bgRect;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final RectF borderRect;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Paint bgPaint;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] borderColors;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final float borderWidth;

    public wireman(int[] bgColors, int[] borderColors, float f, float f2) {
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        Intrinsics.checkNotNullParameter(borderColors, "borderColors");
        this.bgColors = bgColors;
        this.borderColors = borderColors;
        this.cornerRadius = f;
        this.borderWidth = f2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2);
        this.borderPaint = paint2;
        this.bgRect = new RectF();
        this.borderRect = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.bgRect;
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.bgPaint);
        RectF rectF2 = this.borderRect;
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(rectF2, f2, f2, this.borderPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.bgRect.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bounds.width(), bounds.height());
        float f = this.borderWidth / 2.0f;
        this.borderRect.set(f, f, bounds.width() - f, bounds.height() - f);
        float fWidth = bounds.width() / 2.0f;
        Paint paint = this.bgPaint;
        float fHeight = bounds.height();
        int[] iArr = this.bgColors;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(fWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fWidth, fHeight, iArr, (float[]) null, tileMode));
        this.borderPaint.setShader(new LinearGradient(fWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fWidth, bounds.height(), this.borderColors, (float[]) null, tileMode));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.bgPaint.setAlpha(alpha);
        this.borderPaint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.bgPaint.setColorFilter(colorFilter);
        this.borderPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
