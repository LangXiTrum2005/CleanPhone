package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x9 extends v2 implements z6 {
    public final /* synthetic */ z6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(String url, z6 eventTracker) {
        super(v2.c.GET, url, ae.NORMAL, null);
        Intrinsics.f(url, "url");
        Intrinsics.f(eventTracker, "eventTracker");
        this.k = eventTracker;
    }

    public final String a(CBError cBError) {
        return "Error " + cBError.getType() + ": " + cBError.getMessage() + " for URL " + e();
    }

    public final String b(y2 y2Var) {
        if (y2Var.c()) {
            return null;
        }
        return "Server error " + y2Var.b() + " for URL " + e();
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.k.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.k.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.k.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.k.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.k.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.k.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(CBError cBError, y2 y2Var) {
        String strA;
        za.b("Impression tracking request failed", cBError != null ? cBError : new Exception("Null CBError"));
        if (y2Var == null || (strA = b(y2Var)) == null) {
            strA = cBError != null ? a(cBError) : "";
        }
        track((ch) new u6(fh.e.IMPRESSION_TRACKER_FAILURE, strA, null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.k.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.k.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.k.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.k.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.k.mo189track(event);
    }
}
