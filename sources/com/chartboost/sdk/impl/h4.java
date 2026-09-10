package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements g4, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mediation f14093c;
    public final /* synthetic */ z6 d;

    public h4(String adType, String location, Mediation mediation, z6 eventTracker) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14091a = adType;
        this.f14092b = location;
        this.f14093c = mediation;
        this.d = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.g4
    public void a(String message) {
        Intrinsics.f(message, "message");
        track((ch) new da(fh.g.SUCCESS, message, this.f14091a, this.f14092b, this.f14093c, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.g4
    public void b(String message) {
        Intrinsics.f(message, "message");
        track((ch) new u6(fh.g.FAILURE, message, this.f14091a, this.f14092b, this.f14093c));
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.d.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.d.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.d.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.d.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.d.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.d.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.d.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.d.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.d.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.d.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.d.mo189track(event);
    }

    public /* synthetic */ h4(String str, String str2, Mediation mediation, z6 z6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "missing ad type" : str, (i2 & 2) != 0 ? "missing location" : str2, (i2 & 4) != 0 ? null : mediation, z6Var);
    }
}
