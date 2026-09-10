package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class db extends k9.i {
    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof cb ? (cb) iInterfaceQueryLocalInterface : new cb(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 1);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // k9.f
    public final i9.c[] getApiFeatures() {
        return h.f23525d;
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 9410000;
    }
}
