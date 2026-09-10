package oi;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f47462a = Handler.createAsync(Looper.getMainLooper());

    @Override // oi.d
    public final void a(b bVar) {
        this.f47462a.post(bVar);
    }
}
