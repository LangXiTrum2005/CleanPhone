package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19488a = 0;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$1, reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i2 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$10, reason: invalid class name */
    class AnonymousClass10 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11, reason: invalid class name */
    class AnonymousClass11 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$12, reason: invalid class name */
    class AnonymousClass12 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$13, reason: invalid class name */
    class AnonymousClass13 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i2 = BaseTransientBottomBar.f19488a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$14, reason: invalid class name */
    class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i2 = BaseTransientBottomBar.f19488a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$15, reason: invalid class name */
    class AnonymousClass15 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i2 = BaseTransientBottomBar.f19488a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$16, reason: invalid class name */
    class AnonymousClass16 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i2 = BaseTransientBottomBar.f19488a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$3, reason: invalid class name */
    class AnonymousClass3 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.g();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$4, reason: invalid class name */
    class AnonymousClass4 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfoCompat.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.g(view, i2, bundle);
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$5, reason: invalid class name */
    public class AnonymousClass5 implements SnackbarManager.Callback {
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$7, reason: invalid class name */
    class AnonymousClass7 implements SwipeDismissBehavior.OnDismissListener {
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$9, reason: invalid class name */
    class AnonymousClass9 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }
    }

    public static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final BehaviorDelegate i0;

        public Behavior() {
            BehaviorDelegate behaviorDelegate = new BehaviorDelegate();
            this.f0 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.g0 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.e0 = 0;
            this.i0 = behaviorDelegate;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.i0.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (SnackbarManager.a().f19490a) {
                    }
                }
            } else if (coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
                synchronized (SnackbarManager.a().f19490a) {
                }
            }
            return super.m(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean y(View view) {
            this.i0.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    public static class BehaviorDelegate {
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    public static class SnackbarBaseLayout extends FrameLayout {
        public static final View.OnTouchListener n0 = new AnonymousClass1();
        public BaseTransientBottomBar e0;
        public final ShapeAppearanceModel f0;
        public int g0;
        public final float h0;
        public final float i0;
        public final int j0;
        public final int k0;
        public ColorStateList l0;
        public PorterDuff.Mode m0;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1, reason: invalid class name */
        public class AnonymousClass1 implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(MaterialThemeOverlay.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.f19063E);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                ViewCompat.E(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.g0 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f0 = ShapeAppearanceModel.c(context2, attributeSet, 0, 0).a();
            }
            this.h0 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(ViewUtils.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.i0 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(n0);
            setFocusable(true);
            if (getBackground() == null) {
                int iE = MaterialColors.e(getBackgroundOverlayColorAlpha(), MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, this), MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorOnSurface, this));
                ShapeAppearanceModel shapeAppearanceModel = this.f0;
                if (shapeAppearanceModel != null) {
                    int i2 = BaseTransientBottomBar.f19488a;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.l(ColorStateList.valueOf(iE));
                    drawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    int i3 = BaseTransientBottomBar.f19488a;
                    float dimension = resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iE);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.l0;
                if (colorStateList != null) {
                    DrawableCompat.j(drawable, colorStateList);
                }
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                setBackground(drawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.e0 = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.i0;
        }

        public int getAnimationMode() {
            return this.g0;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.h0;
        }

        public int getMaxInlineActionWidth() {
            return this.k0;
        }

        public int getMaxWidth() {
            return this.j0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.e0;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            ViewCompat.x(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.e0 != null) {
                synchronized (SnackbarManager.a().f19490a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            super.onLayout(z2, i2, i3, i4, i5);
            if (this.e0 != null) {
                throw null;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int i4 = this.j0;
            if (i4 <= 0 || getMeasuredWidth() <= i4) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }

        public void setAnimationMode(int i2) {
            this.g0 = i2;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.l0 != null) {
                drawable = drawable.mutate();
                DrawableCompat.j(drawable, this.l0);
                DrawableCompat.k(drawable, this.m0);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.l0 = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                DrawableCompat.j(drawableMutate, colorStateList);
                DrawableCompat.k(drawableMutate, this.m0);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.m0 = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                DrawableCompat.k(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.e0 == null) {
                    return;
                }
                int i2 = BaseTransientBottomBar.f19488a;
                throw null;
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : n0);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = AnimationUtils.f19078a;
        new Handler(Looper.getMainLooper(), new AnonymousClass1());
    }
}
