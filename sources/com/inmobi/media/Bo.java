package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Bo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ ViewTreeObserver.OnWindowFocusChangeListener c;

    public Bo(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener) {
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = onWindowFocusChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.removeOnAttachStateChangeListener(this);
        this.b.getViewTreeObserver().removeOnWindowFocusChangeListener(this.c);
    }
}
