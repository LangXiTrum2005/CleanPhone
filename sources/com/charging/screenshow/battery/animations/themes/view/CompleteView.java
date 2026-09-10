package com.charging.screenshow.battery.animations.themes.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;

/* JADX INFO: loaded from: classes3.dex */
public class CompleteView extends View {
    public static final /* synthetic */ int v0 = 0;
    public final Paint e0;
    public final Path f0;
    public final PathMeasure g0;
    public final a h0;
    public float i0;
    public final Animator.AnimatorListener j0;
    public final Handler k0;
    public State l0;
    public int m0;
    public final ValueAnimator n0;
    public int o0;
    public int p0;
    public final Path q0;
    public final ValueAnimator r0;
    public RectF s0;
    public final Paint t0;
    public int u0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final State f13322Y;
        public static final State Z;
        public static final /* synthetic */ State[] e0;

        static {
            State state = new State("NONE", 0);
            X = state;
            State state2 = new State("ROTATE", 1);
            f13322Y = state2;
            State state3 = new State("DROP", 2);
            Z = state3;
            e0 = new State[]{state, state2, state3, new State("RIGHTMARK", 3)};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) e0.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [com.charging.screenshow.battery.animations.themes.view.a] */
    public CompleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l0 = State.X;
        this.m0 = 1300;
        Paint paint = new Paint();
        this.t0 = paint;
        paint.setColor(IntExt.b(R.color.theme_green));
        this.t0.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.e0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.e0.setColor(IntExt.b(R.color.white));
        this.e0.setStrokeWidth(IntExt.a(8));
        this.e0.setStrokeCap(Paint.Cap.ROUND);
        this.e0.setAntiAlias(true);
        this.g0 = new PathMeasure();
        this.q0 = new Path();
        this.f0 = new Path();
        this.h0 = new ValueAnimator.AnimatorUpdateListener() { // from class: com.charging.screenshow.battery.animations.themes.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = CompleteView.v0;
                CompleteView completeView = this.X;
                completeView.getClass();
                completeView.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                completeView.invalidate();
            }
        };
        this.j0 = new Animator.AnimatorListener() { // from class: com.charging.screenshow.battery.animations.themes.view.CompleteView.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                CompleteView.this.k0.sendEmptyMessage(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        };
        this.k0 = new Handler() { // from class: com.charging.screenshow.battery.animations.themes.view.CompleteView.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                CompleteView completeView = CompleteView.this;
                if (completeView.l0.ordinal() != 2) {
                    return;
                }
                completeView.l0 = State.f13322Y;
                completeView.n0.start();
            }
        };
        this.r0 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) ((((double) this.m0) * 1.6d) / 3.0d));
        this.n0 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) ((((double) this.m0) * 1.4d) / 3.0d));
        this.r0.setInterpolator(new AccelerateDecelerateInterpolator());
        this.r0.addListener(this.j0);
        this.r0.addUpdateListener(this.h0);
        this.n0.addListener(this.j0);
        this.n0.addUpdateListener(this.h0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(this.o0 / 2, this.p0 / 2);
        canvas.drawColor(IntExt.b(R.color.transparent));
        int iOrdinal = this.l0.ordinal();
        if (iOrdinal == 0) {
            canvas.drawPath(this.f0, this.e0);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            this.g0.setPath(this.q0, false);
            float[] fArr = new float[2];
            PathMeasure pathMeasure = this.g0;
            pathMeasure.getPosTan(pathMeasure.getLength() * this.i0, fArr, null);
            canvas.drawPoint(fArr[0], fArr[1], this.e0);
            return;
        }
        this.t0.setAlpha((int) (this.i0 * 255.0f));
        canvas.drawCircle(0.0f, 0.0f, this.u0, this.t0);
        this.g0.setPath(this.f0, false);
        Path path = new Path();
        float length = this.g0.getLength();
        float f = this.i0;
        float f2 = length * f;
        double d = f;
        this.g0.getSegment(d > 0.5d ? f2 - (this.g0.getLength() / 8.8f) : (float) (((double) f2) - (((0.5d - Math.abs(d - 0.5d)) * ((double) this.g0.getLength())) / 8.8d)), f2, path, true);
        canvas.drawPath(path, this.e0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.o0 = i2;
        this.p0 = i3;
        if (i2 > i3) {
            this.o0 = i3;
        }
        int i6 = this.o0;
        int i7 = i6 - 20;
        this.u0 = i6 / 2;
        this.q0.moveTo(0.0f, -i7);
        this.q0.lineTo(0.0f, i7 - this.u0);
        this.q0.lineTo(0.0f, -this.u0);
        int i8 = this.u0;
        RectF rectF = new RectF(-i8, -i8, i8, i8);
        this.s0 = rectF;
        this.f0.addArc(rectF, -90.0f, -359.9f);
        this.f0.arcTo(this.s0, -90.0f, -60.0f);
        Path path = this.f0;
        int i9 = this.u0;
        path.lineTo((-i9) / 12, i9 / 3);
        Path path2 = this.f0;
        int i10 = this.u0;
        path2.lineTo(i10 / 2.5f, (-i10) / 4.5f);
    }

    public void setDuration(int i2) {
        this.m0 = i2;
    }
}
