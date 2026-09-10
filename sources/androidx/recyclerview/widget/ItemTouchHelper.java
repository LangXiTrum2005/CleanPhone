package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void c(boolean z2) {
            if (z2) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean d(MotionEvent motionEvent) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onTouchEvent(MotionEvent motionEvent) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$3, reason: invalid class name */
    class AnonymousClass3 extends RecoverAnimation {
        @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public final int a(int i2, int i3) {
            throw null;
        }
    }

    public static abstract class Callback {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$1, reason: invalid class name */
        public class AnonymousClass1 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$2, reason: invalid class name */
        public class AnonymousClass2 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }
    }

    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }
    }

    public static class RecoverAnimation implements Animator.AnimatorListener {
        public boolean X;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1, reason: invalid class name */
        class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedFraction();
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.X) {
                throw null;
            }
            this.X = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class SimpleCallback extends Callback {
    }

    public interface ViewDropHandler {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void a(View view) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        throw null;
    }
}
