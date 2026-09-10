package ea;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.u6;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39367b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.f39366a = i10;
        this.f39367b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39366a) {
            case 0:
                j1 j1Var = ((m1) ((p2) this.f39367b).f3623a).f39588g;
                m1.h(j1Var);
                j1Var.P0(runnable);
                break;
            case 1:
                ((Handler) ((g9.k) this.f39367b).f41771c).post(runnable);
                break;
            case 2:
                ((u6) this.f39367b).post(runnable);
                break;
            default:
                ((Executor) this.f39367b).execute(new g6.a(2, runnable));
                break;
        }
    }

    public e2(Looper looper) {
        this.f39366a = 2;
        this.f39367b = new u6(looper, 3);
    }
}
