package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int z0 = 0;
    public final int e0;
    public final TimeInterpolator f0;
    public final ValueAnimator g0;
    public boolean h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final int l0;
    public boolean m0;
    public final ArrayList n0;
    public final int o0;
    public final float p0;
    public final Paint q0;
    public final RectF r0;
    public final int s0;
    public float t0;
    public boolean u0;
    public OnActionUpListener v0;
    public double w0;
    public int x0;
    public int y0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface OnActionUpListener {
    }

    public interface OnRotateListener {
        void b(float f, boolean z2);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.g0 = new ValueAnimator();
        this.n0 = new ArrayList();
        Paint paint = new Paint();
        this.q0 = paint;
        this.r0 = new RectF();
        this.y0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19070h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.e0 = MotionUtils.c(context, R.attr.motionDurationLong2, 200);
        this.f0 = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f19079b);
        this.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.s0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.p0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(0.0f, false);
        this.l0 = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i2 = degrees + 90;
        return i2 < 0 ? degrees + 450 : i2;
    }

    public final int b(int i2) {
        return i2 == 2 ? Math.round(this.x0 * 0.66f) : this.x0;
    }

    public final void c(float f, boolean z2) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            d(f, false);
            return;
        }
        float f2 = this.t0;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.e0);
        valueAnimator.setInterpolator(this.f0);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = ClockHandView.z0;
                ClockHandView clockHandView = this.X;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new AnonymousClass1());
        valueAnimator.start();
    }

    public final void d(float f, boolean z2) {
        float f2 = f % 360.0f;
        this.t0 = f2;
        this.w0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB = b(this.y0);
        float fCos = (((float) Math.cos(this.w0)) * fB) + width;
        float fSin = (fB * ((float) Math.sin(this.w0))) + height;
        float f3 = this.o0;
        this.r0.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).b(f2, z2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iB = b(this.y0);
        float f = width;
        float f2 = iB;
        float fCos = (((float) Math.cos(this.w0)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.w0))) + f3;
        Paint paint = this.q0;
        paint.setStrokeWidth(0.0f);
        int i2 = this.o0;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.w0);
        double d = iB - i2;
        paint.setStrokeWidth(this.s0);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.w0) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.p0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.g0.isRunning()) {
            return;
        }
        c(this.t0, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.i0);
                int i3 = (int) (y - this.j0);
                this.k0 = (i3 * i3) + (i2 * i2) > this.l0;
                z3 = this.u0;
                z2 = actionMasked == 1;
                if (this.m0) {
                    this.y0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) > ((float) b(2)) + ViewUtils.b(getContext(), 12) ? 1 : 2;
                }
                z4 = false;
            } else {
                z2 = false;
                z4 = false;
                z3 = false;
            }
        } else {
            this.i0 = x;
            this.j0 = y;
            this.k0 = true;
            this.u0 = false;
            z2 = false;
            z3 = false;
            z4 = true;
        }
        boolean z6 = this.u0;
        float fA = a(x, y);
        boolean z7 = this.t0 != fA;
        if (z4 && z7) {
            z5 = true;
        } else if (z7 || z3) {
            c(fA, z2 && this.h0);
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z8 = z5 | z6;
        this.u0 = z8;
        if (z8 && z2 && (onActionUpListener = this.v0) != null) {
            float fA2 = a(x, y);
            boolean z9 = this.k0;
            TimePickerClockPresenter timePickerClockPresenter = (TimePickerClockPresenter) onActionUpListener;
            timePickerClockPresenter.f0 = true;
            TimeModel timeModel = timePickerClockPresenter.f19544Y;
            int i4 = timeModel.f0;
            int i5 = timeModel.e0;
            int i6 = timeModel.g0;
            TimePickerView timePickerView = timePickerClockPresenter.X;
            if (i6 == 10) {
                timePickerView.g0.c(timePickerClockPresenter.e0, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(timePickerView.getContext(), AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    timePickerClockPresenter.d(12, true);
                }
            } else {
                int iRound = Math.round(fA2);
                if (!z9) {
                    int i7 = (((iRound + 15) / 30) * 5) % 60;
                    timeModel.f0 = i7;
                    timePickerClockPresenter.Z = i7 * 6;
                }
                timePickerView.g0.c(timePickerClockPresenter.Z, z9);
            }
            timePickerClockPresenter.f0 = false;
            timePickerClockPresenter.e();
            if (timeModel.f0 != i4 || timeModel.e0 != i5) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }
}
