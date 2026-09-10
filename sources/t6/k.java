package t6;

import a7.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f50546a;

    public k(l lVar) {
        this.f50546a = lVar;
    }

    @Override // t6.a
    public final void a(boolean z10) {
        ArrayList arrayList;
        p.a();
        synchronized (this.f50546a) {
            arrayList = new ArrayList((HashSet) this.f50546a.f50551d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }
}
