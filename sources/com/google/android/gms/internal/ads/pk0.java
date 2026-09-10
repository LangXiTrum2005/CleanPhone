package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends sk0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f18699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VersionInfoParcel f18700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x11 f18701i;

    public pk0(Context context, VersionInfoParcel versionInfoParcel, x11 x11Var) {
        this.f18699g = context;
        this.f18700h = versionInfoParcel;
        this.f18701i = x11Var;
    }

    @Override // k9.b
    public final void d(Bundle bundle) {
        synchronized (this.f19987b) {
            if (!this.f19989d) {
                this.f19989d = true;
                try {
                    ((gx) this.f19991f.getService()).zzi(this.f18700h.afmaVersion);
                    this.f18701i.mo168zza();
                } catch (RemoteException e10) {
                    this.f18701i.J(e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sk0, k9.b
    public final void q(int i10) {
        int i11 = zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.f18701i.J(new RemoteException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 33), "Connection suspended with cause: ", i10)));
    }

    @Override // com.google.android.gms.internal.ads.sk0, k9.c
    public final void r(ConnectionResult connectionResult) {
        super.r(connectionResult);
        this.f18701i.J(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.f11643d))));
    }
}
