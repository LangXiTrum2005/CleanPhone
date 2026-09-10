package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.unity3d.services.UnityAdsConstants;
import l1.d;
import na.g;
import o.a0;
import o.l;
import o.m;
import o.o;
import od.c;
import p.f;
import p.i;
import p.j;
import p.k;
import p.r1;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends s1 implements l, a0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f3919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f3920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f3923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f3924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p.m f3929z;

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3927x = (int) (56.0f * f10);
        this.f3928y = (int) (f10 * 4.0f);
        this.f3920q = context;
        this.f3921r = 0;
    }

    public static p.l i() {
        p.l lVar = new p.l(-2, -2);
        lVar.f47710a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static p.l j(ViewGroup.LayoutParams layoutParams) {
        p.l lVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof p.l) {
            p.l lVar2 = (p.l) layoutParams;
            lVar = new p.l(lVar2);
            lVar.f47710a = lVar2.f47710a;
        } else {
            lVar = new p.l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // o.a0
    public final void a(m mVar) {
        this.f3919p = mVar;
    }

    @Override // o.l
    public final boolean b(o oVar) {
        return this.f3919p.q(oVar, null, 0);
    }

    @Override // p.s1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.s1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ r1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // p.s1
    /* JADX INFO: renamed from: f */
    public final r1 generateLayoutParams(AttributeSet attributeSet) {
        return new p.l(getContext(), attributeSet);
    }

    @Override // p.s1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ r1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // p.s1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // p.s1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3919p == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f3919p = mVar;
            mVar.f46963e = new c(this, 26);
            j jVar = new j(context);
            this.f3923t = jVar;
            jVar.l = true;
            jVar.f47681m = true;
            jVar.f47674e = new ne.c(5);
            this.f3919p.b(jVar, this.f3920q);
            j jVar2 = this.f3923t;
            jVar2.f47677h = this;
            this.f3919p = jVar2.f47672c;
        }
        return this.f3919p;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.f3923t;
        i iVar = jVar.f47678i;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f47680k) {
            return jVar.f47679j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3921r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof k)) {
            zA = ((k) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof k)) ? zA : ((k) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.f3923t;
        if (jVar != null) {
            jVar.c();
            if (this.f3923t.k()) {
                this.f3923t.j();
                this.f3923t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f3923t;
        if (jVar != null) {
            jVar.j();
            f fVar = jVar.f47688t;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f47029i.dismiss();
        }
    }

    @Override // p.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f3925v) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                p.l lVar = (p.l) childAt.getLayoutParams();
                if (lVar.f47710a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    k(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                p.l lVar2 = (p.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f47710a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            p.l lVar3 = (p.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f47710a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = d.r(measuredWidth4, ((LinearLayout.LayoutParams) lVar3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        m mVar;
        boolean z10 = this.f3925v;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f3925v = z11;
        if (z10 != z11) {
            this.f3926w = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f3925v && (mVar = this.f3919p) != null && size != this.f3926w) {
            this.f3926w = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f3925v || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                p.l lVar = (p.l) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f3927x;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z12 = false;
        int i24 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.f3928y;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                p.l lVar2 = (p.l) childAt.getLayoutParams();
                lVar2.f47715f = false;
                lVar2.f47712c = 0;
                lVar2.f47711b = 0;
                lVar2.f47713d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f47714e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = lVar2.f47710a ? 1 : i19;
                p.l lVar3 = (p.l) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i27 <= 0 || (z14 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                lVar3.f47713d = !lVar3.f47710a && z15;
                lVar3.f47711b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (lVar2.f47713d) {
                    i24++;
                }
                if (lVar2.f47710a) {
                    z12 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j10 |= (long) (1 << i23);
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z16 = z12 && i22 == 2;
        int i32 = i30;
        boolean z17 = false;
        while (true) {
            if (i24 <= 0 || i32 <= 0) {
                i13 = iMax;
                break;
            }
            int i33 = Integer.MAX_VALUE;
            long j11 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                p.l lVar4 = (p.l) getChildAt(i35).getLayoutParams();
                boolean z18 = z16;
                if (lVar4.f47713d) {
                    int i37 = lVar4.f47711b;
                    if (i37 < i33) {
                        j11 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j11 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z16 = z18;
                iMax = i36;
            }
            i13 = iMax;
            boolean z19 = z16;
            j10 |= j11;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                p.l lVar5 = (p.l) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j12 = 1 << i39;
                if ((j11 & j12) != 0) {
                    if (z19 && lVar5.f47714e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f47711b += r11;
                    lVar5.f47715f = r11;
                    i32--;
                } else if (lVar5.f47711b == i38) {
                    j10 |= j12;
                }
                i39++;
                z12 = z20;
            }
            z16 = z19;
            iMax = i13;
            z17 = true;
        }
        boolean z21 = !z12 && i22 == 1;
        if (i32 > 0 && j10 != 0 && (i32 < i22 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j10);
            if (!z21) {
                if ((j10 & 1) != 0 && !((p.l) getChildAt(0).getLayoutParams()).f47714e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j10 & ((long) (1 << i40))) != 0 && !((p.l) getChildAt(i40).getLayoutParams()).f47714e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j10 & ((long) (1 << i42))) != 0) {
                    View childAt3 = getChildAt(i42);
                    p.l lVar6 = (p.l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f47712c = i41;
                        lVar6.f47715f = true;
                        if (i42 == 0 && !lVar6.f47714e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i41) / 2;
                        }
                        z22 = true;
                    } else if (lVar6.f47710a) {
                        lVar6.f47712c = i41;
                        lVar6.f47715f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i41) / 2;
                        z22 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                p.l lVar7 = (p.l) childAt4.getLayoutParams();
                if (lVar7.f47715f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f47711b * i31) + lVar7.f47712c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f3923t.f47685q = z10;
    }

    public void setOnMenuItemClickListener(p.m mVar) {
        this.f3929z = mVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        j jVar = this.f3923t;
        i iVar = jVar.f47678i;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.f47680k = true;
            jVar.f47679j = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f3922s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f3921r != i10) {
            this.f3921r = i10;
            if (i10 == 0) {
                this.f3920q = getContext();
            } else {
                this.f3920q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.f3923t = jVar;
        jVar.f47677h = this;
        this.f3919p = jVar.f47672c;
    }

    @Override // p.s1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.l(getContext(), attributeSet);
    }
}
