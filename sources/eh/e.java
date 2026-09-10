package eh;

import cn.a0;
import cn.d0;
import cn.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wj.r;
import xj.b0;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedHashMap f40060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedHashMap f40061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dh.d f40062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ln.c f40063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collection f40065k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Collection collection, ak.f fVar) {
        super(2, fVar);
        this.f40065k = collection;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        return new e(this.f40065k, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((a0) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0118 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013b A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x00b9, B:34:0x00c7, B:36:0x00cd, B:38:0x00ed, B:42:0x00f9, B:44:0x00fe, B:46:0x0104, B:47:0x0109, B:48:0x0112, B:50:0x0118, B:52:0x0126, B:53:0x012a, B:55:0x0130, B:57:0x0140, B:56:0x013b, B:41:0x00f4, B:58:0x0144), top: B:63:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0112 A[SYNTHETIC] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        dh.d dVar;
        ln.c cVar;
        LinkedHashMap linkedHashMap3;
        dh.d dVar2;
        ln.c cVar2;
        dh.b bVar;
        String str;
        Object linkedHashSet;
        LinkedHashMap linkedHashMapY;
        String str2;
        int iD;
        Set set;
        Set linkedHashSet2;
        ArrayList arrayList;
        Iterator it;
        dh.b bVar2;
        int i10 = this.f40064j;
        int i11 = 2;
        ak.f fVar = null;
        bk.a aVar = bk.a.f5708a;
        if (i10 == 0) {
            t9.e.z(obj);
            h hVar = h.f40075a;
            this.f40064j = 1;
            if (h.a(this) != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            t9.e.z(obj);
        } else {
            if (i10 == 2) {
                t9.e.z(obj);
                linkedHashMap = new LinkedHashMap();
                linkedHashMap2 = new LinkedHashMap();
                dVar = new dh.d();
                for (wj.f fVar2 : (List) obj) {
                    bVar = (dh.b) fVar2.f53283a;
                    str = (String) fVar2.f53284b;
                    if (str != null) {
                        linkedHashSet = linkedHashMap.get(str);
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet();
                            linkedHashMap.put(str, linkedHashSet);
                        }
                        ((Set) linkedHashSet).add(bVar.f38876a);
                    } else {
                        dVar.f38893d.add(bVar);
                    }
                    linkedHashMap2.put(bVar.f38876a, bVar);
                }
                cVar = h.f40077c;
                this.f40060f = linkedHashMap;
                this.f40061g = linkedHashMap2;
                this.f40062h = dVar;
                this.f40063i = cVar;
                this.f40064j = 3;
                if (cVar.e(this) != aVar) {
                    linkedHashMap3 = linkedHashMap;
                    dVar2 = dVar;
                    cVar2 = cVar;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = this.f40063i;
            dVar2 = this.f40062h;
            linkedHashMap2 = this.f40061g;
            linkedHashMap3 = this.f40060f;
            t9.e.z(obj);
        }
        try {
            linkedHashMapY = b0.Y(h.f40076b);
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                str2 = (String) entry.getKey();
                Set set2 = (Set) entry.getValue();
                iD = ah.c.DUPLICATES.d();
                set = (Set) linkedHashMapY.get(str2);
                if (set != null) {
                    linkedHashSet2 = n.Q0(set);
                } else {
                    linkedHashSet2 = new LinkedHashSet();
                }
                linkedHashSet2.addAll(set2);
                if (set != null && linkedHashSet2.size() >= iD) {
                    dVar2.f38890a.addAll(set);
                }
                arrayList = new ArrayList();
                it = set2.iterator();
                while (it.hasNext()) {
                    bVar2 = (dh.b) linkedHashMap2.get((String) it.next());
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
                if (linkedHashSet2.size() >= iD) {
                    dVar2.f38891b.put(str2, linkedHashSet2);
                    dVar2.f38892c.addAll(arrayList);
                } else {
                    dVar2.f38893d.addAll(arrayList);
                }
                linkedHashMapY.put(str2, linkedHashSet2);
            }
            h.f40076b = linkedHashMapY;
            return dVar2;
        } finally {
            cVar2.g(null);
        }
        int i12 = ln.i.f45615a;
        b4.b bVar3 = new b4.b(this.f40065k, new ln.h(8), fVar, i11);
        this.f40064j = 2;
        obj = d0.J(n0.f6748a, bVar3, this);
        if (obj != aVar) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2 = new LinkedHashMap();
            dVar = new dh.d();
            while (r11.hasNext()) {
                bVar = (dh.b) fVar2.f53283a;
                str = (String) fVar2.f53284b;
                if (str != null) {
                    linkedHashSet = linkedHashMap.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(str, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(bVar.f38876a);
                } else {
                    dVar.f38893d.add(bVar);
                }
                linkedHashMap2.put(bVar.f38876a, bVar);
            }
            cVar = h.f40077c;
            this.f40060f = linkedHashMap;
            this.f40061g = linkedHashMap2;
            this.f40062h = dVar;
            this.f40063i = cVar;
            this.f40064j = 3;
            if (cVar.e(this) != aVar) {
                linkedHashMap3 = linkedHashMap;
                dVar2 = dVar;
                cVar2 = cVar;
                linkedHashMapY = b0.Y(h.f40076b);
                while (r10.hasNext()) {
                    str2 = (String) entry.getKey();
                    Set set3 = (Set) entry.getValue();
                    iD = ah.c.DUPLICATES.d();
                    set = (Set) linkedHashMapY.get(str2);
                    if (set != null) {
                        linkedHashSet2 = n.Q0(set);
                    } else {
                        linkedHashSet2 = new LinkedHashSet();
                    }
                    linkedHashSet2.addAll(set3);
                    if (set != null) {
                        dVar2.f38890a.addAll(set);
                    }
                    arrayList = new ArrayList();
                    it = set3.iterator();
                    while (it.hasNext()) {
                        bVar2 = (dh.b) linkedHashMap2.get((String) it.next());
                        if (bVar2 != null) {
                            arrayList.add(bVar2);
                        }
                    }
                    if (linkedHashSet2.size() >= iD) {
                        dVar2.f38891b.put(str2, linkedHashSet2);
                        dVar2.f38892c.addAll(arrayList);
                    } else {
                        dVar2.f38893d.addAll(arrayList);
                    }
                    linkedHashMapY.put(str2, linkedHashSet2);
                }
                h.f40076b = linkedHashMapY;
                return dVar2;
            }
        }
        return aVar;
    }
}
