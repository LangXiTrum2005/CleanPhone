package com.p004ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0017\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ironsource/rk;", "Landroid/webkit/WebView;", "Lcom/ironsource/dl;", "", "script", "", "a", "Lcom/ironsource/up;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "javascriptEngine", "b", "Lcom/ironsource/up;", "changeListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/ironsource/cl;)V", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rk extends WebView implements dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private cl javascriptEngine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private up changeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    public final void a() {
        this.changeListener = null;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        up upVar;
        Intrinsics.f(event, "event");
        if (keyCode == 4 && (upVar = this.changeListener) != null && upVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.f(context, "context");
        Intrinsics.f(attrs, "attrs");
    }

    public final void a(up listener) {
        this.changeListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(Context context, AttributeSet attrs, int i2) {
        super(context, attrs, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(attrs, "attrs");
    }

    @Override // com.p004ironsource.dl
    public void a(String script) {
        Intrinsics.f(script, "script");
        cl clVar = this.javascriptEngine;
        if (clVar == null) {
            Intrinsics.m("javascriptEngine");
            throw null;
        }
        if (!clVar.a()) {
            cl clVar2 = this.javascriptEngine;
            if (clVar2 == null) {
                Intrinsics.m("javascriptEngine");
                throw null;
            }
            clVar2.a(this);
        }
        cl clVar3 = this.javascriptEngine;
        if (clVar3 != null) {
            clVar3.a(script);
        } else {
            Intrinsics.m("javascriptEngine");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rk(Context context, cl javascriptEngine) {
        this(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(javascriptEngine, "javascriptEngine");
        this.javascriptEngine = javascriptEngine;
    }

    public /* synthetic */ rk(Context context, cl clVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? new cl.a(0, 1, null) : clVar);
    }
}
