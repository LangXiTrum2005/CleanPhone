package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements i, Serializable {
    private final int arity;

    public o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = d0.f44761a.j(this);
        n.e(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
