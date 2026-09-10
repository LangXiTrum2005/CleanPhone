package me.itangqi.waveloadingview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.p004ironsource.mediationsdk.l;
import me.itangqi.library.R;

/* JADX INFO: loaded from: classes7.dex */
public class WaveLoadingView extends View {
    public static final int J0 = Color.parseColor("#212121");
    public static final int K0 = Color.parseColor("#00000000");
    public static final int L0 = Color.parseColor("#212121");
    public static final int M0 = 1;
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Paint E0;
    public final Paint F0;
    public final ObjectAnimator G0;
    public final AnimatorSet H0;
    public final Context I0;
    public int e0;
    public int f0;
    public int g0;
    public float h0;
    public int i0;
    public int j0;
    public int k0;
    public final int l0;
    public final int m0;
    public String n0;
    public String o0;
    public String p0;
    public float q0;
    public float r0;
    public float s0;
    public int t0;
    public final boolean u0;
    public BitmapShader v0;
    public final Matrix w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ShapeType {
        public static final /* synthetic */ ShapeType[] X = {new ShapeType("TRIANGLE", 0), new ShapeType("CIRCLE", 1), new ShapeType("SQUARE", 2), new ShapeType(l.f25926c, 3)};

        /* JADX INFO: Fake field, exist only in values array */
        ShapeType EF5;

        public static ShapeType valueOf(String str) {
            return (ShapeType) Enum.valueOf(ShapeType.class, str);
        }

        public static ShapeType[] values() {
            return (ShapeType[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TriangleDirection {
        public static final /* synthetic */ TriangleDirection[] X = {new TriangleDirection("NORTH", 0), new TriangleDirection("SOUTH", 1), new TriangleDirection("EAST", 2), new TriangleDirection("WEST", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        TriangleDirection EF5;

        public static TriangleDirection valueOf(String str) {
            return (TriangleDirection) Enum.valueOf(TriangleDirection.class, str);
        }

        public static TriangleDirection[] values() {
            return (TriangleDirection[]) X.clone();
        }
    }

    public WaveLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.r0 = 1.0f;
        this.s0 = 0.0f;
        this.t0 = 50;
        this.I0 = context;
        this.w0 = new Matrix();
        Paint paint = new Paint();
        this.x0 = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.y0 = paint2;
        paint2.setAntiAlias(true);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "waveShiftRatio", 0.0f, 1.0f);
        this.G0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.G0.setDuration(1000L);
        this.G0.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.H0 = animatorSet;
        animatorSet.play(this.G0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f45125a, 0, 0);
        this.k0 = typedArrayObtainStyledAttributes.getInteger(5, M0);
        int i2 = J0;
        this.j0 = typedArrayObtainStyledAttributes.getColor(23, i2);
        int color = typedArrayObtainStyledAttributes.getColor(24, K0);
        this.i0 = color;
        this.y0.setColor(color);
        float f = typedArrayObtainStyledAttributes.getFloat(22, 50.0f) / 1000.0f;
        this.h0 = f > 0.1f ? 0.1f : f;
        int integer = typedArrayObtainStyledAttributes.getInteger(2, 50);
        this.t0 = integer;
        setProgressValue(integer);
        this.u0 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.m0 = typedArrayObtainStyledAttributes.getInteger(4, 30);
        this.l0 = typedArrayObtainStyledAttributes.getInteger(21, 0);
        Paint paint3 = new Paint();
        this.z0 = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = this.z0;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        this.z0.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(1, a(0.0f)));
        this.z0.setColor(typedArrayObtainStyledAttributes.getColor(0, i2));
        Paint paint5 = new Paint();
        this.A0 = paint5;
        int i3 = L0;
        paint5.setColor(typedArrayObtainStyledAttributes.getColor(17, i3));
        Paint paint6 = this.A0;
        Paint.Style style2 = Paint.Style.FILL;
        paint6.setStyle(style2);
        this.A0.setAntiAlias(true);
        this.A0.setTextSize(typedArrayObtainStyledAttributes.getDimension(18, b(18.0f)));
        Paint paint7 = new Paint();
        this.D0 = paint7;
        paint7.setColor(typedArrayObtainStyledAttributes.getColor(19, 0));
        this.D0.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(20, a(0.0f)));
        this.D0.setStyle(style);
        this.D0.setAntiAlias(true);
        this.D0.setTextSize(this.A0.getTextSize());
        this.n0 = typedArrayObtainStyledAttributes.getString(16);
        Paint paint8 = new Paint();
        this.C0 = paint8;
        paint8.setColor(typedArrayObtainStyledAttributes.getColor(12, i3));
        this.C0.setStyle(style2);
        this.C0.setAntiAlias(true);
        this.C0.setTextSize(typedArrayObtainStyledAttributes.getDimension(13, b(22.0f)));
        Paint paint9 = new Paint();
        this.F0 = paint9;
        paint9.setColor(typedArrayObtainStyledAttributes.getColor(14, 0));
        this.F0.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, a(0.0f)));
        this.F0.setStyle(style);
        this.F0.setAntiAlias(true);
        this.F0.setTextSize(this.C0.getTextSize());
        this.o0 = typedArrayObtainStyledAttributes.getString(11);
        Paint paint10 = new Paint();
        this.B0 = paint10;
        paint10.setColor(typedArrayObtainStyledAttributes.getColor(7, i3));
        this.B0.setStyle(style2);
        this.B0.setAntiAlias(true);
        this.B0.setTextSize(typedArrayObtainStyledAttributes.getDimension(8, b(18.0f)));
        Paint paint11 = new Paint();
        this.E0 = paint11;
        paint11.setColor(typedArrayObtainStyledAttributes.getColor(9, 0));
        this.E0.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(10, a(0.0f)));
        this.E0.setStyle(style);
        this.E0.setAntiAlias(true);
        this.E0.setTextSize(this.B0.getTextSize());
        this.p0 = typedArrayObtainStyledAttributes.getString(6);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(float f) {
        return (int) ((f * this.I0.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int b(float f) {
        return (int) ((f * this.I0.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void c() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        double d = 6.283185307179586d / ((double) measuredWidth);
        float f = measuredHeight;
        float f2 = 0.1f * f;
        this.q0 = f * 0.5f;
        float f3 = measuredWidth;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int i2 = measuredWidth + 1;
        int i3 = measuredHeight + 1;
        float[] fArr = new float[i2];
        int i4 = this.j0;
        paint.setColor(Color.argb(Math.round(Color.alpha(i4) * 0.3f), Color.red(i4), Color.green(i4), Color.blue(i4)));
        int i5 = 0;
        while (i5 < i2) {
            double d2 = d;
            float fSin = (float) ((Math.sin(((double) i5) * d) * ((double) f2)) + ((double) this.q0));
            int i6 = i5;
            float f4 = i6;
            canvas.drawLine(f4, fSin, f4, i3, paint);
            fArr[i6] = fSin;
            i5 = i6 + 1;
            d = d2;
        }
        paint.setColor(this.j0);
        int i7 = (int) (f3 / 4.0f);
        for (int i8 = 0; i8 < i2; i8++) {
            float f5 = i8;
            canvas.drawLine(f5, fArr[(i8 + i7) % i2], f5, i3, paint);
        }
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.v0 = bitmapShader;
        this.x0.setShader(bitmapShader);
    }

    public float getAmplitudeRatio() {
        return this.h0;
    }

    public int getBorderColor() {
        return this.z0.getColor();
    }

    public float getBorderWidth() {
        return this.z0.getStrokeWidth();
    }

    public String getBottomTitle() {
        return this.p0;
    }

    public int getBottomTitleColor() {
        return this.B0.getColor();
    }

    public float getBottomTitleSize() {
        return this.B0.getTextSize();
    }

    public String getCenterTitle() {
        return this.o0;
    }

    public int getCenterTitleColor() {
        return this.C0.getColor();
    }

    public float getCenterTitleSize() {
        return this.C0.getTextSize();
    }

    public int getProgressValue() {
        return this.t0;
    }

    public int getShapeType() {
        return this.k0;
    }

    public String getTopTitle() {
        return this.n0;
    }

    public int getTopTitleColor() {
        return this.A0.getColor();
    }

    public float getWaterLevelRatio() {
        return this.r0;
    }

    public int getWaveBgColor() {
        return this.i0;
    }

    public int getWaveColor() {
        return this.j0;
    }

    public float getWaveShiftRatio() {
        return this.s0;
    }

    public float getsetTopTitleSize() {
        return this.A0.getTextSize();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.start();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Point point;
        Canvas canvas2 = canvas;
        this.e0 = canvas2.getWidth();
        if (canvas2.getHeight() < this.e0) {
            this.e0 = canvas2.getHeight();
        }
        Point point2 = null;
        if (this.v0 == null) {
            this.x0.setShader(null);
            return;
        }
        if (this.x0.getShader() == null) {
            this.x0.setShader(this.v0);
        }
        this.w0.setScale(1.0f, this.h0 / 0.1f, 0.0f, this.q0);
        this.w0.postTranslate(this.s0 * getWidth(), (0.5f - this.r0) * getHeight());
        this.v0.setLocalMatrix(this.w0);
        float strokeWidth = this.z0.getStrokeWidth();
        int i2 = this.k0;
        if (i2 == 0) {
            Point point3 = new Point(0, getHeight());
            int width = getWidth();
            int height = getHeight();
            int i3 = this.l0;
            if (i3 == 0) {
                point2 = new Point(point3.x + width, point3.y);
                double d = height;
                point = new Point((width / 2) + point3.x, (int) (d - ((Math.sqrt(3.0d) / 2.0d) * d)));
            } else if (i3 == 1) {
                point2 = new Point(point3.x, point3.y - height);
                point = new Point(point3.x + width, point3.y - height);
                point3.x = (width / 2) + point3.x;
                point3.y = (int) ((Math.sqrt(3.0d) / 2.0d) * ((double) height));
            } else if (i3 == 2) {
                point2 = new Point(point3.x, point3.y - height);
                point = new Point((int) ((Math.sqrt(3.0d) / 2.0d) * ((double) width)), point3.y / 2);
            } else if (i3 == 3) {
                point2 = new Point(point3.x + width, point3.y - height);
                point = new Point(point3.x + width, point3.y);
                double d2 = width;
                point3.x = (int) (d2 - ((Math.sqrt(3.0d) / 2.0d) * d2));
                point3.y /= 2;
            } else {
                point = null;
            }
            Path path = new Path();
            path.moveTo(point3.x, point3.y);
            path.lineTo(point2.x, point2.y);
            path.lineTo(point.x, point.y);
            canvas2.drawPath(path, this.y0);
            canvas2.drawPath(path, this.x0);
        } else if (i2 == 1) {
            if (strokeWidth > 0.0f) {
                canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - strokeWidth) / 2.0f) - 1.0f, this.z0);
            }
            float width2 = (getWidth() / 2.0f) - strokeWidth;
            canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, width2, this.y0);
            canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, width2, this.x0);
        } else if (i2 == 2) {
            if (strokeWidth > 0.0f) {
                float f = strokeWidth / 2.0f;
                canvas.drawRect(f, f, (getWidth() - f) - 0.5f, (getHeight() - f) - 0.5f, this.z0);
            }
            canvas.drawRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, this.y0);
            canvas2 = canvas;
            canvas2.drawRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, this.x0);
        } else if (i2 == 3) {
            if (this.u0) {
                if (strokeWidth > 0.0f) {
                    float f2 = strokeWidth / 2.0f;
                    RectF rectF = new RectF(f2, f2, (getWidth() - f2) - 0.5f, (getHeight() - f2) - 0.5f);
                    int i4 = this.m0;
                    canvas2.drawRoundRect(rectF, i4, i4, this.y0);
                    int i5 = this.m0;
                    canvas2.drawRoundRect(rectF, i5, i5, this.x0);
                } else {
                    RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                    int i6 = this.m0;
                    canvas2.drawRoundRect(rectF2, i6, i6, this.y0);
                    int i7 = this.m0;
                    canvas2.drawRoundRect(rectF2, i7, i7, this.x0);
                }
            } else if (strokeWidth > 0.0f) {
                float f3 = strokeWidth / 2.0f;
                canvas2.drawRect(f3, f3, (getWidth() - f3) - 0.5f, (getHeight() - f3) - 0.5f, this.y0);
                canvas2 = canvas;
                canvas2.drawRect(f3, f3, (getWidth() - f3) - 0.5f, (getHeight() - f3) - 0.5f, this.x0);
            } else {
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.y0);
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.x0);
            }
        }
        if (!TextUtils.isEmpty(this.n0)) {
            float fMeasureText = this.A0.measureText(this.n0);
            canvas2.drawText(this.n0, (getWidth() - fMeasureText) / 2.0f, (getHeight() * 2) / 10.0f, this.D0);
            canvas2.drawText(this.n0, (getWidth() - fMeasureText) / 2.0f, (getHeight() * 2) / 10.0f, this.A0);
        }
        if (!TextUtils.isEmpty(this.o0)) {
            float fMeasureText2 = this.C0.measureText(this.o0);
            canvas2.drawText(this.o0, (getWidth() - fMeasureText2) / 2.0f, (getHeight() / 2) - ((this.F0.ascent() + this.F0.descent()) / 2.0f), this.F0);
            canvas2.drawText(this.o0, (getWidth() - fMeasureText2) / 2.0f, (getHeight() / 2) - ((this.C0.ascent() + this.C0.descent()) / 2.0f), this.C0);
        }
        if (TextUtils.isEmpty(this.p0)) {
            return;
        }
        float fMeasureText3 = this.B0.measureText(this.p0);
        canvas2.drawText(this.p0, (getWidth() - fMeasureText3) / 2.0f, ((getHeight() * 8) / 10.0f) - ((this.E0.ascent() + this.E0.descent()) / 2.0f), this.E0);
        canvas2.drawText(this.p0, (getWidth() - fMeasureText3) / 2.0f, ((getHeight() * 8) / 10.0f) - ((this.B0.ascent() + this.B0.descent()) / 2.0f), this.B0);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.g0;
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            size2 = this.f0;
        }
        int i4 = size2 + 2;
        if (getShapeType() == 3) {
            setMeasuredDimension(size, i4);
            return;
        }
        if (size >= i4) {
            size = i4;
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (getShapeType() == 3) {
            this.g0 = i2;
            this.f0 = i3;
        } else {
            this.e0 = i2;
            if (i3 < i2) {
                this.e0 = i3;
            }
        }
        c();
    }

    public void setAmplitudeRatio(int i2) {
        float f = i2 / 1000.0f;
        if (this.h0 != f) {
            this.h0 = f;
            invalidate();
        }
    }

    public void setAnimDuration(long j) {
        this.G0.setDuration(j);
    }

    public void setBorderColor(int i2) {
        this.z0.setColor(i2);
        c();
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.z0.setStrokeWidth(f);
        invalidate();
    }

    public void setBottomTitle(String str) {
        this.p0 = str;
    }

    public void setBottomTitleColor(int i2) {
        this.B0.setColor(i2);
    }

    public void setBottomTitleSize(float f) {
        this.B0.setTextSize(b(f));
    }

    public void setBottomTitleStrokeColor(int i2) {
        this.E0.setColor(i2);
    }

    public void setBottomTitleStrokeWidth(float f) {
        this.E0.setStrokeWidth(a(f));
    }

    public void setCenterTitle(String str) {
        this.o0 = str;
    }

    public void setCenterTitleColor(int i2) {
        this.C0.setColor(i2);
    }

    public void setCenterTitleSize(float f) {
        this.C0.setTextSize(b(f));
    }

    public void setCenterTitleStrokeColor(int i2) {
        this.F0.setColor(i2);
    }

    public void setCenterTitleStrokeWidth(float f) {
        this.F0.setStrokeWidth(a(f));
    }

    public void setProgressValue(int i2) {
        this.t0 = i2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "waterLevelRatio", this.r0, i2 / 100.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.start();
    }

    public void setShapeType(ShapeType shapeType) {
        this.k0 = shapeType.ordinal();
        invalidate();
    }

    public void setTopTitle(String str) {
        this.n0 = str;
    }

    public void setTopTitleColor(int i2) {
        this.A0.setColor(i2);
    }

    public void setTopTitleSize(float f) {
        this.A0.setTextSize(b(f));
    }

    public void setTopTitleStrokeColor(int i2) {
        this.D0.setColor(i2);
    }

    public void setTopTitleStrokeWidth(float f) {
        this.D0.setStrokeWidth(a(f));
    }

    public void setWaterLevelRatio(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidate();
        }
    }

    public void setWaveBgColor(int i2) {
        this.i0 = i2;
        this.y0.setColor(i2);
        c();
        invalidate();
    }

    public void setWaveColor(int i2) {
        this.j0 = i2;
        c();
        invalidate();
    }

    public void setWaveShiftRatio(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidate();
        }
    }
}
