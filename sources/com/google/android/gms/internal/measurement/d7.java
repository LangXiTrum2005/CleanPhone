package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 extends com.google.android.gms.internal.auth.a implements e7 {
    public d7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 1);
    }

    @Override // com.google.android.gms.internal.measurement.e7
    public final void E0(long j10, Bundle bundle, String str, String str2) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.b(parcelU1, bundle);
        parcelU1.writeLong(j10);
        w1(parcelU1, 1);
    }

    @Override // com.google.android.gms.internal.measurement.e7
    public final int zzf() {
        Parcel parcelM0 = m0(u1(), 2);
        int i10 = parcelM0.readInt();
        parcelM0.recycle();
        return i10;
    }
}
