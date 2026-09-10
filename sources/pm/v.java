package pm;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk.b f48480a;

    public v(jk.b bVar) {
        this.f48480a = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        y it = (y) obj;
        kotlin.jvm.internal.n.e(it, "it");
        jk.b bVar = this.f48480a;
        String string = bVar.invoke(it).toString();
        y it2 = (y) obj2;
        kotlin.jvm.internal.n.e(it2, "it");
        return j1.f.h(string, bVar.invoke(it2).toString());
    }
}
