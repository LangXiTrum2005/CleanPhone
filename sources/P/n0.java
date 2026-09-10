package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends a2 implements p0 {
    public k0 A;
    public final Rect B;
    public int C;
    public final /* synthetic */ q0 D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f47728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.D = q0Var;
        this.B = new Rect();
        this.f47607o = q0Var;
        this.f47616x = true;
        this.f47617y.setFocusable(true);
        this.f47608p = new l0(this);
    }

    @Override // p.p0
    public final CharSequence d() {
        return this.f47728z;
    }

    @Override // p.p0
    public final void f(CharSequence charSequence) {
        this.f47728z = charSequence;
    }

    @Override // p.p0
    public final void h(int i10) {
        this.C = i10;
    }

    @Override // p.p0
    public final void i(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        a0 a0Var = this.f47617y;
        boolean zIsShowing = a0Var.isShowing();
        p();
        a0Var.setInputMethodMode(2);
        show();
        n1 n1Var = this.f47596c;
        n1Var.setChoiceMode(1);
        n1Var.setTextDirection(i10);
        n1Var.setTextAlignment(i11);
        q0 q0Var = this.D;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        n1 n1Var2 = this.f47596c;
        if (a0Var.isShowing() && n1Var2 != null) {
            n1Var2.setListSelectionHidden(false);
            n1Var2.setSelection(selectedItemPosition);
            if (n1Var2.getChoiceMode() != 0) {
                n1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = q0Var.getViewTreeObserver()) == null) {
            return;
        }
        o.d dVar = new o.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        a0Var.setOnDismissListener(new m0(this, dVar));
    }

    @Override // p.a2, p.p0
    public final void k(ListAdapter listAdapter) {
        super.k(listAdapter);
        this.A = (k0) listAdapter;
    }

    public final void p() {
        int i10;
        q0 q0Var = this.D;
        Rect rect = q0Var.f47772h;
        a0 a0Var = this.f47617y;
        Drawable background = a0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = q0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.f47771g;
        if (i11 == -2) {
            int iA = q0Var.a(this.A, a0Var.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i12) {
                iA = i12;
            }
            o(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            o((width - paddingLeft) - paddingRight);
        } else {
            o(i11);
        }
        this.f47599f = q0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f47598e) - this.C) + i10 : paddingLeft + this.C + i10;
    }
}
