package j$.time.chrono;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3539a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f43026a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f43027b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f43028c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return s().compareTo(((m) obj).s());
    }

    static {
        new Locale(com.smartdigimkt.d2.a.T, "JP", "JP");
    }

    static m C(AbstractC3539a abstractC3539a, String str) {
        String strT;
        m mVar = (m) f43026a.putIfAbsent(str, abstractC3539a);
        if (mVar == null && (strT = abstractC3539a.T()) != null) {
            f43027b.putIfAbsent(strT, abstractC3539a);
        }
        return mVar;
    }

    static m r(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f43026a;
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar == null) {
                mVar = (m) f43027b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.s()) || str.equals(mVar2.T())) {
                        return mVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            p pVar = p.m;
            C(pVar, pVar.s());
            w wVar = w.d;
            C(wVar, wVar.s());
            B b2 = B.d;
            C(b2, b2.s());
            H h2 = H.d;
            C(h2, h2.s());
            try {
                for (AbstractC3539a abstractC3539a : Arrays.asList(new AbstractC3539a[0])) {
                    if (!abstractC3539a.s().equals("ISO")) {
                        C(abstractC3539a, abstractC3539a.s());
                    }
                }
                t tVar = t.d;
                C(tVar, tVar.s());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC3539a() {
    }

    @Override // j$.time.chrono.m
    public InterfaceC3540b R(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return q(((Long) map.remove(aVar)).longValue());
        }
        U(map, f);
        InterfaceC3540b interfaceC3540bY = Y(map, f);
        if (interfaceC3540bY != null) {
            return interfaceC3540bY;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return V(map, f);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return G(iA, 1, 1).l(jSubtractExact, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).l(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = W(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC3540b interfaceC3540bL = G(iA, iA2, 1).l((W(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((W(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    if (f != j$.time.format.F.STRICT || interfaceC3540bL.g(aVar3) == iA2) {
                        return interfaceC3540bL;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return J(G(iA3, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = W(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC3540b interfaceC3540bM = G(iA3, iA4, 1).l((W(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.e.r(W(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).p(), 0));
                    if (f != j$.time.format.F.STRICT || interfaceC3540bM.g(aVar3) == iA4) {
                        return interfaceC3540bM;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (f != j$.time.format.F.LENIENT) {
                return A(iA5, W(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return A(iA5, 1).l(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (f == j$.time.format.F.LENIENT) {
                return A(iA6, 1).l(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            }
            InterfaceC3540b interfaceC3540bL2 = A(iA6, 1).l((W(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((W(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            if (f != j$.time.format.F.STRICT || interfaceC3540bL2.g(aVar2) == iA6) {
                return interfaceC3540bL2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (f == j$.time.format.F.LENIENT) {
            return J(A(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC3540b interfaceC3540bM2 = A(iA7, 1).l((W(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.e.r(W(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).p(), 0));
        if (f != j$.time.format.F.STRICT || interfaceC3540bM2.g(aVar2) == iA7) {
            return interfaceC3540bM2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    void U(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.c0(l2.longValue());
            }
            InterfaceC3540b interfaceC3540bH = M().h(1L, (j$.time.temporal.r) j$.time.temporal.a.DAY_OF_MONTH).h(l2.longValue(), (j$.time.temporal.r) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            p(map, aVar2, interfaceC3540bH.g(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            p(map, aVar3, interfaceC3540bH.g(aVar3));
        }
    }

    InterfaceC3540b Y(Map map, j$.time.format.F f) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l3 = (Long) map.remove(aVar2);
            if (f != j$.time.format.F.LENIENT) {
                intExact = W(aVar).a(l2.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l2.longValue());
            }
            if (l3 != null) {
                p(map, j$.time.temporal.a.YEAR, w(P(W(aVar2).a(l3.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                p(map, aVar3, w(A(W(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).u(), intExact));
                return null;
            }
            if (f == j$.time.format.F.STRICT) {
                map.put(aVar, l2);
                return null;
            }
            List listD = D();
            if (listD.isEmpty()) {
                p(map, aVar3, intExact);
                return null;
            }
            p(map, aVar3, w((n) listD.get(listD.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        W(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    InterfaceC3540b V(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = W(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (f == j$.time.format.F.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return G(iA, 1, 1).l(jSubtractExact, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).l(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = W(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = W(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (f != j$.time.format.F.SMART) {
            return G(iA, iA2, iA3);
        }
        try {
            return G(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return G(iA, iA2, 1).m(new j$.time.temporal.p(0));
        }
    }

    static InterfaceC3540b J(InterfaceC3540b interfaceC3540b, long j, long j2, long j3) {
        long j4;
        InterfaceC3540b interfaceC3540bL = interfaceC3540b.l(j, (j$.time.temporal.u) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        InterfaceC3540b interfaceC3540bL2 = interfaceC3540bL.l(j2, (j$.time.temporal.u) bVar);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC3540bL2 = interfaceC3540bL2.l(j5 / 7, (j$.time.temporal.u) bVar);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC3540bL2 = interfaceC3540bL2.l(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.u) bVar);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC3540bL2.m(new j$.time.temporal.o(j$.time.e.r((int) j3).p(), 0));
        }
        j3 = j4 + 1;
        return interfaceC3540bL2.m(new j$.time.temporal.o(j$.time.e.r((int) j3).p(), 0));
    }

    static void p(Map map, j$.time.temporal.a aVar, long j) {
        Long l2 = (Long) map.get(aVar);
        if (l2 != null && l2.longValue() != j) {
            throw new j$.time.c("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC3539a) && s().compareTo(((AbstractC3539a) obj).s()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ s().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return s();
    }
}
