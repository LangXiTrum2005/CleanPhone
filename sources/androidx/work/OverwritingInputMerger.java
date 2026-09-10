package androidx.work;

import d5.e;
import d5.f;
import d5.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // d5.i
    public final f a(ArrayList arrayList) throws Throwable {
        e eVar = new e(0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((f) it.next()).f38691a));
        }
        eVar.a(map);
        f fVar = new f(eVar.f38688a);
        f.c(fVar);
        return fVar;
    }
}
