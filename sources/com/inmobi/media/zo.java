package com.inmobi.media;

import android.view.View;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ kowloon a;

    public zo(kowloon kowloonVar) {
        this.a = kowloonVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.triweekly(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.triweekly(Boolean.FALSE);
    }
}
