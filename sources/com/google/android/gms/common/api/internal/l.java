package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends BasePendingResult {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(j9.l lVar, int i10) {
        super(lVar);
        this.f11726o = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final j9.o G(Status status) {
        switch (this.f11726o) {
            case 0:
                return status;
            default:
                throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }
}
