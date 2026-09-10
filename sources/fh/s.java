package fh;

import android.os.PowerManager;
import cn.d0;
import ea.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.c0;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements sg.c, xi.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static xi.g f40912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f40913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f40914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f40915f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ch.c f40917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bf.b f40918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bf.b f40919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LinkedHashSet f40920k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f40910a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ln.c f40911b = new ln.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sg.b f40916g = new sg.b();

    static {
        ConcurrentHashMap concurrentHashMap = ch.f.f6431a;
        f40917h = ch.f.a(ch.e.f6425d);
        f40918i = new bf.b(xj.w.f53867a);
        f40919j = new bf.b(xj.v.f53866a);
        f40920k = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[PHI: r7 r8
  0x00a1: PHI (r7v3 boolean) = (r7v2 boolean), (r7v9 boolean) binds: [B:33:0x009e, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r8v12 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:33:0x009e, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (cn.d0.J(cn.n0.f6748a, r1, r0) == r6) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(boolean r7, ck.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof fh.c
            if (r0 == 0) goto L13
            r0 = r8
            fh.c r0 = (fh.c) r0
            int r1 = r0.f40841h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40841h = r1
            goto L18
        L13:
            fh.c r0 = new fh.c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40840g
            int r1 = r0.f40841h
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            bk.a r6 = bk.a.f5708a
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L45
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            t9.e.z(r8)
            goto Lb7
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            boolean r7 = r0.f40839f
            t9.e.z(r8)
            goto La1
        L3f:
            boolean r7 = r0.f40839f
            t9.e.z(r8)
            goto L76
        L45:
            boolean r7 = r0.f40839f
            t9.e.z(r8)
            goto L69
        L4b:
            t9.e.z(r8)
            bf.b r8 = fh.s.f40918i
            java.lang.Object r8 = com.bumptech.glide.d.K(r8)
            java.util.Map r8 = (java.util.Map) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L69
            fh.v r8 = fh.v.f40930a
            r0.f40839f = r7
            r0.f40841h = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r6) goto L69
            goto Lb6
        L69:
            r0.f40839f = r7
            r0.f40841h = r4
            fh.s r8 = fh.s.f40910a
            java.lang.Object r8 = r8.l(r7, r0)
            if (r8 != r6) goto L76
            goto Lb6
        L76:
            eh.k r8 = eh.k.f40087a
            r0.f40839f = r7
            r0.f40841h = r3
            fd.b r1 = ah.d.f3598b
            r1.getClass()
            boolean r1 = go.c.f42027a
            if (r1 == 0) goto L8c
            dk.a r1 = ah.d.f3604h
            java.util.List r1 = xj.n.N0(r1)
            goto L9a
        L8c:
            ah.d r1 = ah.d.SCREENSHOT
            ah.d r3 = ah.d.VIDEO
            ah.d r4 = ah.d.IMAGE
            ah.d[] r1 = new ah.d[]{r4, r1, r3}
            java.util.List r1 = xj.o.Q(r1)
        L9a:
            java.lang.Object r8 = r8.e(r1, r0)
            if (r8 != r6) goto La1
            goto Lb6
        La1:
            java.util.Map r8 = (java.util.Map) r8
            fh.d r1 = new fh.d
            r3 = 0
            r4 = 0
            r1.<init>(r8, r4, r3)
            r0.f40839f = r7
            r0.f40841h = r2
            jn.e r7 = cn.n0.f6748a
            java.lang.Object r7 = cn.d0.J(r7, r1, r0)
            if (r7 != r6) goto Lb7
        Lb6:
            return r6
        Lb7:
            wj.r r7 = wj.r.f53297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.a(boolean, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    public static final Object b(Map map, ck.c cVar) {
        h hVar;
        Object obj;
        boolean z10;
        char c4;
        ah.c cVar2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f40865g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f40865g = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(cVar);
            }
        } else {
            hVar = new h(cVar);
        }
        Object objN = hVar.f40864f;
        int i11 = hVar.f40865g;
        char c5 = '\n';
        bf.b bVar = f40919j;
        int i12 = 1;
        if (i11 == 0) {
            t9.e.z(objN);
            ArrayList arrayListX = xj.p.X(map.values());
            wj.f fVarK = k(arrayListX);
            while (true) {
                obj = fVarK.f53283a;
                Set set = (Set) fVarK.f53284b;
                if (set.isEmpty()) {
                    z10 = false;
                } else {
                    wj.f fVarE = com.bumptech.glide.c.e((List) com.bumptech.glide.d.K(bVar), set);
                    Object obj2 = fVarE.f53284b;
                    Iterable iterable = (Iterable) obj2;
                    ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dh.b) it.next()).f38876a);
                    }
                    Set setS0 = xj.n.S0(set, arrayList);
                    LinkedHashMap linkedHashMapY = b0.Y((Map) com.bumptech.glide.d.K(f40918i));
                    Iterator it2 = setS0.iterator();
                    while (it2.hasNext()) {
                        linkedHashMapY.remove(it2.next());
                    }
                    v vVar = v.f40930a;
                    v.c(linkedHashMapY, (List) fVarE.f53283a);
                    z10 = !((Collection) obj2).isEmpty();
                }
                if (!z10) {
                    break;
                }
                fVarK = k(arrayListX);
            }
            if (((Collection) obj).isEmpty()) {
                j();
            } else {
                hVar.f40865g = 1;
                objN = f40910a.n((List) obj, hVar);
                bk.a aVar = bk.a.f5708a;
                if (objN == aVar) {
                    return aVar;
                }
            }
            return wj.r.f53297a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(objN);
        List list = (List) objN;
        kotlin.jvm.internal.n.f(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fd.b bVar2 = ah.d.f3598b;
        bVar2.getClass();
        for (ah.d dVar : go.c.f42027a ? xj.n.N0(ah.d.f3604h) : xj.o.Q(ah.d.IMAGE, ah.d.SCREENSHOT, ah.d.VIDEO)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (((dh.b) obj3).f38877b == dVar) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                linkedHashMap.put(dVar, arrayList2);
            }
        }
        f.q qVar = new f.q(list, i12);
        sg.b bVar3 = f40916g;
        bVar3.getClass();
        bVar3.f50241b = qVar;
        bVar3.a();
        for (ah.d dVar2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(dVar2);
            if (list2 != null && !list2.isEmpty()) {
                int iOrdinal = dVar2.ordinal();
                int i13 = 2;
                ak.f fVar = null;
                if (iOrdinal != 0) {
                    ch.c cVar3 = f40917h;
                    if (iOrdinal == 1) {
                        bVar2.getClass();
                        if (go.c.f42027a) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list2) {
                                if (((dh.b) obj4).f38877b != ah.d.SCREEN_RECORDING) {
                                    arrayList3.add(obj4);
                                }
                            }
                            list2 = arrayList3;
                        }
                        if (!list2.isEmpty()) {
                            cVar3.a(new a(list2, fVar, i12));
                        }
                        Set setR0 = xj.n.R0(list2);
                        Iterable iterable2 = (Iterable) com.bumptech.glide.d.K(bVar);
                        ArrayList<dh.a> arrayList4 = new ArrayList();
                        Iterator it3 = iterable2.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            cVar2 = ah.c.VIDEOS;
                            if (!zHasNext) {
                                break;
                            }
                            Object next = it3.next();
                            if (((dh.a) next).f38870b == cVar2) {
                                arrayList4.add(next);
                            }
                        }
                        for (dh.a aVar2 : arrayList4) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : setR0) {
                                if (!aVar2.f38871c.contains((dh.b) obj5)) {
                                    arrayList5.add(obj5);
                                }
                            }
                            setR0 = xj.n.Q0(arrayList5);
                        }
                        ArrayList arrayListO0 = xj.n.O0((Collection) com.bumptech.glide.d.K(bVar));
                        c4 = '\n';
                        ArrayList arrayList6 = new ArrayList(xj.p.W(setR0, 10));
                        Iterator it4 = setR0.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(new dh.a(cVar2, xj.o.S((dh.b) it4.next())));
                        }
                        arrayListO0.addAll(arrayList6);
                        bVar.a(arrayListO0);
                        v vVar2 = v.f40930a;
                        v.b();
                    } else {
                        if (iOrdinal != 2) {
                            int i14 = 3;
                            if (iOrdinal != 3) {
                                throw new aa.b((byte) 0, 20);
                            }
                            bVar2.getClass();
                            if (go.c.f42027a) {
                                c0 c0Var = new c0();
                                Set setR1 = xj.n.R0(list2);
                                c0Var.f44760a = setR1;
                                if (!setR1.isEmpty()) {
                                    Iterable iterable3 = (Iterable) com.bumptech.glide.d.K(bVar);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj6 : iterable3) {
                                        if (((dh.a) obj6).f38870b == ah.c.SIMILAR_SCREEN_RECORDINGS) {
                                            arrayList7.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        xj.t.a0(((dh.a) it5.next()).f38871c, arrayList8);
                                    }
                                    c0Var.f44760a = xj.n.J0((Iterable) c0Var.f44760a, xj.n.R0(arrayList8));
                                    cVar3.a(new b4.a(c0Var, fVar, i14));
                                    c4 = '\n';
                                }
                            }
                            return wj.r.f53297a;
                        }
                        c4 = c5;
                        bVar3.a();
                        android.support.v4.media.session.a.A(new b4.c(list2, dVar2, fVar, i13));
                    }
                } else {
                    c4 = c5;
                    bVar3.a();
                    android.support.v4.media.session.a.A(new b4.c(list2, dVar2, fVar, i13));
                }
                c5 = c4;
            }
        }
        bVar3.b();
        return wj.r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r8.e(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(ah.d r8, ck.c r9, java.util.List r10) {
        /*
            boolean r0 = r9 instanceof fh.k
            if (r0 == 0) goto L13
            r0 = r9
            fh.k r0 = (fh.k) r0
            int r1 = r0.f40881j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40881j = r1
            goto L18
        L13:
            fh.k r0 = new fh.k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f40880i
            int r1 = r0.f40881j
            sg.b r2 = fh.s.f40916g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L46
            if (r1 == r4) goto L39
            if (r1 != r3) goto L31
            ln.c r8 = r0.f40879h
            java.util.Iterator r10 = r0.f40878g
            ln.a r10 = (ln.a) r10
            t9.e.z(r9)
            goto L86
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ln.c r8 = r0.f40879h
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r0.f40878g
            ah.d r10 = r0.f40877f
            t9.e.z(r9)
            r9 = r10
            goto L50
        L46:
            t9.e.z(r9)
            java.util.Iterator r9 = r10.iterator()
            r7 = r9
            r9 = r8
            r8 = r7
        L50:
            boolean r10 = r8.hasNext()
            bk.a r1 = bk.a.f5708a
            if (r10 == 0) goto L6f
            java.lang.Object r10 = r8.next()
            java.util.List r10 = (java.util.List) r10
            r0.f40877f = r9
            r0.f40878g = r8
            r0.f40879h = r5
            r0.f40881j = r4
            fh.s r6 = fh.s.f40910a
            java.lang.Object r10 = r6.p(r9, r0, r10)
            if (r10 != r1) goto L50
            goto L85
        L6f:
            ln.c r8 = fh.s.f40911b
            if (r8 != 0) goto L77
            r2.b()
            goto L8c
        L77:
            r0.f40877f = r5
            r0.f40878g = r5
            r0.f40879h = r8
            r0.f40881j = r3
            java.lang.Object r9 = r8.e(r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            r2.b()     // Catch: java.lang.Throwable -> L8f
            r8.g(r5)
        L8c:
            wj.r r8 = wj.r.f53297a
            return r8
        L8f:
            r9 = move-exception
            r8.g(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.c(ah.d, ck.c, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6 A[PHI: r9 r10
  0x00c6: PHI (r9v4 java.util.Iterator) = (r9v5 java.util.Iterator), (r9v7 java.util.Iterator) binds: [B:39:0x00c3, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v5 java.lang.Object) = (r10v15 java.lang.Object), (r10v1 java.lang.Object) binds: [B:39:0x00c3, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[PHI: r9
  PHI (r9v5 java.util.Iterator) = (r9v3 java.util.Iterator), (r9v4 java.util.Iterator), (r9v9 java.util.Iterator) binds: [B:27:0x0074, B:42:0x00d2, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d2 -> B:28:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(java.util.Set r9, ck.c r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.d(java.util.Set, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8 A[PHI: r9 r10
  0x00c8: PHI (r9v5 java.util.Iterator) = (r9v6 java.util.Iterator), (r9v8 java.util.Iterator) binds: [B:39:0x00c5, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r10v5 java.lang.Object) = (r10v15 java.lang.Object), (r10v1 java.lang.Object) binds: [B:39:0x00c5, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[PHI: r9
  PHI (r9v6 java.util.Iterator) = (r9v4 java.util.Iterator), (r9v5 java.util.Iterator), (r9v10 java.util.Iterator) binds: [B:27:0x0076, B:42:0x00d4, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d4 -> B:28:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(java.util.List r9, ck.c r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.e(java.util.List, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(List list, ck.c cVar) throws Throwable {
        o oVar;
        ln.c cVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f40897i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f40897i = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(cVar);
            }
        } else {
            oVar = new o(cVar);
        }
        Object obj = oVar.f40896h;
        int i11 = oVar.f40897i;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                cVar2 = f40911b;
                if (cVar2 == null) {
                    j();
                    v(list);
                } else {
                    oVar.f40894f = list;
                    oVar.f40895g = cVar2;
                    oVar.f40897i = 1;
                    Object objE = cVar2.e(oVar);
                    bk.a aVar = bk.a.f5708a;
                    if (objE == aVar) {
                        return aVar;
                    }
                }
                return wj.r.f53297a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = oVar.f40895g;
            List list2 = oVar.f40894f;
            t9.e.z(obj);
            cVar2 = cVar3;
            list = list2;
            j();
            v(list);
            return wj.r.f53297a;
        } finally {
            cVar2.g(null);
        }
    }

    public static Set i() {
        Set setR0;
        LinkedHashSet linkedHashSet = f40920k;
        synchronized (linkedHashSet) {
            setR0 = xj.n.R0(linkedHashSet);
        }
        return setR0;
    }

    public static void j() {
        ak.f fVar;
        f40913d = false;
        synchronized (ch.g.f6432a) {
            try {
                PowerManager.WakeLock wakeLock = ch.g.f6433b;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                fVar = null;
                ch.g.f6433b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        android.support.v4.media.session.a.B(new b(2, fVar, 0));
    }

    public static wj.f k(ArrayList arrayList) {
        Map map = (Map) com.bumptech.glide.d.K(f40918i);
        Set setR0 = xj.n.R0(map.keySet());
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((dh.b) it.next()).f38876a);
        }
        Set setR1 = xj.n.R0(arrayList2);
        Set setJ0 = xj.n.J0(setR1, setR0);
        Set setQ0 = xj.n.Q0(xj.n.J0(setR0, setR1));
        ArrayList arrayList3 = new ArrayList();
        dk.a aVar = ah.d.f3604h;
        int iO = b0.O(xj.p.W(aVar, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : aVar) {
            linkedHashMap.put(obj, 0);
        }
        LinkedHashMap linkedHashMapY = b0.Y(linkedHashMap);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dh.b bVar = (dh.b) it2.next();
            String str = bVar.f38876a;
            ah.d dVar = bVar.f38877b;
            if (setJ0.contains(str)) {
                arrayList3.add(bVar);
                Integer num = (Integer) linkedHashMapY.get(dVar);
                linkedHashMapY.put(dVar, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            } else {
                dh.b bVar2 = (dh.b) map.get(str);
                if (!kotlin.jvm.internal.n.a(bVar2 != null ? bVar2.f38883h : null, bVar.f38883h)) {
                    arrayList3.add(bVar);
                    Integer num2 = (Integer) linkedHashMapY.get(dVar);
                    linkedHashMapY.put(dVar, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                    setQ0.add(str);
                }
            }
        }
        return new wj.f(arrayList3, setQ0);
    }

    public static List t(f2 result, ah.d type, List list) {
        ah.c cVar;
        ah.c cVar2;
        kotlin.jvm.internal.n.f(result, "result");
        ArrayList arrayList = (ArrayList) result.f39410c;
        kotlin.jvm.internal.n.f(type, "type");
        ArrayList arrayListO0 = xj.n.O0(list);
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            cVar = ah.c.SIMILAR;
        } else if (iOrdinal == 1) {
            cVar = ah.c.SIMILAR_VIDEOS;
        } else if (iOrdinal == 2) {
            cVar = ah.c.SIMILAR_SCREENSHOTS;
        } else {
            if (iOrdinal != 3) {
                throw new aa.b((byte) 0, 20);
            }
            cVar = ah.c.SIMILAR_SCREEN_RECORDINGS;
        }
        int iOrdinal2 = type.ordinal();
        if (iOrdinal2 == 0) {
            cVar2 = ah.c.OTHER;
        } else if (iOrdinal2 == 1) {
            cVar2 = ah.c.VIDEOS;
        } else if (iOrdinal2 == 2) {
            cVar2 = ah.c.OTHER_SCREENSHOTS;
        } else {
            if (iOrdinal2 != 3) {
                throw new aa.b((byte) 0, 20);
            }
            cVar2 = ah.c.OTHER_SCREEN_RECORDINGS;
        }
        ArrayList arrayList2 = (ArrayList) result.f39409b;
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new dh.a(cVar, xj.n.O0((List) it.next())));
        }
        arrayListO0.addAll(0, arrayList3);
        LinkedHashMap linkedHashMap = eh.k.f40088b;
        ArrayList<dh.b> arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            if (linkedHashMap.get(((dh.b) obj).f38876a) != null) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList(xj.p.W(arrayList4, 10));
        for (dh.b bVar : arrayList4) {
            bVar.l = (ah.a) linkedHashMap.get(bVar.f38876a);
            arrayList5.add(bVar);
        }
        ArrayList arrayList6 = new ArrayList(xj.p.W(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((dh.b) it2.next()).f38876a);
        }
        HashSet hashSetM0 = xj.n.M0(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!hashSetM0.contains(((dh.b) obj2).f38876a)) {
                arrayList7.add(obj2);
            }
        }
        arrayListO0.add(0, new dh.a(cVar2, xj.n.O0(arrayList7)));
        arrayListO0.add(0, new dh.a(ah.c.CHAT_PHOTOS, xj.n.O0(arrayList5)));
        return xj.n.I0(arrayListO0, new ae.l(3));
    }

    public static List u(f2 f2Var, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (List list2 : (ArrayList) f2Var.f39409b) {
            dh.b bVar = (dh.b) xj.n.q0(list2);
            if (bVar != null) {
                int iOrdinal = bVar.f38877b.ordinal();
                if (iOrdinal == 0) {
                    arrayList2.add(list2);
                } else if (iOrdinal == 1) {
                    continue;
                } else if (iOrdinal == 2) {
                    arrayList.add(list2);
                } else {
                    if (iOrdinal != 3) {
                        throw new aa.b((byte) 0, 20);
                    }
                    arrayList3.add(list2);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (dh.b bVar2 : (ArrayList) f2Var.f39410c) {
            int iOrdinal2 = bVar2.f38877b.ordinal();
            if (iOrdinal2 == 0) {
                arrayList5.add(bVar2);
            } else if (iOrdinal2 == 1) {
                arrayList6.add(bVar2);
            } else if (iOrdinal2 == 2) {
                arrayList4.add(bVar2);
            } else {
                if (iOrdinal2 != 3) {
                    throw new aa.b((byte) 0, 20);
                }
                arrayList7.add(bVar2);
            }
        }
        if (list == null) {
            list = (List) com.bumptech.glide.d.K(f40919j);
        }
        if (!arrayList2.isEmpty() || !arrayList5.isEmpty()) {
            list = t(new f2(arrayList2, arrayList5), ah.d.IMAGE, list);
        }
        if (!arrayList.isEmpty() || !arrayList4.isEmpty()) {
            list = t(new f2(arrayList, arrayList4), ah.d.SCREENSHOT, list);
        }
        if (!arrayList3.isEmpty() || !arrayList7.isEmpty()) {
            list = t(new f2(arrayList3, arrayList7), ah.d.SCREEN_RECORDING, list);
        }
        return !arrayList6.isEmpty() ? t(new f2(xj.v.f53866a, arrayList6), ah.d.VIDEO, list) : list;
    }

    public static void v(List list) throws Throwable {
        ak.f fVar;
        Object next;
        Iterator it = list.iterator();
        do {
            fVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dh.b) next).f38877b == ah.d.VIDEO);
        dh.b bVar = (dh.b) next;
        if (bVar != null) {
            Date date = bVar.f38882g;
            int i10 = 2;
            b bVar2 = new b(i10, fVar, 1);
            ak.l lVar = ak.l.f3620a;
            if (((Date) d0.C(lVar, bVar2)) == null) {
                d0.C(ak.l.f3620a, new b4.a(date, fVar, 4));
                return;
            }
            Date date2 = (Date) d0.C(lVar, new b(i10, fVar, 1));
            if (date2 == null || date.compareTo(date2) <= 0) {
                return;
            }
            d0.C(ak.l.f3620a, new b4.a(date, fVar, 4));
        }
    }

    @Override // xi.h
    public final void g(xi.g gVar) {
        f40912c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r3.c(r6, r0) == r5) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v6, types: [ln.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(boolean r9, ck.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fh.e
            if (r0 == 0) goto L13
            r0 = r10
            fh.e r0 = (fh.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            fh.e r0 = new fh.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r8 = r0.f40849j
            int r10 = r0.l
            wj.r r1 = wj.r.f53297a
            r2 = 2
            r3 = 1
            r4 = 0
            bk.a r5 = bk.a.f5708a
            if (r10 == 0) goto L49
            if (r10 == r3) goto L3b
            if (r10 != r2) goto L33
            ln.a r9 = r0.f40847h
            t9.e.z(r8)     // Catch: java.lang.Throwable -> L30
            goto La2
        L30:
            r8 = move-exception
            goto La8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            int r9 = r0.f40848i
            boolean r10 = r0.f40845f
            ln.a r3 = r0.f40847h
            java.util.Set r6 = r0.f40846g
            t9.e.z(r8)
            r8 = r9
            r9 = r3
            goto L8f
        L49:
            t9.e.z(r8)
            if (r9 != 0) goto L4f
            return r1
        L4f:
            bf.b r8 = fh.s.f40918i
            java.lang.Object r8 = com.bumptech.glide.d.K(r8)
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r8 = r8.entrySet()
            an.r r8 = xj.n.g0(r8)
            bh.a r10 = new bh.a
            r6 = 6
            r10.<init>(r6)
            zm.f r8 = zm.l.P(r8, r10)
            bh.a r10 = new bh.a
            r6 = 7
            r10.<init>(r6)
            zm.s r8 = zm.l.U(r8, r10)
            java.util.Set r6 = zm.l.X(r8)
            r0.f40846g = r6
            ln.c r8 = fh.s.f40911b
            r0.f40847h = r8
            r0.f40845f = r9
            r10 = 0
            r0.f40848i = r10
            r0.l = r3
            java.lang.Object r3 = r8.e(r0)
            if (r3 != r5) goto L8b
            goto La1
        L8b:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
        L8f:
            fh.z r3 = fh.z.f40950a     // Catch: java.lang.Throwable -> L30
            r0.f40846g = r4     // Catch: java.lang.Throwable -> L30
            r0.f40847h = r9     // Catch: java.lang.Throwable -> L30
            r0.f40845f = r10     // Catch: java.lang.Throwable -> L30
            r0.f40848i = r8     // Catch: java.lang.Throwable -> L30
            r0.l = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r3.c(r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r5) goto La2
        La1:
            return r5
        La2:
            ln.c r9 = (ln.c) r9
            r9.g(r4)
            return r1
        La8:
            ln.c r9 = (ln.c) r9
            r9.g(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.l(boolean, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(List list, dh.d dVar, ck.c cVar) {
        f fVar;
        List list2;
        dh.d dVar2;
        LinkedHashMap linkedHashMap;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f40856k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f40856k = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f40854i;
        int i11 = fVar.f40856k;
        if (i11 == 0) {
            t9.e.z(obj);
            LinkedHashMap linkedHashMapY = b0.Y((Map) com.bumptech.glide.d.K(f40918i));
            List<dh.b> list3 = dVar.f38892c;
            kotlin.jvm.internal.n.f(list3, "<this>");
            ArrayList<wj.f> arrayList = new ArrayList(xj.p.W(list3, 10));
            for (dh.b bVar : list3) {
                arrayList.add(new wj.f(bVar.f38876a, bVar));
            }
            for (wj.f fVar2 : arrayList) {
                linkedHashMapY.put(fVar2.f53283a, fVar2.f53284b);
            }
            wj.f fVarE = com.bumptech.glide.c.e((List) com.bumptech.glide.d.K(f40919j), dVar.f38890a);
            List list4 = (List) fVarE.f53283a;
            List list5 = (List) fVarE.f53284b;
            List listO0 = !list5.isEmpty() ? xj.n.O0(u(new f2(list5), list4)) : list4;
            Map map = dVar.f38891b;
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Set set = (Set) ((Map.Entry) it.next()).getValue();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    dh.b bVar2 = (dh.b) linkedHashMapY.get((String) it2.next());
                    if (bVar2 != null) {
                        arrayList3.add(bVar2);
                    }
                }
                arrayList2.add(new dh.a(ah.c.DUPLICATES, xj.n.O0(arrayList3)));
            }
            listO0.addAll(arrayList2);
            if (list.size() != dVar.f38893d.size()) {
                android.support.v4.media.session.a.A(new vg.k(listO0, null, 0));
            }
            eh.h hVar = eh.h.f40075a;
            fVar.f40851f = dVar;
            fVar.f40852g = linkedHashMapY;
            fVar.f40853h = listO0;
            fVar.f40856k = 1;
            Object objC = hVar.c(fVar);
            bk.a aVar = bk.a.f5708a;
            if (objC == aVar) {
                return aVar;
            }
            list2 = listO0;
            dVar2 = dVar;
            linkedHashMap = linkedHashMapY;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = fVar.f40853h;
            linkedHashMap = fVar.f40852g;
            dVar2 = fVar.f40851f;
            t9.e.z(obj);
        }
        v vVar = v.f40930a;
        v.c(linkedHashMap, list2);
        return dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0345  */
    /* JADX WARN: Code duplicated, block: B:183:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0138 A[LOOP:0: B:49:0x0132->B:51:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r18v0, types: [fh.s] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011d -> B:48:0x011f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(java.util.List r19, ck.c r20) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.n(java.util.List, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r8 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r8 == r7) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fh.s] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.util.List r9, ln.a r10, ck.c r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.o(java.util.List, ln.a, ck.c):java.lang.Object");
    }

    @Override // xi.h
    public final void onCancel() {
        f40912c = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (q(r6, r0, r7) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(ah.d r6, ck.c r7, java.util.List r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fh.j
            if (r0 == 0) goto L13
            r0 = r7
            fh.j r0 = (fh.j) r0
            int r1 = r0.f40876i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40876i = r1
            goto L18
        L13:
            fh.j r0 = new fh.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40874g
            int r1 = r0.f40876i
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            t9.e.z(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ah.d r6 = r0.f40873f
            t9.e.z(r7)
            goto L48
        L38:
            t9.e.z(r7)
            r0.f40873f = r6
            r0.f40876i = r3
            ln.c r7 = fh.s.f40911b
            java.lang.Object r7 = r5.o(r8, r7, r0)
            if (r7 != r4) goto L48
            goto L57
        L48:
            dh.d r7 = (dh.d) r7
            java.util.List r7 = r7.f38893d
            r8 = 0
            r0.f40873f = r8
            r0.f40876i = r2
            java.lang.Object r5 = r5.q(r6, r0, r7)
            if (r5 != r4) goto L58
        L57:
            return r4
        L58:
            wj.r r5 = wj.r.f53297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.s.p(ah.d, ck.c, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(ah.d dVar, ck.c cVar, List list) {
        n nVar;
        f2 f2VarU;
        ln.c cVar2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.l = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f40892j;
        int i11 = nVar.l;
        ah.d dVar2 = ah.d.IMAGE;
        bf.b bVar = f40919j;
        bf.b bVar2 = f40918i;
        wj.r rVar = wj.r.f53297a;
        int i12 = 1;
        ak.f fVar = null;
        if (i11 == 0) {
            t9.e.z(obj);
            if (list.isEmpty()) {
                return rVar;
            }
            f2VarU = com.bumptech.glide.d.u(list);
            cVar2 = f40911b;
            if (cVar2 == null) {
                com.bumptech.glide.d.E(bVar2, list);
                List listT = t(f2VarU, dVar, (List) com.bumptech.glide.d.K(bVar));
                bVar.a(listT);
                if (dVar == dVar2 && !((ArrayList) f2VarU.f39409b).isEmpty()) {
                    android.support.v4.media.session.a.A(new vg.k(listT, fVar, i12));
                }
                v vVar = v.f40930a;
                v.b();
                return rVar;
            }
            nVar.f40888f = dVar;
            nVar.f40889g = list;
            nVar.f40890h = f2VarU;
            nVar.f40891i = cVar2;
            nVar.l = 1;
            Object objE = cVar2.e(nVar);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = nVar.f40891i;
            f2VarU = nVar.f40890h;
            list = nVar.f40889g;
            ah.d dVar3 = nVar.f40888f;
            t9.e.z(obj);
            cVar2 = cVar3;
            dVar = dVar3;
        }
        try {
            com.bumptech.glide.d.E(bVar2, list);
            List listT2 = t(f2VarU, dVar, (List) com.bumptech.glide.d.K(bVar));
            bVar.a(listT2);
            if (dVar == dVar2 && !((ArrayList) f2VarU.f39409b).isEmpty()) {
                android.support.v4.media.session.a.A(new vg.k(listT2, fVar, i12));
            }
            v vVar2 = v.f40930a;
            v.b();
            return rVar;
        } finally {
            cVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(Map map, ck.c cVar) {
        p pVar;
        ln.c cVar2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i10 = pVar.f40902j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f40902j = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f40900h;
        int i11 = pVar.f40902j;
        int i12 = 3;
        ah.d dVar = ah.d.SCREEN_RECORDING;
        bf.b bVar = f40919j;
        bf.b bVar2 = f40918i;
        wj.r rVar = wj.r.f53297a;
        if (i11 == 0) {
            t9.e.z(obj);
            cVar2 = f40911b;
            if (cVar2 == null) {
                Set setI = i();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!setI.contains(((dh.b) entry.getKey()).f38876a)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return rVar;
                }
                ArrayList arrayListZ = com.bumptech.glide.d.z(xj.n.N0(linkedHashMap.keySet()), new an.q(linkedHashMap, i12));
                Set setR0 = xj.n.R0(linkedHashMap.keySet());
                Set setJ0 = xj.n.J0(setR0, xj.n.R0(xj.p.X(arrayListZ)));
                com.bumptech.glide.d.E(bVar2, setR0);
                bVar.a(t(new f2(arrayListZ, xj.n.N0(setJ0)), dVar, (List) com.bumptech.glide.d.K(bVar)));
                v vVar = v.f40930a;
                v.b();
                return rVar;
            }
            pVar.f40898f = map;
            pVar.f40899g = cVar2;
            pVar.f40902j = 1;
            Object objE = cVar2.e(pVar);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = pVar.f40899g;
            Map map2 = pVar.f40898f;
            t9.e.z(obj);
            cVar2 = cVar3;
            map = map2;
        }
        try {
            Set setI2 = i();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (!setI2.contains(((dh.b) entry2.getKey()).f38876a)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (linkedHashMap2.isEmpty()) {
                return rVar;
            }
            ArrayList arrayListZ2 = com.bumptech.glide.d.z(xj.n.N0(linkedHashMap2.keySet()), new an.q(linkedHashMap2, i12));
            Set setR1 = xj.n.R0(linkedHashMap2.keySet());
            Set setJ1 = xj.n.J0(setR1, xj.n.R0(xj.p.X(arrayListZ2)));
            com.bumptech.glide.d.E(bVar2, setR1);
            bVar.a(t(new f2(arrayListZ2, xj.n.N0(setJ1)), dVar, (List) com.bumptech.glide.d.K(bVar)));
            v vVar2 = v.f40930a;
            v.b();
            return rVar;
        } finally {
            cVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(Map map, ck.c cVar) {
        q qVar;
        ln.c cVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f40907j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f40907j = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f40905h;
        int i11 = qVar.f40907j;
        int i12 = 3;
        ah.d dVar = ah.d.VIDEO;
        bf.b bVar = f40919j;
        xj.v vVar = xj.v.f53866a;
        bf.b bVar2 = f40918i;
        wj.r rVar = wj.r.f53297a;
        if (i11 == 0) {
            t9.e.z(obj);
            cVar2 = f40911b;
            if (cVar2 == null) {
                Set setI = i();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!setI.contains(((dh.b) entry.getKey()).f38876a)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return rVar;
                }
                ArrayList arrayListZ = com.bumptech.glide.d.z(xj.n.N0(linkedHashMap.keySet()), new an.q(linkedHashMap, i12));
                com.bumptech.glide.d.E(bVar2, linkedHashMap.keySet());
                bVar.a(t(new f2(arrayListZ, vVar), dVar, (List) com.bumptech.glide.d.K(bVar)));
                v vVar2 = v.f40930a;
                v.b();
                return rVar;
            }
            qVar.f40903f = map;
            qVar.f40904g = cVar2;
            qVar.f40907j = 1;
            Object objE = cVar2.e(qVar);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = qVar.f40904g;
            Map map2 = qVar.f40903f;
            t9.e.z(obj);
            cVar2 = cVar3;
            map = map2;
        }
        try {
            Set setI2 = i();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (!setI2.contains(((dh.b) entry2.getKey()).f38876a)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (linkedHashMap2.isEmpty()) {
                return rVar;
            }
            ArrayList arrayListZ2 = com.bumptech.glide.d.z(xj.n.N0(linkedHashMap2.keySet()), new an.q(linkedHashMap2, i12));
            com.bumptech.glide.d.E(bVar2, linkedHashMap2.keySet());
            bVar.a(t(new f2(arrayListZ2, vVar), dVar, (List) com.bumptech.glide.d.K(bVar)));
            v vVar3 = v.f40930a;
            v.b();
            return rVar;
        } finally {
            cVar2.g(null);
        }
    }
}
