package p1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48202b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f48201a = i10;
        this.f48202b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f48201a;
        Object obj = this.f48202b;
        switch (i10) {
            case 0:
                ((l1.w) obj).c(runnable);
                break;
            default:
                ((Handler) obj).post(runnable);
                break;
        }
    }
}
