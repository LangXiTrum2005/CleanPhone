package com.p004ironsource;

import com.p004ironsource.mediationsdk.h;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ironsource/q2;", "Lcom/ironsource/mediationsdk/h;", "", "", "Lcom/ironsource/h0;", "waterfallPerformance", "", "a", "Lcom/ironsource/jx;", "waterfallInstances", "instanceName", "Lcom/ironsource/j0;", "e", "Ljava/util/Map;", "allInstancesPerformance", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "providers", "", "limit", "<init>", "(Ljava/util/List;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class q2 extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C3363j0> allInstancesPerformance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(List<? extends NetworkSettings> providers, int i2) {
        super(providers, i2);
        Intrinsics.f(providers, "providers");
        int iH = MapsKt.h(CollectionsKt.n(providers, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((NetworkSettings) it.next()).getProviderName(), new C3363j0(i2));
        }
        this.allInstancesPerformance = linkedHashMap;
    }

    @Override // com.p004ironsource.mediationsdk.h
    public String a(String instanceName) {
        String strD;
        Intrinsics.f(instanceName, "instanceName");
        C3363j0 c3363j0 = this.allInstancesPerformance.get(instanceName);
        return (c3363j0 == null || (strD = c3363j0.d()) == null) ? "" : strD;
    }

    public final void a(jx waterfallInstances) {
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        List<AbstractC3389z> listB = waterfallInstances.b();
        int iH = MapsKt.h(CollectionsKt.n(listB, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (AbstractC3389z abstractC3389z : listB) {
            linkedHashMap.put(abstractC3389z.getInstanceName(), abstractC3389z.getPerformance());
        }
        a(linkedHashMap);
    }

    private final void a(Map<String, C3359h0> waterfallPerformance) {
        for (Map.Entry<String, C3363j0> entry : this.allInstancesPerformance.entrySet()) {
            entry.getValue().a(waterfallPerformance.get(entry.getKey()));
        }
    }
}
