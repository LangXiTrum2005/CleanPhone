package uc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f51998a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f51998a = taskCompletionSource;
    }

    @Override // uc.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // uc.i
    public final boolean b(vc.b bVar) {
        int i10 = bVar.f52544b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f51998a.trySetResult(bVar.f52543a);
        return true;
    }
}
