package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pa implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so0 f18577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qa f18578b;

    public /* synthetic */ pa(qa qaVar, so0 so0Var) {
        Objects.requireNonNull(qaVar);
        this.f18578b = qaVar;
        this.f18577a = so0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        uh shVar;
        v71.k("Install Referrer service connected.");
        int i10 = th.f20382a;
        if (iBinder == null) {
            shVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            shVar = iInterfaceQueryLocalInterface instanceof uh ? (uh) iInterfaceQueryLocalInterface : new sh(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }
        qa qaVar = this.f18578b;
        qaVar.f19010t = shVar;
        qaVar.f19007q = 2;
        this.f18577a.c(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v71.q("Install Referrer service disconnected.");
        qa qaVar = this.f18578b;
        qaVar.f19010t = null;
        qaVar.f19007q = 0;
    }
}
