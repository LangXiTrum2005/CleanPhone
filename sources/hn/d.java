package hn;

import cn.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.k f42424a;

    public d(ak.k kVar) {
        this.f42424a = kVar;
    }

    @Override // cn.a0
    public final ak.k getCoroutineContext() {
        return this.f42424a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f42424a + ')';
    }
}
