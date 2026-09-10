package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static d0 a(long j10, Object obj) {
        d0 d0Var = (d0) q1.f4157c.h(j10, obj);
        if (((b) d0Var).f4053a) {
            return d0Var;
        }
        int size = d0Var.size();
        b1 b1VarM = ((b1) d0Var).m(size == 0 ? 10 : size * 2);
        q1.o(obj, j10, b1VarM);
        return b1VarM;
    }
}
