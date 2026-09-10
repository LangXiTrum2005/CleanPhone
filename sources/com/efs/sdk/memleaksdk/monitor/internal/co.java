package com.efs.sdk.memleaksdk.monitor.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2775Tf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, bw>> f648a;
    private final Map<String, Map<String, bw>> b;
    private final Map<String, bw> c;
    private final Map<String, bw> d;
    private final int e;
    private Map<Long, Short> f;
    private final au g;
    private final bp h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f649a;
        final long b;
        final String c;

        public a(long j, long j2, String str) {
            AbstractC2995aW.q(str, "fieldName");
            this.f649a = j;
            this.b = j2;
            this.c = str;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<cq> f650a;
        public final cg b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends cq> list, cg cgVar) {
            AbstractC2995aW.q(list, "pathsToLeakingObjects");
            this.f650a = list;
            this.b = cgVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Deque<cq> f651a;
        final Deque<cq> b;
        final dd c;
        final dd d;
        final d e;
        boolean f;
        final dd g;
        final int h;
        final boolean i;
        final long j;

        public c(dd ddVar, int i, boolean z, long j, int i2) {
            AbstractC2995aW.q(ddVar, "leakingObjectIds");
            this.g = ddVar;
            this.h = i;
            this.i = z;
            this.j = j;
            this.f651a = new ArrayDeque();
            this.b = new ArrayDeque();
            this.c = new dd(0, 1);
            this.d = new dd(0, 1);
            this.e = z ? new d.a(i2) : new d.b(i2);
        }

        public final boolean a() {
            return (this.f651a.isEmpty() ^ true) || (this.b.isEmpty() ^ true);
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final cg f652a;

            public a(int i) {
                super((byte) 0);
                this.f652a = new cg(i);
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.co.d
            public boolean a(long j, long j2) {
                return this.f652a.a(j, j2);
            }
        }

        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final dd f653a;

            public b(int i) {
                super((byte) 0);
                this.f653a = new dd(i);
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.co.d
            public boolean a(long j, long j2) {
                return !this.f653a.a(j);
            }
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public abstract boolean a(long j, long j2);
    }

    public static final class e extends WG implements InterfaceC2714Qw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ av.c f654a;
        final /* synthetic */ co b;
        final /* synthetic */ c c;
        final /* synthetic */ Map d;
        final /* synthetic */ Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(av.c cVar, co coVar, c cVar2, Map map, Map map2) {
            super(0);
            this.f654a = cVar;
            this.b = coVar;
            this.c = cVar2;
            this.d = map;
            this.e = map2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strG;
            aw awVar;
            at atVarB = this.f654a.b(AbstractC3263dY.a(Thread.class), "name");
            if (atVarB == null || (awVar = atVarB.c) == null || (strG = awVar.g()) == null) {
                strG = "";
            }
            this.e.put(this.f654a, strG);
            return strG;
        }
    }

    public static final class f<T> implements Comparator<C4839vT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2766Sw f655a;

        public f(InterfaceC2766Sw interfaceC2766Sw) {
            this.f655a = interfaceC2766Sw;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(C4839vT c4839vT, C4839vT c4839vT2) {
            av avVar = (av) c4839vT.f5132a;
            ap apVar = (ap) c4839vT.b;
            av avVar2 = (av) c4839vT2.f5132a;
            int iCompareTo = ((ap) c4839vT2.b).getClass().getName().compareTo(apVar.getClass().getName());
            return iCompareTo != 0 ? iCompareTo : ((String) this.f655a.invoke(avVar)).compareTo((String) this.f655a.invoke(avVar2));
        }
    }

    public static final class g extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f656a = new g();

        public g() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(av avVar) {
            AbstractC2995aW.q(avVar, "graphObject");
            if (avVar instanceof av.b) {
                return ((av.b) avVar).f();
            }
            if (avVar instanceof av.c) {
                return ((av.c) avVar).h();
            }
            if (avVar instanceof av.d) {
                return ((av.d) avVar).f();
            }
            if (avVar instanceof av.e) {
                return ((av.e) avVar).g();
            }
            throw new C3770jF(7, 0);
        }
    }

    public static final class h<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return AbstractC3375el.r(((a) t).c, ((a) t2).c);
        }
    }

    public co(au auVar, bp bpVar, List<? extends bw> list) {
        AbstractC2995aW.q(auVar, "graph");
        AbstractC2995aW.q(bpVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        AbstractC2995aW.q(list, "referenceMatchers");
        this.g = auVar;
        this.h = bpVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList<bw> arrayList = new ArrayList();
        for (Object obj : list) {
            bw bwVar = (bw) obj;
            if ((bwVar instanceof be) || ((bwVar instanceof bn) && ((Boolean) ((bn) bwVar).b.invoke(this.g)).booleanValue())) {
                arrayList.add(obj);
            }
        }
        for (bw bwVar2 : arrayList) {
            bx bxVarA = bwVar2.a();
            if (bxVarA instanceof bx.c) {
                linkedHashMap3.put(((bx.c) bxVarA).b, bwVar2);
            } else if (bxVarA instanceof bx.e) {
                bx.e eVar = (bx.e) bxVarA;
                Map linkedHashMap5 = (Map) linkedHashMap2.get(eVar.b);
                if (linkedHashMap5 == null) {
                    linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap2.put(eVar.b, linkedHashMap5);
                }
                linkedHashMap5.put(eVar.c, bwVar2);
            } else if (bxVarA instanceof bx.b) {
                bx.b bVar = (bx.b) bxVarA;
                Map linkedHashMap6 = (Map) linkedHashMap.get(bVar.b);
                if (linkedHashMap6 == null) {
                    linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap.put(bVar.b, linkedHashMap6);
                }
                linkedHashMap6.put(bVar.c, bwVar2);
            } else if (bxVarA instanceof bx.d) {
                linkedHashMap4.put(((bx.d) bxVarA).b, bwVar2);
            }
        }
        this.f648a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = linkedHashMap3;
        this.d = linkedHashMap4;
        this.e = 1024;
        this.f = new LinkedHashMap();
    }

    private final cq b(c cVar) {
        if (!cVar.f && !cVar.f651a.isEmpty()) {
            cq cqVarPoll = cVar.f651a.poll();
            cVar.c.c(cqVarPoll.a());
            return cqVarPoll;
        }
        cVar.f = true;
        cq cqVarPoll2 = cVar.b.poll();
        cVar.d.c(cqVarPoll2.a());
        return cqVarPoll2;
    }

    private final void c(c cVar) {
        bw bwVar;
        List<C4839vT> listA = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C4839vT c4839vT : listA) {
            av avVar = (av) c4839vT.f5132a;
            ap apVar = (ap) c4839vT.b;
            if (apVar instanceof ap.m) {
                Integer numValueOf = Integer.valueOf(((ap.m) apVar).f547a);
                av.c cVarE = avVar.e();
                AbstractC2995aW.n(cVarE);
                linkedHashMap2.put(numValueOf, new C4839vT(cVarE, apVar));
                a(cVar, new cq.c.b(apVar.a(), apVar));
            } else if (apVar instanceof ap.d) {
                C4839vT c4839vT2 = (C4839vT) linkedHashMap2.get(Integer.valueOf(((ap.d) apVar).f538a));
                if (c4839vT2 == null) {
                    a(cVar, new cq.c.b(apVar.a(), apVar));
                } else {
                    av.c cVar2 = (av.c) c4839vT2.f5132a;
                    ap.m mVar = (ap.m) c4839vT2.b;
                    String str = (String) linkedHashMap.get(cVar2);
                    if (str == null) {
                        str = (String) new e(cVar2, this, cVar, linkedHashMap2, linkedHashMap).invoke();
                    }
                    bw bwVar2 = this.c.get(str);
                    if (!(bwVar2 instanceof be)) {
                        cq.c.b bVar = new cq.c.b(mVar.a(), apVar);
                        bk.b bVar2 = bk.b.LOCAL;
                        a(cVar, bwVar2 instanceof bn ? new cq.a.C0133a(apVar.a(), bVar, bVar2, "", (bn) bwVar2, 0L, 32) : new cq.a.b(apVar.a(), bVar, bVar2, "", 0L, 16));
                    }
                }
            } else if (apVar instanceof ap.e) {
                if (avVar instanceof av.b) {
                    bwVar = this.d.get(((av.b) avVar).f());
                } else if (avVar instanceof av.c) {
                    bwVar = this.d.get(((av.c) avVar).h());
                } else if (avVar instanceof av.d) {
                    bwVar = this.d.get(((av.d) avVar).f());
                } else {
                    if (!(avVar instanceof av.e)) {
                        throw new C3770jF(7, 0);
                    }
                    bwVar = this.d.get(((av.e) avVar).g());
                }
                if (!(bwVar instanceof be)) {
                    if (bwVar instanceof bn) {
                        a(cVar, new cq.c.a(apVar.a(), apVar, (bn) bwVar));
                    } else {
                        a(cVar, new cq.c.b(apVar.a(), apVar));
                    }
                }
            } else {
                a(cVar, new cq.c.b(apVar.a(), apVar));
            }
        }
    }

    public final b a(Set<Long> set, boolean z) {
        AbstractC2995aW.q(set, "leakingObjectIds");
        this.h.a(bp.b.FINDING_PATHS_TO_RETAINED_OBJECTS);
        av.b bVarA = this.g.a("java.lang.Object");
        int iA = a(bVarA, this.g);
        long jA = bVarA != null ? bVarA.a() : -1L;
        int iC = this.g.c() / 2;
        return a(new c(a(set), iA, z, jA, iC < 4 ? 4 : iC));
    }

    private final int a(av.b bVar, au auVar) {
        if (bVar == null) {
            return 0;
        }
        int i = bVar.i();
        int iA = auVar.a() + br.INT.j;
        if (i == iA) {
            return iA;
        }
        return 0;
    }

    private final dd a(Set<Long> set) {
        dd ddVar = new dd(0, 1);
        ddVar.a(set.size());
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ddVar.a(((Number) it.next()).longValue());
        }
        return ddVar;
    }

    private final b a(c cVar) {
        c(cVar);
        ArrayList arrayList = new ArrayList();
        while (cVar.a()) {
            cq cqVarB = b(cVar);
            if (cVar.g.b(cqVarB.a())) {
                arrayList.add(cqVarB);
                if (arrayList.size() == cVar.g.a()) {
                    if (!cVar.i) {
                        break;
                    }
                    this.h.a(bp.b.FINDING_DOMINATORS);
                }
            }
            av avVarA = this.g.a(cqVarB.a());
            if (avVarA instanceof av.b) {
                a(cVar, (av.b) avVarA, cqVarB);
            } else if (avVarA instanceof av.c) {
                a(cVar, (av.c) avVarA, cqVarB);
            } else if (avVarA instanceof av.d) {
                a(cVar, (av.d) avVarA, cqVarB);
            }
        }
        d dVar = cVar.e;
        return new b(arrayList, dVar instanceof d.a ? ((d.a) dVar).f652a : null);
    }

    private final List<C4839vT> a() {
        g gVar = g.f656a;
        List<ap> listD = this.g.d();
        ArrayList<ap> arrayList = new ArrayList();
        for (Object obj : listD) {
            if (this.g.c(((ap) obj).a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, arrayList));
        for (ap apVar : arrayList) {
            arrayList2.add(new C4839vT(this.g.a(apVar.a()), apVar));
        }
        return AbstractC2853Wf.r0(arrayList2, new f(gVar));
    }

    private final void a(c cVar, av.b bVar, cq cqVar) {
        cq c0133a;
        Map<String, bw> map = this.b.get(bVar.f());
        if (map == null) {
            map = C2838Vq.f3896a;
        }
        for (at atVar : bVar.p()) {
            if (atVar.c.e()) {
                String str = atVar.b;
                if (!AbstractC2995aW.i(str, "$staticOverhead") && !AbstractC2995aW.i(str, "$classOverhead")) {
                    cb cbVar = atVar.c.f572a;
                    if (cbVar != null) {
                        long j = ((cb.i) cbVar).b;
                        bw bwVar = map.get(str);
                        if (bwVar == null) {
                            c0133a = new cq.a.b(j, cqVar, bk.b.STATIC_FIELD, str, 0L, 16);
                        } else if (bwVar instanceof bn) {
                            c0133a = new cq.a.C0133a(j, cqVar, bk.b.STATIC_FIELD, str, (bn) bwVar, 0L, 32);
                        } else {
                            if (!(bwVar instanceof be)) {
                                throw new C3770jF(7, 0);
                            }
                            c0133a = null;
                        }
                        if (c0133a != null) {
                            a(cVar, c0133a);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.efs.sdk.memleaksdk.monitor.shark.ValueHolder.ReferenceHolder");
                    }
                }
            }
        }
    }

    private final void a(c cVar, av.c cVar2, cq cqVar) {
        cq c0133a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = cVar2.i().k().iterator();
        while (it.hasNext()) {
            Map<String, bw> map = this.f648a.get(((av.b) it.next()).f());
            if (map != null) {
                for (Map.Entry<String, bw> entry : map.entrySet()) {
                    String key = entry.getKey();
                    bw value = entry.getValue();
                    if (!linkedHashMap.containsKey(key)) {
                        linkedHashMap.put(key, value);
                    }
                }
            }
        }
        List<a> listA = a(cVar2, a(cVar2.i(), cVar.j));
        if (listA.size() > 1) {
            AbstractC2775Tf.Z(listA, new h());
        }
        for (a aVar : listA) {
            bw bwVar = (bw) linkedHashMap.get(aVar.c);
            if (bwVar == null) {
                c0133a = new cq.a.b(aVar.b, cqVar, bk.b.INSTANCE_FIELD, aVar.c, aVar.f649a);
            } else if (bwVar instanceof bn) {
                c0133a = new cq.a.C0133a(aVar.b, cqVar, bk.b.INSTANCE_FIELD, aVar.c, (bn) bwVar, aVar.f649a);
            } else {
                if (!(bwVar instanceof be)) {
                    throw new C3770jF(7, 0);
                }
                c0133a = null;
            }
            if (c0133a != null) {
                a(cVar, c0133a);
            }
        }
    }

    private final List<a> a(av.c cVar, List<av.b> list) {
        au auVarG = cVar.g();
        ArrayList arrayList = new ArrayList();
        ch chVar = null;
        int iA = 0;
        for (av.b bVar : list) {
            for (ba.a.AbstractC0127a.C0128a.C0129a c0129a : bVar.o()) {
                if (c0129a.b != 2) {
                    iA += a(auVarG, c0129a);
                } else {
                    if (chVar == null) {
                        chVar = new ch(cVar.b(), auVarG.a());
                    }
                    chVar.a(iA);
                    long jA = chVar.a();
                    if (jA != 0) {
                        arrayList.add(new a(bVar.a(), jA, bVar.a(c0129a)));
                    }
                    iA = 0;
                }
            }
        }
        return arrayList;
    }

    private final List<av.b> a(av.b bVar, long j) {
        ArrayList arrayList = new ArrayList();
        while (bVar != null && bVar.a() != j) {
            arrayList.add(bVar);
            bVar = bVar.j();
        }
        return arrayList;
    }

    private final void a(c cVar, av.d dVar, cq cqVar) {
        long[] jArr = dVar.b().f589a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (long j : jArr) {
            if (j != 0 && this.g.c(j)) {
                arrayList.add(Long.valueOf(j));
            }
        }
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                a(cVar, new cq.a.b(((Number) obj).longValue(), cqVar, bk.b.ARRAY_ENTRY, String.valueOf(i), 0L, 16));
                i = i2;
            } else {
                AbstractC2340Cl.S();
                throw null;
            }
        }
    }

    private final boolean a(av.c cVar) {
        if (AbstractC3089ba0.N0(cVar.h(), "java.util", false) || AbstractC3089ba0.N0(cVar.h(), "android.util", false) || AbstractC3089ba0.N0(cVar.h(), "java.lang.String", false)) {
            return false;
        }
        Short sh = this.f.get(Long.valueOf(cVar.j()));
        if (sh == null) {
            sh = (short) 0;
        }
        if (sh.shortValue() < this.e) {
            this.f.put(Long.valueOf(cVar.j()), Short.valueOf((short) (sh.shortValue() + 1)));
        }
        return sh.shortValue() >= this.e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    private final void a(c cVar, cq cqVar) {
        boolean z;
        if (cqVar.a() == 0) {
            return;
        }
        if (cVar.f || (cqVar instanceof cq.b) || ((cqVar instanceof cq.c) && (((cq.c) cqVar).b() instanceof ap.m))) {
            z = true;
        } else {
            if (cqVar instanceof cq.a.b) {
                cq.a.b bVar = (cq.a.b) cqVar;
                if ((bVar.b() instanceof cq.c) && (((cq.c) bVar.b()).b() instanceof ap.d)) {
                    z = true;
                }
            }
            z = false;
        }
        boolean zA = cVar.e.a(cqVar.a(), cqVar instanceof cq.c ? 0L : ((cq.a) cqVar).b().a());
        if (zA && (z || cVar.c.b(cqVar.a()) || !cVar.d.b(cqVar.a()))) {
            return;
        }
        if (zA) {
            cVar.f651a.add(cqVar);
            cVar.c.a(cqVar.a());
            for (cq cqVar2 : cVar.b) {
                if (cqVar2.a() == cqVar.a()) {
                    cVar.b.remove(cqVar2);
                    cVar.d.c(cqVar.a());
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (!cVar.g.b(cqVar.a())) {
            av avVarA = this.g.a(cqVar.a());
            if (!(avVarA instanceof av.b)) {
                if (avVarA instanceof av.c) {
                    av.c cVar2 = (av.c) avVarA;
                    if (cVar2.f() || AbstractC2995aW.i(cVar2.h(), "java.lang.String") || cVar2.i().g() <= cVar.h) {
                        return;
                    }
                    for (av.b bVar2 : cVar2.i().k()) {
                        if (bVar2.a() != cVar.j && bVar2.h()) {
                            if (a(cVar2)) {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (avVarA instanceof av.d) {
                    if (cp.a((av.d) avVarA)) {
                        return;
                    }
                } else {
                    if (!(avVarA instanceof av.e)) {
                        throw new C3770jF(7, 0);
                    }
                    return;
                }
            }
        }
        if (z) {
            cVar.b.add(cqVar);
            cVar.d.a(cqVar.a());
        } else {
            cVar.f651a.add(cqVar);
            cVar.c.a(cqVar.a());
        }
    }

    private final int a(au auVar, ba.a.AbstractC0127a.C0128a.C0129a c0129a) {
        int i = c0129a.b;
        if (i == 2) {
            return auVar.a();
        }
        if (i != br.BOOLEAN.i) {
            if (i == br.CHAR.i) {
                return 2;
            }
            if (i != br.FLOAT.i) {
                if (i != br.DOUBLE.i) {
                    if (i != br.BYTE.i) {
                        if (i == br.SHORT.i) {
                            return 2;
                        }
                        if (i != br.INT.i) {
                            if (i != br.LONG.i) {
                                throw new IllegalStateException("Unknown type " + c0129a.b);
                            }
                        }
                    }
                }
                return 8;
            }
            return 4;
        }
        return 1;
    }
}
