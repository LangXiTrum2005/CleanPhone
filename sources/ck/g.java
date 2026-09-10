package ck;

import ak.k;
import ak.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends a {
    public g(ak.f fVar) {
        super(fVar);
        if (fVar != null && fVar.getContext() != l.f3620a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ak.f
    public k getContext() {
        return l.f3620a;
    }
}
