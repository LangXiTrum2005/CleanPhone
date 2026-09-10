package zm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f55104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.b f55106c;

    public f(i iVar, boolean z10, jk.b predicate) {
        kotlin.jvm.internal.n.f(predicate, "predicate");
        this.f55104a = iVar;
        this.f55105b = z10;
        this.f55106c = predicate;
    }

    @Override // zm.i
    public final Iterator iterator() {
        return new e(this);
    }
}
