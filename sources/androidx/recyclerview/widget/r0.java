package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f4905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f4906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eb.d0 f4907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eb.d0 f4908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f4909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4915k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4918o;

    public r0() {
        p0 p0Var = new p0(this, 0);
        p0 p0Var2 = new p0(this, 1);
        this.f4907c = new eb.d0(p0Var);
        this.f4908d = new eb.d0(p0Var2);
        this.f4910f = false;
        this.f4911g = false;
        this.f4912h = true;
        this.f4913i = true;
    }

    public static int C(View view) {
        return ((s0) view.getLayoutParams()).f4925a.getLayoutPosition();
    }

    public static q0 D(Context context, AttributeSet attributeSet, int i10, int i11) {
        q0 q0Var = new q0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i10, i11);
        q0Var.f4892a = typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        q0Var.f4893b = typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        q0Var.f4894c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        q0Var.f4895d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return q0Var;
    }

    public static boolean H(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void I(View view, int i10, int i11, int i12, int i13) {
        s0 s0Var = (s0) view.getLayoutParams();
        Rect rect = s0Var.f4926b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) s0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) s0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) s0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) s0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(int i10, int i11, int i12, int i13, boolean z10) {
        int iMax = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public final int A() {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int E(y0 y0Var, e1 e1Var) {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView == null || recyclerView.mAdapter == null || !e()) {
            return 1;
        }
        return this.f4906b.mAdapter.getItemCount();
    }

    public final void F(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((s0) view.getLayoutParams()).f4926b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f4906b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f4906b.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean G();

    public void J(int i10) {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i10);
        }
    }

    public void K(int i10) {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i10);
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public abstract View M(View view, int i10, y0 y0Var, e1 e1Var);

    public void N(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4906b;
        y0 y0Var = recyclerView.mRecycler;
        e1 e1Var = recyclerView.mState;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f4906b.canScrollVertically(-1) && !this.f4906b.canScrollHorizontally(-1) && !this.f4906b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        g0 g0Var = this.f4906b.mAdapter;
        if (g0Var != null) {
            accessibilityEvent.setItemCount(g0Var.getItemCount());
        }
    }

    public final void O(View view, n0.e eVar) {
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        d dVar = this.f4905a;
        if (dVar.f4742c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.f4906b;
        P(recyclerView.mRecycler, recyclerView.mState, view, eVar);
    }

    public void P(y0 y0Var, e1 e1Var, View view, n0.e eVar) {
        eVar.f46334a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? C(view) : 0, 1, d() ? C(view) : 0, 1, false, false));
    }

    public abstract void V(y0 y0Var, e1 e1Var);

    public abstract void W(e1 e1Var);

    public abstract void X(Parcelable parcelable);

    public abstract Parcelable Y();

    public final void a0(y0 y0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.getChildViewHolderInt(u(iV)).shouldIgnore()) {
                View viewU = u(iV);
                d0(iV);
                y0Var.g(viewU);
            }
        }
    }

    public final void b(View view, int i10, boolean z10) {
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z10 || childViewHolderInt.isRemoved()) {
            x.e eVar = this.f4906b.mViewInfoStore.f4929a;
            q1 q1VarA = (q1) eVar.get(childViewHolderInt);
            if (q1VarA == null) {
                q1VarA = q1.a();
                eVar.put(childViewHolderInt, q1VarA);
            }
            q1VarA.f4897a |= 1;
        } else {
            this.f4906b.mViewInfoStore.c(childViewHolderInt);
        }
        s0 s0Var = (s0) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.f4905a.b(view, i10, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f4906b) {
            d dVar = this.f4905a;
            c cVar = dVar.f4741b;
            int iIndexOfChild = dVar.f4740a.f4767a.indexOfChild(view);
            int iE = (iIndexOfChild == -1 || cVar.G(iIndexOfChild)) ? -1 : iIndexOfChild - cVar.E(iIndexOfChild);
            if (i10 == -1) {
                i10 = this.f4905a.e();
            }
            if (iE == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.f4906b.indexOfChild(view));
                throw new IllegalStateException(defpackage.e.k(this.f4906b, sb2));
            }
            if (iE != i10) {
                r0 r0Var = this.f4906b.mLayout;
                View viewU = r0Var.u(iE);
                if (viewU == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iE + r0Var.f4906b.toString());
                }
                r0Var.u(iE);
                r0Var.f4905a.c(iE);
                s0 s0Var2 = (s0) viewU.getLayoutParams();
                h1 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(viewU);
                if (childViewHolderInt2.isRemoved()) {
                    x.e eVar2 = r0Var.f4906b.mViewInfoStore.f4929a;
                    q1 q1VarA2 = (q1) eVar2.get(childViewHolderInt2);
                    if (q1VarA2 == null) {
                        q1VarA2 = q1.a();
                        eVar2.put(childViewHolderInt2, q1VarA2);
                    }
                    q1VarA2.f4897a = 1 | q1VarA2.f4897a;
                } else {
                    r0Var.f4906b.mViewInfoStore.c(childViewHolderInt2);
                }
                r0Var.f4905a.b(viewU, i10, s0Var2, childViewHolderInt2.isRemoved());
            }
        } else {
            this.f4905a.a(view, i10, false);
            s0Var.f4927c = true;
            a0 a0Var = this.f4909e;
            if (a0Var != null && a0Var.f4709e && a0Var.f4706b.getChildLayoutPosition(view) == a0Var.f4705a) {
                a0Var.f4710f = view;
            }
        }
        if (s0Var.f4928d) {
            childViewHolderInt.itemView.invalidate();
            s0Var.f4928d = false;
        }
    }

    public final void b0(y0 y0Var) {
        ArrayList arrayList = y0Var.f4970a;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((h1) arrayList.get(i10)).itemView;
            h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.f4906b.removeDetachedView(view, false);
                }
                n0 n0Var = this.f4906b.mItemAnimator;
                if (n0Var != null) {
                    n0Var.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                h1 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                y0Var.h(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = y0Var.f4971b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f4906b.invalidate();
        }
    }

    public abstract void c(String str);

    public final void c0(View view, y0 y0Var) {
        d dVar = this.f4905a;
        f0 f0Var = dVar.f4740a;
        int iIndexOfChild = f0Var.f4767a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (dVar.f4741b.J(iIndexOfChild)) {
                dVar.j(view);
            }
            f0Var.b(iIndexOfChild);
        }
        y0Var.g(view);
    }

    public abstract boolean d();

    public final void d0(int i10) {
        if (u(i10) != null) {
            d dVar = this.f4905a;
            int iF = dVar.f(i10);
            f0 f0Var = dVar.f4740a;
            View childAt = f0Var.f4767a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (dVar.f4741b.J(iF)) {
                dVar.j(childAt);
            }
            f0Var.b(iF);
        }
    }

    public abstract boolean e();

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    public final boolean e0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iZ = z();
        int iB = B();
        int iA = this.f4917n - A();
        int iY = this.f4918o - y();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iZ;
        int iMin = Math.min(0, i10);
        int i11 = top - iB;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iA;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iY);
        RecyclerView recyclerView2 = this.f4906b;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iZ2 = z();
                int iB2 = B();
                int iA2 = this.f4917n - A();
                int iY2 = this.f4918o - y();
                Rect rect2 = this.f4906b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(focusedChild, rect2);
                if (rect2.left - i13 < iA2 && rect2.right - i13 > iZ2 && rect2.top - i14 < iY2 && rect2.bottom - i14 > iB2) {
                    if (i13 == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(i13, i14);
                        return true;
                    }
                    recyclerView.smoothScrollBy(i13, i14);
                    return true;
                }
            }
        } else if (i13 == 0 || i14 != 0) {
            if (z10) {
                recyclerView.scrollBy(i13, i14);
                return true;
            }
            recyclerView.smoothScrollBy(i13, i14);
            return true;
        }
        return false;
    }

    public boolean f(s0 s0Var) {
        return s0Var != null;
    }

    public final void f0() {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int g0(int i10, y0 y0Var, e1 e1Var);

    public abstract void h(int i10, int i11, e1 e1Var, q qVar);

    public abstract void h0(int i10);

    public abstract int i0(int i10, y0 y0Var, e1 e1Var);

    public abstract int j(e1 e1Var);

    public final void j0(RecyclerView recyclerView) {
        k0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int k(e1 e1Var);

    public final void k0(int i10, int i11) {
        this.f4917n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.l = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f4917n = 0;
        }
        this.f4918o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f4916m = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.f4918o = 0;
    }

    public abstract int l(e1 e1Var);

    public void l0(Rect rect, int i10, int i11) {
        int iA = A() + z() + rect.width();
        int iY = y() + B() + rect.height();
        RecyclerView recyclerView = this.f4906b;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        this.f4906b.setMeasuredDimension(g(i10, iA, recyclerView.getMinimumWidth()), g(i11, iY, this.f4906b.getMinimumHeight()));
    }

    public abstract int m(e1 e1Var);

    public final void m0(int i10, int i11) {
        int iV = v();
        if (iV == 0) {
            this.f4906b.defaultOnMeasure(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iV; i16++) {
            View viewU = u(i16);
            Rect rect = this.f4906b.mTempRect;
            RecyclerView.getDecoratedBoundsWithMarginsInt(viewU, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f4906b.mTempRect.set(i15, i13, i12, i14);
        l0(this.f4906b.mTempRect, i10, i11);
    }

    public abstract int n(e1 e1Var);

    public final void n0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f4906b = null;
            this.f4905a = null;
            this.f4917n = 0;
            this.f4918o = 0;
        } else {
            this.f4906b = recyclerView;
            this.f4905a = recyclerView.mChildHelper;
            this.f4917n = recyclerView.getWidth();
            this.f4918o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.f4916m = 1073741824;
    }

    public abstract int o(e1 e1Var);

    public final boolean o0(View view, int i10, int i11, s0 s0Var) {
        return (!view.isLayoutRequested() && this.f4912h && H(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) s0Var).width) && H(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) s0Var).height)) ? false : true;
    }

    public final void p(y0 y0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewU);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f4906b.mAdapter.hasStableIds()) {
                    u(iV);
                    this.f4905a.c(iV);
                    y0Var.i(viewU);
                    this.f4906b.mViewInfoStore.c(childViewHolderInt);
                } else {
                    d0(iV);
                    y0Var.h(childViewHolderInt);
                }
            }
        }
    }

    public boolean p0() {
        return false;
    }

    public View q(int i10) {
        int iV = v();
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewU);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f4906b.mState.f4755g || !childViewHolderInt.isRemoved())) {
                return viewU;
            }
        }
        return null;
    }

    public final boolean q0(View view, int i10, int i11, s0 s0Var) {
        return (this.f4912h && H(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) s0Var).width) && H(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) s0Var).height)) ? false : true;
    }

    public abstract s0 r();

    public abstract void r0(RecyclerView recyclerView, int i10);

    public s0 s(Context context, AttributeSet attributeSet) {
        return new s0(context, attributeSet);
    }

    public final void s0(a0 a0Var) {
        a0 a0Var2 = this.f4909e;
        if (a0Var2 != null && a0Var != a0Var2 && a0Var2.f4709e) {
            a0Var2.d();
        }
        this.f4909e = a0Var;
        RecyclerView recyclerView = this.f4906b;
        if (a0Var.f4712h) {
            Log.w("RecyclerView", "An instance of " + a0.class.getSimpleName() + " was started more than once. Each instance of" + a0.class.getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        a0Var.f4706b = recyclerView;
        a0Var.f4707c = this;
        int i10 = a0Var.f4705a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f4749a = i10;
        a0Var.f4709e = true;
        a0Var.f4708d = true;
        a0Var.f4710f = recyclerView.mLayout.q(i10);
        a0Var.f4706b.mViewFlinger.b();
        a0Var.f4712h = true;
    }

    public s0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof s0) {
            return new s0((s0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new s0((ViewGroup.MarginLayoutParams) layoutParams) : new s0(layoutParams);
    }

    public abstract boolean t0();

    public final View u(int i10) {
        d dVar = this.f4905a;
        if (dVar != null) {
            return dVar.d(i10);
        }
        return null;
    }

    public final int v() {
        d dVar = this.f4905a;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public int x(y0 y0Var, e1 e1Var) {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView == null || recyclerView.mAdapter == null || !d()) {
            return 1;
        }
        return this.f4906b.mAdapter.getItemCount();
    }

    public final int y() {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void R() {
    }

    public void Z(int i10) {
    }

    public void Q(int i10, int i11) {
    }

    public void S(int i10, int i11) {
    }

    public void T(int i10, int i11) {
    }

    public void U(int i10, int i11) {
    }

    public void i(int i10, q qVar) {
    }
}
