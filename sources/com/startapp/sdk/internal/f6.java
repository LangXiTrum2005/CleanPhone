package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f40957b;

    public f6(Context context, ConnectivityManager connectivityManager) {
        this.f40956a = context;
        this.f40957b = connectivityManager;
    }

    public abstract int a();

    public void b() {
    }
}
