package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends lf {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14476b = new a();

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
    public mc(Context context, String html, k5 callback, t9 impressionInterface, String str, qc nativeBridgeCommand, y6 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(html, "html");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public /* synthetic */ mc(Context context, String str, k5 k5Var, t9 t9Var, String str2, qc qcVar, y6 y6Var, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, k5Var, t9Var, str2, qcVar, y6Var, (i2 & 128) != 0 ? a.f14476b : function1);
    }
}
