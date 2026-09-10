package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final /* synthetic */ int f0 = 0;
    public AnimatorDurationScaleProvider e0;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int i2 = BaseProgressIndicator.f0;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int i2 = BaseProgressIndicator.f0;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$3, reason: invalid class name */
    public class AnonymousClass3 extends Animatable2Compat.AnimationCallback {
        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void a(Drawable drawable) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$4, reason: invalid class name */
    public class AnonymousClass4 extends Animatable2Compat.AnimationCallback {
        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void a(Drawable drawable) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            getIndeterminateDrawable().getClass();
            return null;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        getProgressDrawable().getClass();
        return null;
    }

    public void a(int i2) {
        if (!isIndeterminate()) {
            super.setProgress(i2);
            if (getProgressDrawable() == null) {
                return;
            }
            getProgressDrawable().getClass();
            throw null;
        }
        if (getProgressDrawable() != null) {
            if (getIndeterminateDrawable().isVisible()) {
                AnimatorDurationScaleProvider animatorDurationScaleProvider = this.e0;
                ContentResolver contentResolver = getContext().getContentResolver();
                animatorDurationScaleProvider.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable();
                    throw null;
                }
            }
            getIndeterminateDrawable();
            throw null;
        }
    }

    public final boolean b() {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        throw null;
    }

    public int[] getIndicatorColor() {
        throw null;
    }

    public int getIndicatorTrackGapSize() {
        throw null;
    }

    public int getShowAnimationBehavior() {
        throw null;
    }

    public int getTrackColor() {
        throw null;
    }

    public int getTrackCornerRadius() {
        throw null;
    }

    public int getTrackThickness() {
        throw null;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable();
            throw null;
        }
        if (getProgressDrawable() != null) {
            DeterminateDrawable<S> progressDrawable = getProgressDrawable();
            if (progressDrawable.e0 == null) {
                progressDrawable.e0 = new ArrayList();
            }
            if (!progressDrawable.e0.contains(null)) {
                progressDrawable.e0.add(null);
            }
        }
        if (getIndeterminateDrawable() != null) {
            IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.e0 == null) {
                indeterminateDrawable.e0 = new ArrayList();
            }
            if (!indeterminateDrawable.e0.contains(null)) {
                indeterminateDrawable.e0.add(null);
            }
        }
        if (b()) {
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        removeCallbacks(null);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).b();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().e(null);
            getIndeterminateDrawable();
            throw null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(null);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate != null) {
                if (currentDrawingDelegate.b() < 0) {
                    View.getDefaultSize(getSuggestedMinimumWidth(), i2);
                } else {
                    currentDrawingDelegate.b();
                    getPaddingLeft();
                    getPaddingRight();
                }
                currentDrawingDelegate.a();
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.e0 = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().X = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().X = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i2) {
        throw null;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        try {
            if (z2 == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.b();
            }
            super.setIndeterminate(z2);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                b();
                drawableWithAnimatedVisibilityChange2.c();
                throw null;
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && b()) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof IndeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((DrawableWithAnimatedVisibilityChange) drawable).b();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.c(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            throw null;
        }
    }

    public void setIndicatorTrackGapSize(int i2) {
        throw null;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (isIndeterminate()) {
            return;
        }
        a(i2);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof DeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            throw null;
        }
    }

    public void setShowAnimationBehavior(int i2) {
        throw null;
    }

    public void setTrackColor(int i2) {
        throw null;
    }

    public void setTrackCornerRadius(int i2) {
        throw null;
    }

    public void setTrackThickness(int i2) {
        throw null;
    }

    public void setVisibilityAfterHide(int i2) {
        if (i2 != 0 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    @Override // android.widget.ProgressBar
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
