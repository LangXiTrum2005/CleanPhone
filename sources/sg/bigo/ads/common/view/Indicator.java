package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public class Indicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f47573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f47575c;
    private Paint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47576e;
    private float f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f47577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47578i;
    private float j;
    private float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47579l;
    private float m;

    public Indicator(Context context) {
        this(context, null);
    }

    public static float a(int i2, float f, float f2, float f3) {
        float f4 = i2 - 1;
        return (f * f4) + (f2 * 2.0f * f4) + f3;
    }

    public float getDistance() {
        return this.j;
    }

    public float getLengthSelected() {
        return this.f47577h;
    }

    public float getRadius() {
        return this.f;
    }

    public int getType() {
        return this.f47574b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47574b != 1) {
            a(canvas);
            return;
        }
        if (this.m > 0.0f) {
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            float f = this.m;
            canvas.translate(((width - f) / 2.0f) + this.f, height / 2.0f);
            a();
            float f2 = this.f;
            RectF rectF = new RectF(0.0f, -f2, f, f2);
            float f3 = this.f;
            canvas.drawRoundRect(rectF, f3, f3, this.f47575c);
            float f4 = (f - this.f47577h) * this.f47573a;
            float f5 = this.f;
            RectF rectF2 = new RectF(f4, -f5, this.f47577h + f4, f5);
            float f6 = this.f;
            canvas.drawRoundRect(rectF2, f6, f6, this.d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        float f = this.f * 2.0f;
        int i4 = this.f47576e;
        float paddingLeft = (this.j * (i4 - 1)) + (f * (i4 - 1)) + this.f47577h + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.f * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, (int) paddingTop);
            return;
        }
        if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
        } else {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i2), View.getDefaultSize(getSuggestedMinimumHeight(), i3));
        }
    }

    public void setColor(int i2) {
        if (this.g != i2) {
            this.g = i2;
            invalidate();
        }
    }

    public void setColorSelected(int i2) {
        if (this.f47578i != i2) {
            this.f47578i = i2;
            invalidate();
        }
    }

    public void setLineLength(float f) {
        if (this.m != f) {
            this.m = f;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i2) {
        if (this.f47576e != i2) {
            sg.bigo.ads.common.t.a.a("Indicator", "onMeasure, setNum=".concat(String.valueOf(i2)));
            this.f47576e = i2;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f) {
        if (f != this.f) {
            this.f = f;
            this.f47577h = 8.0f * f;
            this.j = f * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i2) {
        if (this.f47574b != i2) {
            this.f47574b = i2;
            invalidate();
        }
    }

    public Indicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        Paint paint = new Paint();
        this.f47575c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f47575c.setColor(this.g);
        this.f47575c.setAntiAlias(true);
        this.f47575c.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(this.f47575c);
        this.d = paint2;
        paint2.setColor(this.f47578i);
    }

    public Indicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47574b = 0;
        this.g = -2130706433;
        float fA = e.a(getContext(), 2);
        this.f = fA;
        this.f47578i = -1;
        this.f47577h = 8.0f * fA;
        this.j = fA * 2.0f;
        this.f47576e = 0;
        this.k = 0.0f;
        this.f47579l = 0;
    }

    public final void a(float f, int i2) {
        if (i2 == this.f47579l) {
            this.k = (-f) * 2.0f;
            invalidate();
        }
    }

    public final void a(int i2) {
        if (this.f47579l != i2) {
            this.f47579l = i2;
            this.k = 0.0f;
            invalidate();
        }
    }

    private void a(Canvas canvas) {
        float f;
        if (this.f47576e <= 0) {
            return;
        }
        canvas.translate(((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - a(this.f47576e, this.j, this.f, this.f47577h)) / 2.0f) + getPaddingLeft() + this.f, (((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        a();
        float f2 = -this.f;
        for (int i2 = 0; i2 < this.f47576e; i2++) {
            if (i2 == this.f47579l) {
                float f3 = this.f;
                canvas.drawCircle(f2 + f3, 0.0f, f3, this.f47575c);
                float f4 = this.f47577h + f2;
                float f5 = this.f;
                canvas.drawCircle(f4 - f5, 0.0f, f5, this.f47575c);
                float f6 = (this.j * this.k) + f2;
                float f7 = this.f;
                RectF rectF = new RectF(f6, -f7, this.f47577h + f6, f7);
                float f8 = this.f;
                canvas.drawRoundRect(rectF, f8, f8, this.d);
                f = this.f47577h;
            } else {
                float f9 = this.f;
                canvas.drawCircle(f2 + f9, 0.0f, f9, this.f47575c);
                f = this.f * 2.0f;
            }
            f2 = f2 + f + this.j;
        }
    }
}
