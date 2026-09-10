package m0;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f45736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f45737b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f45738c = new HashMap();

    public q(Runnable runnable) {
        this.f45736a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f45737b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.x0) ((r) it.next())).f4504a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(r rVar) {
        this.f45737b.remove(rVar);
        p pVar = (p) this.f45738c.remove(rVar);
        if (pVar != null) {
            pVar.f45734a.b(pVar.f45735b);
            pVar.f45735b = null;
        }
        this.f45736a.run();
    }
}
