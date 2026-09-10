package com.smartdigimkt.j4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.smartdigimkt.j4.f<f> implements com.smartdigimkt.w3.x.b {
    private static final int A0 = 5;
    private static final int B0 = 6;
    private static final int v0 = 0;
    private static final int w0 = 1;
    private static final int x0 = 2;
    private static final int y0 = 3;
    private static final int z0 = 4;
    private final List<f> j0;
    private final List<f> k0;
    private final f l0;
    private final Map<r, f> m0;
    private final List<e> n0;
    private final boolean o0;
    private final com.smartdigimkt.w3.e0.c p0;
    private com.smartdigimkt.w3.h q0;
    private boolean r0;
    private a0 s0;
    private int t0;
    private int u0;

    public static final class b extends com.smartdigimkt.j4.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f35978e;
        private final int f;
        private final int[] g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f35979h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final com.smartdigimkt.w3.e0[] f35980i;
        private final Object[] j;
        private final HashMap<Object, Integer> k;

        public b(Collection<f> collection, int i2, int i3, a0 a0Var, boolean z2) {
            super(z2, a0Var);
            this.f35978e = i2;
            this.f = i3;
            int size = collection.size();
            this.g = new int[size];
            this.f35979h = new int[size];
            this.f35980i = new com.smartdigimkt.w3.e0[size];
            this.j = new Object[size];
            this.k = new HashMap<>();
            int i4 = 0;
            for (f fVar : collection) {
                this.f35980i[i4] = fVar.f35987c;
                this.g[i4] = fVar.f;
                this.f35979h[i4] = fVar.f35988e;
                Object[] objArr = this.j;
                Object obj = fVar.f35986b;
                objArr[i4] = obj;
                this.k.put(obj, Integer.valueOf(i4));
                i4++;
            }
        }

        @Override // com.smartdigimkt.j4.a
        public int a(int i2) {
            return com.smartdigimkt.p4.f0.a(this.g, i2 + 1, false, false);
        }

        @Override // com.smartdigimkt.j4.a
        public int b(int i2) {
            return com.smartdigimkt.p4.f0.a(this.f35979h, i2 + 1, false, false);
        }

        @Override // com.smartdigimkt.j4.a
        public Object c(int i2) {
            return this.j[i2];
        }

        @Override // com.smartdigimkt.j4.a
        public int d(int i2) {
            return this.g[i2];
        }

        @Override // com.smartdigimkt.j4.a
        public int e(int i2) {
            return this.f35979h[i2];
        }

        @Override // com.smartdigimkt.j4.a
        public com.smartdigimkt.w3.e0 f(int i2) {
            return this.f35980i[i2];
        }

        @Override // com.smartdigimkt.w3.e0
        public int a() {
            return this.f;
        }

        @Override // com.smartdigimkt.j4.a
        public int b(Object obj) {
            Integer num = this.k.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.smartdigimkt.w3.e0
        public int b() {
            return this.f35978e;
        }
    }

    public static final class c extends p {
        private static final Object d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.smartdigimkt.w3.e0.b f35981e = new com.smartdigimkt.w3.e0.b();
        private static final d f = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f35982c;

        public c() {
            this(f, null);
        }

        public c a(com.smartdigimkt.w3.e0 e0Var) {
            return new c(e0Var, (this.f35982c != null || e0Var.a() <= 0) ? this.f35982c : e0Var.a(0, f35981e, true).f39264b);
        }

        public com.smartdigimkt.w3.e0 d() {
            return this.f36012b;
        }

        private c(com.smartdigimkt.w3.e0 e0Var, Object obj) {
            super(e0Var);
            this.f35982c = obj;
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public com.smartdigimkt.w3.e0.b a(int i2, com.smartdigimkt.w3.e0.b bVar, boolean z2) {
            this.f36012b.a(i2, bVar, z2);
            if (com.smartdigimkt.p4.f0.a(bVar.f39264b, this.f35982c)) {
                bVar.f39264b = d;
            }
            return bVar;
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public int a(Object obj) {
            com.smartdigimkt.w3.e0 e0Var = this.f36012b;
            if (d.equals(obj)) {
                obj = this.f35982c;
            }
            return e0Var.a(obj);
        }
    }

    public static final class d extends com.smartdigimkt.w3.e0 {
        private d() {
        }

        @Override // com.smartdigimkt.w3.e0
        public int a() {
            return 1;
        }

        @Override // com.smartdigimkt.w3.e0
        public int b() {
            return 1;
        }

        @Override // com.smartdigimkt.w3.e0
        public int a(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.smartdigimkt.w3.e0
        public com.smartdigimkt.w3.e0.c a(int i2, com.smartdigimkt.w3.e0.c cVar, boolean z2, long j) {
            return cVar.a(null, -9223372036854775807L, -9223372036854775807L, false, true, j > 0 ? -9223372036854775807L : 0L, -9223372036854775807L, 0, 0, 0L);
        }

        @Override // com.smartdigimkt.w3.e0
        public com.smartdigimkt.w3.e0.b a(int i2, com.smartdigimkt.w3.e0.b bVar, boolean z2) {
            return bVar.a(null, null, 0, -9223372036854775807L, 0L);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f35983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f35984b;

        public e(Runnable runnable) {
            this.f35984b = runnable;
            this.f35983a = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        public void a() {
            this.f35983a.post(this.f35984b);
        }
    }

    public static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f35992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f35993c;

        public g(int i2, T t, Runnable runnable) {
            this.f35991a = i2;
            this.f35993c = runnable != null ? new e(runnable) : null;
            this.f35992b = t;
        }
    }

    public i() {
        this(false, (a0) new a0.a(0));
    }

    private void b(int i2, Collection<f> collection) {
        Iterator<f> it = collection.iterator();
        while (it.hasNext()) {
            a(i2, it.next());
            i2++;
        }
    }

    private void e(int i2) {
        f fVarRemove = this.k0.remove(i2);
        c cVar = fVarRemove.f35987c;
        a(i2, -1, -cVar.b(), -cVar.a());
        fVarRemove.f35989h = true;
        if (fVarRemove.f35990i.isEmpty()) {
            a(fVarRemove);
        }
    }

    private void o() {
        for (int size = this.k0.size() - 1; size >= 0; size--) {
            e(size);
        }
    }

    private void q() {
        this.r0 = false;
        List arrayList = this.n0.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(this.n0);
        this.n0.clear();
        a(new b(this.k0, this.t0, this.u0, this.s0, this.o0), (Object) null);
        if (arrayList.isEmpty()) {
            return;
        }
        this.q0.a((com.smartdigimkt.w3.x.b) this).a(6).a(arrayList).l();
    }

    public final synchronized s c(int i2) {
        return this.j0.get(i2).f35985a;
    }

    public final synchronized void d(int i2) {
        a(i2, (Runnable) null);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public final void g() {
        super.g();
        this.k0.clear();
        this.q0 = null;
        this.s0 = this.s0.d();
        this.t0 = 0;
        this.u0 = 0;
    }

    public final synchronized void n() {
        a((Runnable) null);
    }

    public final synchronized int p() {
        return this.j0.size();
    }

    public i(boolean z2) {
        this(z2, new a0.a(0));
    }

    public i(boolean z2, a0 a0Var) {
        this(z2, a0Var, new s[0]);
    }

    private void b(int i2, int i3) {
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int iB = this.k0.get(iMin).f35988e;
        int iA = this.k0.get(iMin).f;
        List<f> list = this.k0;
        list.add(i3, list.remove(i2));
        while (iMin <= iMax) {
            f fVar = this.k0.get(iMin);
            fVar.f35988e = iB;
            fVar.f = iA;
            iB += fVar.f35987c.b();
            iA += fVar.f35987c.a();
            iMin++;
        }
    }

    public i(s... sVarArr) {
        this(false, sVarArr);
    }

    public final synchronized void a(s sVar) {
        a(this.j0.size(), sVar, (Runnable) null);
    }

    public i(boolean z2, s... sVarArr) {
        this(z2, new a0.a(0), sVarArr);
    }

    public final synchronized void a(s sVar, Runnable runnable) {
        a(this.j0.size(), sVar, runnable);
    }

    public static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f35985a;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35988e;
        public int f;
        public boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f35989h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f35987c = new c();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<l> f35990i = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f35986b = new Object();

        public f(s sVar) {
            this.f35985a = sVar;
        }

        public void a(int i2, int i3, int i4) {
            this.d = i2;
            this.f35988e = i3;
            this.f = i4;
            this.g = false;
            this.f35989h = false;
            this.f35990i.clear();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            return this.f - fVar.f;
        }
    }

    public i(boolean z2, a0 a0Var, s... sVarArr) {
        for (s sVar : sVarArr) {
            com.smartdigimkt.p4.a.a(sVar);
        }
        this.s0 = a0Var.a() > 0 ? a0Var.d() : a0Var;
        this.m0 = new IdentityHashMap();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.n0 = new ArrayList();
        this.l0 = new f(null);
        this.o0 = z2;
        this.p0 = new com.smartdigimkt.w3.e0.c();
        a((Collection<s>) Arrays.asList(sVarArr));
    }

    public final synchronized void a(int i2, s sVar) {
        a(i2, sVar, (Runnable) null);
    }

    public final synchronized void a(int i2, s sVar, Runnable runnable) {
        try {
            com.smartdigimkt.p4.a.a(sVar);
            f fVar = new f(sVar);
            this.j0.add(i2, fVar);
            com.smartdigimkt.w3.h hVar = this.q0;
            if (hVar != null) {
                hVar.a((com.smartdigimkt.w3.x.b) this).a(0).a(new g(i2, fVar, runnable)).l();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int b(int i2) {
        f fVar = this.l0;
        fVar.f = i2;
        int iBinarySearch = Collections.binarySearch(this.k0, fVar);
        if (iBinarySearch < 0) {
            return (-iBinarySearch) - 2;
        }
        while (iBinarySearch < this.k0.size() - 1) {
            int i3 = iBinarySearch + 1;
            if (this.k0.get(i3).f != i2) {
                break;
            }
            iBinarySearch = i3;
        }
        return iBinarySearch;
    }

    public final synchronized void a(Collection<s> collection) {
        a(this.j0.size(), collection, (Runnable) null);
    }

    public final synchronized void a(Collection<s> collection, Runnable runnable) {
        a(this.j0.size(), collection, runnable);
    }

    public final synchronized void a(int i2, Collection<s> collection) {
        a(i2, collection, (Runnable) null);
    }

    public final synchronized void a(int i2, Collection<s> collection, Runnable runnable) {
        try {
            Iterator<s> it = collection.iterator();
            while (it.hasNext()) {
                com.smartdigimkt.p4.a.a(it.next());
            }
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<s> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(new f(it2.next()));
            }
            this.j0.addAll(i2, arrayList);
            if (this.q0 != null && !collection.isEmpty()) {
                this.q0.a((com.smartdigimkt.w3.x.b) this).a(1).a(new g(i2, arrayList, runnable)).l();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i2, Runnable runnable) {
        try {
            this.j0.remove(i2);
            com.smartdigimkt.w3.h hVar = this.q0;
            if (hVar != null) {
                hVar.a((com.smartdigimkt.w3.x.b) this).a(2).a(new g(i2, null, runnable)).l();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i2, int i3) {
        a(i2, i3, (Runnable) null);
    }

    public final synchronized void a(int i2, int i3, Runnable runnable) {
        if (i2 == i3) {
            return;
        }
        try {
            List<f> list = this.j0;
            list.add(i3, list.remove(i2));
            com.smartdigimkt.w3.h hVar = this.q0;
            if (hVar != null) {
                hVar.a((com.smartdigimkt.w3.x.b) this).a(3).a(new g(i2, Integer.valueOf(i3), runnable)).l();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Runnable runnable) {
        try {
            this.j0.clear();
            com.smartdigimkt.w3.h hVar = this.q0;
            if (hVar != null) {
                hVar.a((com.smartdigimkt.w3.x.b) this).a(4).a(runnable != null ? new e(runnable) : null).l();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public final synchronized void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        try {
            super.a(hVar, z2);
            this.q0 = hVar;
            if (this.j0.isEmpty()) {
                q();
            } else {
                this.s0 = this.s0.a(0, this.j0.size());
                b(0, this.j0);
                a((e) null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.smartdigimkt.j4.s
    public final r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        f fVar = this.k0.get(b(aVar.f36015a));
        l lVar = new l(fVar.f35985a, aVar.a(aVar.f36015a - fVar.f), bVar);
        this.m0.put(lVar, fVar);
        fVar.f35990i.add(lVar);
        if (fVar.g) {
            lVar.a();
        }
        return lVar;
    }

    @Override // com.smartdigimkt.j4.s
    public final void a(r rVar) {
        f fVarRemove = this.m0.remove(rVar);
        ((l) rVar).d();
        fVarRemove.f35990i.remove(rVar);
        if (fVarRemove.f35990i.isEmpty() && fVarRemove.f35989h) {
            a(fVarRemove);
        }
    }

    @Override // com.smartdigimkt.j4.f
    public final void a(f fVar, s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj) {
        a(fVar, e0Var);
    }

    @Override // com.smartdigimkt.j4.f
    public s.a a(f fVar, s.a aVar) {
        for (int i2 = 0; i2 < fVar.f35990i.size(); i2++) {
            if (fVar.f35990i.get(i2).f35994Y.d == aVar.d) {
                return aVar.a(aVar.f36015a + fVar.f);
            }
        }
        return null;
    }

    @Override // com.smartdigimkt.j4.f
    public int a(f fVar, int i2) {
        return i2 + fVar.f35988e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.w3.x.b
    public final void a(int i2, Object obj) throws com.smartdigimkt.w3.g {
        switch (i2) {
            case 0:
                g gVar = (g) obj;
                this.s0 = this.s0.a(gVar.f35991a, 1);
                a(gVar.f35991a, (f) gVar.f35992b);
                a(gVar.f35993c);
                return;
            case 1:
                g gVar2 = (g) obj;
                this.s0 = this.s0.a(gVar2.f35991a, ((Collection) gVar2.f35992b).size());
                b(gVar2.f35991a, (Collection<f>) gVar2.f35992b);
                a(gVar2.f35993c);
                return;
            case 2:
                g gVar3 = (g) obj;
                this.s0 = this.s0.b(gVar3.f35991a);
                e(gVar3.f35991a);
                a(gVar3.f35993c);
                return;
            case 3:
                g gVar4 = (g) obj;
                a0 a0VarB = this.s0.b(gVar4.f35991a);
                this.s0 = a0VarB;
                this.s0 = a0VarB.a(((Integer) gVar4.f35992b).intValue(), 1);
                b(gVar4.f35991a, ((Integer) gVar4.f35992b).intValue());
                a(gVar4.f35993c);
                return;
            case 4:
                o();
                a((e) obj);
                return;
            case 5:
                q();
                return;
            case 6:
                List list = (List) obj;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((e) list.get(i3)).a();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(e eVar) {
        if (!this.r0) {
            this.q0.a((com.smartdigimkt.w3.x.b) this).a(5).l();
            this.r0 = true;
        }
        if (eVar != null) {
            this.n0.add(eVar);
        }
    }

    private void a(int i2, f fVar) {
        if (i2 > 0) {
            f fVar2 = this.k0.get(i2 - 1);
            fVar.a(i2, fVar2.f35987c.b() + fVar2.f35988e, fVar2.f35987c.a() + fVar2.f);
        } else {
            fVar.a(i2, 0, 0);
        }
        a(i2, 1, fVar.f35987c.b(), fVar.f35987c.a());
        this.k0.add(i2, fVar);
        a(fVar, fVar.f35985a);
    }

    private void a(f fVar, com.smartdigimkt.w3.e0 e0Var) {
        if (fVar != null) {
            c cVar = fVar.f35987c;
            if (cVar.d() == e0Var) {
                return;
            }
            int iB = e0Var.b() - cVar.b();
            int iA = e0Var.a() - cVar.a();
            if (iB != 0 || iA != 0) {
                a(fVar.d + 1, 0, iB, iA);
            }
            fVar.f35987c = cVar.a(e0Var);
            if (!fVar.g && !e0Var.c()) {
                e0Var.a(0, this.p0);
                long jB = this.p0.b() + this.p0.f();
                for (int i2 = 0; i2 < fVar.f35990i.size(); i2++) {
                    l lVar = fVar.f35990i.get(i2);
                    lVar.d(jB);
                    lVar.a();
                }
                fVar.g = true;
            }
            a((e) null);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void a(int i2, int i3, int i4, int i5) {
        this.t0 += i4;
        this.u0 += i5;
        while (i2 < this.k0.size()) {
            this.k0.get(i2).d += i3;
            this.k0.get(i2).f35988e += i4;
            this.k0.get(i2).f += i5;
            i2++;
        }
    }
}
