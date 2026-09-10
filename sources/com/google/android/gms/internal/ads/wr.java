package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wr extends ph implements yr {
    @Override // com.google.android.gms.internal.ads.yr
    public final void zzb(List list) {
        Parcel parcelQ = q();
        parcelQ.writeTypedList(list);
        m0(parcelQ, 1);
    }
}
