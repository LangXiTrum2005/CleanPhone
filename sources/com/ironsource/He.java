package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class He {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oe f26248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0668y1 f26249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G9 f26250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0359ge f26251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U9 f26252e;

    public He() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(Context context, Se serverResponse) {
        P3.c.C0046c c0046cM;
        JSONObject jSONObjectU;
        String strC;
        P3.c.C0046c c0046cM2;
        String strQ;
        Boolean boolT;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        P3.c cVarG = serverResponse.d().g();
        this.f26248a.a(context, InterfaceC0674y7.f31293a, (cVarG == null || (boolT = cVarG.t()) == null) ? true : boolT.booleanValue());
        P3.c cVarG2 = serverResponse.d().g();
        if (cVarG2 != null && (c0046cM2 = cVarG2.m()) != null && (strQ = c0046cM2.q()) != null) {
            this.f26249b.a(strQ);
            this.f26250c.a(strQ);
            this.f26251d.a(strQ);
        }
        P3.b bVarF = serverResponse.d().f();
        if (bVarF != null && (strC = bVarF.c()) != null) {
            this.f26252e.b(strC);
        }
        P3.c cVarG3 = serverResponse.d().g();
        if (cVarG3 == null || (c0046cM = cVarG3.m()) == null || (jSONObjectU = c0046cM.u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(jSONObjectU.toString());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("events");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.remove("events");
            Map<String, String> mapB = IronSourceUtils.b(jSONObjectOptJSONObject);
            this.f26249b.b(mapB);
            this.f26250c.b(mapB);
            this.f26251d.b(mapB);
        }
        Map<String, String> mapB2 = IronSourceUtils.b(jSONObject);
        this.f26249b.a(mapB2);
        this.f26250c.a(mapB2);
        this.f26251d.a(mapB2);
    }

    public He(Oe sharedPreferences, C0668y1 appEventsManager, G9 interstitialEventsManager, C0359ge rewardedVideoEventsManager, U9 globalDataWriter) {
        kotlin.jvm.internal.n.f(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.n.f(appEventsManager, "appEventsManager");
        kotlin.jvm.internal.n.f(interstitialEventsManager, "interstitialEventsManager");
        kotlin.jvm.internal.n.f(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        kotlin.jvm.internal.n.f(globalDataWriter, "globalDataWriter");
        this.f26248a = sharedPreferences;
        this.f26249b = appEventsManager;
        this.f26250c = interstitialEventsManager;
        this.f26251d = rewardedVideoEventsManager;
        this.f26252e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ He(Oe oe2, C0668y1 c0668y1, G9 g10, C0359ge c0359ge, U9 u10, int i10, kotlin.jvm.internal.g gVar) {
        oe2 = (i10 & 1) != 0 ? new Ne() : oe2;
        c0668y1 = (i10 & 2) != 0 ? Kb.f26413u.d().q() : c0668y1;
        if ((i10 & 4) != 0) {
            g10 = G9.i();
            kotlin.jvm.internal.n.e(g10, "getInstance()");
        }
        if ((i10 & 8) != 0) {
            c0359ge = C0359ge.i();
            kotlin.jvm.internal.n.e(c0359ge, "getInstance()");
        }
        this(oe2, c0668y1, g10, c0359ge, (i10 & 16) != 0 ? new U9() : u10);
    }
}
