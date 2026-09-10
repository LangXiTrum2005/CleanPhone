package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3476da extends WebView implements InterfaceC3691pa {
    private InterfaceC3673oa a;
    private Lc b;

    public /* synthetic */ C3476da(Context context, InterfaceC3673oa interfaceC3673oa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC3673oa.a(0, 1, null) : interfaceC3673oa);
    }

    @Override // com.ironsource.InterfaceC3691pa
    public void a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC3673oa interfaceC3673oa = this.a;
        InterfaceC3673oa interfaceC3673oa2 = null;
        if (interfaceC3673oa == null) {
            Intrinsics.preprohormone("javascriptEngine");
            interfaceC3673oa = null;
        }
        if (!interfaceC3673oa.a()) {
            InterfaceC3673oa interfaceC3673oa3 = this.a;
            if (interfaceC3673oa3 == null) {
                Intrinsics.preprohormone("javascriptEngine");
                interfaceC3673oa3 = null;
            }
            interfaceC3673oa3.a(this);
        }
        InterfaceC3673oa interfaceC3673oa4 = this.a;
        if (interfaceC3673oa4 == null) {
            Intrinsics.preprohormone("javascriptEngine");
        } else {
            interfaceC3673oa2 = interfaceC3673oa4;
        }
        interfaceC3673oa2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        Lc lc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (lc = this.b) != null && lc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3476da(Context context, InterfaceC3673oa javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.a = javascriptEngine;
    }

    public final void a(Lc lc) {
        this.b = lc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3476da(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3476da(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3476da(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
