package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lm extends u.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17055b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f17056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yh0 f17057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u.l f17058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u.j f17059f;

    @Override // u.k
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
        this.f17059f = (u.j) gVar;
        try {
            ((c.b) gVar.f51630a).x1();
        } catch (RemoteException unused) {
        }
        this.f17058e = gVar.c(new km(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17059f = null;
        this.f17058e = null;
    }
}
