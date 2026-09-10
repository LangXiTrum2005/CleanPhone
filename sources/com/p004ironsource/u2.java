package com.p004ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.sdk.controller.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B\u0019\b\u0016\u0012\u0006\u00101\u001a\u00020\u0000\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bJ(\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017J\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bJ\b\u0010\u001c\u001a\u0004\u0018\u00010\bR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R$\u0010*\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b\u000e\u0010)¨\u00063"}, d2 = {"Lcom/ironsource/u2;", "Lcom/ironsource/m1;", "Lcom/ironsource/ks;", "task", "", "c", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "l", "", m5.s, "e", "Lcom/ironsource/a0;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "a", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Ljava/util/UUID;", f.b.AD_ID, "Lcom/ironsource/ii$a;", "m", "", "k", "", "timeStamp", "instanceName", "j", g.f40227p, "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/q2;", h.f36614b, "Lcom/ironsource/q2;", "()Lcom/ironsource/q2;", "auctionHistory", "Lcom/ironsource/g5;", i.f37957c, "Lcom/ironsource/g5;", "()Lcom/ironsource/g5;", "(Lcom/ironsource/g5;)V", "auctionRequestEnricher", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/c2$b;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/u1;Lcom/ironsource/c2$b;)V", "adUnitTools", "(Lcom/ironsource/u2;Lcom/ironsource/c2$b;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class u2 extends m1 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q2 auctionHistory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private g5 auctionRequestEnricher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(m1 adTools, u1 adUnitData, c2.b level) {
        super(adTools, level);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(level, "level");
        this.adTools = adTools;
        q2 q2VarA = av.a(adUnitData, adUnitData.getAuctionSettings().c());
        Intrinsics.e(q2VarA, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.auctionHistory = q2VarA;
    }

    public final BaseAdAdapter<?, ?> a(C3344a0 instanceData) {
        Intrinsics.f(instanceData, "instanceData");
        return c.b().a(instanceData.u(), instanceData.getAdFormat(), instanceData.i().getAdProperties().getAdId());
    }

    public final void c(ks task) {
        Intrinsics.f(task, "task");
        bv.a(bv.f24465a, task, 0L, 2, null);
    }

    public final String e(String serverData) {
        Intrinsics.f(serverData, "serverData");
        String strC = d.b().c(serverData);
        Intrinsics.e(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q2 getAuctionHistory() {
        return this.auctionHistory;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g5 getAuctionRequestEnricher() {
        return this.auctionRequestEnricher;
    }

    public final String j() {
        return p.j().i();
    }

    public final Map<String, String> k() {
        return p.j().p();
    }

    public final IronSourceSegment l() {
        return av.a();
    }

    public final ii.a m() {
        return on.INSTANCE.a().e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(u2 adUnitTools, c2.b level) {
        super(adUnitTools, level);
        Intrinsics.f(adUnitTools, "adUnitTools");
        Intrinsics.f(level, "level");
        this.adTools = adUnitTools.adTools;
        this.auctionHistory = adUnitTools.auctionHistory;
        this.auctionRequestEnricher = adUnitTools.auctionRequestEnricher;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.AD_UNIT adFormat, UUID adId) {
        Intrinsics.f(providerSettings, "providerSettings");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adId, "adId");
        return c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long timeStamp, String instanceName) {
        Intrinsics.f(instanceName, "instanceName");
        String transId = IronSourceUtils.getTransId(timeStamp, instanceName);
        Intrinsics.e(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }

    public final void a(g5 g5Var) {
        this.auctionRequestEnricher = g5Var;
    }
}
