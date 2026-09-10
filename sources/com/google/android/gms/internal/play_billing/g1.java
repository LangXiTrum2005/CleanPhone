package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f24270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f24271c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f24272a;

    static {
        if (i4.f24290d) {
            f24271c = null;
            f24270b = null;
        } else {
            f24271c = new g1(null);
            f24270b = new g1(null);
        }
    }

    public g1(CancellationException cancellationException) {
        this.f24272a = cancellationException;
    }
}
