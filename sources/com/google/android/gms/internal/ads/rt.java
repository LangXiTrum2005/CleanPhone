package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rt extends ph implements st {
    @Override // com.google.android.gms.internal.ads.st
    public final ut b(String str) {
        ut ttVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            ttVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ttVar = iInterfaceQueryLocalInterface instanceof ut ? (ut) iInterfaceQueryLocalInterface : new tt(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelR.recycle();
        return ttVar;
    }

    @Override // com.google.android.gms.internal.ads.st
    public final boolean f(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 4);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.st
    public final boolean zzc(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 2);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.st
    public final av zze(String str) {
        av zuVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 3);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i10 = ev.f14085f;
        if (strongBinder == null) {
            zuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            zuVar = iInterfaceQueryLocalInterface instanceof av ? (av) iInterfaceQueryLocalInterface : new zu(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelR.recycle();
        return zuVar;
    }
}
