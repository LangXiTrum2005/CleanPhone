package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ia implements b3.a, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f14169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef f14170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f14171c;
    public final EndpointRepository d;

    public ia(z2 networkService, ef requestBodyBuilder, z6 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        this.f14169a = networkService;
        this.f14170b = requestBodyBuilder;
        this.f14171c = eventTracker;
        this.d = endpointRepository;
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14171c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14171c.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14171c.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14171c.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14171c.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14171c.track(chVar);
    }

    public final void a() {
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.INSTALL);
        String strA = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.e(path, "getPath(...)");
        b3 b3Var = new b3(strA, path, this.f14170b.a(), ae.NORMAL, this, this.f14171c, (uf) null, 64, (DefaultConstructorMarker) null);
        b3Var.s = true;
        this.f14169a.a(b3Var);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14171c.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14171c.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14171c.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14171c.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14171c.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        String errorDesc;
        if (cBError == null || (errorDesc = cBError.getErrorDesc()) == null) {
            errorDesc = "Install failure";
        }
        track((ch) new u6(fh.f.INSTALL_REQUEST_ERROR, errorDesc, null, null, null, 28, null));
    }
}
