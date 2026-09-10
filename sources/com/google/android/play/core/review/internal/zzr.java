package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
final class zzr implements ServiceConnection {
    public final /* synthetic */ zzt X;

    public /* synthetic */ zzr(zzt zztVar) {
        this.X = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzt zztVar = this.X;
        zztVar.f19659b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zztVar.a().post(new zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzt zztVar = this.X;
        zztVar.f19659b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zztVar.a().post(new zzq(this));
    }
}
