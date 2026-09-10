package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends u.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f18020b;

    public nx1(nm nmVar) {
        this.f18020b = new WeakReference(nmVar);
    }

    @Override // u.k
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
        nm nmVar = (nm) this.f18020b.get();
        if (nmVar != null) {
            nmVar.f17862b = (u.j) gVar;
            try {
                ((c.b) gVar.f51630a).x1();
            } catch (RemoteException unused) {
            }
            mm mmVar = nmVar.f17864d;
            if (mmVar != null) {
                mmVar.zza();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        nm nmVar = (nm) this.f18020b.get();
        if (nmVar != null) {
            nmVar.f17862b = null;
            nmVar.f17861a = null;
        }
    }
}
