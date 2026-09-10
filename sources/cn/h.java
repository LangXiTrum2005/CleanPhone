package cn;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6717b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f6716a = i10;
        this.f6717b = obj;
    }

    @Override // cn.i
    public final void a(Throwable th2) {
        switch (this.f6716a) {
            case 0:
                ((ScheduledFuture) this.f6717b).cancel(false);
                break;
            case 1:
                ((jk.b) this.f6717b).invoke(th2);
                break;
            default:
                ((p0) this.f6717b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f6716a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f6717b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((jk.b) this.f6717b).getClass().getSimpleName() + '@' + d0.q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f6717b) + ']';
        }
    }
}
