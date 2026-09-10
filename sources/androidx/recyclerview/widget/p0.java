package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f4882b;

    public /* synthetic */ p0(r0 r0Var, int i10) {
        this.f4881a = i10;
        this.f4882b = r0Var;
    }

    public final int a(View view) {
        int right;
        int i10;
        switch (this.f4881a) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                right = view.getRight() + ((s0) view.getLayoutParams()).f4926b.right;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).rightMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                right = view.getBottom() + ((s0) view.getLayoutParams()).f4926b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    public final int b(View view) {
        int left;
        int i10;
        switch (this.f4881a) {
            case 0:
                s0 s0Var = (s0) view.getLayoutParams();
                left = view.getLeft() - ((s0) view.getLayoutParams()).f4926b.left;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var).leftMargin;
                break;
            default:
                s0 s0Var2 = (s0) view.getLayoutParams();
                left = view.getTop() - ((s0) view.getLayoutParams()).f4926b.top;
                i10 = ((ViewGroup.MarginLayoutParams) s0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    public final int c() {
        int i10;
        int iA;
        switch (this.f4881a) {
            case 0:
                r0 r0Var = this.f4882b;
                i10 = r0Var.f4917n;
                iA = r0Var.A();
                break;
            default:
                r0 r0Var2 = this.f4882b;
                i10 = r0Var2.f4918o;
                iA = r0Var2.y();
                break;
        }
        return i10 - iA;
    }

    public final int d() {
        switch (this.f4881a) {
            case 0:
                return this.f4882b.z();
            default:
                return this.f4882b.B();
        }
    }
}
