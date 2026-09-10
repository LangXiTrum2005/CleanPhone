package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.uz;
import com.google.android.gms.internal.ads.vz;
import com.google.android.gms.internal.ads.wz;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzaf implements com.google.android.gms.ads.internal.util.client.zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzaf f10726a = new zzaf();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i10 = vz.f21323a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof wz ? (wz) iInterfaceQueryLocalInterface : new uz(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }
}
