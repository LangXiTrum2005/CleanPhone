package rl;

import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements nm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final el.b f49643a;

    public n(el.b bVar, int i10) {
        u.n(i10, "abiStability");
        this.f49643a = bVar;
    }

    @Override // nm.i
    public final String f() {
        return "Class '" + fl.c.a(this.f49643a.f40112a).b().b() + '\'';
    }

    public final String toString() {
        return n.class.getSimpleName() + ": " + this.f49643a;
    }
}
