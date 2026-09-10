package zl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f55053b = h.f55041c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55054c;

    public final void d(k kVar) {
        x xVar;
        if (!this.f55054c) {
            this.f55053b = this.f55053b.clone();
            this.f55054c = true;
        }
        h hVar = this.f55053b;
        h hVar2 = kVar.f55066a;
        hVar.getClass();
        int i10 = 0;
        while (true) {
            xVar = hVar2.f55042a;
            if (i10 >= xVar.f55090b.size()) {
                break;
            }
            hVar.g((Map.Entry) xVar.f55090b.get(i10));
            i10++;
        }
        Iterator it = xVar.c().iterator();
        while (it.hasNext()) {
            hVar.g((Map.Entry) it.next());
        }
    }
}
