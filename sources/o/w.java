package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f47022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47025e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f47028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f47029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f47030j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47026f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f47031k = new v(this);

    public w(Context context, m mVar, View view, boolean z10, int i10, int i11) {
        this.f47021a = context;
        this.f47022b = mVar;
        this.f47025e = view;
        this.f47023c = z10;
        this.f47024d = i10;
    }

    public final u a() {
        u d0Var;
        if (this.f47029i == null) {
            Context context = this.f47021a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(context, this.f47025e, this.f47024d, this.f47023c);
            } else {
                d0Var = new d0(this.f47021a, this.f47022b, this.f47025e, this.f47024d, this.f47023c);
            }
            d0Var.j(this.f47022b);
            d0Var.q(this.f47031k);
            d0Var.m(this.f47025e);
            d0Var.e(this.f47028h);
            d0Var.n(this.f47027g);
            d0Var.o(this.f47026f);
            this.f47029i = d0Var;
        }
        return this.f47029i;
    }

    public final boolean b() {
        u uVar = this.f47029i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.f47029i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f47030j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        u uVarA = a();
        uVarA.r(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f47026f, this.f47025e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f47025e.getWidth();
            }
            uVarA.p(i10);
            uVarA.s(i11);
            int i12 = (int) ((this.f47021a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uVarA.f47019a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        uVarA.show();
    }
}
