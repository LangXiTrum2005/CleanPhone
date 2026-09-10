package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends k9.i {
    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof i2 ? (i2) iInterfaceQueryLocalInterface : new i2(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService", 0);
    }

    @Override // k9.f, j9.c
    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // k9.f
    public final boolean g() {
        return true;
    }

    @Override // k9.f
    public final i9.c[] getApiFeatures() {
        return new i9.c[]{d9.c.f38797c, d9.c.f38796b, d9.c.f38795a};
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // k9.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
