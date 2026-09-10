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

/* JADX INFO: compiled from: HomeButtonGradientBorderDrawable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/¨\u00065"}, d2 = {"Lleh/beachfront;", "Landroid/graphics/drawable/Drawable;", "", "bgColors", "borderColors", "borderColors2", "", "cornerRadius", "borderWidth", "<init>", "([I[I[IFF)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "attabal", "[I", "saneness", "dern", "wireman", "F", "marial", "Landroid/graphics/Paint;", "beachfront", "Landroid/graphics/Paint;", "bgPaint", "competently", "borderPaint", "impromptu", "borderPaint2", "Landroid/graphics/RectF;", "taiyuan", "Landroid/graphics/RectF;", "bottomBgRect", "cutely", "bgRect", "apical", "borderRect", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class beachfront extends Drawable {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final RectF borderRect;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int[] bgColors;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Paint bgPaint;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Paint borderPaint;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final RectF bgRect;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int[] borderColors2;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final Paint borderPaint2;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final float borderWidth;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] borderColors;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final RectF bottomBgRect;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    public beachfront(int[] bgColors, int[] borderColors, int[] borderColors2, float f, float f2) {
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        Intrinsics.checkNotNullParameter(borderColors, "borderColors");
        Intrinsics.checkNotNullParameter(borderColors2, "borderColors2");
        this.bgColors = bgColors;
        this.borderColors = borderColors;
        this.borderColors2 = borderColors2;
        this.cornerRadius = f;
        this.borderWidth = f2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(f2);
        this.borderPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f2);
        this.borderPaint2 = paint3;
        this.bottomBgRect = new RectF();
        this.bgRect = new RectF();
        this.borderRect = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.bottomBgRect;
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.bgPaint);
        RectF rectF2 = this.bgRect;
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(rectF2, f2, f2, this.bgPaint);
        RectF rectF3 = this.borderRect;
        float f3 = this.cornerRadius;
        canvas.drawRoundRect(rectF3, f3, f3, this.borderPaint);
        RectF rectF4 = this.borderRect;
        float f4 = this.cornerRadius;
        canvas.drawRoundRect(rectF4, f4, f4, this.borderPaint2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.bottomBgRect.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bounds.width(), bounds.height());
        this.bgRect.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bounds.width(), bounds.height());
        float f = this.borderWidth / 2.0f;
        this.borderRect.set(f, f, bounds.width() - f, bounds.height() - f);
        Paint paint = this.bgPaint;
        float fHeight = bounds.height();
        int[] iArr = this.bgColors;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fHeight, iArr, (float[]) null, tileMode));
        this.borderPaint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bounds.width(), bounds.height(), this.borderColors, (float[]) null, tileMode));
        this.borderPaint2.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bounds.width(), bounds.height(), this.borderColors2, (float[]) null, tileMode));
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
