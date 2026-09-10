package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import ea.f2;
import java.util.WeakHashMap;
import m0.s0;
import m0.y0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44137b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f44136a = i10;
        this.f44137b = obj;
    }

    @Override // m0.y0, m0.x0
    public void b() {
        int i10 = this.f44136a;
        Object obj = this.f44137b;
        switch (i10) {
            case 0:
                ((m) obj).f44135b.f44182v.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f44182v.setVisibility(0);
                if (vVar.f44182v.getParent() instanceof View) {
                    View view = (View) vVar.f44182v.getParent();
                    WeakHashMap weakHashMap = s0.f45746a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // m0.x0
    public final void c() {
        int i10 = this.f44136a;
        Object obj = this.f44137b;
        switch (i10) {
            case 0:
                v vVar = ((m) obj).f44135b;
                vVar.f44182v.setAlpha(1.0f);
                vVar.f44185y.d(null);
                vVar.f44185y = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f44182v.setAlpha(1.0f);
                vVar2.f44185y.d(null);
                vVar2.f44185y = null;
                break;
            default:
                v vVar3 = (v) ((f2) obj).f39410c;
                vVar3.f44182v.setVisibility(8);
                PopupWindow popupWindow = vVar3.f44183w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f44182v.getParent() instanceof View) {
                    View view = (View) vVar3.f44182v.getParent();
                    WeakHashMap weakHashMap = s0.f45746a;
                    view.requestApplyInsets();
                }
                vVar3.f44182v.e();
                vVar3.f44185y.d(null);
                vVar3.f44185y = null;
                ViewGroup viewGroup = vVar3.A;
                WeakHashMap weakHashMap2 = s0.f45746a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
