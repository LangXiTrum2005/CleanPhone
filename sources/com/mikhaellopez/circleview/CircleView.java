package com.mikhaellopez.circleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2930Ze;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2878Xe;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2904Ye;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VW;

/* JADX INFO: loaded from: classes2.dex */
public final class CircleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2420a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public Integer g;
    public Integer h;
    public EnumC2878Xe i;
    public float j;
    public int k;
    public Integer l;
    public Integer m;
    public EnumC2878Xe n;
    public float o;
    public int p;
    public EnumC2904Ye q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2995aW.q(context, f.X);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f2420a = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.b = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.c = paint3;
        this.f = -1;
        EnumC2878Xe enumC2878Xe = EnumC2878Xe.LEFT_TO_RIGHT;
        this.i = enumC2878Xe;
        this.k = ViewCompat.MEASURED_STATE_MASK;
        this.n = enumC2878Xe;
        this.p = ViewCompat.MEASURED_STATE_MASK;
        EnumC2904Ye enumC2904Ye = EnumC2904Ye.BOTTOM;
        this.q = enumC2904Ye;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VW.f3873a, 0, 0);
        AbstractC2995aW.p(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.CircleView, 0, 0)");
        setCircleColor(typedArrayObtainStyledAttributes.getColor(6, -1));
        int color = typedArrayObtainStyledAttributes.getColor(9, 0);
        if (color != 0) {
            setCircleColorStart(Integer.valueOf(color));
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(8, 0);
        if (color2 != 0) {
            setCircleColorEnd(Integer.valueOf(color2));
        }
        setCircleColorDirection(d(typedArrayObtainStyledAttributes.getInteger(7, this.i.f3983a)));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            setBorderWidth(typedArrayObtainStyledAttributes.getDimension(5, getResources().getDisplayMetrics().density * 4.0f));
            setBorderColor(typedArrayObtainStyledAttributes.getColor(1, this.k));
            int color3 = typedArrayObtainStyledAttributes.getColor(4, 0);
            if (color3 != 0) {
                setBorderColorStart(Integer.valueOf(color3));
            }
            int color4 = typedArrayObtainStyledAttributes.getColor(3, 0);
            if (color4 != 0) {
                setBorderColorEnd(Integer.valueOf(color4));
            }
            setBorderColorDirection(d(typedArrayObtainStyledAttributes.getInteger(2, this.n.f3983a)));
        }
        setShadowEnable(typedArrayObtainStyledAttributes.getBoolean(10, this.r));
        if (this.r) {
            setShadowColor(typedArrayObtainStyledAttributes.getColor(11, this.p));
            int integer = typedArrayObtainStyledAttributes.getInteger(12, this.q.f4029a);
            if (integer == 1) {
                enumC2904Ye = EnumC2904Ye.CENTER;
            } else if (integer == 2) {
                enumC2904Ye = EnumC2904Ye.TOP;
            } else if (integer != 3) {
                if (integer == 4) {
                    enumC2904Ye = EnumC2904Ye.START;
                } else {
                    if (integer != 5) {
                        throw new IllegalArgumentException(AbstractC3950lJ.p("This value is not supported for ShadowGravity: ", integer));
                    }
                    enumC2904Ye = EnumC2904Ye.END;
                }
            }
            setShadowGravity(enumC2904Ye);
            setShadowRadius(typedArrayObtainStyledAttributes.getFloat(13, 8.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static EnumC2878Xe d(int i) {
        if (i == 1) {
            return EnumC2878Xe.LEFT_TO_RIGHT;
        }
        if (i == 2) {
            return EnumC2878Xe.RIGHT_TO_LEFT;
        }
        if (i == 3) {
            return EnumC2878Xe.TOP_TO_BOTTOM;
        }
        if (i == 4) {
            return EnumC2878Xe.BOTTOM_TO_TOP;
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("This value is not supported for GradientDirection: ", i));
    }

    public final LinearGradient a(int i, int i2, EnumC2878Xe enumC2878Xe) {
        float width;
        float width2;
        float height;
        float height2;
        int iOrdinal = enumC2878Xe.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        width2 = 0.0f;
                    } else {
                        height = getHeight();
                        width2 = 0.0f;
                    }
                    width = 0.0f;
                } else {
                    height2 = getHeight();
                    width2 = 0.0f;
                    height = 0.0f;
                    width = 0.0f;
                }
                return new LinearGradient(width2, height, width, height2, i, i2, Shader.TileMode.CLAMP);
            }
            width2 = getWidth();
            height = 0.0f;
            width = 0.0f;
        } else {
            width = getWidth();
            width2 = 0.0f;
            height = 0.0f;
        }
        height2 = 0.0f;
        return new LinearGradient(width2, height, width, height2, i, i2, Shader.TileMode.CLAMP);
    }

    public final void b() {
        int iIntValue = this.j == 0.0f ? this.f : this.k;
        Integer num = this.l;
        int iIntValue2 = num != null ? num.intValue() : iIntValue;
        Integer num2 = this.m;
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        this.b.setShader(a(iIntValue2, iIntValue, this.n));
    }

    public final void c() {
        Integer num = this.g;
        int iIntValue = num != null ? num.intValue() : this.f;
        Integer num2 = this.h;
        this.f2420a.setShader(a(iIntValue, num2 != null ? num2.intValue() : this.f, this.i));
    }

    public final void e() {
        int iMin = Math.min(getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        this.e = iMin;
        this.d = ((int) (iMin - (this.j * 2))) / 2;
        c();
        b();
        setOutlineProvider(!this.r ? new C2930Ze(this) : null);
        invalidate();
    }

    public final int getBorderColor() {
        return this.k;
    }

    public final EnumC2878Xe getBorderColorDirection() {
        return this.n;
    }

    public final Integer getBorderColorEnd() {
        return this.m;
    }

    public final Integer getBorderColorStart() {
        return this.l;
    }

    public final float getBorderWidth() {
        return this.j;
    }

    public final int getCircleColor() {
        return this.f;
    }

    public final EnumC2878Xe getCircleColorDirection() {
        return this.i;
    }

    public final Integer getCircleColorEnd() {
        return this.h;
    }

    public final Integer getCircleColorStart() {
        return this.g;
    }

    public final int getShadowColor() {
        return this.p;
    }

    public final boolean getShadowEnable() {
        return this.r;
    }

    public final EnumC2904Ye getShadowGravity() {
        return this.q;
    }

    public final float getShadowRadius() {
        return this.o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        float f4 = this.d + this.j;
        boolean z = this.r;
        float f5 = 0.0f;
        float f6 = z ? this.o * 2 : 0.0f;
        if (z) {
            int i = Build.VERSION.SDK_INT;
            Paint paint = this.c;
            if (i < 28) {
                setLayerType(1, paint);
            }
            int iOrdinal = this.q.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            f3 = this.o;
                        }
                        f2 = 0.0f;
                    } else {
                        f3 = -this.o;
                    }
                    f5 = f3 / 2;
                    f2 = 0.0f;
                } else {
                    f = this.o;
                }
                paint.setShadowLayer(this.o, f5, f2, this.p);
                canvas.drawCircle(f4, f4, f4 - f6, paint);
            } else {
                f = -this.o;
            }
            f2 = f / 2;
            paint.setShadowLayer(this.o, f5, f2, this.p);
            canvas.drawCircle(f4, f4, f4 - f6, paint);
        }
        canvas.drawCircle(f4, f4, f4 - f6, this.b);
        canvas.drawCircle(f4, f4, this.d - f6, this.f2420a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = this.e;
        }
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            size2 = this.e;
        }
        int iMin = Math.min(paddingRight, size2 - (getPaddingBottom() + getPaddingTop()));
        this.e = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e();
    }

    public final void setBorderColor(int i) {
        this.k = i;
        b();
        invalidate();
    }

    public final void setBorderColorDirection(EnumC2878Xe enumC2878Xe) {
        AbstractC2995aW.q(enumC2878Xe, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.n = enumC2878Xe;
        b();
        invalidate();
    }

    public final void setBorderColorEnd(Integer num) {
        this.m = num;
        b();
        invalidate();
    }

    public final void setBorderColorStart(Integer num) {
        this.l = num;
        b();
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.j = f;
        e();
    }

    public final void setCircleColor(int i) {
        this.f = i;
        c();
        invalidate();
    }

    public final void setCircleColorDirection(EnumC2878Xe enumC2878Xe) {
        AbstractC2995aW.q(enumC2878Xe, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.i = enumC2878Xe;
        c();
        invalidate();
    }

    public final void setCircleColorEnd(Integer num) {
        this.h = num;
        c();
        invalidate();
    }

    public final void setCircleColorStart(Integer num) {
        this.g = num;
        c();
        invalidate();
    }

    public final void setShadowColor(int i) {
        this.p = i;
        this.c.setColor(i);
        invalidate();
    }

    public final void setShadowEnable(boolean z) {
        this.r = z;
        if (z && this.o == 0.0f) {
            setShadowRadius(8.0f);
        }
        e();
    }

    public final void setShadowGravity(EnumC2904Ye enumC2904Ye) {
        AbstractC2995aW.q(enumC2904Ye, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.q = enumC2904Ye;
        invalidate();
    }

    public final void setShadowRadius(float f) {
        this.o = f;
        setShadowEnable(f > 0.0f);
    }
}
