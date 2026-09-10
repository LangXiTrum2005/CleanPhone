package ni;

import android.util.SparseArray;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f46734a;

    public a(c cVar) {
        this.f46734a = cVar;
    }

    @Override // ni.b
    public final void a() {
        c cVar = this.f46734a;
        Iterator it = cVar.f46757v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        n nVar = cVar.f46754s;
        SparseArray sparseArray = nVar.l;
        while (sparseArray.size() > 0) {
            nVar.f43373w.K(sparseArray.keyAt(0));
        }
        m mVar = cVar.f46755t;
        SparseArray sparseArray2 = mVar.f43344i;
        while (sparseArray2.size() > 0) {
            mVar.f43350p.K(sparseArray2.keyAt(0));
        }
        cVar.f46747k.f47793f = null;
    }

    @Override // ni.b
    public final void b() {
    }
}
