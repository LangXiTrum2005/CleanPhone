package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.kr;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzaj implements com.google.android.gms.ads.internal.util.client.zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzaj f10732a = new zzaj();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i10 = jr.f16156a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterfaceQueryLocalInterface instanceof kr ? (kr) iInterfaceQueryLocalInterface : new ir(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }
}
