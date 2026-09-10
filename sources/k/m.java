package k;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import m0.s0;
import m0.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f44135b;

    public /* synthetic */ m(v vVar, int i10) {
        this.f44134a = i10;
        this.f44135b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44134a) {
            case 0:
                v vVar = this.f44135b;
                if ((vVar.Z & 1) != 0) {
                    vVar.u(0);
                }
                if ((vVar.Z & 4096) != 0) {
                    vVar.u(108);
                }
                vVar.Y = false;
                vVar.Z = 0;
                break;
            default:
                v vVar2 = this.f44135b;
                vVar2.f44183w.showAtLocation(vVar2.f44182v, 55, 0, 0);
                w0 w0Var = vVar2.f44185y;
                if (w0Var != null) {
                    w0Var.b();
                }
                if (vVar2.f44186z && (viewGroup = vVar2.A) != null && viewGroup.isLaidOut()) {
                    vVar2.f44182v.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    w0 w0VarA = s0.a(vVar2.f44182v);
                    w0VarA.a(1.0f);
                    vVar2.f44185y = w0VarA;
                    w0VarA.d(new n(this, 0));
                } else {
                    vVar2.f44182v.setAlpha(1.0f);
                    vVar2.f44182v.setVisibility(0);
                }
                break;
        }
    }
}
