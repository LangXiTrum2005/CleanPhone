package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3100bg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3011ag;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WW;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorSeekBarVertical extends View {
    public static final /* synthetic */ int C = 0;
    public float A;
    public float B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5356a;
    public final int[] b;
    public final int c;
    public final int d;
    public final RectF e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public float i;
    public final float j;
    public float k;
    public float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public InterfaceC3011ag r;
    public final Drawable s;
    public final float t;
    public final float u;
    public final Drawable v;
    public final Drawable w;
    public final float x;
    public float y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorSeekBarVertical(Context context, AttributeSet attributeSet) {
        int[] iArr;
        super(context, attributeSet);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(attributeSet, "attributeSet");
        this.f5356a = 16.0f;
        this.b = new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#FF0000"), Color.parseColor("#FF6B00"), Color.parseColor("#FFE500"), Color.parseColor("#00FFA3"), Color.parseColor("#00ECFF"), Color.parseColor("#0075FF"), Color.parseColor("#EC00D4")};
        this.c = 20;
        this.d = 20;
        this.e = new RectF();
        this.f = new Paint();
        this.g = new Paint();
        this.h = new Paint();
        this.i = 24.0f;
        this.j = 10;
        this.k = 16.0f;
        this.l = 20.0f;
        this.m = 30.0f;
        this.n = 30.0f;
        this.o = 8.0f;
        this.p = 16.0f;
        this.q = 20.0f;
        this.x = 3.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WW.f3923a);
        AbstractC2995aW.p(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            if (isInEditMode()) {
                String[] stringArray = getContext().getResources().getStringArray(resourceId);
                AbstractC2995aW.p(stringArray, "getStringArray(...)");
                iArr = new int[stringArray.length];
                int length = stringArray.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = Color.parseColor(stringArray[i]);
                }
            } else {
                TypedArray typedArrayObtainTypedArray = getContext().getResources().obtainTypedArray(resourceId);
                AbstractC2995aW.p(typedArrayObtainTypedArray, "obtainTypedArray(...)");
                iArr = new int[typedArrayObtainTypedArray.length()];
                int length2 = typedArrayObtainTypedArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[i2] = typedArrayObtainTypedArray.getColor(i2, ViewCompat.MEASURED_STATE_MASK);
                }
                typedArrayObtainTypedArray.recycle();
            }
            this.b = iArr;
        }
        this.o = typedArrayObtainStyledAttributes.getDimension(3, 8.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(0, 20.0f);
        this.d = dimension;
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(9, 4.0f);
        int color = typedArrayObtainStyledAttributes.getColor(10, ViewCompat.MEASURED_STATE_MASK);
        this.n = typedArrayObtainStyledAttributes.getDimension(4, 30.0f);
        this.m = typedArrayObtainStyledAttributes.getDimension(5, 30.0f);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        if (resourceId2 != 0) {
            this.s = context.getResources().getDrawable(resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        if (resourceId3 != 0) {
            this.v = context.getResources().getDrawable(resourceId3);
        }
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        if (resourceId4 != 0) {
            this.w = context.getResources().getDrawable(resourceId4);
        }
        this.x = typedArrayObtainStyledAttributes.getDimension(1, 3.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f.setAntiAlias(true);
        this.h.setAntiAlias(true);
        this.g.setAntiAlias(true);
        this.g.setColor(color);
        float f = dimension / 2;
        float f2 = this.f5356a;
        f = f < f2 ? f2 : f;
        this.k = f;
        float f3 = dimension2 + f;
        this.l = f3;
        if (this.s != null) {
            this.c = dimension * 3;
            float f4 = (float) (((double) dimension) * 2.5d);
            this.t = f4;
            this.u = f4;
        } else {
            this.c = (int) (3 * f3);
        }
        this.j = this.c / 2;
        this.p = f;
        this.q = f3;
    }

    private final int getThumbPaddingVertical() {
        return 10;
    }

    public final int a(float f) {
        float f2 = this.y;
        float f3 = (f - f2) / (this.z - f2);
        if (Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        double d = f3;
        int[] iArr = this.b;
        if (d <= 0.0d) {
            return iArr[0];
        }
        if (f3 >= 1.0f) {
            return iArr[iArr.length - 1];
        }
        float length = f3 * (iArr.length - 1);
        int i = (int) length;
        float f4 = length - i;
        int i2 = iArr[i];
        int i3 = iArr[i + 1];
        int iRed = Color.red(i2);
        int iU = AbstractC3375el.U((Color.red(i3) - iRed) * f4) + iRed;
        int iGreen = Color.green(i2);
        int iU2 = AbstractC3375el.U((Color.green(i3) - iGreen) * f4) + iGreen;
        int iBlue = Color.blue(i2);
        return Color.rgb(iU, iU2, AbstractC3375el.U(f4 * (Color.blue(i3) - iBlue)) + iBlue);
    }

    public final Object b(int i, InterfaceC2857Wj interfaceC2857Wj) {
        int[] iArr = this.b;
        int length = iArr.length;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            int iRed = Color.red(i) - Color.red(i5);
            int iGreen = Color.green(i) - Color.green(i5);
            int iBlue = Color.blue(i) - Color.blue(i5);
            int i6 = (iBlue * iBlue) + (iGreen * iGreen) + (iRed * iRed);
            if (i6 < i2) {
                i3 = i4;
                i2 = i6;
            }
        }
        C3100bg c3100bg = new C3100bg(this, i3 / (iArr.length - 1), i, null);
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return WD.X(c3100bg, TL.f3768a, interfaceC2857Wj);
    }

    public final int getColor() {
        return this.h.getColor();
    }

    public final float getPositionPercentage() {
        float f = this.i;
        float f2 = this.y;
        return ((f - f2) / (this.z - f2)) * 100;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.x;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds((int) (this.A - f), (int) ((this.y - f) - 1), (int) (this.B + f), (int) (this.z + f));
            drawable.draw(canvas);
        }
        RectF rectF = this.e;
        rectF.set(this.A, this.y, this.B, this.z);
        Paint paint = this.f;
        float f2 = this.o;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float f3 = this.i;
        float f4 = this.y;
        if (f3 < f4) {
            this.i = f4;
        } else {
            float f5 = this.z;
            if (f3 > f5) {
                this.i = f5;
            }
        }
        int iA = a(this.i);
        Paint paint2 = this.h;
        paint2.setColor(iA);
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setBounds((int) (this.A - f), (int) (this.y - f), (int) (this.B + f), (int) (this.z + f));
            drawable2.draw(canvas);
        }
        float f6 = this.j;
        Drawable drawable3 = this.s;
        if (drawable3 == null) {
            canvas.drawCircle(f6, this.i, this.l, this.g);
            canvas.drawCircle(f6, this.i, this.k, paint2);
        } else if (drawable3 != null) {
            float f7 = 2;
            float f8 = this.t;
            float f9 = this.i;
            float f10 = this.u;
            drawable3.setBounds((int) (f6 - (f8 / f7)), (int) (f9 - (f10 / f7)), (int) ((f8 / f7) + f6), (int) ((f10 / f7) + f9));
            drawable3.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.c, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.y = this.m;
        this.z = getHeight() - this.n;
        int i5 = this.c / 2;
        int i6 = this.d / 2;
        this.A = i5 - i6;
        this.B = i6 + i5;
        this.f.setShader(new LinearGradient(0.0f, this.y, 0.0f, this.z, this.b, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        float f = this.p;
        float f2 = this.q;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (this.s == null) {
                this.l = (float) (((double) f2) * 1.5d);
                this.k = (float) (((double) f) * 1.5d);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            float y = motionEvent.getY();
            float f3 = this.y;
            if (y < f3) {
                this.i = f3;
            } else {
                float f4 = this.z;
                if (y > f4) {
                    this.i = f4;
                } else {
                    this.i = y;
                }
            }
            invalidate();
            InterfaceC3011ag interfaceC3011ag = this.r;
            if (interfaceC3011ag != null) {
                ((Lj0) interfaceC3011ag).a(getColor());
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            float y2 = motionEvent.getY();
            float f5 = this.y;
            if (y2 < f5) {
                this.i = f5;
            } else {
                float f6 = this.z;
                if (y2 > f6) {
                    this.i = f6;
                } else {
                    this.i = y2;
                }
            }
            this.l = f2;
            this.k = f;
            invalidate();
            post(new P0(this, 16));
        }
        return true;
    }

    public final void setOnColorChangeListener(InterfaceC3011ag interfaceC3011ag) {
        AbstractC2995aW.q(interfaceC3011ag, "onColorChangeListener");
        this.r = interfaceC3011ag;
    }

    public final void setPositionPercentageColor(float f) {
        float f2 = this.z;
        float f3 = this.y;
        float fW = AbstractC5044xl.w(f2, f3, f / 100, f3);
        this.i = fW;
        Paint paint = this.h;
        paint.setColor(a(fW));
        InterfaceC3011ag interfaceC3011ag = this.r;
        if (interfaceC3011ag != null) {
            ((Lj0) interfaceC3011ag).a(paint.getColor());
        }
        invalidate();
    }

    public final void setPositionPercentageColorNotListener(float f) {
        float f2 = this.z;
        float f3 = this.y;
        float fW = AbstractC5044xl.w(f2, f3, f / 100, f3);
        this.i = fW;
        this.h.setColor(a(fW));
        invalidate();
    }
}
