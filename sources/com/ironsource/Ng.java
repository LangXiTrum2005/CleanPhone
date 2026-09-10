package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Ng {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26665d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f26666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0649x0 f26667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vc f26668c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Ng a(V0 adTools, AbstractC0649x0 adUnitData) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            return adUnitData.t() ? new C0579t2(adTools, adUnitData) : new Ec(adTools, adUnitData);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26669a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26669a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements Vc {
    }

    public Ng(V0 adTools, AbstractC0649x0 adUnitData) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f26666a = adTools;
        this.f26667b = adUnitData;
        this.f26668c = new c();
    }

    private final InterfaceC0644wd b() {
        int i10 = b.f26669a[this.f26667b.b().a().ordinal()];
        if (i10 == 1) {
            return Kb.f26413u.d().B();
        }
        if (i10 == 2) {
            return Kb.f26413u.d().F();
        }
        IronLog.INTERNAL.warning(C0506p0.a(this.f26666a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    public Vc a() {
        return this.f26668c;
    }

    public abstract void a(E e10, Og og2);

    public final void c() {
        InterfaceC0644wd interfaceC0644wdB = b();
        if (interfaceC0644wdB == null) {
            return;
        }
        interfaceC0644wdB.a(this.f26667b.b().c(), false);
    }

    public static /* synthetic */ Pg a(Ng ng, List list, Map map, C0472n2 c0472n2, E e10, B b10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i10 & 16) != 0) {
            b10 = null;
        }
        return ng.a(list, map, c0472n2, e10, b10);
    }

    public final Pg a(List<? extends C0526q2> waterfallItems, Map<String, I> adInstancePayloads, C0472n2 auctionData, E adInstanceFactory, B b10) {
        kotlin.jvm.internal.n.f(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.n.f(adInstancePayloads, "adInstancePayloads");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f26666a, l1.d.e(waterfallItems.size(), "waterfall.size() = "), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C0526q2 c0526q2 = waterfallItems.get(i10);
            if (!z10 && b10 != null && kotlin.jvm.internal.n.a(b10.p(), c0526q2.c())) {
                b10.a(c0526q2);
                arrayList.add(b10);
                z10 = true;
            } else {
                B bA = a(c0526q2, auctionData, adInstanceFactory, adInstancePayloads.get(c0526q2.c()));
                if (bA != null && bA.g() != null) {
                    arrayList.add(bA);
                }
            }
        }
        if (b10 != null && !z10) {
            c();
        }
        Pg pg2 = new Pg(arrayList);
        IronLog.INTERNAL.verbose(C0506p0.a(this.f26666a, defpackage.e.n("updateWaterfall() - next waterfall is ", pg2.d()), (String) null, 2, (Object) null));
        return pg2;
    }

    private final B a(C0526q2 c0526q2, C0472n2 c0472n2, E e10, I i10) {
        AbstractC0649x0 abstractC0649x0 = this.f26667b;
        String strC = c0526q2.c();
        kotlin.jvm.internal.n.e(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC0649x0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c0526q2.c();
            kotlin.jvm.internal.n.e(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (i10 == null) {
            String strC3 = c0526q2.c();
            kotlin.jvm.internal.n.e(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f26667b.b().a(), this.f26667b.b().b());
        int iE = this.f26666a.e();
        AbstractC0649x0 abstractC0649x1 = this.f26667b;
        return e10.a(new C(abstractC0649x1, networkSettingsA, c0472n2, new C0310e1(networkSettingsA, abstractC0649x1.b(networkSettingsA), this.f26667b.b().a()), c0526q2, iE, false, 64, null), i10);
    }

    private final void a(String str, String str2) {
        String strI = wi.d.i(str, " - item = ", str2);
        IronLog.INTERNAL.error(C0506p0.a(this.f26666a, strI, (String) null, 2, (Object) null));
        this.f26666a.d().h().i(strI);
    }
}
