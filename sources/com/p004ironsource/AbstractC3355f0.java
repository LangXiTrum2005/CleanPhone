package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0003\n\u0004\u000fB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/f0;", "", "", "Lcom/ironsource/z;", "b", m5.f25675p, "Lcom/ironsource/f0$b;", "loadSelection", "", "", "a", "Lcom/ironsource/jx;", "waterfallInstances", "d", "Lcom/ironsource/f0$c;", "c", "Lcom/ironsource/u1;", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/jx;", "<init>", "(Lcom/ironsource/u1;Lcom/ironsource/jx;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbstractC3355f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx waterfallInstances;

    /* JADX INFO: renamed from: com.ironsource.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/f0$a;", "", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/jx;", "waterfallInstances", "Lcom/ironsource/f0;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.ironsource.f0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0277a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24956a;

            static {
                int[] iArr = new int[nx.values().length];
                try {
                    iArr[nx.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nx.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24956a = iArr;
            }
        }

        private Companion() {
        }

        public final AbstractC3355f0 a(u1 adUnitData, jx waterfallInstances) {
            Intrinsics.f(adUnitData, "adUnitData");
            Intrinsics.f(waterfallInstances, "waterfallInstances");
            int i2 = C0277a.f24956a[(adUnitData.getAdvancedLoading() ? nx.BIDDER_SENSITIVE : nx.DEFAULT).ordinal()];
            if (i2 == 1) {
                return new w7(adUnitData, waterfallInstances);
            }
            if (i2 == 2) {
                return adUnitData.getCom.ironsource.mediationsdk.d.z java.lang.String() ? new ru(adUnitData, waterfallInstances) : new ja(adUnitData, waterfallInstances);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f0$b */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/f0$b;", "", "", "e", f.j, "", g.f40227p, "", "Lcom/ironsource/z;", "a", "Ljava/util/List;", "()Ljava/util/List;", "instancesToLoad", "b", "loadedInstances", "c", "loadingInProgressInstances", "d", "Z", "()Z", "(Z)V", "isBidderReached", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<AbstractC3389z> instancesToLoad = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<AbstractC3389z> loadedInstances = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<AbstractC3389z> loadingInProgressInstances = new ArrayList();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean isBidderReached;

        public final List<AbstractC3389z> a() {
            return this.instancesToLoad;
        }

        public final List<AbstractC3389z> b() {
            return this.loadedInstances;
        }

        public final List<AbstractC3389z> c() {
            return this.loadingInProgressInstances;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsBidderReached() {
            return this.isBidderReached;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.instancesToLoad.isEmpty() && this.loadingInProgressInstances.isEmpty();
        }

        public final int g() {
            return this.loadingInProgressInstances.size() + this.loadedInstances.size() + this.instancesToLoad.size();
        }

        public final void a(boolean z2) {
            this.isBidderReached = z2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f0$c */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J%\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/f0$c;", "", "Lcom/ironsource/z;", "a", "", "b", "instanceToShow", "orderedInstances", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/z;", "c", "()Lcom/ironsource/z;", "Ljava/util/List;", "d", "()Ljava/util/List;", "<init>", "(Lcom/ironsource/z;Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC3389z instanceToShow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<AbstractC3389z> orderedInstances;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC3389z abstractC3389z, List<? extends AbstractC3389z> orderedInstances) {
            Intrinsics.f(orderedInstances, "orderedInstances");
            this.instanceToShow = abstractC3389z;
            this.orderedInstances = orderedInstances;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, AbstractC3389z abstractC3389z, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                abstractC3389z = cVar.instanceToShow;
            }
            if ((i2 & 2) != 0) {
                list = cVar.orderedInstances;
            }
            return cVar.a(abstractC3389z, list);
        }

        public final List<AbstractC3389z> b() {
            return this.orderedInstances;
        }

        public final AbstractC3389z c() {
            return this.instanceToShow;
        }

        public final List<AbstractC3389z> d() {
            return this.orderedInstances;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.a(this.instanceToShow, cVar.instanceToShow) && Intrinsics.a(this.orderedInstances, cVar.orderedInstances);
        }

        public int hashCode() {
            AbstractC3389z abstractC3389z = this.instanceToShow;
            return this.orderedInstances.hashCode() + ((abstractC3389z == null ? 0 : abstractC3389z.hashCode()) * 31);
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.instanceToShow + ", orderedInstances=" + this.orderedInstances + ')';
        }

        public final c a(AbstractC3389z instanceToShow, List<? extends AbstractC3389z> orderedInstances) {
            Intrinsics.f(orderedInstances, "orderedInstances");
            return new c(instanceToShow, orderedInstances);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC3389z getInstanceToShow() {
            return this.instanceToShow;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f0$d */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.a(Integer.valueOf(((AbstractC3389z) t).getAuctionResponseItem().l()), Integer.valueOf(((AbstractC3389z) t2).getAuctionResponseItem().l()));
        }
    }

    public AbstractC3355f0(u1 adUnitData, jx waterfallInstances) {
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        this.adUnitData = adUnitData;
        this.waterfallInstances = waterfallInstances;
    }

    private final List<AbstractC3389z> b() {
        return CollectionsKt.c0(new d(), this.waterfallInstances.b());
    }

    public abstract void a(AbstractC3389z instance, b loadSelection);

    public boolean a(b loadSelection) {
        Intrinsics.f(loadSelection, "loadSelection");
        return loadSelection.g() >= this.adUnitData.getMaxInstancesToLoad();
    }

    public final c c() {
        Object next;
        List<AbstractC3389z> listB = b();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC3389z) next).getIsInstanceLoaded()) {
                return new c((AbstractC3389z) next, listB);
            }
        }
        next = null;
        return new c((AbstractC3389z) next, listB);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.adUnitData.getAdProperties().getAdFormat().name() + " waterfall size: " + this.waterfallInstances.b().size());
        b bVar = new b();
        Iterator<AbstractC3389z> it = this.waterfallInstances.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    private final boolean b(AbstractC3389z instance, b loadSelection) {
        IronLog ironLog;
        StringBuilder sb;
        String str;
        List<AbstractC3389z> listC;
        if (!instance.getIsInstanceFailed()) {
            if (!instance.getIsInstanceLoaded()) {
                if (instance.getIsInstanceLoading()) {
                    IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceSignature() + " still loading");
                    listC = loadSelection.c();
                } else if (a(instance, this.waterfallInstances)) {
                    ironLog = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(instance.getAdFormat().name());
                    sb.append(" - Instance ");
                    sb.append(instance.getInstanceSignature());
                    str = " is not better than already loaded instances";
                } else {
                    a(instance, loadSelection);
                }
                return a(loadSelection);
            }
            IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceSignature() + " is already loaded");
            listC = loadSelection.b();
            listC.add(instance);
            return a(loadSelection);
        }
        ironLog = IronLog.INTERNAL;
        sb = new StringBuilder();
        sb.append(instance.getAdFormat().name());
        sb.append(" - Instance ");
        sb.append(instance.getInstanceSignature());
        str = " is failed to load";
        sb.append(str);
        ironLog.verbose(sb.toString());
        return a(loadSelection);
    }

    public final boolean a(AbstractC3389z instance) {
        Object next;
        Intrinsics.f(instance, "instance");
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC3389z) next).getIsInstanceFailed()) {
                return Intrinsics.a(next, instance);
            }
        }
        next = null;
        return Intrinsics.a(next, instance);
    }

    public boolean a(AbstractC3389z instance, jx waterfallInstances) {
        Intrinsics.f(instance, "instance");
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final boolean a() {
        int i2;
        List<AbstractC3389z> listB = this.waterfallInstances.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((AbstractC3389z) it.next()).getIsInstanceLoaded() && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i2 >= this.adUnitData.getMaxInstancesToLoad();
    }
}
