package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Calendar;

/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes.dex */
public class adultoid {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static adultoid f4744wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f4745attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f4746dern = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LocationManager f4747saneness;

    /* JADX INFO: compiled from: TwilightManager.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f4748attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f4749saneness;
    }

    public adultoid(Context context, LocationManager locationManager) {
        this.f4745attabal = context;
        this.f4747saneness = locationManager;
    }

    public static adultoid attabal(Context context) {
        if (f4744wireman == null) {
            Context applicationContext = context.getApplicationContext();
            f4744wireman = new adultoid(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f4744wireman;
    }

    public final void beachfront(Location location) {
        long j;
        attabal attabalVar = this.f4746dern;
        long jCurrentTimeMillis = System.currentTimeMillis();
        graveside gravesideVarSaneness = graveside.saneness();
        gravesideVarSaneness.attabal(jCurrentTimeMillis - SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        gravesideVarSaneness.attabal(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = gravesideVarSaneness.f4808dern == 1;
        long j2 = gravesideVarSaneness.f4809saneness;
        long j3 = gravesideVarSaneness.f4807attabal;
        gravesideVarSaneness.attabal(jCurrentTimeMillis + SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        long j4 = gravesideVarSaneness.f4809saneness;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        attabalVar.f4748attabal = z;
        attabalVar.f4749saneness = j;
    }

    public final Location dern(String str) {
        try {
            if (this.f4747saneness.isProviderEnabled(str)) {
                return this.f4747saneness.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean marial() {
        return this.f4746dern.f4749saneness > System.currentTimeMillis();
    }

    public final Location saneness() {
        Location locationDern = picketboat.competently.saneness(this.f4745attabal, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? dern("network") : null;
        Location locationDern2 = picketboat.competently.saneness(this.f4745attabal, "android.permission.ACCESS_FINE_LOCATION") == 0 ? dern("gps") : null;
        if (locationDern2 == null || locationDern == null) {
            return locationDern2 != null ? locationDern2 : locationDern;
        }
        return locationDern2.getTime() > locationDern.getTime() ? locationDern2 : locationDern;
    }

    public boolean wireman() {
        attabal attabalVar = this.f4746dern;
        if (marial()) {
            return attabalVar.f4748attabal;
        }
        Location locationSaneness = saneness();
        if (locationSaneness != null) {
            beachfront(locationSaneness);
            return attabalVar.f4748attabal;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
