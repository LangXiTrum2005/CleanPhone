package f;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40242b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40241a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f40243c = new CopyOnWriteArrayList();

    public o(boolean z10) {
        this.f40242b = z10;
    }

    public abstract void b();

    public final void e(boolean z10) {
        this.f40242b = z10;
        for (n nVar : this.f40241a) {
            nVar.b(nVar.f40240e && z10);
        }
    }

    public void a() {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }
}
