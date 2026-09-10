package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.s7;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J \u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/px;", "Lcom/ironsource/s7;", "Smash", "", "", d.f25770h, "b", "c", "(Ljava/util/List;)Lcom/ironsource/s7;", "", "a", "smash", "Lcom/ironsource/qx;", "d", "Lcom/ironsource/t0;", "Lcom/ironsource/t0;", "managerData", "<init>", "(Lcom/ironsource/t0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class px<Smash extends s7<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0 managerData;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.a(Integer.valueOf(((s7) t).i().l()), Integer.valueOf(((s7) t2).i().l()));
        }
    }

    public px(t0 managerData) {
        Intrinsics.f(managerData, "managerData");
        this.managerData = managerData;
    }

    public final boolean a(s7<?> smash, List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.f(smash, "smash");
        Intrinsics.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((s7) next).x()) {
                return Intrinsics.a(next, smash);
            }
        }
        next = null;
        return Intrinsics.a(next, smash);
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        Intrinsics.f(waterfall, "waterfall");
        return CollectionsKt.c0(new a(), waterfall);
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((s7) next).B()) {
                return (Smash) next;
            }
        }
        next = null;
        return (Smash) next;
    }

    public final qx<Smash> d(List<? extends Smash> waterfall) {
        Intrinsics.f(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.managerData.getAdUnit().name() + " waterfall size: " + waterfall.size());
        rx<Smash> rxVarA = rx.INSTANCE.a(this.managerData.getAdvancedLoading() ? nx.BIDDER_SENSITIVE : nx.DEFAULT, this.managerData.getMaxSmashesToLoad(), this.managerData.getCom.ironsource.mediationsdk.d.z java.lang.String(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            rxVarA.d(it.next());
            if (rxVarA.e()) {
                return new qx<>(rxVarA);
            }
        }
        return new qx<>(rxVarA);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i2;
        Intrinsics.f(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((s7) it.next()).y() && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i2 >= this.managerData.getMaxSmashesToLoad();
    }
}
