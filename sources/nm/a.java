package nm;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import qk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements al.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w[] f46803b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om.i f46804a;

    static {
        e0 e0Var = d0.f44761a;
        f46803b = new w[]{e0Var.g(new v(e0Var.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public a(om.o storageManager, jk.a aVar) {
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f46804a = new om.i((om.l) storageManager, aVar);
    }

    @Override // al.j
    public final boolean c(yl.c cVar) {
        return com.google.android.gms.internal.auth.o.r(this, cVar);
    }

    @Override // al.j
    public final al.c d(yl.c cVar) {
        return com.google.android.gms.internal.auth.o.f(this, cVar);
    }

    @Override // al.j
    public boolean isEmpty() {
        return ((List) j1.f.w(this.f46804a, f46803b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) j1.f.w(this.f46804a, f46803b[0])).iterator();
    }
}
