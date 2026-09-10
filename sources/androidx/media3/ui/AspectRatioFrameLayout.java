package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final AspectRatioUpdateDispatcher e0;
    public AspectRatioListener f0;
    public float g0;
    public int h0;

    public interface AspectRatioListener {
        void a();
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {
        public boolean X;

        public AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X = false;
            AspectRatioListener aspectRatioListener = AspectRatioFrameLayout.this.f0;
            if (aspectRatioListener == null) {
                return;
            }
            aspectRatioListener.a();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f7721a, 0, 0);
            try {
                this.h0 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.e0 = new AspectRatioUpdateDispatcher();
    }

    public int getResizeMode() {
        return this.h0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        float f;
        float f2;
        super.onMeasure(i2, i3);
        if (this.g0 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.g0 / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher = this.e0;
        if (fAbs <= 0.01f) {
            aspectRatioUpdateDispatcher.getClass();
            if (aspectRatioUpdateDispatcher.X) {
                return;
            }
            aspectRatioUpdateDispatcher.X = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
            return;
        }
        int i4 = this.h0;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f = this.g0;
                } else if (i4 == 4) {
                    if (f5 > 0.0f) {
                        f = this.g0;
                    } else {
                        f2 = this.g0;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.g0;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.g0;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.g0;
            measuredWidth = (int) (f4 * f);
        }
        aspectRatioUpdateDispatcher.getClass();
        if (!aspectRatioUpdateDispatcher.X) {
            aspectRatioUpdateDispatcher.X = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
        this.f0 = aspectRatioListener;
    }

    public void setResizeMode(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            requestLayout();
        }
    }
}
