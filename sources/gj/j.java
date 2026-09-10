package gj;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f41946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.messaging.a f41948c;

    public j(io.flutter.plugins.firebase.messaging.a aVar, Intent intent, int i10) {
        this.f41948c = aVar;
        this.f41946a = intent;
        this.f41947b = i10;
    }

    @Override // gj.k
    public final void a() {
        this.f41948c.stopSelf(this.f41947b);
    }

    @Override // gj.k
    public final Intent getIntent() {
        return this.f41946a;
    }
}
