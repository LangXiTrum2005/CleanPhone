package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fo extends ph implements ho {
    public fo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final String zzb() {
        Parcel parcelR = r(q(), 2);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final ArrayList zzc() {
        Parcel parcelR = r(q(), 3);
        ArrayList arrayList = parcelR.readArrayList(rh.f19590a);
        parcelR.recycle();
        return arrayList;
    }
}
