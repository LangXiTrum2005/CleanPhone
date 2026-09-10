package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f4155a = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap f4156b = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4157c = new ArrayList();
    public final HashSet d = new HashSet();

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f4156b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
