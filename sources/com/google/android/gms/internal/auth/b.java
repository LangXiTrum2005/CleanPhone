package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j9.i {
    public static final eb.d0 l = new eb.d0("GoogleAuthService.API", new j2(0), new j9.d());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b2.p f22794m = new b2.p("Auth", new String[]{"GoogleAuthServiceClient"});

    public static void d(Status status, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        if (status.b() ? taskCompletionSource.trySetResult(bundle) : taskCompletionSource.trySetException(k9.c0.m(status))) {
            return;
        }
        f22794m.p("The task is already complete.", new Object[0]);
    }
}
