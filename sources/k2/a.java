package k2;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import ta.f0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f44262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44263c;

    public /* synthetic */ a(Executor executor, Object obj, int i10) {
        this.f44261a = i10;
        this.f44262b = executor;
        this.f44263c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f44261a) {
            case 0:
                this.f44262b.execute(runnable);
                break;
            default:
                try {
                    this.f44262b.execute(runnable);
                } catch (RejectedExecutionException e10) {
                    ((f0) this.f44263c).n(e10);
                    return;
                }
                break;
        }
    }
}
