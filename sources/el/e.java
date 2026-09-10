package el;

import fl.r;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import lm.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f40116b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f40117c = new e();

    @Override // lm.k
    public void a(zk.e eVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + arrayList);
    }

    @Override // lm.k
    public void b(zk.c descriptor) {
        n.f(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    public g c(pl.c javaElement) {
        n.f(javaElement, "javaElement");
        return new g((r) javaElement);
    }
}
