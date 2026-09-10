package g6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41662a;

    public p(ArrayList arrayList) {
        this.f41662a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f41662a.iterator();
    }
}
