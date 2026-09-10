package pm;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qm.b f48456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qm.e f48457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qm.f f48458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayDeque f48460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ym.i f48461h;

    public m0(boolean z10, boolean z11, qm.b typeSystemContext, qm.e kotlinTypePreparator, qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.n.f(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f48454a = z10;
        this.f48455b = z11;
        this.f48456c = typeSystemContext;
        this.f48457d = kotlinTypePreparator;
        this.f48458e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f48460g;
        kotlin.jvm.internal.n.c(arrayDeque);
        arrayDeque.clear();
        ym.i iVar = this.f48461h;
        kotlin.jvm.internal.n.c(iVar);
        iVar.clear();
    }

    public final void b() {
        if (this.f48460g == null) {
            this.f48460g = new ArrayDeque(4);
        }
        if (this.f48461h == null) {
            this.f48461h = new ym.i();
        }
    }

    public final a1 c(sm.c type) {
        kotlin.jvm.internal.n.f(type, "type");
        return this.f48457d.a(type);
    }

    public final y d(sm.c type) {
        kotlin.jvm.internal.n.f(type, "type");
        this.f48458e.getClass();
        return (y) type;
    }
}
