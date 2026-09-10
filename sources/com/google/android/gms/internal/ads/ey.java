package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ey extends ph implements fy {
    public ey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final String zze() {
        Parcel parcelR = r(q(), 1);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final int zzf() {
        Parcel parcelR = r(q(), 2);
        int i10 = parcelR.readInt();
        parcelR.recycle();
        return i10;
    }
}
