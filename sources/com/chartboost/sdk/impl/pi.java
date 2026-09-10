package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class pi extends lf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f14862e;
    public FrameLayout f;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14863b = new a();

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(Context context, String html, k5 callback, t9 impressionInterface, qc nativeBridgeCommand, String str, SurfaceView surfaceView, FrameLayout videoBackground, y6 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(html, "html");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(videoBackground, "videoBackground");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        this.f14862e = surfaceView;
        this.f = videoBackground;
        if (surfaceView == null) {
            throw new IllegalStateException("SurfaceView is not ready. Cannot display video.");
        }
        videoBackground.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoBackground.setBackgroundColor(-16777216);
        addView(this.f);
        this.f.addView(this.f14862e);
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public final void b() {
        SurfaceView surfaceView = this.f14862e;
        if (surfaceView != null) {
            surfaceView.setVisibility(8);
            this.f.removeView(this.f14862e);
            removeView(this.f);
        }
    }

    public /* synthetic */ pi(Context context, String str, k5 k5Var, t9 t9Var, qc qcVar, String str2, SurfaceView surfaceView, FrameLayout frameLayout, y6 y6Var, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, k5Var, t9Var, qcVar, str2, surfaceView, (i2 & 128) != 0 ? new FrameLayout(context) : frameLayout, y6Var, (i2 & 512) != 0 ? a.f14863b : function1);
    }
}
