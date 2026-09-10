package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd1 extends uc1 {
    public static vd1 r(ListenableFuture listenableFuture) {
        return listenableFuture instanceof vd1 ? (vd1) listenableFuture : new wd1(listenableFuture);
    }
}
