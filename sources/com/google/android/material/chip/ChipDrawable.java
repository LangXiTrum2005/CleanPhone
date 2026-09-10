package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    public static final int[] H1 = {R.attr.state_enabled};
    public static final ShapeDrawable I1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public int[] A1;
    public float B0;
    public ColorStateList B1;
    public float C0;
    public WeakReference C1;
    public ColorStateList D0;
    public TextUtils.TruncateAt D1;
    public float E0;
    public boolean E1;
    public ColorStateList F0;
    public int F1;
    public CharSequence G0;
    public boolean G1;
    public boolean H0;
    public Drawable I0;
    public ColorStateList J0;
    public float K0;
    public boolean L0;
    public boolean M0;
    public Drawable N0;
    public RippleDrawable O0;
    public ColorStateList P0;
    public float Q0;
    public SpannableStringBuilder R0;
    public boolean S0;
    public boolean T0;
    public Drawable U0;
    public ColorStateList V0;
    public MotionSpec W0;
    public MotionSpec X0;
    public float Y0;
    public float Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public float f1;
    public final Context g1;
    public final Paint h1;
    public final Paint.FontMetrics i1;
    public final RectF j1;
    public final PointF k1;
    public final Path l1;
    public final TextDrawableHelper m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public boolean t1;
    public int u1;
    public int v1;
    public ColorFilter w1;
    public PorterDuffColorFilter x1;
    public ColorStateList y1;
    public ColorStateList z0;
    public PorterDuff.Mode z1;

    public interface Delegate {
        void a();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action);
        this.C0 = -1.0f;
        this.h1 = new Paint(1);
        this.i1 = new Paint.FontMetrics();
        this.j1 = new RectF();
        this.k1 = new PointF();
        this.l1 = new Path();
        this.v1 = 255;
        this.z1 = PorterDuff.Mode.SRC_IN;
        this.C1 = new WeakReference(null);
        j(context);
        this.g1 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.m1 = textDrawableHelper;
        this.G0 = "";
        textDrawableHelper.f19345a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = H1;
        setState(iArr);
        if (!Arrays.equals(this.A1, iArr)) {
            this.A1 = iArr;
            if (X()) {
                A(getState(), iArr);
            }
        }
        this.E1 = true;
        I1.setTint(-1);
    }

    public static void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final boolean A(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.z0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.n1) : 0);
        boolean state = true;
        if (this.n1 != iC) {
            this.n1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.A0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o1) : 0);
        if (this.o1 != iC2) {
            this.o1 = iC2;
            zOnStateChange = true;
        }
        int iC3 = ColorUtils.c(iC2, iC);
        if ((this.p1 != iC3) | (this.X.f19419c == null)) {
            this.p1 = iC3;
            l(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.D0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.q1) : 0;
        if (this.q1 != colorForState) {
            this.q1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.B1 == null || !RippleUtils.d(iArr)) ? 0 : this.B1.getColorForState(iArr, this.r1);
        if (this.r1 != colorForState2) {
            this.r1 = colorForState2;
        }
        TextAppearance textAppearance = this.m1.g;
        int colorForState3 = (textAppearance == null || (colorStateList = textAppearance.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.s1);
        if (this.s1 != colorForState3) {
            this.s1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (state2[i2] != 16842912) {
                        i2++;
                    } else if (this.S0) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                break;
            }
        } else {
            z2 = false;
            break;
        }
        if (this.t1 == z2 || this.U0 == null) {
            z3 = false;
        } else {
            float fU = u();
            this.t1 = z2;
            if (fU != u()) {
                zOnStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.y1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.u1) : 0;
        if (this.u1 != colorForState4) {
            this.u1 = colorForState4;
            ColorStateList colorStateList6 = this.y1;
            PorterDuff.Mode mode = this.z1;
            this.x1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (y(this.I0)) {
            state |= this.I0.setState(iArr);
        }
        if (y(this.U0)) {
            state |= this.U0.setState(iArr);
        }
        if (y(this.N0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.N0.setState(iArr3);
        }
        if (y(this.O0)) {
            state |= this.O0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z3) {
            z();
        }
        return state;
    }

    public final void B(boolean z2) {
        if (this.S0 != z2) {
            this.S0 = z2;
            float fU = u();
            if (!z2 && this.t1) {
                this.t1 = false;
            }
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.U0 != drawable) {
            float fU = u();
            this.U0 = drawable;
            float fU2 = u();
            Y(this.U0);
            s(this.U0);
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.V0 != colorStateList) {
            this.V0 = colorStateList;
            if (this.T0 && (drawable = this.U0) != null && this.S0) {
                DrawableCompat.j(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.T0 != z2) {
            boolean zV = V();
            this.T0 = z2;
            boolean zV2 = V();
            if (zV != zV2) {
                if (zV2) {
                    s(this.U0);
                } else {
                    Y(this.U0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void F(float f) {
        if (this.C0 != f) {
            this.C0 = f;
            ShapeAppearanceModel.Builder builderF = this.X.f19417a.f();
            builderF.c(f);
            setShapeAppearanceModel(builderF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void G(Drawable drawable) {
        ?? A2;
        Object obj = this.I0;
        if (obj == null) {
            A2 = 0;
        } else if (obj instanceof WrappedDrawable) {
            A2 = obj;
            A2 = ((WrappedDrawable) obj).a();
        }
        if (A2 != drawable) {
            float fU = u();
            this.I0 = drawable != null ? drawable.mutate() : null;
            float fU2 = u();
            Y(A2);
            if (W()) {
                s(this.I0);
            }
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void H(float f) {
        if (this.K0 != f) {
            float fU = u();
            this.K0 = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.L0 = true;
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            if (W()) {
                DrawableCompat.j(this.I0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z2) {
        if (this.H0 != z2) {
            boolean zW = W();
            this.H0 = z2;
            boolean zW2 = W();
            if (zW != zW2) {
                if (zW2) {
                    s(this.I0);
                } else {
                    Y(this.I0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            if (this.G1) {
                MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = this.X;
                if (materialShapeDrawableState.d != colorStateList) {
                    materialShapeDrawableState.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            this.h1.setStrokeWidth(f);
            if (this.G1) {
                this.X.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void M(Drawable drawable) {
        ?? A2;
        Object obj = this.N0;
        if (obj == null) {
            A2 = 0;
        } else if (obj instanceof WrappedDrawable) {
            A2 = obj;
            A2 = ((WrappedDrawable) obj).a();
        }
        if (A2 != drawable) {
            float fV = v();
            this.N0 = drawable != null ? drawable.mutate() : null;
            this.O0 = new RippleDrawable(RippleUtils.c(this.F0), this.N0, I1);
            float fV2 = v();
            Y(A2);
            if (X()) {
                s(this.N0);
            }
            invalidateSelf();
            if (fV != fV2) {
                z();
            }
        }
    }

    public final void N(float f) {
        if (this.e1 != f) {
            this.e1 = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void O(float f) {
        if (this.Q0 != f) {
            this.Q0 = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void P(float f) {
        if (this.d1 != f) {
            this.d1 = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            if (X()) {
                DrawableCompat.j(this.N0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z2) {
        if (this.M0 != z2) {
            boolean zX = X();
            this.M0 = z2;
            boolean zX2 = X();
            if (zX != zX2) {
                if (zX2) {
                    s(this.N0);
                } else {
                    Y(this.N0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void S(float f) {
        if (this.a1 != f) {
            float fU = u();
            this.a1 = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void T(float f) {
        if (this.Z0 != f) {
            float fU = u();
            this.Z0 = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            this.B1 = null;
            onStateChange(getState());
        }
    }

    public final boolean V() {
        return this.T0 && this.U0 != null && this.t1;
    }

    public final boolean W() {
        return this.H0 && this.I0 != null;
    }

    public final boolean X() {
        return this.M0 && this.N0 != null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        z();
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.v1) == 0) {
            return;
        }
        if (i2 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z2 = this.G1;
        Paint paint = this.h1;
        RectF rectF = this.j1;
        if (!z2) {
            paint.setColor(this.n1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, w(), w(), paint);
        }
        if (!this.G1) {
            paint.setColor(this.o1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.w1;
            if (colorFilter == null) {
                colorFilter = this.x1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, w(), w(), paint);
        }
        if (this.G1) {
            super.draw(canvas);
        }
        if (this.E0 > 0.0f && !this.G1) {
            paint.setColor(this.q1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.G1) {
                ColorFilter colorFilter2 = this.w1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.x1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.E0 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.C0 - (this.E0 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.r1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.G1) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.l1;
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = this.X;
            this.s0.a(materialShapeDrawableState.f19417a, materialShapeDrawableState.f19422i, rectF2, this.r0, path);
            e(canvas2, paint, path, this.X.f19417a, g());
        } else {
            canvas2.drawRoundRect(rectF, w(), w(), paint);
        }
        if (W()) {
            t(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.I0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.I0.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (V()) {
            t(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.U0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U0.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.E1 && this.G0 != null) {
            PointF pointF = this.k1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.G0;
            TextDrawableHelper textDrawableHelper = this.m1;
            if (charSequence != null) {
                float fU = u() + this.Y0 + this.b1;
                if (DrawableCompat.d(this) == 0) {
                    pointF.x = bounds.left + fU;
                } else {
                    pointF.x = bounds.right - fU;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = textDrawableHelper.f19345a;
                Paint.FontMetrics fontMetrics = this.i1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.G0 != null) {
                float fU2 = u() + this.Y0 + this.b1;
                float fV = v() + this.f1 + this.c1;
                if (DrawableCompat.d(this) == 0) {
                    rectF.left = bounds.left + fU2;
                    rectF.right = bounds.right - fV;
                } else {
                    rectF.left = bounds.left + fV;
                    rectF.right = bounds.right - fU2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            TextAppearance textAppearance = textDrawableHelper.g;
            TextPaint textPaint2 = textDrawableHelper.f19345a;
            if (textAppearance != null) {
                textPaint2.drawableState = getState();
                textDrawableHelper.g.e(this.g1, textPaint2, textDrawableHelper.f19346b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(textDrawableHelper.a(this.G0.toString())) > Math.round(rectF.width());
            if (z3) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = iSave;
            } else {
                i3 = 0;
            }
            CharSequence charSequenceEllipsize = this.G0;
            if (z3 && this.D1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.D1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z3) {
                canvas2.restoreToCount(i3);
            }
        }
        if (X()) {
            rectF.setEmpty();
            if (X()) {
                float f8 = this.f1 + this.e1;
                if (DrawableCompat.d(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.Q0;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.Q0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f11 = this.Q0;
                float f12 = fExactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.N0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.O0.setBounds(this.N0.getBounds());
            this.O0.jumpToCurrentState();
            this.O0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.v1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.w1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(v() + this.m1.a(this.G0.toString()) + u() + this.Y0 + this.b1 + this.c1 + this.f1), this.F1);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.G1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B0, this.C0);
        } else {
            outline.setRoundRect(bounds, this.C0);
            outline2 = outline;
        }
        outline2.setAlpha(this.v1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (x(this.z0) || x(this.A0) || x(this.D0)) {
            return true;
        }
        TextAppearance textAppearance = this.m1.g;
        if (textAppearance == null || (colorStateList = textAppearance.j) == null || !colorStateList.isStateful()) {
            return (this.T0 && this.U0 != null && this.S0) || y(this.I0) || y(this.U0) || x(this.y1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (W()) {
            zOnLayoutDirectionChanged |= DrawableCompat.h(this.I0, i2);
        }
        if (V()) {
            zOnLayoutDirectionChanged |= DrawableCompat.h(this.U0, i2);
        }
        if (X()) {
            zOnLayoutDirectionChanged |= DrawableCompat.h(this.N0, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (W()) {
            zOnLevelChange |= this.I0.setLevel(i2);
        }
        if (V()) {
            zOnLevelChange |= this.U0.setLevel(i2);
        }
        if (X()) {
            zOnLevelChange |= this.N0.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        if (this.G1) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.A1);
    }

    public final void s(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.h(drawable, DrawableCompat.d(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N0) {
            if (drawable.isStateful()) {
                drawable.setState(this.A1);
            }
            DrawableCompat.j(drawable, this.P0);
            return;
        }
        Drawable drawable2 = this.I0;
        if (drawable == drawable2 && this.L0) {
            DrawableCompat.j(drawable2, this.J0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.v1 != i2) {
            this.v1 = i2;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w1 != colorFilter) {
            this.w1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.z1 != mode) {
            this.z1 = mode;
            ColorStateList colorStateList = this.y1;
            this.x1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (W()) {
            visible |= this.I0.setVisible(z2, z3);
        }
        if (V()) {
            visible |= this.U0.setVisible(z2, z3);
        }
        if (X()) {
            visible |= this.N0.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (W() || V()) {
            float f = this.Y0 + this.Z0;
            Drawable drawable = this.t1 ? this.U0 : this.I0;
            float intrinsicWidth = this.K0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (DrawableCompat.d(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.t1 ? this.U0 : this.I0;
            float fCeil = this.K0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(ViewUtils.b(this.g1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float u() {
        if (!W() && !V()) {
            return 0.0f;
        }
        float f = this.Z0;
        Drawable drawable = this.t1 ? this.U0 : this.I0;
        float intrinsicWidth = this.K0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.a1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (X()) {
            return this.d1 + this.Q0 + this.e1;
        }
        return 0.0f;
    }

    public final float w() {
        return this.G1 ? h() : this.C0;
    }

    public final void z() {
        Delegate delegate = (Delegate) this.C1.get();
        if (delegate != null) {
            delegate.a();
        }
    }
}
