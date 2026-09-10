package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends ph implements ip {
    @Override // com.google.android.gms.internal.ads.ip
    public final void K0(ap apVar, String str) {
        Parcel parcelQ = q();
        rh.e(parcelQ, apVar);
        parcelQ.writeString(str);
        m0(parcelQ, 1);
    }
}
