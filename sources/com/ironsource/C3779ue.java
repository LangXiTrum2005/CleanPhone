package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3779ue {
    private final Be a;
    private final C3834y1 b;
    private final D9 c;
    private final Td d;
    private final R9 e;

    public C3779ue() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(Context context, Fe serverResponse) {
        P3.c.C0372c c0372cM;
        JSONObject jSONObjectU;
        String strC;
        P3.c.C0372c c0372cM2;
        String strQ;
        Boolean boolT;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        P3.c cVarG = serverResponse.d().g();
        this.a.a(context, InterfaceC3806w7.a, (cVarG == null || (boolT = cVarG.t()) == null) ? true : boolT.booleanValue());
        P3.c cVarG2 = serverResponse.d().g();
        if (cVarG2 != null && (c0372cM2 = cVarG2.m()) != null && (strQ = c0372cM2.q()) != null) {
            this.b.a(strQ);
            this.c.a(strQ);
            this.d.a(strQ);
        }
        P3.b bVarF = serverResponse.d().f();
        if (bVarF != null && (strC = bVarF.c()) != null) {
            this.e.b(strC);
        }
        P3.c cVarG3 = serverResponse.d().g();
        if (cVarG3 == null || (c0372cM = cVarG3.m()) == null || (jSONObjectU = c0372cM.u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(jSONObjectU.toString());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("events");
        if (jSONObjectOptJSONObject != null) {
            Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(\"events\")");
            jSONObject.remove("events");
            Map<String, String> mapB = IronSourceUtils.b(jSONObjectOptJSONObject);
            this.b.b(mapB);
            this.c.b(mapB);
            this.d.b(mapB);
        }
        Map<String, String> mapB2 = IronSourceUtils.b(jSONObject);
        this.b.a(mapB2);
        this.c.a(mapB2);
        this.d.a(mapB2);
    }

    public C3779ue(Be sharedPreferences, C3834y1 appEventsManager, D9 interstitialEventsManager, Td rewardedVideoEventsManager, R9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = sharedPreferences;
        this.b = appEventsManager;
        this.c = interstitialEventsManager;
        this.d = rewardedVideoEventsManager;
        this.e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3779ue(Be be, C3834y1 c3834y1, D9 d9, Td td, R9 r9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        be = (i & 1) != 0 ? new Ae() : be;
        c3834y1 = (i & 2) != 0 ? Gb.s.d().q() : c3834y1;
        if ((i & 4) != 0) {
            d9 = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9, "getInstance()");
        }
        if ((i & 8) != 0) {
            td = Td.i();
            Intrinsics.checkNotNullExpressionValue(td, "getInstance()");
        }
        this(be, c3834y1, d9, td, (i & 16) != 0 ? new R9() : r9);
    }
}
