package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gd implements hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id f14014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd f14015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld f14016c;
    public vj d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14017a;

        static {
            int[] iArr = new int[me.values().length];
            try {
                iArr[me.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[me.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[me.THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14017a = iArr;
        }
    }

    public gd(id openMeasurementManager, kd openMeasurementSessionBuilder) {
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        Intrinsics.f(openMeasurementSessionBuilder, "openMeasurementSessionBuilder");
        this.f14014a = openMeasurementManager;
        this.f14015b = openMeasurementSessionBuilder;
    }

    public final void a(Context context, View trackedView, View rootView, vj.b visibilityTrackerListener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(trackedView, "trackedView");
        Intrinsics.f(rootView, "rootView");
        Intrinsics.f(visibilityTrackerListener, "visibilityTrackerListener");
        g();
        dd ddVarB = this.f14014a.b();
        vj vjVar = new vj(context, trackedView, rootView, ddVarB.a(), ddVarB.b(), ddVarB.f(), ddVarB.c(), false, 128, null);
        vjVar.a(visibilityTrackerListener);
        vjVar.i();
        this.d = vjVar;
    }

    public final void b(kb kbVar, i3 i3Var, Integer num, List list) {
        this.f14014a.e();
        j();
        kd.a aVarA = this.f14015b.a(i3Var, kbVar, this.f14014a.c(), this.f14014a.a(), list, this.f14014a.h(), this.f14014a.d());
        if (aVarA != null) {
            this.f14016c = new ld(aVarA, this.f14014a.g());
        }
        a(num);
    }

    @Override // com.chartboost.sdk.impl.hd
    public void c() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.i();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoSkipped missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void d() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.d();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoComplete missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void e() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.h();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoResumed missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void f() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.m();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionDestroyWebview missing om tracker", (Throwable) null, 2, (Object) null);
        }
        this.f14016c = null;
    }

    public final void g() {
        vj vjVar = this.d;
        if (vjVar != null) {
            vjVar.b();
        }
        this.d = null;
    }

    public final boolean h() {
        return this.f14014a.g();
    }

    public final void i() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.a();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("signalImpressionEvent missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    public final void j() {
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.m();
        }
        this.f14016c = null;
    }

    @Override // com.chartboost.sdk.impl.hd
    public void b() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.k();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyClick missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(View view) {
        Intrinsics.f(view, "view");
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.a(view);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(PlayerState state) {
        Unit unit;
        Intrinsics.f(state, "state");
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.a(state);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyStateChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(boolean z2) {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            if (z2) {
                ldVar.c();
            } else {
                ldVar.b();
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoBuffer missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a() {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.g();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoPaused missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(me quartile) {
        Unit unit;
        Intrinsics.f(quartile, "quartile");
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            int i2 = a.f14017a[quartile.ordinal()];
            if (i2 == 1) {
                ldVar.e();
            } else if (i2 == 2) {
                ldVar.f();
            } else if (i2 == 3) {
                ldVar.j();
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoProgress missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(float f, float f2) {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.a(f, f2);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVideoStarted missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(float f) {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.a(f);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("onImpressionNotifyVolumeChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.hd
    public void a(kb mtype, i3 webview, Integer num, List verificationScriptResourcesList) {
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(webview, "webview");
        Intrinsics.f(verificationScriptResourcesList, "verificationScriptResourcesList");
        try {
            b(mtype, webview, num, verificationScriptResourcesList);
        } catch (Exception e2) {
            za.a("OMSDK Session error", e2);
        }
    }

    public final void a(Integer num) {
        Unit unit;
        ld ldVar = this.f14016c;
        if (ldVar != null) {
            ldVar.l();
            ldVar.a(num);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("startAndLoadSession missing tracker", (Throwable) null, 2, (Object) null);
        }
    }
}
