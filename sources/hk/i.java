package hk;

import an.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import xj.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements zm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42397c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f42395a = i10;
        this.f42396b = obj;
        this.f42397c = obj2;
    }

    @Override // zm.i
    public final Iterator iterator() {
        switch (this.f42395a) {
            case 0:
                return new g(this);
            case 1:
                return new zm.h(this);
            default:
                r rVar = (r) this.f42396b;
                ArrayList arrayList = new ArrayList();
                Iterator it = rVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                s.Z((Comparator) this.f42397c, arrayList);
                return arrayList.iterator();
        }
    }

    public i(File start, j jVar) {
        this.f42395a = 0;
        n.f(start, "start");
        this.f42396b = start;
        this.f42397c = jVar;
    }
}
