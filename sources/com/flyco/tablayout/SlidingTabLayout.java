package com.flyco.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.charging.screenshow.battery.animations.themes.activity.ImageCategoryDetailAct;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.p004ironsource.x4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    public final float A0;
    public final float B0;
    public final float C0;
    public int D0;
    public boolean E0;
    public int F0;
    public float G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public float S0;
    public final Paint T0;
    public OnTabSelectListener U0;
    public final Context e0;
    public ViewPager f0;
    public final LinearLayout g0;
    public int h0;
    public float i0;
    public int j0;
    public final Rect k0;
    public final Rect l0;
    public final GradientDrawable m0;
    public final Paint n0;
    public final Paint o0;
    public final Paint p0;
    public final Path q0;
    public int r0;
    public float s0;
    public boolean t0;
    public float u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public final float z0;

    public class InnerPagerAdapter extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ArrayList f16665l;
        public String[] m;

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public final Fragment a(int i2) {
            return (Fragment) this.f16665l.get(i2);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f16665l.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            return this.m[i2];
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet, 0);
        this.k0 = new Rect();
        this.l0 = new Rect();
        this.m0 = new GradientDrawable();
        this.n0 = new Paint(1);
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        this.q0 = new Path();
        this.r0 = 0;
        this.T0 = new Paint(1);
        new SparseArray();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.e0 = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.g0 = linearLayout;
        addView(linearLayout);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f16663b);
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        this.r0 = i2;
        this.v0 = typedArrayObtainStyledAttributes.getColor(3, Color.parseColor(i2 == 2 ? "#4B6A87" : "#ffffff"));
        int i3 = this.r0;
        if (i3 == 1) {
            f = 4.0f;
        } else {
            f = i3 == 2 ? -1 : 2;
        }
        this.w0 = typedArrayObtainStyledAttributes.getDimension(6, b(f));
        this.x0 = typedArrayObtainStyledAttributes.getDimension(12, b(this.r0 == 1 ? 10.0f : -1.0f));
        this.y0 = typedArrayObtainStyledAttributes.getDimension(4, b(this.r0 == 2 ? -1.0f : 0.0f));
        this.z0 = typedArrayObtainStyledAttributes.getDimension(8, b(0.0f));
        this.A0 = typedArrayObtainStyledAttributes.getDimension(10, b(this.r0 == 2 ? 7.0f : 0.0f));
        this.B0 = typedArrayObtainStyledAttributes.getDimension(9, b(0.0f));
        this.C0 = typedArrayObtainStyledAttributes.getDimension(7, b(this.r0 != 2 ? 0.0f : 7.0f));
        this.D0 = typedArrayObtainStyledAttributes.getInt(5, 80);
        this.E0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.F0 = typedArrayObtainStyledAttributes.getColor(22, Color.parseColor("#ffffff"));
        this.G0 = typedArrayObtainStyledAttributes.getDimension(24, b(0.0f));
        this.H0 = typedArrayObtainStyledAttributes.getInt(23, 80);
        this.I0 = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#ffffff"));
        this.J0 = typedArrayObtainStyledAttributes.getDimension(2, b(0.0f));
        this.K0 = typedArrayObtainStyledAttributes.getDimension(1, b(12.0f));
        this.L0 = typedArrayObtainStyledAttributes.getDimension(21, (int) ((14.0f * this.e0.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.M0 = typedArrayObtainStyledAttributes.getColor(19, Color.parseColor("#ffffff"));
        this.N0 = typedArrayObtainStyledAttributes.getColor(20, Color.parseColor("#AAffffff"));
        this.O0 = typedArrayObtainStyledAttributes.getInt(18, 0);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.t0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(16, b(-1.0f));
        this.u0 = dimension;
        this.s0 = typedArrayObtainStyledAttributes.getDimension(14, (this.t0 || dimension > 0.0f) ? b(0.0f) : b(20.0f));
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals(x4.DISABLED_AUCTION_FALLBACK_ID) || attributeValue.equals("-2")) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height});
        typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        LinearLayout linearLayout = this.g0;
        View childAt = linearLayout.getChildAt(this.h0);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        int i2 = this.r0;
        Paint paint = this.T0;
        if (i2 == 0 && this.E0) {
            TextView textView = (TextView) childAt.findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_tab_title);
            paint.setTextSize(this.L0);
            this.S0 = ((right - left) - paint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i3 = this.h0;
        if (i3 < this.j0 - 1) {
            View childAt2 = linearLayout.getChildAt(i3 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.i0;
            left = a.a(left2, left, f, left);
            right = a.a(right2, right, f, right);
            if (this.r0 == 0 && this.E0) {
                TextView textView2 = (TextView) childAt2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_tab_title);
                paint.setTextSize(this.L0);
                float fMeasureText = ((right2 - left2) - paint.measureText(textView2.getText().toString())) / 2.0f;
                float f2 = this.S0;
                this.S0 = a.a(fMeasureText, f2, this.i0, f2);
            }
        }
        int i4 = (int) left;
        Rect rect = this.k0;
        rect.left = i4;
        int i5 = (int) right;
        rect.right = i5;
        if (this.r0 == 0 && this.E0) {
            float f3 = this.S0;
            rect.left = (int) ((left + f3) - 1.0f);
            rect.right = (int) ((right - f3) - 1.0f);
        }
        Rect rect2 = this.l0;
        rect2.left = i4;
        rect2.right = i5;
        if (this.x0 < 0.0f) {
            return;
        }
        float width = ((childAt.getWidth() - this.x0) / 2.0f) + childAt.getLeft();
        int i6 = this.h0;
        if (i6 < this.j0 - 1) {
            width += this.i0 * ((linearLayout.getChildAt(i6 + 1).getWidth() / 2) + (childAt.getWidth() / 2));
        }
        int i7 = (int) width;
        rect.left = i7;
        rect.right = (int) (i7 + this.x0);
    }

    public final int b(float f) {
        return (int) ((f * this.e0.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c() {
        LinearLayout linearLayout = this.g0;
        linearLayout.removeAllViews();
        this.j0 = this.f0.getAdapter().getCount();
        for (int i2 = 0; i2 < this.j0; i2++) {
            View viewInflate = View.inflate(this.e0, com.charging.screenshow.battery.animations.themes.R.layout.layout_tab, null);
            String string = this.f0.getAdapter().getPageTitle(i2).toString();
            TextView textView = (TextView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_tab_title);
            if (textView != null && string != null) {
                textView.setText(string);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.flyco.tablayout.SlidingTabLayout.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SlidingTabLayout slidingTabLayout = SlidingTabLayout.this;
                    int iIndexOfChild = slidingTabLayout.g0.indexOfChild(view);
                    if (iIndexOfChild != -1) {
                        if (slidingTabLayout.f0.getCurrentItem() == iIndexOfChild) {
                            OnTabSelectListener onTabSelectListener = slidingTabLayout.U0;
                            if (onTabSelectListener != null) {
                                onTabSelectListener.b();
                                return;
                            }
                            return;
                        }
                        if (slidingTabLayout.R0) {
                            slidingTabLayout.f0.setCurrentItem(iIndexOfChild, false);
                        } else {
                            slidingTabLayout.f0.setCurrentItem(iIndexOfChild);
                        }
                        OnTabSelectListener onTabSelectListener2 = slidingTabLayout.U0;
                        if (onTabSelectListener2 != null) {
                            onTabSelectListener2.a();
                        }
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = this.t0 ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
            if (this.u0 > 0.0f) {
                layoutParams = new LinearLayout.LayoutParams((int) this.u0, -1);
            }
            linearLayout.addView(viewInflate, i2, layoutParams);
        }
        g();
    }

    public final void d() {
        if (this.j0 <= 0) {
            return;
        }
        float f = this.i0;
        LinearLayout linearLayout = this.g0;
        int width = (int) (f * linearLayout.getChildAt(this.h0).getWidth());
        int left = linearLayout.getChildAt(this.h0).getLeft() + width;
        if (this.h0 > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            a();
            Rect rect = this.l0;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.Q0) {
            this.Q0 = left;
            scrollTo(left, 0);
        }
    }

    public final void e(ViewPager viewPager, String[] strArr, ImageCategoryDetailAct imageCategoryDetailAct, ArrayList arrayList) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        this.f0 = viewPager;
        InnerPagerAdapter innerPagerAdapter = new InnerPagerAdapter(imageCategoryDetailAct.getSupportFragmentManager());
        new ArrayList();
        innerPagerAdapter.f16665l = arrayList;
        innerPagerAdapter.m = strArr;
        viewPager.setAdapter(innerPagerAdapter);
        this.f0.removeOnPageChangeListener(this);
        this.f0.addOnPageChangeListener(this);
        c();
    }

    public final void f(int i2) {
        int i3 = 0;
        while (i3 < this.j0) {
            View childAt = this.g0.getChildAt(i3);
            boolean z2 = i3 == i2;
            TextView textView = (TextView) childAt.findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z2 ? this.M0 : this.N0);
                if (this.O0 == 1) {
                    textView.getPaint().setFakeBoldText(z2);
                }
            }
            i3++;
        }
    }

    public final void g() {
        int i2 = 0;
        while (i2 < this.j0) {
            TextView textView = (TextView) this.g0.getChildAt(i2).findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i2 == this.h0 ? this.M0 : this.N0);
                textView.setTextSize(0, this.L0);
                float f = this.s0;
                textView.setPadding((int) f, 0, (int) f, 0);
                if (this.P0) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i3 = this.O0;
                if (i3 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i3 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i2++;
        }
    }

    public int getCurrentTab() {
        return this.h0;
    }

    public int getDividerColor() {
        return this.I0;
    }

    public float getDividerPadding() {
        return this.K0;
    }

    public float getDividerWidth() {
        return this.J0;
    }

    public int getIndicatorColor() {
        return this.v0;
    }

    public float getIndicatorCornerRadius() {
        return this.y0;
    }

    public float getIndicatorHeight() {
        return this.w0;
    }

    public float getIndicatorMarginBottom() {
        return this.C0;
    }

    public float getIndicatorMarginLeft() {
        return this.z0;
    }

    public float getIndicatorMarginRight() {
        return this.B0;
    }

    public float getIndicatorMarginTop() {
        return this.A0;
    }

    public int getIndicatorStyle() {
        return this.r0;
    }

    public float getIndicatorWidth() {
        return this.x0;
    }

    public int getTabCount() {
        return this.j0;
    }

    public float getTabPadding() {
        return this.s0;
    }

    public float getTabWidth() {
        return this.u0;
    }

    public int getTextBold() {
        return this.O0;
    }

    public int getTextSelectColor() {
        return this.M0;
    }

    public int getTextUnselectColor() {
        return this.N0;
    }

    public float getTextsize() {
        return this.L0;
    }

    public int getUnderlineColor() {
        return this.F0;
    }

    public float getUnderlineHeight() {
        return this.G0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.j0 <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f = this.J0;
        LinearLayout linearLayout = this.g0;
        if (f > 0.0f) {
            Paint paint = this.o0;
            paint.setStrokeWidth(f);
            paint.setColor(this.I0);
            for (int i2 = 0; i2 < this.j0 - 1; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.K0, childAt.getRight() + paddingLeft, height - this.K0, paint);
            }
        }
        if (this.G0 > 0.0f) {
            Paint paint2 = this.n0;
            paint2.setColor(this.F0);
            if (this.H0 == 80) {
                float f2 = height;
                canvas.drawRect(paddingLeft, f2 - this.G0, linearLayout.getWidth() + paddingLeft, f2, paint2);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, linearLayout.getWidth() + paddingLeft, this.G0, paint2);
            }
        }
        a();
        int i3 = this.r0;
        Rect rect = this.k0;
        if (i3 == 1) {
            if (this.w0 > 0.0f) {
                Paint paint3 = this.p0;
                paint3.setColor(this.v0);
                Path path = this.q0;
                path.reset();
                float f3 = height;
                path.moveTo(rect.left + paddingLeft, f3);
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f3 - this.w0);
                path.lineTo(paddingLeft + rect.right, f3);
                path.close();
                canvas.drawPath(path, paint3);
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable = this.m0;
        if (i3 != 2) {
            if (this.w0 > 0.0f) {
                gradientDrawable.setColor(this.v0);
                if (this.D0 == 80) {
                    int i4 = ((int) this.z0) + paddingLeft + rect.left;
                    int i5 = height - ((int) this.w0);
                    float f4 = this.C0;
                    gradientDrawable.setBounds(i4, i5 - ((int) f4), (paddingLeft + rect.right) - ((int) this.B0), height - ((int) f4));
                } else {
                    int i6 = ((int) this.z0) + paddingLeft + rect.left;
                    float f5 = this.A0;
                    gradientDrawable.setBounds(i6, (int) f5, (paddingLeft + rect.right) - ((int) this.B0), ((int) this.w0) + ((int) f5));
                }
                gradientDrawable.setCornerRadius(this.y0);
                gradientDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.w0 < 0.0f) {
            this.w0 = (height - this.A0) - this.C0;
        }
        float f6 = this.w0;
        if (f6 > 0.0f) {
            float f7 = this.y0;
            if (f7 < 0.0f || f7 > f6 / 2.0f) {
                this.y0 = f6 / 2.0f;
            }
            gradientDrawable.setColor(this.v0);
            int i7 = ((int) this.z0) + paddingLeft + rect.left;
            float f8 = this.A0;
            gradientDrawable.setBounds(i7, (int) f8, (int) ((paddingLeft + rect.right) - this.B0), (int) (f8 + this.w0));
            gradientDrawable.setCornerRadius(this.y0);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f, int i3) {
        this.h0 = i2;
        this.i0 = f;
        d();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
        f(i2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.h0 = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.h0 != 0 && this.g0.getChildCount() > 0) {
                f(this.h0);
                d();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.h0);
        return bundle;
    }

    public void setCurrentTab(int i2) {
        this.h0 = i2;
        this.f0.setCurrentItem(i2);
    }

    public void setDividerColor(int i2) {
        this.I0 = i2;
        invalidate();
    }

    public void setDividerPadding(float f) {
        this.K0 = b(f);
        invalidate();
    }

    public void setDividerWidth(float f) {
        this.J0 = b(f);
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        this.v0 = i2;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.y0 = b(f);
        invalidate();
    }

    public void setIndicatorGravity(int i2) {
        this.D0 = i2;
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.w0 = b(f);
        invalidate();
    }

    public void setIndicatorStyle(int i2) {
        this.r0 = i2;
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        this.x0 = b(f);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z2) {
        this.E0 = z2;
        invalidate();
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.U0 = onTabSelectListener;
    }

    public void setSnapOnTabClick(boolean z2) {
        this.R0 = z2;
    }

    public void setTabPadding(float f) {
        this.s0 = b(f);
        g();
    }

    public void setTabSpaceEqual(boolean z2) {
        this.t0 = z2;
        g();
    }

    public void setTabWidth(float f) {
        this.u0 = b(f);
        g();
    }

    public void setTextAllCaps(boolean z2) {
        this.P0 = z2;
        g();
    }

    public void setTextBold(int i2) {
        this.O0 = i2;
        g();
    }

    public void setTextSelectColor(int i2) {
        this.M0 = i2;
        g();
    }

    public void setTextUnselectColor(int i2) {
        this.N0 = i2;
        g();
    }

    public void setTextsize(float f) {
        this.L0 = (int) ((f * this.e0.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        g();
    }

    public void setUnderlineColor(int i2) {
        this.F0 = i2;
        invalidate();
    }

    public void setUnderlineGravity(int i2) {
        this.H0 = i2;
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        this.G0 = b(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f0 = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.f0.addOnPageChangeListener(this);
        c();
    }
}
