package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
class TwilightManager {
    public static TwilightManager d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f3369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwilightState f3370c = new TwilightState();

    public static class TwilightState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f3372b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.f3368a = context;
        this.f3369b = locationManager;
    }
}
