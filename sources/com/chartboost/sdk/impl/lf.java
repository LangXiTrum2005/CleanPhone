package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lf extends l4 {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14426b = new a();

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

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qc f14427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yj f14428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qc qcVar, yj yjVar) {
            super(1);
            this.f14427b = qcVar;
            this.f14428c = yjVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View container) {
            Intrinsics.f(container, "container");
            return new c3(container, this.f14427b, this.f14428c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(Context context, String html, k5 callback, t9 impressionInterface, String str, qc nativeBridgeCommand, yj webViewCorsErrorHandler, y6 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, eventTracker, cbWebViewFactory, new b(nativeBridgeCommand, webViewCorsErrorHandler), null, 256, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(html, "html");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(webViewCorsErrorHandler, "webViewCorsErrorHandler");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
    }

    public /* synthetic */ lf(Context context, String str, k5 k5Var, t9 t9Var, String str2, qc qcVar, yj yjVar, y6 y6Var, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, k5Var, t9Var, str2, qcVar, (i2 & 64) != 0 ? new yj() : yjVar, y6Var, (i2 & 256) != 0 ? a.f14426b : function1);
    }
}
