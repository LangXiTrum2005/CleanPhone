package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Executor executor, Object obj2, int i) {
        this.f27a = i;
        this.c = obj;
        this.b = executor;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f27a;
        Executor executor = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) obj2).lambda$onGnssMeasurementsReceived$0(executor, (GnssMeasurementsEvent) obj);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) obj2).lambda$onGpsStatusChanged$3(executor, (GnssStatusCompat) obj);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) obj2).lambda$onSatelliteStatusChanged$3(executor, (GnssStatus) obj);
                break;
        }
    }
}
