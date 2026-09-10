package com.willy.ratingbar;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class BaseRatingBar extends LinearLayout implements SimpleRatingBar {
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public Drawable s0;
    public Drawable t0;
    public OnRatingChangeListener u0;
    public ArrayList v0;

    public interface OnRatingChangeListener {
        void a(float f);
    }

    public void a(float f) {
        for (PartialView partialView : this.v0) {
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f);
            double d = iIntValue;
            if (d > dCeil) {
                partialView.a();
            } else if (d == dCeil) {
                partialView.b(f);
            } else {
                partialView.e0.setImageLevel(10000);
                partialView.f0.setImageLevel(0);
            }
        }
    }

    public final void b() {
        this.v0 = new ArrayList();
        for (int i2 = 1; i2 <= this.e0; i2++) {
            int i3 = this.g0;
            int i4 = this.h0;
            int i5 = this.f0;
            Drawable drawable = this.t0;
            Drawable drawable2 = this.s0;
            PartialView partialView = new PartialView(getContext());
            partialView.g0 = i3;
            partialView.h0 = i4;
            partialView.setTag(Integer.valueOf(i2));
            partialView.setPadding(i5, i5, i5, i5);
            partialView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
            int i6 = partialView.g0;
            if (i6 == 0) {
                i6 = -2;
            }
            int i7 = partialView.h0;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, i7 != 0 ? i7 : -2);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(partialView.getContext());
            partialView.e0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            imageView.setScaleType(scaleType);
            partialView.addView(partialView.e0, layoutParams);
            ImageView imageView2 = new ImageView(partialView.getContext());
            partialView.f0 = imageView2;
            imageView2.setScaleType(scaleType);
            partialView.addView(partialView.f0, layoutParams);
            partialView.a();
            if (drawable.getConstantState() != null) {
                partialView.e0.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388611, 1));
            }
            if (drawable2.getConstantState() != null) {
                partialView.f0.setImageDrawable(new ClipDrawable(drawable2.getConstantState().newDrawable(), 8388613, 1));
            }
            addView(partialView);
            this.v0.add(partialView);
        }
    }

    public final void c(float f, boolean z2) {
        float f2 = this.e0;
        if (f > f2) {
            f = f2;
        }
        float f3 = this.i0;
        if (f < f3) {
            f = f3;
        }
        if (this.j0 == f) {
            return;
        }
        float fFloatValue = Double.valueOf(Math.floor(f / this.k0)).floatValue() * this.k0;
        this.j0 = fFloatValue;
        OnRatingChangeListener onRatingChangeListener = this.u0;
        if (onRatingChangeListener != null) {
            onRatingChangeListener.a(fFloatValue);
        }
        a(this.j0);
    }

    public int getNumStars() {
        return this.e0;
    }

    public float getRating() {
        return this.j0;
    }

    public int getStarHeight() {
        return this.h0;
    }

    public int getStarPadding() {
        return this.f0;
    }

    public int getStarWidth() {
        return this.g0;
    }

    public float getStepSize() {
        return this.k0;
    }

    @Override // android.view.View
    public final boolean isClickable() {
        return this.o0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRating(savedState.X);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.X = this.j0;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.q0 = x;
            this.r0 = y;
            this.l0 = this.j0;
        } else if (action == 1) {
            float f = this.q0;
            float f2 = this.r0;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > 200.0f) {
                return false;
            }
            float fAbs = Math.abs(f - motionEvent.getX());
            float fAbs2 = Math.abs(f2 - motionEvent.getY());
            if (fAbs > 5.0f || fAbs2 > 5.0f || !this.o0) {
                return false;
            }
            for (PartialView partialView : this.v0) {
                if (x > partialView.getLeft() && x < partialView.getRight()) {
                    float f3 = this.k0;
                    float fIntValue = f3 == 1.0f ? ((Integer) partialView.getTag()).intValue() : RatingBarUtils.a(partialView, f3, x);
                    if (this.l0 != fIntValue || !this.p0) {
                        c(fIntValue, true);
                        break;
                    }
                    c(this.i0, true);
                    break;
                }
            }
        } else if (action == 2) {
            if (!this.n0) {
                return false;
            }
            for (PartialView partialView2 : this.v0) {
                if (x < (this.i0 * partialView2.getWidth()) + (partialView2.getWidth() / 10.0f)) {
                    c(this.i0, true);
                    break;
                }
                if (x > partialView2.getLeft() && x < partialView2.getRight()) {
                    float fA = RatingBarUtils.a(partialView2, this.k0, x);
                    if (this.j0 != fA) {
                        c(fA, true);
                    }
                }
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setClearRatingEnabled(boolean z2) {
        this.p0 = z2;
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        this.o0 = z2;
    }

    public void setEmptyDrawable(Drawable drawable) {
        this.s0 = drawable;
        for (PartialView partialView : this.v0) {
            partialView.getClass();
            if (drawable.getConstantState() != null) {
                partialView.f0.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388613, 1));
            }
        }
    }

    public void setEmptyDrawableRes(int i2) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i2);
        if (drawable != null) {
            setEmptyDrawable(drawable);
        }
    }

    public void setFilledDrawable(Drawable drawable) {
        this.t0 = drawable;
        for (PartialView partialView : this.v0) {
            partialView.getClass();
            if (drawable.getConstantState() != null) {
                partialView.e0.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388611, 1));
            }
        }
    }

    public void setFilledDrawableRes(int i2) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i2);
        if (drawable != null) {
            setFilledDrawable(drawable);
        }
    }

    public void setIsIndicator(boolean z2) {
        this.m0 = z2;
    }

    public void setMinimumStars(float f) {
        int i2 = this.e0;
        float f2 = this.k0;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = i2;
        if (f > f3) {
            f = f3;
        }
        if (f % f2 == 0.0f) {
            f2 = f;
        }
        this.i0 = f2;
    }

    public void setNumStars(int i2) {
        if (i2 <= 0) {
            return;
        }
        this.v0.clear();
        removeAllViews();
        this.e0 = i2;
        b();
    }

    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.u0 = onRatingChangeListener;
    }

    public void setRating(float f) {
        c(f, false);
    }

    public void setScrollable(boolean z2) {
        this.n0 = z2;
    }

    public void setStarHeight(int i2) {
        this.h0 = i2;
        for (PartialView partialView : this.v0) {
            partialView.h0 = i2;
            ViewGroup.LayoutParams layoutParams = partialView.e0.getLayoutParams();
            layoutParams.height = partialView.h0;
            partialView.e0.setLayoutParams(layoutParams);
            partialView.f0.setLayoutParams(layoutParams);
        }
    }

    public void setStarPadding(int i2) {
        if (i2 < 0) {
            return;
        }
        this.f0 = i2;
        for (PartialView partialView : this.v0) {
            int i3 = this.f0;
            partialView.setPadding(i3, i3, i3, i3);
        }
    }

    public void setStarWidth(int i2) {
        this.g0 = i2;
        for (PartialView partialView : this.v0) {
            partialView.g0 = i2;
            ViewGroup.LayoutParams layoutParams = partialView.e0.getLayoutParams();
            layoutParams.width = partialView.g0;
            partialView.e0.setLayoutParams(layoutParams);
            partialView.f0.setLayoutParams(layoutParams);
        }
    }

    public void setStepSize(float f) {
        this.k0 = f;
    }
}
