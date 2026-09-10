package zb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f54690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f54691b;

    public h(u uVar, fc.f fVar) {
        this.f54690a = uVar;
        this.f54691b = new g(fVar);
    }

    public final void a(String str) {
        g gVar = this.f54691b;
        synchronized (gVar) {
            if (!Objects.equals(gVar.f54688b, str)) {
                g.a(gVar.f54687a, str, gVar.f54689c);
                gVar.f54688b = str;
            }
        }
    }
}
