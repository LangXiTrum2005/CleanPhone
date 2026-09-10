package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class y9 implements aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f15620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f15621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6 f15622c;
    public final n0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9 f15623e;
    public final h9 f;
    public final WeakReference g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15625i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15626l;
    public boolean m;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            za.b("Cannot display on host because view was not created!", (Throwable) null, 2, (Object) null);
            y9.this.a(CBError.Impression.ERROR_CREATING_VIEW);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public y9(l1 appRequest, h3 viewProtocol, k6 downloader, ViewGroup viewGroup, n0 adUnitRendererImpressionCallback, u9 impressionIntermediateCallback, h9 impressionClickCallback) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(viewProtocol, "viewProtocol");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.f(impressionClickCallback, "impressionClickCallback");
        this.f15620a = appRequest;
        this.f15621b = viewProtocol;
        this.f15622c = downloader;
        this.d = adUnitRendererImpressionCallback;
        this.f15623e = impressionIntermediateCallback;
        this.f = impressionClickCallback;
        this.g = new WeakReference(viewGroup);
    }

    public final void a(ViewGroup viewGroup, View view) {
        Unit unit;
        Context context;
        this.f15623e.a(w9.DISPLAYED);
        ij ijVarU = this.f15621b.u();
        if (ijVarU == null || (context = ijVarU.getContext()) == null) {
            unit = null;
        } else {
            this.d.a(context);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.b("Missing context on onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
        viewGroup.addView(view);
        this.f15622c.a();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f15621b.y();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void c(boolean z2) {
        this.f15624h = z2;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void d(boolean z2) {
        this.f15626l = z2;
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean e() {
        return this.f15624h;
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean f() {
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void g() {
        this.d.o();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean h() {
        return this.f15625i;
    }

    @Override // com.chartboost.sdk.impl.aa
    public ViewGroup i() {
        return (ViewGroup) this.g.get();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean j() {
        return this.f15626l;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void k() {
        if (a()) {
            return;
        }
        e(true);
        if (j()) {
            this.f15623e.c();
        } else {
            a(CBError.Impression.INTERNAL);
        }
        this.f15621b.a(mi.SKIP);
        this.f15623e.g();
        this.f15621b.C();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void l() {
        this.d.b(this.f15620a);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void onResume() {
        this.f.a(false);
        if (this.k) {
            this.k = false;
            this.f15621b.z();
        }
    }

    @Override // com.chartboost.sdk.impl.aa
    public void onStart() {
        this.f.a(false);
    }

    public void e(boolean z2) {
        this.m = z2;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b(boolean z2) {
        this.f15625i = z2;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(w9 state, CBImpressionActivity activity) {
        Intrinsics.f(state, "state");
        Intrinsics.f(activity, "activity");
        if (state != w9.LOADING) {
            a(activity);
            return;
        }
        za.a("displayOnActivity invalid state: " + state, (Throwable) null, 2, (Object) null);
    }

    public final void a(CBImpressionActivity cBImpressionActivity) {
        this.f15623e.a(w9.DISPLAYED);
        try {
            CBError.Impression impressionA = this.f15621b.a(cBImpressionActivity);
            if (impressionA != null) {
                a(impressionA);
            } else {
                za.c("Displaying the impression", null, 2, null);
            }
        } catch (Exception e2) {
            za.b("Cannot create view in protocol", e2);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(ViewGroup viewGroup) {
        try {
            if (viewGroup == null) {
                za.b("Cannot display on host because it is null!", (Throwable) null, 2, (Object) null);
                a(CBError.Impression.ERROR_DISPLAYING_VIEW);
                return;
            }
            CBError.Impression impressionA = this.f15621b.a(viewGroup);
            if (impressionA != null) {
                za.b("displayOnHostView tryCreatingViewOnHostView error " + impressionA, (Throwable) null, 2, (Object) null);
                a(impressionA);
                return;
            }
            ij ijVarU = this.f15621b.u();
            if (ijVarU != null) {
                a(viewGroup, ijVarU);
            } else {
                new a();
            }
        } catch (Exception e2) {
            za.b("displayOnHostView e", e2);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    public boolean a() {
        return this.m;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(CBError.Impression error) {
        Intrinsics.f(error, "error");
        this.f15626l = true;
        this.d.a(this.f15620a, error);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(boolean z2) {
        this.j = z2;
    }
}
