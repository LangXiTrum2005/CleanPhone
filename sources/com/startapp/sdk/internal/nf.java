package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public final class nf extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f41275a;

    public nf(sf sfVar) {
        this.f41275a = sfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f41275a.a(activity);
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
