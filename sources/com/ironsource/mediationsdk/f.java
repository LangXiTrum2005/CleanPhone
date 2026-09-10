package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C0436l2;
import com.ironsource.C0561s2;
import com.ironsource.U1;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0561s2 f29532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29533b;

    public f(C0561s2 settings, String sessionId) {
        kotlin.jvm.internal.n.f(settings, "settings");
        kotlin.jvm.internal.n.f(sessionId, "sessionId");
        this.f29532a = settings;
        this.f29533b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, h auctionRequestParams, U1 auctionListener) throws JSONException {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        kotlin.jvm.internal.n.f(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.f29532a.a(auctionRequestParams.t());
        return auctionRequestParams.t() ? new C0436l2(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.u(), this.f29532a) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.u(), this.f29532a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f29532a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f29532a.n();
    }

    private final JSONObject a(Context context, h hVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(hVar);
        kotlin.jvm.internal.n.e(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }
}
