package com.ironsource;

import com.ironsource.AbstractC0401j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wg<Smash extends AbstractC0401j3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f27611a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return j1.f.h(Integer.valueOf(((AbstractC0401j3) t10).i().l()), Integer.valueOf(((AbstractC0401j3) t11).i().l()));
        }
    }

    public Wg(W managerData) {
        kotlin.jvm.internal.n.f(managerData, "managerData");
        this.f27611a = managerData;
    }

    public final boolean a(AbstractC0401j3<?> smash, List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.n.f(smash, "smash");
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC0401j3) next).x()) {
                return kotlin.jvm.internal.n.a(next, smash);
            }
        }
        next = null;
        return kotlin.jvm.internal.n.a(next, smash);
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        return xj.n.I0(waterfall, new a());
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC0401j3) next).B()) {
                return (Smash) next;
            }
        }
        next = null;
        return (Smash) next;
    }

    public final Xg<Smash> d(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f27611a.b().name() + " waterfall size: " + waterfall.size());
        ch<Smash> chVarA = ch.f28397g.a(this.f27611a.c() ? Tg.BIDDER_SENSITIVE : Tg.DEFAULT, this.f27611a.i(), this.f27611a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            chVarA.d(it.next());
            if (chVarA.e()) {
                return new Xg<>(chVarA);
            }
        }
        return new Xg<>(chVarA);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i10;
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC0401j3) it.next()).y() && (i10 = i10 + 1) < 0) {
                    xj.o.U();
                    throw null;
                }
            }
        }
        return i10 >= this.f27611a.i();
    }
}
