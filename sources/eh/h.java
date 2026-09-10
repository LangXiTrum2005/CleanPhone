package eh;

import com.google.android.gms.internal.ads.l11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import wj.r;
import xj.b0;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f40075a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LinkedHashMap f40076b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ln.c f40077c = new ln.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gh.b f40078d = gh.b.f41895a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f40079e;

    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: all -> 0x002f, Exception -> 0x0032, LOOP:0: B:37:0x009a->B:39:0x00a0, LOOP_END, TryCatch #4 {Exception -> 0x0032, blocks: (B:13:0x002b, B:36:0x0083, B:37:0x009a, B:39:0x00a0, B:40:0x00bb), top: B:64:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [ln.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ak.f, eh.d] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ln.a, ln.c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ln.a] */
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
    public static final Object a(ck.c cVar) throws Throwable {
        ?? dVar;
        ?? r10;
        int i10;
        ?? r11;
        Throwable th2;
        ?? r0;
        Exception e10;
        ?? r2;
        LinkedHashMap linkedHashMap;
        if (cVar instanceof d) {
            d dVar2 = (d) cVar;
            int i11 = dVar2.f40059i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f40059i = i11 - Integer.MIN_VALUE;
                dVar = dVar2;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object obj = dVar.f40058h;
        int i12 = dVar.f40059i;
        r rVar = r.f53297a;
        int i13 = 2;
        ak.f fVar = null;
        bk.a aVar = bk.a.f5708a;
        try {
            try {
                if (i12 == 0) {
                    t9.e.z(obj);
                    if (f40079e) {
                        return rVar;
                    }
                    r10 = f40077c;
                    dVar.f40056f = r10;
                    i10 = 0;
                    dVar.f40057g = 0;
                    dVar.f40059i = 1;
                    if (r10.e(dVar) != aVar) {
                    }
                    r11 = r10;
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = dVar.f40056f;
                    try {
                        try {
                            t9.e.z(obj);
                            r0 = r0;
                            Map map = (Map) obj;
                            linkedHashMap = new LinkedHashMap(b0.O(map.size()));
                            for (Object obj2 : map.entrySet()) {
                                linkedHashMap.put(((Map.Entry) obj2).getKey(), n.Q0((Set) ((Map.Entry) obj2).getValue()));
                            }
                            f40076b = b0.Y(linkedHashMap);
                            r2 = r0;
                        } catch (Throwable th3) {
                            th2 = th3;
                            f40079e = true;
                            throw th2;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        e10.printStackTrace();
                        f40076b = new LinkedHashMap();
                        r2 = r0;
                    }
                    f40079e = true;
                    ((ln.c) r2).g(null);
                    return rVar;
                }
                i10 = dVar.f40057g;
                ln.a aVar2 = dVar.f40056f;
                t9.e.z(obj);
                r11 = aVar2;
                r11 = r10;
                if (f40079e) {
                    ((ln.c) r11).g(null);
                    return rVar;
                }
                try {
                    gh.b bVar = f40078d;
                    dVar.f40056f = r11;
                    dVar.f40057g = i10;
                    dVar.f40059i = 2;
                    bVar.getClass();
                    Object objF = android.support.v4.media.session.a.f(new l11(i13, fVar, 5), dVar);
                    if (objF != aVar) {
                        r0 = r11;
                        obj = objF;
                        Map map2 = (Map) obj;
                        linkedHashMap = new LinkedHashMap(b0.O(map2.size()));
                        while (r9.hasNext()) {
                            linkedHashMap.put(((Map.Entry) obj2).getKey(), n.Q0((Set) ((Map.Entry) obj2).getValue()));
                        }
                        f40076b = b0.Y(linkedHashMap);
                        r2 = r0;
                        f40079e = true;
                        ((ln.c) r2).g(null);
                        return rVar;
                    }
                    r11 = r10;
                    return aVar;
                } catch (Exception e12) {
                    r0 = r11;
                    e10 = e12;
                    e10.printStackTrace();
                    f40076b = new LinkedHashMap();
                    r2 = r0;
                } catch (Throwable th4) {
                    th2 = th4;
                    f40079e = true;
                    throw th2;
                }
            } catch (Throwable th5) {
                dVar = r11;
                th = th5;
                ((ln.c) dVar).g(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (c(r0) == r4) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Set r9, ck.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof eh.f
            if (r0 == 0) goto L13
            r0 = r10
            eh.f r0 = (eh.f) r0
            int r1 = r0.f40070j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40070j = r1
            goto L18
        L13:
            eh.f r0 = new eh.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f40068h
            int r1 = r0.f40070j
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            t9.e.z(r10)
            goto La4
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ln.c r9 = r0.f40067g
            java.util.Set r1 = r0.f40066f
            t9.e.z(r10)
            goto L4f
        L3b:
            t9.e.z(r10)
            r0.f40066f = r9
            ln.c r10 = eh.h.f40077c
            r0.f40067g = r10
            r0.f40070j = r3
            java.lang.Object r1 = r10.e(r0)
            if (r1 != r4) goto L4d
            goto La3
        L4d:
            r1 = r9
            r9 = r10
        L4f:
            r10 = 0
            java.util.LinkedHashMap r3 = eh.h.f40076b     // Catch: java.lang.Throwable -> L8c
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L8c
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L8c
            int r6 = xj.b0.O(r6)     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L8c
        L67:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L8c
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r7 = r7.getKey()     // Catch: java.lang.Throwable -> L8c
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L8c
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L8c
            java.util.Set r6 = xj.n.J0(r6, r1)     // Catch: java.lang.Throwable -> L8c
            java.util.Set r6 = xj.n.Q0(r6)     // Catch: java.lang.Throwable -> L8c
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L8c
            goto L67
        L8c:
            r8 = move-exception
            goto La7
        L8e:
            java.util.LinkedHashMap r1 = xj.b0.Y(r5)     // Catch: java.lang.Throwable -> L8c
            eh.h.f40076b = r1     // Catch: java.lang.Throwable -> L8c
            r9.g(r10)
            r0.f40066f = r10
            r0.f40067g = r10
            r0.f40070j = r2
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r4) goto La4
        La3:
            return r4
        La4:
            wj.r r8 = wj.r.f53297a
            return r8
        La7:
            r9.g(r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.h.b(java.util.Set, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ck.c cVar) {
        g gVar;
        ln.c cVar2;
        ak.f fVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f40074i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f40074i = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f40072g;
        int i11 = gVar.f40074i;
        bk.a aVar = bk.a.f5708a;
        r rVar = r.f53297a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                cVar2 = f40077c;
                gVar.f40071f = cVar2;
                gVar.f40074i = 1;
                if (cVar2.e(gVar) != aVar) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return rVar;
            }
            cVar2 = gVar.f40071f;
            t9.e.z(obj);
            LinkedHashMap linkedHashMap = f40076b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(b0.O(linkedHashMap.size()));
            for (Object obj2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(((Map.Entry) obj2).getKey(), n.R0((Set) ((Map.Entry) obj2).getValue()));
            }
            cVar2.g(null);
            gVar.f40071f = null;
            gVar.f40074i = 2;
            f40078d.getClass();
            Object objF = android.support.v4.media.session.a.f(new b4.a(linkedHashMap2, fVar, 7), gVar);
            if (objF != aVar) {
                objF = rVar;
            }
            return objF == aVar ? aVar : rVar;
        } catch (Throwable th2) {
            cVar2.g(null);
            throw th2;
        }
        fVar = null;
    }
}
