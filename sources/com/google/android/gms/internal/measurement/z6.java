package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z6 extends com.google.android.gms.internal.auth.a implements a7 {
    public z6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 1);
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void e1(Bundle bundle) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, bundle);
        w1(parcelU1, 1);
    }
}
