package ck;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends c implements kotlin.jvm.internal.i {
    private final int arity;

    public i(int i10, ak.f fVar) {
        super(fVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // ck.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = d0.f44761a.i(this);
        n.e(strI, "renderLambdaToString(...)");
        return strI;
    }
}
