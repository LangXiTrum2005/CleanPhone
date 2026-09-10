package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z7 extends l6 implements e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb.b f24200a;

    public z7(rb.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f24200a = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.e7
    public final void E0(long j10, Bundle bundle, String str, String str2) {
        this.f24200a.a(j10, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f24200a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) m6.a(parcel, Bundle.CREATOR);
        long j10 = parcel.readLong();
        m6.d(parcel);
        E0(j10, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.e7
    public final int zzf() {
        return System.identityHashCode(this.f24200a);
    }
}
