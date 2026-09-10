package ea;

import com.google.android.gms.internal.measurement.ab;
import com.google.android.gms.internal.measurement.qc;
import com.ironsource.O6;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f39364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39365c;

    public /* synthetic */ e1(f1 f1Var, String str, int i10) {
        this.f39363a = i10;
        this.f39364b = f1Var;
        this.f39365c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f39363a) {
            case 0:
                return new ab(new e1(this.f39364b, this.f39365c, 1));
            case 1:
                f1 f1Var = this.f39364b;
                m mVar = f1Var.f39807b.f39373c;
                e4.T(mVar);
                String str = this.f39365c;
                w0 w0VarK1 = mVar.K1(str);
                HashMap map = new HashMap();
                map.put(O6.H, "android");
                map.put("package_name", str);
                ((m1) f1Var.f3623a).f39585d.M0();
                map.put("gmp_version", 161000L);
                if (w0VarK1 != null) {
                    String strO = w0VarK1.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(w0VarK1.Q()));
                    map.put("dynamite_version", Long.valueOf(w0VarK1.b()));
                }
                return map;
            default:
                eb.d0 d0Var = new eb.d0(11, this.f39364b, this.f39365c);
                qc qcVar = new qc("internal.remoteConfig", 0);
                qcVar.f23837b.put("getValue", new ab(qcVar, d0Var));
                return qcVar;
        }
    }
}
