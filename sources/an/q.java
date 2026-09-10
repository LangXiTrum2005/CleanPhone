package an;

import cn.e1;
import cn.f1;
import cn.q1;
import cn.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements jk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3791b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f3790a = i10;
        this.f3791b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0206 A[LOOP:3: B:93:0x01d1->B:104:0x0206, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0243 A[LOOP:5: B:110:0x0211->B:121:0x0243, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        wj.f fVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        boolean z10;
        int iOrdinal;
        int i10 = this.f3790a;
        Object obj3 = this.f3791b;
        switch (i10) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.n.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iX0 = h.x0(DelimitedRangesSequence, (char[]) obj3, iIntValue, false);
                if (iX0 < 0) {
                    return null;
                }
                return new wj.f(Integer.valueOf(iX0), 1);
            case 1:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.n.f(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                List list = (List) obj3;
                if (list.size() == 1) {
                    String str5 = (String) xj.n.E0(list);
                    int iW0 = h.w0(DelimitedRangesSequence2, str5, iIntValue2, false, 4);
                    if (iW0 < 0) {
                        fVar = null;
                    } else {
                        fVar = new wj.f(Integer.valueOf(iW0), str5);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    pk.c cVar = new pk.c(iIntValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z11 = DelimitedRangesSequence2 instanceof String;
                    int i11 = cVar.f48395c;
                    int i12 = cVar.f48394b;
                    if (z11) {
                        if ((i11 <= 0 || iIntValue2 > i12) && (i11 >= 0 || i12 > iIntValue2)) {
                            fVar = null;
                        } else {
                            int i13 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        fVar = new wj.f(Integer.valueOf(i13), str3);
                                    } else if (i13 != i12) {
                                        i13 += i11;
                                    } else {
                                        fVar = null;
                                    }
                                } while (!p.k0(str4, 0, (String) DelimitedRangesSequence2, i13, str4.length(), false));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    fVar = new wj.f(Integer.valueOf(i13), str3);
                                } else if (i13 != i12) {
                                    i13 += i11;
                                } else {
                                    fVar = null;
                                }
                            }
                        }
                    } else if ((i11 <= 0 || iIntValue2 > i12) && (i11 >= 0 || i12 > iIntValue2)) {
                        fVar = null;
                    } else {
                        int i14 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    fVar = new wj.f(Integer.valueOf(i14), str);
                                } else if (i14 != i12) {
                                    i14 += i11;
                                } else {
                                    fVar = null;
                                }
                            } while (!h.D0(str2, 0, DelimitedRangesSequence2, i14, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                fVar = new wj.f(Integer.valueOf(i14), str);
                            } else if (i14 != i12) {
                                i14 += i11;
                            } else {
                                fVar = null;
                            }
                        }
                    }
                }
                if (fVar != null) {
                    return new wj.f(fVar.f53283a, Integer.valueOf(((String) fVar.f53284b).length()));
                }
                return null;
            case 2:
                ch.e eVar = (ch.e) obj3;
                ch.c cVar2 = (ch.c) obj2;
                kotlin.jvm.internal.n.f((ch.e) obj, "<unused var>");
                if (cVar2 != null) {
                    cVar2.f6422c.incrementAndGet();
                    return cVar2;
                }
                String str6 = eVar.f6429a;
                int i15 = eVar.f6430b;
                ExecutorService executorServiceNewSingleThreadExecutor = i15 == 1 ? Executors.newSingleThreadExecutor(new ch.b(str6, 0)) : Executors.newFixedThreadPool(i15, new ch.b(str6, 1));
                kotlin.jvm.internal.n.c(executorServiceNewSingleThreadExecutor);
                return new ch.c(new z0(executorServiceNewSingleThreadExecutor));
            case 3:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                dh.b lhs = (dh.b) obj;
                dh.b rhs = (dh.b) obj2;
                kotlin.jvm.internal.n.f(lhs, "lhs");
                kotlin.jvm.internal.n.f(rhs, "rhs");
                List list2 = (List) linkedHashMap.get(lhs);
                List list3 = (List) linkedHashMap.get(rhs);
                if (list2 == null || list3 == null) {
                    z10 = false;
                } else {
                    List<dh.h> list4 = list2;
                    List list5 = list3;
                    if (list4.isEmpty() || list5.isEmpty()) {
                        z10 = false;
                    } else {
                        dh.h hVar = (dh.h) xj.n.p0(list4);
                        ah.d dVar = hVar != null ? hVar.f38899b : null;
                        dh.h hVar2 = (dh.h) xj.n.p0(list5);
                        ah.d dVar2 = hVar2 != null ? hVar2.f38899b : null;
                        if (dVar == null || dVar2 == null) {
                            z10 = false;
                        } else {
                            int iOrdinal2 = dVar.ordinal();
                            z10 = true;
                            if ((iOrdinal2 == 1 || iOrdinal2 == 3) && ((iOrdinal = dVar2.ordinal()) == 1 || iOrdinal == 3)) {
                                dh.g.f38896b.getClass();
                                int iMax = Math.max(Math.min(Math.min(2, list4.size()), list5.size()), 1);
                                for (dh.h hVar3 : list4) {
                                    Iterator it3 = list5.iterator();
                                    while (it3.hasNext()) {
                                        if (!hVar3.b((dh.h) it3.next()) || (iMax = iMax - 1) > 0) {
                                        }
                                    }
                                }
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                ak.i iVar = (ak.i) obj2;
                ak.j key = iVar.getKey();
                ak.i iVar2 = ((gn.o) obj3).f42015g.get(key);
                if (key == e1.f6705a) {
                    f1 f1Var = (f1) iVar2;
                    f1 f1Var2 = (f1) iVar;
                    while (true) {
                        f1 parent = null;
                        if (f1Var2 == null) {
                            f1Var2 = null;
                        } else if (f1Var2 != f1Var && (f1Var2 instanceof hn.r)) {
                            cn.o oVar = (cn.o) q1.f6758b.get((hn.r) f1Var2);
                            if (oVar != null) {
                                parent = oVar.getParent();
                            }
                            f1Var2 = parent;
                        }
                    }
                    if (f1Var2 != f1Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var2 + ", expected child of " + f1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (f1Var != null) {
                        iIntValue3++;
                    }
                } else if (iVar != iVar2) {
                    iIntValue3 = Integer.MIN_VALUE;
                } else {
                    iIntValue3++;
                }
                return Integer.valueOf(iIntValue3);
        }
    }
}
