package zm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f55107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.b f55108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.b f55109c;

    public g(i sequence, jk.b transformer, jk.b bVar) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        kotlin.jvm.internal.n.f(transformer, "transformer");
        this.f55107a = sequence;
        this.f55108b = transformer;
        this.f55109c = bVar;
    }

    @Override // zm.i
    public final Iterator iterator() {
        return new e(this);
    }
}
