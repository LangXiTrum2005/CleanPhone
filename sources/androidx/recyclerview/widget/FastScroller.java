package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.p004ironsource.cs;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8030A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Runnable f8031B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f8034c;
    public final Drawable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8035e;
    public final int f;
    public final StateListDrawable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f8036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8037i;
    public final int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8038l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8039n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8040p;
    public final RecyclerView s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f8043z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8041u = false;
    public int v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8042w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public class AnimatorListener extends AnimatorListenerAdapter {
        public boolean X = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.X = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.X) {
                this.X = false;
                return;
            }
            FastScroller fastScroller = FastScroller.this;
            if (((Float) fastScroller.f8043z.getAnimatedValue()).floatValue() == 0.0f) {
                fastScroller.f8030A = 0;
                fastScroller.h(0);
            } else {
                fastScroller.f8030A = 2;
                fastScroller.s.invalidate();
            }
        }
    }

    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller fastScroller = FastScroller.this;
            fastScroller.f8034c.setAlpha(iFloatValue);
            fastScroller.d.setAlpha(iFloatValue);
            fastScroller.s.invalidate();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8043z = valueAnimatorOfFloat;
        this.f8030A = 0;
        Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public final void run() {
                FastScroller fastScroller = FastScroller.this;
                int i5 = fastScroller.f8030A;
                ValueAnimator valueAnimator = fastScroller.f8043z;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                fastScroller.f8030A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
            }
        };
        this.f8031B = runnable;
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView2, int i5, int i6) {
                int iComputeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                FastScroller fastScroller = FastScroller.this;
                int iComputeVerticalScrollRange = fastScroller.s.computeVerticalScrollRange();
                int i7 = fastScroller.r;
                int i8 = iComputeVerticalScrollRange - i7;
                int i9 = fastScroller.f8032a;
                fastScroller.t = i8 > 0 && i7 >= i9;
                int iComputeHorizontalScrollRange = fastScroller.s.computeHorizontalScrollRange();
                int i10 = fastScroller.q;
                boolean z2 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i9;
                fastScroller.f8041u = z2;
                boolean z3 = fastScroller.t;
                if (!z3 && !z2) {
                    if (fastScroller.v != 0) {
                        fastScroller.h(0);
                        return;
                    }
                    return;
                }
                if (z3) {
                    float f = i7;
                    fastScroller.f8038l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                    fastScroller.k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
                }
                if (fastScroller.f8041u) {
                    float f2 = iComputeHorizontalScrollOffset;
                    float f3 = i10;
                    fastScroller.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                    fastScroller.f8039n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
                }
                int i11 = fastScroller.v;
                if (i11 == 0 || i11 == 1) {
                    fastScroller.h(1);
                }
            }
        };
        this.f8034c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.f8036h = drawable2;
        this.f8035e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f8037i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f8032a = i3;
        this.f8033b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListener());
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.s.removeOnItemTouchListener(this);
            this.s.removeOnScrollListener(onScrollListener);
            this.s.removeCallbacks(runnable);
        }
        this.s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(onScrollListener);
    }

    public static int g(float f, float f2, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f2 - f) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void c(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean d(MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zF && !zE) {
            return false;
        }
        if (zE) {
            this.f8042w = 1;
            this.f8040p = (int) motionEvent.getX();
        } else if (zF) {
            this.f8042w = 2;
            this.m = (int) motionEvent.getY();
        }
        h(2);
        return true;
    }

    public final boolean e(float f, float f2) {
        if (f2 < this.r - this.f8037i) {
            return false;
        }
        int i2 = this.o;
        int i3 = this.f8039n;
        return f >= ((float) (i2 - (i3 / 2))) && f <= ((float) ((i3 / 2) + i2));
    }

    public final boolean f(float f, float f2) {
        RecyclerView recyclerView = this.s;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f8035e;
        if (!z2 ? f >= this.q - i2 : f <= i2) {
            int i3 = this.f8038l;
            int i4 = this.k / 2;
            if (f2 >= i3 - i4 && f2 <= i4 + i3) {
                return true;
            }
        }
        return false;
    }

    public final void h(int i2) {
        Runnable runnable = this.f8031B;
        StateListDrawable stateListDrawable = this.f8034c;
        if (i2 == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(runnable);
        }
        if (i2 == 0) {
            this.s.invalidate();
        } else {
            i();
        }
        if (this.v == 2 && i2 != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(runnable);
            this.s.postDelayed(runnable, cs.c.INSTANCE_LOAD_FAILED);
        } else if (i2 == 1) {
            this.s.removeCallbacks(runnable);
            this.s.postDelayed(runnable, 1500);
        }
        this.v = i2;
    }

    public final void i() {
        int i2 = this.f8030A;
        ValueAnimator valueAnimator = this.f8043z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f8030A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i2 = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i2 != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            h(0);
            return;
        }
        if (this.f8030A != 0) {
            if (this.t) {
                int i3 = this.q;
                int i4 = this.f8035e;
                int i5 = i3 - i4;
                int i6 = this.f8038l;
                int i7 = this.k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f8034c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.r;
                int i10 = this.f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i4, -i8);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i8);
                }
            }
            if (this.f8041u) {
                int i11 = this.r;
                int i12 = this.f8037i;
                int i13 = i11 - i12;
                int i14 = this.o;
                int i15 = this.f8039n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.q;
                int i18 = this.j;
                Drawable drawable2 = this.f8036h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.f8042w = 1;
                    this.f8040p = (int) motionEvent.getX();
                } else if (zF) {
                    this.f8042w = 2;
                    this.m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.f8040p = 0.0f;
            h(1);
            this.f8042w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            i();
            int i2 = this.f8042w;
            int i3 = this.f8033b;
            if (i2 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i3;
                int i4 = this.q - i3;
                iArr[1] = i4;
                float fMax = Math.max(i3, Math.min(i4, x));
                if (Math.abs(this.o - fMax) >= 2.0f) {
                    int iG = g(this.f8040p, fMax, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                    if (iG != 0) {
                        this.s.scrollBy(iG, 0);
                    }
                    this.f8040p = fMax;
                }
            }
            if (this.f8042w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i3;
                int i5 = this.r - i3;
                iArr2[1] = i5;
                float fMax2 = Math.max(i3, Math.min(i5, y));
                if (Math.abs(this.f8038l - fMax2) < 2.0f) {
                    return;
                }
                int iG2 = g(this.m, fMax2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                if (iG2 != 0) {
                    this.s.scrollBy(0, iG2);
                }
                this.m = fMax2;
            }
        }
    }
}
