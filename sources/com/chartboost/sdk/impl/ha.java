package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.p004ironsource.qt;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ha implements b3.a, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f14100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef f14101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f14102c;
    public final EndpointRepository d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w4 f14103e;

    public ha(z2 networkService, ef requestBodyBuilder, z6 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        this.f14100a = networkService;
        this.f14101b = requestBodyBuilder;
        this.f14102c = eventTracker;
        this.d = endpointRepository;
    }

    public final void a(w4 callback) {
        Intrinsics.f(callback, "callback");
        this.f14103e = callback;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.CONFIG);
        String strA = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.e(path, "getPath(...)");
        b3 b3Var = new b3(strA, path, this.f14101b.a(), ae.HIGH, this, this.f14102c, (uf) null, 64, (DefaultConstructorMarker) null);
        b3Var.f15349i = v2.b.ASYNC;
        b3Var.s = true;
        this.f14100a.a(b3Var);
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14102c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14102c.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14102c.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14102c.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14102c.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14102c.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14102c.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14102c.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14102c.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14102c.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14102c.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        String errorDesc;
        if (cBError == null || (errorDesc = cBError.getErrorDesc()) == null) {
            errorDesc = "Config failure";
        }
        String str = errorDesc;
        track((ch) new u6(fh.f.CONFIG_REQUEST_ERROR, str, null, null, null, 28, null));
        w4 w4Var = this.f14103e;
        if (w4Var != null) {
            w4Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
        JSONObject jSONObjectA = s2.a(jSONObject, qt.f26623n);
        w4 w4Var = this.f14103e;
        if (w4Var != null) {
            Intrinsics.c(jSONObjectA);
            w4Var.a(jSONObjectA);
        }
    }
}
