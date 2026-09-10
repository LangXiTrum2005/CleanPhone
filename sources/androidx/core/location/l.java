package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34a;
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ l(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f34a = i;
        this.b = preRGnssStatusTransport;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34a;
        Executor executor = this.c;
        LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = this.b;
        switch (i) {
            case 0:
                preRGnssStatusTransport.lambda$onStopped$1(executor);
                break;
            default:
                preRGnssStatusTransport.lambda$onStarted$0(executor);
                break;
        }
    }
}
