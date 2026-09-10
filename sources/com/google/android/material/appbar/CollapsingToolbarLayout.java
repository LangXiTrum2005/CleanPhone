package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public View e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public Drawable l0;
    public Drawable m0;
    public int n0;
    public boolean o0;
    public long p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$1, reason: invalid class name */
    class AnonymousClass1 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$2, reason: invalid class name */
    class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Integer) valueAnimator.getAnimatedValue()).intValue();
            throw null;
        }
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19100b;
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void a(AppBarLayout appBarLayout, int i2) {
            throw null;
        }
    }

    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public static ViewOffsetHelper a(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListValueOf;
        Context context = getContext();
        TypedValue typedValueA = MaterialAttributes.a(context, R.attr.colorSurfaceContainer);
        if (typedValueA != null) {
            int i2 = typedValueA.resourceId;
            if (i2 != 0) {
                colorStateListValueOf = ContextCompat.getColorStateList(context, i2);
            } else {
                int i3 = typedValueA.data;
                if (i3 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i3);
                } else {
                    colorStateListValueOf = null;
                }
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        getResources().getDimension(R.dimen.design_appbar_elevation);
        throw null;
    }

    public final void b() {
        if (this.l0 == null && this.m0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.r0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.l0;
        if (drawable != null && this.n0 > 0) {
            drawable.mutate().setAlpha(this.n0);
            this.l0.draw(canvas);
        }
        if (this.j0 && this.k0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z2;
        Drawable drawable = this.l0;
        if (drawable == null || this.n0 <= 0 || view != null) {
            z2 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.s0 == 1 && view != null && this.j0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.l0.mutate().setAlpha(this.n0);
            this.l0.draw(canvas);
            z2 = true;
        }
        return super.drawChild(canvas, view, j) || z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.m0;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.l0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f19099a = 0;
        layoutParams.f19100b = 0.5f;
        return layoutParams;
    }

    public int getCollapsedTitleGravity() {
        throw null;
    }

    public float getCollapsedTitleTextSize() {
        throw null;
    }

    public Typeface getCollapsedTitleTypeface() {
        throw null;
    }

    public Drawable getContentScrim() {
        return this.l0;
    }

    public int getExpandedTitleGravity() {
        throw null;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h0;
    }

    public int getExpandedTitleMarginStart() {
        return this.f0;
    }

    public int getExpandedTitleMarginTop() {
        return this.g0;
    }

    public float getExpandedTitleTextSize() {
        throw null;
    }

    public Typeface getExpandedTitleTypeface() {
        throw null;
    }

    public int getHyphenationFrequency() {
        throw null;
    }

    public int getLineCount() {
        throw null;
    }

    public float getLineSpacingAdd() {
        throw null;
    }

    public float getLineSpacingMultiplier() {
        throw null;
    }

    public int getMaxLines() {
        throw null;
    }

    public int getScrimAlpha() {
        return this.n0;
    }

    public long getScrimAnimationDuration() {
        return this.p0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.q0;
        if (i2 >= 0) {
            return i2 + 0;
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min(minimumHeight * 2, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.m0;
    }

    public CharSequence getTitle() {
        if (this.j0) {
            throw null;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.s0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        throw null;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.s0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            appBarLayout.a(null);
            ViewCompat.x(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ((AppBarLayout) parent).getClass();
            throw null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ViewOffsetHelper viewOffsetHelperA = a(getChildAt(i6));
            View view = viewOffsetHelperA.f19103a;
            viewOffsetHelperA.f19104b = view.getTop();
            viewOffsetHelperA.f19105c = view.getLeft();
        }
        if (this.j0) {
            View view2 = this.e0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            boolean z3 = view2.isAttachedToWindow() && this.e0.getVisibility() == 0;
            this.k0 = z3;
            if (z3) {
                getLayoutDirection();
                a(null);
                throw null;
            }
        }
        b();
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            a(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i3) != 0) {
            boolean z2 = this.t0;
        }
        if (this.u0) {
            throw null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.l0;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        throw null;
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        throw null;
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextSize(float f) {
        throw null;
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        throw null;
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.l0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.l0 = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.l0.setCallback(this);
                this.l0.setAlpha(this.n0);
            }
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        throw null;
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.i0 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.h0 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f0 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.g0 = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        throw null;
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setExpandedTitleTextSize(float f) {
        throw null;
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        throw null;
    }

    public void setExtraMultilineHeightEnabled(boolean z2) {
        this.u0 = z2;
    }

    public void setForceApplySystemWindowInsetTop(boolean z2) {
        this.t0 = z2;
    }

    public void setHyphenationFrequency(int i2) {
        throw null;
    }

    public void setLineSpacingAdd(float f) {
        throw null;
    }

    public void setLineSpacingMultiplier(float f) {
        throw null;
    }

    public void setMaxLines(int i2) {
        throw null;
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z2) {
        throw null;
    }

    public void setScrimAlpha(int i2) {
        if (i2 != this.n0) {
            this.n0 = i2;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.p0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.q0 != i2) {
            this.q0 = i2;
            b();
        }
    }

    public void setScrimsShown(boolean z2) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        boolean z3 = isLaidOut() && !isInEditMode();
        if (this.o0 != z2) {
            if (z3) {
                throw null;
            }
            setScrimAlpha(z2 ? 255 : 0);
            this.o0 = z2;
        }
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        throw null;
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.m0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.m0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.m0.setState(getDrawableState());
                }
                Drawable drawable3 = this.m0;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                DrawableCompat.h(drawable3, getLayoutDirection());
                this.m0.setVisible(getVisibility() == 0, false);
                this.m0.setCallback(this);
                this.m0.setAlpha(this.n0);
            }
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        throw null;
    }

    public void setTitleCollapseMode(int i2) {
        this.s0 = i2;
        throw null;
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        throw null;
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.j0) {
            this.j0 = z2;
            setContentDescription(getTitle());
            if (!this.j0) {
                ViewParent parent = this.e0.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.e0);
                }
            }
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        throw null;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.m0;
        if (drawable != null && drawable.isVisible() != z2) {
            this.m0.setVisible(z2, false);
        }
        Drawable drawable2 = this.l0;
        if (drawable2 == null || drawable2.isVisible() == z2) {
            return;
        }
        this.l0.setVisible(z2, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.l0 || drawable == this.m0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f19099a = 0;
        layoutParams.f19100b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19071i);
        layoutParams.f19099a = typedArrayObtainStyledAttributes.getInt(0, 0);
        layoutParams.f19100b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f19099a = 0;
        layoutParams.f19100b = 0.5f;
        return layoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f19099a = 0;
        layoutParams2.f19100b = 0.5f;
        return layoutParams2;
    }
}
