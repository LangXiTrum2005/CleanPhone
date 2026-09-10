package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.media.a;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final /* synthetic */ int R0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public ArrayList D0;
    public ArrayList E0;
    public ArrayList F0;
    public int G0;
    public long H0;
    public float I0;
    public int J0;
    public float K0;
    public float L0;
    public boolean M0;
    public StateCache N0;
    public TransitionState O0;
    public boolean P0;
    public View Q0;
    public MotionScene e0;
    public Interpolator f0;
    public float g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public long n0;
    public float o0;
    public float p0;
    public float q0;
    public long r0;
    public float s0;
    public boolean t0;
    public boolean u0;
    public TransitionListener v0;
    public int w0;
    public boolean x0;
    public DesignTool y0;
    public int z0;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3839a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f3839a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3839a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3839a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3839a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class DecelerateInterpolator extends MotionInterpolator {
        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public final float a() {
            throw null;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            throw null;
        }
    }

    public class DevModeDraw {
    }

    public class Model {
    }

    public interface MotionTracker {
    }

    public static class MyTracker implements MotionTracker {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MyTracker f3840b = new MyTracker();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f3841a;
    }

    public class StateCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f3842a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3843b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3844c = -1;
        public int d = -1;

        public StateCache() {
        }

        public final void a() {
            int i2 = this.f3844c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i2 != -1 || this.d != -1) {
                if (i2 == -1) {
                    motionLayout.t(this.d);
                } else {
                    int i3 = this.d;
                    if (i3 == -1) {
                        motionLayout.setState(i2, -1, -1);
                    } else {
                        motionLayout.s(i2, i3);
                    }
                }
                motionLayout.setState(TransitionState.X);
            }
            if (Float.isNaN(this.f3843b)) {
                if (Float.isNaN(this.f3842a)) {
                    return;
                }
                motionLayout.setProgress(this.f3842a);
            } else {
                motionLayout.r(this.f3842a, this.f3843b);
                this.f3842a = Float.NaN;
                this.f3843b = Float.NaN;
                this.f3844c = -1;
                this.d = -1;
            }
        }
    }

    public interface TransitionListener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final TransitionState f3846Y;
        public static final TransitionState Z;
        public static final /* synthetic */ TransitionState[] e0;

        /* JADX INFO: Fake field, exist only in values array */
        TransitionState EF0;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            X = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            f3846Y = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            Z = transitionState4;
            e0 = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) e0.clone();
        }
    }

    public final void c(float f) {
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            return;
        }
        float f2 = this.q0;
        float f3 = this.p0;
        if (f2 != f3 && this.t0) {
            this.q0 = f3;
        }
        float f4 = this.q0;
        if (f4 == f) {
            return;
        }
        this.x0 = false;
        this.s0 = f;
        MotionScene.Transition transition = motionScene.f3849c;
        this.o0 = (transition != null ? transition.f3861h : motionScene.j) / 1000.0f;
        setProgress(f);
        this.f0 = this.e0.d();
        this.t0 = false;
        this.n0 = getNanoTime();
        this.u0 = true;
        this.p0 = f4;
        this.q0 = f4;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        h(false);
        super.dispatchDraw(canvas);
        if (this.e0 == null) {
            return;
        }
        if ((this.w0 & 1) == 1 && !isInEditMode()) {
            this.G0++;
            long nanoTime = getNanoTime();
            long j = this.H0;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.I0 = ((int) ((this.G0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.G0 = 0;
                    this.H0 = nanoTime;
                }
            } else {
                this.H0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.I0);
            sb.append(" fps ");
            int i2 = this.h0;
            StringBuilder sbW = a.w(a.r(sb, i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2), " -> "));
            int i3 = this.j0;
            sbW.append(i3 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i3));
            sbW.append(" (progress: ");
            sbW.append(progress);
            sbW.append(" ) state=");
            int i4 = this.i0;
            if (i4 == -1) {
                resourceEntryName = AdError.UNDEFINED_DOMAIN;
            } else {
                resourceEntryName = i4 != -1 ? getContext().getResources().getResourceEntryName(i4) : "UNDEFINED";
            }
            sbW.append(resourceEntryName);
            String string = sbW.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.w0 > 1) {
            MotionScene.Transition transition = this.e0.f3849c;
        }
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            return null;
        }
        SparseArray sparseArray = motionScene.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.i0;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            return null;
        }
        return motionScene.d;
    }

    public DesignTool getDesignTool() {
        if (this.y0 == null) {
            this.y0 = new DesignTool();
        }
        return this.y0;
    }

    public int getEndState() {
        return this.j0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.q0;
    }

    public int getStartState() {
        return this.h0;
    }

    public float getTargetPosition() {
        return this.s0;
    }

    public Bundle getTransitionState() {
        if (this.N0 == null) {
            this.N0 = new StateCache();
        }
        StateCache stateCache = this.N0;
        MotionLayout motionLayout = MotionLayout.this;
        stateCache.d = motionLayout.j0;
        stateCache.f3844c = motionLayout.h0;
        stateCache.f3843b = motionLayout.getVelocity();
        stateCache.f3842a = motionLayout.getProgress();
        StateCache stateCache2 = this.N0;
        stateCache2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", stateCache2.f3842a);
        bundle.putFloat("motion.velocity", stateCache2.f3843b);
        bundle.putInt("motion.StartState", stateCache2.f3844c);
        bundle.putInt("motion.EndState", stateCache2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.e0;
        if (motionScene != null) {
            MotionScene.Transition transition = motionScene.f3849c;
            this.o0 = (transition != null ? transition.f3861h : motionScene.j) / 1000.0f;
        }
        return (long) (this.o0 * 1000.0f);
    }

    public float getVelocity() {
        return this.g0;
    }

    public final void h(boolean z2) {
        float f;
        boolean z3;
        int i2;
        float interpolation;
        boolean z4;
        if (this.r0 == -1) {
            this.r0 = getNanoTime();
        }
        float f2 = this.q0;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.i0 = -1;
        }
        boolean z5 = false;
        if (this.C0 || (this.u0 && (z2 || this.s0 != f2))) {
            float fSignum = Math.signum(this.s0 - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f0;
            if (interpolator instanceof MotionInterpolator) {
                f = 0.0f;
            } else {
                f = (((nanoTime - this.r0) * fSignum) * 1.0E-9f) / this.o0;
                this.g0 = f;
            }
            float f3 = this.q0 + f;
            if (this.t0) {
                f3 = this.s0;
            }
            if ((fSignum <= 0.0f || f3 < this.s0) && (fSignum > 0.0f || f3 > this.s0)) {
                z3 = false;
            } else {
                f3 = this.s0;
                this.u0 = false;
                z3 = true;
            }
            this.q0 = f3;
            this.p0 = f3;
            this.r0 = nanoTime;
            if (interpolator != null && !z3) {
                if (this.x0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.n0) * 1.0E-9f);
                    this.q0 = interpolation;
                    this.r0 = nanoTime;
                    Interpolator interpolator2 = this.f0;
                    if (interpolator2 instanceof MotionInterpolator) {
                        float fA = ((MotionInterpolator) interpolator2).a();
                        this.g0 = fA;
                        if (Math.abs(fA) * this.o0 <= 1.0E-5f) {
                            this.u0 = false;
                        }
                        if (fA > 0.0f && interpolation >= 1.0f) {
                            this.q0 = 1.0f;
                            this.u0 = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.q0 = 0.0f;
                            this.u0 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f0;
                    if (interpolator3 instanceof MotionInterpolator) {
                        this.g0 = ((MotionInterpolator) interpolator3).a();
                    } else {
                        this.g0 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.g0) > 1.0E-5f) {
                setState(TransitionState.f3846Y);
            }
            if ((fSignum > 0.0f && f3 >= this.s0) || (fSignum <= 0.0f && f3 <= this.s0)) {
                f3 = this.s0;
                this.u0 = false;
            }
            TransitionState transitionState = TransitionState.Z;
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.u0 = false;
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.C0 = false;
            getNanoTime();
            this.L0 = f3;
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z6 = (fSignum > 0.0f && f3 >= this.s0) || (fSignum <= 0.0f && f3 <= this.s0);
            if (!this.C0 && !this.u0 && z6) {
                setState(transitionState);
            }
            this.C0 = (!z6) | this.C0;
            if (f3 <= 0.0f && (i2 = this.h0) != -1 && this.i0 != i2) {
                this.i0 = i2;
                this.e0.b(i2).a(this);
                setState(transitionState);
                z5 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.i0;
                int i4 = this.j0;
                if (i3 != i4) {
                    this.i0 = i4;
                    this.e0.b(i4).a(this);
                    setState(transitionState);
                    z5 = true;
                }
            }
            if (this.C0 || this.u0) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                setState(transitionState);
            }
            if ((!this.C0 && this.u0 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                q();
            }
        }
        float f4 = this.q0;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.i0;
                int i6 = this.h0;
                z4 = i5 == i6 ? z5 : true;
                this.i0 = i6;
            }
            this.P0 |= z5;
            if (z5 && !this.M0) {
                requestLayout();
            }
            this.p0 = this.q0;
        }
        int i7 = this.i0;
        int i8 = this.j0;
        z4 = i7 == i8 ? z5 : true;
        this.i0 = i8;
        z5 = z4;
        this.P0 |= z5;
        if (z5) {
            requestLayout();
        }
        this.p0 = this.q0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(int i2, View view) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.e0;
        if (motionScene == null || (transition = motionScene.f3849c) == null || (touchResponse = transition.f3863l) == null) {
            return;
        }
        touchResponse.f3873i = false;
        MotionLayout motionLayout = touchResponse.m;
        motionLayout.getProgress();
        motionLayout.getViewById(touchResponse.d);
        throw null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, View view2, int i2, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void k(View view, int i2, int i3, int[] iArr, int i4) {
        MotionScene.Transition transition;
        boolean z2;
        TouchResponse touchResponse;
        TouchResponse touchResponse2;
        TouchResponse touchResponse3;
        int i5;
        MotionScene motionScene = this.e0;
        if (motionScene == null || (transition = motionScene.f3849c) == null || (z2 = transition.o)) {
            return;
        }
        if (z2 || (touchResponse3 = transition.f3863l) == null || (i5 = touchResponse3.f3871e) == -1 || view.getId() == i5) {
            MotionScene motionScene2 = this.e0;
            if (motionScene2 != null) {
                MotionScene.Transition transition2 = motionScene2.f3849c;
                if ((transition2 == null || (touchResponse2 = transition2.f3863l) == null) ? false : touchResponse2.f3876p) {
                    float f = this.p0;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (transition.f3863l != null) {
                TouchResponse touchResponse4 = this.e0.f3849c.f3863l;
                if ((touchResponse4.r & 1) != 0) {
                    MotionLayout motionLayout = touchResponse4.m;
                    motionLayout.getProgress();
                    motionLayout.getViewById(touchResponse4.d);
                    throw null;
                }
            }
            float f2 = this.p0;
            getNanoTime();
            MotionScene.Transition transition3 = this.e0.f3849c;
            if (transition3 != null && (touchResponse = transition3.f3863l) != null) {
                MotionLayout motionLayout2 = touchResponse.m;
                float progress = motionLayout2.getProgress();
                if (!touchResponse.f3873i) {
                    touchResponse.f3873i = true;
                    motionLayout2.setProgress(progress);
                }
                motionLayout2.getViewById(touchResponse.d);
                throw null;
            }
            if (f2 != this.p0) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            h(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.B0 = true;
        }
    }

    public final void l() {
        if ((this.v0 == null && this.F0.isEmpty()) || this.K0 == this.p0) {
            return;
        }
        if (this.J0 != -1) {
            Iterator it = this.F0.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).getClass();
            }
        }
        this.J0 = -1;
        this.K0 = this.p0;
        Iterator it2 = this.F0.iterator();
        while (it2.hasNext()) {
            ((TransitionListener) it2.next()).getClass();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i2) {
        if (i2 == 0) {
            this.e0 = null;
            return;
        }
        try {
            this.e0 = new MotionScene(getContext(), this, i2);
            if (super.isAttachedToWindow()) {
                this.e0.i(this);
                this.e0.b(this.h0);
                this.e0.b(this.j0);
                throw null;
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.B0 || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.B0 = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void n(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i2, int i3) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.e0;
        return (motionScene == null || (transition = motionScene.f3849c) == null || (touchResponse = transition.f3863l) == null || (touchResponse.r & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        MotionScene motionScene = this.e0;
        if (motionScene != null && (i2 = this.i0) != -1) {
            ConstraintSet constraintSetB = motionScene.b(i2);
            this.e0.i(this);
            if (constraintSetB != null) {
                constraintSetB.b(this);
            }
            this.h0 = this.i0;
        }
        q();
        StateCache stateCache = this.N0;
        if (stateCache != null) {
            stateCache.a();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int i2;
        RectF rectFA;
        MotionScene motionScene = this.e0;
        if (motionScene == null || !this.m0 || (transition = motionScene.f3849c) == null || transition.o || (touchResponse = transition.f3863l) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFA = touchResponse.a(this, new RectF())) != null && !rectFA.contains(motionEvent.getX(), motionEvent.getY())) || (i2 = touchResponse.f3871e) == -1) {
            return false;
        }
        View view = this.Q0;
        if (view == null || view.getId() != i2) {
            this.Q0 = findViewById(i2);
        }
        View view2 = this.Q0;
        if (view2 == null) {
            return false;
        }
        view2.getLeft();
        this.Q0.getTop();
        this.Q0.getRight();
        this.Q0.getBottom();
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) throws Throwable {
        MotionLayout motionLayout;
        this.M0 = true;
        try {
            if (this.e0 == null) {
                super.onLayout(z2, i2, i3, i4, i5);
                this.M0 = false;
                return;
            }
            motionLayout = this;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            try {
                if (motionLayout.z0 != i6 || motionLayout.A0 != i7) {
                    throw null;
                }
                motionLayout.z0 = i6;
                motionLayout.A0 = i7;
                motionLayout.M0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.M0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.e0 == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.k0 == i2 && this.l0 == i3) ? false : true;
        if (this.P0) {
            this.P0 = false;
            q();
            if (this.v0 != null || !this.F0.isEmpty()) {
                throw null;
            }
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.k0 = i2;
        this.l0 = i3;
        MotionScene.Transition transition = this.e0.f3849c;
        int i4 = transition == null ? -1 : transition.d;
        int i5 = transition == null ? -1 : transition.f3859c;
        if (!z3) {
            throw null;
        }
        if (this.h0 != -1) {
            super.onMeasure(i2, i3);
            this.e0.b(i4);
            this.e0.b(i5);
            throw null;
        }
        getPaddingTop();
        getPaddingBottom();
        getPaddingLeft();
        getPaddingRight();
        this.mLayoutWidget.getClass();
        this.mLayoutWidget.getClass();
        float f = 0;
        int i6 = (int) ((this.L0 * f) + f);
        requestLayout();
        int i7 = (int) ((this.L0 * f) + f);
        requestLayout();
        setMeasuredDimension(i6, i7);
        float fSignum = Math.signum(this.s0 - this.q0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f0;
        float interpolation = this.q0 + (!(interpolator instanceof StopLogic) ? (((nanoTime - this.r0) * fSignum) * 1.0E-9f) / this.o0 : 0.0f);
        if (this.t0) {
            interpolation = this.s0;
        }
        if ((fSignum <= 0.0f || interpolation < this.s0) && (fSignum > 0.0f || interpolation > this.s0)) {
            z2 = false;
        } else {
            interpolation = this.s0;
        }
        if (interpolator != null && !z2) {
            interpolation = this.x0 ? interpolator.getInterpolation((nanoTime - this.n0) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.s0) || (fSignum <= 0.0f && interpolation <= this.s0)) {
            interpolation = this.s0;
        }
        this.L0 = interpolation;
        int childCount = getChildCount();
        getNanoTime();
        if (childCount <= 0) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.e0;
        if (motionScene != null) {
            boolean zIsRtl = isRtl();
            motionScene.o = zIsRtl;
            MotionScene.Transition transition = motionScene.f3849c;
            if (transition == null || (touchResponse = transition.f3863l) == null) {
                return;
            }
            touchResponse.b(zIsRtl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:119:0x0211  */
    /* JADX WARN: Code duplicated, block: B:121:0x021c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0221  */
    /* JADX WARN: Code duplicated, block: B:128:0x0244  */
    /* JADX WARN: Code duplicated, block: B:130:0x024c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0257  */
    /* JADX WARN: Code duplicated, block: B:135:0x0287  */
    /* JADX WARN: Code duplicated, block: B:136:0x0293  */
    /* JADX WARN: Code duplicated, block: B:139:0x029d  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0316  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:157:0x0339  */
    /* JADX WARN: Code duplicated, block: B:160:0x0341  */
    /* JADX WARN: Code duplicated, block: B:162:0x0349  */
    /* JADX WARN: Code duplicated, block: B:214:0x0408  */
    /* JADX WARN: Code duplicated, block: B:216:0x040e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0412  */
    /* JADX WARN: Code duplicated, block: B:219:0x0416  */
    /* JADX WARN: Code duplicated, block: B:221:0x041c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0453  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03d0, code lost:
    
        if ((((r5 * r3) - (((r2 * r3) * r3) / 2.0f)) + r1) > 1.0f) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03e2, code lost:
    
        if ((((((r2 * r3) * r3) / 2.0f) + (r5 * r3)) + r1) < 0.0f) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03e4, code lost:
    
        r9.e0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03eb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03ec, code lost:
    
        r9.e0.e();
        r9.e0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03f6, code lost:
    
        throw null;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            this.F0.add(motionHelper);
            motionHelper.getClass();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.E0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        if (!(this.v0 == null && this.F0.isEmpty()) && this.J0 == -1) {
            this.J0 = this.i0;
            throw null;
        }
        if (this.v0 != null || !this.F0.isEmpty()) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q() {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        View viewFindViewById;
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            return;
        }
        if (motionScene.a(this, this.i0)) {
            requestLayout();
            return;
        }
        int i2 = this.i0;
        if (i2 != -1) {
            MotionScene motionScene2 = this.e0;
            ArrayList<MotionScene.Transition> arrayList = motionScene2.d;
            for (MotionScene.Transition transition2 : arrayList) {
                if (transition2.m.size() > 0) {
                    Iterator it = transition2.m.iterator();
                    while (it.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it.next()).b(this);
                    }
                }
            }
            ArrayList<MotionScene.Transition> arrayList2 = motionScene2.f;
            for (MotionScene.Transition transition3 : arrayList2) {
                if (transition3.m.size() > 0) {
                    Iterator it2 = transition3.m.iterator();
                    while (it2.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it2.next()).b(this);
                    }
                }
            }
            for (MotionScene.Transition transition4 : arrayList) {
                if (transition4.m.size() > 0) {
                    Iterator it3 = transition4.m.iterator();
                    while (it3.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it3.next()).a(this, i2, transition4);
                    }
                }
            }
            for (MotionScene.Transition transition5 : arrayList2) {
                if (transition5.m.size() > 0) {
                    Iterator it4 = transition5.m.iterator();
                    while (it4.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it4.next()).a(this, i2, transition5);
                    }
                }
            }
        }
        if (!this.e0.k() || (transition = this.e0.f3849c) == null || (touchResponse = transition.f3863l) == null) {
            return;
        }
        int i3 = touchResponse.d;
        if (i3 != -1) {
            MotionLayout motionLayout = touchResponse.m;
            viewFindViewById = motionLayout.findViewById(i3);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.a(motionLayout.getContext(), touchResponse.d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new TouchResponse.AnonymousClass1());
            nestedScrollView.setOnScrollChangeListener(new TouchResponse.AnonymousClass2());
        }
    }

    public final void r(float f, float f2) {
        if (!super.isAttachedToWindow()) {
            StateCache stateCache = this.N0;
            stateCache.f3842a = f;
            stateCache.f3843b = f2;
        } else {
            setProgress(f);
            setState(TransitionState.f3846Y);
            this.g0 = f2;
            c(1.0f);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (this.i0 != -1 || (motionScene = this.e0) == null || (transition = motionScene.f3849c) == null || transition.f3865p != 0) {
            super.requestLayout();
        }
    }

    public final void s(int i2, int i3) {
        if (!super.isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new StateCache();
            }
            StateCache stateCache = this.N0;
            stateCache.f3844c = i2;
            stateCache.d = i3;
            return;
        }
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            return;
        }
        this.h0 = i2;
        this.j0 = i3;
        motionScene.j(i2, i3);
        this.e0.b(i2);
        this.e0.b(i3);
        throw null;
    }

    public void setDebugMode(int i2) {
        this.w0 = i2;
        invalidate();
    }

    public void setInteractionEnabled(boolean z2) {
        this.m0 = z2;
    }

    public void setInterpolatedProgress(float f) {
        if (this.e0 != null) {
            setState(TransitionState.f3846Y);
            Interpolator interpolatorD = this.e0.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.E0.get(i2)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.D0.get(i2)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new StateCache();
            }
            this.N0.f3842a = f;
            return;
        }
        TransitionState transitionState = TransitionState.Z;
        if (f <= 0.0f) {
            this.i0 = this.h0;
            if (this.q0 == 0.0f) {
                setState(transitionState);
            }
        } else if (f >= 1.0f) {
            this.i0 = this.j0;
            if (this.q0 == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.i0 = -1;
            setState(TransitionState.f3846Y);
        }
        if (this.e0 == null) {
            return;
        }
        this.t0 = true;
        this.s0 = f;
        this.p0 = f;
        this.r0 = -1L;
        this.n0 = -1L;
        this.f0 = null;
        this.u0 = true;
        invalidate();
    }

    public void setScene(MotionScene motionScene) {
        TouchResponse touchResponse;
        this.e0 = motionScene;
        boolean zIsRtl = isRtl();
        motionScene.o = zIsRtl;
        MotionScene.Transition transition = motionScene.f3849c;
        if (transition != null && (touchResponse = transition.f3863l) != null) {
            touchResponse.b(zIsRtl);
        }
        throw null;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.Z;
        if (transitionState == transitionState2 && this.i0 == -1) {
            return;
        }
        TransitionState transitionState3 = this.O0;
        this.O0 = transitionState;
        TransitionState transitionState4 = TransitionState.f3846Y;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            l();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                p();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            l();
        }
        if (transitionState == transitionState2) {
            p();
        }
    }

    public void setTransition(int i2) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.e0;
        if (motionScene != null) {
            Iterator it = motionScene.d.iterator();
            do {
                if (!it.hasNext()) {
                    transition = null;
                    break;
                }
                transition = (MotionScene.Transition) it.next();
            } while (transition.f3857a != i2);
            this.h0 = transition.d;
            this.j0 = transition.f3859c;
            if (!super.isAttachedToWindow()) {
                StateCache stateCache = this.N0;
                stateCache.f3844c = this.h0;
                stateCache.d = this.j0;
                return;
            }
            MotionScene motionScene2 = this.e0;
            motionScene2.f3849c = transition;
            TouchResponse touchResponse = transition.f3863l;
            if (touchResponse != null) {
                touchResponse.b(motionScene2.o);
            }
            this.e0.b(this.h0);
            this.e0.b(this.j0);
            throw null;
        }
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.e0;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.f3849c;
        if (transition != null) {
            transition.f3861h = i2;
        } else {
            motionScene.j = i2;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.v0 = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.N0 == null) {
            this.N0 = new StateCache();
        }
        StateCache stateCache = this.N0;
        stateCache.getClass();
        stateCache.f3842a = bundle.getFloat("motion.progress");
        stateCache.f3843b = bundle.getFloat("motion.velocity");
        stateCache.f3844c = bundle.getInt("motion.StartState");
        stateCache.d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.N0.a();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 float, still in use, count: 1, list:
          (r3v2 float) from 0x0017: INVOKE (r0v7 int) = 
          (r0v6 androidx.constraintlayout.widget.StateSet)
          (-1 int)
          (r3v2 float)
          (wrap int:0x0014: IGET (r5v0 'this' androidx.constraintlayout.motion.widget.MotionLayout A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:21) androidx.constraintlayout.motion.widget.MotionLayout.i0 int)
          (r6v0 int)
         VIRTUAL call: androidx.constraintlayout.widget.StateSet.a(float, float, int, int):int A[FORCE_ASSIGN_INLINE, MD:(float, float, int, int):int (m), WRAPPED] (LINE:24)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:148)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:117)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:115)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void t(int r6) {
        /*
            r5 = this;
            boolean r0 = super.isAttachedToWindow()
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.N0
            r0.d = r6
            return
        Lb:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.e0
            r1 = -1
            if (r0 == 0) goto L1e
            androidx.constraintlayout.widget.StateSet r0 = r0.f3848b
            if (r0 == 0) goto L1e
            int r2 = r5.i0
            float r3 = (float) r1
            int r0 = r0.a(r3, r3, r2, r6)
            if (r0 == r1) goto L1e
            r6 = r0
        L1e:
            int r0 = r5.i0
            if (r0 != r6) goto L23
            return
        L23:
            int r2 = r5.h0
            r3 = 0
            if (r2 != r6) goto L2c
            r5.c(r3)
            return
        L2c:
            int r2 = r5.j0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r6) goto L36
            r5.c(r4)
            return
        L36:
            r5.j0 = r6
            if (r0 == r1) goto L46
            r5.s(r0, r6)
            r5.c(r4)
            r5.q0 = r3
            r5.c(r4)
            return
        L46:
            r6 = 0
            r5.x0 = r6
            r5.s0 = r4
            r5.p0 = r3
            r5.q0 = r3
            long r2 = r5.getNanoTime()
            r5.r0 = r2
            long r2 = r5.getNanoTime()
            r5.n0 = r2
            r5.t0 = r6
            r6 = 0
            r5.f0 = r6
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.e0
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r0.f3849c
            if (r2 == 0) goto L69
            int r2 = r2.f3861h
            goto L6b
        L69:
            int r2 = r0.j
        L6b:
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r5.o0 = r2
            r5.h0 = r1
            int r2 = r5.j0
            r0.j(r1, r2)
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.e0
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.f3849c
            r5.getChildCount()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.t(int):void");
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Debug.a(context, this.h0) + "->" + Debug.a(context, this.j0) + " (pos:" + this.q0 + " Dpos/Dt:" + this.g0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i2, int i3, int i4) {
        setState(TransitionState.X);
        this.i0 = i2;
        this.h0 = -1;
        this.j0 = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.b(i2, i3, i4);
            return;
        }
        MotionScene motionScene = this.e0;
        if (motionScene != null) {
            motionScene.b(i2).b(this);
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.e0;
        motionScene.f3849c = transition;
        if (transition != null && (touchResponse = transition.f3863l) != null) {
            touchResponse.b(motionScene.o);
        }
        setState(TransitionState.X);
        int i2 = this.i0;
        MotionScene.Transition transition2 = this.e0.f3849c;
        if (i2 == (transition2 == null ? -1 : transition2.f3859c)) {
            this.q0 = 1.0f;
            this.p0 = 1.0f;
            this.s0 = 1.0f;
        } else {
            this.q0 = 0.0f;
            this.p0 = 0.0f;
            this.s0 = 0.0f;
        }
        this.r0 = (transition.q & 1) != 0 ? -1L : getNanoTime();
        MotionScene motionScene2 = this.e0;
        MotionScene.Transition transition3 = motionScene2.f3849c;
        int i3 = transition3 == null ? -1 : transition3.d;
        int i4 = transition3 != null ? transition3.f3859c : -1;
        if (i3 == this.h0 && i4 == this.j0) {
            return;
        }
        this.h0 = i3;
        this.j0 = i4;
        motionScene2.j(i3, i4);
        this.e0.b(this.h0);
        this.e0.b(this.j0);
        throw null;
    }
}
