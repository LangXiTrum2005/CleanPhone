package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0554rd implements InterfaceC0572sd, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f30165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0680yd f30167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V0 f30168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jk.b f30170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<C0404j6> f30171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f30174k;
    private boolean l;

    public C0554rd(String adUnitId, List<String> instanceNames, int i10, InterfaceC0680yd fetcher, V0 adUnitTools) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(instanceNames, "instanceNames");
        kotlin.jvm.internal.n.f(fetcher, "fetcher");
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        this.f30164a = adUnitId;
        this.f30165b = instanceNames;
        this.f30166c = i10;
        this.f30167d = fetcher;
        this.f30168e = adUnitTools;
        this.f30169f = true;
        this.f30171h = xj.v.f53866a;
    }

    private final void d() {
        if (this.f30172i >= this.f30171h.size()) {
            return;
        }
        this.f30173j++;
        C0404j6 c0404j6 = this.f30171h.get(this.f30172i);
        this.f30172i++;
        c0404j6.a(this);
    }

    @Override // com.ironsource.InterfaceC0572sd
    public boolean a() {
        return this.f30169f;
    }

    @Override // com.ironsource.InterfaceC0572sd
    public String b() {
        return this.f30164a;
    }

    @Override // com.ironsource.InterfaceC0572sd
    public C0404j6 c() {
        Integer num = this.f30174k;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (this.l) {
            return null;
        }
        this.l = true;
        return this.f30171h.get(iIntValue);
    }

    private final void b(boolean z10) {
        if (this.f30173j > 0) {
            return;
        }
        if (!z10) {
            this.f30168e.d().e().a();
        }
        jk.b bVar = this.f30170g;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(z10));
        }
        this.f30170g = null;
    }

    @Override // com.ironsource.InterfaceC0572sd
    public void a(jk.b callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f30168e.d().e().b();
        this.f30169f = false;
        this.f30170g = callback;
        List<C0404j6> listA = this.f30167d.a(this.f30165b);
        if (listA.isEmpty()) {
            b(false);
            return;
        }
        this.f30171h = listA;
        int iMin = Math.min(this.f30166c, listA.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            d();
        }
    }

    @Override // com.ironsource.G
    public void b(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        int iA = a(instance);
        if (iA == -1) {
            instance.c();
            IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.f30173j--;
        if (this.l) {
            instance.c();
        } else {
            a(iA);
            b(true);
        }
    }

    @Override // com.ironsource.InterfaceC0572sd
    public void a(boolean z10) {
        if (!this.l) {
            IronLog.INTERNAL.warning("reset before getting instance for adUnitId: " + b());
            return;
        }
        this.l = false;
        this.f30172i = 0;
        this.f30173j = 0;
        this.f30170g = null;
        this.f30169f = z10;
        if (z10) {
            this.f30171h = xj.v.f53866a;
            this.f30174k = null;
        }
    }

    private final void a(int i10) {
        Integer num = this.f30174k;
        if (num == null) {
            this.f30168e.d().e().c();
            this.f30174k = Integer.valueOf(i10);
        } else {
            int iMin = Math.min(i10, num.intValue());
            this.f30171h.get(Math.max(i10, num.intValue())).c();
            this.f30174k = Integer.valueOf(iMin);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(instance, "instance");
        if (a(instance) == -1) {
            IronLog.INTERNAL.warning("stale load failure callback for adUnitId: " + b());
            return;
        }
        this.f30173j--;
        if (this.f30174k != null) {
            b(true);
        } else if (this.f30172i < this.f30171h.size()) {
            d();
        } else {
            b(false);
        }
    }

    private final int a(B b10) {
        Iterator<C0404j6> it = this.f30171h.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
