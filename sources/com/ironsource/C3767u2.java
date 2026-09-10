package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3767u2 {
    private final V0 a;
    private final AbstractC3816x0 b;
    private final com.ironsource.mediationsdk.e c;
    private final C3540h2 d;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    public static final class a implements S1.d {
        final /* synthetic */ InterfaceC3784v2 b;

        public a(InterfaceC3784v2 interfaceC3784v2) {
            this.b = interfaceC3784v2;
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C3767u2.this.b(auction, this.b);
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction, String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C3767u2.this.b(auction, this.b);
        }
    }

    public C3767u2(V0 adTools, AbstractC3816x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        C3733s2 c3733s2E = adUnitData.e();
        String strD = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c3733s2E, strD));
        this.c = eVar;
        this.d = new C3540h2(adTools, eVar);
    }

    public final C3540h2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(S1 s1, InterfaceC3784v2 interfaceC3784v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) s1.d().c())));
        if (!s1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC3784v2.a(B0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.e().b().b(s1.d().c().toString());
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(s1, this.a.f()), new b(interfaceC3784v2, s1));
        }
    }

    public void a(InterfaceC3784v2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.a.e().b().a(this.b.b().d());
        a(new S1(this.a, this.b), completionListener);
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    public static final class b implements U1 {
        final /* synthetic */ InterfaceC3784v2 a;
        final /* synthetic */ S1 b;

        public b(InterfaceC3784v2 interfaceC3784v2, S1 s1) {
            this.a = interfaceC3784v2;
            this.b = s1;
        }

        @Override // com.ironsource.U1
        public void a(List<C3700q2> newWaterfall, String auctionId, C3700q2 c3700q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.a.a(newWaterfall, this.b.c(), auctionId, c3700q2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.U1
        public void a(int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.a.a(i, str, i2, auctionFallback, j);
        }
    }

    private final void a(S1 s1, InterfaceC3784v2 interfaceC3784v2) {
        if (!s1.f()) {
            b(s1, interfaceC3784v2);
        } else {
            s1.a(new a(interfaceC3784v2));
        }
    }

    private final com.ironsource.mediationsdk.h a(S1 s1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(s1.d().a());
        hVar.a(s1.d().b());
        hVar.a(this.a.h());
        hVar.a(i);
        hVar.a(this.a.k());
        Df dfG = this.b.b().g();
        hVar.e(dfG != null ? dfG.b() : false);
        hVar.a(this.b.b().d());
        InterfaceC3593k2 interfaceC3593k2I = this.a.i();
        if (interfaceC3593k2I != null) {
            interfaceC3593k2I.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C3681p0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C3681p0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
