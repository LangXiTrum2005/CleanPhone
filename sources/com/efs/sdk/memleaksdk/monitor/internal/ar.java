package com.efs.sdk.memleaksdk.monitor.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2801Uf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp f552a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final au f553a;
        final List<bw> b;
        final boolean c;
        final List<Object> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(au auVar, List<? extends bw> list, boolean z, List<? extends Object> list2) {
            AbstractC2995aW.q(auVar, "graph");
            AbstractC2995aW.q(list, "referenceMatchers");
            AbstractC2995aW.q(list2, "objectInspectors");
            this.f553a = auVar;
            this.b = list;
            this.c = z;
            this.d = list2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final av f554a;
        final bi.b b;
        final String c;
        final Set<String> d;

        public b(av avVar, bi.b bVar, String str, Set<String> set) {
            AbstractC2995aW.q(avVar, "heapObject");
            AbstractC2995aW.q(bVar, "leakingStatus");
            AbstractC2995aW.q(str, "leakingStatusReason");
            AbstractC2995aW.q(set, "labels");
            this.f554a = avVar;
            this.b = bVar;
            this.c = str;
            this.d = set;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<al> f555a;
        private final List<bm> b;
        private final List<bi> c;

        public c(List<al> list, List<bm> list2, List<bi> list3) {
            AbstractC2995aW.q(list, "applicationLeaks");
            AbstractC2995aW.q(list2, "libraryLeaks");
            AbstractC2995aW.q(list3, "unreachableObjects");
            this.f555a = list;
            this.b = list2;
            this.c = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC2995aW.i(this.f555a, cVar.f555a) && AbstractC2995aW.i(this.b, cVar.b) && AbstractC2995aW.i(this.c, cVar.c);
        }

        public int hashCode() {
            List<al> list = this.f555a;
            int iHashCode = (list != null ? list.hashCode() : 0) * 31;
            List<bm> list2 = this.b;
            int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<bi> list3 = this.c;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public String toString() {
            return "LeaksAndUnreachableObjects(applicationLeaks=" + this.f555a + ", libraryLeaks=" + this.b + ", unreachableObjects=" + this.c + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final cq.c f556a;
        final List<cq.a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(cq.c cVar, List<? extends cq.a> list) {
            AbstractC2995aW.q(cVar, "root");
            AbstractC2995aW.q(list, "childPath");
            this.f556a = cVar;
            this.b = list;
        }

        public final List<cq> a() {
            return AbstractC2853Wf.p0(this.b, AbstractC2340Cl.J(this.f556a));
        }
    }

    public static abstract class e {

        public static final class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final cq f557a;
            private final long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, cq cqVar) {
                super((byte) 0);
                AbstractC2995aW.q(cqVar, "pathNode");
                this.b = j;
                this.f557a = cqVar;
            }
        }

        public static final class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Map<Long, e> f558a;
            private final long b;

            public b(long j) {
                super((byte) 0);
                this.b = j;
                this.f558a = new LinkedHashMap();
            }

            public long a() {
                return this.b;
            }

            public String toString() {
                return "ParentNode(objectId=" + a() + ", children=" + this.f558a + ')';
            }
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public static final class f extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ZX f559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ZX zx) {
            super(1);
            this.f559a = zx;
        }

        public final Integer a(int i) {
            if (i < this.f559a.f4074a) {
                return Integer.valueOf(i + 1);
            }
            return null;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class g extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ZX f560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ZX zx) {
            super(1);
            this.f560a = zx;
        }

        public final Integer a(int i) {
            if (i > this.f560a.f4074a) {
                return Integer.valueOf(i - 1);
            }
            return null;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class h extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f561a;
        final /* synthetic */ cr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Map map, cr crVar) {
            super(1);
            this.f561a = map;
            this.b = crVar;
        }

        public final int a(long j) {
            Integer num = (Integer) this.f561a.get(Long.valueOf(j));
            return this.b.a(j) + (num != null ? num.intValue() : 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(a(((Number) obj).longValue()));
        }
    }

    public static final class i extends WG implements InterfaceC2714Qw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f562a;
        final /* synthetic */ e.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, e.b bVar) {
            super(0);
            this.f562a = j;
            this.b = bVar;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.b invoke() {
            e.b bVar = new e.b(this.f562a);
            this.b.f558a.put(Long.valueOf(this.f562a), bVar);
            return bVar;
        }
    }

    public ar(bp bpVar) {
        AbstractC2995aW.q(bpVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f552a = bpVar;
    }

    private final List<b> b(List<bo> list) {
        int i2;
        Number number;
        bi.b bVar;
        bi.b bVar2;
        C4839vT c4839vT;
        Number number2;
        bi.b bVar3;
        bi.b bVar4;
        C4839vT c4839vT2;
        int size = list.size();
        int i3 = size - 1;
        ZX zx = new ZX();
        zx.f4074a = -1;
        ZX zx2 = new ZX();
        zx2.f4074a = i3;
        ArrayList arrayList = new ArrayList();
        List<bo> list2 = list;
        Iterator<T> it = list2.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            C4839vT c4839vTA = a((bo) it.next(), i4 == i3);
            if (i4 == i3) {
                int i5 = as.b[((bi.b) c4839vTA.f5132a).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        c4839vTA = new C4839vT(bi.b.LEAKING, "This is the leaking object");
                    } else {
                        if (i5 != 3) {
                            throw new C3770jF(7, 0);
                        }
                        c4839vTA = new C4839vT(bi.b.LEAKING, "This is the leaking object. Conflicts with " + ((String) c4839vTA.b));
                    }
                }
            }
            arrayList.add(c4839vTA);
            bi.b bVar5 = (bi.b) c4839vTA.f5132a;
            if (bVar5 == bi.b.NOT_LEAKING) {
                zx.f4074a = i4;
                zx2.f4074a = i3;
            } else if (bVar5 == bi.b.LEAKING && zx2.f4074a == i3) {
                zx2.f4074a = i4;
            }
            i4++;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, list2));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ct.a(a(((bo) it2.next()).d), '.'));
        }
        int i6 = zx.f4074a;
        int i7 = 0;
        while (i7 < i6) {
            C4839vT c4839vT3 = (C4839vT) arrayList.get(i7);
            bi.b bVar6 = (bi.b) c4839vT3.f5132a;
            String str = (String) c4839vT3.b;
            int i8 = i7 + 1;
            Iterator it3 = A40.I0(new f(zx), Integer.valueOf(i8)).iterator();
            do {
                if (!it3.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number2 = (Number) it3.next();
                bVar3 = (bi.b) ((C4839vT) arrayList.get(number2.intValue())).f5132a;
                bVar4 = bi.b.NOT_LEAKING;
            } while (bVar3 != bVar4);
            String str2 = (String) arrayList2.get(number2.intValue());
            int i9 = as.c[bVar6.ordinal()];
            if (i9 == 1) {
                c4839vT2 = new C4839vT(bVar4, DM.h(str2, "↓ is not leaking"));
            } else if (i9 == 2) {
                c4839vT2 = new C4839vT(bVar4, DM.i(str2, "↓ is not leaking and ", str));
            } else {
                if (i9 != 3) {
                    throw new C3770jF(7, 0);
                }
                c4839vT2 = new C4839vT(bVar4, DM.i(str2, "↓ is not leaking. Conflicts with ", str));
            }
            arrayList.set(i7, c4839vT2);
            i7 = i8;
        }
        int i10 = zx2.f4074a;
        int i11 = size - 2;
        if (i10 < i11 && i11 >= (i2 = i10 + 1)) {
            while (true) {
                C4839vT c4839vT4 = (C4839vT) arrayList.get(i11);
                bi.b bVar7 = (bi.b) c4839vT4.f5132a;
                String str3 = (String) c4839vT4.b;
                Iterator it4 = A40.I0(new g(zx2), Integer.valueOf(i11 - 1)).iterator();
                do {
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                    number = (Number) it4.next();
                    bVar = (bi.b) ((C4839vT) arrayList.get(number.intValue())).f5132a;
                    bVar2 = bi.b.LEAKING;
                } while (bVar != bVar2);
                String str4 = (String) arrayList2.get(number.intValue());
                int i12 = as.d[bVar7.ordinal()];
                if (i12 == 1) {
                    c4839vT = new C4839vT(bVar2, DM.h(str4, "↑ is leaking"));
                } else {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new C3770jF(7, 0);
                        }
                        throw new IllegalStateException("Should never happen");
                    }
                    c4839vT = new C4839vT(bVar2, DM.i(str4, "↑ is leaking and ", str3));
                }
                arrayList.set(i11, c4839vT);
                if (i11 == i2) {
                    break;
                }
                i11--;
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, list2));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC2340Cl.S();
                throw null;
            }
            bo boVar = (bo) obj;
            C4839vT c4839vT5 = (C4839vT) arrayList.get(i13);
            arrayList3.add(new b(boVar.d, (bi.b) c4839vT5.f5132a, (String) c4839vT5.b, boVar.f616a));
            i13 = i14;
        }
        return arrayList3;
    }

    public final c a(a aVar, Set<Long> set) {
        AbstractC2995aW.q(aVar, "$this$findLeaks");
        AbstractC2995aW.q(set, "leakingObjectIds");
        co.b bVarA = new co(aVar.f553a, this.f552a, aVar.b).a(set, aVar.c);
        List<bi> listA = a(aVar, bVarA, set);
        List<d> listA2 = a(bVarA.f650a);
        List<List<b>> listA3 = a(aVar, listA2);
        cg cgVar = bVarA.b;
        C4839vT c4839vTA = a(aVar, listA2, listA3, cgVar != null ? a(aVar, listA3, cgVar) : null);
        return new c((List) c4839vTA.f5132a, (List) c4839vTA.b, listA);
    }

    private final List<d> a(List<? extends cq> list) {
        e.b bVar = new e.b(0L);
        for (cq cqVar : list) {
            ArrayList arrayList = new ArrayList();
            cq cqVarB = cqVar;
            while (cqVarB instanceof cq.a) {
                arrayList.add(0, Long.valueOf(cqVarB.a()));
                cqVarB = ((cq.a) cqVarB).b();
            }
            arrayList.add(0, Long.valueOf(cqVarB.a()));
            a(cqVar, arrayList, 0, bVar);
        }
        ArrayList<cq> arrayList2 = new ArrayList();
        a(bVar, arrayList2);
        if (arrayList2.size() != list.size()) {
            by.a aVar = by.f626a;
            if (by.f626a != null) {
                list.size();
                arrayList2.size();
            }
        } else {
            by.a aVar2 = by.f626a;
            if (by.f626a != null) {
                arrayList2.size();
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, arrayList2));
        for (cq cqVarB2 : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            while (cqVarB2 instanceof cq.a) {
                arrayList4.add(0, cqVarB2);
                cqVarB2 = ((cq.a) cqVarB2).b();
            }
            if (cqVarB2 != null) {
                arrayList3.add(new d((cq.c) cqVarB2, arrayList4));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.efs.sdk.memleaksdk.monitor.shark.internal.ReferencePathNode.RootNode");
            }
        }
        return arrayList3;
    }

    private final void a(cq cqVar, List<Long> list, int i2, e.b bVar) {
        while (true) {
            long jLongValue = list.get(i2).longValue();
            if (i2 == AbstractC2340Cl.y(list)) {
                bVar.f558a.put(Long.valueOf(jLongValue), new e.a(jLongValue, cqVar));
                return;
            }
            e eVar = bVar.f558a.get(Long.valueOf(jLongValue));
            if (eVar == null) {
                eVar = (e) new i(jLongValue, bVar).invoke();
            }
            if (!(eVar instanceof e.b)) {
                return;
            }
            i2++;
            bVar = (e.b) eVar;
        }
    }

    private final C4839vT a(a aVar, List<d> list, List<? extends List<b>> list2, Map<Long, C4839vT> map) {
        cq.b bVar;
        this.f552a.a(bp.b.BUILDING_LEAK_TRACES);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 >= 0) {
                d dVar = (d) obj;
                List<bi> listA = a(list2.get(i2), map);
                bg bgVar = new bg(bg.b.k.a(dVar.f556a.b()), a(aVar, dVar.b, listA), (bi) AbstractC2853Wf.m0(listA));
                Object obj3 = dVar.f556a;
                if (obj3 instanceof cq.b) {
                    bVar = (cq.b) obj3;
                } else {
                    for (Object obj4 : dVar.b) {
                        if (((cq.a) obj4) instanceof cq.b) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    bVar = (cq.b) obj2;
                }
                if (bVar != null) {
                    bn bnVarF = bVar.f();
                    String strA = ct.a(bnVarF.a().toString());
                    Object obj5 = linkedHashMap2.get(strA);
                    if (obj5 == null) {
                        C4839vT c4839vT = new C4839vT(bnVarF, new ArrayList());
                        linkedHashMap2.put(strA, c4839vT);
                        obj5 = c4839vT;
                    }
                    ((List) ((C4839vT) obj5).b).add(bgVar);
                } else {
                    String strC = bgVar.c();
                    Object arrayList = linkedHashMap.get(strC);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strC, arrayList);
                    }
                    ((List) arrayList).add(bgVar);
                }
                i2 = i3;
            } else {
                AbstractC2340Cl.S();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(new al((List) ((Map.Entry) it.next()).getValue()));
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            C4839vT c4839vT2 = (C4839vT) ((Map.Entry) it2.next()).getValue();
            bn bnVar = (bn) c4839vT2.f5132a;
            arrayList3.add(new bm((List) c4839vT2.b, bnVar.a(), bnVar.f615a));
        }
        return new C4839vT(arrayList2, arrayList3);
    }

    private final List<List<b>> a(a aVar, List<d> list) {
        this.f552a.a(bp.b.INSPECTING_OBJECTS);
        List<d> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list2));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List<cq> listA = ((d) it.next()).a();
            List<cq> list3 = listA;
            ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, list3));
            int i2 = 0;
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    bo boVar = new bo(aVar.f553a.a(((cq) obj).a()));
                    Object obj2 = i3 < listA.size() ? (cq) listA.get(i3) : null;
                    if (obj2 instanceof cq.b) {
                        boVar.f616a.add("Library leak match: " + ((cq.b) obj2).f().a());
                    }
                    arrayList2.add(boVar);
                    i2 = i3;
                } else {
                    AbstractC2340Cl.S();
                    throw null;
                }
            }
            arrayList.add(arrayList2);
        }
        Iterator<T> it2 = aVar.d.iterator();
        while (it2.hasNext()) {
            it2.next();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((List) it3.next()).iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, arrayList));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList3.add(b((List) it5.next()));
        }
        return arrayList3;
    }

    private final Map<Long, C4839vT> a(a aVar, List<? extends List<b>> list, cg cgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                bi.b bVar = ((b) obj).b;
                if (bVar == bi.b.UNKNOWN || bVar == bi.b.LEAKING) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((b) it2.next()).f554a.a()));
            }
            AbstractC2801Uf.a0(arrayList3, arrayList);
        }
        Set<Long> setX0 = AbstractC2853Wf.x0(arrayList);
        this.f552a.a(bp.b.COMPUTING_NATIVE_RETAINED_SIZE);
        Map<Long, Integer> mapA = new cc(aVar.f553a).a();
        this.f552a.a(bp.b.COMPUTING_RETAINED_SIZE);
        return cgVar.a(setX0, new h(mapA, new cr(aVar.f553a)));
    }

    private final List<bi> a(List<b> list, Map<Long, C4839vT> map) {
        bi.c cVar;
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list2));
        for (b bVar : list2) {
            av avVar = bVar.f554a;
            String strA = a(avVar);
            if (avVar instanceof av.b) {
                cVar = bi.c.CLASS;
            } else if (!(avVar instanceof av.d) && !(avVar instanceof av.e)) {
                cVar = bi.c.INSTANCE;
            } else {
                cVar = bi.c.ARRAY;
            }
            bi.c cVar2 = cVar;
            Integer num = null;
            C4839vT c4839vT = map != null ? map.get(Long.valueOf(bVar.f554a.a())) : null;
            long jA = avVar.a();
            Set<String> set = bVar.d;
            bi.b bVar2 = bVar.b;
            String str = bVar.c;
            Integer num2 = c4839vT != null ? (Integer) c4839vT.f5132a : null;
            if (c4839vT != null) {
                num = (Integer) c4839vT.b;
            }
            arrayList.add(new bi(jA, cVar2, strA, set, bVar2, str, num2, num));
        }
        return arrayList;
    }

    private final List<bk> a(a aVar, List<? extends cq.a> list, List<bi> list2) {
        String strF;
        List<? extends cq.a> list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list3));
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                cq.a aVar2 = (cq.a) obj;
                bi biVar = list2.get(i2);
                bk.b bVarC = aVar2.c();
                if (aVar2.e() != 0) {
                    av.b bVarD = aVar.f553a.a(aVar2.e()).d();
                    AbstractC2995aW.n(bVarD);
                    strF = bVarD.f();
                } else {
                    strF = list2.get(i2).b;
                }
                arrayList.add(new bk(biVar, bVarC, strF, aVar2.d()));
                i2 = i3;
            } else {
                AbstractC2340Cl.S();
                throw null;
            }
        }
        return arrayList;
    }

    private final C4839vT a(bo boVar, boolean z) {
        String strI;
        bi.b bVar = bi.b.UNKNOWN;
        if (!boVar.c.isEmpty()) {
            bVar = bi.b.NOT_LEAKING;
            strI = AbstractC2853Wf.l0(boVar.c, " and ", null, null, null, 62);
        } else {
            strI = "";
        }
        Set<String> set = boVar.b;
        if (!set.isEmpty()) {
            String strL0 = AbstractC2853Wf.l0(set, " and ", null, null, null, 62);
            if (bVar != bi.b.NOT_LEAKING) {
                bVar = bi.b.LEAKING;
                strI = strL0;
            } else if (z) {
                bVar = bi.b.LEAKING;
                strI = DM.i(strL0, ". Conflicts with ", strI);
            } else {
                strI = DM.i(strI, ". Conflicts with ", strL0);
            }
        }
        return new C4839vT(bVar, strI);
    }

    private final String a(av avVar) {
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

    private final List<bi> a(a aVar, co.b bVar, Set<Long> set) {
        Set setX0;
        List<cq> list = bVar.f650a;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((cq) it.next()).a()));
        }
        Set setX1 = AbstractC2853Wf.x0(arrayList);
        AbstractC2995aW.q(set, "<this>");
        if (setX1.isEmpty()) {
            setX0 = AbstractC2853Wf.x0(set);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!setX1.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setX0 = linkedHashSet;
        }
        ArrayList<bo> arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, setX0));
        Iterator it2 = setX0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new bo(aVar.f553a.a(((Number) it2.next()).longValue())));
        }
        Iterator<T> it3 = aVar.d.iterator();
        while (it3.hasNext()) {
            it3.next();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, arrayList2));
        for (bo boVar : arrayList2) {
            C4839vT c4839vTA = a(boVar, true);
            bi.b bVar2 = (bi.b) c4839vTA.f5132a;
            String strI = (String) c4839vTA.b;
            int i2 = as.f563a[bVar2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    strI = "This is a leaking object";
                } else if (i2 == 3) {
                    strI = AbstractC3888ke0.i("This is a leaking object. Conflicts with ", strI);
                } else {
                    throw new C3770jF(7, 0);
                }
            }
            arrayList3.add(new b(boVar.d, bi.b.LEAKING, strI, boVar.f616a));
        }
        return a(arrayList3, (Map<Long, C4839vT>) null);
    }

    private final void a(e.b bVar, List<cq> list) {
        for (e eVar : bVar.f558a.values()) {
            if (eVar instanceof e.b) {
                a((e.b) eVar, list);
            } else if (eVar instanceof e.a) {
                list.add(((e.a) eVar).f557a);
            }
        }
    }
}
