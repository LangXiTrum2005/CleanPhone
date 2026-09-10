package f2;

import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends i1.e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa.j0 f40402c;

    public l1(String str, n1 n1Var) {
        super(str, null, false, 1);
        this.f40402c = oa.j0.x(n1Var);
    }

    @Override // i1.e0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        oa.j0 j0Var = this.f40402c;
        if (j0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + j0Var;
    }
}
