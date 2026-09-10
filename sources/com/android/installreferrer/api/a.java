package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import c9.c;
import com.android.installreferrer.commons.InstallReferrerCommons;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f7297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f7298b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f7298b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f7297a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i10 = c9.b.f5961a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c9.a(iBinder);
        }
        b bVar = this.f7298b;
        bVar.f7301c = aVar;
        bVar.f7299a = 2;
        this.f7297a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f7298b;
        bVar.f7301c = null;
        bVar.f7299a = 0;
        this.f7297a.onInstallReferrerServiceDisconnected();
    }
}
