package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    public ViewPager e0;
    public int f0;
    public WeakReference g0;

    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        public int X;

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter) {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i2) {
            this.X = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i2, float f, int i3) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i2) {
            if (this.X == 0) {
                throw null;
            }
        }
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Locale f8524a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f8524a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        SingleLineAllCapsTransform singleLineAllCapsTransform = new SingleLineAllCapsTransform();
        singleLineAllCapsTransform.f8524a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(singleLineAllCapsTransform);
    }

    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(null);
            this.g0 = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(null);
            this.g0 = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.e0;
        if (viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        if (pagerAdapter2 != null) {
            pagerAdapter2.getCount();
        }
        if (currentItem < 1 || pagerAdapter2 == null) {
            throw null;
        }
        pagerAdapter2.getPageTitle(currentItem - 1);
        throw null;
    }

    public void b(float f) {
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(null);
        viewPager.addOnAdapterChangeListener(null);
        this.e0 = viewPager;
        WeakReference weakReference = this.g0;
        a(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.e0;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.e0.setInternalPageChangeListener(null);
            this.e0.removeOnAdapterChangeListener(null);
            this.e0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.e0 != null) {
            b(0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i2, (int) (View.MeasureSpec.getSize(i2) * 0.2f), -2);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public void setGravity(int i2) {
    }

    public void setNonPrimaryAlpha(float f) {
        throw null;
    }

    public void setTextColor(int i2) {
        throw null;
    }

    public void setTextSpacing(int i2) {
        this.f0 = i2;
    }
}
