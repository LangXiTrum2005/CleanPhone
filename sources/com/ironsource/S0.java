package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class S0 extends C0257b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, L> f27155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(List<? extends NetworkSettings> providers, int i10) {
        super(providers, i10);
        kotlin.jvm.internal.n.f(providers, "providers");
        int iO = xj.b0.O(xj.p.W(providers, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((NetworkSettings) it.next()).getProviderName(), new L(i10));
        }
        this.f27155e = linkedHashMap;
    }

    public final void a(Pg waterfallInstances) {
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        List<B> listB = waterfallInstances.b();
        int iO = xj.b0.O(xj.p.W(listB, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (B b10 : listB) {
            linkedHashMap.put(b10.p(), b10.t());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.C0257b2
    public String a(String instanceName) {
        String strD;
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        L l = this.f27155e.get(instanceName);
        return (l == null || (strD = l.d()) == null) ? "" : strD;
    }

    private final void a(Map<String, J> map) {
        for (Map.Entry<String, L> entry : this.f27155e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
