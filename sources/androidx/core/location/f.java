package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Executor executor, int i, int i2) {
        this.f28a = i2;
        this.d = obj;
        this.b = executor;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28a;
        int i2 = this.c;
        Executor executor = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) obj).lambda$onStatusChanged$1(executor, i2);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) obj).lambda$onGpsStatusChanged$2(executor, i2);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) obj).lambda$onFirstFix$2(executor, i2);
                break;
        }
    }
}
