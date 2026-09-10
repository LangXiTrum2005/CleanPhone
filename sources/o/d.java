package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.f2;
import p.n0;
import p.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46895b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f46894a = i10;
        this.f46895b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f46894a) {
            case 0:
                g gVar = (g) this.f46895b;
                ArrayList arrayList = gVar.f46926h;
                if (gVar.a() && arrayList.size() > 0 && !((f) arrayList.get(0)).f46917a.f47616x) {
                    View view = gVar.f46932o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).f46917a.show();
                        }
                    } else {
                        gVar.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                d0 d0Var = (d0) this.f46895b;
                f2 f2Var = d0Var.f46902h;
                if (d0Var.a() && !f2Var.f47616x) {
                    View view2 = d0Var.f46906m;
                    if (view2 != null && view2.isShown()) {
                        f2Var.show();
                    } else {
                        d0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                q0 q0Var = (q0) this.f46895b;
                if (!q0Var.getInternalPopup().a()) {
                    q0Var.f47770f.i(q0Var.getTextDirection(), q0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                n0 n0Var = (n0) this.f46895b;
                q0 q0Var2 = n0Var.D;
                n0Var.getClass();
                if (q0Var2.isAttachedToWindow() && q0Var2.getGlobalVisibleRect(n0Var.B)) {
                    n0Var.p();
                    n0Var.show();
                } else {
                    n0Var.dismiss();
                }
                break;
        }
    }
}
