package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3750t2 extends ug {
    private final V0 e;
    private final AbstractC3816x0 f;
    private final C3767u2 g;
    private final Qc h;
    private InterfaceC3784v2 i;

    /* JADX INFO: renamed from: com.ironsource.t2$a */
    public static final class a implements InterfaceC3784v2 {
        final /* synthetic */ E b;
        final /* synthetic */ vg c;

        public a(E e, vg vgVar) {
            this.b = e;
            this.c = vgVar;
        }

        @Override // com.ironsource.InterfaceC3784v2
        public void a(final List<C3700q2> newWaterfall, final Map<String, I> adInstancePayloads, final String auctionId, final C3700q2 c3700q2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            V0 v0 = C3750t2.this.e;
            final C3750t2 c3750t2 = C3750t2.this;
            final E e = this.b;
            final vg vgVar = this.c;
            v0.a(new Runnable() { // from class: com.ironsource.collection
                @Override // java.lang.Runnable
                public final void run() {
                    C3750t2.a.a(c3750t2, e, vgVar, newWaterfall, adInstancePayloads, auctionId, c3700q2, jSONObject, jSONObject2, i, j, i2, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3750t2 this$0, E adInstanceFactory, vg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C3700q2 c3700q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c3700q2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.InterfaceC3784v2
        public void a(final int i, final String str, final int i2, final String auctionFallback, final long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            V0 v0 = C3750t2.this.e;
            final C3750t2 c3750t2 = C3750t2.this;
            final E e = this.b;
            final vg vgVar = this.c;
            v0.a(new Runnable() { // from class: com.ironsource.cybernatic
                @Override // java.lang.Runnable
                public final void run() {
                    C3750t2.a.a(c3750t2, e, vgVar, i, str, i2, auctionFallback, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3750t2 this$0, E adInstanceFactory, vg waterfallFetcherListener, int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j);
        }

        @Override // com.ironsource.InterfaceC3784v2
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.c.a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3750t2(V0 adTools, AbstractC3816x0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = adTools;
        this.f = adUnitData;
        C3767u2 c3767u2 = new C3767u2(adTools, adUnitData);
        this.g = c3767u2;
        this.h = c3767u2.b();
    }

    @Override // com.ironsource.ug
    public Qc a() {
        return this.h;
    }

    @Override // com.ironsource.ug
    public void a(E adInstanceFactory, vg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, vg vgVar, List<C3700q2> list, Map<String, I> map, String str, C3700q2 c3700q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(C3681p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C3647n2 c3647n2 = new C3647n2(str, jSONObject, c3700q2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.e().h().a(i2, str2);
        }
        a(jSONObject2);
        wg wgVarA = a(list, map, c3647n2, e);
        this.e.e().a(new W1(c3647n2));
        this.e.e().b().a(j, this.f.v() + ";wtf=" + wgVarA.c());
        this.e.e().b().c(wgVarA.d());
        a(wgVarA, vgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, vg vgVar, int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose(C3681p0.a(this.e, "Auction failed (error " + i + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f.e().n();
        String strA = C3414a2.a.a(zN);
        C3647n2 c3647n2 = new C3647n2(strA, null, null, i2, str2);
        C3838y5 c3838y5E = this.e.e();
        c3838y5E.a(new W1(c3647n2));
        c3838y5E.b().a(j, i, str);
        if (zN) {
            a(e, vgVar, i2, str2, strA);
        } else {
            a(vgVar);
        }
    }

    private final void a(wg wgVar, vg vgVar) {
        this.e.h().a(wgVar);
        vgVar.a(wgVar);
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C3681p0.a(this.e, "loading configuration from auction response is null, using the following: " + this.f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && Gb.s.d().h().k()) {
                    AbstractC3816x0 abstractC3816x0 = this.f;
                    abstractC3816x0.a(Math.max(2, abstractC3816x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(C3681p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C3631m4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C3681p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C3681p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    private final void a(E e, vg vgVar, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C3681p0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new C3862zc(this.e, this.f).a(vgVar, i, str, str2, e);
    }

    private final void a(vg vgVar) {
        vgVar.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
