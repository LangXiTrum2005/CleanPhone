package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.Mediation;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class bj extends h3 implements c1 {
    public static final b e0 = new b(null);
    public final a8 O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final dj f13535P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f13536Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Mediation f13537R;
    public final Function5 S;
    public final String T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final t9 f13538U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final qc f13539V;
    public final z6 W;
    public final Function1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f13540Y;
    public long Z;
    public long a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13541b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public pi f13542c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public b1 f13543d0;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13544b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i3 invoke(Context it) {
            Intrinsics.f(it, "it");
            return new i3(it);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(Context context, String location, kb mtype, String adUnitParameters, lh uiPoster, a8 fileCache, e3 templateProxy, dj videoRepository, String videoFilename, Mediation mediation, Function5 adsVideoPlayerFactory, z2 networkService, String templateHtml, hd openMeasurementImpressionCallback, n0 adUnitRendererImpressionCallback, t9 impressionInterface, dk webViewTimeoutInterface, qc nativeBridgeCommand, z6 eventTracker, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, networkService, templateProxy, mediation, templateHtml, openMeasurementImpressionCallback, adUnitRendererImpressionCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(location, "location");
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(adUnitParameters, "adUnitParameters");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(templateProxy, "templateProxy");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(videoFilename, "videoFilename");
        Intrinsics.f(adsVideoPlayerFactory, "adsVideoPlayerFactory");
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(templateHtml, "templateHtml");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        this.O = fileCache;
        this.f13535P = videoRepository;
        this.f13536Q = videoFilename;
        this.f13537R = mediation;
        this.S = adsVideoPlayerFactory;
        this.T = templateHtml;
        this.f13538U = impressionInterface;
        this.f13539V = nativeBridgeCommand;
        this.W = eventTracker;
        this.X = cbWebViewFactory;
    }

    public final void E() {
        F();
    }

    public final void F() {
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.stop();
        }
        pi piVar = this.f13542c0;
        if (piVar != null) {
            piVar.b();
        }
        this.f13543d0 = null;
        this.f13542c0 = null;
    }

    public final int G() {
        za.a("getAssetDownloadStateNow()", (Throwable) null, 2, (Object) null);
        oi oiVarB = this.f13535P.b(this.f13536Q);
        if (oiVarB != null) {
            return this.f13535P.a(oiVarB);
        }
        return 0;
    }

    public final i3 H() {
        pi piVar = this.f13542c0;
        if (piVar != null) {
            return piVar.getWebView();
        }
        return null;
    }

    public final void I() {
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.f();
        }
        n().a(0.0f);
    }

    public final void J() {
        e3 e3VarQ = q();
        if (e3VarQ != null) {
            e3VarQ.c(H(), l(), g());
        }
    }

    public final void K() {
        za.a(androidx.datastore.preferences.protobuf.a.i(this.f13540Y, "notifyTemplateVideoStarted() duration: "), (Throwable) null, 2, (Object) null);
        e3 e3VarQ = q();
        if (e3VarQ != null) {
            e3VarQ.b(H(), this.f13540Y / 1000.0f, l(), g());
        }
    }

    public final void L() {
        za.a("pauseVideo()", (Throwable) null, 2, (Object) null);
        n().a();
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.pause();
        }
    }

    public final void M() {
        za.a("playVideo()", (Throwable) null, 2, (Object) null);
        N();
        this.Z = gg.a();
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.play();
        }
    }

    public final void N() {
        n().a(PlayerState.FULLSCREEN);
        b1 b1Var = this.f13543d0;
        if (b1Var == null || b1Var.h()) {
            n().e();
            return;
        }
        hd hdVarN = n();
        float f = this.f13540Y / 1000.0f;
        b1 b1Var2 = this.f13543d0;
        hdVarN.a(f, b1Var2 != null ? b1Var2.g() : 1.0f);
    }

    public final void O() {
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.b();
        }
        n().a(1.0f);
    }

    @Override // com.chartboost.sdk.impl.c1
    public void a(String error) {
        Intrinsics.f(error, "error");
        za.a("onVideoDisplayError: ".concat(error), (Throwable) null, 2, (Object) null);
        a(false);
        e3 e3VarQ = q();
        if (e3VarQ != null) {
            e3VarQ.d(H(), l(), g());
        }
        F();
        c(error);
    }

    @Override // com.chartboost.sdk.impl.h3
    public ij b(Context context) {
        int i2;
        pi piVar;
        Unit unit;
        Intrinsics.f(context, "context");
        this.f13539V.a(this.f13538U);
        za.a("createViewObject()", (Throwable) null, 2, (Object) null);
        try {
            SurfaceView surfaceView = new SurfaceView(context);
            try {
                i2 = 2;
                try {
                    piVar = new pi(context, this.T, j(), this.f13538U, this.f13539V, h(), surfaceView, null, this.W, this.X, 128, null);
                } catch (Exception e2) {
                    e = e2;
                    c("Can't instantiate VideoBase: " + e);
                    piVar = null;
                }
            } catch (Exception e3) {
                e = e3;
                i2 = 2;
            }
            this.f13542c0 = piVar;
            int i3 = i2;
            b1 b1Var = (b1) this.S.invoke(context, surfaceView, this, r(), this.O);
            oi oiVarB = this.f13535P.b(this.f13536Q);
            if (oiVarB != null) {
                b1Var.a(oiVarB);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Video asset not found in the repository", (Throwable) null, i3, (Object) null);
            }
            this.f13543d0 = b1Var;
            return this.f13542c0;
        } catch (Exception e4) {
            c("Can't instantiate SurfaceView: " + e4);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.c1
    public void c() {
        n().a(true);
    }

    @Override // com.chartboost.sdk.impl.c1
    public void d() {
        n().a(false);
    }

    public final void e(String str) {
        long jA;
        long jA2;
        u6 u6Var = new u6(fh.j.FINISH_FAILURE, str, g(), l(), this.f13537R);
        if (this.a0 == 0) {
            jA = this.Z;
            jA2 = gg.a();
        } else {
            jA = gg.a();
            jA2 = this.a0;
        }
        u6Var.a(jA - jA2);
        u6Var.a(true);
        u6Var.b(false);
        track((ch) u6Var);
    }

    @Override // com.chartboost.sdk.impl.h3
    public void f() {
        za.a("destroyView()", (Throwable) null, 2, (Object) null);
        F();
        super.f();
    }

    @Override // com.chartboost.sdk.impl.h3
    public void w() {
        pi piVar = this.f13542c0;
        int width = piVar != null ? piVar.getWidth() : 0;
        pi piVar2 = this.f13542c0;
        int height = piVar2 != null ? piVar2.getHeight() : 0;
        b1 b1Var = this.f13543d0;
        if (b1Var == null) {
            b1Var = null;
        }
        if (b1Var != null) {
            b1Var.a(width, height);
        }
    }

    @Override // com.chartboost.sdk.impl.h3
    public void y() {
        za.c("onPause()", null, 2, null);
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            b1Var.pause();
        }
        super.y();
    }

    @Override // com.chartboost.sdk.impl.h3
    public void z() {
        za.c("onResume()", null, 2, null);
        this.f13535P.a(null, 1, false);
        b1 b1Var = this.f13543d0;
        if (b1Var != null) {
            y1 y1Var = b1Var instanceof y1 ? (y1) b1Var : null;
            if (y1Var != null) {
                y1Var.c();
            }
            b1Var.play();
        }
        super.z();
    }

    public final void f(String str) {
        da daVar = new da(fh.j.FINISH_SUCCESS, str, g(), l(), this.f13537R, null, 32, null);
        daVar.a(this.a0 - this.Z);
        daVar.a(true);
        daVar.b(false);
        track((ch) daVar);
    }

    @Override // com.chartboost.sdk.impl.c1
    public void a(long j) {
        float f = j / 1000.0f;
        float f2 = this.f13540Y / 1000.0f;
        if (nf.f14544a.d()) {
            za.c("onVideoDisplayProgress: " + f + "/" + f2, null, 2, null);
        }
        e3 e3VarQ = q();
        if (e3VarQ != null) {
            e3VarQ.a(H(), f, l(), g());
        }
        a(f2, f);
    }

    public /* synthetic */ bj(Context context, String str, kb kbVar, String str2, lh lhVar, a8 a8Var, e3 e3Var, dj djVar, String str3, Mediation mediation, Function5 function5, z2 z2Var, String str4, hd hdVar, n0 n0Var, t9 t9Var, dk dkVar, qc qcVar, z6 z6Var, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, kbVar, str2, lhVar, a8Var, e3Var, djVar, str3, mediation, function5, z2Var, str4, hdVar, n0Var, t9Var, dkVar, qcVar, z6Var, (i2 & 524288) != 0 ? a.f13544b : function1);
    }

    @Override // com.chartboost.sdk.impl.c1
    public void a() {
        za.a("onVideoDisplayStarted", (Throwable) null, 2, (Object) null);
        K();
        this.a0 = gg.a();
    }

    public final void a(boolean z2) {
        String strValueOf = String.valueOf(this.f13541b0);
        if (z2) {
            f(strValueOf);
        } else {
            e(strValueOf);
        }
    }

    @Override // com.chartboost.sdk.impl.c1
    public void b() {
        za.a("onVideoDisplayCompleted", (Throwable) null, 2, (Object) null);
        a(true);
        J();
        n().d();
    }

    @Override // com.chartboost.sdk.impl.c1
    public void b(long j) {
        za.a(androidx.datastore.preferences.protobuf.a.i(j, "onVideoDisplayPrepared ready to receive signal from template, duration: "), (Throwable) null, 2, (Object) null);
        this.f13541b0 = G();
        this.f13540Y = j;
        x();
    }
}
