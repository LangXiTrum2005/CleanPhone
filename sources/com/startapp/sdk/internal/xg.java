package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class xg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41679a;

    public xg(Context context) {
        this.f41679a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.adsbase.g.e(this.f41679a);
    }
}
