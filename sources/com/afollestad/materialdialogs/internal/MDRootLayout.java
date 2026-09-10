package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3590h90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4885vy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YW;

/* JADX INFO: loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MDButton[] f46a;
    public int b;
    public View c;
    public View d;
    public boolean e;
    public boolean f;
    public EnumC3590h90 g;
    public boolean h;
    public boolean i;
    public final boolean j;
    public boolean k;
    public final int l;
    public final int m;
    public final int n;
    public EnumC4885vy o;
    public final int p;
    public final Paint q;
    public TK r;
    public TK s;
    public final int t;

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46a = new MDButton[3];
        this.e = false;
        this.f = false;
        this.g = EnumC3590h90.b;
        this.h = false;
        this.i = true;
        this.o = EnumC4885vy.f5163a;
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, YW.f4020a, 0, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.q = new Paint();
        this.t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.q.setColor(AbstractC2845Vx.e0(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public static void a(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        mDRootLayout.getClass();
        if (z && viewGroup.getChildCount() > 0) {
            View view = mDRootLayout.c;
            if (view == null || view.getVisibility() == 8) {
                z5 = false;
            } else {
                if (viewGroup.getPaddingTop() + viewGroup.getScrollY() > viewGroup.getChildAt(0).getTop()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            mDRootLayout.e = z5;
        }
        if (!z2 || viewGroup.getChildCount() <= 0) {
            return;
        }
        if (z3) {
            z4 = (viewGroup.getHeight() + viewGroup.getScrollY()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
        }
        mDRootLayout.f = z4;
    }

    public static boolean c(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        if (z && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z;
    }

    public final void b(ViewGroup viewGroup, boolean z, boolean z2) {
        if ((z2 || this.r != null) && !(z2 && this.s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            SK sk = new SK(this, viewGroup, z, z2);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(sk);
            sk.onScrolled(recyclerView, 0, 0);
            return;
        }
        TK tk = new TK(this, viewGroup, z, z2);
        if (z2) {
            this.s = tk;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.s);
        } else {
            this.r = tk;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.r);
        }
        tk.onScrollChanged();
    }

    public final void d(View view, boolean z) {
        View childAt;
        if (view == null) {
            return;
        }
        boolean z2 = false;
        if (view instanceof ScrollView) {
            ViewGroup viewGroup = (ScrollView) view;
            if (viewGroup.getChildCount() != 0) {
                if ((viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(0).getMeasuredHeight()) {
                    b(viewGroup, z, true);
                    return;
                }
            }
            if (z) {
                this.e = false;
            }
            this.f = false;
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (adapterView.getLastVisiblePosition() != -1) {
                boolean z3 = adapterView.getFirstVisiblePosition() == 0;
                boolean z4 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
                if (!z3 || !z4 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
                    b(adapterView, z, true);
                    return;
                }
            }
            if (z) {
                this.e = false;
            }
            this.f = false;
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new RK(this, view, z));
            return;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null && recyclerView.getLayoutManager().canScrollVertically()) {
                z2 = true;
            }
            if (z) {
                this.e = z2;
            }
            this.f = z2;
            if (z2) {
                b((ViewGroup) view, z, true);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            View view2 = null;
            if (viewGroup2.getChildCount() == 0) {
                childAt = null;
                break;
            }
            int childCount = viewGroup2.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    childAt = null;
                    break;
                }
                childAt = viewGroup2.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                    break;
                } else {
                    childCount--;
                }
            }
            d(childAt, z);
            if (viewGroup2.getChildCount() != 0) {
                for (int childCount2 = viewGroup2.getChildCount() - 1; childCount2 >= 0; childCount2--) {
                    View childAt2 = viewGroup2.getChildAt(childCount2);
                    if (childAt2.getVisibility() == 0 && childAt2.getBottom() == viewGroup2.getMeasuredHeight()) {
                        view2 = childAt2;
                        break;
                    }
                }
            }
            if (view2 != childAt) {
                d(view2, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.d;
        if (view != null) {
            if (this.e) {
                int top = view.getTop();
                canvas.drawRect(0.0f, top - this.t, getMeasuredWidth(), top, this.q);
            }
            if (this.f) {
                int bottom = this.d.getBottom();
                canvas.drawRect(0.0f, bottom, getMeasuredWidth(), bottom + this.t, this.q);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.c = childAt;
            } else {
                int id = childAt.getId();
                MDButton[] mDButtonArr = this.f46a;
                if (id == R.id.md_buttonDefaultNeutral) {
                    mDButtonArr[0] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                    mDButtonArr[1] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                    mDButtonArr[2] = (MDButton) childAt;
                } else {
                    this.d = childAt;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        int i6 = i2;
        if (c(this.c)) {
            int measuredHeight = this.c.getMeasuredHeight() + i6;
            this.c.layout(i, i6, i3, measuredHeight);
            i6 = measuredHeight;
        } else if (!this.k && this.i) {
            i6 += this.l;
        }
        if (c(this.d)) {
            View view = this.d;
            view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
        }
        boolean z2 = this.h;
        MDButton[] mDButtonArr = this.f46a;
        if (z2) {
            int measuredHeight2 = i4 - this.m;
            for (MDButton mDButton : mDButtonArr) {
                if (c(mDButton)) {
                    mDButton.layout(i, measuredHeight2 - mDButton.getMeasuredHeight(), i3, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            int i7 = this.i ? i4 - this.m : i4;
            int i8 = i7 - this.n;
            int measuredWidth9 = this.p;
            boolean zC = c(mDButtonArr[2]);
            EnumC4885vy enumC4885vy = EnumC4885vy.c;
            if (zC) {
                if (this.o == enumC4885vy) {
                    measuredWidth7 = i + measuredWidth9;
                    measuredWidth8 = mDButtonArr[2].getMeasuredWidth() + measuredWidth7;
                    i5 = -1;
                } else {
                    int i9 = i3 - measuredWidth9;
                    measuredWidth7 = i9 - mDButtonArr[2].getMeasuredWidth();
                    measuredWidth8 = i9;
                    i5 = measuredWidth7;
                }
                mDButtonArr[2].layout(measuredWidth7, i8, measuredWidth8, i7);
                measuredWidth9 += mDButtonArr[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            boolean zC2 = c(mDButtonArr[1]);
            EnumC4885vy enumC4885vy2 = EnumC4885vy.f5163a;
            if (zC2) {
                EnumC4885vy enumC4885vy3 = this.o;
                if (enumC4885vy3 == enumC4885vy) {
                    measuredWidth5 = measuredWidth9 + i;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                } else {
                    if (enumC4885vy3 == enumC4885vy2) {
                        measuredWidth6 = i3 - measuredWidth9;
                        measuredWidth5 = measuredWidth6 - mDButtonArr[1].getMeasuredWidth();
                    } else {
                        measuredWidth5 = this.p + i;
                        measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                        measuredWidth = measuredWidth6;
                    }
                    mDButtonArr[1].layout(measuredWidth5, i8, measuredWidth6, i7);
                }
                measuredWidth = -1;
                mDButtonArr[1].layout(measuredWidth5, i8, measuredWidth6, i7);
            } else {
                measuredWidth = -1;
            }
            if (c(mDButtonArr[0])) {
                EnumC4885vy enumC4885vy4 = this.o;
                if (enumC4885vy4 == enumC4885vy) {
                    measuredWidth3 = i3 - this.p;
                    measuredWidth4 = measuredWidth3 - mDButtonArr[0].getMeasuredWidth();
                } else if (enumC4885vy4 == enumC4885vy2) {
                    measuredWidth4 = this.p + i;
                    measuredWidth3 = mDButtonArr[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i5 == -1) {
                        if (i5 == -1 && measuredWidth != -1) {
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        } else if (i5 == -1) {
                            measuredWidth = ((i3 - i) / 2) - (mDButtonArr[0].getMeasuredWidth() / 2);
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        }
                        i5 = measuredWidth2 + measuredWidth;
                    } else {
                        measuredWidth = i5 - mDButtonArr[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i5;
                    measuredWidth4 = measuredWidth;
                }
                mDButtonArr[0].layout(measuredWidth4, i8, measuredWidth3, i7);
            }
        }
        d(this.d, true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x005d, please report this as an issue */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int measuredHeight;
        int i3;
        int measuredHeight2;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = this.b;
        if (size2 > i6) {
            size2 = i6;
        }
        this.i = true;
        EnumC3590h90 enumC3590h90 = this.g;
        EnumC3590h90 enumC3590h91 = EnumC3590h90.f4448a;
        MDButton[] mDButtonArr = this.f46a;
        int measuredHeight3 = 0;
        if (enumC3590h90 != enumC3590h91) {
            if (enumC3590h90 == EnumC3590h90.c) {
                z2 = false;
            } else {
                int measuredWidth = 0;
                z = false;
                for (MDButton mDButton : mDButtonArr) {
                    if (mDButton != null && c(mDButton)) {
                        mDButton.a(false, false);
                        measureChild(mDButton, i, i2);
                        measuredWidth += mDButton.getMeasuredWidth();
                        z = true;
                    }
                }
                z2 = measuredWidth > size - (getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2);
            }
            this.h = z2;
            if (z2) {
                measuredHeight = 0;
                for (MDButton mDButton2 : mDButtonArr) {
                    if (mDButton2 == null && c(mDButton2)) {
                        mDButton2.a(true, false);
                        measureChild(mDButton2, i, i2);
                        measuredHeight += mDButton2.getMeasuredHeight();
                        z = true;
                    }
                }
            } else {
                measuredHeight = 0;
            }
            if (z) {
                if (this.h) {
                    measuredHeight2 = size2 - measuredHeight;
                    int i7 = this.m;
                    i3 = i7 * 2;
                    i4 = i7 * 2;
                } else {
                    measuredHeight2 = size2 - this.n;
                    i3 = this.m * 2;
                }
                if (c(this.c)) {
                    this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                    measuredHeight2 -= this.c.getMeasuredHeight();
                } else if (!this.k) {
                    i3 += this.l;
                }
                if (c(this.d)) {
                    this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i4, Integer.MIN_VALUE));
                    if (this.d.getMeasuredHeight() <= measuredHeight2 - i3) {
                        this.i = false;
                    } else if (this.j || c(this.c) || z) {
                        this.i = true;
                        measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
                    } else {
                        this.i = false;
                        measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i4);
                    }
                } else {
                    measuredHeight3 = measuredHeight2;
                }
                setMeasuredDimension(size, size2 - measuredHeight3);
            }
            i3 = this.m * 2;
            measuredHeight2 = size2;
            i4 = 0;
            if (c(this.c)) {
                this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                measuredHeight2 -= this.c.getMeasuredHeight();
            } else if (!this.k) {
                i3 += this.l;
            }
            if (c(this.d)) {
                this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i4, Integer.MIN_VALUE));
                if (this.d.getMeasuredHeight() <= measuredHeight2 - i3) {
                    this.i = false;
                } else if (this.j) {
                    this.i = true;
                    measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
                } else {
                    this.i = true;
                    measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
                }
            } else {
                measuredHeight3 = measuredHeight2;
            }
            setMeasuredDimension(size, size2 - measuredHeight3);
        }
        z2 = true;
        z = false;
        this.h = z2;
        if (z2) {
            measuredHeight = 0;
            while (i5 < r3) {
                if (mDButton2 == null) {
                }
            }
        } else {
            measuredHeight = 0;
        }
        if (z) {
            if (this.h) {
                measuredHeight2 = size2 - measuredHeight;
                int i8 = this.m;
                i3 = i8 * 2;
                i4 = i8 * 2;
            } else {
                measuredHeight2 = size2 - this.n;
                i3 = this.m * 2;
            }
            if (c(this.c)) {
                this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                measuredHeight2 -= this.c.getMeasuredHeight();
            } else if (!this.k) {
                i3 += this.l;
            }
            if (c(this.d)) {
                this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i4, Integer.MIN_VALUE));
                if (this.d.getMeasuredHeight() <= measuredHeight2 - i3) {
                    this.i = false;
                } else if (this.j) {
                    this.i = true;
                    measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
                } else {
                    this.i = true;
                    measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
                }
            } else {
                measuredHeight3 = measuredHeight2;
            }
            setMeasuredDimension(size, size2 - measuredHeight3);
        }
        i3 = this.m * 2;
        measuredHeight2 = size2;
        i4 = 0;
        if (c(this.c)) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            measuredHeight2 -= this.c.getMeasuredHeight();
        } else if (!this.k) {
            i3 += this.l;
        }
        if (c(this.d)) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i4, Integer.MIN_VALUE));
            if (this.d.getMeasuredHeight() <= measuredHeight2 - i3) {
                this.i = false;
            } else if (this.j) {
                this.i = true;
                measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
            } else {
                this.i = true;
                measuredHeight3 = measuredHeight2 - (this.d.getMeasuredHeight() + i3);
            }
        } else {
            measuredHeight3 = measuredHeight2;
        }
        setMeasuredDimension(size, size2 - measuredHeight3);
    }

    public void setButtonGravity(EnumC4885vy enumC4885vy) {
        this.o = enumC4885vy;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int iOrdinal = this.o.ordinal();
            if (iOrdinal == 0) {
                this.o = EnumC4885vy.c;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                this.o = EnumC4885vy.f5163a;
            }
        }
    }

    public void setButtonStackedGravity(EnumC4885vy enumC4885vy) {
        for (MDButton mDButton : this.f46a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(enumC4885vy);
            }
        }
    }

    public void setDividerColor(int i) {
        this.q.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public void setStackingBehavior(EnumC3590h90 enumC3590h90) {
        this.g = enumC3590h90;
        invalidate();
    }
}
