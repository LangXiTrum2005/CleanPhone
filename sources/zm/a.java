package zm;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f55094a;

    public a(i iVar) {
        this.f55094a = new AtomicReference(iVar);
    }

    @Override // zm.i
    public final Iterator iterator() {
        i iVar = (i) this.f55094a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
