package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yi extends qh implements zi {
    public yi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        wi viVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                viVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                viVar = iInterfaceQueryLocalInterface instanceof wi ? (wi) iInterfaceQueryLocalInterface : new vi(strongBinder);
            }
            rh.f(parcel);
            r0(viVar);
        } else if (i10 == 2) {
            int i11 = parcel.readInt();
            rh.f(parcel);
            zzc(i11);
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
