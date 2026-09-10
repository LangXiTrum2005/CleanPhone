package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0579t2 extends Ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V0 f30714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0649x0 f30715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0597u2 f30716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Vc f30717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC0615v2 f30718i;

    /* JADX INFO: renamed from: com.ironsource.t2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0615v2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f30720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Og f30721c;

        public a(E e10, Og og2) {
            this.f30720b = e10;
            this.f30721c = og2;
        }

        @Override // com.ironsource.InterfaceC0615v2
        public void a(final List<C0526q2> newWaterfall, final Map<String, I> adInstancePayloads, final String auctionId, final C0526q2 c0526q2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i10, final long j10, final int i11, final String str, final B b10) {
            kotlin.jvm.internal.n.f(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.n.f(adInstancePayloads, "adInstancePayloads");
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            V0 v4 = C0579t2.this.f30714e;
            final C0579t2 c0579t2 = C0579t2.this;
            final E e10 = this.f30720b;
            final Og og2 = this.f30721c;
            v4.c(new Runnable() { // from class: com.ironsource.ni
                @Override // java.lang.Runnable
                public final void run() {
                    C0579t2.a.a(c0579t2, e10, og2, newWaterfall, adInstancePayloads, auctionId, c0526q2, jSONObject, jSONObject2, i10, j10, i11, str, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0579t2 this$0, E adInstanceFactory, Og waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str, B b10) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.n.f(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.n.f(newWaterfall, "$newWaterfall");
            kotlin.jvm.internal.n.f(adInstancePayloads, "$adInstancePayloads");
            kotlin.jvm.internal.n.f(auctionId, "$auctionId");
            this$0.f30718i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c0526q2, jSONObject, jSONObject2, i10, j10, i11, str, b10);
        }

        @Override // com.ironsource.InterfaceC0615v2
        public void a(final int i10, final String str, final int i11, final String auctionFallback, final long j10, final B b10) {
            kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
            V0 v4 = C0579t2.this.f30714e;
            final C0579t2 c0579t2 = C0579t2.this;
            final E e10 = this.f30720b;
            final Og og2 = this.f30721c;
            v4.c(new Runnable() { // from class: com.ironsource.oi
                @Override // java.lang.Runnable
                public final void run() {
                    C0579t2.a.a(c0579t2, e10, og2, i10, str, i11, auctionFallback, j10, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0579t2 this$0, E adInstanceFactory, Og waterfallFetcherListener, int i10, String str, int i11, String auctionFallback, long j10, B b10) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.n.f(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.n.f(auctionFallback, "$auctionFallback");
            this$0.f30718i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i10, str, i11, auctionFallback, j10, b10);
        }

        @Override // com.ironsource.InterfaceC0615v2
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            this.f30721c.a(i10, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579t2(V0 adTools, AbstractC0649x0 adUnitData) {
        super(adTools, adUnitData);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f30714e = adTools;
        this.f30715f = adUnitData;
        C0597u2 c0597u2 = new C0597u2(adTools, adUnitData);
        this.f30716g = c0597u2;
        this.f30717h = c0597u2.b();
    }

    @Override // com.ironsource.Ng
    public Vc a() {
        return this.f30717h;
    }

    @Override // com.ironsource.Ng
    public void a(E adInstanceFactory, Og waterfallFetcherListener) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f30716g.a(aVar);
        this.f30718i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e10, Og og2, List<C0526q2> list, Map<String, I> map, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2, B b10) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, (String) null, (String) null, 3, (Object) null));
        C0472n2 c0472n2 = new C0472n2(str, jSONObject, c0526q2, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f30714e.d().h().a(i11, str2);
        }
        a(jSONObject2);
        Pg pgA = a(list, map, c0472n2, e10, b10);
        this.f30714e.d().a(new W1(c0472n2));
        this.f30714e.d().b().a(j10, this.f30715f.v() + ";wtf=" + pgA.c());
        this.f30714e.d().b().c(pgA.d());
        a(pgA, og2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e10, Og og2, int i10, String str, int i11, String str2, long j10, B b10) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, "Auction failed (error " + i10 + " - " + str + ")", (String) null, 2, (Object) null));
        if (b10 != null) {
            c();
        }
        boolean zN = this.f30715f.e().n();
        String strA = C0239a2.f28151a.a(zN);
        C0472n2 c0472n2 = new C0472n2(strA, null, null, i11, str2);
        C0690z5 c0690z5D = this.f30714e.d();
        c0690z5D.a(new W1(c0472n2));
        c0690z5D.b().a(j10, i10, str);
        if (zN) {
            a(e10, og2, i11, str2, strA);
        } else {
            a(og2);
        }
    }

    private final void a(Pg pg2, Og og2) {
        this.f30714e.g().a(pg2);
        og2.a(pg2);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f30715f.b(false);
                IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, defpackage.e.n("loading configuration from auction response is null, using the following: ", this.f30715f.v()), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f29352x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f29352x)) > 0) {
                    this.f30715f.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f29353y)) {
                    this.f30715f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f29353y));
                } else if (this.f30715f.b().h() && Kb.f26413u.d().h().l()) {
                    AbstractC0649x0 abstractC0649x0 = this.f30715f;
                    abstractC0649x0.a(Math.max(2, abstractC0649x0.k()));
                }
                this.f30715f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29354z, false));
                IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, this.f30715f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f30715f.b().a() + " Error: " + e10.getMessage());
                ironLog.verbose(C0506p0.a(this.f30714e, this.f30715f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, this.f30715f.v(), (String) null, 2, (Object) null));
            throw th2;
        }
    }

    private final void a(E e10, Og og2, int i10, String str, String str2) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30714e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Ec(this.f30714e, this.f30715f).a(og2, i10, str, str2, e10);
    }

    private final void a(Og og2) {
        og2.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
