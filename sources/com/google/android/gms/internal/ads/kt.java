package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws f16520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListenableFuture f16521b;

    public kt(ws wsVar) {
        this.f16520a = wsVar;
    }

    public final void a() {
        if (this.f16521b == null) {
            m00 m00Var = new m00();
            this.f16521b = m00Var;
            this.f16520a.e().q(new so0(m00Var, 12), new gt(m00Var));
        }
    }
}
