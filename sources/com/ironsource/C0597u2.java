package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0597u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f30780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0649x0 f30781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f30782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0365h2 f30783d;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30784a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30784a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements S1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0615v2 f30786b;

        public b(InterfaceC0615v2 interfaceC0615v2) {
            this.f30786b = interfaceC0615v2;
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction) {
            kotlin.jvm.internal.n.f(auction, "auction");
            C0597u2.this.b(auction, this.f30786b);
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction, String error) {
            kotlin.jvm.internal.n.f(auction, "auction");
            kotlin.jvm.internal.n.f(error, "error");
            C0597u2.this.b(auction, this.f30786b);
        }
    }

    public C0597u2(V0 adTools, AbstractC0649x0 adUnitData) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f30780a = adTools;
        this.f30781b = adUnitData;
        C0561s2 c0561s2E = adUnitData.e();
        String strD = IronSourceUtils.d();
        kotlin.jvm.internal.n.e(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c0561s2E, strD));
        this.f30782c = eVar;
        this.f30783d = new C0365h2(adTools, eVar);
    }

    private final InterfaceC0644wd c() {
        int i10 = a.f30784a[this.f30781b.b().e().ordinal()];
        if (i10 == 1) {
            return Kb.f26413u.d().B();
        }
        if (i10 != 2) {
            return null;
        }
        return Kb.f26413u.d().F();
    }

    private final C0404j6 d() {
        InterfaceC0644wd interfaceC0644wdC = c();
        if (interfaceC0644wdC != null) {
            return interfaceC0644wdC.a(this.f30781b.b().c());
        }
        return null;
    }

    public final C0365h2 b() {
        return this.f30783d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(S1 s10, InterfaceC0615v2 interfaceC0615v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(wi.d.j(s10.d().d(), "auction waterfallString = ")));
        if (!s10.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f30780a.d().b().a(1005, "No candidates available for auctioning");
            interfaceC0615v2.a(B0.e(this.f30781b.b().a()), "no available ad to load");
        } else {
            this.f30780a.d().b().b(s10.d().d().toString());
            int iE = this.f30780a.e();
            this.f30782c.a(ContextProvider.getInstance().getApplicationContext(), a(s10, iE), new c(interfaceC0615v2, s10, s10.d().c()));
        }
    }

    public void a(InterfaceC0615v2 completionListener) {
        kotlin.jvm.internal.n.f(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f30780a.d().b().a(this.f30781b.b().d());
        a(new S1(this.f30780a, this.f30781b, d()), completionListener);
    }

    /* JADX INFO: renamed from: com.ironsource.u2$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements U1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0615v2 f30787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S1 f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f30789c;

        public c(InterfaceC0615v2 interfaceC0615v2, S1 s10, B b10) {
            this.f30787a = interfaceC0615v2;
            this.f30788b = s10;
            this.f30789c = b10;
        }

        @Override // com.ironsource.U1
        public void a(List<C0526q2> newWaterfall, String auctionId, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) {
            kotlin.jvm.internal.n.f(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            this.f30787a.a(newWaterfall, this.f30788b.c(), auctionId, c0526q2, jSONObject, jSONObject2, i10, j10, i11, str, this.f30789c);
        }

        @Override // com.ironsource.U1
        public void a(int i10, String str, int i11, String auctionFallback, long j10) {
            kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
            this.f30787a.a(i10, str, i11, auctionFallback, j10, this.f30789c);
        }
    }

    private final void a(S1 s10, InterfaceC0615v2 interfaceC0615v2) {
        if (!s10.f()) {
            b(s10, interfaceC0615v2);
        } else {
            s10.a(new b(interfaceC0615v2));
        }
    }

    private final com.ironsource.mediationsdk.h a(S1 s10, int i10) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.f30781b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(s10.d().a());
        hVar.a(s10.d().b());
        hVar.a(this.f30780a.g());
        hVar.a(i10);
        hVar.a(this.f30780a.j());
        Tf tfG = this.f30781b.b().g();
        hVar.e(tfG != null ? tfG.c() : false);
        hVar.a(this.f30781b.b().d());
        B bC = s10.d().c();
        hVar.d(bC != null ? bC.p() : null);
        InterfaceC0418k2 interfaceC0418k2H = this.f30780a.h();
        if (interfaceC0418k2H != null) {
            interfaceC0418k2H.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C0506p0.a(this.f30780a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C0506p0.a(this.f30780a, (String) null, (String) null, 2, (Object) null);
    }
}
