package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Id extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.f(network, "network");
        ConcurrentHashMap concurrentHashMap = Jd.f22908a;
        super.onAvailable(network);
        Uc.f().b(new C2978d2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.f(network, "network");
        ConcurrentHashMap concurrentHashMap = Jd.f22908a;
        super.onLost(network);
        Uc.f().b(new C2978d2(10, 4, "lost"));
    }
}
