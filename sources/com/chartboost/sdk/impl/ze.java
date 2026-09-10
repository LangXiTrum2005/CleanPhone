package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ze implements ye, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f15738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z6 f15739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f15740c;
    public WeakReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15741e;

    public ze(d9 impressionActivityIntentWrapper, z6 eventTracker) {
        Intrinsics.f(impressionActivityIntentWrapper, "impressionActivityIntentWrapper");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f15738a = impressionActivityIntentWrapper;
        this.f15739b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a(int i2, boolean z2) {
        b bVar;
        WeakReference weakReference = this.f15740c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i2, z2);
    }

    @Override // com.chartboost.sdk.impl.ye
    public void b() {
        Unit unit;
        l0 l0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            unit = null;
        } else {
            l0Var.y();
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("Bridge onPause missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ye
    public void c() {
        Unit unit;
        l0 l0Var;
        d();
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            unit = null;
        } else {
            l0Var.x();
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("Bridge onDestroy missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
        WeakReference weakReference2 = this.f15740c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference weakReference3 = this.d;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f15739b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15739b.clearFromStorage(chVar);
    }

    public final void d() {
        if (this.f15741e) {
            return;
        }
        track((ch) new u6(fh.i.DISMISS_MISSING, "dismiss_missing happened due to sdk closure outside expected flow", null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.ye
    public void e() {
        l0 l0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            return;
        }
        l0Var.e();
    }

    @Override // com.chartboost.sdk.impl.ye
    public void finishActivity() {
        b bVar;
        this.f15741e = true;
        WeakReference weakReference = this.f15740c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.ye
    public void onResume() {
        Unit unit;
        l0 l0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            unit = null;
        } else {
            l0Var.r();
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("Bridge onResume missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ye
    public void onStart() {
        Unit unit;
        l0 l0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            unit = null;
        } else {
            l0Var.p();
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("Bridge onStart missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15739b.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f15739b.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f15739b.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15739b.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a(ij viewBase) {
        Unit unit;
        b bVar;
        Intrinsics.f(viewBase, "viewBase");
        WeakReference weakReference = this.f15740c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            unit = null;
        } else {
            bVar.a(viewBase);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("activityInterface is null", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f15739b.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f15739b.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f15739b.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f15739b.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f15739b.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a(CBError.Impression error) {
        l0 l0Var;
        Intrinsics.f(error, "error");
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            return;
        }
        l0Var.a(error);
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a() {
        b bVar;
        WeakReference weakReference = this.f15740c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a(b activityInterface, CBImpressionActivity activity) {
        l0 l0Var;
        Intrinsics.f(activityInterface, "activityInterface");
        Intrinsics.f(activity, "activity");
        this.f15740c = new WeakReference(activityInterface);
        WeakReference weakReference = this.d;
        if (weakReference == null || (l0Var = (l0) weakReference.get()) == null) {
            return;
        }
        l0Var.a(activity);
    }

    @Override // com.chartboost.sdk.impl.ye
    public void a(l0 adUnitRendererActivityInterface) {
        Intrinsics.f(adUnitRendererActivityInterface, "adUnitRendererActivityInterface");
        this.d = new WeakReference(adUnitRendererActivityInterface);
        try {
            d9 d9Var = this.f15738a;
            d9Var.a(d9Var.a());
        } catch (Exception e2) {
            za.b("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions", e2);
            a(CBError.Impression.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }
}
