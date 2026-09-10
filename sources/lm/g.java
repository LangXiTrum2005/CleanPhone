package lm;

import java.util.Set;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f45533c = i0.k0(yl.b.j(wk.l.f53339c.g()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.j f45535b;

    public g(i iVar) {
        this.f45534a = iVar;
        this.f45535b = iVar.f45537a.c(new al.f(this, 15));
    }

    public final zk.e a(yl.b classId, d dVar) {
        kotlin.jvm.internal.n.f(classId, "classId");
        return (zk.e) this.f45535b.invoke(new f(classId, dVar));
    }
}
