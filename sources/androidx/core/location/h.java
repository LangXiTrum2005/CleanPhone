package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport b;
    public final /* synthetic */ String c;

    public /* synthetic */ h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.f30a = i;
        this.b = locationListenerTransport;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f30a;
        String str = this.c;
        LocationManagerCompat.LocationListenerTransport locationListenerTransport = this.b;
        switch (i) {
            case 0:
                locationListenerTransport.lambda$onProviderEnabled$4(str);
                break;
            default:
                locationListenerTransport.lambda$onProviderDisabled$5(str);
                break;
        }
    }
}
