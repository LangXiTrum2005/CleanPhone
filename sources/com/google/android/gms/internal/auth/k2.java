package com.google.android.gms.internal.auth;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f22860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f22860b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }
}
