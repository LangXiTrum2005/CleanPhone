package lm;

import java.util.ArrayList;
import tl.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements l, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f45556b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f45557c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f45558d = new j();

    public static int d(tl.a0 a0Var) {
        int i10 = a0Var == null ? -1 : v.f45594a[a0Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 3;
            }
            if (i10 == 3) {
                return 4;
            }
            if (i10 == 4) {
                return 2;
            }
        }
        return 1;
    }

    @Override // lm.k
    public void b(zk.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // lm.l
    public pm.y c(q0 proto, String flexibleId, pm.c0 lowerBound, pm.c0 upperBound) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(flexibleId, "flexibleId");
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // lm.k
    public void a(zk.e eVar, ArrayList arrayList) {
    }
}
