package com.codejoy.boom.clap.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.molybdenite;
import com.codejoy.boom.clap.widget.VolumeBar;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VolumeBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010'R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010'¨\u0006B"}, d2 = {"Lcom/codejoy/boom/clap/widget/VolumeBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "touchListener", "setStartTouchListener", "(Lkotlin/jvm/functions/Function0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", NotificationCompat.CATEGORY_PROGRESS, "beachfront", "(I)V", "getProgressWidth", "()I", "getProgress", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "wireman", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "dern", "(Landroid/view/MotionEvent;)Z", "", "kowloon", "F", "progressWidth", "Landroid/graphics/Paint;", "arytenoidectomy", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/Bitmap;", "monoploid", "Landroid/graphics/Bitmap;", "bitmap", "polloi", "bitmapSpace", "", "molybdenite", "[I", "gradientColors", "", "graveside", "[F", "gradientPositions", "adultoid", "corner", "dovishness", "Lkotlin/jvm/functions/Function0;", "startTouchListener", "gintrap", "lastEventX", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VolumeBar extends View {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final float corner;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Paint progressPaint;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> startTouchListener;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public float lastEventX;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final float[] gradientPositions;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public float progressWidth;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int[] gradientColors;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Bitmap bitmap;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final float bitmapSpace;

    /* JADX INFO: compiled from: VolumeBar.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/widget/VolumeBar$attabal", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ int f18781arytenoidectomy;

        public attabal(int i) {
            this.f18781arytenoidectomy = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (VolumeBar.this.getWidth() > 0) {
                VolumeBar.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                VolumeBar volumeBar = VolumeBar.this;
                volumeBar.progressWidth = volumeBar.getWidth() * (this.f18781arytenoidectomy / 100.0f);
                VolumeBar.this.postInvalidate();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeBar(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressPaint = new Paint(1);
        this.bitmapSpace = molybdenite.attabal(10.0f);
        this.gradientColors = new int[]{Color.parseColor("#BC60E3"), Color.parseColor("#662ED2")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.corner = molybdenite.attabal(4.0f);
        wireman(context);
    }

    public static final boolean marial(VolumeBar volumeBar, View view, MotionEvent motionEvent) {
        Intrinsics.beachfront(motionEvent);
        return volumeBar.dern(motionEvent);
    }

    public final void beachfront(int progress) {
        if (getWidth() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new attabal(progress));
        } else {
            this.progressWidth = getWidth() * (progress / 100.0f);
            postInvalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    public final boolean dern(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.lastEventX = event.getX();
            Function0<Unit> function0 = this.startTouchListener;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.lastEventX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (action == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            float x = this.progressWidth + (event.getX() - this.lastEventX);
            this.progressWidth = x;
            this.progressWidth = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x);
            this.progressWidth = Math.min(getWidth(), this.progressWidth);
            this.lastEventX = event.getX();
            invalidate();
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.lastEventX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    public final int getProgress() {
        if (getWidth() <= 0) {
            return 50;
        }
        return (int) ((this.progressWidth / getWidth()) * 100);
    }

    public final int getProgressWidth() {
        return (int) this.progressWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.progressWidth;
        float height = getHeight();
        float f2 = this.corner;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, height, f2, f2, this.progressPaint);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (this.progressWidth - bitmap.getWidth()) - this.bitmapSpace, (getHeight() - bitmap.getHeight()) / 2.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        float f = size;
        this.progressPaint.setShader(new LinearGradient(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, size2, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP));
    }

    public final void setStartTouchListener(Function0<Unit> touchListener) {
        Intrinsics.checkNotNullParameter(touchListener, "touchListener");
        this.startTouchListener = touchListener;
    }

    public final void wireman(Context context) {
        this.progressPaint.setStyle(Paint.Style.FILL);
        setOnTouchListener(new View.OnTouchListener() { // from class: leh.monoploid
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VolumeBar.marial(this.f32630kowloon, view, motionEvent);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressPaint = new Paint(1);
        this.bitmapSpace = molybdenite.attabal(10.0f);
        this.gradientColors = new int[]{Color.parseColor("#BC60E3"), Color.parseColor("#662ED2")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.corner = molybdenite.attabal(4.0f);
        wireman(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressPaint = new Paint(1);
        this.bitmapSpace = molybdenite.attabal(10.0f);
        this.gradientColors = new int[]{Color.parseColor("#BC60E3"), Color.parseColor("#662ED2")};
        this.gradientPositions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        this.corner = molybdenite.attabal(4.0f);
        wireman(context);
    }
}
