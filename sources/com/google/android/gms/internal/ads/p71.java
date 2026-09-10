package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p71 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln0 f18552a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ln0 ln0Var = this.f18552a;
        ((tf1) ln0Var.f17073d).b("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        ln0Var.j(new gm0(19, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ln0 ln0Var = this.f18552a;
        ((tf1) ln0Var.f17073d).b("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        ln0Var.j(new ry0(this, 10));
    }
}
