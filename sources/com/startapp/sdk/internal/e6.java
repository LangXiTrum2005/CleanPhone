package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class e6 implements ConnectivityManager.OnNetworkActiveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f40927a;

    public e6(g6 g6Var) {
        this.f40927a = g6Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        g6 g6Var = this.f40927a;
        synchronized (g6Var.f40997c) {
            try {
                Iterator it = g6Var.f40997c.iterator();
                while (it.hasNext()) {
                    ((k7) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
