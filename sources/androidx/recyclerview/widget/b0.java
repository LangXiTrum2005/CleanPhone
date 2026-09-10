package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(r0 r0Var, int i10) {
        super(r0Var);
        this.f4725d = i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int b(View view) {
        int right;
        int i10;
        switch (this.f4725d) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                right = view.getRight() + ((s0) view.getLayoutParams()).f4926b.right;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).rightMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                right = view.getBottom() + ((s0) view.getLayoutParams()).f4926b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int c(View view) {
        int measuredWidth;
        int i10;
        switch (this.f4725d) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                Rect rect = ((s0) view.getLayoutParams()).f4926b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) s0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).rightMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                Rect rect2 = ((s0) view.getLayoutParams()).f4926b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) s0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int d(View view) {
        int measuredHeight;
        int i10;
        switch (this.f4725d) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                Rect rect = ((s0) view.getLayoutParams()).f4926b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) s0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).bottomMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                Rect rect2 = ((s0) view.getLayoutParams()).f4926b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) s0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int e(View view) {
        int left;
        int i10;
        switch (this.f4725d) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                left = view.getLeft() - ((s0) view.getLayoutParams()).f4926b.left;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).leftMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                ((r0) this.f4731b).getClass();
                left = view.getTop() - ((s0) view.getLayoutParams()).f4926b.top;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int f() {
        switch (this.f4725d) {
            case 0:
                return ((r0) this.f4731b).f4917n;
            default:
                return ((r0) this.f4731b).f4918o;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int g() {
        int i10;
        int iA;
        switch (this.f4725d) {
            case 0:
                r0 r0Var = (r0) this.f4731b;
                i10 = r0Var.f4917n;
                iA = r0Var.A();
                break;
            default:
                r0 r0Var2 = (r0) this.f4731b;
                i10 = r0Var2.f4918o;
                iA = r0Var2.y();
                break;
        }
        return i10 - iA;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int h() {
        switch (this.f4725d) {
            case 0:
                return ((r0) this.f4731b).A();
            default:
                return ((r0) this.f4731b).y();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i() {
        switch (this.f4725d) {
            case 0:
                return ((r0) this.f4731b).l;
            default:
                return ((r0) this.f4731b).f4916m;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int j() {
        switch (this.f4725d) {
            case 0:
                return ((r0) this.f4731b).f4916m;
            default:
                return ((r0) this.f4731b).l;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int k() {
        switch (this.f4725d) {
            case 0:
                return ((r0) this.f4731b).z();
            default:
                return ((r0) this.f4731b).B();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l() {
        int iZ;
        int iA;
        switch (this.f4725d) {
            case 0:
                r0 r0Var = (r0) this.f4731b;
                iZ = r0Var.f4917n - r0Var.z();
                iA = r0Var.A();
                break;
            default:
                r0 r0Var2 = (r0) this.f4731b;
                iZ = r0Var2.f4918o - r0Var2.B();
                iA = r0Var2.y();
                break;
        }
        return iZ - iA;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int m(View view) {
        switch (this.f4725d) {
            case 0:
                r0 r0Var = (r0) this.f4731b;
                Rect rect = (Rect) this.f4732c;
                r0Var.F(view, rect);
                return rect.right;
            default:
                r0 r0Var2 = (r0) this.f4731b;
                Rect rect2 = (Rect) this.f4732c;
                r0Var2.F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n(View view) {
        switch (this.f4725d) {
            case 0:
                r0 r0Var = (r0) this.f4731b;
                Rect rect = (Rect) this.f4732c;
                r0Var.F(view, rect);
                return rect.left;
            default:
                r0 r0Var2 = (r0) this.f4731b;
                Rect rect2 = (Rect) this.f4732c;
                r0Var2.F(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void o(int i10) {
        switch (this.f4725d) {
            case 0:
                ((r0) this.f4731b).J(i10);
                break;
            default:
                ((r0) this.f4731b).K(i10);
                break;
        }
    }
}
