package wf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.o;
import xj.p;
import xj.t;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements eg.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec.a f53192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f53195d;

    public f(uf.b bVar) {
        int i10;
        List list;
        List list2;
        ArrayList arrayList = bVar.f52199b;
        n.e(arrayList, "getVideoDataSources(...)");
        ArrayList<jg.b> arrayList2 = bVar.f52200c;
        n.e(arrayList2, "getAudioDataSources(...)");
        ec.a aVar = new ec.a("DataSources");
        this.f53192a = aVar;
        aVar.a("initializing videoSources...");
        q(arrayList);
        aVar.a("initializing audioSources...");
        q(arrayList2);
        this.f53193b = new ArrayList();
        int i11 = 0;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = arrayList.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((jg.b) it.next()).d(vf.c.VIDEO) != null && (i10 = i10 + 1) < 0) {
                    o.U();
                    throw null;
                }
            }
        }
        v vVar = v.f53866a;
        if (i10 == 0) {
            t.a0(arrayList, this.f53193b);
            list = vVar;
        } else {
            arrayList.size();
            list = arrayList;
        }
        this.f53194c = list;
        boolean zIsEmpty = arrayList2.isEmpty();
        vf.c cVar = vf.c.AUDIO;
        if (!zIsEmpty) {
            Iterator it2 = arrayList2.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                if ((((jg.b) it2.next()).d(cVar) != null) && (i12 = i12 + 1) < 0) {
                    o.U();
                    throw null;
                }
            }
            i11 = i12;
        }
        this.f53192a.a("computing audioSources, valid=" + i11);
        if (i11 == 0) {
            t.a0(arrayList2, this.f53193b);
            list2 = vVar;
        } else if (i11 != arrayList2.size()) {
            list2 = arrayList2;
            ArrayList arrayList3 = new ArrayList(p.W(arrayList2, 10));
            for (jg.b bVar2 : arrayList2) {
                if (bVar2.d(cVar) == null) {
                    jg.a aVar2 = new jg.a(bVar2.getDurationUs());
                    this.f53193b.add(bVar2);
                    bVar2 = aVar2;
                }
                arrayList3.add(bVar2);
            }
            list2 = arrayList3;
        }
        list2 = arrayList2;
        this.f53195d = list2;
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jg.b bVar = (jg.b) it.next();
            this.f53192a.a("deinitializing " + bVar + "... (isInit=" + bVar.isInitialized() + ")");
            if (bVar.isInitialized()) {
                bVar.g();
            }
        }
    }

    @Override // eg.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List l(vf.c type) {
        n.f(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return this.f53195d;
        }
        if (iOrdinal == 1) {
            return this.f53194c;
        }
        throw new aa.b((byte) 0, 20);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return eg.a.b(this);
    }

    @Override // eg.e
    public final Object j() {
        return (List) eg.a.a(this, vf.c.VIDEO);
    }

    @Override // eg.e
    public final boolean k(vf.c type) {
        n.f(type, "type");
        return !l(type).isEmpty();
    }

    public final Object m() {
        return (List) l(vf.c.AUDIO);
    }

    @Override // eg.e
    public final Object o() {
        return (List) eg.a.a(this, vf.c.AUDIO);
    }

    public final Object p() {
        return (List) l(vf.c.VIDEO);
    }

    public final void q(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jg.b bVar = (jg.b) it.next();
            this.f53192a.a("initializing " + bVar + "... (isInit=" + bVar.isInitialized() + ")");
            if (!bVar.isInitialized()) {
                bVar.initialize();
            }
        }
    }
}
