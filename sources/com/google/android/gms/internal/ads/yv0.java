package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final be1 f22377d = be1.f12743b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe1 f22378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f22379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv0 f22380c;

    public yv0(fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, xv0 xv0Var) {
        this.f22378a = fe1Var;
        this.f22379b = scheduledExecutorService;
        this.f22380c = xv0Var;
    }

    public final v90 a(ListenableFuture listenableFuture, Object obj) {
        return new v90(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }
}
