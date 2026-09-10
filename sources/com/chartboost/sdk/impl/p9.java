package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p9 implements q9, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f14820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f14822c;
    public final n0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9 f14823e;
    public final l1 f;
    public final k6 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hd f14824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z6 f14825i;
    public boolean j;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14826a;

        static {
            int[] iArr = new int[w9.values().length];
            try {
                iArr[w9.DISPLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w9.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14826a = iArr;
        }
    }

    public p9(z adUnit, String location, y adType, n0 adUnitRendererImpressionCallback, u9 impressionIntermediateCallback, l1 appRequest, k6 downloader, hd openMeasurementImpressionCallback, z6 eventTracker) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(location, "location");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14820a = adUnit;
        this.f14821b = location;
        this.f14822c = adType;
        this.d = adUnitRendererImpressionCallback;
        this.f14823e = impressionIntermediateCallback;
        this.f = appRequest;
        this.g = downloader;
        this.f14824h = openMeasurementImpressionCallback;
        this.f14825i = eventTracker;
        this.j = true;
    }

    public final void a() {
        za.b("Dismissing impression", (Throwable) null, 2, (Object) null);
        this.f14823e.a(w9.DISMISSING);
        b();
    }

    public final void b() {
        za.b("Removing impression", (Throwable) null, 2, (Object) null);
        this.f14823e.a(w9.NONE);
        this.f14823e.n();
        this.g.c();
    }

    @Override // com.chartboost.sdk.impl.q9
    public void c() {
        this.d.a(this.f14820a.m());
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14825i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14825i.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.q9
    public void f(boolean z2) {
        this.j = z2;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14825i.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14825i.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14825i.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14825i.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14825i.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14825i.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14825i.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14825i.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14825i.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.q9
    public void a(w9 state) {
        Intrinsics.f(state, "state");
        this.j = true;
        this.f14824h.a(PlayerState.NORMAL);
        int i2 = a.f14826a[state.ordinal()];
        if (i2 == 1) {
            a();
        } else if (i2 == 2) {
            b();
            track((ch) new h5(fh.i.CLOSE_BEFORE_TEMPLATE_SHOW_ERROR, "onClose with state Loaded", this.f14822c.b(), this.f14821b, null, null, 48, null));
        }
        this.d.a(this.f);
    }
}
