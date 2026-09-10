package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pz extends ph implements qz {
    @Override // com.google.android.gms.internal.ads.qz
    public final void b(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void s0(String str, Bundle bundle, String str2) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        rh.c(parcelQ, bundle);
        m0(parcelQ, 3);
    }
}
