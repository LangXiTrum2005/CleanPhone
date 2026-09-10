package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X1 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f23336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.f23336a = LazyKt.b(new W1(this));
    }

    public abstract M6 f();

    public final M6 getLandingPageHandler() {
        return (M6) this.f23336a.getX();
    }
}
