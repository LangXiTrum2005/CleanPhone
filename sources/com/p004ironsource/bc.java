package com.p004ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.mediationsdk.IronSource;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010<\u001a\u00020;\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001J\u000e\u0010\u0007\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u0010\u0010*R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0007\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b-\u00104R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b#\u00109¨\u0006B"}, d2 = {"Lcom/ironsource/bc;", "Lcom/ironsource/b2;", "Lcom/ironsource/z1;", "event", "", "", "", "a", "eventInterface", "", "", "isPublisherLoad", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Lcom/ironsource/c2;", "b", "Lcom/ironsource/c2;", "wrapper", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "eventsInterfaces", "Lcom/ironsource/si;", "d", "Lcom/ironsource/si;", "()Lcom/ironsource/si;", d9.a.f, "Lcom/ironsource/bn;", "e", "Lcom/ironsource/bn;", "()Lcom/ironsource/bn;", "load", "Lcom/ironsource/gw;", f.j, "Lcom/ironsource/gw;", g.f40227p, "()Lcom/ironsource/gw;", "token", "Lcom/ironsource/q4;", "Lcom/ironsource/q4;", "()Lcom/ironsource/q4;", a4.f, "Lcom/ironsource/m0;", h.f36614b, "Lcom/ironsource/m0;", "()Lcom/ironsource/m0;", "adInteraction", "Lcom/ironsource/lw;", i.f37957c, "Lcom/ironsource/lw;", "()Lcom/ironsource/lw;", "troubleshoot", "Lcom/ironsource/xp;", "j", "Lcom/ironsource/xp;", "()Lcom/ironsource/xp;", "operational", "Lcom/ironsource/c2$b;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "Lcom/ironsource/u7;", "eventManager", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/c2$b;Ljava/util/List;Lcom/ironsource/u7;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bc implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c2 wrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<b2> eventsInterfaces;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final si init;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bn load;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final gw token;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final q4 auction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C3369m0 adInteraction;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final lw troubleshoot;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final xp operational;

    public bc(IronSource.AD_UNIT adFormat, c2.b level, List<? extends b2> eventsInterfaces, u7 u7Var) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(level, "level");
        Intrinsics.f(eventsInterfaces, "eventsInterfaces");
        this.adFormat = adFormat;
        c2 c2Var = new c2(adFormat, level, this, u7Var);
        this.wrapper = c2Var;
        this.eventsInterfaces = CollectionsKt.j0(eventsInterfaces);
        si siVar = c2Var.f24486e;
        Intrinsics.e(siVar, "wrapper.init");
        this.init = siVar;
        bn bnVar = c2Var.f;
        Intrinsics.e(bnVar, "wrapper.load");
        this.load = bnVar;
        gw gwVar = c2Var.g;
        Intrinsics.e(gwVar, "wrapper.token");
        this.token = gwVar;
        q4 q4Var = c2Var.f24487h;
        Intrinsics.e(q4Var, "wrapper.auction");
        this.auction = q4Var;
        C3369m0 c3369m0 = c2Var.f24488i;
        Intrinsics.e(c3369m0, "wrapper.adInteraction");
        this.adInteraction = c3369m0;
        lw lwVar = c2Var.j;
        Intrinsics.e(lwVar, "wrapper.troubleshoot");
        this.troubleshoot = lwVar;
        xp xpVar = c2Var.k;
        Intrinsics.e(xpVar, "wrapper.operational");
        this.operational = xpVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C3369m0 getAdInteraction() {
        return this.adInteraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q4 getAuction() {
        return this.auction;
    }

    public final List<b2> c() {
        return this.eventsInterfaces;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final si getInit() {
        return this.init;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final bn getLoad() {
        return this.load;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final xp getOperational() {
        return this.operational;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final gw getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final lw getTroubleshoot() {
        return this.troubleshoot;
    }

    public /* synthetic */ bc(IronSource.AD_UNIT ad_unit, c2.b bVar, List list, u7 u7Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, bVar, (i2 & 4) != 0 ? EmptyList.X : list, (i2 & 8) != 0 ? null : u7Var);
    }

    @Override // com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        Intrinsics.f(event, "event");
        HashMap map = new HashMap();
        Iterator<b2> it = this.eventsInterfaces.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            Intrinsics.e(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(b2 eventInterface) {
        Intrinsics.f(eventInterface, "eventInterface");
        this.eventsInterfaces.add(eventInterface);
    }

    public final void a(boolean isPublisherLoad) {
        if (isPublisherLoad) {
            this.load.a(true);
        } else {
            if (isPublisherLoad) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.adFormat == IronSource.AD_UNIT.BANNER) {
                this.load.a();
            } else {
                this.load.a(false);
            }
        }
    }
}
