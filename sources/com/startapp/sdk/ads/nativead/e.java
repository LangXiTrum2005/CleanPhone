package com.startapp.sdk.ads.nativead;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f40509a;

    public e(NativeAdDetails nativeAdDetails) {
        this.f40509a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f40509a.handleClickOnView(view);
    }
}
