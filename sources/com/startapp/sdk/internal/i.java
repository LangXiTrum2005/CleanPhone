package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends f6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41071c;

    public i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f41071c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.f6
    public final int a() {
        int iIntValue;
        synchronized (this.f41071c) {
            try {
                iIntValue = 0;
                for (Integer num : this.f41071c.values()) {
                    if (num != null) {
                        iIntValue |= num.intValue();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // com.startapp.sdk.internal.f6
    public final void b() {
        if (q0.a(this.f40956a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f40957b.registerDefaultNetworkCallback(new C3397h(this));
        }
    }
}
