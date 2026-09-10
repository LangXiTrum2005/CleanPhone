package com.chartboost.sdk.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Mediation;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 extends h3 {
    public final String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f14688P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ea f14689Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final t9 f14690R;
    public final List S;
    public final z6 T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final CoroutineDispatcher f14691U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Function1 f14692V;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14693b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m2 invoke(Context it) {
            Intrinsics.f(it, "it");
            return new m2(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, String location, kb mtype, String adUnitParameters, a8 fileCache, z2 z2Var, lh uiPoster, e3 e3Var, Mediation mediation, String baseUrl, String str, ea infoIcon, hd openMeasurementImpressionCallback, n0 adUnitRendererCallback, t9 impressionInterface, dk webViewTimeoutInterface, List scripts, z6 eventTracker, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, z2Var, e3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(location, "location");
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(adUnitParameters, "adUnitParameters");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(baseUrl, "baseUrl");
        Intrinsics.f(infoIcon, "infoIcon");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(scripts, "scripts");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(dispatcher, "dispatcher");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        this.O = baseUrl;
        this.f14688P = str;
        this.f14689Q = infoIcon;
        this.f14690R = impressionInterface;
        this.S = scripts;
        this.T = eventTracker;
        this.f14691U = dispatcher;
        this.f14692V = cbWebViewFactory;
    }

    @Override // com.chartboost.sdk.impl.h3
    public ij b(Context context) {
        ij ijVar;
        Unit unit;
        Intrinsics.f(context, "context");
        String str = this.f14688P;
        if (str == null || StringsKt.w(str)) {
            za.b("html must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            ijVar = null;
                                            try {
                                                m8 m8Var = new m8(context, this.O, this.f14688P, this.f14689Q, this.T, j(), this.f14690R, this.f14691U, this.f14692V, null, 512, null);
                                                RelativeLayout webViewContainer = m8Var.getWebViewContainer();
                                                if (webViewContainer != null) {
                                                    m8Var.a(webViewContainer);
                                                    unit = Unit.f43263a;
                                                } else {
                                                    unit = null;
                                                }
                                                if (unit == null) {
                                                    za.b("webViewContainer null when creating HtmlWebViewBase", (Throwable) null, 2, (Object) null);
                                                }
                                                return m8Var;
                                            } catch (Exception e2) {
                                                e = e2;
                                                c("Can't instantiate WebViewBase: " + e);
                                                return ijVar;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            ijVar = null;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        ijVar = null;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    ijVar = null;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                ijVar = null;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            ijVar = null;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        ijVar = null;
                    }
                } catch (Exception e9) {
                    e = e9;
                    ijVar = null;
                }
            } catch (Exception e10) {
                e = e10;
                ijVar = null;
            }
        } catch (Exception e11) {
            e = e11;
            ijVar = null;
        }
    }

    @Override // com.chartboost.sdk.impl.h3
    public void w() {
    }

    @Override // com.chartboost.sdk.impl.h3
    public void x() {
        i3 webView;
        super.x();
        this.f14690R.u();
        ij ijVarU = u();
        if (ijVarU == null || (webView = ijVarU.getWebView()) == null) {
            return;
        }
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            webView.evaluateJavascript((String) it.next(), null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o2(Context context, String str, kb kbVar, String str2, a8 a8Var, z2 z2Var, lh lhVar, e3 e3Var, Mediation mediation, String str3, String str4, ea eaVar, hd hdVar, n0 n0Var, t9 t9Var, dk dkVar, List list, z6 z6Var, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineDispatcher coroutineDispatcher2;
        if ((i2 & 262144) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher2 = MainDispatcherLoader.f45042a;
        } else {
            coroutineDispatcher2 = coroutineDispatcher;
        }
        this(context, str, kbVar, str2, a8Var, z2Var, lhVar, e3Var, mediation, str3, str4, eaVar, hdVar, n0Var, t9Var, dkVar, list, z6Var, coroutineDispatcher2, (i2 & 524288) != 0 ? a.f14693b : function1);
    }
}
