package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.kw;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzab implements com.google.android.gms.ads.internal.util.client.zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzab f10720a = new zzab();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i10 = jw.f16201a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof kw ? (kw) iInterfaceQueryLocalInterface : new iw(iBinder);
    }
}
