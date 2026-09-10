package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.preferences.protobuf.a;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final Pools.SynchronizedPool u0 = new Pools.SynchronizedPool(16);
    public Tab e0;
    public ColorStateList f0;
    public ColorStateList g0;
    public ColorStateList h0;
    public Drawable i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public boolean r0;
    public BaseOnTabSelectedListener s0;
    public PagerAdapter t0;

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$1, reason: invalid class name */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Integer) valueAnimator.getAnimatedValue()).intValue();
            throw null;
        }
    }

    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter) {
            throw null;
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    public class PagerAdapterObserver extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            throw null;
        }
    }

    public class SlidingTabIndicator extends LinearLayout {
        public static final /* synthetic */ int e0 = 0;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1, reason: invalid class name */
        class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedFraction();
                int i2 = SlidingTabIndicator.e0;
                throw null;
            }
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            throw null;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            super.onLayout(z2, i2, i3, i4, i5);
            Object obj = null;
            obj.getClass();
            throw null;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                throw null;
            }
        }
    }

    public static class Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f19491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TabLayout f19493c;
        public TabView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19494e;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19495Y;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i2) {
            this.X = this.f19495Y;
            this.f19495Y = i2;
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i2, float f, int i3) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i2) {
            throw null;
        }
    }

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int m0 = 0;
        public Tab e0;
        public TextView f0;
        public ImageView g0;
        public View h0;
        public BadgeDrawable i0;
        public View j0;
        public int k0;

        public TabView(Context context) {
            GradientDrawable gradientDrawable;
            super(context);
            this.k0 = 2;
            TabLayout.this.getClass();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.h0 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = RippleUtils.a(TabLayout.this.h0);
                boolean z2 = TabLayout.this.r0;
                if (z2) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z2 ? null : gradientDrawable3);
            }
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
            TabLayout.this.getClass();
            setPaddingRelative(0, 0, 0, 0);
            setGravity(17);
            setOrientation(!TabLayout.this.o0 ? 1 : 0);
            setClickable(true);
            ViewCompat.H(this, PointerIconCompat.a(getContext()));
        }

        private BadgeDrawable getBadge() {
            return this.i0;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.i0 == null) {
                this.i0 = new BadgeDrawable(getContext(), null);
            }
            b();
            BadgeDrawable badgeDrawable = this.i0;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.i0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.h0;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.i0;
                    if (badgeDrawable != null) {
                        if (badgeDrawable.d() != null) {
                            badgeDrawable.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.h0 = null;
                }
            }
        }

        public final void b() {
            if (this.i0 != null) {
                if (this.j0 != null) {
                    a();
                    return;
                }
                TextView textView = this.f0;
                if (textView == null || this.e0 == null) {
                    a();
                    return;
                }
                if (this.h0 == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f0;
                if (this.i0 == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable = this.i0;
                Rect rect = new Rect();
                textView2.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.i(textView2, null);
                if (badgeDrawable.d() != null) {
                    badgeDrawable.d().setForeground(badgeDrawable);
                } else {
                    textView2.getOverlay().add(badgeDrawable);
                }
                this.h0 = textView2;
            }
        }

        public final void c(View view) {
            BadgeDrawable badgeDrawable = this.i0;
            if (badgeDrawable == null || view != this.h0) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.i(view, null);
        }

        public final void d() {
            boolean z2;
            TabLayout tabLayout = TabLayout.this;
            boolean z3 = false;
            Tab tab = this.e0;
            View view = this.j0;
            if (view != null) {
                removeView(view);
                this.j0 = null;
            }
            if (this.j0 == null) {
                if (this.g0 == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.g0 = imageView;
                    addView(imageView, 0);
                }
                if (this.f0 == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f0 = textView;
                    addView(textView);
                    this.k0 = this.f0.getMaxLines();
                }
                TextView textView2 = this.f0;
                Pools.SynchronizedPool synchronizedPool = TabLayout.u0;
                tabLayout.getClass();
                textView2.setTextAppearance(0);
                if (isSelected()) {
                    this.f0.setTextAppearance(0);
                } else {
                    this.f0.setTextAppearance(0);
                }
                ColorStateList colorStateList = tabLayout.f0;
                if (colorStateList != null) {
                    this.f0.setTextColor(colorStateList);
                }
                TextView textView3 = this.f0;
                ImageView imageView2 = this.g0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    imageView2.setImageDrawable(null);
                }
                boolean zIsEmpty = TextUtils.isEmpty(null);
                if (textView3 != null) {
                    if (zIsEmpty) {
                        z2 = false;
                    } else {
                        this.e0.getClass();
                        z2 = true;
                    }
                    textView3.setText((CharSequence) null);
                    textView3.setVisibility(z2 ? 0 : 8);
                    if (!zIsEmpty) {
                        setVisibility(0);
                    }
                } else {
                    z2 = false;
                }
                if (imageView2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                    int iB = (z2 && imageView2.getVisibility() == 0) ? (int) ViewUtils.b(getContext(), 8) : 0;
                    if (tabLayout.o0) {
                        if (iB != marginLayoutParams.getMarginEnd()) {
                            marginLayoutParams.setMarginEnd(iB);
                            marginLayoutParams.bottomMargin = 0;
                            imageView2.setLayoutParams(marginLayoutParams);
                            imageView2.requestLayout();
                        }
                    } else if (iB != marginLayoutParams.bottomMargin) {
                        marginLayoutParams.bottomMargin = iB;
                        marginLayoutParams.setMarginEnd(0);
                        imageView2.setLayoutParams(marginLayoutParams);
                        imageView2.requestLayout();
                    }
                }
                Tab tab2 = this.e0;
                TooltipCompat.a(this, zIsEmpty ? tab2 != null ? tab2.f19491a : null : null);
                b();
                final ImageView imageView3 = this.g0;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            View view3 = imageView3;
                            if (view3.getVisibility() == 0) {
                                int i10 = TabView.m0;
                                TabView.this.c(view3);
                            }
                        }
                    });
                }
                final TextView textView4 = this.f0;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            View view3 = textView4;
                            if (view3.getVisibility() == 0) {
                                int i10 = TabView.m0;
                                TabView.this.c(view3);
                            }
                        }
                    });
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.f19491a)) {
                setContentDescription(tab.f19491a);
            }
            Tab tab3 = this.e0;
            if (tab3 != null) {
                TabLayout tabLayout2 = tab3.f19493c;
                if (tabLayout2 == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout2.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == tab3.f19492b) {
                    z3 = true;
                }
            }
            setSelected(z3);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            getDrawableState();
        }

        public int getContentHeight() {
            View[] viewArr = {this.f0, this.g0, this.j0};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z2 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f0, this.g0, this.j0};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z2 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        public Tab getTab() {
            return this.e0;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.i0;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfoCompat.m(this.i0.c());
            }
            accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, this.e0.f19492b, 1, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfoCompat.h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i2, int i3) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(tabLayout.k0, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f0 != null) {
                tabLayout.getClass();
                int i4 = this.k0;
                ImageView imageView = this.g0;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f0;
                    if (textView != null && textView.getLineCount() > 1) {
                        tabLayout.getClass();
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f0.getTextSize();
                int lineCount = this.f0.getLineCount();
                int maxLines = this.f0.getMaxLines();
                if (0.0f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                    if (tabLayout.n0 == 1 && 0.0f > textSize && lineCount == 1) {
                        Layout layout = this.f0.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((0.0f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f0.setTextSize(0, 0.0f);
                    this.f0.setMaxLines(i4);
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.e0 == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            Tab tab = this.e0;
            TabLayout tabLayout = tab.f19493c;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.b(tab, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            isSelected();
            super.setSelected(z2);
            TextView textView = this.f0;
            if (textView != null) {
                textView.setSelected(z2);
            }
            ImageView imageView = this.g0;
            if (imageView != null) {
                imageView.setSelected(z2);
            }
            View view = this.j0;
            if (view != null) {
                view.setSelected(z2);
            }
        }

        public void setTab(Tab tab) {
            if (tab != this.e0) {
                this.e0 = tab;
                d();
            }
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
    }

    private int getDefaultHeight() {
        throw null;
    }

    private int getTabMinWidth() {
        return 0;
    }

    private int getTabScrollRange() {
        throw null;
    }

    private void setSelectedTabView(int i2) {
        throw null;
    }

    public final void a(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        Tab tab = (Tab) u0.b();
        if (tab == null) {
            tab = new Tab();
            tab.f19492b = -1;
            tab.f19494e = -1;
        }
        tab.f19493c = this;
        TabView tabView = new TabView(getContext());
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f19491a)) {
            tabView.setContentDescription(null);
        } else {
            tabView.setContentDescription(tab.f19491a);
        }
        tab.d = tabView;
        int i2 = tab.f19494e;
        if (i2 != -1) {
            tabView.setId(i2);
        }
        tabItem.getClass();
        if (TextUtils.isEmpty(tabItem.getContentDescription())) {
            throw null;
        }
        tab.f19491a = tabItem.getContentDescription();
        TabView tabView2 = tab.d;
        if (tabView2 == null) {
            throw null;
        }
        tabView2.d();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
        throw null;
    }

    public final void b(Tab tab, boolean z2) {
        Tab tab2 = this.e0;
        if (tab2 == tab) {
            if (tab2 != null) {
                throw null;
            }
            return;
        }
        int i2 = tab != null ? tab.f19492b : -1;
        if (z2) {
            if ((tab2 == null || tab2.f19492b == -1) && i2 != -1) {
                if (Math.round(i2 + 0.0f) >= 0) {
                    throw null;
                }
            } else if (i2 != -1) {
                if (getWindowToken() != null) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    if (isLaidOut()) {
                        throw null;
                    }
                }
                if (Math.round(i2 + 0.0f) >= 0) {
                    throw null;
                }
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.e0 = tab;
        if ((tab2 != null && tab2.f19493c != null) || tab != null) {
            throw null;
        }
    }

    public final void c(ViewPager viewPager) {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        Tab tab = this.e0;
        if (tab != null) {
            return tab.f19492b;
        }
        return -1;
    }

    public int getTabCount() {
        throw null;
    }

    public int getTabGravity() {
        return this.l0;
    }

    public ColorStateList getTabIconTint() {
        return this.g0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.q0;
    }

    public int getTabIndicatorGravity() {
        return this.m0;
    }

    public int getTabMaxWidth() {
        return this.k0;
    }

    public int getTabMode() {
        return this.n0;
    }

    public ColorStateList getTabRippleColor() {
        return this.h0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.i0;
    }

    public ColorStateList getTabTextColors() {
        return this.f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            c((ViewPager) parent);
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).k(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, getTabCount(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iRound = Math.round(ViewUtils.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            this.k0 = (int) (size - ViewUtils.b(getContext(), 56));
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.n0;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setInlineLabel(boolean z2) {
        if (this.o0 == z2) {
            return;
        }
        this.o0 = z2;
        throw null;
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        throw null;
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.i0 = drawableMutate;
        int i2 = this.j0;
        if (i2 != 0) {
            DrawableCompat.i(drawableMutate, i2);
        } else {
            DrawableCompat.j(drawableMutate, null);
        }
        if (this.p0 != -1) {
            throw null;
        }
        this.i0.getIntrinsicHeight();
        throw null;
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.j0 = i2;
        Drawable drawable = this.i0;
        if (i2 != 0) {
            DrawableCompat.i(drawable, i2);
            throw null;
        }
        DrawableCompat.j(drawable, null);
        throw null;
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.m0 == i2) {
            return;
        }
        this.m0 = i2;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        throw null;
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.p0 = i2;
        throw null;
    }

    public void setTabGravity(int i2) {
        if (this.l0 == i2) {
            return;
        }
        this.l0 = i2;
        int i3 = this.n0;
        if (i3 == 0 || i3 == 2) {
            Math.max(0, 0);
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        throw null;
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.g0 == colorStateList) {
            return;
        }
        this.g0 = colorStateList;
        throw null;
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(ContextCompat.getColorStateList(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.q0 = i2;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(a.f(i2, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        int i2 = SlidingTabIndicator.e0;
        throw null;
    }

    public void setTabMode(int i2) {
        if (i2 == this.n0) {
            return;
        }
        this.n0 = i2;
        if (i2 == 0 || i2 == 2) {
            Math.max(0, 0);
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        throw null;
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.h0 == colorStateList) {
            return;
        }
        this.h0 = colorStateList;
        throw null;
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(ContextCompat.getColorStateList(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f0 == colorStateList) {
            return;
        }
        this.f0 = colorStateList;
        throw null;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.t0;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(null);
        }
        this.t0 = pagerAdapter;
        throw null;
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.r0 == z2) {
            return;
        }
        this.r0 = z2;
        throw null;
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        c(viewPager);
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        a(view);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.s0 != null) {
            throw null;
        }
        this.s0 = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            throw null;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
        throw null;
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(AppCompatResources.a(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
