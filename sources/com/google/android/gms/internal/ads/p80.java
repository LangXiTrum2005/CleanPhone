package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p80 implements co0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18560a;

    public p80(List list) {
        this.f18560a = list;
    }

    @Override // com.google.android.gms.internal.ads.co0
    public final void zzm() {
        for (ListenableFuture listenableFuture : this.f18560a) {
            listenableFuture.addListener(new zd1(0, listenableFuture, new jq(18)), td1.f20333a);
        }
    }

    public p80(m80 m80Var) {
        this.f18560a = Collections.singletonList(zw1.d(m80Var));
    }
}
