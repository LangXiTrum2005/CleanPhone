package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements b3.a, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f14617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef f14618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f14619c;
    public final uf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf f14620e;

    public o0(z2 networkService, ef requestBodyBuilder, z6 eventTracker, uf session) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(session, "session");
        this.f14617a = networkService;
        this.f14618b = requestBodyBuilder;
        this.f14619c = eventTracker;
        this.d = session;
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14619c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14619c.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14619c.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14619c.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14619c.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14619c.track(chVar);
    }

    public final void a(b3 b3Var, yf yfVar) {
        b3Var.a("cached", "0");
        b3Var.a("location", yfVar.c());
        int iE = yfVar.e();
        if (iE >= 0) {
            b3Var.a("video_cached", Integer.valueOf(iE));
        }
        String strA = yfVar.a();
        if (strA == null || strA.length() == 0) {
            return;
        }
        b3Var.a("ad_id", strA);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14619c.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14619c.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14619c.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14619c.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14619c.mo189track(event);
    }

    public final void a(URL url, yf showParams) {
        Intrinsics.f(url, "url");
        Intrinsics.f(showParams, "showParams");
        this.f14620e = showParams;
        String strA = com.chartboost.sdk.internal.Networking.b.a(url);
        String path = url.getPath();
        Intrinsics.e(path, "getPath(...)");
        b3 b3Var = new b3(strA, path, this.f14618b.a(), ae.NORMAL, this, this.f14619c, this.d);
        b3Var.f15349i = v2.b.ASYNC;
        a(b3Var, showParams);
        this.f14617a.a(b3Var);
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        String message;
        fh.i iVar = fh.i.REQUEST_ERROR;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Show failure";
        }
        String str = message;
        yf yfVar = this.f14620e;
        if (yfVar != null) {
            String strB = yfVar.b();
            yf yfVar2 = this.f14620e;
            if (yfVar2 != null) {
                String strC = yfVar2.c();
                yf yfVar3 = this.f14620e;
                if (yfVar3 != null) {
                    track((ch) new u6(iVar, str, strB, strC, yfVar3.d()));
                    return;
                } else {
                    Intrinsics.m("showParams");
                    throw null;
                }
            }
            Intrinsics.m("showParams");
            throw null;
        }
        Intrinsics.m("showParams");
        throw null;
    }
}
