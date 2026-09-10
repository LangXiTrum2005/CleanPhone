package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class V0 extends C0506p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0506p0 f27320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S0 f27321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC0418k2 f27322i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C0506p0 adTools, AbstractC0649x0 adUnitData, F0.b level) {
        super(adTools, level);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(level, "level");
        this.f27320g = adTools;
        S0 s0A = If.a(adUnitData, adUnitData.e().c());
        kotlin.jvm.internal.n.e(s0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f27321h = s0A;
    }

    public final void a(InterfaceC0418k2 interfaceC0418k2) {
        this.f27322i = interfaceC0418k2;
    }

    public final String e(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        String strC = com.ironsource.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.n.e(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    public final S0 g() {
        return this.f27321h;
    }

    public final InterfaceC0418k2 h() {
        return this.f27322i;
    }

    public final String i() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    public final C0265ba j() {
        return If.a();
    }

    public final M8.a k() {
        return Kb.f26413u.a().i();
    }

    public final void a(AbstractRunnableC0430ke task) {
        kotlin.jvm.internal.n.f(task, "task");
        Jf.f26356a.b(task);
    }

    public final BaseAdAdapter<?, ?> a(C instanceData) {
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.v(), instanceData.i(), instanceData.j().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(V0 adUnitTools, F0.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(level, "level");
        this.f27320g = adUnitTools.f27320g;
        this.f27321h = adUnitTools.f27321h;
        this.f27322i = adUnitTools.f27322i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.a adFormat, UUID adId) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long j10, String instanceName) {
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        String strA = IronSourceUtils.a(j10, instanceName);
        kotlin.jvm.internal.n.e(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }
}
