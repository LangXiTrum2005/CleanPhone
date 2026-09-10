package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    public static final /* synthetic */ int R0 = 0;
    public float A0;
    public float[] B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public ColorStateList I0;
    public ColorStateList J0;
    public ColorStateList K0;
    public ColorStateList L0;
    public ColorStateList M0;
    public Drawable N0;
    public ArrayList O0;
    public float P0;
    public int Q0;
    public boolean e0;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public float r0;
    public MotionEvent s0;
    public LabelFormatter t0;
    public boolean u0;
    public float v0;
    public float w0;
    public ArrayList x0;
    public int y0;
    public int z0;

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19484a;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            f19484a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19484a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19484a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19484a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AccessibilityEventSender implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int i2 = BaseSlider.R0;
            throw null;
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void l(ArrayList arrayList) {
            throw null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean o(int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void q(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.o);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FullCornerDirection {
        public static final FullCornerDirection X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final FullCornerDirection f19485Y;
        public static final FullCornerDirection Z;
        public static final /* synthetic */ FullCornerDirection[] e0;

        /* JADX INFO: Fake field, exist only in values array */
        FullCornerDirection EF0;

        static {
            FullCornerDirection fullCornerDirection = new FullCornerDirection("BOTH", 0);
            FullCornerDirection fullCornerDirection2 = new FullCornerDirection("LEFT", 1);
            X = fullCornerDirection2;
            FullCornerDirection fullCornerDirection3 = new FullCornerDirection("RIGHT", 2);
            f19485Y = fullCornerDirection3;
            FullCornerDirection fullCornerDirection4 = new FullCornerDirection("NONE", 3);
            Z = fullCornerDirection4;
            e0 = new FullCornerDirection[]{fullCornerDirection, fullCornerDirection2, fullCornerDirection3, fullCornerDirection4};
        }

        public static FullCornerDirection valueOf(String str) {
            return (FullCornerDirection) Enum.valueOf(FullCornerDirection.class, str);
        }

        public static FullCornerDirection[] values() {
            return (FullCornerDirection[]) e0.clone();
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new AnonymousClass1();
        public float X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public float f19486Y;
        public ArrayList Z;
        public float e0;
        public boolean f0;

        /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$SliderState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.X = parcel.readFloat();
                sliderState.f19486Y = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                sliderState.Z = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.e0 = parcel.readFloat();
                sliderState.f0 = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i2) {
                return new SliderState[i2];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.X);
            parcel.writeFloat(this.f19486Y);
            parcel.writeList(this.Z);
            parcel.writeFloat(this.e0);
            parcel.writeBooleanArray(new boolean[]{this.f0});
        }
    }

    public final int a() {
        int i2 = this.h0;
        if (i2 == 1 || i2 == 3) {
            throw null;
        }
        return 0;
    }

    public final ValueAnimator b(boolean z2) {
        int iC;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z2 ? this.g0 : this.f0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z2 ? 1.0f : 0.0f);
        if (z2) {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f19081e);
        } else {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AnimationUtils.f19080c);
        }
        valueAnimatorOfFloat.setDuration(iC);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i2 = BaseSlider.R0;
                BaseSlider.this.getClass();
                throw null;
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void c(Canvas canvas, int i2, int i3, float f, Drawable drawable) {
        canvas.save();
        canvas.translate(((int) (m(f) * i2)) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void d() {
        if (this.e0) {
            this.e0 = false;
            ValueAnimator valueAnimatorB = b(false);
            this.g0 = valueAnimatorB;
            this.f0 = null;
            valueAnimatorB.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    BaseSlider baseSlider = BaseSlider.this;
                    ViewUtils.d(ViewUtils.c(baseSlider));
                    int i2 = BaseSlider.R0;
                    baseSlider.getClass();
                    throw null;
                }
            });
            this.g0.start();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f(this.M0);
        throw null;
    }

    public final float[] e() {
        float fFloatValue = ((Float) this.x0.get(0)).floatValue();
        float fFloatValue2 = ((Float) a.d(1, this.x0)).floatValue();
        if (this.x0.size() == 1) {
            fFloatValue = this.v0;
        }
        float fM = m(fFloatValue);
        float fM2 = m(fFloatValue2);
        return i() ? new float[]{fM2, fM} : new float[]{fM, fM2};
    }

    public final void f(ColorStateList colorStateList) {
        colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean g(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.A0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        throw null;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public int getThumbRadius() {
        return this.j0 / 2;
    }

    public List<Float> getValues() {
        return new ArrayList(this.x0);
    }

    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return getLayoutDirection() == 1;
    }

    public final void j() {
        if (this.A0 <= 0.0f) {
            return;
        }
        r();
        int iMin = Math.min((int) (((this.w0 - this.v0) / this.A0) + 1.0f), (this.F0 / 0) + 1);
        if (this.B0.length != iMin * 2) {
            this.B0 = new float[iMin * 2];
        }
        float f = this.F0 / (iMin - 1);
        for (int i2 = 0; i2 < iMin * 2; i2 += 2) {
            float[] fArr = this.B0;
            float f2 = 0;
            fArr[i2] = ((i2 / 2.0f) * f) + f2;
            a();
            fArr[i2 + 1] = f2;
        }
    }

    public final boolean k(int i2) {
        int i3 = this.z0;
        long j = ((long) i3) + ((long) i2);
        long size = this.x0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i4 = (int) j;
        this.z0 = i4;
        if (i4 == i3) {
            return false;
        }
        if (this.y0 != -1) {
            this.y0 = i4;
        }
        q();
        postInvalidate();
        return true;
    }

    public final void l(int i2) {
        if (i()) {
            i2 = i2 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i2;
        }
        k(i2);
    }

    public final float m(float f) {
        float f2 = this.v0;
        float f3 = (f - f2) / (this.w0 - f2);
        return i() ? 1.0f - f3 : f3;
    }

    public boolean n() {
        if (this.y0 != -1) {
            return true;
        }
        float f = this.P0;
        if (i()) {
            f = 1.0f - f;
        }
        float f2 = this.w0;
        float f3 = this.v0;
        float fA = a.a(f2, f3, f, f3);
        float fT = t(fA);
        this.y0 = 0;
        float fAbs = Math.abs(((Float) this.x0.get(0)).floatValue() - fA);
        for (int i2 = 1; i2 < this.x0.size(); i2++) {
            float fAbs2 = Math.abs(((Float) this.x0.get(i2)).floatValue() - fA);
            float fT2 = t(((Float) this.x0.get(i2)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z2 = !i() ? fT2 - fT >= 0.0f : fT2 - fT <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.y0 = i2;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fT2 - fT) < 0) {
                        this.y0 = -1;
                        return false;
                    }
                    if (z2) {
                        this.y0 = i2;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.y0 != -1;
    }

    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.x0.size() == arrayList.size() && this.x0.equals(arrayList)) {
            return;
        }
        this.x0 = arrayList;
        this.H0 = true;
        this.z0 = 0;
        q();
        throw null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(null);
        throw null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.e0 = false;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0106 A[LOOP:0: B:36:0x00a0->B:56:0x0106, LOOP_END] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        float f;
        BaseSlider<S, L, T> baseSlider = this;
        Canvas canvas2 = canvas;
        if (baseSlider.H0) {
            baseSlider.r();
            baseSlider.j();
        }
        super.onDraw(canvas);
        baseSlider.a();
        float fFloatValue = ((Float) baseSlider.x0.get(0)).floatValue();
        float fFloatValue2 = ((Float) a.d(1, baseSlider.x0)).floatValue();
        if (fFloatValue2 < baseSlider.w0 || (baseSlider.x0.size() > 1 && fFloatValue > baseSlider.v0)) {
            int i3 = baseSlider.F0;
            float[] fArrE = baseSlider.e();
            float f2 = 0;
            float f3 = i3;
            if ((fArrE[1] * f3) + f2 < i3) {
                if (baseSlider.m0 > 0) {
                    throw null;
                }
                Paint.Style style = Paint.Style.STROKE;
                throw null;
            }
            if ((fArrE[0] * f3) + f2 > f2) {
                if (baseSlider.m0 > 0) {
                    throw null;
                }
                Paint.Style style2 = Paint.Style.STROKE;
                throw null;
            }
        }
        if (fFloatValue2 > baseSlider.v0) {
            int i4 = baseSlider.F0;
            float[] fArrE2 = baseSlider.e();
            float f4 = 0;
            float f5 = i4;
            float fT = (fArrE2[1] * f5) + f4;
            float fT2 = (fArrE2[0] * f5) + f4;
            if (baseSlider.m0 <= 0) {
                Paint.Style style3 = Paint.Style.STROKE;
                throw null;
            }
            FullCornerDirection fullCornerDirection = FullCornerDirection.Z;
            if (baseSlider.x0.size() == 1) {
                fullCornerDirection = baseSlider.i() ? FullCornerDirection.f19485Y : FullCornerDirection.X;
            }
            for (int i5 = 0; i5 < baseSlider.x0.size(); i5++) {
                if (baseSlider.x0.size() > 1) {
                    if (i5 > 0) {
                        fT2 = baseSlider.t(((Float) baseSlider.x0.get(i5 - 1)).floatValue());
                    }
                    fT = baseSlider.t(((Float) baseSlider.x0.get(i5)).floatValue());
                    if (baseSlider.i()) {
                        fT = fT2;
                        fT2 = fT;
                    }
                }
                int iOrdinal = fullCornerDirection.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        fT2 += baseSlider.m0;
                        fT = (baseSlider.i0 / 2.0f) + fT;
                    } else if (iOrdinal == 3) {
                        f = baseSlider.m0;
                        fT2 += f;
                    }
                    if (fT2 >= fT) {
                        throw null;
                    }
                } else {
                    fT2 -= baseSlider.i0 / 2.0f;
                    f = baseSlider.m0;
                }
                fT -= f;
                if (fT2 >= fT) {
                    throw null;
                }
            }
        }
        if (baseSlider.C0 && baseSlider.A0 > 0.0f) {
            float[] fArrE3 = baseSlider.e();
            int iCeil = (int) Math.ceil(((baseSlider.B0.length / 2.0f) - 1.0f) * fArrE3[0]);
            int iFloor = (int) Math.floor(((baseSlider.B0.length / 2.0f) - 1.0f) * fArrE3[1]);
            if (iCeil > 0) {
                canvas2.drawPoints(baseSlider.B0, 0, iCeil * 2, null);
            }
            if (iCeil <= iFloor) {
                canvas2.drawPoints(baseSlider.B0, iCeil * 2, ((iFloor - iCeil) + 1) * 2, null);
            }
            int i6 = (iFloor + 1) * 2;
            float[] fArr = baseSlider.B0;
            if (i6 < fArr.length) {
                canvas2.drawPoints(fArr, i6, fArr.length - i6, null);
            }
        }
        int i7 = 0;
        if (baseSlider.p0 > 0) {
            if (baseSlider.x0.size() >= 1) {
                float fFloatValue3 = ((Float) a.d(1, baseSlider.x0)).floatValue();
                float f6 = baseSlider.w0;
                if (fFloatValue3 < f6) {
                    canvas2.drawPoint(baseSlider.t(f6), 0, null);
                }
            }
            if (baseSlider.x0.size() > 1) {
                float fFloatValue4 = ((Float) baseSlider.x0.get(0)).floatValue();
                float f7 = baseSlider.v0;
                if (fFloatValue4 > f7) {
                    canvas2.drawPoint(baseSlider.t(f7), 0, null);
                }
            }
        }
        if ((baseSlider.u0 || baseSlider.isFocused()) && baseSlider.isEnabled()) {
            int i8 = baseSlider.F0;
            if (!(baseSlider.getBackground() instanceof RippleDrawable)) {
                float f8 = 0;
                int iM = (int) ((baseSlider.m(((Float) baseSlider.x0.get(baseSlider.z0)).floatValue()) * i8) + f8);
                if (Build.VERSION.SDK_INT < 28) {
                    int i9 = baseSlider.l0;
                    canvas2.clipRect(iM - i9, 0 - i9, iM + i9, i9, Region.Op.UNION);
                }
                canvas2.drawCircle(iM, f8, baseSlider.l0, null);
            }
        }
        int i10 = baseSlider.h0;
        if (i10 == 0 || i10 == 1) {
            if (baseSlider.y0 != -1 && baseSlider.isEnabled()) {
                if (baseSlider.e0) {
                    throw null;
                }
                baseSlider.e0 = true;
                ValueAnimator valueAnimatorB = baseSlider.b(true);
                baseSlider.f0 = valueAnimatorB;
                baseSlider.g0 = null;
                valueAnimatorB.start();
                throw null;
            }
            baseSlider.d();
        } else if (i10 == 2) {
            baseSlider.d();
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Unexpected labelBehavior: " + baseSlider.h0);
            }
            if (baseSlider.isEnabled()) {
                Rect rect = new Rect();
                ViewUtils.c(baseSlider).getHitRect(rect);
                if (baseSlider.getLocalVisibleRect(rect)) {
                    if (baseSlider.e0) {
                        throw null;
                    }
                    baseSlider.e0 = true;
                    ValueAnimator valueAnimatorB2 = baseSlider.b(true);
                    baseSlider.f0 = valueAnimatorB2;
                    baseSlider.g0 = null;
                    valueAnimatorB2.start();
                    throw null;
                }
            }
            baseSlider.d();
        }
        int i11 = baseSlider.F0;
        int i12 = 0;
        while (i12 < baseSlider.x0.size()) {
            float fFloatValue5 = ((Float) baseSlider.x0.get(i12)).floatValue();
            Drawable drawable = baseSlider.N0;
            if (drawable != null) {
                i2 = i7;
                baseSlider.c(canvas2, i11, i2, fFloatValue5, drawable);
            } else {
                i2 = i7;
                if (i12 < baseSlider.O0.size()) {
                    baseSlider.c(canvas, i11, i2, fFloatValue5, (Drawable) baseSlider.O0.get(i12));
                } else {
                    if (!baseSlider.isEnabled()) {
                        float f9 = 0;
                        canvas.drawCircle((baseSlider.m(fFloatValue5) * i11) + f9, f9, baseSlider.getThumbRadius(), null);
                    }
                    baseSlider.c(canvas, i11, i2, fFloatValue5, null);
                }
            }
            i12++;
            baseSlider = this;
            canvas2 = canvas;
            i7 = i2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!z2) {
            this.y0 = -1;
            throw null;
        }
        if (i2 == 1) {
            k(Integer.MAX_VALUE);
            throw null;
        }
        if (i2 == 2) {
            k(Integer.MIN_VALUE);
            throw null;
        }
        if (i2 == 17) {
            l(Integer.MAX_VALUE);
            throw null;
        }
        if (i2 != 66) {
            throw null;
        }
        l(Integer.MIN_VALUE);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Float fValueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.x0.size() == 1) {
            this.y0 = 0;
        }
        Boolean boolValueOf = null;
        if (this.y0 == -1) {
            if (i2 != 61) {
                if (i2 == 66) {
                    this.y0 = this.z0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i2 == 81) {
                    k(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i2 == 69) {
                    k(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i2 != 70) {
                    switch (i2) {
                        case 21:
                            l(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            l(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.y0 = this.z0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    k(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(k(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(k(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i2, keyEvent);
        }
        boolean zIsLongPress = this.G0 | keyEvent.isLongPress();
        this.G0 = zIsLongPress;
        float fRound = 1.0f;
        float fA = 0.0f;
        if (zIsLongPress) {
            float f = this.A0;
            fRound = f != 0.0f ? f : 1.0f;
            float f2 = (this.w0 - this.v0) / fRound;
            float f3 = 20;
            if (f2 > f3) {
                fRound *= Math.round(f2 / f3);
            }
        } else {
            float f4 = this.A0;
            if (f4 != 0.0f) {
                fRound = f4;
            }
        }
        if (i2 == 21) {
            if (!i()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i2 == 22) {
            if (i()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i2 != 69) {
            fValueOf = (i2 == 70 || i2 == 81) ? Float.valueOf(fRound) : null;
        } else {
            fValueOf = Float.valueOf(-fRound);
        }
        if (fValueOf == null) {
            if (i2 != 23) {
                if (i2 == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        return k(1);
                    }
                    if (keyEvent.isShiftPressed()) {
                        return k(-1);
                    }
                    return false;
                }
                if (i2 != 66) {
                    return super.onKeyDown(i2, keyEvent);
                }
            }
            this.y0 = -1;
            postInvalidate();
            return true;
        }
        float fFloatValue = fValueOf.floatValue() + ((Float) this.x0.get(this.y0)).floatValue();
        int i3 = this.y0;
        this.z0 = i3;
        if (Math.abs(fFloatValue - ((Float) this.x0.get(i3)).floatValue()) < 1.0E-4d) {
            return true;
        }
        float minSeparation = getMinSeparation();
        if (this.Q0 == 0) {
            if (minSeparation != 0.0f) {
                float f5 = (minSeparation - 0) / this.F0;
                float f6 = this.v0;
                fA = a.a(f6, this.w0, f5, f6);
            }
            minSeparation = fA;
        }
        if (i()) {
            minSeparation = -minSeparation;
        }
        int i4 = i3 + 1;
        int i5 = i3 - 1;
        this.x0.set(i3, Float.valueOf(MathUtils.a(fFloatValue, i5 < 0 ? this.v0 : minSeparation + ((Float) this.x0.get(i5)).floatValue(), i4 >= this.x0.size() ? this.w0 : ((Float) this.x0.get(i4)).floatValue() - minSeparation)));
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        this.G0 = false;
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4 = this.h0;
        if (i4 == 1 || i4 == 3) {
            throw null;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.v0 = sliderState.X;
        this.w0 = sliderState.f19486Y;
        o(sliderState.Z);
        this.A0 = sliderState.e0;
        if (sliderState.f0) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.X = this.v0;
        sliderState.f19486Y = this.w0;
        sliderState.Z = new ArrayList(this.x0);
        sliderState.e0 = this.A0;
        sliderState.f0 = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.F0 = Math.max(i2, 0);
        j();
        q();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i2;
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f = 0;
            float f2 = (x - f) / this.F0;
            this.P0 = f2;
            float fMax = Math.max(0.0f, f2);
            this.P0 = fMax;
            this.P0 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.r0 = x;
                if (!h(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (n()) {
                        requestFocus();
                        this.u0 = true;
                        p();
                        q();
                        int i3 = this.m0;
                        if (i3 > 0) {
                            int i4 = this.j0;
                            this.n0 = i4;
                            this.o0 = i3;
                            int iRound = Math.round(i4 * 0.5f);
                            int i5 = this.j0 - iRound;
                            setThumbWidth(iRound);
                            setThumbTrackGapSize(this.m0 - (i5 / 2));
                        }
                        invalidate();
                        throw null;
                    }
                }
            } else if (actionMasked == 1) {
                this.u0 = false;
                motionEvent2 = this.s0;
                if (motionEvent2 == null && motionEvent2.getActionMasked() == 0 && Math.abs(this.s0.getX() - motionEvent.getX()) <= f && Math.abs(this.s0.getY() - motionEvent.getY()) <= f && n()) {
                    throw null;
                }
                if (this.y0 != -1) {
                    p();
                    q();
                    if (this.m0 > 0 && (i2 = this.n0) != -1 && this.o0 != -1) {
                        setThumbWidth(i2);
                        setThumbTrackGapSize(this.o0);
                    }
                    this.y0 = -1;
                    throw null;
                }
                invalidate();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.u0 = false;
                    motionEvent2 = this.s0;
                    if (motionEvent2 == null) {
                    }
                    if (this.y0 != -1) {
                        p();
                        q();
                        if (this.m0 > 0) {
                            setThumbWidth(i2);
                            setThumbTrackGapSize(this.o0);
                        }
                        this.y0 = -1;
                        throw null;
                    }
                    invalidate();
                }
            } else if (this.u0) {
                if (n()) {
                    this.u0 = true;
                    p();
                    q();
                    invalidate();
                }
            } else if (!h(motionEvent) || Math.abs(x - this.r0) >= f) {
                getParent().requestDisallowInterceptTouchEvent(true);
                throw null;
            }
            setPressed(this.u0);
            this.s0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0 && ViewUtils.d(ViewUtils.c(this)) != null) {
            throw null;
        }
    }

    public final void p() {
        double dRound;
        float f = this.P0;
        float f2 = this.A0;
        float fA = 0.0f;
        if (f2 > 0.0f) {
            int i2 = (int) ((this.w0 - this.v0) / f2);
            dRound = ((double) Math.round(f * i2)) / ((double) i2);
        } else {
            dRound = f;
        }
        if (i()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.w0;
        float f4 = this.v0;
        float f5 = (float) ((dRound * ((double) (f3 - f4))) + ((double) f4));
        int i3 = this.y0;
        this.z0 = i3;
        if (Math.abs(f5 - ((Float) this.x0.get(i3)).floatValue()) < 1.0E-4d) {
            return;
        }
        float minSeparation = getMinSeparation();
        if (this.Q0 == 0) {
            if (minSeparation != 0.0f) {
                float f6 = (minSeparation - 0) / this.F0;
                float f7 = this.v0;
                fA = a.a(f7, this.w0, f6, f7);
            }
            minSeparation = fA;
        }
        if (i()) {
            minSeparation = -minSeparation;
        }
        int i4 = i3 + 1;
        int i5 = i3 - 1;
        this.x0.set(i3, Float.valueOf(MathUtils.a(f5, i5 < 0 ? this.v0 : minSeparation + ((Float) this.x0.get(i5)).floatValue(), i4 >= this.x0.size() ? this.w0 : ((Float) this.x0.get(i4)).floatValue() - minSeparation)));
        throw null;
    }

    public final void q() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM = (int) ((m(((Float) this.x0.get(this.z0)).floatValue()) * this.F0) + 0);
            a();
            int i2 = this.l0;
            DrawableCompat.g(background, iM - i2, 0 - i2, iM + i2, i2);
        }
    }

    public final void r() {
        if (this.H0) {
            float f = this.v0;
            float f2 = this.w0;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.v0 + ") must be smaller than valueTo(" + this.w0 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.w0 + ") must be greater than valueFrom(" + this.v0 + ")");
            }
            if (this.A0 > 0.0f && !s(f2)) {
                throw new IllegalStateException("The stepSize(" + this.A0 + ") must be 0, or a factor of the valueFrom(" + this.v0 + ")-valueTo(" + this.w0 + ") range");
            }
            for (Float f3 : this.x0) {
                if (f3.floatValue() < this.v0 || f3.floatValue() > this.w0) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.v0 + "), and lower or equal to valueTo(" + this.w0 + ")");
                }
                if (this.A0 > 0.0f && !s(f3.floatValue())) {
                    float f4 = this.v0;
                    float f5 = this.A0;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.A0;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.Q0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.A0 + ")");
                }
                if (minSeparation < f6 || !g(minSeparation)) {
                    float f7 = this.A0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.A0;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.v0;
                if (((int) f9) != f9) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.w0;
                if (((int) f10) != f10) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.H0 = false;
        }
    }

    public final boolean s(float f) {
        return g(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.v0)), MathContext.DECIMAL64).doubleValue());
    }

    public void setActiveThumbIndex(int i2) {
        this.y0 = i2;
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        int intrinsicWidth = drawableNewDrawable.getIntrinsicWidth();
        int intrinsicHeight = drawableNewDrawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawableNewDrawable.setBounds(0, 0, this.j0, this.k0);
        } else {
            float fMax = Math.max(this.j0, this.k0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawableNewDrawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
        this.N0 = drawableNewDrawable;
        this.O0.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            drawableArr[i2] = getResources().getDrawable(iArr[i2]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, null);
    }

    public void setHaloRadius(int i2) {
        if (i2 == this.l0) {
            return;
        }
        this.l0 = i2;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.l0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.I0)) {
            return;
        }
        this.I0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
        } else {
            f(colorStateList);
            throw null;
        }
    }

    public void setSeparationUnit(int i2) {
        this.Q0 = i2;
        this.H0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.A0 != f) {
                this.A0 = f;
                this.H0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.v0 + ")-valueTo(" + this.w0 + ") range");
    }

    public void setThumbHeight(int i2) {
        if (i2 == this.k0) {
            return;
        }
        this.k0 = i2;
        throw null;
    }

    public void setThumbRadius(int i2) {
        int i3 = i2 * 2;
        setThumbWidth(i3);
        setThumbHeight(i3);
    }

    public void setThumbTrackGapSize(int i2) {
        if (this.m0 == i2) {
            return;
        }
        this.m0 = i2;
        invalidate();
    }

    public void setThumbWidth(int i2) {
        if (i2 == this.j0) {
            return;
        }
        this.j0 = i2;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        float f = this.j0 / 2.0f;
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(0);
        builder.f19434a = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builder.f19435b = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builder.f19436c = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builder.d = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builder.c(f);
        builder.a();
        throw null;
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.J0)) {
            return;
        }
        this.J0 = colorStateList;
        f(colorStateList);
        throw null;
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.K0)) {
            return;
        }
        this.K0 = colorStateList;
        f(colorStateList);
        throw null;
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.L0)) {
            return;
        }
        this.L0 = colorStateList;
        f(colorStateList);
        throw null;
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.M0)) {
            return;
        }
        this.M0 = colorStateList;
        f(colorStateList);
        throw null;
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        o(arrayList);
    }

    public final float t(float f) {
        return (m(f) * this.F0) + 0;
    }

    public void setValues(List<Float> list) {
        o(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.N0 = null;
        this.O0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            ArrayList arrayList = this.O0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            int intrinsicWidth = drawableNewDrawable.getIntrinsicWidth();
            int intrinsicHeight = drawableNewDrawable.getIntrinsicHeight();
            if (intrinsicWidth == -1 && intrinsicHeight == -1) {
                drawableNewDrawable.setBounds(0, 0, this.j0, this.k0);
            } else {
                float fMax = Math.max(this.j0, this.k0) / Math.max(intrinsicWidth, intrinsicHeight);
                drawableNewDrawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
            }
            arrayList.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
