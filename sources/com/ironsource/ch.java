package com.ironsource;

import com.ironsource.AbstractC0401j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ch<Smash extends AbstractC0401j3<?>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28397g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Smash> f28400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Smash> f28401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Smash> f28402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Smash> f28403f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ch$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class C0068a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28404a;

            static {
                int[] iArr = new int[Tg.values().length];
                try {
                    iArr[Tg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28404a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <Smash extends AbstractC0401j3<?>> ch<Smash> a(Tg loadingStrategy, int i10, boolean z10, List<? extends Smash> waterfall) {
            kotlin.jvm.internal.n.f(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.n.f(waterfall, "waterfall");
            int i11 = C0068a.f28404a[loadingStrategy.ordinal()];
            if (i11 == 1) {
                return new I4(i10, z10, waterfall);
            }
            if (i11 != 2) {
                throw new aa.b((byte) 0, 20);
            }
            return new C0509p3(i10, z10, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ch(int i10, boolean z10, List<? extends Smash> waterfall) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        this.f28398a = i10;
        this.f28399b = z10;
        this.f28400c = waterfall;
        this.f28401d = new ArrayList();
        this.f28402e = new ArrayList();
        this.f28403f = new ArrayList();
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final List<Smash> a() {
        return this.f28403f;
    }

    public final List<Smash> c() {
        return this.f28401d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.f28403f.size() + this.f28402e.size() + this.f28401d.size();
    }

    public boolean e() {
        return d() >= this.f28398a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(Smash smash) {
        kotlin.jvm.internal.n.f(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f28402e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f28403f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f28403f.add(smash);
            return;
        }
        if (!this.f28399b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    private final int b() {
        Integer num;
        List<Smash> list = this.f28400c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC0401j3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC0401j3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC0401j3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
