package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.auth.o;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import j.a;
import j1.d;
import m0.s0;
import m0.w0;
import o.a0;
import o.m;
import p.f;
import p.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f3877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f3878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f3880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f3883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f3884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f3885k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f3886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f3887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f3888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f3889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3893t;

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        d dVar = new d();
        dVar.f43584c = this;
        dVar.f43582a = false;
        this.f3875a = dVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3876b = context;
        } else {
            this.f3876b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f43520d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : o.i(context, resourceId));
        this.f3890q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3891r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3879e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f3893t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(View view, boolean z10, int i10, int i11, int i12) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(n.a aVar) {
        View view = this.f3885k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3893t, (ViewGroup) this, false);
            this.f3885k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f3885k);
        }
        View viewFindViewById = this.f3885k.findViewById(R.id.action_mode_close_button);
        this.l = viewFindViewById;
        viewFindViewById.setOnClickListener(new k.a(aVar, 1));
        m mVarF = aVar.f();
        j jVar = this.f3878d;
        if (jVar != null) {
            jVar.j();
            f fVar = jVar.f47688t;
            if (fVar != null && fVar.b()) {
                fVar.f47029i.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.f3878d = jVar2;
        jVar2.l = true;
        jVar2.f47681m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVarF.b(this.f3878d, this.f3876b);
        j jVar3 = this.f3878d;
        a0 a0Var = jVar3.f47677h;
        if (a0Var == null) {
            a0 a0Var2 = (a0) jVar3.f47673d.inflate(jVar3.f47675f, (ViewGroup) this, false);
            jVar3.f47677h = a0Var2;
            a0Var2.a(jVar3.f47672c);
            jVar3.c();
        }
        a0 a0Var3 = jVar3.f47677h;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f3877c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3877c, layoutParams);
    }

    public final void d() {
        if (this.f3887n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3887n = linearLayout;
            this.f3888o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3889p = (TextView) this.f3887n.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f3890q;
            if (i10 != 0) {
                this.f3888o.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f3891r;
            if (i11 != 0) {
                this.f3889p.setTextAppearance(getContext(), i11);
            }
        }
        this.f3888o.setText(this.f3883i);
        this.f3889p.setText(this.f3884j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3883i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3884j);
        this.f3889p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3887n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3887n.getParent() == null) {
            addView(this.f3887n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f3886m = null;
        this.f3877c = null;
        this.f3878d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f3880f != null ? this.f3875a.f43583b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3879e;
    }

    public CharSequence getSubtitle() {
        return this.f3884j;
    }

    public CharSequence getTitle() {
        return this.f3883i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            w0 w0Var = this.f3880f;
            if (w0Var != null) {
                w0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final w0 i(int i10, long j10) {
        w0 w0Var = this.f3880f;
        if (w0Var != null) {
            w0Var.b();
        }
        d dVar = this.f3875a;
        if (i10 != 0) {
            w0 w0VarA = s0.a(this);
            w0VarA.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            w0VarA.c(j10);
            ((ActionBarContextView) dVar.f43584c).f3880f = w0VarA;
            dVar.f43583b = i10;
            w0VarA.d(dVar);
            return w0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        w0 w0VarA2 = s0.a(this);
        w0VarA2.a(1.0f);
        w0VarA2.c(j10);
        ((ActionBarContextView) dVar.f43584c).f3880f = w0VarA2;
        dVar.f43583b = i10;
        w0VarA2.d(dVar);
        return w0VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f43517a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        j jVar = this.f3878d;
        if (jVar != null) {
            Configuration configuration2 = jVar.f47671b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            jVar.f47684p = i10;
            m mVar = jVar.f47672c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f3878d;
        if (jVar != null) {
            jVar.j();
            f fVar = this.f3878d.f47688t;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f47029i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3882h = false;
        }
        if (!this.f3882h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3882h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3882h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3885k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3885k.getLayoutParams();
            int i14 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z11 ? paddingRight - i14 : paddingRight + i14;
            int iG = g(this.f3885k, z11, i16, paddingTop, paddingTop2) + i16;
            paddingRight = z11 ? iG - i15 : iG + i15;
        }
        LinearLayout linearLayout = this.f3887n;
        if (linearLayout != null && this.f3886m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f3887n, z11, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f3886m;
        if (view2 != null) {
            g(view2, z11, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3877c;
        if (actionMenuView != null) {
            g(actionMenuView, !z11, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f3879e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f3885k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3885k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3877c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f3877c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f3887n;
        if (linearLayout != null && this.f3886m == null) {
            if (this.f3892s) {
                this.f3887n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3887n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f3887n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f3886m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f3886m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f3879e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3881g = false;
        }
        if (!this.f3881g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3881g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3881g = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.f3879e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3886m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3886m = view;
        if (view != null && (linearLayout = this.f3887n) != null) {
            removeView(linearLayout);
            this.f3887n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3884j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3883i = charSequence;
        d();
        s0.g(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f3892s) {
            requestLayout();
        }
        this.f3892s = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
