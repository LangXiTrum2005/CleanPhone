package zb;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f54701b;

    public k(l lVar, long j10) {
        this.f54701b = lVar;
        this.f54700a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f54700a);
        this.f54701b.f54714k.o(bundle);
        return null;
    }
}
