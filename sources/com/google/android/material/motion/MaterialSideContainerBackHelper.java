package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.sidesheet.b;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f19369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19370i;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f19369h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f19370i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b(BackEventCompat backEventCompat, final int i2, Animator.AnimatorListener animatorListener, b bVar) {
        int i3;
        final boolean z2 = backEventCompat.d == 0;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        View view = this.f19359b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        float f = scaleX + i3;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (bVar != null) {
            objectAnimatorOfFloat.addUpdateListener(bVar);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.c(backEventCompat.f3218c, this.f19360c, this.d));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper materialSideContainerBackHelper = MaterialSideContainerBackHelper.this;
                materialSideContainerBackHelper.f19359b.setTranslationX(0.0f);
                materialSideContainerBackHelper.c(i2, 0.0f, z2);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListener);
        objectAnimatorOfFloat.start();
    }

    public final void c(int i2, float f, boolean z2) {
        float interpolation = this.f19358a.getInterpolation(f);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        View view = this.f19359b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        boolean z4 = z2 == z3;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.f19369h / f2;
            float f6 = this.f19370i / f3;
            if (z3) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z4) {
                f5 = -f4;
            }
            float fA = AnimationUtils.a(0.0f, f5, interpolation);
            float f7 = fA + 1.0f;
            view.setScaleX(f7);
            float fA2 = 1.0f - AnimationUtils.a(0.0f, f6, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    childAt.setPivotX(z3 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z4 ? 1.0f - fA : 1.0f;
                    float f9 = fA2 != 0.0f ? (f7 / fA2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
