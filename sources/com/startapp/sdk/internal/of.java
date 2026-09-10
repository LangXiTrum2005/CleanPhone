package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public final class of implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f41322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf f41323b;

    public of(sf sfVar, Activity activity) {
        this.f41323b = sfVar;
        this.f41322a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41323b.b(this.f41322a);
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
