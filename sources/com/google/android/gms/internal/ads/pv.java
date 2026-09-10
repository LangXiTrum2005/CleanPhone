package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pv implements NativeCustomFormatAd.DisplayOpenMeasurement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f18818a;

    public pv(ap apVar) {
        this.f18818a = apVar;
        try {
            apVar.zzr();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f18818a.a1(new s9.b(view));
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f18818a.zzp();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return false;
        }
    }
}
