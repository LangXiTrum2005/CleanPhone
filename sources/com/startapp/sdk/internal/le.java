package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public final class le implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f41216b;

    public le(String str, CountDownLatch countDownLatch) {
        this.f41215a = str;
        this.f41216b = countDownLatch;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface x8Var;
        try {
            int i2 = y8.f41704a;
            if (iBinder == null) {
                x8Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                x8Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z8)) ? new x8(iBinder) : (z8) iInterfaceQueryLocalInterface;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f41215a);
            me.f41253a = new te(((x8) x8Var).a(bundle));
        } catch (Throwable unused) {
        }
        this.f41216b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f41216b.countDown();
    }
}
