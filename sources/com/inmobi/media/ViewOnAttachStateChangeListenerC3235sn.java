package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC3235sn implements View.OnAttachStateChangeListener {
    public final /* synthetic */ kowloon a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;

    public ViewOnAttachStateChangeListenerC3235sn(kowloon kowloonVar, View view, ViewGroup viewGroup) {
        this.a = kowloonVar;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.triweekly(Boolean.valueOf(AbstractC3310vn.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.triweekly(Boolean.FALSE);
    }
}
