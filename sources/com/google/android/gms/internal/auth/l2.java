package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f22871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 4);
        this.f22871b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean m0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x9.a.a(parcel, Status.CREATOR);
        x9.a.b(parcel);
        b.d(status, null, this.f22871b);
        return true;
    }
}
