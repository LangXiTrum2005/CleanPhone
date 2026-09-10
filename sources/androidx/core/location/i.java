package androidx.core.location;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31a;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i) {
        this.f31a = i;
        this.b = locationListenerTransport;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31a;
        LocationManagerCompat.LocationListenerTransport locationListenerTransport = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                locationListenerTransport.lambda$onLocationChanged$1((List) obj);
                break;
            default:
                locationListenerTransport.lambda$onLocationChanged$0((Location) obj);
                break;
        }
    }
}
