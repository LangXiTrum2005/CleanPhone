package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26207c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0649x0 f26208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pg f26209b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class C0040a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26210a;

            static {
                int[] iArr = new int[Tg.values().length];
                try {
                    iArr[Tg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f26210a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final H a(AbstractC0649x0 adUnitData, Pg waterfallInstances) {
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            int i10 = C0040a.f26210a[(adUnitData.d() ? Tg.BIDDER_SENSITIVE : Tg.DEFAULT).ordinal()];
            if (i10 == 1) {
                return new C0491o3(adUnitData, waterfallInstances);
            }
            if (i10 == 2) {
                return adUnitData.q() ? new C0664xf(adUnitData, waterfallInstances) : new G4(adUnitData, waterfallInstances);
            }
            throw new aa.b((byte) 0, 20);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<B> f26211a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<B> f26212b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<B> f26213c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26214d;

        public final List<B> a() {
            return this.f26211a;
        }

        public final List<B> b() {
            return this.f26212b;
        }

        public final List<B> c() {
            return this.f26213c;
        }

        public final boolean d() {
            return this.f26214d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f26211a.isEmpty() && this.f26213c.isEmpty();
        }

        public final int g() {
            return this.f26213c.size() + this.f26212b.size() + this.f26211a.size();
        }

        public final void a(boolean z10) {
            this.f26214d = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final B f26215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<B> f26216b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(B b10, List<? extends B> orderedInstances) {
            kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
            this.f26215a = b10;
            this.f26216b = orderedInstances;
        }

        public final B a() {
            return this.f26215a;
        }

        public final List<B> b() {
            return this.f26216b;
        }

        public final B c() {
            return this.f26215a;
        }

        public final List<B> d() {
            return this.f26216b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f26215a, cVar.f26215a) && kotlin.jvm.internal.n.a(this.f26216b, cVar.f26216b);
        }

        public int hashCode() {
            B b10 = this.f26215a;
            return this.f26216b.hashCode() + ((b10 == null ? 0 : b10.hashCode()) * 31);
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f26215a + ", orderedInstances=" + this.f26216b + ")";
        }

        public final c a(B b10, List<? extends B> orderedInstances) {
            kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
            return new c(b10, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, B b10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b10 = cVar.f26215a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f26216b;
            }
            return cVar.a(b10, list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return j1.f.h(Integer.valueOf(((B) t10).h().l()), Integer.valueOf(((B) t11).h().l()));
        }
    }

    public H(AbstractC0649x0 adUnitData, Pg waterfallInstances) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        this.f26208a = adUnitData;
        this.f26209b = waterfallInstances;
    }

    private final List<B> b() {
        return xj.n.I0(this.f26209b.b(), new d());
    }

    public abstract void a(B b10, b bVar);

    public boolean a(B instance, Pg waterfallInstances) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final c c() {
        Object next;
        List<B> listB = b();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((B) next).x()) {
                return new c((B) next, listB);
            }
        }
        next = null;
        return new c((B) next, listB);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.f26208a.b().a().name() + " waterfall size: " + this.f26209b.b().size());
        b bVar = new b();
        boolean zL = Kb.f26413u.d().h().l();
        Iterator<B> it = this.f26209b.b().iterator();
        while (it.hasNext() && !a(it.next(), bVar, zL)) {
        }
        return bVar;
    }

    public final boolean a(B instance) {
        Object next;
        kotlin.jvm.internal.n.f(instance, "instance");
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((B) next).w()) {
                return kotlin.jvm.internal.n.a(next, instance);
            }
        }
        next = null;
        return kotlin.jvm.internal.n.a(next, instance);
    }

    public final boolean a() {
        int i10;
        List<B> listB = this.f26209b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((B) it.next()).x() && (i10 = i10 + 1) < 0) {
                    xj.o.U();
                    throw null;
                }
            }
        }
        return i10 >= this.f26208a.k();
    }

    public boolean a(b loadSelection) {
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f26208a.k();
    }

    private final boolean a(B b10, b bVar, boolean z10) {
        if (b10.w()) {
            IronLog.INTERNAL.verbose(b10.d().name() + " - Instance " + b10.q() + " is failed to load");
        } else if (b10.x() && !b10.A()) {
            IronLog.INTERNAL.verbose(b10.d().name() + " - Instance " + b10.q() + " is already loaded");
            bVar.b().add(b10);
        } else if (b10.y()) {
            IronLog.INTERNAL.verbose(b10.d().name() + " - Instance " + b10.q() + " still loading");
            bVar.c().add(b10);
        } else if (a(b10, this.f26209b) && !z10) {
            IronLog.INTERNAL.verbose(b10.d().name() + " - Instance " + b10.q() + " is not better than already loaded instances");
        } else {
            a(b10, bVar);
        }
        return a(bVar);
    }
}
