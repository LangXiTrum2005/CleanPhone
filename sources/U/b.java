package u;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f51610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f51611c;

    public /* synthetic */ b(f fVar, Bundle bundle, int i10) {
        this.f51609a = i10;
        this.f51611c = fVar;
        this.f51610b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51609a) {
            case 0:
                this.f51611c.f51629b.onUnminimized(this.f51610b);
                break;
            case 1:
                this.f51611c.f51629b.onMessageChannelReady(this.f51610b);
                break;
            case 2:
                this.f51611c.f51629b.onWarmupCompleted(this.f51610b);
                break;
            default:
                this.f51611c.f51629b.onMinimized(this.f51610b);
                break;
        }
    }
}
