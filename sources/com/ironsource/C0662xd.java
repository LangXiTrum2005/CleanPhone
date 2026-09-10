package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0662xd implements InterfaceC0680yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f31069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0649x0 f31070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jk.b f31071c;

    /* JADX INFO: renamed from: com.ironsource.xd$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31072a = new a();

        public a() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(V0 tools) {
            kotlin.jvm.internal.n.f(tools, "tools");
            return new V0(tools, F0.b.PROVIDER);
        }
    }

    public C0662xd(V0 adUnitTools, AbstractC0649x0 adUnitData, jk.b createProviderTools) {
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(createProviderTools, "createProviderTools");
        this.f31069a = adUnitTools;
        this.f31070b = adUnitData;
        this.f31071c = createProviderTools;
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set setR0 = xj.n.R0(list);
        HashMap map = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.f31070b.m()) {
            if (setR0.contains(networkSettings.getProviderInstanceName())) {
                String providerInstanceName = networkSettings.getProviderInstanceName();
                kotlin.jvm.internal.n.e(providerInstanceName, "provider.providerInstanceName");
                map.put(providerInstanceName, networkSettings);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) map.get((String) it.next());
            if (networkSettings2 != null) {
                arrayList.add(networkSettings2);
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.InterfaceC0680yd
    public List<C0404j6> a(List<String> instances) {
        kotlin.jvm.internal.n.f(instances, "instances");
        if (instances.isEmpty()) {
            return xj.v.f53866a;
        }
        List<NetworkSettings> listB = b(instances);
        C0472n2 c0472n2A = a();
        ArrayList arrayList = new ArrayList(xj.p.W(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a(c0472n2A, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C0662xd(V0 v4, AbstractC0649x0 abstractC0649x0, jk.b bVar, int i10, kotlin.jvm.internal.g gVar) {
        this(v4, abstractC0649x0, (i10 & 4) != 0 ? a.f31072a : bVar);
    }

    private final C0404j6 a(C0472n2 c0472n2, NetworkSettings networkSettings) {
        I i10 = new I(this.f31069a, this.f31070b, networkSettings);
        return new C0404j6((V0) this.f31071c.invoke(this.f31069a), new C(this.f31070b, networkSettings, c0472n2, new C0310e1(networkSettings, this.f31070b.b(networkSettings), this.f31070b.b().a()), new C0526q2(networkSettings.getProviderInstanceName()), this.f31069a.e(), true), i10);
    }

    private final C0472n2 a() {
        return new C0472n2("", new JSONObject(), null, 0, "");
    }
}
