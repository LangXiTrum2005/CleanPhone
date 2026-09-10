package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.graphics.drawable.DrawableKt;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WW;

/* JADX INFO: loaded from: classes4.dex */
public final class KnobProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f5357a;
    public final RectF b;
    public float c;
    public float d;
    public final Paint e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public InterfaceC2766Sw s;
    public InterfaceC2766Sw t;
    public InterfaceC2766Sw u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnobProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC2995aW.q(context, f.X);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scale", 0.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(663L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5357a = objectAnimatorOfFloat;
        this.f = 90.0f;
        this.g = 30.0f;
        this.h = 330.0f;
        this.i = 100;
        this.l = 300.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WW.b);
        this.o = typedArrayObtainStyledAttributes.getDrawable(3);
        this.p = typedArrayObtainStyledAttributes.getDrawable(4);
        this.q = typedArrayObtainStyledAttributes.getDrawable(5);
        this.r = typedArrayObtainStyledAttributes.getDrawable(8);
        this.i = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(2, 0);
        setMProgress(typedArrayObtainStyledAttributes.getInt(1, 0));
        setScaleStart(typedArrayObtainStyledAttributes.getFloat(7, 0.0f));
        setScaleEnd(typedArrayObtainStyledAttributes.getFloat(6, 100.0f));
        typedArrayObtainStyledAttributes.recycle();
        b(this, this.k);
        this.b = new RectF();
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setFilterBitmap(true);
    }

    public static void b(KnobProgressBar knobProgressBar, int i) {
        int i2 = knobProgressBar.k;
        knobProgressBar.setMProgress(i);
        knobProgressBar.setScale(knobProgressBar.a(i));
        knobProgressBar.postInvalidate();
    }

    private final void setScaleRange(float f) {
        if (f == 0.0f || Float.isNaN(f)) {
            f = 1.0f;
        }
        this.l = f;
        setScale(a(this.k));
    }

    public final float a(int i) {
        return (((i - this.j) * this.l) / getProgressRange()) + this.g;
    }

    public final Drawable getMDrawableProgress() {
        return this.q;
    }

    public final Drawable getMDrawableProgressBg() {
        return this.o;
    }

    public final Drawable getMDrawableProgressFg() {
        return this.p;
    }

    public final Drawable getMDrawableThumb() {
        return this.r;
    }

    public final float getMHeight() {
        return this.n;
    }

    public final int getMProgress() {
        return this.k;
    }

    public final int getMProgressMax() {
        return this.i;
    }

    public final int getMProgressMin() {
        return this.j;
    }

    public final float getMWidth() {
        return this.m;
    }

    public final InterfaceC2766Sw getOnProgressChangeStopListener() {
        return this.s;
    }

    public final InterfaceC2766Sw getOnProgressChangedListener() {
        return this.t;
    }

    public final InterfaceC2766Sw getOnProgressChangingListener() {
        return this.u;
    }

    public final int getProgress() {
        return this.k;
    }

    public final int getProgressMax() {
        return this.i;
    }

    public final int getProgressMin() {
        return this.j;
    }

    public final int getProgressRange() {
        return this.i - this.j;
    }

    public final float getScale() {
        return this.f;
    }

    public final float getScaleEnd() {
        return this.h;
    }

    public final float getScaleRange() {
        return this.l;
    }

    public final ObjectAnimator getScaleSetAni() {
        return this.f5357a;
    }

    public final float getScaleStart() {
        return this.g;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScale(a(this.k));
        this.f5357a.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        float f = this.f;
        canvas.drawArc(this.b, f + 90.0f, 360 - f, true, this.e);
        float f2 = this.f;
        float f3 = this.c;
        float f4 = this.d;
        int iSave = canvas.save();
        canvas.rotate(f2, f3, f4);
        try {
            Drawable drawable2 = this.r;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            canvas.restoreToCount(iSave);
            Drawable drawable3 = this.p;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        this.m = f;
        float f2 = i2;
        this.n = f2;
        float f3 = 2;
        this.c = f / f3;
        this.d = f2 / f3;
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, f, f2);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) this.m, (int) this.n);
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) this.m, (int) this.n);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, (int) this.m, (int) this.n);
        }
        Drawable drawable4 = this.r;
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, (int) this.m, (int) this.n);
        }
        if (drawable3 != null) {
            Matrix matrix = new Matrix();
            Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable3, 0, 0, null, 7, null);
            matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap$default.getWidth(), bitmap$default.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap$default, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            this.e.setShader(bitmapShader);
        }
    }

    public final void setMHeight(float f) {
        this.n = f;
    }

    public final void setMProgress(int i) {
        int i2;
        int i3 = this.i;
        int i4 = this.j;
        if (i3 < i4) {
            i2 = 0;
        } else {
            if (i < i4) {
                i = i4;
            }
            if (i <= i3) {
                i3 = i;
            }
            i2 = i3;
        }
        this.k = i2;
    }

    public final void setMProgressMax(int i) {
        this.i = i;
    }

    public final void setMProgressMin(int i) {
        this.j = i;
    }

    public final void setMWidth(float f) {
        this.m = f;
    }

    public final void setOnProgressChangeStopListener(InterfaceC2766Sw interfaceC2766Sw) {
        this.s = interfaceC2766Sw;
    }

    public final void setOnProgressChangedListener(InterfaceC2766Sw interfaceC2766Sw) {
        this.t = interfaceC2766Sw;
    }

    public final void setOnProgressChangingListener(InterfaceC2766Sw interfaceC2766Sw) {
        this.u = interfaceC2766Sw;
    }

    public final void setProgressMax(int i) {
        int i2 = this.j;
        if (i < i2) {
            i = i2;
        }
        this.i = i;
        b(this, this.k);
    }

    public final void setProgressMin(int i) {
        int i2 = this.i;
        if (i > i2) {
            i = i2;
        }
        this.j = i;
        b(this, this.k);
    }

    public final void setScale(float f) {
        this.f = f;
        postInvalidate();
    }

    public final void setScaleEnd(float f) {
        this.h = f;
        setScaleRange(f - this.g);
    }

    public final void setScaleStart(float f) {
        this.g = f;
        setScaleRange(this.h - f);
    }
}
