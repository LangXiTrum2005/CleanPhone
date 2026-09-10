package com.codejoy.boom.clap.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlayingProgressView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0005R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/codejoy/boom/clap/widget/PlayingProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "value", "setProgress", "(F)V", "getProgress", "()I", "attabal", "kowloon", "F", NotificationCompat.CATEGORY_PROGRESS, "", "arytenoidectomy", "[I", "gradientColors", "", "monoploid", "[F", "gradientPositions", "polloi", "I", "ringProgressColor", "molybdenite", "ringWidth", "Landroid/graphics/Paint;", "graveside", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/RectF;", "adultoid", "Landroid/graphics/RectF;", "rect", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlayingProgressView extends View {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final RectF rect;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int[] gradientColors;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final Paint progressPaint;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public float ringWidth;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final float[] gradientPositions;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int ringProgressColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingProgressView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gradientColors = new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#B0A5F4")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.ringProgressColor = Color.parseColor("#FFFFFF");
        this.ringWidth = 4 * getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.progressPaint = paint;
        this.rect = new RectF();
        attabal(context);
    }

    public final void attabal(Context context) {
        this.progressPaint.setStrokeWidth(this.ringWidth);
    }

    public final int getProgress() {
        return (int) this.progress;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.rect, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (100 - this.progress) * 3.6f, false, this.progressPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        float fMin = (Math.min(size, size2) / 2) - (this.ringWidth / 2);
        float f = size / 2;
        float f2 = size2 / 2;
        this.rect.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
        this.progressPaint.setShader(new SweepGradient(size / 2.0f, size2 / 2.0f, this.gradientColors, (float[]) null));
    }

    public final void setProgress(float value) {
        this.progress = value;
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gradientColors = new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#B0A5F4")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.ringProgressColor = Color.parseColor("#FFFFFF");
        this.ringWidth = 4 * getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.progressPaint = paint;
        this.rect = new RectF();
        attabal(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gradientColors = new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#B0A5F4")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.ringProgressColor = Color.parseColor("#FFFFFF");
        this.ringWidth = 4 * getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.progressPaint = paint;
        this.rect = new RectF();
        attabal(context);
    }
}
