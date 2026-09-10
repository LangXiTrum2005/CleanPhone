package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f4346Y;
    public final /* synthetic */ Executor Z;

    public /* synthetic */ b(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
        this.X = 0;
        this.f4346Y = preRGnssStatusTransport;
        this.Z = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = this.f4346Y;
                if (preRGnssStatusTransport.f4341b == this.Z) {
                    preRGnssStatusTransport.f4340a.getClass();
                    break;
                }
                break;
            case 1:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport2 = this.f4346Y;
                if (preRGnssStatusTransport2.f4341b == this.Z) {
                    preRGnssStatusTransport2.f4340a.getClass();
                    break;
                }
                break;
            default:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport3 = this.f4346Y;
                if (preRGnssStatusTransport3.f4341b == this.Z) {
                    preRGnssStatusTransport3.f4340a.getClass();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2, byte b2) {
        this.X = i2;
        this.f4346Y = preRGnssStatusTransport;
        this.Z = executor;
    }
}
