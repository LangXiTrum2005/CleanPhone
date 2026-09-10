package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzp extends zzj {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ IBinder f19655Y;
    public final /* synthetic */ zzr Z;

    public zzp(zzr zzrVar, IBinder iBinder) {
        this.f19655Y = iBinder;
        this.Z = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void b() {
        zzf zzdVar;
        int i2 = zze.X;
        IBinder iBinder = this.f19655Y;
        if (iBinder == null) {
            zzdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            zzdVar = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinder);
        }
        zzt zztVar = this.Z.X;
        zztVar.m = zzdVar;
        zzi zziVar = zztVar.f19659b;
        zziVar.a("linkToDeath", new Object[0]);
        try {
            zztVar.m.asBinder().linkToDeath(zztVar.j, 0);
        } catch (RemoteException e2) {
            Object[] objArr = new Object[0];
            zziVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", zzi.c(zziVar.f19651a, "linkToDeath failed", objArr), e2);
            }
        }
        zztVar.g = false;
        Iterator it = zztVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zztVar.d.clear();
    }
}
