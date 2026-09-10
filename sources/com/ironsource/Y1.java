package com.ironsource;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1 implements Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0479n9 f27953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f27954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0347g2 f27955c;

    public Y1(C0479n9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, C0347g2 c0347g2) {
        kotlin.jvm.internal.n.f(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.n.f(auctionDataUtils, "auctionDataUtils");
        this.f27953a = instanceInfo;
        this.f27954b = auctionDataUtils;
        this.f27955c = c0347g2;
    }

    @Override // com.ironsource.Z1
    public void a(String methodName) {
        List<String> listB;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        C0347g2 c0347g2 = this.f27955c;
        if (c0347g2 == null || (listB = c0347g2.b()) == null) {
            listB = xj.v.f53866a;
        }
        a(listB, methodName);
    }

    @Override // com.ironsource.Z1
    public void b(String methodName) {
        List<String> listA;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        C0347g2 c0347g2 = this.f27955c;
        if (c0347g2 == null || (listA = c0347g2.a()) == null) {
            listA = xj.v.f53866a;
        }
        a(listA, methodName);
    }

    @Override // com.ironsource.Z1
    public void c(String methodName) {
        List<String> listC;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        C0347g2 c0347g2 = this.f27955c;
        if (c0347g2 == null || (listC = c0347g2.c()) == null) {
            listC = xj.v.f53866a;
        }
        a(listC, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f27954b.a(str, this.f27953a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f27953a.e(), this.f27953a.f(), this.f27953a.d(), "", "", "", ""));
        }
    }
}
