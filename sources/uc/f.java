package uc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f51996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f51997b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f51996a = jVar;
        this.f51997b = taskCompletionSource;
    }

    @Override // uc.i
    public final boolean a(Exception exc) {
        this.f51997b.trySetException(exc);
        return true;
    }

    @Override // uc.i
    public final boolean b(vc.b bVar) {
        if (bVar.f52544b != 4 || this.f51996a.a(bVar)) {
            return false;
        }
        String str = bVar.f52545c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j10 = bVar.f52547e;
        long j11 = bVar.f52548f;
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            this.f51997b.setResult(new a(str, j10, j11));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
