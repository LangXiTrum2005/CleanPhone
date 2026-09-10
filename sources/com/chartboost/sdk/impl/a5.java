package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5 f13402a = new a5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f13403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f13404c;

    public final void a(Context context) {
        if (context instanceof Application) {
            f13404c = (Application) context;
            return;
        }
        f13403b = new WeakReference(context);
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        f13404c = applicationContext instanceof Application ? (Application) applicationContext : null;
    }

    public final Context a() {
        Context context;
        WeakReference weakReference = f13403b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? f13404c : context;
    }
}
