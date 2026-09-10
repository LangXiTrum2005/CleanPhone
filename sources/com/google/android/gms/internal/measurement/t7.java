package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t7 extends l6 implements c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta.i0 f23986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(p7 p7Var, ta.i0 i0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f23986a = i0Var;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.c7
    public final void zze() {
        this.f23986a.run();
    }
}
