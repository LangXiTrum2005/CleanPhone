package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0355ga extends WebView implements InterfaceC0569sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0551ra f28744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qc f28745b;

    public /* synthetic */ C0355ga(Context context, InterfaceC0551ra interfaceC0551ra, int i10, kotlin.jvm.internal.g gVar) {
        this(context, (i10 & 2) != 0 ? new InterfaceC0551ra.a(0, 1, null) : interfaceC0551ra);
    }

    @Override // com.ironsource.InterfaceC0569sa
    public void a(String script) {
        kotlin.jvm.internal.n.f(script, "script");
        InterfaceC0551ra interfaceC0551ra = this.f28744a;
        if (interfaceC0551ra == null) {
            kotlin.jvm.internal.n.l("javascriptEngine");
            throw null;
        }
        if (!interfaceC0551ra.a()) {
            InterfaceC0551ra interfaceC0551ra2 = this.f28744a;
            if (interfaceC0551ra2 == null) {
                kotlin.jvm.internal.n.l("javascriptEngine");
                throw null;
            }
            interfaceC0551ra2.a(this);
        }
        InterfaceC0551ra interfaceC0551ra3 = this.f28744a;
        if (interfaceC0551ra3 != null) {
            interfaceC0551ra3.a(script);
        } else {
            kotlin.jvm.internal.n.l("javascriptEngine");
            throw null;
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        Qc qc2;
        kotlin.jvm.internal.n.f(event, "event");
        if (i10 == 4 && (qc2 = this.f28745b) != null && qc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0355ga(Context context, InterfaceC0551ra javascriptEngine) {
        this(context);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(javascriptEngine, "javascriptEngine");
        this.f28744a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355ga(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
    }

    public final void a(Qc qc2) {
        this.f28745b = qc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355ga(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(attrs, "attrs");
    }

    public final void a() {
        this.f28745b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355ga(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(attrs, "attrs");
    }
}
