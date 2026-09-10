package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.net.Proxy;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 implements nj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16467f;

    public kj1(String str, zq1 zq1Var, cs1 cs1Var, int i10, on1 on1Var, Integer num) {
        this.f16463b = str;
        this.f16464c = zq1Var;
        this.f16465d = cs1Var;
        this.f16462a = i10;
        this.f16466e = on1Var;
        this.f16467f = num;
    }

    public static kj1 t(String str, cs1 cs1Var, int i10, on1 on1Var, Integer num) throws GeneralSecurityException {
        String str2;
        if (on1Var == on1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        zq1 zq1VarB = rj1.b(str);
        int iC = v0.i.c(i10);
        if (iC == 0 || iC == 1 || iC == 2 || iC == 3 || iC == 4) {
            int iOrdinal = on1Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                return new kj1(str, zq1VarB, cs1Var, i10, on1Var, num);
            }
            throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(String.valueOf(on1Var)));
        }
        switch (i10) {
            case 1:
                str2 = "UNKNOWN_KEYMATERIAL";
                break;
            case 2:
                str2 = "SYMMETRIC";
                break;
            case 3:
                str2 = "ASYMMETRIC_PRIVATE";
                break;
            case 4:
                str2 = "ASYMMETRIC_PUBLIC";
                break;
            case 5:
                str2 = "REMOTE";
                break;
            case 6:
                str2 = "UNRECOGNIZED";
                break;
            default:
                str2 = "null";
                break;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType ".concat(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.f45827b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, l1.q r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f16465d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f16466e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.f16462a
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.f16462a
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            m1.q r3 = (m1.q) r3
            java.lang.String r5 = l1.y.f44830a
            long r5 = r3.f45827b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.f16464c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            l1.q r3 = new l1.q
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            l1.q r3 = (l1.q) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.f44813a
            int r12 = r12.f44814b
            byte[] r6 = r3.f44813a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f16467f
            m1.q r12 = (m1.q) r12
            if (r12 == 0) goto L6c
            long r5 = r12.f45827b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.f45826a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            m1.q r12 = new m1.q
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            m1.q r12 = (m1.q) r12
        L7e:
            java.util.ArrayList r0 = r12.f45826a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            go.k.i(r8)
            boolean r2 = r0.isEmpty()
            go.k.t(r2)
            r12.f45827b = r10
            r0.add(r3)
            r1.add(r12)
            r9.f16467f = r12
            int r10 = r9.f16462a
            if (r10 == r4) goto L9e
            r9.o(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.f16463b
            m1.r r9 = (m1.r) r9
            r9.a(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kj1.a(long, l1.q):void");
    }

    public kj1 b(pn.d descriptor) {
        byte b10;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        sn.b bVar = (sn.b) this.f16463b;
        tn.j jVarF = tn.g.f(descriptor, bVar);
        i3.f fVar = (i3.f) this.f16465d;
        b2.p pVar = (b2.p) fVar.f42853c;
        int i10 = pVar.f5363b + 1;
        pVar.f5363b = i10;
        Object[] objArr = (Object[]) pVar.f5364c;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(...)");
            pVar.f5364c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) pVar.f5365d, i11);
            kotlin.jvm.internal.n.e(iArrCopyOf, "copyOf(...)");
            pVar.f5365d = iArrCopyOf;
        }
        ((Object[]) pVar.f5364c)[i10] = descriptor;
        fVar.h(jVarF.f51607a);
        String str = (String) fVar.f42856f;
        int i12 = fVar.f42852b;
        while (true) {
            int iQ = fVar.q(i12);
            b10 = 10;
            if (iQ == -1) {
                fVar.f42852b = iQ;
                break;
            }
            char cCharAt = str.charAt(iQ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                fVar.f42852b = iQ;
                b10 = tn.g.b(cCharAt);
                break;
            }
            i12 = iQ + 1;
        }
        if (b10 == 4) {
            i3.f.n(fVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = jVarF.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new kj1(bVar, jVarF, fVar, descriptor);
        }
        return (((tn.j) this.f16464c) == jVarF && bVar.f50283a.f15418b) ? this : new kj1(bVar, jVarF, fVar, descriptor);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0 A[EDGE_INSN: B:100:0x01f0->B:101:0x01f1 BREAK  A[LOOP:0: B:84:0x0191->B:109:?]] */
    public int c(pn.d descriptor) {
        Object obj;
        sn.b json = (sn.b) this.f16463b;
        hx0 hx0Var = json.f50283a;
        i3.f fVar = (i3.f) this.f16465d;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        tn.j jVar = (tn.j) this.f16464c;
        int iOrdinal = jVar.ordinal();
        int i10 = 0;
        zT = false;
        boolean zT = false;
        int iIntValue = -1;
        if (iOrdinal == 0) {
            tn.f fVar2 = (tn.f) this.f16467f;
            hx0 hx0Var2 = (hx0) this.f16466e;
            boolean zT2 = fVar.t();
            if (fVar.e()) {
                hx0Var2.getClass();
                String name = fVar.g();
                fVar.h(':');
                kotlin.jvm.internal.n.f(descriptor, "<this>");
                kotlin.jvm.internal.n.f(json, "json");
                kotlin.jvm.internal.n.f(name, "name");
                hx0 hx0Var3 = json.f50283a;
                hx0Var3.getClass();
                tn.g.e(descriptor, json);
                int iC = descriptor.c(name);
                if (iC == -3 && hx0Var3.f15419c) {
                    rb.c cVar = json.f50285c;
                    dg.a aVar = new dg.a(1, descriptor, json);
                    cVar.getClass();
                    cVar.getClass();
                    kotlin.jvm.internal.n.f(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) cVar.f49529b).get(descriptor);
                    tn.h hVar = tn.g.f51597a;
                    Object obj2 = map != null ? map.get(hVar) : null;
                    Object objInvoke = obj2 != null ? obj2 : null;
                    if (objInvoke == null) {
                        objInvoke = aVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f49529b;
                        Object obj3 = concurrentHashMap.get(descriptor);
                        if (obj3 == null) {
                            obj = obj3;
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(descriptor, concurrentHashMap2);
                            obj = concurrentHashMap2;
                        }
                        obj = obj3;
                        ((Map) obj).put(hVar, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(name);
                    iIntValue = num != null ? num.intValue() : -3;
                } else {
                    iIntValue = iC;
                }
                if (iIntValue == -3) {
                    fVar.m(an.h.A0(((String) fVar.f42856f).subSequence(0, fVar.f42852b).toString(), name, 6), defpackage.e.f('\'', "Encountered an unknown key '", name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (fVar2 != null) {
                    rn.d dVar = fVar2.f51595a;
                    if (iIntValue < 64) {
                        dVar.f49711c |= 1 << iIntValue;
                    } else {
                        int i11 = (iIntValue >>> 6) - 1;
                        long[] jArr = dVar.f49712d;
                        jArr[i11] = (1 << (iIntValue & 63)) | jArr[i11];
                    }
                }
            } else if (!zT2) {
                if (fVar2 == null) {
                    iIntValue = -1;
                    break;
                }
                rn.d dVar2 = fVar2.f51595a;
                tn.e eVar = dVar2.f49710b;
                pn.d dVar3 = dVar2.f49709a;
                int iD = dVar3.d();
                while (true) {
                    long j10 = dVar2.f49711c;
                    long j11 = -1;
                    if (j10 == -1) {
                        if (iD <= 64) {
                            iIntValue = -1;
                            break;
                        }
                        long[] jArr2 = dVar2.f49712d;
                        int length = jArr2.length;
                        loop1: while (true) {
                            if (i10 >= length) {
                                iIntValue = -1;
                                break;
                            }
                            int i12 = i10 + 1;
                            int i13 = i12 * 64;
                            long j12 = jArr2[i10];
                            while (true) {
                                if (j12 != j11) {
                                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j12);
                                    j12 |= 1 << iNumberOfTrailingZeros;
                                    int i14 = iNumberOfTrailingZeros + i13;
                                    if (((Boolean) eVar.invoke(dVar3, Integer.valueOf(i14))).booleanValue()) {
                                        jArr2[i10] = j12;
                                        iIntValue = i14;
                                        break;
                                    }
                                    j11 = -1;
                                } else {
                                    jArr2[i10] = j12;
                                    i10 = i12;
                                    j11 = -1;
                                }
                            }
                        }
                    } else {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                        dVar2.f49711c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) eVar.invoke(dVar3, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            iIntValue = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                }
            } else {
                hx0Var.getClass();
                tn.g.c(fVar, "object");
                throw null;
            }
        } else if (iOrdinal != 2) {
            boolean zT3 = fVar.t();
            if (fVar.e()) {
                int i15 = this.f16462a;
                if (i15 != -1 && !zT3) {
                    i3.f.n(fVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iIntValue = i15 + 1;
                this.f16462a = iIntValue;
            } else if (zT3) {
                hx0Var.getClass();
                tn.g.c(fVar, "array");
                throw null;
            }
        } else {
            int i16 = this.f16462a;
            boolean z10 = i16 % 2 != 0;
            if (!z10) {
                fVar.h(':');
            } else if (i16 != -1) {
                zT = fVar.t();
            }
            if (fVar.e()) {
                if (z10) {
                    if (this.f16462a == -1) {
                        int i17 = fVar.f42852b;
                        if (zT) {
                            i3.f.n(fVar, "Unexpected leading comma", i17, 4);
                            throw null;
                        }
                    } else {
                        int i18 = fVar.f42852b;
                        if (!zT) {
                            i3.f.n(fVar, "Expected comma after the key-value pair", i18, 4);
                            throw null;
                        }
                    }
                }
                iIntValue = this.f16462a + 1;
                this.f16462a = iIntValue;
            } else if (zT) {
                hx0Var.getClass();
                tn.g.c(fVar, "object");
                throw null;
            }
        }
        if (jVar != tn.j.MAP) {
            b2.p pVar = (b2.p) fVar.f42853c;
            ((int[]) pVar.f5365d)[pVar.f5363b] = iIntValue;
        }
        return iIntValue;
    }

    public int d() {
        i3.f fVar = (i3.f) this.f16465d;
        long jI = fVar.i();
        int i10 = (int) jI;
        if (jI == i10) {
            return i10;
        }
        i3.f.n(fVar, "Failed to parse int for input '" + jI + '\'', 0, 6);
        throw null;
    }

    public int e(pn.d descriptor, int i10) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        return d();
    }

    public long f() {
        return ((i3.f) this.f16465d).i();
    }

    public long g(pn.d descriptor, int i10) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        return f();
    }

    public boolean h() {
        tn.f fVar = (tn.f) this.f16467f;
        if (!(fVar != null ? fVar.f51596b : false)) {
            i3.f fVar2 = (i3.f) this.f16465d;
            int iQ = fVar2.q(fVar2.s());
            String str = (String) fVar2.f42856f;
            int length = str.length() - iQ;
            boolean z10 = false;
            if (length >= 4 && iQ != -1) {
                for (int i10 = 0; i10 < 4; i10++) {
                    if ("null".charAt(i10) == str.charAt(iQ + i10)) {
                    }
                }
                if (length <= 4 || tn.g.b(str.charAt(iQ + 4)) != 0) {
                    z10 = true;
                    fVar2.f42852b = iQ + 4;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public Object i(pn.d descriptor, int i10, nn.a deserializer, Object obj) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        kotlin.jvm.internal.n.f(deserializer, "deserializer");
        if (deserializer.d().b() || h()) {
            return k(deserializer);
        }
        return null;
    }

    public Object j(pn.d descriptor, int i10, nn.a deserializer, Object obj) {
        b2.p pVar = (b2.p) ((i3.f) this.f16465d).f42853c;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        kotlin.jvm.internal.n.f(deserializer, "deserializer");
        boolean z10 = ((tn.j) this.f16464c) == tn.j.MAP && (i10 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) pVar.f5365d;
            int i11 = pVar.f5363b;
            if (iArr[i11] == -2) {
                ((Object[]) pVar.f5364c)[i11] = tn.h.f51598a;
            }
        }
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        kotlin.jvm.internal.n.f(deserializer, "deserializer");
        Object objK = k(deserializer);
        if (z10) {
            int[] iArr2 = (int[]) pVar.f5365d;
            int i12 = pVar.f5363b;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                pVar.f5363b = i13;
                Object[] objArr = (Object[]) pVar.f5364c;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(...)");
                    pVar.f5364c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) pVar.f5365d, i14);
                    kotlin.jvm.internal.n.e(iArrCopyOf, "copyOf(...)");
                    pVar.f5365d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) pVar.f5364c;
            int i15 = pVar.f5363b;
            objArr2[i15] = objK;
            ((int[]) pVar.f5365d)[i15] = -2;
        }
        return objK;
    }

    public Object k(nn.a deserializer) {
        kotlin.jvm.internal.n.f(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (nn.b e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.n.c(message);
            if (an.h.q0(message, "at path", false)) {
                throw e10;
            }
            throw new nn.b(e10.f46873a, e10.getMessage() + " at path: " + ((b2.p) ((i3.f) this.f16465d).f42853c).j(), e10);
        }
    }

    public String l() {
        i3.f fVar = (i3.f) this.f16465d;
        ((hx0) this.f16466e).getClass();
        return fVar.j();
    }

    public String m(pn.d descriptor, int i10) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        return l();
    }

    public void n(pn.d descriptor) {
        i3.f fVar = (i3.f) this.f16465d;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        hx0 hx0Var = ((sn.b) this.f16463b).f50283a;
        hx0Var.getClass();
        if (fVar.t()) {
            hx0Var.getClass();
            tn.g.c(fVar, "");
            throw null;
        }
        fVar.h(((tn.j) this.f16464c).f51608b);
        b2.p pVar = (b2.p) fVar.f42853c;
        int i10 = pVar.f5363b;
        int[] iArr = (int[]) pVar.f5365d;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            pVar.f5363b = i10 - 1;
        }
        int i11 = pVar.f5363b;
        if (i11 != -1) {
            pVar.f5363b = i11 - 1;
        }
    }

    public void o(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f16466e;
        while (priorityQueue.size() > i10) {
            m1.q qVar = (m1.q) priorityQueue.poll();
            String str = l1.y.f44830a;
            int i11 = 0;
            while (true) {
                arrayList = qVar.f45826a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((m1.r) this.f16463b).a(qVar.f45827b, (l1.q) arrayList.get(i11));
                ((ArrayDeque) this.f16464c).push((l1.q) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            m1.q qVar2 = (m1.q) this.f16467f;
            if (qVar2 != null && qVar2.f45827b == qVar.f45827b) {
                this.f16467f = null;
            }
            ((ArrayDeque) this.f16465d).push(qVar);
        }
    }

    public boolean p() {
        return this.f16462a < ((List) this.f16465d).size() || !((ArrayList) this.f16467f).isEmpty();
    }

    public void q(Runnable runnable) {
        l1.w wVar = (l1.w) this.f16463b;
        if (wVar.f44825a.getLooper().getThread().isAlive()) {
            wVar.c(runnable);
        }
    }

    public void r(int i10) {
        go.k.t(i10 >= 0);
        this.f16462a = i10;
        o(i10);
    }

    public void s(Object obj) {
        Object obj2 = this.f16466e;
        this.f16466e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        p1.b0 b0Var = ((p1.n) this.f16465d).f48125a;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        b0Var.l1();
        b0Var.d1(1, 10, num);
        b0Var.d1(2, 10, num);
        b0Var.f47947m.e(21, new p1.q(iIntValue, 1));
    }

    public void u(int i10) {
        ps1.c0(i10 >= 0);
        this.f16462a = i10;
        w(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.f15708b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(long r8, com.google.android.gms.internal.ads.np0 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f16466e
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f16462a
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f16462a
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.ib1 r1 = (com.google.android.gms.internal.ads.ib1) r1
            java.lang.String r3 = com.google.android.gms.internal.ads.uu0.f20901a
            long r3 = r1.f15708b
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.f16464c
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.np0 r1 = new com.google.android.gms.internal.ads.np0
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.np0 r1 = (com.google.android.gms.internal.ads.np0) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.f17880a
            int r10 = r10.f17881b
            byte[] r4 = r1.f17880a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.f16467f
            com.google.android.gms.internal.ads.ib1 r10 = (com.google.android.gms.internal.ads.ib1) r10
            if (r10 == 0) goto L6a
            long r3 = r10.f15708b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r7 = r10.f15707a
            r7.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.f16465d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.ib1 r10 = new com.google.android.gms.internal.ads.ib1
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.ib1 r10 = (com.google.android.gms.internal.ads.ib1) r10
        L80:
            java.util.ArrayList r3 = r10.f15707a
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.ps1.c0(r4)
            r10.f15708b = r8
            r3.add(r1)
            r0.add(r10)
            r7.f16467f = r10
            int r8 = r7.f16462a
            if (r8 == r2) goto L9a
            r7.w(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r7 = r7.f16463b
            com.google.android.gms.internal.ads.xb1 r7 = (com.google.android.gms.internal.ads.xb1) r7
            r7.g(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kj1.v(long, com.google.android.gms.internal.ads.np0):void");
    }

    public void w(int i10) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f16466e;
            if (priorityQueue.size() <= i10) {
                return;
            }
            ib1 ib1Var = (ib1) priorityQueue.poll();
            String str = uu0.f20901a;
            int i11 = 0;
            while (true) {
                arrayList = ib1Var.f15707a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((xb1) this.f16463b).g(ib1Var.f15708b, (np0) arrayList.get(i11));
                ((ArrayDeque) this.f16464c).push((np0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            ib1 ib1Var2 = (ib1) this.f16467f;
            if (ib1Var2 != null && ib1Var2.f15708b == ib1Var.f15708b) {
                this.f16467f = null;
            }
            ((ArrayDeque) this.f16465d).push(ib1Var);
        }
    }

    public void x(Object obj) {
        Object obj2 = this.f16466e;
        this.f16466e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        z61 z61Var = (z61) this.f16465d;
        z61Var.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        ry1 ry1Var = (ry1) z61Var.f22523a;
        ry1Var.l0();
        ry1Var.m1(1, 10, num);
        ry1Var.m1(2, 10, num);
        ey1 ey1Var = new ey1(iIntValue);
        mk0 mk0Var = ry1Var.f19722n;
        mk0Var.i(21, ey1Var);
        mk0Var.j();
    }

    public kj1(Looper looper, Looper looper2, s6 s6Var, z61 z61Var) {
        this.f16463b = s6Var.u(looper, null);
        this.f16464c = s6Var.u(looper2, null);
        this.f16466e = 0;
        this.f16467f = 0;
        this.f16465d = z61Var;
    }

    public kj1(xb1 xb1Var) {
        this.f16463b = xb1Var;
        this.f16464c = new ArrayDeque();
        this.f16465d = new ArrayDeque();
        this.f16466e = new PriorityQueue();
        this.f16462a = -1;
    }

    public kj1(sn.b bVar, tn.j jVar, i3.f fVar, pn.d descriptor) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        this.f16463b = bVar;
        this.f16464c = jVar;
        this.f16465d = fVar;
        this.f16462a = -1;
        hx0 hx0Var = bVar.f50283a;
        this.f16466e = hx0Var;
        this.f16467f = hx0Var.f15418b ? null : new tn.f(descriptor);
    }

    public kj1(xn.a aVar, od.c routeDatabase, xn.d dVar) {
        List listK;
        kotlin.jvm.internal.n.f(routeDatabase, "routeDatabase");
        this.f16463b = aVar;
        this.f16464c = routeDatabase;
        xj.v vVar = xj.v.f53866a;
        this.f16465d = vVar;
        this.f16466e = vVar;
        this.f16467f = new ArrayList();
        xn.m url = aVar.f53917h;
        kotlin.jvm.internal.n.f(url, "url");
        URI uriG = url.g();
        if (uriG.getHost() == null) {
            listK = yn.a.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = aVar.f53916g.select(uriG);
            List<Proxy> list = proxiesOrNull;
            if (list != null && !list.isEmpty()) {
                kotlin.jvm.internal.n.e(proxiesOrNull, "proxiesOrNull");
                listK = yn.a.v(proxiesOrNull);
            } else {
                listK = yn.a.k(Proxy.NO_PROXY);
            }
        }
        this.f16465d = listK;
        this.f16462a = 0;
    }

    public kj1(m1.r rVar) {
        this.f16463b = rVar;
        this.f16464c = new ArrayDeque();
        this.f16465d = new ArrayDeque();
        this.f16466e = new PriorityQueue();
        this.f16462a = -1;
    }

    public kj1(Object obj, Looper looper, Looper looper2, l1.u uVar, p1.n nVar) {
        this.f16463b = uVar.a(looper, null);
        this.f16464c = uVar.a(looper2, null);
        this.f16466e = obj;
        this.f16467f = obj;
        this.f16465d = nVar;
    }
}
